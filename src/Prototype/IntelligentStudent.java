package Prototype;

public class IntelligentStudent extends Student {
    private int iq;
    IntelligentStudent() {

    }
    IntelligentStudent(String name, int age, String batch, double psp, double avgpsp, int iq) {
        super(name,age,batch,psp,avgpsp);
        this.iq = iq;

    }
   public IntelligentStudent(IntelligentStudent s) {
        super(s);
        s.iq = this.iq;

   }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
