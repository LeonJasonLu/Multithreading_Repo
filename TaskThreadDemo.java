public class TaskThreadDemo{
    public static void main(String[] args){
        Runnable printA = new PrintChar('A', 100);
        Runnable printB = new PrintChar('B', 100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);

        thread1.start();
        thread2.start();
    }
}
class PrintChar implements Runnable{
    private char charToPrint; //要印出的字元
    private int times; //要印出該字元的總次數

    //constructor
    public PrintChar(char charToPrint, int times){
        this.charToPrint = charToPrint;
        this.times = times;
        if(times <= 0){
            this.times = 1;
        }
    }
    //覆寫並實作Runnable介面的抽象方法--run()
    @Override
    public void run(){
        for(int i = 0; i < times; i++){
            System.out.print(charToPrint);
        }
    }   
}