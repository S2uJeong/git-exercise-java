package calculator;

public class RandomNumberCreator implements NumberCreator{

    @Override
    public int creat(int num) {
        int randomNum = (int)(Math.random()*num);
        return randomNum;
    }
}
