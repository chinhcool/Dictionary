public class Dictionary {
    int numberOfWords = 0;
    public Word[] wordList = new Word[99999];

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }
}
