import java.util.Random;

public class fortunegenerator {
    private String yourFortune;
    int num;
    int prevNum;

    int fortuneNum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getYourFortune() {
        return yourFortune;
    }

    public void setYourFortune(String yourFortune) {
        this.yourFortune = yourFortune;
    }

    public int getPrevNum() {
        return prevNum;
    }

    public void setPrevNum(int prevNum) {
        this.prevNum = prevNum;
    }

    public String getFortune(int num){
        if(num==(1)){
            yourFortune = "You will have a day today";
        } else if (num==(2)) {
            yourFortune = "Something might happen";
        } else if (num==(3)) {
            yourFortune = "You will see a person";
        }else if (num==(4)) {
            yourFortune = "An amount of money will come to you";
        }else if (num==(5)) {
            yourFortune = "You will go to bed tonight";
        }else if (num==(6)) {
            yourFortune = "Work will get done";
        }else if (num==(7)) {
            yourFortune = "I'm running out of ideas";
        }else if (num==(8)) {
            yourFortune = "*says something vague but accurate*";
        }else if (num==(9)) {
            yourFortune = "Yes I have a license to read fortunes";
        }else if (num==(10)) {
            yourFortune = "So... what are you doing tonight (^ꞈ~)";
        }else if (num==(11)) {
            yourFortune = "You will use your computer today";
        }else {
            yourFortune = "If you live in cinci, you will hear an ambulance soon";
        }
        return yourFortune;
    }
}
