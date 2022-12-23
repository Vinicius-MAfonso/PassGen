package model;

public class Password {
    private String password;
    private int length;
    private boolean useNumbers;
    private boolean useSymbols;
    private boolean useupperAndLowerCase;
    
    public Password(){}

    public Password(int length, boolean useNumbers, boolean useLetters, boolean useSymbols, boolean useupperAndLowerCase) {
        this.length = length;
        this.useNumbers = useNumbers;
        this.useSymbols = useSymbols;
        this.useupperAndLowerCase = useupperAndLowerCase;
    }

    public String getPassword() {
        return password;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isUseNumbers() {
        return useNumbers;
    }

    public void setUseNumbers(boolean useNumbers) {
        this.useNumbers = useNumbers;
    }

    public boolean isUseSymbols() {
        return useSymbols;
    }

    public void setUseSymbols(boolean useSymbols) {
        this.useSymbols = useSymbols;
    }

    public boolean isUseupperAndLowerCase() {
        return useupperAndLowerCase;
    }

    public void setUseupperAndLowerCase(boolean useupperAndLowerCase) {
        this.useupperAndLowerCase = useupperAndLowerCase;
    }
    
    public void passwordBuilder(){
        throw new UnsupportedOperationException("Não existe ainda");
    }
    
    
    
}
