package com.company;

public class Line {
    public int getSeqNum() {
        return seqNum;
    }

    public String getText() {
        return text;
    }

    private int seqNum;
 private String text;

public Line(String text,int seqNum)
{
    this.text=text;
    this.seqNum=seqNum;
}
}
