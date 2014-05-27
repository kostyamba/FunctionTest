package sample;


public class ChainInteger {
} private Integer integer;

    public ChainInteger(Integer integer){
        this.integer=integer;
    }

    public ChainInteger add(Integer number){
        return new ChainInteger(new Addition().apply(integer,number));
    }

    public ChainInteger sub(Integer number){
        return new ChainInteger(new Subtraction().apply(integer,number));
    }

    public static void main(String[] args){

    }
