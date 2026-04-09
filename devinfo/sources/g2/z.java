package g2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public d3.l f24447a = d3.l.f21967b;

    /* renamed from: b, reason: collision with root package name */
    public float f24448b;

    /* renamed from: c, reason: collision with root package name */
    public float f24449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f24450d;

    public z(f0 f0Var) {
        this.f24450d = f0Var;
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
        return this.f24449c;
    }

    @Override // g2.q
    public final boolean H() {
        i2.a0 a0Var = this.f24450d.f24329a.H.f25677d;
        return a0Var == i2.a0.f25570d || a0Var == i2.a0.f25568b;
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // g2.l0
    public final k0 N(int i4, int i10, Map map, mk.c cVar, mk.c cVar2) {
        if ((i4 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            f2.a.b("Size(" + i4 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new y(i4, i10, map, cVar, this, this.f24450d, cVar2);
    }

    @Override // g2.l0
    public final k0 O(int i4, int i10, Map map, mk.c cVar) {
        return N(i4, i10, map, null, cVar);
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @Override // g2.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List X(java.lang.Object r12, mk.e r13) {
        /*
            r11 = this;
            g2.f0 r0 = r11.f24450d
            r0.h()
            i2.e0 r1 = r0.f24329a
            i2.i0 r2 = r1.H
            i2.a0 r2 = r2.f25677d
            i2.a0 r3 = i2.a0.f25569c
            i2.a0 r4 = i2.a0.f25567a
            if (r2 == r4) goto L21
            if (r2 == r3) goto L21
            i2.a0 r5 = i2.a0.f25568b
            if (r2 == r5) goto L21
            i2.a0 r5 = i2.a0.f25570d
            if (r2 != r5) goto L1c
            goto L21
        L1c:
            java.lang.String r5 = "subcompose can only be used inside the measure or layout blocks"
            f2.a.b(r5)
        L21:
            x.e0 r5 = r0.g
            java.lang.Object r6 = r5.g(r12)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L67
            x.e0 r6 = r0.j
            java.lang.Object r6 = r6.k(r12)
            i2.e0 r6 = (i2.e0) r6
            if (r6 == 0) goto L4e
            x.e0 r9 = r0.f24334f
            java.lang.Object r9 = r9.g(r6)
            g2.x r9 = (g2.x) r9
            int r9 = r0.f24341o
            if (r9 <= 0) goto L42
            goto L47
        L42:
            java.lang.String r9 = "Check failed."
            f2.a.b(r9)
        L47:
            int r9 = r0.f24341o
            int r9 = r9 + (-1)
            r0.f24341o = r9
            goto L64
        L4e:
            i2.e0 r6 = r0.n(r12)
            if (r6 != 0) goto L64
            int r6 = r0.f24332d
            i2.e0 r9 = new i2.e0
            r10 = 2
            r9.<init>(r10)
            r1.f25642r = r8
            r1.B(r6, r9)
            r1.f25642r = r7
            r6 = r9
        L64:
            r5.m(r12, r6)
        L67:
            i2.e0 r6 = (i2.e0) r6
            java.util.List r5 = r1.p()
            int r9 = r0.f24332d
            if (r9 < 0) goto L7e
            w0.b r5 = (w0.b) r5
            w0.e r10 = r5.f36391a
            int r10 = r10.f36399c
            if (r9 >= r10) goto L7e
            java.lang.Object r5 = r5.get(r9)
            goto L7f
        L7e:
            r5 = 0
        L7f:
            if (r5 == r6) goto Laf
            java.util.List r1 = r1.p()
            w0.b r1 = (w0.b) r1
            w0.e r1 = r1.f36391a
            int r1 = r1.j(r6)
            int r5 = r0.f24332d
            if (r1 < r5) goto L92
            goto La8
        L92:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Key \""
            r5.<init>(r9)
            r5.append(r12)
            java.lang.String r9 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            f2.a.a(r5)
        La8:
            int r5 = r0.f24332d
            if (r5 == r1) goto Laf
            r0.j(r1, r5)
        Laf:
            int r1 = r0.f24332d
            int r1 = r1 + r8
            r0.f24332d = r1
            r0.m(r6, r12, r7, r13)
            if (r2 == r4) goto Lc1
            if (r2 != r3) goto Lbc
            goto Lc1
        Lbc:
            java.util.List r12 = r6.m()
            return r12
        Lc1:
            java.util.List r12 = r6.n()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.z.X(java.lang.Object, mk.e):java.util.List");
    }

    @Override // d3.c
    public final float a() {
        return this.f24448b;
    }

    @Override // g2.q
    public final d3.l getLayoutDirection() {
        return this.f24447a;
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}
