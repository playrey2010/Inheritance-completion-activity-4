public final class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;



    @Override
    public boolean equals (Object object) {
        if (this.toString().equalsIgnoreCase(object.toString())) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getDescription() + " developped by " + programmer;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
