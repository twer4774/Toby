import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by TempSW on 2016. 4. 30..
 */
public class UserDaoTest {
    @Test
    public static void main(String[] arg) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();

        User user = new User();
        user.setId("whiteship3");
        user.setName("백기선");
        user.setPassword("married");

        userDao.add(user);

        System.out.println(user.getId() + "등록성공");

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회성공");

    }
}
