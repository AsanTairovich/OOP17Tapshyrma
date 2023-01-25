import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;


    private String ownerName;


    public Farm(String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", horses=" + Arrays.toString(horses) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
