package CarRacingThreads;
 /*
 Create a car racing game where the following things are happening simultaneously,
 does not have to be a real game, just printing these details may be fine

Player's Car is running

Other cars are running

Everybody's position is updated

Try different thread operations like join, interrupt, priority and others
  */

public class CarRacingGame{
    public static void main(String [] args) throws InterruptedException {
        int position = 0;
        Thread car1 = new PlayerCar("c1", 1);
        Thread car2 = new PlayerCar("c2", 2);
        car1.start();
        car2.start();
        car1.run();
        car1.join();
    }

}

class PlayerCar extends Thread{
    private String id = "c";
    private Object position = 0;
    public PlayerCar(String s, int i){
        id = s;
        position = i;
    }

    @Override
    public void run() {
        while(true){
        synchronized(position){
            try{
                System.out.println(position);
                position.wait();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        position = (int)position + 1;
        position.notifyAll();

        }
    }
}
