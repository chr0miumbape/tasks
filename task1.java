public class task1 {
    public static void main(String [] args){
    pineapplecount(500,1);
    }
    static void pineapplecount(int cash, int price){
        int result = Math.toIntExact(Math.round(Math.floor(cash/price)));
        System.out.println("На " + cash + " рублей можно приобрести " + result + " ананасов по " + price + " рублей" );
    }

}
