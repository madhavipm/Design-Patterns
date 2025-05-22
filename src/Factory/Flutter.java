package Factory;

public class Flutter {
    //Non factory methods + attribute of uifactory

    void refreshUi(){
        System.out.println("Refreshing UI from Flutter");
    }
    void setTheme(){
        System.out.println("Setting Theme from Flutter");
    }
    public UiFactory getUiFactory(PlatForm platForm){
        return UiFactoryFactory.getUiFactory(platForm);
    }

}
