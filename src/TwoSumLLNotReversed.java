import java.util.Stack;

public class TwoSumLLNotReversed {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    //method to add both the linked list with actual addition order(without reversal)
    public static Node twoSumLLNotReversed(Node l1, Node l2) {

        //get two stack to apply FILO
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        //until l1 becomes null store it in stack
        while (l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }
        //until l2 becomes null store it in stack
        while (l2 != null) {
            stack2.push(l2.data);
                l2 = l2.next;
            }
        //get the variables and a null node for the new list
            int carry = 0;
            int a, b;
        Node head = null;
        //while my stacks get emptied or carry has some value
            while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {

                a = 0;
                b = 0;
                //a will store the elements popped out of stack1
                if (!stack1.isEmpty()) {
                    a = stack1.pop();
                }
                //b will store the elements popped out of stack2
                if (!stack2.isEmpty()) {
                    b = stack2.pop();
                }
                //sum will store over all
                int sum = (a + b + carry);
                carry = sum / 10;

                Node temp = new Node(sum % 10);

                temp.next = head;
                head = temp;
            }return head;
    }



    public static void main(String[] args) {

    }
}
