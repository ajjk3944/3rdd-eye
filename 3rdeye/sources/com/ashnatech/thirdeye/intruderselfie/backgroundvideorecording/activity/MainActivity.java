package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import A2.l;
import B0.g;
import I2.m;
import J4.h;
import S5.f;
import S5.k;
import S5.p;
import android.app.Dialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.DetectorActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.BackgroundPermissions;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.receiver.AdminReceiver;
import com.google.gson.internal.c;
import com.zipoapps.premiumhelper.e;
import e8.d;
import x2.AbstractActivityC5757a;
import x2.n;
import x2.o;
import z0.C5848a;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public DevicePolicyManager f22087e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f22088f;

    /* renamed from: g, reason: collision with root package name */
    public Dialog f22089g;

    /* renamed from: h, reason: collision with root package name */
    public Dialog f22090h;
    public LottieAnimationView i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f22091j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f22092k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f22093l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f22094m;

    /* renamed from: n, reason: collision with root package name */
    public ConstraintLayout f22095n;

    /* renamed from: o, reason: collision with root package name */
    public f f22096o;

    /* renamed from: p, reason: collision with root package name */
    public d f22097p;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l.r();
            MainActivity mainActivity = MainActivity.this;
            f fVar = mainActivity.f22096o;
            ImageView anchor = mainActivity.f22094m;
            fVar.getClass();
            kotlin.jvm.internal.l.f(anchor, "anchor");
            p pVar = new p(anchor, k.TOP);
            View view = pVar.f11988a;
            if (fVar.b(view)) {
                view.post(new h(fVar, view, pVar, 1));
            }
        }
    }

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_main;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        e.f37006D.getClass();
        e.a.a().f37021k.s("main_screen", new Bundle[0]);
        this.f22097p = new d(this, "android.permission.CAMERA");
        this.f47640d = new m(this);
        this.f22087e = (DevicePolicyManager) getSystemService("device_policy");
        this.f22088f = new ComponentName(this, (Class<?>) AdminReceiver.class);
        AbstractActivityC5757a abstractActivityC5757a = this.f47639c;
        f.a aVar = new f.a(abstractActivityC5757a);
        aVar.f11950j = c.y(TypedValue.applyDimension(1, 10, Resources.getSystem().getDisplayMetrics()));
        S5.a value = S5.a.TOP;
        kotlin.jvm.internal.l.f(value, "value");
        aVar.f11954n = value;
        S5.c value2 = S5.c.ALIGN_BALLOON;
        kotlin.jvm.internal.l.f(value2, "value");
        aVar.f11952l = value2;
        aVar.f11951k = 0.5f;
        aVar.f11942a = c.y(TypedValue.applyDimension(1, RecyclerView.UNDEFINED_DURATION, Resources.getSystem().getDisplayMetrics()));
        aVar.f11944c = c.y(TypedValue.applyDimension(1, 55, Resources.getSystem().getDisplayMetrics()));
        aVar.f11961u = 13.0f;
        aVar.f11957q = TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics());
        aVar.f11928C = 2000L;
        aVar.f11964x = 1.0f;
        float f10 = 5;
        aVar.f11945d = c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
        aVar.f11946e = c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
        aVar.f11947f = c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
        aVar.f11948g = c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
        String value3 = getString(R.string.active_now);
        kotlin.jvm.internal.l.f(value3, "value");
        aVar.f11958r = value3;
        aVar.f11959s = C5848a.getColor(this.f47639c, R.color.white);
        aVar.f11960t = true;
        aVar.f11956p = C5848a.getColor(this.f47639c, R.color.acceptColor);
        S5.l value4 = S5.l.OVERSHOOT;
        kotlin.jvm.internal.l.f(value4, "value");
        aVar.f11932G = value4;
        if (value4 == S5.l.CIRCULAR) {
            aVar.f11939N = false;
        }
        this.f22096o = new f(abstractActivityC5757a, aVar);
        l.r();
        this.f22095n = (ConstraintLayout) findViewById(R.id.selfie);
        this.f22095n.setOnClickListener(this);
        findViewById(R.id.settings).setOnClickListener(this);
        findViewById(R.id.background_video).setOnClickListener(this);
        findViewById(R.id.infrared_camera).setOnClickListener(this);
        findViewById(R.id.wireless_camera).setOnClickListener(this);
        findViewById(R.id.object_detector).setOnClickListener(this);
        findViewById(R.id.tips_tricks).setOnClickListener(this);
        this.f22091j = (TextView) findViewById(R.id.third_eye_activated);
        this.f22092k = (ImageView) findViewById(R.id.eye);
        this.i = (LottieAnimationView) findViewById(R.id.pro);
        this.f22093l = (TextView) findViewById(R.id.count);
        this.f22094m = (ImageView) findViewById(R.id.notification);
        this.i.setOnClickListener(this);
        if (I2.a.b(this) && C5848a.checkSelfPermission(this, "android.permission.CAMERA") == 0 && this.f22087e.isAdminActive(this.f22088f)) {
            m();
        }
        if (PermissionProcessBar.f22190r) {
            new Handler().postDelayed(new a(), 2000L);
            ImageView imageView = this.f22094m;
            RotateAnimation rotateAnimation = new RotateAnimation(-5.0f, 5.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(5000L);
            rotateAnimation.setStartOffset(10L);
            rotateAnimation.setRepeatMode(2);
            rotateAnimation.setInterpolator(new CycleInterpolator(20.0f));
            imageView.startAnimation(rotateAnimation);
            m();
            PermissionProcessBar.f22190r = false;
        }
    }

    public final void m() {
        this.f22091j.setText(R.string.activated);
        TextView textView = this.f22091j;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        textView.setTextColor(g.b.a(resources, R.color.white, null));
        this.f22092k.setImageResource(R.drawable.ic_eye_solid);
        this.f22094m.setImageTintList(getColorStateList(R.color.white));
    }

    public final void n(ImageView imageView) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (int) ((getResources().getDisplayMetrics().density * 158.0f) + 0.5f), 0.0f, 0.0f);
        translateAnimation.setDuration(1200L);
        translateAnimation.setRepeatCount(12);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setAnimationListener(new b());
        imageView.startAnimation(translateAnimation);
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        if (i == 111 && Settings.canDrawOverlays(this)) {
            startActivity(new Intent(this, (Class<?>) SelfieIntruderActivity.class));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.background_video /* 2131361974 */:
                if (!I2.a.b(this) || C5848a.checkSelfPermission(this, "android.permission.CAMERA") != 0 || C5848a.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
                    startActivity(new Intent(this, (Class<?>) BackgroundPermissions.class));
                    break;
                } else {
                    startActivity(new Intent(this, (Class<?>) BackgroundVideoActivity.class));
                    break;
                }
            case R.id.infrared_camera /* 2131362319 */:
                Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
                this.f22089g = dialog;
                dialog.setContentView(R.layout.infrared_dialog);
                n((ImageView) this.f22089g.findViewById(R.id.device));
                this.f22089g.findViewById(R.id.ok).setOnClickListener(new o(this));
                this.f22089g.findViewById(R.id.close).setOnClickListener(new x2.p(this));
                this.f22089g.show();
                break;
            case R.id.object_detector /* 2131362527 */:
                startActivity(new Intent(this, (Class<?>) DetectorActivity.class));
                break;
            case R.id.pro /* 2131362603 */:
                e.f37006D.getClass();
                e.a.a();
                e.j(this, "main");
                break;
            case R.id.selfie /* 2131362690 */:
                if (!I2.a.b(this) || C5848a.checkSelfPermission(this, "android.permission.CAMERA") != 0 || !this.f22087e.isAdminActive(this.f22088f)) {
                    startActivity(new Intent(this, (Class<?>) PermissionProcessBar.class));
                    break;
                } else {
                    startActivity(new Intent(this, (Class<?>) SelfieIntruderActivity.class));
                    break;
                }
            case R.id.settings /* 2131362691 */:
                startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
                finish();
                break;
            case R.id.tips_tricks /* 2131362817 */:
                startActivity(new Intent(this, (Class<?>) TricksActivity.class));
                break;
            case R.id.wireless_camera /* 2131362907 */:
                Dialog dialog2 = new Dialog(this, R.style.Theme_Dialog);
                this.f22090h = dialog2;
                dialog2.setContentView(R.layout.wireless_dialog);
                n((ImageView) this.f22090h.findViewById(R.id.device));
                this.f22090h.findViewById(R.id.ok).setOnClickListener(new x2.m(this));
                this.f22090h.findViewById(R.id.close).setOnClickListener(new n(this));
                this.f22090h.show();
                break;
        }
    }

    @Override // x2.AbstractActivityC5757a, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        e.f37006D.getClass();
        if (e.a.a().i.j()) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
        }
        this.f22093l = (TextView) findViewById(R.id.count);
        if (this.f47640d.f2429a.getInt("FLAG", 0) == 0) {
            this.f22093l.setVisibility(8);
        } else {
            this.f22093l.setVisibility(0);
        }
        this.f22093l.setText(this.f47640d.f2429a.getInt("FLAG", 0) + "");
    }

    public class b implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) throws InterruptedException {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
