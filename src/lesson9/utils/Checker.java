package lesson9.utils;

public class Checker {
    /* Четыре поля видимости в джаве:
    public - доступно с любой точки проекта
    private - доступность только внутри класса (противоположность public)
    default (package-private) - это когда возле элемента ничего не стоит (не указана видимость), такой элемент
                                доступен всем внутри пакета
    protected - элемент доступен в классе, в пакете и во всех наследниках класса.
     */

    //private
    //default
    //protected
    //publik

    /* Основной принцип 1. - все поля должны быть private ! Если всеже нужен доступ к закрытым полям то
    используем гетеры сетеры .
     */


    int companyNameValidatedCount = 0;

    public boolean checkCompanyName(String companyName){
      //  if (companyName == "Google" || companyName == "Amazon")
      //      return false;
      //  return true;

        if (companyNameValidatedCount > 10 )
            return false;


        companyNameValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}


/*Пока не поставили public в поле и метод не могли вызывать ни поле ни метод из других классов. Поставили public - все
заработало!!
 */