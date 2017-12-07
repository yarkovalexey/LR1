/*
 * Created by Alexey Yarkov on 13.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

public class CarShop {
    private int N;
    private Car cars[];
    private int s;

    public CarShop() {
        s = 0;
        N = 10;
        cars = new Car[N];
    }

    public void addCar(int id, String m, String c, int y, int v, int p) {
        if (s >= N) {
            Car tmp[] = new Car[N];
            System.arraycopy(cars, 0, tmp, 0, cars.length);
            N += 5;
            cars = new Car[N];
            System.arraycopy(tmp, 0, cars, 0, tmp.length);
        }
        Car A = new Car(id, m, c, y, v, p);
        cars[s] = A;
        s++;
    }

    public void getCarShop() {
        for (int i = 0; i < s; i++) cars[i].getCar();
    }

    public void editCarShop(int pos, int id, String m, String c, int y, int v, int p) {
        cars[pos].setCar(id, m, c, y, v, p);
    }

    public void findCar(int pos) {
        for (int i = 0; i < s; i++) {
            if (i == pos) cars[i].getCar();
        }
    }

    public void delCar(int pos) {
        for (int i = pos; i < s - 1; i++) {
            cars[i] = cars[i + 1];
        }
        s--;
    }

    public void bubbleSortCar() {
        for (int i = s - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (cars[j].getID() > cars[j + 1].getID()) {
                    Car t = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = t;
                }
            }
        }
    }
}
