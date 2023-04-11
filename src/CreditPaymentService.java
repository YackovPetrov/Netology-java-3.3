public class CreditPaymentService {
    public double calculate(double sum, double percent, double creditTerm) {
        double interestPerMonth = (percent / 12) / 100; // кредитная ставка в месяц
        double koef = (interestPerMonth * (Math.pow(1 + interestPerMonth, creditTerm * 12))) / (Math.pow(1 + interestPerMonth, creditTerm * 12) - 1); // коэффициент аннуитета
        double result = sum * koef; // итог
        int pay = (int) result;
        return pay;
    }
}
//a сумма кредите - Sum
//c процентная ставка - Percent
//b срок кредита - CreditTerm
//i ставка в месяц - InterestPerMonth