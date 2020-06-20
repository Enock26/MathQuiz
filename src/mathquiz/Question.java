

package mathquiz;

/**
 *
 * @author enock
 */
public class Question implements Comparable<Question>
{
    private int leftOperand;
    private int rightOperand;
    private int answer;
    private String operator;
    private final String SPACE = "";
    
    public Question (int lOp, String op, int rOp, int ans)
    {
        leftOperand = lOp;
        operator = op;
        rightOperand = rOp;
        answer = ans;
    }
    public int getLop()
    {
        return leftOperand;
    }
    
    public int getROp()
    {
        return rightOperand;
    }
public int getAnswer()
{
    return answer;
}

public String getOperator()
{
    return operator;
}

@Override
public String toString()
{
    // question format 30 (6 * 5)
    return answer + "(" + leftOperand + " " + operator + " " + rightOperand +")";
}
 
// return integer values 0, -1 or 1
public int compareTo (Question anotherQuiz)
{
    int comparison = 0;
    if (this.answer < anotherQuiz.answer)
       
    {
        comparison = -1;
    }
    else if (this.answer > anotherQuiz.answer)
    {
        comparison = 1;
    }
    return comparison;
    
}
    
    
}
