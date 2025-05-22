package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Menu.Menu;

public interface UiFactory {
    //Factory methods
    Button createButton(); //return obj of corresponding button
    Menu createMenu(); //return obj of corresponding menu


}
