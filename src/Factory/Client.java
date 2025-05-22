package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        //From flutter we should be able to get object of corresponding platform
        UiFactory uiFactory = flutter.getUiFactory(PlatForm.Mac);

        //not a good practise user can do type mistakes then will get exceptions
        //soo instead of string will use enum
        Button button = uiFactory.createButton();
        button.DisplayButton();

        Menu menu = uiFactory.createMenu();
        menu.displayMenu();

    }
}
