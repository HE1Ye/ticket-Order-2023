package order.controller;

import order.Do.User;
import order.Serive.WorkDaoService;

import java.util.Scanner;

public class RunWorkController {
    WorkDaoService service =new WorkDaoService();
    public void Sign(){
        User user = new User(1);
        service.sign(user);

    }
    public void searchUserInfo(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入id");
        int id=scanner.nextInt();
        service.searchUserInfo(id);
    }
    public void loGin(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入用户昵称");
        String name =scanner.nextLine();
        System.out.println("输入用户密码");
        String password =scanner.nextLine();
        User user = new User(0);
        user.setName(name);
        user.setPossword(password);
        service.login(user);
    }

    public static void main(String[] args) {
        RunWorkController controller=new RunWorkController();
        controller.Sign();
        controller.loGin();
    }
}
