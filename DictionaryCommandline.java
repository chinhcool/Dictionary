public class DictionaryCommandline {

    DictionaryManagement chucnang = new DictionaryManagement();

    /**
     * Ham tu dien.
     */
    public void dictionaryBasic() {
        chucnang.insertFromCommandline();
        chucnang.showAllWords();
    }
}

