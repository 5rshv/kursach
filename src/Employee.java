public class Employee {
    private String fio;
    private int otdel;
    private double zarplata;
    private static int idGen = 1;
    private int id;

    //гетеры
    public String getFio() {
        return fio;
    }

    public int getOtdel() {
        return otdel;
    }

    public int getId() {
        return id;
    }

    public double getZarplata() {
        return zarplata;
    }

    //сетеры
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setZarplata(double zarplata) {
        this.zarplata = zarplata;
    }

    //конструктор
    public Employee(String fio, int otdel, double zarplata) {
        this.fio = fio;
        this.otdel = otdel;
        this.zarplata = zarplata;
        id = idGen++;
    }

    @Override
    public String toString() {
        return "fio='" + fio + '\'' +
                ", otdel=" + otdel +
                ", zarplata=" + zarplata +
                ", id=" + id;
    }
}