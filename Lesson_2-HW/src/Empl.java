/**
 * Created by Abilis on 14.02.2016.
 */
public class Empl {

    private String firstName;
    private String lastName;
    private String middleName;

    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;

    public Empl (String _firstName, String _lastName, String _middleName, String _position,
                 String _email, String _phoneNumber, String _salary, int _age) {

        firstName = _firstName;
        lastName = _lastName;
        middleName = _middleName;
        position = _position;
        email = _email;
        phoneNumber = _phoneNumber;
        salary = _salary;
        age = _age;
    }

    //сеттеры
    public void setFirstName(String _firstName) {
        firstName = _firstName;
    }

    public void setLastName(String _lastName) {
        lastName = _lastName;
    }

    public void setMiddleName(String _middleName) {
        middleName = _middleName;
    }

    public void setPosition(String _position) {
        position = _position;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public void setPhoneNumber(String _phoneNumber) {
        phoneNumber = _phoneNumber;
    }

    public void setAge(int _age) {
        if ((_age <= 70 && _age >= 18)) {
            age = _age;
        }
        else {
            System.out.println("Нельзя изменить возраст на " + _age + "! Можно менять только на 18 - 70");
        }
    }

//геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    //метод, показывающий всю информацию об объекте
    public void getInfoOfEmpl() {
        System.out.println("Фамилия: " + lastName + ", имя: " + firstName + ", отчество: " + middleName +
        ". Должность: " + position + ",");
        System.out.println("электронная почта: " + email + ", телефон: " + phoneNumber +
                ", зарплата: " + salary + " рублей, возраст: " + age);
        System.out.println();
    }


}
