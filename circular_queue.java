class Queue_using_array{
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
            if((rear+1)%size == front){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front =0;
            }
            rear =(rear+1 )%size;
            arr[rear] = data;
        }
        public void deque(){
            if(front == -1){
                System.out.println("No element in the arr");
            }
            System.out.println(arr[front]+" is removed");
            front =(front + 1)%size;
        }
        public static void peek(){
            if(rear ==-1){
                System.out.println("No element to print");
                return ;
            }
            System.out.println("peek : "+arr[front]);
        }
        public static boolean isempty(){
            return (rear+1)%size == front;
        }
        
    }
    public static void main(String args[]){
        Queue que = new Queue(5); // an array of size 5
        que.enque(10);
        que.enque(15);
        que.peek();
        que.deque();
        que.peek();
        System.out.println(que.isempty());
    }
}