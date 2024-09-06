package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("Testing Clock Display:");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        String test2Output = test2.getTime();
        System.out.println("\t2 Arg Con. Test - " + test2Output);
        
        test2.setTime(5, 15);
        String test3Output = test2.getTime();
        System.out.println("\tSet Time Test - " + test3Output);
        
        // TODO: Read time and tick tests
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 After increment - " + tickTest1Output);
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        String tickTest2Output = tickTest2.getTime();
        System.out.println("\tTickTest2 Before increment - " + tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println("\tTickTest2 After increment - " + tickTest2Output);
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println("\tTickTest3 Before increment - " + tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println("\tTickTest3 After increment - " + tickTest3Output);
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println("\tTickTest4 Before increment - " + tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println("\tTickTest4 After increment - " + tickTest4Output);
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        String tickTest5Output = tickTest5.getTime();
        System.out.println("\tTickTest5 Before increment - " + tickTest5Output);
        tickTest5.timeTick();
        tickTest5Output = tickTest5.getTime();
        System.out.println("\tTickTest5 After increment - " + tickTest5Output);
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("Testing Clock Display:");
        ClockDisplaySeconds testSeconds1 = new ClockDisplaySeconds();
        String test1OutputSeconds = testSeconds1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1OutputSeconds);
        
        ClockDisplaySeconds testSeconds2 = new ClockDisplaySeconds(2, 45, 39);
        String test2OutputSeconds = testSeconds2.getTime();
        System.out.println("\t2 Arg Con. Test - " + test2OutputSeconds);
        
        testSeconds2.setTime(5, 15, 9);
        String test3OutputSeconds = testSeconds2.getTime();
        System.out.println("\tSet Time Test - " + test3OutputSeconds);
        
        ClockDisplaySeconds secondsClock = new ClockDisplaySeconds();
        tickTest(secondsClock, 3, 32, 59);
        tickTest(secondsClock, 1, 0, 59);
        tickTest(secondsClock, 1, 59, 59);
        tickTest(secondsClock, 23, 59, 59);
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour smartClock = new ClockDisplay12Hour();
        tickTest(smartClock, 3, 32, 59, true);
        tickTest(smartClock, 11, 59, 59, true);
        tickTest(smartClock, 11, 59, 59, false);
        tickTest(smartClock, 12, 59, 59, true);
        
        
        
    }
    
    private static void tickTest(ClockDisplaySeconds clock, int hour, int minute, int second)
    {
          clock.setTime(hour, minute, second);
          clock.timeTick();
        System.out.println("\t" + clock.getTime());
    }
    
    private static void tickTest(ClockDisplay12Hour clock, int hour, int minute, int second, boolean pm)
    {
          clock.setTime(hour, minute, second, pm);
          clock.timeTick();
        System.out.println("\t" + clock.getTime());
    }
}
