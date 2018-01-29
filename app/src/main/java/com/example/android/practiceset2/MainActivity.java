package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        //int raspberryPrice = 5;
       // display1("1 box: $" + raspberryPrice);
        //raspberryPrice = 10;
       // display2("2 boxes: $" + (raspberryPrice));
       // display3("3 boxes: $" + (raspberryPrice * 3));

      //  display1("This is Box 1.");
      //  display2("And this is Box 2.");
      //  display3("And look! Box 3!");

        //int unreadEmails = "10"; causes error: declares an int type but provides String value
        //int unreademails = 10;
        //intunreadEmails = 10; causes error: no space between declared variable type and variable name

        //integer number; causes error: intteger is not a type declaration
        //int int; causes error: cannot use declaration text for variable name
        //int integer;

       //String currentPlaying = "Pinocchio -- Penguin Prison; causes error: missing closing quotes
        // string currentPlaying = "Fantasy -- Alina Baraz & Galimatias"; causes error: s in string is not capitalized
        //String currentPlaying = "Call Me Up -- Chromeo" causes arror: no semi-colon ; at end of declaration

       // String-name = "Katherine" causes error: Cannot write declaration with dash connecting variable name. Missing semi-colon
       // String "name" = "Kunal"; causes error: Cannot enclose variable name in quotes
       // String name on profile = "Lyla"; causes error: Cannot have spaces in variable name.


        // Code accomplishes goal. Weekday sleep hours are calculated to appropriate number of days
       // int weekday = 5;
       // int weekend = 9;
       // int optimalHours = 7 * 8;

       // int actualHours = weekday * 5 + weekend * 2;
       // int solution = optimalHours - actualHours;
       // display(solution);

        // Code does not accomplish goal. Number of minutes does not average in display
        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display(((day1 + day2 + day3) / 3));
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display (int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
    }

   // public void display(int text) {
   //     TextView t = (TextView) findViewById(R.id.display_text_view);
   //     t.setText(text + "");
   // }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
}
