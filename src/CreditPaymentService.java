public class CreditPaymentService {
    public double calculate (double a, double c, double b) {
        double i = (c / 12) / 100; // кредитная ставка в месяц
        double koef = (i * (Math.pow(1 + i, b * 12))) / (Math.pow(1 + i, b * 12) - 1); // коэффициент аннуитета
        double result = a * koef; // итог
        int pay = (int)result;
        return pay;
    }
}
//a сумма кредите
//c процентная ставка
//b срок кредита
//i ставка в месяц