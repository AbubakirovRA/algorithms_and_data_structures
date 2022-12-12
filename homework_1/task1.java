// /**
//  * task1
//  */
// public class task1 {

//     public static void main(String[] args) {
//         int x = 10;
//         System.out.println(rec(x));
//     }

//     public static int rec(int x){
//         if (x == 1){
//             return 1;// если на вход поступит единица, то возвращаем единицу
//         }
//         else{
//             return x + rec(x-1);
//         }
//         // return (x == 1) ? x : (x + rec(x-1));// то же самое, но с помощью тернарных операторов
// }