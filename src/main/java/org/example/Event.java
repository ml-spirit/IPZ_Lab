package org.example;

public class Event
{
    private String name;
    private String description;

    public Event(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public void execute()
    {
        System.out.println(this.name + ": " + this.description);
    }

    public String getName()
    {
        return this.name;
    }

    public String getDescription()
    {
        return this.description;
    }
}
