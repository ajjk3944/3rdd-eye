package com.bytedance.sdk.component.adexpress.ycc;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yzg extends LinearLayout {
    private TextView bw;
    private com.bytedance.sdk.component.utils.ee dg;
    private TextView emc;
    private int gbl;
    private LinearLayout msw;
    private int ru;
    private JSONObject sup;
    private emc uym;
    private ImageView xq;
    private TextView ycc;
    private TextView ypw;
    private int zz;

    /* renamed from: com.bytedance.sdk.component.adexpress.ycc.yzg$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (yzg.this.xq != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new ypw(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.yzg.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        yzg.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ycc.yzg.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                yzg.this.xq.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                yzg.this.xq.startAnimation(rotateAnimation);
            }
        }
    }

    public interface emc {
    }

    public static class ypw implements Interpolator {
        private ypw() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ ypw(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public yzg(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.zz = i10;
        this.ru = i11;
        this.gbl = i12;
        this.sup = jSONObject;
        emc(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.msw;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.dg == null) {
                this.dg = new com.bytedance.sdk.component.utils.ee(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ycc.yzg.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void setOnShakeViewListener(emc emcVar) {
        this.uym = emcVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.bw.setText(str);
        } else {
            this.bw.setVisibility(8);
            this.ycc.setVisibility(8);
        }
    }

    public void emc(Context context, View view) {
        addView(view);
        this.msw = (LinearLayout) findViewById(2097610727);
        this.xq = (ImageView) findViewById(2097610725);
        this.emc = (TextView) findViewById(2097610724);
        this.ypw = (TextView) findViewById(2097610726);
        this.bw = (TextView) findViewById(2097610723);
        this.ycc = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.msw.setBackground(gradientDrawable);
    }

    public void emc() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
