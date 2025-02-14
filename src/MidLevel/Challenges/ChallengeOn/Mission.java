package MidLevel.Challenges.ChallengeOn;

enum Rank {
    S, A, B, C, D;
}

enum Status {
    PENDING, IN_PROCESSING, COMPLETED, FAILED, FORBIDDEN
}

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

    public static Rank getRankByOption(int optionValue){
        if(optionValue == 1){
            return Rank.S;
        }
        if(optionValue == 2){
            return Rank.A;
        }
        if(optionValue == 3){
            return Rank.B;
        }
        if(optionValue == 4){
            return Rank.C;
        }
        if(optionValue == 5){
            return Rank.D;
        }
        return Rank.D;
    }

    public static Status getStatusByOption(int optionValue){
        if(optionValue == 1){
            return Status.PENDING;
        }
        if(optionValue == 2){
            return Status.IN_PROCESSING;
        }
        if(optionValue == 3){
            return Status.COMPLETED;
        }
        if(optionValue == 4){
            return Status.FAILED;
        }
        if(optionValue == 5){
            return Status.FORBIDDEN;
        }
        return Status.PENDING;
    }
}
