package lesson9.HomeWork;

/*Используйте класс User с предыдущей задачи

Так же создайте класс UserRepository, который будет содержать поле
User[] users, выполняющее роль условной базы данных. Поле инициализируется в конструкторе. Возможность модификации
поля из других классов должна быть закрыта, но возможность чтения открыта

В этом классе напишите методы, доступные для всех:
getUserNames() - для получения массива имен пользователей
getUserIds() - для получения массива id пользователей
getUserNameById(long id) - для получения имени пользователя, по его id

 В продолжении практических задач с 9го урока, в классе UserRepository, напишите методы для поиска юзера в условной
 базе данных (массиве):
getUserByName(String name) - нахождение юзера по имени
getUserById(long id) - нахождение юзера по id
getUserBySessionId(String sessionId) - нахождение юзера по sessionId

Возвращайте null, если юзера найти не удалось. Если юзеров несколько - возвращайте первый

Методы должны быть доступны всем

В этой задаче так же нужно сабмитить класс User, созданный в одной из предудыщих задач урока



В продолжении практических задач, в классе UserRepository, напишите метод для добавления нового юзера в условную базу
 данных (массив):
User save(User user) - будет добавлять юзера и возвращать его

Eсли юзер уже есть в массиве, результат - null. Если размер массива не позволяет добавить больше элементов
(все ячейки заняты) результат метода тоже null

Метод должен быть доступен всем

Используйте метод с предыдущих задач для нахождение юзера по id. Только переменуйте его в findById(long id).
Метод должен быть доступен, только внутри класса UserRepository


User repository, part 5
В продолжении практических задач, в классе UserRepository, напиши методы для удаления и обновления юзера в условной
 базе данных (массиве):
User update(User user) - будет обновлять текущего юзера в массиве (перезаписывать) и возвращать его.
Если юзера нет, результат метода null
void delete(long id) - удаляет юзера с массива

Методы должны быть доступны всем

Используйте метод findById(long id) с предыдущих задач для нахождение юзера по id. Метод должен быть доступен,
только внутри класса UserRepository

В этой задаче так же нужно сабмитить класс User, созданный в одной из предудыщих задач урока


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

public class UserRepositoryOld {


    private User[] users;

    public UserRepositoryOld(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public int usCount() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                count++;
        }
        return count;
    }


    public String[] getUserNames() {

        String[] userNames = new String[usCount()];

        for (int i = 0; i < usCount(); i++) {
            userNames[i] = users[i].getName();
        }
        return userNames;
    }


    public long[] getUserIds() {

        long[] userId = new long[usCount()];

        for (int i = 0; i < usCount(); i++) {

            userId[i] = users[i].getId();
        }
        return userId;
    }


    public String getUserNameById(long id) {
        String name = null;
        if (users != null)
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getId() == id) {
                        name = users[i].getName();

                    }

                }
            }
        return name;

    }

    public User getUserByName(String name) {
        User nameUs;
        if (users != null)
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getName() == name) {
                        nameUs = users[i];
                        return nameUs;
                    }
                }
            }
        return null;

    }

    public User getUserById(long id) {

        if (users != null)
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getId() == id) {
                        return users[i];
                    }
                }
            }
        return null;
    }


    public User getUserBySessionId(String sessionId) {

        if (users != null)
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getSessionId() == sessionId) {
                        return users[i];
                    }
                }
            }
        return null;
    }

    private User findById(long id) {

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

