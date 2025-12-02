package org.example;

public class AuthorizationModule extends Listener
{
    @Override
    public void execute(Event event)
    {
        System.out.println("AuthorizationModule event: " + event.getName());
    }
}
