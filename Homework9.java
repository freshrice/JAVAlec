import java.io.*;
import java.util.*;


public class Homework9 {
    public static void main(String[] args){
        Map<String, String> idMap = new HashMap<String, String>();
        try {
            FileReader finm = new FileReader("db.txt");
            BufferedReader idpw = new BufferedReader(finm);
            String readLine = idpw.readLine();
            while (readLine != null) {
                String[] parts = readLine.split("\\s+");
                if (parts.length >= 2) {
                    idMap.put(parts[0], parts[1]);
                }
                readLine = idpw.readLine();
            }
            idpw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if(!idMap.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password: ");
            String pw = sc.nextLine().trim();

            if(!pw.equals(idMap.get(id))){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;



        }
    }
}
