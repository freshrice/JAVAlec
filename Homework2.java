import java.util.Scanner;

class Student {

    int stuNum;
    String stuName;
    String stuMajor;
    int stuPhone;

    public int getStuNum() { return stuNum; }
    public void setStuNum(int stuNum) { this.stuNum = stuNum; }

    public String getStuName() { return stuName; }
    public void setStuName(String stuName) { this.stuName = stuName; }

    public String getStuMajor() { return stuMajor; }
    public void setStuMajor(String stuMajor) { this.stuMajor = stuMajor; }

    public int getStuPhone() { return stuPhone; }
    public void setStuPhone(int stuPhone) { this.stuPhone = stuPhone; }

    public String getFormattedPhone() {
        String abc = Integer.toString(this.stuPhone);
        String part1 = abc.substring(0, 2);
        String part2 = abc.substring(2, 6);
        String part3 = abc.substring(6);
        return "0" + part1 + "-" + part2 + "-" + part3;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stuArr = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            stuArr[i] = new Student();
            stuArr[i].setStuNum(Integer.parseInt(parts[0]));
            stuArr[i].setStuName(parts[1]);
            stuArr[i].setStuMajor(parts[2]);
            stuArr[i].setStuPhone(Integer.parseInt(parts[3]));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int j = 0; j < 3; j++) {

            System.out.println((j + 1) + "번째 학생: "
                    + stuArr[j].getStuNum() + " "
                    + stuArr[j].getStuName() + " "
                    + stuArr[j].getStuMajor() + " "
                    + stuArr[j].getFormattedPhone());
        }
    }
}