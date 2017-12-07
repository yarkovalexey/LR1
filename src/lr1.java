/*
 * Created by Alexey Yarkov on 13.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

//Вариант №7
//Предметная область: автосалон.
//Автомобиль описывается следующими параметрами:
//уникальный идентификатор, марка автомобиля, страна-производитель, год выпуска, объем двигателя, стоимость.

public class lr1 {
    public static void main(String[] args) {
        CarShop A;
        A = new CarShop();
        System.out.println("\nРеализация добавления элементов:");
        for (int i = 1; i < 5; i++) {
            A.addCar(i, "Mercedes-Benz W140", "DE", 1998, 6, 600000);
        }
        A.getCarShop();
        System.out.println("\nРеализация изменения элементов:");
        A.editCarShop(0, 5, "Mercedes-Benz W140", "DE", 1999, 6, 750000);
        A.getCarShop();
        System.out.println("\nРеализация поиска элементов:");
        A.findCar(3);
        System.out.println("\nРеализация удаления элементов:");
        A.delCar(3);
        A.getCarShop();
        System.out.println("\nРеализация сортировки элементов:");
        A.bubbleSortCar();
        A.getCarShop();
    }
}
