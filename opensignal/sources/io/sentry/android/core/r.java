package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.b5;
import io.sentry.h1;

/* loaded from: classes.dex */
public final class r implements h1, m0, io.sentry.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f11756d = new r(0);

    /* renamed from: g, reason: collision with root package name */
    public static final r f11757g = new r(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11758a;

    public /* synthetic */ r(int i10) {
        this.f11758a = i10;
    }

    @Override // io.sentry.h1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.h1
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.u0
    public void f(b5 b5Var, Throwable th2, String str, Object... objArr) {
        switch (this.f11758a) {
            case 2:
                if (objArr.length != 0) {
                    g(b5Var, String.format(str, objArr), th2);
                    break;
                } else {
                    g(b5Var, str, th2);
                    break;
                }
            default:
                if (objArr.length != 0) {
                    g(b5Var, String.format(str, objArr), th2);
                    break;
                } else {
                    g(b5Var, str, th2);
                    break;
                }
        }
    }

    @Override // io.sentry.u0
    public void g(b5 b5Var, String str, Throwable th2) {
        switch (this.f11758a) {
            case 2:
                Log.wtf("Sentry", str, th2);
                break;
            default:
                int i10 = j.f11689a[b5Var.ordinal()];
                if (i10 == 2) {
                    Log.w("Sentry", str, th2);
                    break;
                } else if (i10 == 4) {
                    Log.wtf("Sentry", str, th2);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.u0
    public void m(b5 b5Var, String str, Object... objArr) {
        switch (this.f11758a) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                    break;
                } else {
                    Log.println(7, "Sentry", str);
                    break;
                }
            default:
                int i10 = 5;
                if (objArr.length != 0) {
                    int i11 = j.f11689a[b5Var.ordinal()];
                    if (i11 == 1) {
                        i10 = 4;
                    } else if (i11 != 2) {
                        i10 = i11 != 4 ? 3 : 7;
                    }
                    Log.println(i10, "Sentry", String.format(str, objArr));
                    break;
                } else {
                    int i12 = j.f11689a[b5Var.ordinal()];
                    if (i12 == 1) {
                        i10 = 4;
                    } else if (i12 != 2) {
                        i10 = i12 != 4 ? 3 : 7;
                    }
                    Log.println(i10, "Sentry", str);
                    break;
                }
        }
    }

    @Override // io.sentry.u0
    public boolean o(b5 b5Var) {
        switch (this.f11758a) {
        }
        return true;
    }
}
