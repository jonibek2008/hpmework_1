public final class Programmer extends Teacher {
    private String typeOfComputer;
    private String programmingLanguage;

    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Programmer(int salary, PlaceOfWork placeOfWork, String direction, Vacation vacation, String typeOfComputer, String programmingLanguage) {
        super(salary, placeOfWork, direction, vacation);
        this.typeOfComputer = typeOfComputer;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Programming language: " + getProgrammingLanguage() +
                "\nType of Computer: " + getTypeOfComputer();
    }
}

