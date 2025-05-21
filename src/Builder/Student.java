package Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String university;
    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.university = builder.getUniversity();

    }
    public static Builder getBuilder() {
        return new Builder();
    }
    //Inner class
    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private int gradYear;
        private String university;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }
        /*if we call builder constructor
        1st obj gets created then will go validation check(if fails not assig values
        if not fails values will be assigned) but in
        builder pattern we only want to create obj if all validations are passed
        hence we are using static build method from client to check validations
        if all validations were passes then we can happily call the constructor of
        builder to create the object.
         */

        public Student build() {
            if(this.gradYear >= 2025){
                throw new RuntimeException("Grad year should be less than 2025");
            }
            return new Student(this);
        }
    }

}
