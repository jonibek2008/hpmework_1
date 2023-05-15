public class Employee {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public PlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }

    public Employee(int salary, PlaceOfWork placeOfWork) {
        this.salary = salary;
        this.placeOfWork = placeOfWork;
    }

    private PlaceOfWork placeOfWork;
}

