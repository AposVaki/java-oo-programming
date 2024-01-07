package gr.aueb.cf.ch14.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("gr.aueb.cf.ch14.reflection.Student");
            Constructor<?> defaultConst = studentClass.getConstructor();

            defaultConst.setAccessible(true);
            Student student = (Student) defaultConst.newInstance();
            System.out.println(student);

        } catch (Throwable e) {
            e.printStackTrace();
        }


    }
}
