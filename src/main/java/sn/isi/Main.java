package sn.isi;

import sn.isi.model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        User user1 = new User(
//                2L,
//                "Diallo", "Amadou", "Conakry", 32,
//                "amadou@gmail.com", "622123456",
//                "Guinéenne", "Développeur", true, true
//        );
//        System.out.println(user1.toString());
//
//        User user = new User();
//        user.setAge(30);
//        user.setAdresse("Test");
//        System.out.println(user.toString());
        User user = User.builder()
                .userId(2L)
                .nom("Diallo")
                .prenom("Boubacar")
                .build();
        System.out.println(user.toString());
    }
}