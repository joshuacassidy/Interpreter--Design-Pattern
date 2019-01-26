public class Main {

    public static void main(String[] args) {
        Expression trueExp = new TerminalExpression("");
        Expression falseExp = new TerminalExpression(null);

        Expression exp1 = new OrExpression(trueExp, falseExp);
        Expression exp2 = new AndExpression(trueExp, falseExp);

        System.out.println(exp1.interpret(""));
        System.out.println(exp2.interpret(""));



    }

}
