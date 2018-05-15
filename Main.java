public class Main {

    public static void main(String[] args) {
        BrowserStack browserStack = new BrowserStack();
        browserStack.addPage("google");
        browserStack.addPage("facebook");
        browserStack.addPage("dropbox");
        System.out.println(browserStack.backPage().getData());
        System.out.println(browserStack.removePage().getData());
        System.out.println(browserStack.removePage().getData());
        System.out.println(browserStack.removePage().getData());

    }

}
