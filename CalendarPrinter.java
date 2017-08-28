public class CalendarPrinter {
    public static void main(String[] args) {
        //Type your code here
        int day = 1;
        while (day <=30)
        
        {
            String message = "September ";
            if (day == 2 || day == 3 || day == 9 || day == 10||day==16 || day==17||day==23||day==24||day==30 ) {
                 message = message+day+"- WEEKEND";
            }
            else if (day == 4)
            message = message+day+ " - NO SCHOOL (LABOR DAY)";
            else  {
                message = message+day ; 
                
            }

            System.out.println(message);
            day+=1;
            }
        
    }        
    
}


