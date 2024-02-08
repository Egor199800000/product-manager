package pro.drozdov.productmanager.service.interfaces;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}
