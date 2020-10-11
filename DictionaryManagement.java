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
        tudien.setNumberOfWords(scanner.nextInt());
        scanner.nextLine();
        for (int i = 0; i < tudien.numberOfWords; i++) {
            System.out.println("Nhap tu:");
            tudien.wordList[i] = new Word();
            tudien.wordList[i].setWord_target(scanner.nextLine());
            System.out.println("Nhap nghia:");
            tudien.wordList[i].setWord_explain(scanner.nextLine());
        }
    }

    /**
     * Ham hien thi danh sach tu.
     */
    public void showAllWords() {
        System.out.println("No" + "\t" + "| English" + "\t\t" + "| Vietnamese");
        for (int j = 0; j < tudien.numberOfWords; j++) {
            System.out.println(j+1 + "\t" + "| " +  tudien.wordList[j].getWord_target()
                    + "\t\t\t" + "| " + tudien.wordList[j].getWord_explain());
        }
    }

    /**
     * Hàm main để test.
     */
    public static void main(String[] args) {
        DictionaryManagement test = new DictionaryManagement();
        test.insertFromCommandline();
        test.showAllWords();
    }

    /**
     * Ham nhap tu tu file.
     */
    public void insertFromFile(){

    }

    /**
     * Ham tra cuu bang dong lenh.
     */
    public void dictionaryLookup(){

    }

    /**
     * Ham chuc nang.
     */
    public void dictionaryAdvanced(){
        insertFromFile();
        showAllWords();
        dictionaryLookup();
    }

    /**
     * Ham them du lieu.
     */
    public void addWords(){

    }

    /**
     * Ham sua du lieu.
     */
    public void editWords(){

    }

    /**
     * Ham xoa du lieu.
     */
    public void removeWords(){

    }

    /**
     * Xuat du lieu ra file.
     */
    public void dictionaryExportToFile(){

    }

}
