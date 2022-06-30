public class Unidata {
    public int year;
    public String rank;
    public String university;
    public double score;
    public String link;
    public String country;
    public String city;
    public String region;
    public String logo;

    public Unidata(int year, String rank, String university, double score, String link, String country, String city, String region, String logo) {
        this.year = year;
        this.rank = rank;
        this.university = university;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;
    }

    public int getYear() {
        return year;
    }

    public String getRank() {
        return rank;
    }

    public String getUniversity() {
        return university;
    }

    public String toString() {
        return year + "," + rank + "," + university
         + "," + score + "," + link + "," + country
          + "," + city + "," + region + "," + logo;
    }
}

