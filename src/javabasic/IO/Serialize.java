package javabasic.IO;

import java.io.*;

/**
 * @ClassName Serialize
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/1/16 &12:19
 * @Version 1.0
 **/
public class Serialize implements Serializable {
    private String name;
    private int age;
    private String gender;
    private String mobile;

    public Serialize(String name, int age, String gender, String mobile) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialize student = new Serialize("Jack",12,"男","188518888888");
        String path ="D:/dat";
        //序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(student);
        out.close();
        //反序列
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
        Serialize people = (Serialize) in.readObject();
        in.close();
        System.out.println("student"+student);
        System.out.println("people"+people);
    }
}
