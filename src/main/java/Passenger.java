public class Passenger {
    private String name;
    private String surname;
    private int age;
    private double coins;
    public Passenger(String name,String surname,int age,double coins)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.coins=coins;
    }
    public String getName()
    {
        return name;
    }
    public double getCoins()
    {
        return coins;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getAge()
    {
        return age;
    }


}
