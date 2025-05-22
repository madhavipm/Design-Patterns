package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.WindowsButton;
import Factory.Components.Menu.Menu;
import Factory.Components.Menu.WindowsMenu;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
