package org.example;

public class Compress extends Transform
{
    @Override
    public String execute(String value)
    {
        var result = value;
        do
        {
            value = result;
            result = result.replace("  ", " ");
        }
        while (!result.equals(value));

        return result;
    }
}
