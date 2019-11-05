package com.company.board;

import com.company.Player_die.Player;

public class RegularSquare extends Square {


    public RegularSquare(String name, int index) {
        super(name, index);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setIndex(int index) {
        super.setIndex(index);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getIndex() {
        return super.getIndex();
    }

    @Override
    public void action(Player player) {
        System.out.println("Regular square");
    }
}