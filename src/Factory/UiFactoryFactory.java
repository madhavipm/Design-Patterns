package Factory;

public  class UiFactoryFactory {
    public static UiFactory getUiFactory(PlatForm platForm) {
        if(platForm.equals(platForm.Ios )) {
            return new IosUiFactory();
        }
        else if(platForm.equals(platForm.Android)) {
            return new AndroidUiFactory();
        }
        else if(platForm.equals(platForm.Windows)){
            return new WindowsUiFactory();
        }
        else if(platForm.equals(platForm.Mac)) {
            return new MacUiFactory();
        }
        return null;

    }
}
