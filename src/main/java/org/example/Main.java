package org.example;

public class Main
{
    public static void main(String[] args)
    {
        EventManager.getInstance().registerListener(new AuthorizationModule());
        EventManager.getInstance().registerListener(new LogModule());
        EventManager.getInstance().registerListener(new UiModule());
        EventManager.getInstance().sendEvent(new Event("Event1", "First event"));
    }
}