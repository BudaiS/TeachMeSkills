package lesson2;
///Задача: Сделать цикл (for) от 1го до 10ти, каждая итерация которого будет выведена словами на экран. Например:
///        “один”
///        “два”
///        …
///        “десять”
public class task1 {
   public static void main(String[] args) {
      for(int i = 1; i < 11; i++){
         switch(i){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
               System.out.println("three");
               break;
            case 4:
               System.out.println("four");
               break;
            case 5:
               System.out.println("five");
               break;
            case 6:
               System.out.println("six");
               break;
            case 7:
               System.out.println("seven");
               break;
            case 8:
               System.out.println("eight");
               break;
            case 9:
               System.out.println("nine");
               break;
            case 10:
               System.out.println("ten");
               break;
         }
      }
   }
}



