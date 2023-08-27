public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] ints = generateRandomArray();
        int sum = 0;
        for (int salary : ints) {
            sum += salary;
        }
        System.out.println("Cумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2 () {
        int[] ints = generateRandomArray();
        int max = ints[0];
        for (int salary : ints) {
            if (salary > max) {
                max = salary;
            }
        }
        int min = ints[0];
        for (int salary : ints) {
            if (salary < min) {
                min = salary;
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " Максиальная сумма трат за день составила " + max + " рублей ");
        }
    }public static void task3 () {
        int[] ints = generateRandomArray();
        int result = 0;
        for (int m : ints) {
            result += m;
        }
        System.out.println("Cредняя сумма трат за месяц составила " + result / ints.length + " рублей ");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            if (i == reverseFullName.length - 1) {
                System.out.print(reverseFullName[i] + "");
            } else {
                System.out.print(reverseFullName[i] + "");

            }
        }
    }
}

