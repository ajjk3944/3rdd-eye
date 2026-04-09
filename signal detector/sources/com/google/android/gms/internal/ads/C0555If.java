package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import q2.C2841s;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.If, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555If {

    /* renamed from: h, reason: collision with root package name */
    public final String f9114h;
    public final C2909E i;

    /* renamed from: a, reason: collision with root package name */
    public long f9107a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f9108b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f9109c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f9110d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f9111e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9112f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f9113g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public int f9115j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9116k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f9117l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9118m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f9119n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f9120o = new HashMap();

    public C0555If(String str, C2909E c2909e) {
        this.f9114h = str;
        this.i = c2909e;
    }

    public final void a() {
        synchronized (this.f9112f) {
            this.f9115j++;
        }
    }

    public final void b() {
        synchronized (this.f9112f) {
            this.f9116k++;
        }
    }

    public final void c() {
        synchronized (this.f9112f) {
            this.f9117l++;
        }
    }

    public final int d() {
        int i;
        synchronized (this.f9112f) {
            i = this.f9117l;
        }
        return i;
    }

    public final void e(q2.a1 a1Var, long j6) {
        Bundle bundle;
        synchronized (this.f9112f) {
            try {
                C2909E c2909e = this.i;
                long jT = c2909e.t();
                p2.j.f22785C.f22797k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f9108b == -1) {
                    if (jCurrentTimeMillis - jT > ((Long) C2841s.f23267e.f23270c.a(H9.f8824s1)).longValue()) {
                        this.f9110d = -1;
                    } else {
                        this.f9110d = c2909e.v();
                    }
                    this.f9108b = j6;
                    this.f9107a = j6;
                } else {
                    this.f9107a = j6;
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8794n4)).booleanValue() || (bundle = a1Var.f23167c) == null || bundle.getInt("gw", 2) != 1) {
                    this.f9109c++;
                    int i = this.f9110d + 1;
                    this.f9110d = i;
                    if (i == 0) {
                        this.f9111e = 0L;
                        c2909e.w(jCurrentTimeMillis);
                    } else {
                        this.f9111e = jCurrentTimeMillis - c2909e.x();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle f(Context context, String str) {
        Bundle bundle;
        synchronized (this.f9112f) {
            try {
                bundle = new Bundle();
                if (!this.i.E()) {
                    bundle.putString("session_id", this.f9114h);
                }
                bundle.putLong("basets", this.f9108b);
                bundle.putLong("currts", this.f9107a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f9109c);
                bundle.putInt("preqs_in_session", this.f9110d);
                bundle.putLong("time_in_session", this.f9111e);
                bundle.putInt("pclick", this.f9115j);
                bundle.putInt("pimp", this.f9116k);
                int i = AbstractC2239ze.f17887a;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z6 = false;
                if (identifier == 0) {
                    u2.k.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z6 = true;
                        } else {
                            u2.k.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        u2.k.h("Fail to fetch AdActivity theme");
                        u2.k.g("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z6);
                bundle.putInt("consent_form_action_identifier", d());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void g() {
        if (((Boolean) AbstractC1750qa.f16379a.v()).booleanValue()) {
            synchronized (this.f9112f) {
                this.f9109c--;
                this.f9110d--;
            }
        }
    }
}
