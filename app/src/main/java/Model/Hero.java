package Model;

public class Hero {


//"name": "Captain America",
//        "realname": "Steve Rogers",
//        "team": "Avengers",
//        "firstappearance": "1941",
//        "createdby": "Joe Simon",
//        "publisher": "Marvel Comics",
//        "imageurl": "https://www.simplifiedcoding.net/demos/marvel/captainamerica.jpg",
//        "bio": "\r\n\t\tSteven Rogers was born in the Lower East Side of Manhattan, New York City, in 1925 to

    String name,realname,team,firstappearance,createdby,publisher,imageurl,bio;

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }

    public Hero(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio) {

        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }
}
