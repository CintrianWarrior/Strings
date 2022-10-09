public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Семён";
        String secondName = "Иванов";
        String lastName = "Семёнович";
        firstName = firstName.replace("ё", "е");
        secondName = secondName.replace("ё", "е");
        lastName = lastName.replace("ё", "е");
        String fullName = secondName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задание 2");
//        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println("Задание 3");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}