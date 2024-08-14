package ippoForce;

class ListNode {
    int x;
    ListNode next;

    ListNode(int a) {
        x = a;
    }
}

public class volg {

    public static ListNode that(ListNode l1, ListNode l2) {

        ListNode o = new ListNode(0);
        ListNode p = l1, k = l2, current = o;
        int c = 0;

        while (p != null && k != null) {

            int a = (p != null) ? p.x : 0;
            int b = (k != null) ? k.x : 0;

            int d = a + b + c;

            c = d / 10;

            current.next = new ListNode(d % 10);

            current = current.next;

            if (p != null)
                p = p.next;
            if (k != null)
                k = k.next;

            if (d > 0) {
                current.next = new ListNode(d);
            }
        }

        return o.next;

    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);

        l1.next = new ListNode(4);

        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = that(l1, l2);

        while (result != null) {
            System.out.println(result.x + "");
            result = result.next;
        }

    }
}