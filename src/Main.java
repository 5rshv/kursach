

public class Main {

    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Иванова Светлана Ивановна", 1, 45000);
        employee[1] = new Employee("Суханов Григорий Сергеевич", 1, 56780);
        employee[2] = new Employee("Зинченко Виктория Руслановна", 2, 36426);
        employee[3] = new Employee("Попов Роман Александрович", 2, 72456.23);
        employee[4] = new Employee("Старовойтова Мария Андреевна", 2, 25774);
        employee[5] = new Employee("Кузьмина Светлана владимировна", 3, 10484.76);
        employee[6] = new Employee("Пурик Сергей Иванович", 4, 85765);
        employee[7] = new Employee("Постоенко Ольга Викторовна", 5, 38444);
        employee[8] = new Employee("Макаров Илья Петрович", 5, 38434);
        employee[9] = new Employee("Лазарева Марина Андреевна", 5, 93733.32);

        print();
        maxZp();
        minZp();
        System.out.println(sum());
        System.out.println(srSum());
        printSotr();
        indexZp(2);
        infoOtdel(5);
        sotrOtdelSum(2);
        sotrOtdelSrZnachSum(2);
        sotrOtdeIndexZp(2, 5);
        sotrOtde(2);
        sotrMinZp(16000);
        sotrMaxZp(38434);
    }

    public static void print() {
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void maxZp() {
        System.out.print("Максимальная ЗП: ");
        double maxZp = employee[0].getZarplata();
        for (int i = 0; i < employee.length; i++) {
            if (maxZp < employee[i].getZarplata()) {
                maxZp = employee[i].getZarplata();
            }
        }
        System.out.println(maxZp);
    }

    public static void minZp() {
        System.out.print("Минимальная ЗП: ");
        double minZp = employee[0].getZarplata();
        for (int i = 0; i < employee.length; i++) {
            if (minZp > employee[i].getZarplata()) {
                minZp = employee[i].getZarplata();
            }
        }
        System.out.println(minZp);
    }

    public static double sum() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getZarplata();
        }
        return sum;
    }

    public static double srSum() {
        return sum() / employee.length;
    }

    public static void printSotr() {
        System.out.println("сотрудники: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFio());
        }
    }

    public static void indexZp(int percent) {
        System.out.println("Индексация зарплаты у сотрудников на 5%: ");
        for (int i = 0; i < employee.length; i++) {
            double indexZp = employee[i].getZarplata();
            indexZp = (indexZp * (percent / 100)) + indexZp;
            System.out.println(Math.round(indexZp));
        }
    }

    public static void infoOtdel(int otdel) {
        sotrOtdelMinZp(otdel);
        sotrOtdelMaxZp(otdel);
    }


    public static void sotrOtdelMinZp(int otdel) {
        System.out.println("Человек с минимальной ЗП в отделе: ");
        double minZp = Integer.MAX_VALUE;
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            if (minZp > employee[i].getZarplata()) {
                minZp = employee[i].getZarplata();
            }
        }
        System.out.println(minZp);
    }


    public static void sotrOtdelMaxZp(int otdel) {
        System.out.println("Человек с максимальной ЗП в отделе: ");
        double maxZp = -1;
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            if (maxZp < employee[i].getZarplata()) {
                maxZp = employee[i].getZarplata();
            }
        }
        System.out.println(maxZp);
    }

    public static void sotrOtdelSum(int otdel) {
        System.out.println("Сумму затрат на зп по отделу: ");
        double sum = 0;
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            sum = sum + employee[i].getZarplata();
        }
        System.out.println(Math.round(sum));
    }

    public static void sotrOtdelSrZnachSum(int otdel) {
        System.out.println("Средняя зп по отделу: ");
        double srSum = 0;
        int a = 0;
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            a++;
            srSum = srSum + employee[i].getZarplata();
        }
        System.out.println(Math.round(srSum / a));
    }


    public static void sotrOtdeIndexZp(int otdel, double percent) {
        System.out.println("Индексация зп по отделу: ");
        double indexZp;
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            indexZp = employee[i].getZarplata();
            indexZp = (indexZp * (percent / 100)) + indexZp;
            System.out.println(Math.round(indexZp));
        }
    }

    public static void sotrOtde(int otdel) {
        System.out.println("Сотрудники отдела: ");
        for (int i = 0; employee.length > i; i++) {
            if (employee[i].getOtdel() != otdel || employee[i] == null) {
                continue;
            }
            System.out.print(employee[i].getFio() + " " + employee[i].getZarplata() + " " + employee[i].getId());
            System.out.println();
        }
    }

    public static void sotrMinZp(double number) {
        System.out.println("ЗП меньше числа: ");
        for (int i = 0; employee.length > i; i++) {
            if (number > employee[i].getZarplata()) {
                System.out.print(employee[i].getId() + " " + employee[i].getFio() + " " + employee[i].getZarplata());
                System.out.println();
            }

        }
    }

    public static void sotrMaxZp(double number) {
        System.out.println("ЗП больше или равно числа: ");
        for (int i = 0; employee.length > i; i++) {
            if (number <= employee[i].getZarplata()) {
                System.out.print(employee[i].getId() + " " + employee[i].getFio() + " " + employee[i].getZarplata());
                System.out.println();
            }
        }
    }
}