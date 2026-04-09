package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import B0.g;
import B2.B;
import B2.i;
import P7.s;
import U7.f;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import x2.AbstractActivityC5757a;

/* loaded from: classes.dex */
public class SelfieIntruderActivity extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public static String f22107j = "photos";

    /* renamed from: e, reason: collision with root package name */
    public i f22108e;

    /* renamed from: f, reason: collision with root package name */
    public Button f22109f;

    /* renamed from: g, reason: collision with root package name */
    public Button f22110g;

    /* renamed from: h, reason: collision with root package name */
    public Button f22111h;
    public Toolbar i;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_selfie_intruder;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() {
        e.f37006D.getClass();
        e.a.a().f37021k.s("third_eye", new Bundle[0]);
        getSharedPreferences("PRIVATE", 0).edit().putInt("FLAG", 0).apply();
        this.f22109f = (Button) findViewById(R.id.photos);
        this.f22110g = (Button) findViewById(R.id.settings);
        this.f22111h = (Button) findViewById(R.id.history);
        this.i = (Toolbar) findViewById(R.id.toolbar);
        this.f22108e = new i();
        m();
        Button button = this.f22109f;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        button.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(resources, R.drawable.ic_gallery_fill, null), (Drawable) null, (Drawable) null);
        this.f22109f.setCompoundDrawableTintList(getColorStateList(R.color.white));
        this.f22109f.setTextColor(g.b.a(getResources(), R.color.white, null));
        n(this.f22108e);
        this.i.setTitle(getResources().getString(R.string.photo_log));
        this.f22109f.setOnClickListener(this);
        this.f22110g.setOnClickListener(this);
        this.f22111h.setOnClickListener(this);
        findViewById(R.id.back).setOnClickListener(this);
    }

    public final void m() {
        this.f22110g.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22109f.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        this.f22111h.setCompoundDrawableTintList(getColorStateList(R.color.colorTextSecond));
        Button button = this.f22110g;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        button.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(resources, R.drawable.ic_setting, null), (Drawable) null, (Drawable) null);
        this.f22109f.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(getResources(), R.drawable.ic_gallery, null), (Drawable) null, (Drawable) null);
        this.f22111h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(getResources(), R.drawable.ic_clock, null), (Drawable) null, (Drawable) null);
        this.f22110g.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
        this.f22109f.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
        this.f22111h.setTextColor(g.b.a(getResources(), R.color.colorTextSecond, null));
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
        switch (view.getId()) {
            case R.id.back /* 2131361972 */:
                onBackPressed();
                break;
            case R.id.history /* 2131362268 */:
                if (!f22107j.equals("history")) {
                    s sVar = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar);
                    m();
                    f22107j = "history";
                    this.i.setTitle(R.string.unlock_history);
                    Button button = this.f22111h;
                    Resources resources = getResources();
                    ThreadLocal<TypedValue> threadLocal = g.f359a;
                    button.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(resources, R.drawable.ic_clock_fill, null), (Drawable) null, (Drawable) null);
                    this.f22111h.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    this.f22111h.setTextColor(g.b.a(getResources(), R.color.white, null));
                    n(new B2.f());
                    break;
                }
                break;
            case R.id.photos /* 2131362580 */:
                if (!f22107j.equals("photos")) {
                    s sVar2 = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar2);
                    m();
                    f22107j = "photos";
                    this.i.setTitle(R.string.photo_log);
                    Button button2 = this.f22109f;
                    Resources resources2 = getResources();
                    ThreadLocal<TypedValue> threadLocal2 = g.f359a;
                    button2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(resources2, R.drawable.ic_gallery_fill, null), (Drawable) null, (Drawable) null);
                    this.f22109f.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    this.f22109f.setTextColor(g.b.a(getResources(), R.color.white, null));
                    n(new i());
                    break;
                }
                break;
            case R.id.pro /* 2131362603 */:
                e.f37006D.getClass();
                e.a.a();
                e.j(this, "selfie_intruder_activity");
                break;
            case R.id.settings /* 2131362691 */:
                if (!f22107j.equals("settings")) {
                    s sVar3 = new s(0L, 7);
                    e.f37006D.getClass();
                    ((f) e.a.a().f37035y.f1156b).f(this, sVar3);
                    m();
                    f22107j = "settings";
                    this.i.setTitle(R.string.settings);
                    Button button3 = this.f22110g;
                    Resources resources3 = getResources();
                    ThreadLocal<TypedValue> threadLocal3 = g.f359a;
                    button3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, g.a.a(resources3, R.drawable.ic_settings_fill, null), (Drawable) null, (Drawable) null);
                    this.f22110g.setCompoundDrawableTintList(getColorStateList(R.color.white));
                    this.f22110g.setTextColor(g.b.a(getResources(), R.color.white, null));
                    n(new B());
                    break;
                }
                break;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f22107j = "photos";
    }
}
