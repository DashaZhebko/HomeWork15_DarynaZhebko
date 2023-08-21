public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String souse;

    public String green;

    public Burger(String bun, String meat, String cheese, String souse, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.souse = souse;
        this.green = green;
        System.out.println("Standard burger: " +bun+ ", " + meat + ", " + cheese + ", " + souse+ ", " + green);
    }

    public Burger(String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.println("Dietary burger: " +bun+ ", " + meat + ", " + cheese + ", " + green);
    }

    public Burger(String meat) {
        this.meat = meat;
        System.out.println("Burger double meat : " + meat);
    }


}
