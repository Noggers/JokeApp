package com.example.jokeapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    Random rand = new Random();
    Button btn_ans, btn_prev, btn_next;
    TextView tv_joke, tv_ans;
    public String[] Joke = {
            "",
            "What did the cake say to the fork?",
            "What do you call cheese that's not yours?",
            "Did you hear about the claustrophobic astronaut?",
            "Why don't seagulls fly near the bay?",
            "Where are average things manufactured?",
            "What do you call bears without ears?",
            "What did the buffalo mother say when dropping her son off at school?",
            "What's red and smells like blue paint?",
            "What kind of key can never unlock a door?",
            "What's brown and sticky?",
            "Why do dragons sleep during the day?",
            "What did one elevator say to the other?",
            "Why can't your nose be 12 inches long?",
            "Why did Mickey Mouse go to space?",
            "Why did Billy go out with a prune?",
            "What has 4 wheels and flies?",
            "What kind of car does Mickey's wife drive?",
            "Why did the robber take a shower before robbing the bank?",
            "When will the little snake arrive?",
            "Why did Dracula lie in the wrong coffin?",
            "Why should you not let a bear operate the tv remote?",
            "Why didn't the dentist like his award?",
            "Why did the dinosaur refuse to wear deodorant?",
            "Why did the pony get sent to his room?",
            "How do you teach a tissue to dance?",
            "Why did they quit giving tests at the zoo?",
            "Where do polar bears keep their money?",
            "What room can no one enter?",
            "What did one eye say to the other?",
            "What do you call a fake noodle?",
            "What does a nosy pepper do?",
            "What's a pig's favorite karate move?",
            "Why do bees have sticky hair?",
            "How do you fix a train that can't hear?",
            "What's the smartest kind of bee?",
            "What do you call an old snowman?",
            "Why is a basketball stadium always cool?",
            "Why couldn't the pirate learn the alphabet?",
            "Why do all cobblers go to heaven?",
            "What did one plate say to the other?",
            "What time is it when an elephant sits on your fence?",
            "Why don't dinosaurs eat clowns?",
            "Why did the girl throw a stick of butter?",
            "What did the finger say to the thumb?",
            "What do you call a cow with no legs?",
            "Why can't you hear a pterodactyl use the bathroom?",
            "Why don't you ever see Hippos hiding in trees?",
            "How does NASA organize their parties?",
            "What kind of shoes do ninjas wear?",
            "Why does Snoop Dogg carry an umbrella?",
            "What time is it when you have to go to the dentist?",
            "What do you call dangerous precipitation?",
            "What's the best part about living in Switzerland?",
            "Why can't a bike stand on its own?",
            "What do you call a big pile of kittens?",
            "What do you call a dinosaur with an extensive vocabulary?",
            "What do you call a thieving alligator?",
            "What do you get when dinosaurs crash their cars?",
            "How do you put a baby alien to sleep?",
            "What do you call a lazy kangaroo?",
            "What job did the frog have at the hotel?",
            "What has many eyes but cannot see?",
            "What do you call a bear with no teeth?",
            "What do you call an everyday potato?",
            "What do you call an alligator in a vest?",
            "How did the hipster burn his tongue?",
            "How can you tell if a skeleton is sick?",
            "Why did the police officer smell bad?",
            "What did the grape say when he was squished?",
            "Why was Tigger looking in the toilet?",
            "What do you get when you put a candle in a suit of armor?",
            "What do you call a sleepwalking nun?",
            "Why are ghosts bad liars?",
            "What do you get from a pampered cow?",
            "What did the 0 say to the 8?",
            "What does the man in the moon do with his hair when it gets too long?",
            "What do you get when you cross a porcupine with a snail?",
            "What do you get when you cross a snowman with a vampire?",
            "Why did the scarecrow win an award?",
            "What kind of exercise do lazy people do?"

    };
    public String[] Answer = {
            "",
            "You want a piece of me?",
            "Nacho cheese",
            "He just needed a little space",
            "Because then they'd be bagels",
            "The satisfactory",
            "B",
            "Bison",
            "Red paint",
            "A monkey",
            "A stick",
            "So they can fight knights",
            "I think I'm coming down with something",
            "Because then it would be a foot",
            "He wanted to find Pluto",
            "Because he couldn't find a date",
            "A garbage truck",
            "A Minnie van",
            "He wanted to make a clean get away!",
            "I don't know, but he won't be long",
            "He made a grave mistake",
            "He likes to press the paws button",
            "It was a plaque",
            "He didn't want to be ex-stinked",
            "He wouldn't stop horsing around",
            "You put a little boogie in it",
            "It was full of cheetahs",
            "A snow bank",
            "A mushroom",
            "Between you and me, something smells",
            "An Im-pasta",
            "Gets jalapeno business",
            "The Pork chop",
            "They use a honey comb",
            "With an engineer",
            "A spelling bee",
            "Water",
            "It's full of fans",
            "He always got lost at sea",
            "They have good soles",
            "Dinner is on me",
            "Time to get a new fence",
            "Because they taste funny",
            "She wanted to see a butterfly",
            "I'm in glove with you",
            "Ground beef",
            "Because the P is silent",
            "Because they're really good at it",
            "They planet",
            "Sneakers",
            "Fo' drizzle",
            "Tooth-Hurty",
            "A rain of terror",
            "Not sure, but the flag is a big plus",
            "It's two-tired",
            "A meowntain",
            "A thesaurus",
            "A crookodile",
            "T-rex",
            "You rocket",
            "A pouch potato",
            "Bellhop",
            "A potato",
            "A gummy bear",
            "A commentator",
            "An investigator",
            "He drank his coffee before it was cool",
            "By his coffin",
            "He was on duty",
            "Nothing, but he let out a little whine",
            "He was looking for pooh",
            "A knight light",
            "A roamin' Catholic",
            "Because you can see right through them",
            "Spoiled milk",
            "Nice belt!",
            "Eclipse it",
            "A slow poke",
            "Frostbite",
            "He was outstanding in his field. But hay, it's in his jeans",
            "Diddly-squats"


    };
    int counter = rand.nextInt(80);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ans = findViewById(R.id.btn_ans);
        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);

        tv_ans = findViewById(R.id.tv_ans);
        tv_joke = findViewById(R.id.tv_joke);

        tv_joke.setText(Joke[counter]);
        tv_ans.setText(Answer[counter]);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    //Create Click Listeners
        btn_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_ans.setVisibility(view.VISIBLE);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter < 80){
                    counter++;}
                else {counter = 1;}
                tv_joke.setText(Joke[counter]);
                tv_ans.setText(Answer[counter]);
            tv_ans.setVisibility(view.INVISIBLE);
            }
        });
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter > 1)
                    counter--;
                else counter=80;
                tv_joke.setText(Joke[counter]);
                tv_ans.setText(Answer[counter]);
            tv_ans.setVisibility(view.INVISIBLE);
            }
        });


    }


}
