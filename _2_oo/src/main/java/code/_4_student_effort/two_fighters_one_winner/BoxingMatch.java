package code._4_student_effort.two_fighters_one_winner;

public class BoxingMatch {
    private final Fighter fighter1;
    private final Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }

        if (fighter1.health <= 0 && fighter2.health <=0)
            return "Draw";
        else if (fighter1.health <= 0)
            return fighter2.name;
        else
            return fighter1.name;
    }
}
