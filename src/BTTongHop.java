import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

/**cho sẵn 3 danh danh sách số nguyên;
 hiển thị 1 menu với các lựa chọn sau:
 1 hiển thị 3 mảng số nguyên
 2.hiển thị mảng đc gộp từ 2 mảng số nguyên, lựa chọn được mảng để gộp
 3. hiển thị mảng được gộp 3 mảng số ngyên
 4. chọn 1 mảng số nguyên để in ra
 4.1 thêm 1 phần tử vào cuối
 4.2 thêm 1 phần tử vào đầu
 4.3 xóa 1 phần tử ở vị trí đc chọn
 5. dừng chương trình

 chương trình được lặp lại cho đến khi chọn 5.
*/
 public class BTTongHop {

     static Scanner scanner = new Scanner(System.in);
     static int[] arr1= {1,2,3,4,5,6};
    static int[] arr2= {3,35,2,3,53};
    static int[] arr3= {2,34,21,46,2};
    public static void main(String[] args) {

     int choice = 0;
     while (choice != 5) {
         System.out.println("1. hiển thị các mảng số nguyên");
         System.out.println("2. gộp 2 mảng số nguyên");
         System.out.println("3. gộp 3 mảng số nguyên");
         System.out.println("4. hiển 1 mảng");
         System.out.println("5. dừng chương trình");
         System.out.println("nhập lựa chọn của bạn: ");
         choice = scanner.nextInt();
         switch (choice){
             case 1:
                 showArr(arr1, "mảng 1:");
                 showArr(arr2, "mảng 2: ");
                 showArr(arr3, "mảng 3: ");
                 break;
             case 2:
                 int[] arr = gopMang();
                 System.out.println("mảng sau khi gộp là: " + Arrays.toString(arr));
                 break;
             case 3:
                 System.out.println(Arrays.toString(gop3Mang()));
                 break;
             case 4: arrayHandle();
                 break;
             case 5: System.exit(0);
         }
     }
    }

    private static void arrayHandle(){
        System.out.println("nhập mảng bạn muốn in: ");
        int choice = scanner.nextInt();
        int[] arr = laymang(choice);
        System.out.println("mảng " + choice + " là: " + Arrays.toString(arr));

        System.out.println("1. thêm 1 phần tử vào cuối");
        // TODO: 08/06/2023 bài tập về nhà cho moọi người: làm nốt 2 tính năng dưới đây
        System.out.println("2. thêm 1 phẩn tử vào đầu");
        System.out.println("3. xóa 1 phần tử được chọn");
        int choice1 = scanner.nextInt();
        switch (choice1){
            case 1: ganMang(choice, addLast(arr));;
        }

    }
    private static int[] addLast(int[] arr){
        System.out.println("nhập phần số muốn thêm");
        int num = scanner.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = num;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    private static int[] gop3Mang(){
        int[] gop3Mang = new int[arr1.length+arr2.length+arr3.length];
        for (int i = 0; i< gop3Mang.length; i++){
            if(i < arr1.length){
                gop3Mang[i] = arr1[i];
            } else if (i < (arr1.length +arr2.length)) {
                gop3Mang[i] = arr2[i - arr1.length];
            } else if ( i < (arr1.length + arr2.length + arr3.length)) {
                gop3Mang[i] = arr3[i - arr2.length - arr1.length] ;
            }
        }

        return gop3Mang;
    }

    private static int[] gopMang(){
        System.out.println("nhập 2 mảng bạn muốn gộp: ");
        int choice = scanner.nextInt();
        int[] mang1 = laymang(choice);
        System.out.println("mảng 2: ");
        choice = scanner.nextInt();
        int[] mang2 = laymang(choice);
        int[] newArr = new int[mang1.length + mang2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < mang1.length){
                newArr[i] = mang1[i];
            } else {
                newArr[i]= mang2[i - mang1.length];
            }
        }
        return newArr;
    }

    private static void showArr(int[] arr, String tenmang) {
        System.out.println(tenmang + Arrays.toString(arr));
    }

    private static void ganMang(int soMangr, int[] arr){
        switch (soMangr){
            case 1: arr1 = arr;
            break;
            case 2: arr2 = arr;
            break;
            case 3: arr3 = arr;
            break;
        }
    }

    private static int[] laymang(int somang){
        switch (somang){
            case 1: return arr1;
            case 2: return arr2;
            case 3: return arr3;
        }
        return null;
    }
}
