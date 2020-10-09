public class Dictionary {
    int numberOfWords = 999999;
    public Word[] wordList = new Word[numberOfWords];

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
}
