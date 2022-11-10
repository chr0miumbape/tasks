public class task2 {
    public static void main(String [] args){
        TotalPriceTickets(15,2,720);
    }
    static void TotalPriceTickets(int students, int adults, int fpticket){
        int adultTicketsCost = fpticket * adults;
        int studentTicketsCost = (fpticket / 2) * students;
        int Total = adultTicketsCost + studentTicketsCost;
        System.out.println("Общая стоймость билетов - " + Total);
    }

}
