public class CreditPaymentService {
    public double calculate(double Sum, double Percent, double CreditTerm) {
        double InterestPerMonth = (Percent / 12) / 100; // кредитная ставка в месяц
        double koef = (InterestPerMonth * (Math.pow(1 + InterestPerMonth, CreditTerm * 12))) / (Math.pow(1 + InterestPerMonth, CreditTerm * 12) - 1); // коэффициент аннуитета
        double result = Sum * koef; // итог
        int pay = (int) result;
        return pay;
    }
}
//a сумма кредите - Sum
//c процентная ставка - Percent
//b срок кредита - CreditTerm
//i ставка в месяц - InterestPerMonth