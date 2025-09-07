package proxy.test;

public class RealDataAccess implements DataAccess{
    @Override
    public String getDataAccess() {
        return "Супер секретный пароль от порнхаб - 123456";
    }
}
