package org.example;

public class LogModule extends Listener
{
    @Override
    public void execute(Event event)
    {
        System.out.println("LogModule event: " + event.getName());
    }
}
