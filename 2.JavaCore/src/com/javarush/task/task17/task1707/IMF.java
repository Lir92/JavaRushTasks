package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        if(imf == null) { // проверяем создавался ли уже объект imf или нет. Если нет, создаём новый объект, иначе пользуемся существующим.
            synchronized (IMF.class) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
