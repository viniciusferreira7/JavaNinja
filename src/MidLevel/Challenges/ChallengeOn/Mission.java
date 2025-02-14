package MidLevel.Challenges.ChallengeOn;

public class Mission {
   private String name;
   private Status status;
   private Rank rank;

   Mission(String name, Status status, Rank rank){
       this.name = name;
       this.status = status;
       this.rank = rank;
   }

    public String getName(){
        return name;
    }
    public Status getStatus(){
        return status;
    }
    public Rank getRank(){
        return rank;
    }

    enum Rank {
        S, A, B, C, D;
    }

    enum Status {
        PENDING, IN_PROCESSING, COMPLETED, FAILED, FORBIDDEN
    }
}
