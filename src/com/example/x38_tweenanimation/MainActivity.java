package com.example.x38_tweenanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView iv;
	private TranslateAnimation ta;
	private ScaleAnimation sa;
	private AlphaAnimation aa;
	private RotateAnimation ra;




	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iv = (ImageView) findViewById(R.id.iv);
    }

	//λ��
    public void click1(View v){
    	
    	ta = new TranslateAnimation(0, 100, 0, 100);
    	//�ƶ�ʱ��
    	ta.setDuration(2000);
    	//���ƶ�����                                 +1
    	ta.setRepeatCount(1);
    	//�ƶ�ģʽ    ����һ��
    	ta.setRepeatMode(Animation.REVERSE);
    	//��ʼ�ƶ�
    	iv.startAnimation(ta);
    }
    
    
    
    //����
    public void click2(View v){
//    	//                                          ���ű���                                                   ���Ž���
//     	ScaleAnimation sa = new ScaleAnimation(0.5f, 2, 1, 3, iv.getWidth() / 2, iv.getHeight() / 2);
//                                                                 ���Ž��㣺      ����Լ���*0.5����*0.5     	
    	sa = new ScaleAnimation(0.5f, 2, 1, 3, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
     	sa.setDuration(2000);
    	sa.setRepeatCount(1);
    	sa.setRepeatMode(Animation.REVERSE);
    	//ֹͣΪ���״̬    
    	sa.setFillAfter(true);
    	iv.startAnimation(sa);
    }
    
    
    
    //͸��
    public void click3(View v){
    	//��  ȫ͸��  ��  ��ȫ��͸��
    	aa = new AlphaAnimation(0, 1);
    	aa.setDuration(2000);
    	iv.startAnimation(aa);
    }

    
    
    //��ת
    public void click4(View v){
//    	//                                 ��ת�Ƕȴ�  20��   ��    190��   ˳ʱ����ת            ��ת����ΪͼƬ���½�
//    	RotateAnimation ra = new RotateAnimation(20, 190, iv.getWidth(), iv.getHeight());
    	//                                    ��ת�Ƕȴ�  20��   ��    190��   ˳ʱ����ת            ��ת����ΪͼƬ����
    	ra = new RotateAnimation(20, 190, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
    	ra.setDuration(2000);
    	iv.startAnimation(ra);
    }
    
    
    
    
    //���ֹ�ͬ����
    public void click5(View v){
    	AnimationSet as = new AnimationSet(false);
    	as.addAnimation(aa);
    	as.addAnimation(ra);
    	as.addAnimation(sa);
    	as.addAnimation(ta);
    	
    	iv.startAnimation(as);
    	
    }
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
