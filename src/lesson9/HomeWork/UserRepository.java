package lesson9.HomeWork;

/*Используйте класс User с предыдущей задачи

Так же создайте класс UserRepository, который будет содержать поле
User[] users, выполняющее роль условной базы данных. Поле инициализируется в конструкторе. Возможность модификации
поля из других классов должна быть закрыта, но возможность чтения открыта


User repository, part 6
В продолжении практических задач, в класс UserRepository с полем User[] users перенесите методы для работы с
условной базой данных (массивом):
User save(User user)
User update(User user)
void delete(long id)
findById(long id)

Все методы могут использоваться вне класса, поэтому должны быть публичные

В этой задаче так же нужно сабмитить класс User, созданный в одной из предудыщих задач урока


*/

public class UserRepository {


    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public User findById(long id) {

        if (users != null)
            for (User us : users) {
                if (us != null) {
                    if (us.getId() == id) {
                        return us;
                    }
                }
            }
        return null;
    }

    public User save(User user) {
        if (findById(user.getId()) == null){

            for (int j = 0; j < users.length; j++) {
                if (users[j] == null) {
                    users[j] = user;
                    return user;
                }
            }
        }
        return null;
    }

    public User update(User user){
        if (findById(user.getId()) != null){
            for (int j = 0; j < users.length; j++) {
                if (users[j] == findById(user.getId())) {
                    users[j] = user;
                    return user;
                }
            }
        }
        return null;

    }


    public void delete(long id){

        if (findById(id) != null){
            for (int j = 0; j < users.length; j++) {
                if (users[j] == findById(id)) {
                    users[j] = null;

                }
            }
        }
    }


}

