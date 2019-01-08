/**
 *
 * @author AliGalipSekeroglu
 */
public class ObjectOrientedTest {
    public static void main(String[] args){
        System.out.println("Hi,Human!");
        human Ali = new human();
        Ali.weight =80;
        Ali.age=24;
        Ali.height=180;
        System.out.println("Ali's age : "+ Ali.age + " Ali's weight : " + Ali.weight + " Ali's height : "+ Ali.height);
        human John = new human();
        John.age =35;
        John.height=190;
        John.weight=100;
        System.out.println("John's age : "+ John.age + " John's weight : " + John.weight + " John's height : "+ John.height);
        Ali.eating();
        John.eating();
        System.out.println("John's age : "+ John.age + " John's weight : " + John.weight + " John's height : "+ John.height);
        System.out.println("Ali's age : "+ Ali.age + " Ali's weight : " + Ali.weight + " Ali's height : "+ Ali.height);
        Ali.salary = 100;
        Ali.extra_money(50);
        System.out.println("Ali's salary : " + Ali.salary);
        Ali.extra_money(20);
        System.out.println("Ali's salary : " + Ali.salary);
        
    }
}
