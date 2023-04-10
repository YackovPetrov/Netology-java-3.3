public class CreditPaymentService {
    public double calculate(double sum, double percent, double creditterm) {
        double interestpermonth = (percent / 12) / 100; // кредитная ставка в месяц
        double koef = (interestpermonth * (Math.pow(1 + interestpermonth, creditterm * 12))) / (Math.pow(1 + interestpermonth, creditterm * 12) - 1); // коэффициент аннуитета
        double result = sum * koef; // итог
        int pay = (int) result;
        return pay;
    }
}
//a сумма кредите - Sum
//c процентная ставка - Percent
//b срок кредита - CreditTerm
//i ставка в месяц - InterestPerMonth