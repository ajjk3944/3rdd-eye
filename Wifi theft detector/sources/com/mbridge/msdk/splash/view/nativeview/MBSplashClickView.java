package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.v0;

/* loaded from: classes3.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: a, reason: collision with root package name */
    private final String f17425a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17426b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17427c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17428d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17429e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17430f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17431g;

    /* renamed from: h, reason: collision with root package name */
    private final String f17432h;

    /* renamed from: i, reason: collision with root package name */
    private final String f17433i;

    /* renamed from: j, reason: collision with root package name */
    private final String f17434j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17435k;

    /* renamed from: l, reason: collision with root package name */
    private String f17436l;

    /* renamed from: m, reason: collision with root package name */
    private int f17437m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f17438n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f17439o;

    /* renamed from: p, reason: collision with root package name */
    private final RectF f17440p;

    /* renamed from: q, reason: collision with root package name */
    private final Paint f17441q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f17442r;

    public class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f17443a;

        /* renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        public class RunnableC0322a implements Runnable {
            public RunnableC0322a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f17439o.startAnimation(a.this.f17443a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f17443a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f17439o.setVisibility(4);
            MBSplashClickView.this.f17439o.postDelayed(new RunnableC0322a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f17439o.setVisibility(0);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f17446a;

        public b(ScaleAnimation scaleAnimation) {
            this.f17446a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f17439o.startAnimation(this.f17446a);
        }
    }

    public class c implements Animation.AnimationListener {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f17449a;

            public a(Animation animation) {
                this.f17449a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f17438n.startAnimation(this.f17449a);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f17438n.setVisibility(4);
            MBSplashClickView.this.f17438n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f17438n.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f17425a = "浏览第三方应用";
        this.f17426b = "View";
        this.f17427c = "打开第三方应用";
        this.f17428d = "Open";
        this.f17429e = "下载第三方应用";
        this.f17430f = "Install";
        this.f17431g = "mbridge_splash_btn_arrow_right";
        this.f17432h = "mbridge_splash_btn_circle";
        this.f17433i = "mbridge_splash_btn_finger";
        this.f17434j = "mbridge_splash_btn_go";
        this.f17435k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f17440p = new RectF();
        this.f17441q = new Paint();
        this.f17442r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f17439o.setVisibility(4);
        this.f17438n.startAnimation(scaleAnimation);
        this.f17439o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f17438n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f17438n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f17440p, this.f17442r, 31);
        canvas.drawRoundRect(this.f17440p, 200.0f, 200.0f, this.f17442r);
        canvas.saveLayer(this.f17440p, this.f17441q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f17436l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f17437m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f17440p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f17441q.setAntiAlias(true);
        this.f17441q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f17442r.setAntiAlias(true);
        this.f17442r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.f17436l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f17436l)) {
                this.f17436l = zContains ? "浏览第三方应用" : "View";
            }
            this.f17437m = 2;
        }
        setBgDrawable(this.f17437m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f17436l);
        this.f17438n = new ImageView(getContext());
        int i10 = this.f17437m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f17439o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f17439o.setLayoutParams(layoutParams4);
            this.f17439o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f17439o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f17438n.setLayoutParams(layoutParams);
        this.f17438n.setImageResource(identifier);
        addView(textView);
        addView(this.f17438n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f17437m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f17437m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f17437m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17425a = "浏览第三方应用";
        this.f17426b = "View";
        this.f17427c = "打开第三方应用";
        this.f17428d = "Open";
        this.f17429e = "下载第三方应用";
        this.f17430f = "Install";
        this.f17431g = "mbridge_splash_btn_arrow_right";
        this.f17432h = "mbridge_splash_btn_circle";
        this.f17433i = "mbridge_splash_btn_finger";
        this.f17434j = "mbridge_splash_btn_go";
        this.f17435k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f17440p = new RectF();
        this.f17441q = new Paint();
        this.f17442r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17425a = "浏览第三方应用";
        this.f17426b = "View";
        this.f17427c = "打开第三方应用";
        this.f17428d = "Open";
        this.f17429e = "下载第三方应用";
        this.f17430f = "Install";
        this.f17431g = "mbridge_splash_btn_arrow_right";
        this.f17432h = "mbridge_splash_btn_circle";
        this.f17433i = "mbridge_splash_btn_finger";
        this.f17434j = "mbridge_splash_btn_go";
        this.f17435k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f17440p = new RectF();
        this.f17441q = new Paint();
        this.f17442r = new Paint();
        a();
    }

    @RequiresApi(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f17425a = "浏览第三方应用";
        this.f17426b = "View";
        this.f17427c = "打开第三方应用";
        this.f17428d = "Open";
        this.f17429e = "下载第三方应用";
        this.f17430f = "Install";
        this.f17431g = "mbridge_splash_btn_arrow_right";
        this.f17432h = "mbridge_splash_btn_circle";
        this.f17433i = "mbridge_splash_btn_finger";
        this.f17434j = "mbridge_splash_btn_go";
        this.f17435k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f17440p = new RectF();
        this.f17441q = new Paint();
        this.f17442r = new Paint();
    }
}
