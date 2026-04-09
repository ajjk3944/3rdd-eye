package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pu1 implements st1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15112a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15113b;

    /* renamed from: c, reason: collision with root package name */
    public long f15114c;

    /* renamed from: d, reason: collision with root package name */
    public long f15115d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15116e;

    public /* synthetic */ pu1() {
    }

    @Override // com.google.android.gms.internal.ads.st1
    public fc A1() {
        return (fc) this.f15116e;
    }

    @Override // com.google.android.gms.internal.ads.st1
    public void a(fc fcVar) {
        if (this.f15113b) {
            b(e());
        }
        this.f15116e = fcVar;
    }

    public void b(long j) {
        this.f15114c = j;
        if (this.f15113b) {
            this.f15115d = SystemClock.elapsedRealtime();
        }
    }

    public void c() {
        if (this.f15113b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f15113b = true;
        this.f15115d = ((me.t1) this.f15116e).I();
    }

    @Override // com.google.android.gms.internal.ads.st1
    public long e() {
        long j = this.f15114c;
        if (!this.f15113b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15115d;
        return (((fc) this.f15116e).f11094a == 1.0f ? bq0.s(jElapsedRealtime) : jElapsedRealtime * r4.f11096c) + j;
    }

    public String toString() {
        String str;
        switch (this.f15112a) {
            case 1:
                long jI = this.f15113b ? (((me.t1) this.f15116e).I() - this.f15115d) + this.f15114c : this.f15114c;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jI, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jI, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jI, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jI, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jI, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jI, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jI / timeUnit2.convert(1L, timeUnit)));
                switch (com.google.android.gms.internal.play_billing.l.f20181a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                return d.h.E(str2, " ", str);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.st1
    public /* synthetic */ boolean z1() {
        return false;
    }

    public pu1(me.t1 t1Var) {
        if (t1Var == null) {
            throw new NullPointerException("ticker");
        }
        this.f15116e = t1Var;
    }
}
