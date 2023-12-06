import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;
//@Getter
//@Setter
//@ToString
public class Student {
    private Long id;
    private String name;
    private double averageMark;

    public void getAverageMark() throws StudentException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter average mark: ");
            averageMark = sc.nextDouble();
            if (averageMark < 0 || averageMark > 20) {
                throw new StudentException("Invalid mark value.");
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

}
