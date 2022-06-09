public class Family {

    public static void main(String[] args) {
        
        Person medha = new Person("Medhu Hegde-1", 10);

        Person arya = new Person("Aru Hegde-1", 4);

        System.out.println(medha.getAge());
        
        System.out.println(arya.getAge());

        arya.celebrateBirthday();

        System.out.println(arya.getAge());

        medha.celebrateBirthday();

        System.out.println(medha.getAge());


    }
    
}
