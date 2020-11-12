class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int velocity;

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.velocity = 0;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void StartEngine(){
        this.engine = true;
    }

    public void accelerate(int rate){
        this.velocity+=rate;
        if(velocity<0){velocity=0;}
        if(velocity>120){velocity =120;}
        System.out.println("Accelerating at:" +rate+", and the Velocity is now:"+velocity);
    }

    public void brake(){
        this.velocity = 0;
        System.out.println("Brake...");
    }
}

class Camry extends Car {
    public Camry() {
        super("Camry", 4);
    }

    public void accelerate(int rate) {

        System.out.println("Accelerating at: " + rate );
    }

}


class Main{
    public static void main(String[] args) {
        Camry camry = new Camry();
        System.out.println(camry.getName());
        camry.accelerate(2);
    }
}
