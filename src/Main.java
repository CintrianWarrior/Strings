public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String secondName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = secondName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задание 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
    }
}