public class TaskOne {

    public static void main(String[] args) {
        System.out.println("the max value of a factorial integer is " + findMaxIntFactorialValue());
    }

    public static int findMaxIntFactorialValue() {
        int result = 2;
        int nextNum = 2;
        int prevResult = 2;
        while (true) {
            nextNum++;
            //Method 1:
            //the method multiply exact throws an ArithmeticException if the multiplication creates an overflow.
//            try{
//                result = Math.multiplyExact(nextNum,result);
//            }catch (ArithmeticException e){
//                break;
//            }

            //Method 2:
            //after we multiply the numbers, we divide the result with the last factorial, if the result is not our multiplication number then it
            //means it has overflew and we exit the loop.

            result=result * nextNum;
            if(result/prevResult != nextNum){
                break;
            }

            prevResult = result;
            System.out.println(result);
        }
        return nextNum - 1;
    }
}


