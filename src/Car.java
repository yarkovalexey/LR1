public class Car {
    private int ID, Year, V, Price;
    private String Model, Country;
    public Car () {
        ID=0;
        Year=0;
        V=0;
        Price=0;
        Model=" ";
        Country=" ";
    }

    public Car (int id, String m, String c, int y, int v, int p) {
        ID=id;
        Year=y;
        V=v;
        Price=p;
        Model=m;
        Country=c;
    }

    public void setCar(int id, String m, String c, int y, int v, int p) {
        ID=id;
        Year=y;
        V=v;
        Price=p;
        Model=m;
        Country=c;
    }

    public void getCar() {
        System.out.println("ID: "+ID);
        System.out.println("марка автомобиля: "+Model);
        System.out.println("страна-производитель: "+Country);
        System.out.println("год выпуска: "+Year);
        System.out.println("объем двигателя: "+V);
        System.out.println("стоимость: "+Price+"\n");
    }

    public int getID(){
        return ID;
    }
    public int getYear(){
        return Year;
    }
    public int getV(){
        return V;
    }
    public int getPrice(){
        return Price;
    }
    public String getModel(){
        return Model;
    }
    public String getCountry(){
        return Country;
    }

    public void setID(int id){
        ID=id;
    }
    public void setYear(int y){
        Year=y;
    }
    public void setV(int v) {
        V = v;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public void setModel(String model) {
        Model = model;
    }

}
