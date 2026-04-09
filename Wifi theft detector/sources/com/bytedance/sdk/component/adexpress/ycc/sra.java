package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class sra extends RelativeLayout {
    private TextView bw;
    private TextView dg;
    private ImageView emc;
    private int gbl;
    private AnimatorSet msw;
    private String ru;
    private AnimatorSet uym;
    private ImageView xq;
    private AnimatorSet ycc;
    private ImageView ypw;
    private AnimatorSet zz;

    public sra(Context context) {
        super(context);
        this.ycc = new AnimatorSet();
        this.uym = new AnimatorSet();
        this.msw = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.gbl = 100;
        emc(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.ycc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ypw();
    }

    public void setGuideText(String str) {
        TextView textView = this.dg;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.bw != null) {
            if (TextUtils.isEmpty(str)) {
                this.bw.setText("");
            } else {
                this.bw.setText(str);
            }
        }
    }

    public void xq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.emc, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.emc, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.emc, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), -this.gbl));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), this.gbl));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.sra.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (sra.this.xq != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) sra.this.xq.getLayoutParams();
                    layoutParams.height = num.intValue();
                    sra.this.xq.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.xq, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.xq, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.ypw, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ypw, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.ypw, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.ypw, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.ypw, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), -this.gbl));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.uym.setDuration(50L);
        this.zz.setDuration(1500L);
        this.msw.setDuration(50L);
        this.uym.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.msw.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.zz.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.ycc.playSequentially(this.msw, this.zz, this.uym);
    }

    public void emc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.dg.emc();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.ru)) {
            addView(com.bytedance.sdk.component.adexpress.xq.emc.ycc(context));
            this.gbl = (int) (this.gbl * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.xq.emc.bw(context));
        }
        this.emc = (ImageView) findViewById(2097610734);
        this.ypw = (ImageView) findViewById(2097610735);
        this.dg = (TextView) findViewById(2097610730);
        this.xq = (ImageView) findViewById(2097610733);
        this.bw = (TextView) findViewById(2097610731);
    }

    public void ypw() {
        try {
            AnimatorSet animatorSet = this.ycc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.msw;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.uym;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.zz;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public sra(Context context, String str) {
        super(context);
        this.ycc = new AnimatorSet();
        this.uym = new AnimatorSet();
        this.msw = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.gbl = 100;
        setClipChildren(false);
        this.ru = str;
        emc(context);
    }

    public void emc() {
        xq();
        this.ycc.start();
        this.ycc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.ycc.sra.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                sra.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.sra.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sra.this.ycc.start();
                    }
                }, 200L);
            }
        });
    }
}
