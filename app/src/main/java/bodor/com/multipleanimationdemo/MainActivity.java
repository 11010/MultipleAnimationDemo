package bodor.com.multipleanimationdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageview);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(imageView,"ScaleX",1.0f,1.5f,1.0f).setDuration(1000);
                ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(imageView,"ScaleY",1.0f,1.5f,1.0f).setDuration(1000);

                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorX,objectAnimatorY); //同时进行的动画
//                animatorSet.playSequentially(objectAnimatorX,objectAnimatorY);//分开进行的动画
                animatorSet.start();


            }
        });




    }
}
