package lesson4.task1.view;

import java.util.List;
import lesson4.task1.data.User;

public interface UserView <T extends User>{
     void sendOnConsole(List<T> students);
}