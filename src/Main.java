public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000,9.99,1));
        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000,9.99,2));
        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000,9.99,3));
    }
}

//a сумма кредите
//c процентная ставка
//b срок кредита