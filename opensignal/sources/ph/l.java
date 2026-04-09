package ph;

import android.content.Context;
import android.os.Handler;
import ch.n;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import pb.u0;

/* loaded from: classes.dex */
public final class l implements pb.g, u0, Serializable {
    public long B;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20576a;

    /* renamed from: d, reason: collision with root package name */
    public final pb.f f20577d;

    /* renamed from: g, reason: collision with root package name */
    public final oh.h f20578g;

    /* renamed from: r, reason: collision with root package name */
    public final qb.a f20579r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20580x;

    /* renamed from: y, reason: collision with root package name */
    public int f20581y;

    public l(Context context, Map map, int i10, qb.a aVar, boolean z10, oh.e eVar) {
        int i11;
        n.b("SdkDefaultBandwidthMeter", "CustomDefaultBandwidthMeterMinimal constructor");
        this.f20576a = new HashMap(map);
        this.f20577d = new pb.f(0);
        this.f20578g = new oh.h(i10);
        this.f20579r = aVar;
        this.f20580x = z10;
        if (context == null) {
            this.E = 0;
            this.H = h(0);
            return;
        }
        synchronized (eVar.f19458r) {
            i11 = eVar.f19459x;
        }
        this.E = i11;
        this.H = h(i11);
        eVar.c(new k(0, this));
    }

    @Override // pb.g
    public final synchronized long b() {
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(na.c r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            int r3 = r3.f17421e     // Catch: java.lang.Throwable -> Ld
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Lf
        Lb:
            r3 = 1
            goto L10
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            r3 = 0
        L10:
            if (r3 != 0) goto L14
            monitor-exit(r2)
            return
        L14:
            long r3 = r2.D     // Catch: java.lang.Throwable -> Ld
            long r0 = (long) r5     // Catch: java.lang.Throwable -> Ld
            long r3 = r3 + r0
            r2.D = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.l.c(na.c, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(na.c r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L13
            int r13 = r13.f17421e     // Catch: java.lang.Throwable -> Lf
            r14 = 8
            r13 = r13 & r14
            if (r13 != r14) goto Ld
            goto L13
        Ld:
            r13 = r1
            goto L14
        Lf:
            r0 = move-exception
            r13 = r0
            goto L8f
        L13:
            r13 = r0
        L14:
            if (r13 != 0) goto L18
            monitor-exit(r12)
            return
        L18:
            int r13 = r12.f20581y     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r0 = r1
        L1d:
            qb.b.j(r0)     // Catch: java.lang.Throwable -> Lf
            qb.a r13 = r12.f20579r     // Catch: java.lang.Throwable -> Lf
            et.d r13 = (et.d) r13     // Catch: java.lang.Throwable -> Lf
            r13.getClass()     // Catch: java.lang.Throwable -> Lf
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.B     // Catch: java.lang.Throwable -> Lf
            long r2 = r13 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.F     // Catch: java.lang.Throwable -> Lf
            long r6 = (long) r5     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.F = r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.G     // Catch: java.lang.Throwable -> Lf
            long r6 = r12.D     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.G = r2     // Catch: java.lang.Throwable -> Lf
            if (r5 <= 0) goto L88
            float r0 = (float) r6     // Catch: java.lang.Throwable -> Lf
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> Lf
            float r0 = r0 / r2
            oh.h r2 = r12.f20578g     // Catch: java.lang.Throwable -> Lf
            double r3 = (double) r6     // Catch: java.lang.Throwable -> Lf
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> Lf
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lf
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.F     // Catch: java.lang.Throwable -> Lf
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L61
            long r2 = r12.G     // Catch: java.lang.Throwable -> Lf
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L6a
        L61:
            oh.h r0 = r12.f20578g     // Catch: java.lang.Throwable -> Lf
            float r0 = r0.b()     // Catch: java.lang.Throwable -> Lf
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lf
            r12.H = r2     // Catch: java.lang.Throwable -> Lf
        L6a:
            long r6 = r12.D     // Catch: java.lang.Throwable -> Lf
            long r8 = r12.H     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r5 != 0) goto L7d
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7d
            long r10 = r12.I     // Catch: java.lang.Throwable -> Lf
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L7d
            goto L84
        L7d:
            r12.I = r8     // Catch: java.lang.Throwable -> Lf
            pb.f r4 = r12.f20577d     // Catch: java.lang.Throwable -> Lf
            r4.a(r5, r6, r8)     // Catch: java.lang.Throwable -> Lf
        L84:
            r12.B = r13     // Catch: java.lang.Throwable -> Lf
            r12.D = r2     // Catch: java.lang.Throwable -> Lf
        L88:
            int r13 = r12.f20581y     // Catch: java.lang.Throwable -> Lf
            int r13 = r13 - r1
            r12.f20581y = r13     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r12)
            return
        L8f:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lf
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.l.d(na.c, boolean):void");
    }

    @Override // pb.g
    public final void e(Handler handler, AnalyticsCollector analyticsCollector) {
        analyticsCollector.getClass();
        pb.f fVar = this.f20577d;
        fVar.getClass();
        fVar.c(analyticsCollector);
        fVar.f20371b.add(new pb.e(handler, analyticsCollector));
    }

    @Override // pb.g
    public final void f(AnalyticsCollector analyticsCollector) {
        this.f20577d.c(analyticsCollector);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    @Override // pb.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(na.c r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            int r2 = r2.f17421e     // Catch: java.lang.Throwable -> Le
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto L10
        Lc:
            r2 = r0
            goto L11
        Le:
            r2 = move-exception
            goto L2d
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r1)
            return
        L15:
            int r2 = r1.f20581y     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L26
            qb.a r2 = r1.f20579r     // Catch: java.lang.Throwable -> Le
            et.d r2 = (et.d) r2     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r1.B = r2     // Catch: java.lang.Throwable -> Le
        L26:
            int r2 = r1.f20581y     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.f20581y = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.l.g(na.c, boolean):void");
    }

    public final long h(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f20576a;
        Long l10 = (Long) map.get(numValueOf);
        if (l10 == null) {
            l10 = (Long) map.get(0);
        }
        if (l10 == null) {
            l10 = 10000000L;
        }
        return l10.longValue();
    }

    @Override // pb.g
    public final u0 a() {
        return this;
    }
}
