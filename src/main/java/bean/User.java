package bean;

/**
 * 用户信息
 */
public class User {
    private String name;
    private String number;

    public Department getCollege() {
        return college;
    }

    public void setCollege(Department college) {
        this.college = college;
    }

    private Department college;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
