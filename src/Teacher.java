public class Teacher extends Employee {
    private String direction;
    private Vacation vacation;

    public Teacher(int salary, PlaceOfWork placeOfWork, String direction, Vacation vacation) {
        super(salary, placeOfWork);
        this.direction = direction;
        this.vacation = vacation;
    }

    public String getDirection() {
        return direction;
    }

    public Vacation getVacation() {
        return vacation;
    }

    final public void makeWork(String work){
        System.out.println(work);
    }

    public String getInfo() {
        return "Salary: " + getSalary() +
                "\nDirection: " + getDirection() +
                "\nPlace of work: " + getPlaceOfWork() +
                "\nVacation place: " + vacation.getRestingPlace() +
                "\nNumber of vacation days: " + vacation.getNumberOfVacationDays();
    }
}
