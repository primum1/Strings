public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка Строки");
        task1();
        task2();
        task3();

    }
    public static void task1() {
        String firstName =  "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
    public static void task2() {
        String firstName =  "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        String upfullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upfullName);

    }
    public static void task3() {
        String  fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}