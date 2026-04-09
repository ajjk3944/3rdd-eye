package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Map;

/* loaded from: classes3.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private ImageView f13814a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f13815b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f13816c;

    /* renamed from: d, reason: collision with root package name */
    private String f13817d;

    /* renamed from: e, reason: collision with root package name */
    private String f13818e;

    /* renamed from: f, reason: collision with root package name */
    private String f13819f;

    /* renamed from: g, reason: collision with root package name */
    private int f13820g;

    /* renamed from: h, reason: collision with root package name */
    private int f13821h;

    /* renamed from: i, reason: collision with root package name */
    private int f13822i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f13823j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f13824k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f13825l;

    /* renamed from: m, reason: collision with root package name */
    private Animation f13826m;

    public class a implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13827a;

        public a(int i10) {
            this.f13827a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f13815b.setImageResource(this.f13827a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f13815b.setImageBitmap(bitmap);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13829a;

        public b(int i10) {
            this.f13829a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f13814a.setImageResource(this.f13829a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f13814a.setImageBitmap(bitmap);
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f13815b != null) {
                BaitClickView.this.f13815b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f13815b != null) {
                BaitClickView.this.f13815b.setVisibility(0);
            }
        }
    }

    public class d implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f13832a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f13815b != null) {
                    BaitClickView.this.f13815b.startAnimation(d.this.f13832a);
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f13814a != null) {
                    BaitClickView.this.f13814a.startAnimation(BaitClickView.this.f13823j);
                }
            }
        }

        public d(AnimationSet animationSet) {
            this.f13832a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    public class e implements Animation.AnimationListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f13814a != null) {
                    BaitClickView.this.f13814a.startAnimation(BaitClickView.this.f13823j);
                }
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13817d = "";
        this.f13818e = "";
        this.f13819f = "Click now for details";
        this.f13820g = 1;
        this.f13821h = 1342177280;
        this.f13822i = 0;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13823j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f13823j.setRepeatCount(-1);
        this.f13823j.setRepeatMode(2);
        ImageView imageView = this.f13814a;
        if (imageView != null) {
            imageView.startAnimation(this.f13823j);
        }
    }

    private void e() {
        ImageView imageView = this.f13815b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13823j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f13823j.setRepeatCount(1);
        this.f13823j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f13824k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f13824k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f13825l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f13825l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13824k);
        animationSet.addAnimation(this.f13825l);
        this.f13824k.setAnimationListener(new c());
        this.f13823j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f13814a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f13823j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f13819f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
        }
    }

    public void init(int i10) {
        this.f13820g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f13823j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f13824k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f13825l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f13826m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f13822i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        int i10 = this.f13820g;
        if (i10 == 2) {
            this.f13815b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f13815b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f13823j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f13823j.setRepeatCount(1);
        this.f13823j.setAnimationListener(new e());
        ImageView imageView = this.f13814a;
        if (imageView != null) {
            imageView.startAnimation(this.f13823j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f13823j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f13823j.setRepeatCount(-1);
        this.f13823j.setRepeatMode(2);
        ImageView imageView = this.f13814a;
        if (imageView != null) {
            imageView.startAnimation(this.f13823j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f13824k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f13824k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f13825l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f13825l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13824k);
        animationSet.addAnimation(this.f13825l);
        ImageView imageView2 = this.f13815b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f13826m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f13826m.setRepeatMode(2);
        this.f13826m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f13824k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f13824k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f13825l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f13825l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f13824k);
        animationSet.addAnimation(this.f13825l);
        ImageView imageView = this.f13814a;
        if (imageView != null) {
            imageView.startAnimation(this.f13826m);
        }
        ImageView imageView2 = this.f13815b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f13821h = i10;
        this.f13820g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f13821h = i10;
        this.f13820g = i11;
        this.f13817d = str;
        this.f13818e = str2;
        this.f13819f = str3;
        init();
    }

    public void init() {
        try {
            if (this.f13822i == 0) {
                setBackgroundColor(this.f13821h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f13821h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.f13822i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f13815b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f13815b.setLayoutParams(layoutParams);
            int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f13818e)) {
                this.f13815b.setImageResource(iA3);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f13817d, new a(iA3));
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f13814a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f13814a.setLayoutParams(layoutParams2);
            int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f13817d)) {
                this.f13814a.setImageResource(iA7);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f13817d, new b(iA7));
            }
            relativeLayout.addView(this.f13815b);
            relativeLayout.addView(this.f13814a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f13816c = new TextView(getContext());
            this.f13816c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f13816c.setText(this.f13819f);
            this.f13816c.setTextColor(-1);
            this.f13816c.setGravity(14);
            linearLayout.addView(this.f13816c);
            addView(linearLayout);
        } catch (Throwable th) {
            q0.b("BaitClickView", th.getMessage());
        }
    }
}
