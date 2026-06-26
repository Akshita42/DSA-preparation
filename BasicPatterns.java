public class BasicPatterns{
    // Stars pattern(right- angled triangle)
    // public static void main(String args[]){
    //     for ( int line =1 ; line<=4; line++){
    //         for (int star=1; star<=line;star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Inverted star pattern(right- angled triangle)
    // public static void main(String args[]){
    //     for (int line=1;line<=4;line++){
    //         for (int star=1;star<=4-line+1;star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Half pyramid pattern

    // public static void main(String args[]){
    //     for (int line =1 ;line<=4;line++){
    //         for (int number=1;number<=line;number++){
    //             System.out.print(number);
    //         }
    //         System.out.println();
    //     }
    // }

    // Characters Pattern
    public static void main(String args[]){
        char ch='A';
        for( int line=1;line<=4;line++){
            for (int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
