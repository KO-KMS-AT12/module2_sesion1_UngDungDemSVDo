import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So sinh vien thi do la: " + nhapSV(nhapSizeMang(scanner), scanner));
    }

    static int nhapSizeMang(Scanner scanner) {
        System.out.print("Nhap vao so sinh vien can nhap : ");
        int size = scanner.nextInt();
        if (size > 30 && size < 1) {
            System.out.println("Nhap lai kich thuoc mang sinh vien trong khoang 0->30");
            nhapSizeMang(scanner);
        }
        return size;
    }

    static int nhapSV(int size, Scanner scanner) {
        int count = 0;
        int[] listStudent = new int[size];
        for (int i = 0; i < listStudent.length; i++) {
            System.out.printf("Nhap diem sinh vien thu %d la : ", i);
            float diem = scanner.nextFloat();
            if (diem > 5 && diem <= 10) count++;
        }
        return count;
    }
}
