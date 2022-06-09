public class Family {

    public static void main(String[] args) {
        
        Person medha = new Person("Medhaa Hegde", 10);

        Person arya = new Person("Aryaa Hegde", 4);

        System.out.println(medha.getAge());
        
        System.out.println(arya.getAge());

        arya.celebrateBirthday();

        System.out.println(arya.getAge());

        medha.celebrateBirthday();

        System.out.println(medha.getAge());


    }
    
}
