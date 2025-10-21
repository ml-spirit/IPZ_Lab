package org.example;
import java.time.LocalDate;
import java.time.LocalTime;

public class Date extends Transform
{
    @Override
    public String execute(String value)
    {
        return value + " " + LocalDate.now().toString() + " " + LocalTime.now().toString();
    }
}
