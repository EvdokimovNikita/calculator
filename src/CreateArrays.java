public class CreateArrays {
    public int createVariable() {
        String input = MyScanner.myScanner();
        String[] variableArr = input.split(Main.REGEX);
        int a = Integer.parseInt(variableArr[0]);
        int b = Integer.parseInt(variableArr[1]);
        String sing = GetSign.getSign(input);
        switch (sing) {
            case ("+"):
                Operation plus = new PlusImpl();
                return plus.operate(a, b);
            case ("-"):
                Operation subtraction = new SubtractionImpl();
                return subtraction.operate(a, b);
            case ("*"):
                Operation multiplication = new MultiplicationImpl();
                return multiplication.operate(a, b);
            case ("/"):
                Operation divider = new DividerImpl();
                return divider.operate(a, b);
            default:
                throw new RuntimeException();
        }
    }
}
