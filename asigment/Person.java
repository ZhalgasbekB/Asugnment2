package Asugnment2.asigment;

public abstract class Person implements Payable, Comparable<Person> {
    private int id ;
    private static   int id_gen = 1 ;

    private  String   name;
    private   String   surname;
    public  Person  (){
        id  =  id_gen++;
     }
    public   Person  (String  name  , String surname){
        this();
        setName(name);
        setSurname(surname);
     }

    public int getId() {
        return id;
    }

    public   void setName  (String name  ) {
        this.name  = name;
    }
    public  String  getName (){
        return   name ;
    }
    public   void   setSurname  (String  surname  ){
       this.surname =  surname ;
    }

    public  String  getPosition (){
        Empolyer empolyer  =  new Empolyer();
        String position = empolyer.getPosition();
        return   position == ""  ? position  : "Student";
    }

    @Override
    public String toString() {
             return  '['+ getPosition()+ "]: "  + id +  " " + name + "  " + surname + " salary is : ";
     }

    @Override
    public int compareTo(Person person) {
        return Double.compare(getPaymentAmount(), person.getPaymentAmount());
    }
}
