
public class MainClass {

	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {

			
			DummySocketListnerClass dslc = new DummySocketListnerClass();
			dslc.createConnection("101" + i, "201+i", "board1");

		}
		System.out.println(DummySocketListnerClass.getConnectionList().size());
		
	}

}
