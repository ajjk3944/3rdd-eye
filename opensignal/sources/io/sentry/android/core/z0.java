package io.sentry.android.core;

import io.sentry.h5;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.t2;
import io.sentry.v2;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z0 implements io.sentry.x0, io.sentry.android.core.internal.util.p {

    /* renamed from: h, reason: collision with root package name */
    public static final long f11804h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i, reason: collision with root package name */
    public static final h5 f11805i = new h5(new Date(0), 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11806a;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.q f11808c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f11809d;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f11807b = new io.sentry.util.a();

    /* renamed from: e, reason: collision with root package name */
    public final TreeSet f11810e = new TreeSet(new androidx.media3.exoplayer.trackselection.d(16));

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f11811f = new ConcurrentSkipListSet();

    /* renamed from: g, reason: collision with root package name */
    public long f11812g = 16666666;

    public z0(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.q qVar) {
        this.f11808c = qVar;
        this.f11806a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long g(k4 k4Var) {
        if (k4Var instanceof h5) {
            return k4Var.b(f11805i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - k4Var.d());
    }

    @Override // io.sentry.android.core.internal.util.p
    public final void b(long j, long j7, long j10, long j11, boolean z10, boolean z11, float f10) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f11811f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j12 = (long) (f11804h / f10);
        this.f11812g = j12;
        if (z10 || z11) {
            concurrentSkipListSet.add(new y0(j, j7, j10, j11, z10, z11, j12));
        }
    }

    public final void d() {
        io.sentry.q qVarA = this.f11807b.a();
        try {
            if (this.f11809d != null) {
                this.f11808c.a(this.f11809d);
                this.f11809d = null;
            }
            this.f11811f.clear();
            this.f11810e.clear();
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:78:0x0150, B:80:0x015a, B:82:0x015e, B:84:0x0166, B:90:0x0173, B:95:0x0182, B:99:0x018d, B:101:0x0199, B:104:0x01a5, B:106:0x01af, B:107:0x01b9, B:102:0x019e, B:108:0x01bb, B:110:0x01ec, B:58:0x00e5, B:62:0x010b, B:66:0x0116, B:68:0x011a, B:70:0x0121), top: B:142:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(io.sentry.i1 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.z0.e(io.sentry.i1):void");
    }

    public final void f(i1 i1Var) {
        String str;
        if (!this.f11806a || (i1Var instanceof t2) || (i1Var instanceof v2)) {
            return;
        }
        io.sentry.q qVarA = this.f11807b.a();
        try {
            this.f11810e.add(i1Var);
            if (this.f11809d == null) {
                io.sentry.android.core.internal.util.q qVar = this.f11808c;
                if (qVar.B) {
                    String strR = io.sentry.config.a.R();
                    qVar.f11688y.put(strR, this);
                    qVar.b();
                    str = strR;
                } else {
                    str = null;
                }
                this.f11809d = str;
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
