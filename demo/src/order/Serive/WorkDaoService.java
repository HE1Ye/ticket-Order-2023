package order.Serive;

import order.Dao.WorkDao;
import order.Do.User;

import java.util.Scanner;

public class WorkDaoService implements WorkDao {
    public User[] data= new User[10];

    @Override
    public User sign(User user) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入姓名:");
        String name =scanner.nextLine();
        System.out.print("请输入电话号:");
        String phone =scanner.nextLine();
        System.out.print("请输入密码:");
        String password =scanner.nextLine();
        System.out.print("请确认密码:");
        String password2 =scanner.nextLine();
        if(checkPassword(password,password2)&&checkPhone(phone)){
            user.setName(name);
            user.setPhone(phone);
            user.setPossword(password);
            System.out.println("注册成功");
            data[user.getId()-1]=user;
        }else {
         return null  ;
        }
        return null;
    }

    @Override
    public int login(User user) {
        for(User user1:data){
            if(user.getName().equals(user1.getName())&&user.getPossword().equals(user1.getPossword())){
                System.out.println(user1.toString());
                System.out.println("登录成功");
                return user1.getId();
            }else if(user.getName().equals(user1.getName())&&!user.getPossword().equals(user1.getPossword())){
                System.out.println("密码输入错误");
                return -1;
            }
        }
        System.out.println("用户不存在");
        return 0;
    }

    @Override
    public void searchUserInfo(int id) {
        for (User user:data){
            if (user.getId()==id){
                System.out.println(user);
                return;
            }
        }
        System.out.println("没有找到用户");
        return;
    }

    //核验密码
    boolean checkPassword(String first ,String second){
        if (first.length()<6){
            System.out.println("密码太短");
        }
        if (first.equals(second)){
            return true;
        }else {
            System.out.println("密码不一致");
            return false;
        }

    }
    //核验电话号
    boolean checkPhone(String phone){
        if (phone.length()!=11){
            System.out.println("电话错误");
            return false;
        }else {
            return true;
        }
    }
}
