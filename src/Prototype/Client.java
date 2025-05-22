package Prototype;

public class Client {
    public static void main(String[] args) {
        //create a prototype of Acadjan24 batch
        StudentRegistry registry = new StudentRegistry();
        callRegistry(registry);
        Student st1 = registry.get("Acadjan24").clone();
        System.out.println("Debug");
        st1.setName("sai");
        st1.setAge(20);

        Student st2 = registry.get("Acadjan24").clone();
        st2.setName("Madhavi");
        st2.setAge(22);
        System.out.println("Debug");


        Student st3 = registry.get("Acadjan24Intelligent_Students").clone();
        System.out.println("Debug");



    }
    private static void callRegistry(StudentRegistry registry) {
            Student acadJan24Morning = new Student();
            acadJan24Morning.setBatch("Acad Jan24");
            acadJan24Morning.setPsp(90);
            acadJan24Morning.setAvgpsp(80);
            registry.register("Acadjan24", acadJan24Morning);
            System.out.println(registry.get("Acad Jan24"));

            IntelligentStudent is1 = new IntelligentStudent();
            is1.setBatch("Acad Jan24");
            is1.setPsp(95);
            is1.setAvgpsp(92);
            registry.register("Acadjan24Intelligent_Students", is1);

    }
}
