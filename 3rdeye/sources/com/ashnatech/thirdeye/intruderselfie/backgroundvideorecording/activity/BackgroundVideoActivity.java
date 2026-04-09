package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import B2.l;
import B2.v;
import P7.s;
import U7.f;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import x2.AbstractActivityC5757a;

/* loaded from: classes.dex */
public class BackgroundVideoActivity extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static String f22044k = "record";

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f22045e;

    /* renamed from: f, reason: collision with root package name */
    public AppCompatButton f22046f;

    /* renamed from: g, reason: collision with root package name */
    public AppCompatButton f22047g;

    /* renamed from: h, reason: collision with root package name */
    public AppCompatTextView f22048h;
    public l i;

    /* renamed from: j, reason: collision with root package name */
    public Toolbar f22049j;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_background_video;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        e.f37006D.getClass();
        e.a.a().f37021k.s("background_video", new Bundle[0]);
        getSharedPreferences("PRIVATE", 0);
        this.f22045e = (AppCompatImageView) findViewById(R.id.record);
        this.f22046f = (AppCompatButton) findViewById(R.id.settings);
        this.f22047g = (AppCompatButton) findViewById(R.id.folder);
        this.f22049j = (Toolbar) findViewById(R.id.toolbar);
        this.f22048h = (AppCompatTextView) findViewById(R.id.home);
        this.f22045e.setOnClickListener(this);
        this.f22046f.setOnClickListener(this);
        this.f22047g.setOnClickListener(this);
        this.i = new l();
        m();
        this.f22048h.setTextColor(getColor(R.color.white));
        this.f22045e.setBackgroundTintList(getColorStateList(R.color.colorOrange));
        this.f22045e.setImageTintList(getColorStateList(R.color.white));
        n(this.i);
        this.f22049j.setTitle(R.string.video_recording);
    }

    public final void m() {
        this.f22046f.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22046f.setTextColor(getColor(R.color.colorTextSecond));
        this.f22047g.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22047g.setTextColor(getColor(R.color.colorTextSecond));
        this.f22048h.setTextColor(getColor(R.color.colorTextSecond));
        this.f22045e.setBackgroundTintList(getColorStateList(R.color.colorTextSecond));
        this.f22045e.setImageTintList(getColorStateList(R.color.colorTextSecond2));
    }

    public final void n(ComponentCallbacksC1759l componentCallbacksC1759l) {
        x supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1748a c1748a = new C1748a(supportFragmentManager);
        c1748a.d(componentCallbacksC1759l, R.id.container_fragment);
        c1748a.g(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (id == R.id.record) {
            if (f22044k.equals("record")) {
                return;
            }
            s sVar = new s(0L, 7);
            e.f37006D.getClass();
            ((f) e.a.a().f37035y.f1156b).f(this, sVar);
            m();
            f22044k = "record";
            this.f22049j.setTitle(R.string.video_recording);
            this.f22045e.setBackgroundTintList(getColorStateList(R.color.colorOrange));
            this.f22045e.setImageTintList(getColorStateList(R.color.white));
            this.f22048h.setTextColor(getColorStateList(R.color.white));
            n(new l());
            return;
        }
        if (id == R.id.settings) {
            if (f22044k.equals("settings")) {
                return;
            }
            s sVar2 = new s(0L, 7);
            e.f37006D.getClass();
            ((f) e.a.a().f37035y.f1156b).f(this, sVar2);
            m();
            f22044k = "settings";
            this.f22049j.setTitle(R.string.settings);
            this.f22046f.setCompoundDrawableTintList(getColorStateList(R.color.white));
            this.f22046f.setTextColor(getColor(R.color.white));
            this.f22048h.setTextColor(getColor(R.color.colorTextSecond));
            n(new v());
            return;
        }
        if (id != R.id.folder) {
            if (id == R.id.pro) {
                e.f37006D.getClass();
                e.a.a();
                e.j(this, "background_video_activity");
                return;
            }
            return;
        }
        if (f22044k.equals("folder")) {
            return;
        }
        s sVar3 = new s(0L, 7);
        e.f37006D.getClass();
        ((f) e.a.a().f37035y.f1156b).f(this, sVar3);
        m();
        f22044k = "folder";
        this.f22049j.setTitle(R.string.recorded_videos);
        this.f22047g.setCompoundDrawableTintList(getColorStateList(R.color.white));
        this.f22047g.setTextColor(getColor(R.color.white));
        this.f22048h.setTextColor(getColor(R.color.colorTextSecond));
        n(new B2.e());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f22044k = "record";
    }
}
