package ua.dp.levelUp;

/**
 * Created by java on 16.06.2017.
 */
public class PC {

    private String hdd;
    private String ram;
    private User owner;

    public PC() {
    }

    public PC(String hdd, String ram, User owner) {
        this.hdd = hdd;
        this.ram = ram;
        this.owner = owner;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PC{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", owner=" + owner +
                '}';
    }
}
