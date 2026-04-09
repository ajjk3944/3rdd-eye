package c2;

import j2.y1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 implements d3.c, ck.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f2638a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.h f2639b;

    /* renamed from: c, reason: collision with root package name */
    public xk.h f2640c;

    /* renamed from: d, reason: collision with root package name */
    public k f2641d = k.f2635b;

    /* renamed from: e, reason: collision with root package name */
    public final ck.i f2642e = ck.i.f2898a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f2643f;

    public k0(m0 m0Var, xk.h hVar) {
        this.f2643f = m0Var;
        this.f2638a = m0Var;
        this.f2639b = hVar;
    }

    @Override // d3.c
    public final float C(int i4) {
        return this.f2638a.C(i4);
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / this.f2638a.a();
    }

    @Override // d3.c
    public final float F() {
        return this.f2638a.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return this.f2638a.a() * f10;
    }

    @Override // d3.c
    public final int Q(float f10) {
        m0 m0Var = this.f2638a;
        m0Var.getClass();
        return d.h.i(m0Var, f10);
    }

    @Override // d3.c
    public final long T(long j) {
        m0 m0Var = this.f2638a;
        m0Var.getClass();
        return d.h.m(j, m0Var);
    }

    @Override // d3.c
    public final float W(long j) {
        m0 m0Var = this.f2638a;
        m0Var.getClass();
        return d.h.l(j, m0Var);
    }

    @Override // d3.c
    public final float a() {
        return this.f2638a.a();
    }

    public final Object b(k kVar, ek.a aVar) {
        xk.h hVar = new xk.h(1, a.a.r(aVar));
        hVar.s();
        this.f2641d = kVar;
        this.f2640c = hVar;
        return hVar.r();
    }

    public final y1 d() {
        m0 m0Var = this.f2643f;
        m0Var.getClass();
        return i2.k.s(m0Var).B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [xk.y0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [mk.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r6, mk.e r8, ek.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof c2.i0
            if (r0 == 0) goto L13
            r0 = r9
            c2.i0 r0 = (c2.i0) r0
            int r1 = r0.f2625d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2625d = r1
            goto L18
        L13:
            c2.i0 r0 = new c2.i0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f2623b
            int r1 = r0.f2625d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            xk.a0 r6 = r0.f2622a
            ci.b.D(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ci.b.D(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            xk.h r9 = r5.f2640c
            if (r9 == 0) goto L4a
            c2.l r1 = new c2.l
            r1.<init>(r6)
            yj.k r1 = ci.b.h(r1)
            r9.resumeWith(r1)
        L4a:
            c2.m0 r9 = r5.f2643f
            xk.v r9 = r9.b0()
            c2.j0 r1 = new c2.j0
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            xk.a0 r6 = xk.x.v(r9, r3, r3, r1, r6)
            r0.f2622a = r6     // Catch: java.lang.Throwable -> L27
            r0.f2625d = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L27
            dk.a r7 = dk.a.f22275a
            if (r9 != r7) goto L68
            return r7
        L68:
            c2.a r7 = c2.a.f2582b
            r6.e(r7)
            return r9
        L6e:
            c2.a r8 = c2.a.f2582b
            r6.e(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.k0.e(long, mk.e, ek.c):java.lang.Object");
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f2642e;
    }

    @Override // d3.c
    public final float o(long j) {
        m0 m0Var = this.f2638a;
        m0Var.getClass();
        return d.h.k(j, m0Var);
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        m0 m0Var = this.f2643f;
        synchronized (m0Var.f2653u) {
            m0Var.f2652t.k(this);
        }
        this.f2639b.resumeWith(obj);
    }

    @Override // d3.c
    public final long x(float f10) {
        return this.f2638a.x(f10);
    }
}
