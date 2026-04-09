package com.bytedance.sdk.component.adexpress.le;

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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class th extends LinearLayout {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f7352cf;
    private TextView fkw;

    /* renamed from: le, reason: collision with root package name */
    private TextView f7353le;

    /* renamed from: lh, reason: collision with root package name */
    private ImageView f7354lh;
    private TextView ouw;
    private LinearLayout pno;
    private ouw ra;
    private JSONObject ryl;
    private int tlj;
    private TextView vt;
    private com.bytedance.sdk.component.utils.ex yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.adexpress.le.th$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (th.this.f7354lh != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new vt((byte) 0));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        th.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.th.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                th.this.f7354lh.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                th.this.f7354lh.startAnimation(rotateAnimation);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements Interpolator {
        private vt() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    public th(Context context, View view, int i4, int i10, int i11, JSONObject jSONObject) {
        super(context);
        this.bly = i4;
        this.tlj = i10;
        this.f7352cf = i11;
        this.ryl = jSONObject;
        ouw(view);
    }

    public LinearLayout getShakeLayout() {
        return this.pno;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.yu == null) {
                getContext().getApplicationContext();
                this.yu = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.th.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(ouw ouwVar) {
        this.ra = ouwVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.fkw.setText(str);
        } else {
            this.fkw.setVisibility(8);
            this.f7353le.setVisibility(8);
        }
    }

    public void ouw(View view) {
        addView(view);
        this.pno = (LinearLayout) findViewById(2097610727);
        this.f7354lh = (ImageView) findViewById(2097610725);
        this.ouw = (TextView) findViewById(2097610724);
        this.vt = (TextView) findViewById(2097610726);
        this.fkw = (TextView) findViewById(2097610723);
        this.f7353le = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.pno.setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
    }
}
