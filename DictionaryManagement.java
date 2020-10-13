import java.util.Scanner;
import java.io.*;

public class DictionaryManagement {
    Dictionary tudien = new Dictionary();

    /**
     * Ham nhap tu tu ban phim.
     */
    public void insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu: ");
        //tudien.setNumberOfWords(scanner.nextInt());
        int sotunhapvao = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < sotunhapvao; i++) {
            System.out.println("Nhap tu:");
            tudien.wordList[i] = new Word();
            tudien.wordList[i].setWord_target(scanner.nextLine());
            System.out.println("Nhap nghia:");
            tudien.wordList[i].setWord_explain(scanner.nextLine());
        }
        //chay xong ham thi so tu trong tu dien + sotunhapvao
        tudien.setNumberOfWords(tudien.numberOfWords++);
    }

    /**
     * Ham hien thi danh sach tu.
     */
    public void showAllWords() {
        System.out.println("No" + "\t" + "| English" + "\t\t" + "| Vietnamese");
        for (int j = 0; j < tudien.numberOfWords; j++) {
            System.out.println(j + 1 + "\t" + "| " + tudien.wordList[j].getWord_target()
                    + "\t\t\t" + "| " + tudien.wordList[j].getWord_explain());
        }
    }

    /**
     * Ham nhap tu tu file.
     */
    public void insertFromFile() {
        try {
            //Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("C:\\Users\\DevC\\Desktop\\data.txt");
            DataInputStream dis = new DataInputStream(fis);
            //Doc du lieu
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String dataLine = sc.nextLine();
                String[] item = dataLine.split("\\t");
                // ??tudien.wordList[i] = new Word();
                //gan gia tri cho chuoi trong mang
                tudien.wordList[tudien.getNumberOfWords()].setWord_target(item[0]);
                tudien.wordList[tudien.getNumberOfWords()].setWord_explain(item[1]);
                tudien.setNumberOfWords(tudien.numberOfWords++);
            }
            sc.close(); //dong luong
        } catch (FileNotFoundException ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }


    /**
     * Ham tra cuu bang dong lenh.
     */
    public void dictionaryLookup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap tu can tra:");
        String tratu = sc.nextLine();
        for (int i = 0; i < tudien.getNumberOfWords(); i++) {
            if (tudien.wordList[i].getWord_target().equalsIgnoreCase(tratu)) {
                System.out.println("Nghia cua tu can tra la:");
                System.out.println(tudien.wordList[i].getWord_explain());
                break;
            } else {
                System.out.println("Khong tim thay nghia cua tu can tra la:");
            }
        }
    }

    /**
     * Ham chuc nang.
     */
    public void dictionaryAdvanced() {
        //insertFromFile();
        showAllWords();
        dictionaryLookup();
    }

    /**
     * Ham them du lieu.
     */
    public void addWords() {
        tudien.wordList[tudien.getNumberOfWords()] = new Word();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can them: ");
        tudien.wordList[tudien.getNumberOfWords()].setWord_target(sc.nextLine());
        System.out.println("Nhap nghia:");
        tudien.wordList[tudien.getNumberOfWords()].setWord_explain(sc.nextLine());
        tudien.setNumberOfWords(tudien.numberOfWords++);
    }

    /**
     * Ham sua du lieu.
     */
    public void editWords() {
        tudien.wordList[tudien.getNumberOfWords()] = new Word();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can sua: ");
        String suatu = sc.nextLine();
        for (int i = 0; i < tudien.getNumberOfWords(); i++) {
            if (tudien.wordList[i].getWord_target().equalsIgnoreCase(suatu)) {
                tudien.wordList[i].setWord_target(sc.nextLine());
                System.out.println("Nhap nghia:");
                tudien.wordList[i].setWord_explain(sc.nextLine());
            }
        }

    }

    /**
     * Ham xoa du lieu.
     */
    public void removeWords() {
        tudien.wordList[tudien.getNumberOfWords()] = new Word();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can xoa: ");
        String xoatu = sc.nextLine();
        for (int i = 0; i < tudien.getNumberOfWords(); i++) {
            if (tudien.wordList[i].getWord_target().equalsIgnoreCase(xoatu)) {
                tudien.wordList[i] = null;
            }
        }
        tudien.setNumberOfWords(tudien.numberOfWords--);
    }

    /**
     * Xuat du lieu ra file.
     */
    public void dictionaryExportToFile() throws IOException{
        String FILE_URL = "C:\\Users\\DevC\\Desktop\\exportDict.txt";

//        {
//            IOArray Arr = new IOArray();
//            Arr.input_file(); //nhap tu file
//            SortArray SArr = new SortArray();
//            SArr.sort(Arr); //sap xep
//            Arr.output_file(); //xuat ra file
//            System.out.println("nSucces ! Open file output.txt to view");
//        }
        }


    /**
     * Hàm main để test.
     */
    public static void main(String[] args) {
        DictionaryManagement test = new DictionaryManagement();
        //test.dictionaryAdvanced();
        test.addWords();
        test.showAllWords();

    }

}
