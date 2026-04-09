package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bs0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final cs0 f9777b;

    /* renamed from: c, reason: collision with root package name */
    public String f9778c;

    /* renamed from: e, reason: collision with root package name */
    public String f9780e;

    /* renamed from: f, reason: collision with root package name */
    public aw f9781f;
    public va.w1 g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f9782h;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9776a = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f9783i = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f9779d = 2;

    public bs0(cs0 cs0Var) {
        this.f9777b = cs0Var;
    }

    public final synchronized void a(yr0 yr0Var) {
        try {
            if (((Boolean) ol.f14724c.u()).booleanValue()) {
                ArrayList arrayList = this.f9776a;
                yr0Var.zzc();
                arrayList.add(yr0Var);
                ScheduledFuture scheduledFuture = this.f9782h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f9782h = fx.f11277d.schedule(this, ((Integer) va.s.f36163e.f36166c.a(sk.U9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) ol.f14724c.u()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.f9783i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.f9783i = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.f9783i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.f9783i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f9783i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.f9783i = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) va.s.f36163e.f36166c.a(sk.V9), str);
            }
            if (zMatches) {
                this.f9778c = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            this.f9779d = u6.t.z(bundle);
        }
    }

    public final synchronized void e(aw awVar) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            this.f9781f = awVar;
        }
    }

    public final synchronized void f(va.w1 w1Var) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            this.g = w1Var;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            this.f9780e = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) ol.f14724c.u()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f9782h;
                int i4 = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f9776a;
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    yr0 yr0Var = (yr0) obj;
                    int i10 = this.f9783i;
                    if (i10 != 2) {
                        yr0Var.l(i10);
                    }
                    if (!TextUtils.isEmpty(this.f9778c)) {
                        yr0Var.k(this.f9778c);
                    }
                    if (!TextUtils.isEmpty(this.f9780e) && !yr0Var.B1()) {
                        yr0Var.c0(this.f9780e);
                    }
                    aw awVar = this.f9781f;
                    if (awVar != null) {
                        yr0Var.j(awVar);
                    } else {
                        va.w1 w1Var = this.g;
                        if (w1Var != null) {
                            yr0Var.i(w1Var);
                        }
                    }
                    yr0Var.K1(this.f9779d);
                    this.f9777b.b(yr0Var.F1());
                }
                arrayList.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void i(int i4) {
        if (((Boolean) ol.f14724c.u()).booleanValue()) {
            this.f9783i = i4;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
