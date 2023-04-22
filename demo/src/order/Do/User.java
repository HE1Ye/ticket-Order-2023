package order.Do;

public class User {
    private String name;
    private String sfz;
    private String phone;
    private String possword;
    private String sex;

    public User(int id) {
        this.id = id;
    }

    public User(String name, String sfz, String phone, String possword, String sex, int id, int age) {
        this.name = name;
        this.sfz = sfz;
        this.phone = phone;
        this.possword = possword;
        this.sex = sex;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sfz='" + sfz + '\'' +
                ", phone='" + phone + '\'' +
                ", possword='" + possword + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPossword() {
        return possword;
    }

    public void setPossword(String possword) {
        this.possword = possword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int id;
    private int age;

}
