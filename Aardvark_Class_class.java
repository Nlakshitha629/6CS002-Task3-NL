
public class Aardvark_Class_class {

	public static void main(String[] args) {
		Menu model = new Menu();
		MenuView view = new MenuView();
		MenuController controller = new MenuController(model, view);
		controller.updateView();
	}
	
}
