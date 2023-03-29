public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // начальный счёт, рублей
        int addend = 1100; // сумма пополнения
        int bonus = addend > 1000 ? addend / 100 : 0; // расчёт бонуса, если пополнение > 1000
        int finalBalance = initialBalance + addend + bonus;

        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Количество бонусов: " + bonus);

    }
}

// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.
