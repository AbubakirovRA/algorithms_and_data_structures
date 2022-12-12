import java.sql.Date;

public class test {
    public static void main(String[] args) {
        
          
    }

    public static void test() {
        for (int i = 10; i <= 50; i = i + 10) {
            Date startDate = new Date();
            fbLine(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();
            startDate = new Date();
            fbRecursive(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);
        }
    }

    public static int fb(int num) {
        if (num <= 2) {
        return 1;
        } else {
        final int[] numbers = new int[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
        numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[num - 1];
        }
       }

       public static int fb(int num) {
        if (num <= 2) {
        return 1;
        } else {
        return fb(num-1) + fb(num-2);
        }

        public static int combinationCount(int count, int faces) {
            if (count > 0) {
            return recursiveCounter(1, count, faces);
            } else {
            return 0;
            }
           }
           
           
           private static int recursiveCounter(int depth, int maxDepth, int faces) {
            int count = 0;
            for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
            count++;
            } else {
            count += recursiveCounter(depth + 1, maxDepth, faces);
            }
            }
            return count;
           }

           public static int combinationCount(int faces) {
            int count = 0;
            for (int i = 1; i <= faces; i++) {
            for (int j = 1; j <= faces; j++) {
            for (int k = 1; k <= faces; k++) {
            for (int l = 1; l <= faces; l++) {
            count++;
            }
            }
            }
            }
            return count;
           }


           public static List<Integer> findSimpleNumbers(int lastNumber) {
            List<Integer> result = new ArrayList<>();
            boolean simple = true;
            for (int i = 1; i <= lastNumber; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
            if (i % j == 0) {
            simple = false;
            break;
            }
            }
            if (simple) {
            result.add(i);
            }
            }
            return result;
           }


           public static int sum(int lastNumber) {
            int sum = 0;
            for (int i = 1; i <=lastNumber; i++){
            sum+=i;
            }
            return sum;
           }

           
           
           
           
    }    
       
}
