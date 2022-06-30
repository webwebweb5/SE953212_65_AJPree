
/**
 * Lab 1 Solution
 * @author pree.t
 */
public class UniData {
    
    String year, rank, uniName, score, link, country, city, region, logo;

    public UniData() {

    }// default constructor

    public UniData(String year, String rank, String uniName, String  score, String link, String country, String city, String logo) {
        this.year = year;
        this.rank = rank;
        this.uniName = uniName;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        // this.region = region;
        this.logo = logo;

    }// end overload constructor

    // year
    public String  getYear() {
        return this.year;
    }
    public void setYear(String x) {
        this.year = x;
    }

    // uniName
    public String getUniName() {
        return this.uniName;
    }

    public void setUniName(String x) {
        this.uniName = x;
    }

    // rank
    public String getRank() {
        return this.rank;
    }

    public void setRank(String x) {
        this.rank = x;
    }
    
    // score
    public void setScore(String  x) {
        this.score = x;
    }

    public String  getScore() {
        return this.score;
    }

    // link
    public String getLink() {
        return this.link;
    }

    public void setLink(String x) {
        this.link = x;
    }

    // country
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String x) {
        this.country = x;
    }

    // city
    public String getCity() {
        return this.country;
    }

    public void setCity(String x) {
        this.city = x;
    }

    // region
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String x) {
        this.region = x;
    }

    // logo
    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String x) {
        this.logo = x;
    }

    public String toString() {
        return this.year + ", " + this.rank + ", " + this.uniName + ", " + this.score + ", " 
        + this.link + ", " + this.country + ", " + this.city + ", " + this.logo;

    }// override method toString
}// end class UniData
