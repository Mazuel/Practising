package fi.masa.harjoittelua.henkilorekisteri;

public class Menu {

    private String menuLayout = 
            "**************\n"+
            "1) Add\n"+
            "2) Remove\n"+
            "3) Find\n" +
            "4) Print\n" +
            "5) Stop\n"+
            "**************\n";
    
    public void showMenu() {
        System.out.println(menuLayout);
    }

    public boolean printSelected(String answer) {
        return answer.equalsIgnoreCase("3");
    }

}
