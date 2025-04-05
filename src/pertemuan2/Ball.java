package pertemuan2;

public class Ball {

    private String color;
    private int size;
    private boolean moveStatus;

    public void move() {
        moveStatus = true;
        System.out.println("The ball is moving.");
    }

    public void stop() {
        moveStatus = false;
        System.out.println("The ball is stopped.");
    }

    public void showStatus() {
        String status = moveStatus ? "moving." : "not moving.";
        System.out.println("The ball is currently " + status + ".");
    }

    public void showColor() {
        System.out.println("The color of the ball is " + color + ".");
    }

    public boolean showSize() {
        System.out.println("The color of the ball is " + size + ".");
        return false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColor() {
      this.color = color;
    }

    public Ball(String color, int size, boolean moveStatus) {
        this.color=color;
        this.size = size;
        this.moveStatus = moveStatus;
    }
}
