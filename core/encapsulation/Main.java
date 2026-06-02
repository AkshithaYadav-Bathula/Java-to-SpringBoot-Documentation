
// Encapsulation: 
class Bank{
    private double balance;
    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited " + amount);
    }
    public void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
        }
        System.out.println("Amount withdrawn "+"Remaining Balance: " + balance);
    }
    public double getBalance(){
        return balance;
    }
}
class Student{
    private int age;
    public void setAge(int a){
          System.out.println("Age before " + age);
           System.out.println("param " + a);
        age = a;
         System.out.println("Age after " + age);
    }
    public int getAge(){
        return age;
    }
}
class MedicalStore {
    private String medicine="paracetmol";
    public void giveMedicine(String prescription){
        if(prescription.equals("Fever")){
            System.out.println("Give Medicine " + medicine);
        }else{
            System.out.println("Not allowed");
        }
    }
}
class Test{
    int x;
    void show(){
        System.out.println(x);
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.deposit(1000);
        b1.withdraw(500);
        System.out.println(b1.getBalance());
        Student s1 =new Student();
        s1.setAge(18);
        System.out.println(s1.getAge());
        MedicalStore m = new MedicalStore();
        m.giveMedicine("Fever");
        Test t = new Test();
        t.x=34;
        t.show();
    }
}