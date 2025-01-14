public class StarshipExplorer {

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    Alien[] aliens = new Alien[50];

    public static void main(String[] args) {
        StarshipExplorer myCode = new StarshipExplorer();
        String StarshipExplorer;
    }

    public StarshipExplorer() {
        System.out.println("Hello World! Good luck on your exams!");
        for (int i = 0; i < aliens.length; i++) {
            int pEnergyLevel = (int) (Math.random() * 75) + 1;
            int pHostilityIndex = (int) (Math.random() * 101);
            aliens[i] = new Alien(pEnergyLevel, pHostilityIndex);
        }
        displayAliens();
        System.out.println(checkEnergy());
        decipher(alienLanguage);

    }

    public void displayAliens() {
        for (int i = 0; i < aliens.length; i++) {
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergy() {
        for (int i = 0; i < aliens.length; i++) {
            for (int j = 0; j < aliens.length; j++) {
                if (i != j && aliens[i].getEnergyLevel() == aliens[j].getEnergyLevel()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void decipher(String text) {
        String message = new String();
        int index = 0;
        while (index < text.length() - 1){
            if (text.charAt(index) == '*'){
                message += text.charAt(index + 1);
            }
            index++;
        }

        System.out.println(message);
    }
}