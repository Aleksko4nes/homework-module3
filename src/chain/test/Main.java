package chain.test;

public class Main {
    public static void main(String[] args) {
        Handler departament = new DepartamentHandler();
        Handler manager = new ManagerHandler();
        Handler vice = new ViceCeoHandler();
        Handler ceo = new CEOHandler();

        departament.setNext(manager);
        manager.setNext(vice);
        vice.setNext(ceo);

        departament.handleRequest(500);
        departament.handleRequest(3000);
        departament.handleRequest(10000);
        departament.handleRequest(6000);
        departament.handleRequest(11000);
    }
}
