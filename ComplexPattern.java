
public class ComplexPattern {
    public static void main(String[] args) {
        // CODE FOR PATTERN "D"
        // int n=5;
        // for (int i=0; i<n; i++){
        // for(int j=0; j<n; j++){
        // if(i==0 && j<n-1 || j==0 || i==n-1 && j<n-1 || j==n-1 && i>0 &&i<n-1){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }

        // System.out.println();
        // }

        // CODE FOR PATTERN X

        // int n = 11;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j || i+j==n-1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }

        // }
        // System.out.println();
        // }

        // CODE FOR X INSIDE A RECTANGLE
        // int n = 11;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j || i+j==n-1 || i==0 ||j==0 || i==n-1 || j==n-1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }

        // }
        // System.out.println();
        // }

        // CODE FOR BARFI SHAPE

        // int n = 11;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
        // || i + j == (n - 1) + (n - 1) / 2) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }

        // }
        // System.out.print(" ");
        // for (int j = 0; j < n; j++) {
        // if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
        // || i + j == (n - 1) + (n - 1) / 2) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }

        // }
        // System.out.println();

        // }

        // CODE FOR TRIANGLE

        int n = 13;
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        if (i+j==(n-1)/2 || j-i==(n-1)/2  || i==(n-1)/2) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }

        System.out.println();
        }

        // CODE FOR ROMBUS

        // int n = 11;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == 0 && j <= (n - 1) / 2 ||
        //                 j == 0 && i <= (n - 1) / 2 ||
        //                 i + j <= (n - 1) / 2 ||
        //                 i == 0 && j == (n - 1) / 2 ||
        //                 j == n - 1 && i <= (n - 1) / 2 ||
        //                 i == 0 && j >= (n - 1) / 2 ||
        //                 j - i >= (n - 1) / 2 || j == 0 && i >= (n - 1) / 2 || i == (n - 1) && j <= (n - 1) / 2
        //                 || i - j >= (n - 1) / 2 || j == n - 1 && i >= (n - 1) / 2 || i == n - 1 && j >= (n - 1) / 2
        //                 || i + j >= (n - 1) + (n - 1) / 2) {
        //             System.out.print("*");

        //         } else {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }

    }
}