package org.example.HerdVsFleet.Weapon;

public class ThorHammer extends Weapon{
    public ThorHammer() {
        super("Thor Hammer", (int)Math.floor(Math.random()*(75-25+1)+25), 20);
    }
}
