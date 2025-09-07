package proxy.test;

public class RealDataAccessProxy implements DataAccess{
    private DataAccess data;
    private String userRole;

    public RealDataAccessProxy(String userRole) {
        this.userRole = userRole;
        data = new RealDataAccess();
    }


    @Override
    public String getDataAccess() {
        System.out.println("Попытка подрочить юзера с ролью - " + userRole);

        if (userRole.equals("admin")){
            return data.getDataAccess();
        } else {
            return "Не сегодня, друг";
        }
    }
}
