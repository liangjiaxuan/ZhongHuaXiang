package com.rongwei.zhonghuaxiang;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.rongwei.zhonghuaxiang.fragment.SmallCollectionFragment;
import com.rongwei.zhonghuaxiang.fragment.SmallCuteFragment;
import com.rongwei.zhonghuaxiang.fragment.SmallSurpriseFragment;

import static com.rongwei.zhonghuaxiang.R.id.radioButton1;
import static com.rongwei.zhonghuaxiang.R.id.rl_contain;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rgMain;
    private RadioButton radioButton1;
    private Fragment currentFragment;
    private SmallSurpriseFragment smallSurpriseFragment;
    private SmallCollectionFragment smallCollectionFragment;
    private SmallCuteFragment smallCuteFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgMain = (RadioGroup) findViewById(R.id.rg_main);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        rgMain.setOnCheckedChangeListener(this);
        smallSurpriseFragment =new SmallSurpriseFragment();
        currentFragment=smallSurpriseFragment;
        radioButton1.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.radioButton1:
                if (smallSurpriseFragment==null) {
                    smallSurpriseFragment=new SmallSurpriseFragment();
                }
                switchFragment(smallSurpriseFragment);
                break;
            case R.id.radioButton2:
                if (smallCollectionFragment==null) {
                    smallCollectionFragment=new SmallCollectionFragment();
                }
                switchFragment(smallCollectionFragment);
                break;
            case R.id.radioButton3:
                if (smallCuteFragment==null) {
                    smallCuteFragment=new SmallCuteFragment();
                }
                switchFragment(smallCuteFragment);
                break;

        }
    }

    private void switchFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (fragment == currentFragment) {
            if (!fragment.isAdded()) {
                transaction.add(R.id.rl_contain,fragment).show(fragment).commit();
            }
        } else {
            if (!fragment.isAdded()) {
                transaction.add(R.id.rl_contain, fragment).hide(currentFragment).show(fragment).commit();
            } else {
                transaction.hide(currentFragment).show(fragment).commit();
            }
        }
        currentFragment=fragment;
    }
}
