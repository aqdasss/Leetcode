public class EvenDigit {

    public static void main(String[] args) {
        int[] num = {21,3,4,5,65};
        int ans = findEven(num);
        System.out.println(ans); 
        
    }

    static int findEven(int[] num){
        int even = 0;
        for (int i = 0; i < num.length; i++) {
            int count =0;
            while (num[i]>count) {
                num[i] /= 10;
                count++;
            }
                if (count%2==0) {
                    even++;
                }
            }

            return even;
        }
    }
