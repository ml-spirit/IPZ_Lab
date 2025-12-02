package org.example;

public class UiModule extends Listener
{
    @Override
    public void execute(Event event)
    {
        System.out.println("UiModule event: " + event.getName());
    }
}
