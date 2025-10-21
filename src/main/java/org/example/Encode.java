package org.example;
import java.util.Base64;

public class Encode extends Transform
{
    @Override
    public String execute(String value)
    {
        return Base64.getEncoder().encodeToString(value.getBytes());
    }
}
