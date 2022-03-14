public class Word {

    private String word;

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public String toString(){
        return word + " ";
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj == null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        Word word = (Word)obj;
        if(this.word == null){
            if(word.word != null)
                return false;
        }
        else if (!this.word.equals(word.word))
            return false;
        return true;
    }
    public int hashCode(){
        return (word == null) ? 0 : word.hashCode();
    }
}