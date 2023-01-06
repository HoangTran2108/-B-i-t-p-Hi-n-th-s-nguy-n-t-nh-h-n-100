public class Main {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100");
        int count = 0;
        int countSNT = 0;
        for (int i=2; i<100; i++) {
            if (countSNT <100) {
                for (int j=1; j<=i; j++) {
                    if (i%j == 0) {
                        count++;
                    }
                }
                if (count==2) {
                    System.out.println(i);
                    countSNT++;
                }
                count = 0;
            }
            else {
                break;
            }
        }
    }
}