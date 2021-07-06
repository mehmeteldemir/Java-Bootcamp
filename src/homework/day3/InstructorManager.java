package homework.day3;

public class InstructorManager extends UserManager{

    public void add(Instructor instructor){
        System.out.println(instructor.getFirstName() +" "+ instructor.getLastName()+ "isimli kullanıcı eklendi");
    }

    public void delete(Instructor instructor){
        System.out.println(instructor.getFirstName() +" "+ instructor.getLastName()+ "isimli kullanıcı silindi");
    }

    public void update(Instructor instructor){
        System.out.println(instructor.getFirstName() +" "+ instructor.getLastName() +"isimli kullanıcı güncellendi");
    }


}
