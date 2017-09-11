package fi.masa.harjoittelua.henkilorekisteri;

public class Menu {

    private String menuLayout = 
            "**************\n"+
            "1) Add\n"+
            "2) Remove\n"+
            "3) Print\n" +
            "4) Find\n" +
            "5) Calculate Wages\n" +
            "6) Stop\n"+
            "**************\n";
    
    public void showMenu() {
        System.out.println(menuLayout);
    }

    public boolean printAll(String answer) {
        return answer.equalsIgnoreCase("3");
    }
    public boolean printSelected (String answer) {
        return answer.equalsIgnoreCase("4");
    }
    public boolean removePerson (String answer) {
        return answer.equalsIgnoreCase("2");
    }
    public boolean addPerson (String answer) {
        return answer.equalsIgnoreCase("1");
    }

    public boolean calculateAllWages(String answer) {
        return answer.equalsIgnoreCase("5");
    }

}
