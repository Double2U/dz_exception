package dz_seminar_3.repository;


public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String birthDay;
    private String numberPhone;
    private String gender;

    public Person(String surname, String name, String middleName, String birthday, String numberPhone, String gender){
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDay = birthday;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("<%s>,<%s>,<%s>,<%s>,<%s>,<%s>%n", surname, name, middleName, birthDay, numberPhone, gender);
    }

}
