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

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.data);
                l2 = l2.next;
            }
            int carry = 0;
            int a, b;
        Node head = null;
            while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {

                a = 0;
                b = 0;
                if (!stack1.isEmpty()) {
                    a = stack1.pop();
                }
                if (!stack2.isEmpty()) {
                    b = stack2.pop();
                }
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
