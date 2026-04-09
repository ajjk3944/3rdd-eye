package r5;

import a5.t;
import a5.x;
import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import b5.b0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import oe.h0;
import oe.u0;
import oe.z0;

/* loaded from: classes.dex */
public final class g implements d, b0 {
    public static final u0 J = h0.o(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final u0 K = h0.o(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final u0 L = h0.o(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final u0 M = h0.o(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final u0 N = h0.o(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final u0 O = h0.o(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static g P;
    public long B;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f21239a;

    /* renamed from: d, reason: collision with root package name */
    public final pb.f f21240d = new pb.f(1);

    /* renamed from: g, reason: collision with root package name */
    public final s f21241g;

    /* renamed from: r, reason: collision with root package name */
    public final a5.b f21242r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f21243x;

    /* renamed from: y, reason: collision with root package name */
    public int f21244y;

    public g(Context context, HashMap map, int i10, x xVar, boolean z10) {
        this.f21239a = z0.a(map);
        this.f21241g = new s(i10);
        this.f21242r = xVar;
        this.f21243x = z10;
        if (context == null) {
            this.E = 0;
            this.H = h(0);
            return;
        }
        t tVarC = t.c(context);
        int iD = tVarC.d();
        this.E = iD;
        this.H = h(iD);
        f fVar = new f(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) tVarC.f155c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fVar));
        ((Handler) tVarC.f154b).post(new a5.o(tVarC, 0, fVar));
    }

    @Override // r5.d
    public final synchronized long b() {
        return this.H;
    }

    @Override // r5.d
    public final void c(Handler handler, AnalyticsCollector analyticsCollector) {
        analyticsCollector.getClass();
        pb.f fVar = this.f21240d;
        fVar.getClass();
        fVar.b(analyticsCollector);
        fVar.f20371b.add(new c(handler, analyticsCollector));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    @Override // b5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(b5.k r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            int r2 = r2.f2450h     // Catch: java.lang.Throwable -> Le
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
            int r2 = r1.f21244y     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L26
            a5.b r2 = r1.f21242r     // Catch: java.lang.Throwable -> Le
            a5.x r2 = (a5.x) r2     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r1.B = r2     // Catch: java.lang.Throwable -> Le
        L26:
            int r2 = r1.f21244y     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.f21244y = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.g.d(b5.k, boolean):void");
    }

    @Override // r5.d
    public final void e(AnalyticsCollector analyticsCollector) {
        this.f21240d.b(analyticsCollector);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    @Override // b5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(b5.k r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L13
            int r13 = r13.f2450h     // Catch: java.lang.Throwable -> Lf
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
            int r13 = r12.f21244y     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r0 = r1
        L1d:
            a5.a.i(r0)     // Catch: java.lang.Throwable -> Lf
            a5.b r13 = r12.f21242r     // Catch: java.lang.Throwable -> Lf
            a5.x r13 = (a5.x) r13     // Catch: java.lang.Throwable -> Lf
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
            r5.s r2 = r12.f21241g     // Catch: java.lang.Throwable -> Lf
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
            r5.s r0 = r12.f21241g     // Catch: java.lang.Throwable -> Lf
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
            pb.f r4 = r12.f21240d     // Catch: java.lang.Throwable -> Lf
            r4.a(r5, r6, r8)     // Catch: java.lang.Throwable -> Lf
        L84:
            r12.B = r13     // Catch: java.lang.Throwable -> Lf
            r12.D = r2     // Catch: java.lang.Throwable -> Lf
        L88:
            int r13 = r12.f21244y     // Catch: java.lang.Throwable -> Lf
            int r13 = r13 - r1
            r12.f21244y = r13     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r12)
            return
        L8f:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lf
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.g.f(b5.k, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    @Override // b5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(b5.k r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            int r3 = r3.f2450h     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: r5.g.g(b5.k, boolean, int):void");
    }

    public final long h(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        z0 z0Var = this.f21239a;
        Long l10 = (Long) z0Var.get(numValueOf);
        if (l10 == null) {
            l10 = (Long) z0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    @Override // r5.d
    public final b0 a() {
        return this;
    }
}
