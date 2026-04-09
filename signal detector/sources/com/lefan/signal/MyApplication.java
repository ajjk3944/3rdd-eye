package com.lefan.signal;

import F4.d;
import R2.a;
import Z3.c;
import a.AbstractC0241a;
import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.I;
import com.bumptech.glide.e;
import com.lefan.signal.activity.SplashActivity;
import d4.h;
import h.k;
import p4.C2777d;
import x4.C3005a;

/* loaded from: classes.dex */
public final class MyApplication extends Application {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f18812d;

    /* renamed from: e, reason: collision with root package name */
    public static SplashActivity f18813e;

    /* renamed from: f, reason: collision with root package name */
    public static c f18814f;

    /* renamed from: g, reason: collision with root package name */
    public static C2777d f18815g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f18816h;
    public static MyApplication i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f18817j = 0;

    /* renamed from: a, reason: collision with root package name */
    public Activity f18818a;

    /* renamed from: b, reason: collision with root package name */
    public long f18819b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18820c;

    public final void a() {
        super.onCreate();
        i = this;
        c cVar = new c();
        cVar.f4532c = this;
        f18814f = cVar;
        f18815g = new C2777d(this);
        C3005a c3005a = new C3005a();
        h hVar = new h(13, this);
        registerActivityLifecycleCallbacks(c3005a);
        I.i.f5191f.a(c3005a);
        c3005a.f24184b = hVar;
    }

    @Override // android.app.Application
    public final void onCreate() {
        a();
        k.p(getSharedPreferences("sp", 0).getInt("my_mode", -1));
        a.f3390d = e.k(this, "number_locale", true);
        d.f1456a = this;
        AbstractC0241a.f4542b = new A0.e(6, this);
    }
}
