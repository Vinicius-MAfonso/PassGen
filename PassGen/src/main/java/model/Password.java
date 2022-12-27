package model;

import java.util.Random;

public class Password {
    private Random random = new Random();
    private StringBuilder password;
    private int id;
    private int length;
    private boolean useNumbers;
    private boolean useSymbols;
    private boolean useUpper;
    private boolean useLower;
    
    public Password(){}
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setPassword(String password){
        this.password = new StringBuilder(password);
    }
    public StringBuilder getPassword() {
        return password;
    } 

    public void setLength(int length) {
        this.length = length;
    }

    public void setUseNumbers(boolean useNumbers) {
        this.useNumbers = useNumbers;
    }

    public void setUseSymbols(boolean useSymbols) {
        this.useSymbols = useSymbols;
    }

    public void setUseUpper(boolean useUpper) {
        this.useUpper = useUpper;
    }

    public void setUseLower(boolean useLower) {
        this.useLower = useLower;
    }
    
    public void build(){
        password = new StringBuilder();
        int position = 0;
        
        while(position < length){
            switch(random.nextInt(1,5)){
                case 1 -> {
                    if(!useNumbers)
                        continue;    
                    password.append(getARandomNumber());
                    position++;
                }
                case 2 ->{
                    if(!useLower)
                        continue;
                    password.append(getARandomLowerCase());
                    position++;
                }
                case 3 ->{
                    if(!useUpper)
                        continue;
                    password.append(getARandomUpperCase());
                    position++;
                }
                case 4 ->{
                    if(!useSymbols)
                        continue;
                    password.append(getARandomSymbol());
                    position++;
                }
            }
        }
    }
    private Integer getARandomNumber(){
        return random.nextInt(0,10);
    }
    private String getARandomLowerCase(){
        Integer randomLower = random.nextInt(97,123);
        return Character.toString(randomLower);
    }
    private String getARandomUpperCase(){
        Integer randomLower = random.nextInt(65,91);
        return Character.toString(randomLower);
    }
    private String getARandomSymbol(){
        Integer randomLower = random.nextInt(33,48);
        return Character.toString(randomLower);
    }
    
}
