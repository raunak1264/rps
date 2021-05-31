package com.company;

import java.util.*;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        // write your code here

        int thr = Integer.parseInt(JOptionPane.showInputDialog("Whats your Choice 3:Rock(O), 4:Paper(___), 5: Scissor(>8) "));
       if(thr==3){
        JOptionPane.showMessageDialog((null), "You choose Rock O ");}
        else if(thr==4) {
            JOptionPane.showMessageDialog((null), "You choose Paper ___ ");}
        else if(thr==5){
            JOptionPane.showMessageDialog((null), "You choose Scissor >8");}
        Random choice = new Random();
        int toss;
        toss = choice.nextInt(3);
        switch(toss) {
            case 0:
                JOptionPane.showMessageDialog((null), "I choose Rock O ");
                break;
            case 1:
                JOptionPane.showMessageDialog((null), "I choose paper ___");
                break;
            case 2:
                JOptionPane.showMessageDialog((null), "I choose scissor >8 ");
                break;
        }
        if (thr == 3 && toss == 0)//Rock to rock
       {
           JOptionPane.showMessageDialog((null), "Its a tie Rock to rock (｡◕‿◕｡) ");
        }
        else if(thr==3&&toss==1)//Rock to paper
        {
            JOptionPane.showMessageDialog((null), "You loose,paper covers rock (｡◕‿◕｡) ");
        }
        else if(thr==3&&toss==2)//rock to Scissor
        {
            JOptionPane.showMessageDialog((null), "You Win, Rock breaks Scissor ( ఠൠఠ )ﾉ");
        }
        if (thr == 4 && toss == 0)//paper to rock
        {
            JOptionPane.showMessageDialog((null), "You Win,paper covers rock ( ఠൠఠ )ﾉ ");
        }
        else if(thr==4&&toss==1)//paper to paper
        {
            JOptionPane.showMessageDialog((null), "tie,paper to paper ");
        }
        else if(thr==4&&toss==2)//paper to scissor
        {
            JOptionPane.showMessageDialog((null), "You loose, scissor cuts paper (｡◕‿◕｡) ");
        }
        if (thr == 5 && toss == 0)//scissor to rock
        {
            JOptionPane.showMessageDialog((null), "You loose, Rock breaks scissor (｡◕‿◕｡) ");
        }
        else if(thr==5&&toss==1)//scissor to paper
        {
            JOptionPane.showMessageDialog((null), "You Win,Scissor cuts paper ( ఠൠఠ )ﾉ ");
        }
        else if(thr==5&&toss==2)//scissor to scissor
        {
            JOptionPane.showMessageDialog((null), "tie, Scissor to Scissor (｡◕‿◕｡) ");
        }
        else if (thr<3 || thr> 5) {
            JOptionPane.showMessageDialog((null), "Wrong choice, You loose (｡◕‿◕｡) ");
        }}}
