public class Main {
    public static void main(String[] args) {
        Vacation vacation = new Vacation(21, "Dubai");
        Teacher teacher = new Teacher(30000, PlaceOfWork.HOME, "English", vacation);
        System.out.println(teacher.getInfo());
        teacher.makeWork("Проверяет домашку");

        Vacation vacation1 = new Vacation(14, "Paris");
        Programmer programmer = new Programmer(150000, PlaceOfWork.HOME, "Android developer",
                vacation1, "Lenovo", "Java");
        System.out.println(programmer.getInfo());
        programmer.makeWork("Пишет программы");

        Vacation vacation2 = new Vacation(30, "America");
        Programmer programmer1 = new Programmer(60000, PlaceOfWork.OFFICE, "Frontend developer",
                vacation2, "Acer", "JavaScript");
        System.out.println(programmer1.getInfo());
        programmer1.makeWork("Отдыхает");
    }
}