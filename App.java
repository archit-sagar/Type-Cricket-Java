public class App {
    public static void main(String[] args) {

        View theView = new View();

        Model theModel = new Model();

        new Controller(theView, theModel);

        theView.setSize(800, 400);
        theView.setResizable(false);
    }
}
