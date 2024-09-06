package src.main.java;


public class ClockDisplay12Hour
{
    //Extend ClockDisplay for a 12 hour clock. This means you need to track AM/PM
    //Update all methods and parameters to accomodate this change
    
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private boolean isPM = false;
    private NumberDisplay seconds;
    private NumberDisplay minutes;
    private NumberDisplay hours;
    private String display;

    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplay12Hour()
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplay12Hour(int hour, int minute, int second, boolean pm)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second, pm);
    }
    
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick()
    {
        seconds.increment();
        
        // checking to see if seconds rolled over
        if(seconds.getValue() == 0)
        {
            minutes.increment();
            if(minutes.getValue() == 0)
            {
                hours.increment();
                if(hours.getValue() == 12)
                    isPM = !isPM;
                else if(hours.getValue() == 0)
                    hours.increment();
            }
        }
        // checking to see if value rolled over
        
        
        
        
        updateDisplay();
    }
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime(int hour, int minute, int second, boolean pm)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        isPM = pm;
        updateDisplay();
    }
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime()
    {
        return display;
    }

    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay()
    {
        String newDisplay = "";
        
        newDisplay += hours.getDisplayValue();
        newDisplay += ":";
        newDisplay += minutes.getDisplayValue();
        newDisplay += ":";
        newDisplay += seconds.getDisplayValue();
        if(isPM)
            newDisplay += "PM";
        else
            newDisplay += "AM";
        
        display = newDisplay;
    }
}
