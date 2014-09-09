package pattern.chainofresposibility;

public class TestClass {

	public static void main(String[] args) {
		Request request1 = new Request();
		Request request2 = new Request();
		Request request3 = new Request();
		Request request4 = new Request();

		request1.setAmount(2_000);
		request1.setPurpose("����");
		request2.setAmount(15_000);
		request2.setPurpose("��");
		request3.setAmount(30_000);
		request3.setPurpose("�����");
		request4.setAmount(450_000);
		request4.setPurpose("��");

		Director lisan = new Director();
		Manager hh = new Manager();
		ChairMan jj = new ChairMan();
		BoardofDirector OD = new BoardofDirector();

		lisan.setSuccessor(hh);
		hh.setSuccessor(jj);
		jj.setSuccessor(OD);

		lisan.approve(request1);
		lisan.approve(request2);
		lisan.approve(request3);
		lisan.approve(request4);
	}

}
