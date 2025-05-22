package Prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students = new HashMap<String, Student>();
    public void  register(String key, Student student) {
        students.put(key, student);
    }
    public Student get(String key) {
        return students.get(key);
    }

}
