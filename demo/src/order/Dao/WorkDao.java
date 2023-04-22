package order.Dao;

import order.Do.User;

public interface WorkDao {

    //登录注册
    User sign(User user);
    int login(User user);
    void searchUserInfo(int id);



}
