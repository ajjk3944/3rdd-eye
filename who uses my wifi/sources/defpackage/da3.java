package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class da3 implements Runnable {
    public final ea3 g;
    public String h;
    public String j;
    public p21 k;
    public nx2 l;
    public ScheduledFuture m;
    public final ArrayList f = new ArrayList();
    public int n = 2;
    public int i = 2;

    public da3(ea3 ea3Var) {
        this.g = ea3Var;
    }

    public final synchronized void a(aa3 aa3Var) {
        try {
            if (((Boolean) n02.c.w()).booleanValue()) {
                ArrayList arrayList = this.f;
                aa3Var.h();
                arrayList.add(aa3Var);
                ScheduledFuture scheduledFuture = this.m;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.m = md2.d.schedule(this, ((Integer) tw1.e.c.a(mz1.v9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) n02.c.w()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.n = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.n = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.n = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.n = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.n = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.n = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) n02.c.w()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) tw1.e.c.a(mz1.w9), str);
            }
            if (zMatches) {
                this.h = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            this.i = a30.y(bundle);
        }
    }

    public final synchronized void e(p21 p21Var) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            this.k = p21Var;
        }
    }

    public final synchronized void f(nx2 nx2Var) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            this.l = nx2Var;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            this.j = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) n02.c.w()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.m;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    aa3 aa3Var = (aa3) obj;
                    int i2 = this.n;
                    if (i2 != 2) {
                        aa3Var.f(i2);
                    }
                    if (!TextUtils.isEmpty(this.h)) {
                        aa3Var.G(this.h);
                    }
                    if (!TextUtils.isEmpty(this.j) && !aa3Var.i()) {
                        aa3Var.q0(this.j);
                    }
                    p21 p21Var = this.k;
                    if (p21Var != null) {
                        aa3Var.o(p21Var);
                    } else {
                        nx2 nx2Var = this.l;
                        if (nx2Var != null) {
                            aa3Var.k(nx2Var);
                        }
                    }
                    aa3Var.t(this.i);
                    this.g.b(aa3Var.n());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) n02.c.w()).booleanValue()) {
            this.n = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
