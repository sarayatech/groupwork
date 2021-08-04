package inheritance;

public class College {
    private String name;
    private String adress;


    public College() {
    }

    public College(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return getName() + "\n" +
            "College Adress : " + getAdress();
    }

}