package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q2.C2841s;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Xu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Yu f12512b;

    /* renamed from: c, reason: collision with root package name */
    public String f12513c;

    /* renamed from: e, reason: collision with root package name */
    public String f12515e;

    /* renamed from: f, reason: collision with root package name */
    public C1431kf f12516f;

    /* renamed from: g, reason: collision with root package name */
    public C2852x0 f12517g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f12518h;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12511a = new ArrayList();
    public int i = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f12514d = 2;

    public Xu(Yu yu) {
        this.f12512b = yu;
    }

    public final synchronized void a(Su su) {
        try {
            if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
                ArrayList arrayList = this.f12511a;
                su.f();
                arrayList.add(su);
                ScheduledFuture scheduledFuture = this.f12518h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f12518h = AbstractC0640Nf.f10008d.schedule(this, ((Integer) C2841s.f23267e.f23270c.a(H9.S9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.i = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.i = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) C2841s.f23267e.f23270c.a(H9.T9), str);
            }
            if (zMatches) {
                this.f12513c = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            this.f12514d = I5.b.C(bundle);
        }
    }

    public final synchronized void e(C1431kf c1431kf) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            this.f12516f = c1431kf;
        }
    }

    public final synchronized void f(C2852x0 c2852x0) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            this.f12517g = c2852x0;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            this.f12515e = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f12518h;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f12511a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Su su = (Su) obj;
                    int i3 = this.i;
                    if (i3 != 2) {
                        su.j(i3);
                    }
                    if (!TextUtils.isEmpty(this.f12513c)) {
                        su.x(this.f12513c);
                    }
                    if (!TextUtils.isEmpty(this.f12515e) && !su.i()) {
                        su.s0(this.f12515e);
                    }
                    C1431kf c1431kf = this.f12516f;
                    if (c1431kf != null) {
                        su.h(c1431kf);
                    } else {
                        C2852x0 c2852x0 = this.f12517g;
                        if (c2852x0 != null) {
                            su.e(c2852x0);
                        }
                    }
                    su.t(this.f12514d);
                    this.f12512b.b(su.n());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            this.i = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
