public class Queue_using_array{
    static class Queue{
        static int [] arr ;
        static int rear =-1;
        static int front =-1 ;
        static int size;
        Queue(int n){
            arr = new int[n];
            size = n;
        }
        
        public static void enque(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front =0;
            }
            rear++;
            arr[rear] = data;
        }
        public void deque(){
            if(front == -1){
                System.out.println("No element in the arr");
            }
            System.out.println(arr[front]+" is removed");
            front ++;
        }
        public static void peek(){
            if(rear ==-1|| front > rear ){
                System.out.println("No element to print");
                return ;
            }
            System.out.println("peek : "+arr[front]);
        }
        
    }
    public static void main(String args[]){
        Queue que = new Queue(5); // an array of size 5
        que.enque(10);
        que.enque(15);
        que.peek();
        que.deque();
        que.peek();
    }
} {
    
}
