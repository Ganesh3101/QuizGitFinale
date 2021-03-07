package com.example.quizgitfinale;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Anime_20_medium extends AppCompatActivity {
    TextView qtext,qcount,qtimer;
    private List<ComicsModel> qlist;
    Button a,b,c,d;
    private int qno;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics);
        qtext = findViewById(R.id.qtext);
        qcount = findViewById(R.id.qno);
        qtimer =  findViewById(R.id.time);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);


        qlist = new ArrayList<>();
        getData();
    }

    private void getData() {

        qlist.add(new ComicsModel(
                "What was studio Trigger's first original long-form animated series for television?", 4, "Kiznaiver", "Inferno Cop", "Gurren Lagann", "Kill la Kill"));

        qlist.add(new ComicsModel(
                "The heroine of 'Humanity Has Declined' is a mediator between humans and what?", 3, "Elves", "The Earth", "Fairies", "Animals"));

        qlist.add(new ComicsModel(
                "In 'Toriko', which of the following foods is knowingly compatible with Toriko?", 3, "Mors Oil", "Alpacookie", "Poison Potato", "Parmesansho Fruit"));

        qlist.add(new ComicsModel(
                "In 'Toriko', which of the following Heavenly Kings has an enhanced sense of Hearing?", 2, "Coco", "Zebra", "Sunny", "Toriko"));

        qlist.add(new ComicsModel(
                "Who is the creator of the manga series 'One Piece'?", 3, "Yoshihiro Togashi", "Hayao Miyazaki", "Eiichiro Oda", "Masashi Kishimoto"));

        qlist.add(new ComicsModel(
                "Who voices 'Shou Suzuki' in the English dub of 'Mob Psycho 100'?", 4, "Ben Diskin", "Chris Niosi", "David Naughton", "Casey Mongillo"));

        qlist.add(new ComicsModel(
                "'Silhouette', a song performed by the group 'KANA-BOON' is featured as the sixteenth opening of which anime?", 3, "One Piece", "Naruto", "Naruto: ShippÅ«den", "Gurren Lagann"));

        qlist.add(new ComicsModel(
                "In " +
                        "'To Love-Ru: Darkness', which of the girls attempt making a harem for Rito Yuuki?", 4, "Yami (Golden Darkness)", "Haruna Sairenji", "Mea Kurosaki", "Momo Deviluke"));

        qlist.add(new ComicsModel(
                "In 'To Love-Ru', who is the first to hear of Yami's past from her?", 1, "Rito", "Mikan", "Lala", "Haruna"));

        qlist.add(new ComicsModel(
                "In 'Highschool DxD', what is the name of the item some humans are born with?", 2, "Imperial Arm", "Sacred Gear", "Hallowed Relic", "Blessed Artifact"));

        qlist.add(new ComicsModel(
                "In 'Little Witch Academia', what is Shiny Chariot's alias at Luna Nova Academy?", 4, "Croix Meridies", "Miranda Holbrook", "Anne Finnelan", "Ursula Callistis"));

        qlist.add(new ComicsModel(
                "In Haikyuu!!, who is not a member of Karasuno VBC?", 1, "Shigeru Yahaba", "Tadashi Yamaguchi", "Hisashi Kinoshita", "Kazuhito Narita"));

        qlist.add(new ComicsModel(
                "In the 'Re:Zero' manga series, which of the following Sin Archbishops eats Rem's existence?", 1, "Ley Batenkaitos", "Roy Alphard", "Petelgeuse Romanee-Conti", "Louis Arneb"));

        qlist.add(new ComicsModel(
                "In 'Puella Magi Madoka Magica', what is the first name of Madoka's younger brother?", 2, "Montoya", "Tatsuya", "Tomohisa", "Minato"));

        qlist.add(new ComicsModel(
                "Which Japanese music group was formed to produce theme music for the anime 'Guilty Crown'?", 3, "Goose house", "Babymetal", "Egoist", "Garnidelia"));

        qlist.add(new ComicsModel(
                "What was the reason for the banning of episode 35 of the 'Pokémon Original Series' Anime?", 4, "Flashing Images", "Jynx", "Strong Violence", "Gun Usage"));

        qlist.add(new ComicsModel(
                "In 'JoJo's Bizzare Adventure: Stardust Crusaders', what is the last name of the protagonist Jotaro?", 1, "Kujo", "Cujoh", "Joestar", "Higashikata"));

        qlist.add(new ComicsModel(
                "How does the character Dragowizard, Qinus Axia's from the anime 'Buddyfight' differ between the Japanese and English dubs?", 3, "Different Body Proportions", "Different Backstory", "Different Gender", "Different Appearance"));

        qlist.add(new ComicsModel(
                "Which of the following films was NOT directed by Hayao Miyazaki?", 1, "Wolf Children", "Princess Mononoke", "Spirited Away", "Kiki's Delivery Service"));

        qlist.add(new ComicsModel(
                "Which JoJo's Bizarre Adventure character possesses the Stand named Silver Chariot?", 2, "Noriaki Kakyoin", "Jean Pierre Polnareff", "Hol Horse", "Hermes Costello"));



        setQuestion();
    }

    private void setQuestion() {

        qtimer.setText(String.valueOf(10));

        qtext.setText(qlist.get(0).getQuestion());
        a.setText(qlist.get(0).getA());
        b.setText(qlist.get(0).getB());
        c.setText(qlist.get(0).getC());
        d.setText(qlist.get(0).getD());

        qcount.setText("Question " +String.valueOf(1) + "/" + String.valueOf(qlist.size()) + ":");

        startTimer();
        qno=0;
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(11000, 1000)            //Method for countdown timer, with countdown time and interval in miliseconds
        {
            public void onTick(long millisUntilFinished) {

                qtimer.setText(String.valueOf(millisUntilFinished/1000));

            }

            @Override
            public void onFinish() {

                changequestion();
            }


        };
        countDownTimer.start();
    }

    private void changequestion() {

        if (qno<qlist.size()-1)
        {
            qno++;
            playanimate(qtext,0,0);
            playanimate(a,0,1);
            playanimate(b,0,2);
            playanimate(c,0,3);
            playanimate(d,0,4);

            qcount.setText(String.valueOf(qno+1) + "/" + String.valueOf(qlist.size()));

            qtimer.setText(String.valueOf(10));

            startTimer();

        }
        else
        {
            Intent intent  = new Intent(Anime_20_medium.this,MainActivity.class);
            startActivity(intent);
        }
    }

    private void playanimate(View view, final int value, int switchnum) {

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
                .setStartDelay(500).setInterpolator(new DecelerateInterpolator())
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {

                        if (value==0)
                        {
                            switch(switchnum)
                            {
                                case 0:
                                    ((TextView)view).setText(qlist.get(qno).getQuestion());
                                    break;
                                case 1:
                                    ((Button)view).setText(qlist.get(qno).getA());
                                    break;
                                case 2:
                                    ((Button)view).setText(qlist.get(qno).getB());
                                    break;
                                case 3:
                                    ((Button)view).setText(qlist.get(qno).getC());
                                    break;
                                case 4:
                                    ((Button)view).setText(qlist.get(qno).getD());
                                    break;



                            }
                            if(switchnum != 0)
                                ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));


                            playanimate(view,1,switchnum);

                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }


    public void Buclick(View view) {

        int selectid = 0;

        switch (view.getId())
        {
            case R.id.a :
                selectid =1;
            case R.id.b :
                selectid =2;

            case R.id.c :
                selectid =3;

            case R.id.d :
                selectid =4;

            default:
                selectid = 0;
        }
        countDownTimer.cancel();
        checkanswer(selectid,view);
    }

    private void checkanswer(int selectid ,View view) {

        if (selectid == qlist.get(qno).getAnswer())
        {
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));

        }
        else
        {
            ((Button)view).setBackgroundTintList(ColorStateList.valueOf(Color.RED));

            switch (qlist.get(qno).getAnswer())
            {
                case 1:
                    a.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 2:
                    b.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 3:
                    c.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
                case 4:
                    d.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    break;
            }
        }

        changequestion();
    }
}
