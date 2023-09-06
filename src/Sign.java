public enum Sign {
    PLUS("+"),
    MULTIPLICATION("*"),
    SUBTRACTION("-"),
    DIVIDER("/");
    public final String signElement;
    Sign(String signElement) {
        this.signElement = signElement;
    }
    public String getSignElement(){
        return signElement;
    }

}
