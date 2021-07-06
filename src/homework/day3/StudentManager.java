package homework.day3;

public class StudentManager extends UserManager {

    public void add(Student student){
        System.out.println(student.getFirstName() +" "+ student.getLastName()+ "isimli kullanıcı eklendi");
    }

    public void delete(Student student){
        System.out.println(student.getFirstName() +" "+ student.getLastName()+ "isimli kullanıcı silindi");
    }

    public void update(Student student){
        System.out.println(student.getFirstName() +" "+ student.getLastName() +"isimli kullanıcı güncellendi");
    }

}
