public class Main {
    public static void main(String[] args) {

      //  Задание 1
        System.out.println(" Задание 1 ");

       int clientOS = 1;
       if (clientOS == 0 ) {
           System.out.println("Установите версию приложения для iOS по ссылке");
       }else if ( clientOS == 1) {
               System.out.println( " Установите версию приложения для Android по ссылке ");
           }


        //  Задание 2
        System.out.println(" Задание 2 ");
        int clientDeviceYear = 2009;
        if ( clientOS == 0 && clientDeviceYear >= 2015 ){
            System.out.println( " Установите обычную версию приложения для iOS по ссылке");
        } else if ( clientOS == 0 && clientDeviceYear < 2015 ){
            System.out.println( " Установите облегченную версию приложения для iOS по ссылке");
        }
        if ( clientOS == 1 && clientDeviceYear >= 2015 ){
            System.out.println( " Установите обычную версию приложения для Android по ссылке");
        } else if ( clientOS == 1 && clientDeviceYear < 2015 ){
            System.out.println( " Установите облегченную версию приложения для Android по ссылке");
        }

        //  Задание 3
        System.out.println(" Задание 3 ");
        int year = 2018;

        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0  ) {
            System.out.println( year +  " является високосным");
        } else {
            System.out.println( year +  " не является високосным");
        }

       //  Задание 4
        System.out.println(" Задание 4 ");


         int deliveryDistance = 95;
         int deliveryDays = 1;

         if ( deliveryDistance > 20) {
             deliveryDays++;
         }
         if ( deliveryDistance > 60) {
           deliveryDays++;
       }
        System.out.println( " Потребуется " + deliveryDays + " дней" );








    }
}