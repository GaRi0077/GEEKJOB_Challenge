/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.util.Random;
import java.io.PrintWriter;

/**
 *
 * @author GaRi0077
 */
public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();//山札が入る配列。

    public int open() {//現在の手札の合計値を返すメソッド。

        int total = 0;

        for (int i = 0; i < mycard.size(); i++) {
            total += mycard.get(i);
        }

        return total;

    }

    public void setCard(ArrayList<Integer> c) {//引いたカードを手札に追加するメソッド。

        for (int i = 0; i < c.size(); i++) {

            mycard.add(c.get(i));

        }

    }

    public boolean checkSum() {//もう一枚引くかどうか判断するメソッド。

        if (open() < 17) {

            return true;

        } else {

            return false;

        }

    }

    public Dealer() {//Dealerクラスがインスタンス化された際に必ず実行されるメソッド(初期値)。
  for (int count = 1; count <= 4; count++) {

            for (int j = 1; j <= 13; j++) {
                if (j > 10) {

                    cards.add(10);

                } else {

                    cards.add(j);
                }

            }
        }


        

    }

    public ArrayList<Integer> deal() {//カードをデッキからランダムに二枚引くメソッド。

        ArrayList<Integer> RandomCards = new ArrayList<Integer>();
        Random rand = new Random();

        Integer Index1 = rand.nextInt(cards.size());
        cards.remove(Index1);

        Integer Index2 = rand.nextInt(cards.size());
        cards.remove(Index2);

        RandomCards.add(cards.get(Index1));
        RandomCards.add(cards.get(Index2));

        return RandomCards;//デッキから「ランダムに取り出した二枚のカード」を戻り値として返す。

    }

    public ArrayList<Integer> hit() {//デッキから一枚ランダムに引くメソッド。

        ArrayList<Integer> NewCards = new ArrayList<Integer>();

        Random rand = new Random();

        Integer NewIndex = rand.nextInt(cards.size());
        cards.remove(NewIndex);

        NewCards.add(cards.get(NewIndex));

        return NewCards;
    }
}
