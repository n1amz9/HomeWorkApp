public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(SumCheck(10, 5));
        System.out.println(numberCheck(0));
        System.out.println(isPositive(5));
        stringMultiplier("Hello, World!", 5);
        System.out.println(isLeap(2400));

    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
    // лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean SumCheck(int a, int b) {
        boolean isTrue = false;
        if (a + b <= 20 && a + b >= 10) {
            isTrue = true;
        }
        return isTrue;
    }

    //    2. Написать метод, которому в качестве параметра передается целое число,
    //    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //    Замечание: ноль считаем положительным числом.
    public static String numberCheck(int a) {
        String answer = "This number isn't positive";
        if (a >= 0) {
            answer = "This number is positive";
        }
        return answer;
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isPositive(int a) {
        boolean isPositive = false;
        if (a >= 0) {
            isPositive = true;
        }
        return isPositive;
    }

    //    4. Написать метод, которому в качестве аргументов передается строка и число,
    //    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void stringMultiplier(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    //  5. * Написать метод, который определяет, является ли год високосным,
    //    и возвращает boolean(високосный - true, не високосный - false).
    //    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeap(int year) {
        boolean returnValue = false;
        if (year % 4 == 0 || year % 400 == 0) {
            returnValue = true;
        }
        return returnValue;
    }

}



