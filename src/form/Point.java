package form;

import lombok.*;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Point {
    private double x;
    private double y;
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the X coordinate of the point");
        this.x = scanner.nextDouble();
        System.out.println("Please enter the Y coordinate of the point");
        this.y = scanner.nextDouble();
    }
}
