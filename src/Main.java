public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Сумма кредита: 1000000 Р. Процентная ставка: 9.99 %. Срок: 1 год.");
        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000, 9.99, 1) + " Р");
        System.out.println();
        System.out.println("Сумма кредита: 1000000 р. Процентная ставка: 9.99 %. Срок: 2 года.");
        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000, 9.99, 2) + " Р");
        System.out.println();
        System.out.println("Сумма кредита: 1000000 р. Процентная ставка: 9.99 %. Срок: 3 года.");
        System.out.println("Ваш платеж в месяц составит: " + service.calculate(1000000, 9.99, 3) + " Р");
    }
}

//a сумма кредите
//c процентная ставка
//b срок кредита