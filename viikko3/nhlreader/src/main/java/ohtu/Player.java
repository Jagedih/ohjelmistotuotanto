
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private int goals;
    private int penalties;
    private int assists;
    private String team;
    private String nationality;
    private String bDate;

    public Player(int goals, int assists, String name, int penalties, String team,
    String nationality, String birthdate){
      this.goals = goals;
      this.assists = assists;
      this.name = name;
      this.penalties = penalties;
      this.team = team;
      this.bDate = birthdate;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getTotalPoints(){
      return this.goals+this.assists;
    }

    @Override
    public String toString() {
        return name + " team:" +team + " goals:" +goals + " assists:" + assists
        +" total:" +(goals+assists);
    }
    @Override
    public int compareTo(Player otherPlayer){
      if(getTotalPoints() == otherPlayer.getTotalPoints()){
        return 0;
      }
      else if(getTotalPoints() - otherPlayer.getTotalPoints() > 0){
        return 1;
      }
      else{
        return -1;
      }
    }
}
