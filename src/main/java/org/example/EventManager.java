package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager
{
    private List<Listener> listeners = new ArrayList<Listener>();
    private static EventManager eventManager = new EventManager();

    public static EventManager getInstance()
    {
        return eventManager;
    }

    public void registerListener(Listener listener)
    {
        this.listeners.add(listener);
    }

    public void sendEvent(Event event)
    {
        for (Listener listener : this.listeners)
        {
            listener.execute(event);
        }
    }
}
