import java.util.EmptyStackException;
import java.util.Stack;
import java.util.logging.Logger;

public class QueueUsingStack<V> {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    Stack<V> stack1 = new Stack<>();
    Stack<V> stack2 = new Stack<>();

    public void addItems(V val){
        while(!stack1.isEmpty()) {
            V x = stack1.pop();
            stack2.push(x);
        }

        stack1.push(val);

        while(!stack2.isEmpty()){
            V x = stack2.pop();
            stack1.push(x);
        }
    }

    public void getItemsFromQueue(){
        try{
            while(!stack1.isEmpty()) {
                V x = stack1.peek();
                stack1.pop();
                System.out.print(x);
            }
        }
        catch (EmptyStackException e){
            LOGGER.info("Empty queue");
        }
    }


    public static void main(String[] args){
        QueueUsingStack<Integer> s = new QueueUsingStack<>();
        s.addItems(4);
        s.addItems(4);
        s.addItems(6);
        s.addItems(8);
        s.getItemsFromQueue();
    }
}
