/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author aytaj.veyisli
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //       User2 u2 = new User2();
 //       Test t = new Test();
 //       test(u2); //bu isleyecek amma metod yalnizca user1e aid olanlari gorecek metoda u2 gonderende user2ye cast olacaq ve user2nin icindekileri de gorecek
 //       test(t);//bu xeta verecek cunki test classi user2 classina cast ola bilmez bunu fix elemek ucun if sertine bax metodun icinde
        
  //      System.out.println(u2 instanceof User1);//true
  //      System.out.println(u2 instanceof User3);//true user1 user3den extends alib deye avtomatik olaraq user3un de instancesidi
  //      System.out.println(u2 instanceof User2);//true
  //      System.out.println(u2 instanceof Object);//true
        
        
        User2 use2 = new User2();//User2, User1, User3, Object 43-cu setirden baslayan metodlar ucun yaratmisam
        method(use2);//userrr2 print olunacaq
    }
    public static void test(User1 a){
           // User2 user2 = (User2) a;
            if (a instanceof User2) { //yoxlayir eger u2ni gondermisemse a-nin yerine, yeni ki a u2-dirse (user2nin instancesi (u2 ele user2den yaranib deye hem de instancesi sayilir)) user2-ye cast ele 
                User2 user2 = (User2) a;  
                
            }
            else if (a instanceof Test) { // eger a t-dirse test-e cast ele
                Test test = (Test) a;
             }
    }
    
    public static void method(User1 u1){
        System.out.println("userrr1");
    }
    public static void method(User2 u2){
        System.out.println("userrr2");
    }
    public static void method(User3 u3){
        System.out.println("user3");
    }
    public static void method(Object o){
        System.out.println("object");
    }
    
    
    
}
