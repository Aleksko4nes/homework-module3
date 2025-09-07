package proxy.test;

public class Main {
    public static void main(String[] args) {
        DataAccess data = new RealDataAccessProxy("admin");
        System.out.println(data.getDataAccess());

        data = new RealDataAccessProxy("user");
        System.out.println(data.getDataAccess());
    }
}
