public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public int getScore() {
        boolean lv1Reached = levelOne.goalReached();
        boolean lv2Reached = levelTwo.goalReached();
        boolean lv3Reached = levelThree.goalReached();

        int total = 0;

        if (lv1Reached) {
            total += levelOne.getPoints();

            if (lv2Reached) {
                total += levelTwo.getPoints();

                if (lv3Reached) {
                    total += levelThree.getPoints();
                }
            }
        }

        if (isBonus()) total *= 3;

        return total;
    }

    public boolean isBonus() {
        return true;
    }

    public void play() {

    }

    public int playTimes(int num) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i ++) {
            play();
            int currentScore = getScore();
            if (currentScore > max) max = currentScore;
        }

        return max;
    }
}
