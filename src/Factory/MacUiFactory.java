package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.MacButton;
import Factory.Components.Menu.MacMenu;
import Factory.Components.Menu.Menu;

public class MacUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
