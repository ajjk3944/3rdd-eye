package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ax {

    /* renamed from: h, reason: collision with root package name */
    public final String f9470h;

    /* renamed from: i, reason: collision with root package name */
    public final ya.c0 f9471i;

    /* renamed from: a, reason: collision with root package name */
    public long f9464a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f9465b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f9466c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f9467d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f9468e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9469f = new Object();
    public final Object g = new Object();
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9472k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f9473l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9474m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f9475n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f9476o = new HashMap();

    public ax(String str, ya.c0 c0Var) {
        this.f9470h = str;
        this.f9471i = c0Var;
    }

    public final void a() {
        synchronized (this.f9469f) {
            this.j++;
        }
    }

    public final void b() {
        synchronized (this.f9469f) {
            this.f9472k++;
        }
    }

    public final void c() {
        synchronized (this.f9469f) {
            this.f9473l++;
        }
    }

    public final int d() {
        int i4;
        synchronized (this.f9469f) {
            i4 = this.f9473l;
        }
        return i4;
    }

    public final void e(va.z2 z2Var, long j) {
        Bundle bundle;
        synchronized (this.f9469f) {
            try {
                ya.c0 c0Var = this.f9471i;
                long jT = c0Var.t();
                ua.j.C.f35267k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f9465b == -1) {
                    if (jCurrentTimeMillis - jT > ((Long) va.s.f36163e.f36166c.a(sk.f16315s1)).longValue()) {
                        this.f9467d = -1;
                    } else {
                        this.f9467d = c0Var.v();
                    }
                    this.f9465b = j;
                    this.f9464a = j;
                } else {
                    this.f9464a = j;
                }
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16239n4)).booleanValue() || (bundle = z2Var.f36190c) == null || bundle.getInt("gw", 2) != 1) {
                    this.f9466c++;
                    int i4 = this.f9467d + 1;
                    this.f9467d = i4;
                    if (i4 == 0) {
                        this.f9468e = 0L;
                        c0Var.w(jCurrentTimeMillis);
                    } else {
                        this.f9468e = jCurrentTimeMillis - c0Var.x();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle f(Context context, String str) {
        Bundle bundle;
        synchronized (this.f9469f) {
            try {
                bundle = new Bundle();
                if (!this.f9471i.E()) {
                    bundle.putString("session_id", this.f9470h);
                }
                bundle.putLong("basets", this.f9465b);
                bundle.putLong("currts", this.f9464a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f9466c);
                bundle.putInt("preqs_in_session", this.f9467d);
                bundle.putLong("time_in_session", this.f9468e);
                bundle.putInt("pclick", this.j);
                bundle.putInt("pimp", this.f9472k);
                int i4 = qu.f15446a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z3 = false;
                if (identifier == 0) {
                    za.i.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z3 = true;
                        } else {
                            za.i.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        za.i.h("Fail to fetch AdActivity theme");
                        za.i.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z3);
                bundle.putInt("consent_form_action_identifier", d());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final void g() {
        if (((Boolean) bm.f9713a.u()).booleanValue()) {
            synchronized (this.f9469f) {
                this.f9466c--;
                this.f9467d--;
            }
        }
    }
}
