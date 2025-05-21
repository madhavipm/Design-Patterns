package Builder;

public class Client {
    public static void main(String[] args) {
        /* bcz builder is like a attribute of student
        can we access attributes without creating obj of student ?No
        that is the reason behind the errors in below code
        builder.setName("Sai");

        builder.setAge(20);
        builder.setBatch("Acadjan24");
        builder.setPsp(96);
        builder.setGradYear(2023);
        builder.setUniversity("VITB");*/

        Student student = Student.getBuilder().
                setName("Sai").setAge(22).
                setBatch("Acadjan24").setPsp(96).
                setGradYear(2023).setUniversity("VitB").build();
        System.out.printf("Debug");
    }
}
