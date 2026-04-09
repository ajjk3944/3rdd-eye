package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import i2.r1;
import i2.x1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m0 extends i1.m implements u, d3.c, r1 {

    /* renamed from: o, reason: collision with root package name */
    public Object f2647o;

    /* renamed from: p, reason: collision with root package name */
    public Object f2648p;

    /* renamed from: q, reason: collision with root package name */
    public PointerInputEventHandler f2649q;

    /* renamed from: r, reason: collision with root package name */
    public xk.a0 f2650r;

    /* renamed from: s, reason: collision with root package name */
    public j f2651s = g0.f2612a;

    /* renamed from: t, reason: collision with root package name */
    public final w0.e f2652t;

    /* renamed from: u, reason: collision with root package name */
    public final w0.e f2653u;

    /* renamed from: v, reason: collision with root package name */
    public final w0.e f2654v;

    /* renamed from: w, reason: collision with root package name */
    public j f2655w;

    /* renamed from: x, reason: collision with root package name */
    public long f2656x;

    public m0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f2647o = obj;
        this.f2648p = obj2;
        this.f2649q = pointerInputEventHandler;
        w0.e eVar = new w0.e(new k0[16]);
        this.f2652t = eVar;
        this.f2653u = eVar;
        this.f2654v = new w0.e(new k0[16]);
        this.f2656x = 0L;
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return i2.k.s(this).f25650z.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // i2.r1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // i2.r1
    public final void V() {
        q0();
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return i2.k.s(this).f25650z.a();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.r1
    public final void d(j jVar, k kVar, long j) {
        this.f2656x = j;
        if (kVar == k.f2634a) {
            this.f2651s = jVar;
        }
        ck.c cVar = null;
        if (this.f2650r == null) {
            this.f2650r = xk.x.v(b0(), null, xk.w.f37247d, new al.k(this, cVar, 4), 1);
        }
        p0(jVar, kVar);
        ?? r52 = jVar.f2626a;
        int size = r52.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                jVar = null;
                break;
            } else if (!h0.c((p) r52.get(i4))) {
                break;
            } else {
                i4++;
            }
        }
        this.f2655w = jVar;
    }

    @Override // i2.r1
    public final long f() {
        return x1.f25814a;
    }

    @Override // i1.m
    public final void g0() {
        q0();
    }

    @Override // i1.m
    public final void h0() {
        q0();
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(c2.j r7, c2.k r8) {
        /*
            r6 = this;
            w0.e r0 = r6.f2653u
            monitor-enter(r0)
            w0.e r1 = r6.f2654v     // Catch: java.lang.Throwable -> L6c
            w0.e r2 = r6.f2652t     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f36399c     // Catch: java.lang.Throwable -> L6c
            r1.d(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            ac.m r7 = new ac.m     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            w0.e r0 = r6.f2654v     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f36399c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f36397a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            c2.k0 r2 = (c2.k0) r2     // Catch: java.lang.Throwable -> L21
            c2.k r4 = r2.f2641d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            xk.h r4 = r2.f2640c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f2640c = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            w0.e r0 = r6.f2654v     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f36397a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f36399c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            c2.k0 r4 = (c2.k0) r4     // Catch: java.lang.Throwable -> L21
            c2.k r5 = r4.f2641d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            xk.h r5 = r4.f2640c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f2640c = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            w0.e r7 = r6.f2654v
            r7.h()
            return
        L66:
            w0.e r8 = r6.f2654v
            r8.h()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.m0.p0(c2.j, c2.k):void");
    }

    public final void q0() {
        xk.a0 a0Var = this.f2650r;
        if (a0Var != null) {
            a0Var.s(new t("Pointer input was reset", 2));
            this.f2650r = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.r1
    public final void u() {
        j jVar = this.f2655w;
        if (jVar == null) {
            return;
        }
        ?? r12 = jVar.f2626a;
        int size = r12.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((p) r12.get(i4)).f2661d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    p pVar = (p) r12.get(i10);
                    long j = pVar.f2658a;
                    long j8 = pVar.f2660c;
                    long j9 = pVar.f2659b;
                    float f10 = pVar.f2662e;
                    boolean z3 = pVar.f2661d;
                    arrayList.add(new p(j, j9, j8, false, f10, j9, j8, z3, z3, pVar.f2665i, 0L));
                }
                j jVar2 = new j(arrayList, null);
                this.f2651s = jVar2;
                p0(jVar2, k.f2634a);
                p0(jVar2, k.f2635b);
                p0(jVar2, k.f2636c);
                this.f2655w = null;
                return;
            }
        }
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }

    @Override // i2.r1
    public final /* synthetic */ void B() {
    }
}
