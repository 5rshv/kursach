

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

public static double srSum(){
        return sum()/ employee.length;
}
    public static void printSotr() {
        System.out.println("сотрудники: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFio());
        }
    }
}