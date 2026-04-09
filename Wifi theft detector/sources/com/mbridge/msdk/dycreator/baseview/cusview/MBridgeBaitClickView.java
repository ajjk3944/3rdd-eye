package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* loaded from: classes3.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f14276a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f14277b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f14278c;

    /* renamed from: d, reason: collision with root package name */
    private String f14279d;

    /* renamed from: e, reason: collision with root package name */
    private String f14280e;

    /* renamed from: f, reason: collision with root package name */
    private String f14281f;

    /* renamed from: g, reason: collision with root package name */
    private int f14282g;

    /* renamed from: h, reason: collision with root package name */
    private int f14283h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f14284i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f14285j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f14286k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f14287l;

    public MBridgeBaitClickView(@NonNull Context context) {
        super(context);
        this.f14279d = "";
        this.f14280e = "";
        this.f14281f = "Click now for details";
        this.f14282g = 1;
        this.f14283h = 1342177280;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f14284i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f14284i.setRepeatCount(-1);
        this.f14284i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f14276a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f14284i);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f14277b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f14284i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f14284i.setRepeatCount(1);
        this.f14284i.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f14285j = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f14285j.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f14286k = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f14286k.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f14285j);
        animationSet.addAnimation(this.f14286k);
        this.f14285j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f14277b != null) {
                    MBridgeBaitClickView.this.f14277b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f14277b != null) {
                    MBridgeBaitClickView.this.f14277b.setVisibility(0);
                }
            }
        });
        this.f14284i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f14276a != null) {
                            MBridgeBaitClickView.this.f14276a.startAnimation(MBridgeBaitClickView.this.f14284i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f14277b != null) {
                            MBridgeBaitClickView.this.f14277b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f14276a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f14284i);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f14281f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public void init(int i10) {
        this.f14282g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f14284i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f14285j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f14286k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f14287l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f14282g;
        if (i10 == 2) {
            this.f14277b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f14277b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f14284i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f14284i.setRepeatCount(1);
        this.f14284i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f14276a != null) {
                            MBridgeBaitClickView.this.f14276a.startAnimation(MBridgeBaitClickView.this.f14284i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f14276a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f14284i);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f14284i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f14284i.setRepeatCount(-1);
        this.f14284i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f14276a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f14284i);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f14285j = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f14285j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f14286k = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f14286k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f14285j);
        animationSet.addAnimation(this.f14286k);
        MBridgeDyImageView mBridgeDyImageView2 = this.f14277b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f14287l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f14287l.setRepeatMode(2);
        this.f14287l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f14285j = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f14285j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f14286k = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f14286k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f14285j);
        animationSet.addAnimation(this.f14286k);
        MBridgeDyImageView mBridgeDyImageView = this.f14276a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f14287l);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f14277b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f14283h = i10;
        this.f14282g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f14283h = i10;
        this.f14282g = i11;
        this.f14279d = str;
        this.f14280e = str2;
        this.f14281f = str3;
        init();
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14279d = "";
        this.f14280e = "";
        this.f14281f = "Click now for details";
        this.f14282g = 1;
        this.f14283h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f14283h);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f14277b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f14277b.setLayoutParams(layoutParams);
            final int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f14280e)) {
                this.f14277b.setImageResource(iA3);
            } else {
                b.a(c.n().d()).a(this.f14279d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f14277b.setImageResource(iA3);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f14277b.setImageBitmap(bitmap);
                    }
                });
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f14276a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f14276a.setLayoutParams(layoutParams2);
            final int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f14279d)) {
                this.f14276a.setImageResource(iA7);
            } else {
                b.a(c.n().d()).a(this.f14279d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f14276a.setImageResource(iA7);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f14276a.setImageBitmap(bitmap);
                    }
                });
            }
            relativeLayout.addView(this.f14277b);
            relativeLayout.addView(this.f14276a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f14278c = new TextView(getContext());
            this.f14278c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f14278c.setText(this.f14281f);
            this.f14278c.setTextColor(-1);
            this.f14278c.setGravity(14);
            linearLayout.addView(this.f14278c);
            addView(linearLayout);
        } catch (Throwable th) {
            q0.b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14279d = "";
        this.f14280e = "";
        this.f14281f = "Click now for details";
        this.f14282g = 1;
        this.f14283h = 1342177280;
    }

    @RequiresApi(api = 21)
    public MBridgeBaitClickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f14279d = "";
        this.f14280e = "";
        this.f14281f = "Click now for details";
        this.f14282g = 1;
        this.f14283h = 1342177280;
    }
}
