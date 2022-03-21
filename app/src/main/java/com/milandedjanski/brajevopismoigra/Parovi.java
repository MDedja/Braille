package com.milandedjanski.brajevopismoigra;

import android.widget.CheckBox;

import java.util.Objects;

public class Parovi {
    private char slovo;
    private boolean cb1;
    private boolean cb2;
    private boolean cb3;
    private boolean cb4;
    private boolean cb5;
    private boolean cb6;


    public Parovi(char slovo, boolean cb1, boolean cb2, boolean cb3, boolean cb4, boolean cb5, boolean cb6) {
        this.slovo = slovo;
        this.cb1 = cb1;
        this.cb2 = cb2;
        this.cb3 = cb3;
        this.cb4 = cb4;
        this.cb5 = cb5;
        this.cb6 = cb6;
    }


    public char getSlovo() {
        return slovo;
    }

    public void setSlovo(char slovo) {
        this.slovo = slovo;
    }

    public boolean isCb1() {
        return cb1;
    }

    public void setCb1(boolean cb1) {
        this.cb1 = cb1;
    }

    public boolean isCb2() {
        return cb2;
    }

    public void setCb2(boolean cb2) {
        this.cb2 = cb2;
    }

    public boolean isCb3() {
        return cb3;
    }

    public void setCb3(boolean cb3) {
        this.cb3 = cb3;
    }

    public boolean isCb4() {
        return cb4;
    }

    public void setCb4(boolean cb4) {
        this.cb4 = cb4;
    }

    public boolean isCb5() {
        return cb5;
    }

    public void setCb5(boolean cb5) {
        this.cb5 = cb5;
    }

    public boolean isCb6() {
        return cb6;
    }

    public void setCb6(boolean cb6) {
        this.cb6 = cb6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parovi parovi = (Parovi) o;
        return slovo == parovi.slovo && cb1 == parovi.cb1 && cb2 == parovi.cb2 && cb3 == parovi.cb3 && cb4 == parovi.cb4 && cb5 == parovi.cb5 && cb6 == parovi.cb6;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slovo, cb1, cb2, cb3, cb4, cb5, cb6);
    }
}
