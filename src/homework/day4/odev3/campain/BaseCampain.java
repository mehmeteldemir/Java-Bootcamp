package homework.day4.odev3.campain;

public  class BaseCampain {

    private String campainName;
    private Double discountPercentage;
    private String campainCode;

    {
        campainCode = String.valueOf(100000 + Math.random() * 900000);
    }

    public BaseCampain() {
    }

    public BaseCampain(String campainName, Double discountPercentage) {
        this.campainName = campainName;
        this.discountPercentage = discountPercentage;
    }

    public String getCampainName() {
        return campainName;
    }

    public String getCampainCode() {
        return campainCode;
    }

    public void setCampainCode(String campainCode) {
        this.campainCode = campainCode;
    }

    public void setCampainName(String campainName) {
        this.campainName = campainName;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
