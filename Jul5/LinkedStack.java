package Jul5;

public class LinkedStack<T> {

    // โครงสร้างของ Node แต่ละตัวใน Linked List
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;   // ตัวชี้ไปยังโหนดบนสุดของ Stack
    private int size;   // จำนวนสมาชิกใน Stack

    public LinkedStack() {
        top = null;
        size = 0;
    }

    // เพิ่มข้อมูลเข้า Stack (ด้านบนสุด)
    public void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // นำข้อมูลออกจาก Stack (จากด้านบนสุด)
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack ว่างเปล่า ไม่สามารถ pop ได้");
        }
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // ดูข้อมูลบนสุดของ Stack โดยไม่เอาออก
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack ว่างเปล่า ไม่สามารถ peek ได้");
        }
        return top.data;
    }

    // ตรวจสอบว่า Stack ว่างหรือไม่
    public boolean isEmpty() {
        return top == null;
    }

    // คืนค่าจำนวนสมาชิกใน Stack
    public int size() {
        return size;
    }

    // แสดงข้อมูลทั้งหมดใน Stack (จากบนลงล่าง)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack ว่างเปล่า");
            return;
        }
        Node current = top;
        System.out.print("Stack (บนสุด -> ล่างสุด): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // ---------- ทดสอบการทำงาน ----------
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();               // Stack: 40 30 20 10
        System.out.println("Peek: " + stack.peek());   // 40
        System.out.println("Pop: " + stack.pop());     // 40
        stack.display();               // Stack: 30 20 10
        System.out.println("ขนาด Stack: " + stack.size()); // 3
        System.out.println("Stack ว่างหรือไม่: " + stack.isEmpty()); // false
    }
}