package x1;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class s0 extends v1.v implements v1.q, a, a1 {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f24918g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24919h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24921l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24922m;

    /* renamed from: n, reason: collision with root package name */
    public t2.a f24923n;

    /* renamed from: p, reason: collision with root package name */
    public ar.k f24925p;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24930u;

    /* renamed from: w, reason: collision with root package name */
    public Object f24932w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24933x;

    /* renamed from: i, reason: collision with root package name */
    public int f24920i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public d0 k = d0.NotUsed;

    /* renamed from: o, reason: collision with root package name */
    public long f24924o = 0;

    /* renamed from: q, reason: collision with root package name */
    public o0 f24926q = o0.IsNotPlaced;

    /* renamed from: r, reason: collision with root package name */
    public final g0 f24927r = new g0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final p0.e f24928s = new p0.e(new s0[16]);

    /* renamed from: t, reason: collision with root package name */
    public boolean f24929t = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24931v = true;

    public s0(i0 i0Var) {
        this.f24918g = i0Var;
        this.f24932w = i0Var.f24859p.f24968q;
    }

    @Override // x1.a
    public final void E() {
        f0.l0(this.f24918g.f24846a, false, 7);
    }

    @Override // v1.v
    public final void N(long j, float f10, ar.k kVar) throws Throwable {
        V(j, kVar);
    }

    public final void R(boolean z10) {
        i0 i0Var = this.f24918g;
        if (z10 && i0Var.f24848c) {
            return;
        }
        if (z10 || i0Var.f24848c) {
            this.f24926q = o0.IsNotPlaced;
            p0.e eVarI = i0Var.f24846a.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                s0 s0Var = ((f0) objArr[i11]).r().f24860q;
                br.l.b(s0Var);
                s0Var.R(true);
            }
        }
    }

    public final void S() {
        o0 o0Var = this.f24926q;
        i0 i0Var = this.f24918g;
        boolean z10 = i0Var.f24848c;
        f0 f0Var = i0Var.f24846a;
        if (z10) {
            this.f24926q = o0.IsPlacedInApproach;
        } else {
            this.f24926q = o0.IsPlacedInLookahead;
        }
        if (o0Var != o0.IsPlacedInLookahead && i0Var.f24850e) {
            f0.l0(f0Var, true, 6);
        }
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            s0 s0VarW = f0Var2.w();
            if (s0VarW == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (s0VarW.j != Integer.MAX_VALUE) {
                s0VarW.S();
                f0.o0(f0Var2);
            }
        }
    }

    public final void T() {
        i0 i0Var = this.f24918g;
        if (i0Var.f24858o > 0) {
            p0.e eVarI = i0Var.f24846a.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var = (f0) objArr[i11];
                i0 i0VarR = f0Var.r();
                if ((i0VarR.f24856m || i0VarR.f24857n) && !i0VarR.f24851f) {
                    f0Var.k0(false);
                }
                s0 s0Var = i0VarR.f24860q;
                if (s0Var != null) {
                    s0Var.T();
                }
            }
        }
    }

    public final void U() {
        this.f24933x = true;
        i0 i0Var = this.f24918g;
        f0 f0VarC = i0Var.f24846a.C();
        o0 o0Var = this.f24926q;
        if ((o0Var != o0.IsPlacedInLookahead && !i0Var.f24848c) || (o0Var != o0.IsPlacedInApproach && i0Var.f24848c)) {
            S();
            if (this.f24919h && f0VarC != null) {
                f0VarC.k0(false);
            }
        }
        if (f0VarC == null) {
            this.j = 0;
        } else if (!this.f24919h && (f0VarC.t() == b0.LayingOut || f0VarC.t() == b0.LookaheadLayingOut)) {
            if (this.j != Integer.MAX_VALUE) {
                u1.a.b("Place was called on a node which was placed already");
            }
            this.j = f0VarC.r().f24853h;
            f0VarC.r().f24853h++;
        }
        w();
    }

    public final void V(long j, ar.k kVar) throws Throwable {
        i0 i0Var = this.f24918g;
        f0 f0Var = i0Var.f24846a;
        f0 f0Var2 = i0Var.f24846a;
        try {
            f0 f0VarC = f0Var.C();
            b0 b0VarT = f0VarC != null ? f0VarC.t() : null;
            b0 b0Var = b0.LookaheadLayingOut;
            if (b0VarT == b0Var) {
                i0Var.f24848c = false;
            }
            if (f0Var2.K) {
                u1.a.a("place is called on a deactivated node");
            }
            i0Var.f24849d = b0Var;
            this.f24921l = true;
            this.f24933x = false;
            if (!i3.g.l(j, this.f24924o)) {
                if (i0Var.f24857n || i0Var.f24856m) {
                    i0Var.f24851f = true;
                }
                T();
            }
            Owner ownerT = k.t(f0Var2);
            if (i0Var.f24851f || !x()) {
                i0Var.h(false);
                this.f24927r.f24840g = false;
                n1 snapshotObserver = ownerT.getSnapshotObserver();
                r0 r0Var = new r0(this, ownerT, j);
                snapshotObserver.getClass();
                if (f0Var2.f24804h != null) {
                    snapshotObserver.a(f0Var2, snapshotObserver.f24901g, r0Var);
                } else {
                    snapshotObserver.a(f0Var2, snapshotObserver.f24900f, r0Var);
                }
            } else {
                n0 n0VarT0 = i0Var.a().t0();
                br.l.b(n0VarT0);
                n0VarT0.m0(i3.g.A(j, n0VarT0.f23813f));
                U();
            }
            this.f24924o = j;
            this.f24925p = kVar;
            i0Var.f24849d = b0.Idle;
        } catch (Throwable th2) {
            f0Var.q0(th2);
            throw null;
        }
    }

    public final boolean W(long j) throws Throwable {
        long j7;
        i0 i0Var = this.f24918g;
        f0 f0Var = i0Var.f24846a;
        f0 f0Var2 = i0Var.f24846a;
        try {
            if (f0Var.K) {
                u1.a.a("measure is called on a deactivated node");
            }
            f0 f0VarC = f0Var2.C();
            f0Var2.C = f0Var2.C || (f0VarC != null && f0VarC.C);
            if (!f0Var2.v()) {
                t2.a aVar = this.f24923n;
                if (aVar == null ? false : t2.a.b(aVar.f22381a, j)) {
                    Owner owner = f0Var2.f24808n;
                    if (owner != null) {
                        ((AndroidComposeView) owner).j(f0Var2, true);
                    }
                    f0Var2.p0();
                    return false;
                }
            }
            this.f24923n = new t2.a(j);
            Q(j);
            this.f24927r.f24839f = false;
            p0.e eVarI = f0Var2.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                s0 s0Var = ((f0) objArr[i11]).r().f24860q;
                br.l.b(s0Var);
                s0Var.f24927r.f24836c = false;
            }
            if (this.f24922m) {
                j7 = this.f23811d;
            } else {
                long j10 = Integer.MIN_VALUE;
                j7 = (j10 & 4294967295L) | (j10 << 32);
            }
            this.f24922m = true;
            n0 n0VarT0 = i0Var.a().t0();
            if (!(n0VarT0 != null)) {
                u1.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            i0Var.c(j);
            O((n0VarT0.f23810c & 4294967295L) | (n0VarT0.f23809b << 32));
            return (((int) (j7 >> 32)) == n0VarT0.f23809b && ((int) (j7 & 4294967295L)) == n0VarT0.f23810c) ? false : true;
        } catch (Throwable th2) {
            f0Var.q0(th2);
            throw null;
        }
    }

    @Override // x1.a1
    public final void c() {
        i0 i0Var = this.f24918g;
        if (Boolean.FALSE.equals(i0Var.a().t0() != null ? Boolean.FALSE : null)) {
            return;
        }
        i0Var.a().t0();
    }

    @Override // x1.a
    public final r d() {
        return (r) this.f24918g.f24846a.D.f822d;
    }

    @Override // x1.a
    public final a e() {
        i0 i0VarR;
        f0 f0VarC = this.f24918g.f24846a.C();
        if (f0VarC == null || (i0VarR = f0VarC.r()) == null) {
            return null;
        }
        return i0VarR.f24860q;
    }

    @Override // x1.a
    public final g0 n() {
        return this.f24927r;
    }

    @Override // x1.a
    public final void o(j1.a aVar) {
        p0.e eVarI = this.f24918g.f24846a.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            s0 s0Var = ((f0) objArr[i11]).r().f24860q;
            br.l.b(s0Var);
            aVar.a(s0Var);
        }
    }

    @Override // x1.a
    public final void requestLayout() {
        this.f24918g.f24846a.k0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // v1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v1.v s(long r6) {
        /*
            r5 = this;
            x1.i0 r0 = r5.f24918g
            x1.f0 r1 = r0.f24846a
            x1.f0 r1 = r1.C()
            r2 = 0
            if (r1 == 0) goto L10
            x1.b0 r1 = r1.t()
            goto L11
        L10:
            r1 = r2
        L11:
            x1.b0 r3 = x1.b0.LookaheadMeasuring
            if (r1 == r3) goto L25
            x1.f0 r1 = r0.f24846a
            x1.f0 r1 = r1.C()
            if (r1 == 0) goto L21
            x1.b0 r2 = r1.t()
        L21:
            x1.b0 r1 = x1.b0.LookaheadLayingOut
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f24847b = r1
        L28:
            x1.f0 r1 = r0.f24846a
            x1.f0 r2 = r1.C()
            if (r2 == 0) goto L79
            x1.d0 r3 = r5.k
            x1.d0 r4 = x1.d0.NotUsed
            if (r3 == r4) goto L40
            boolean r1 = r1.C
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            u1.a.b(r1)
        L40:
            x1.b0 r1 = r2.t()
            int[] r3 = x1.p0.f24909a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L74
            r3 = 2
            if (r1 == r3) goto L74
            r3 = 3
            if (r1 == r3) goto L71
            r3 = 4
            if (r1 != r3) goto L59
            goto L71
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            x1.b0 r0 = r2.t()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L71:
            x1.d0 r1 = x1.d0.InLayoutBlock
            goto L76
        L74:
            x1.d0 r1 = x1.d0.InMeasureBlock
        L76:
            r5.k = r1
            goto L7d
        L79:
            x1.d0 r1 = x1.d0.NotUsed
            r5.k = r1
        L7d:
            x1.f0 r0 = r0.f24846a
            x1.d0 r1 = r0.A
            x1.d0 r2 = x1.d0.NotUsed
            if (r1 != r2) goto L88
            r0.e()
        L88:
            r5.W(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.s0.s(long):v1.v");
    }

    @Override // v1.v, v1.q
    public final Object t() {
        return this.f24932w;
    }

    @Override // x1.a
    public final void w() {
        this.f24930u = true;
        g0 g0Var = this.f24927r;
        g0Var.h();
        i0 i0Var = this.f24918g;
        boolean z10 = i0Var.f24851f;
        f0 f0Var = i0Var.f24846a;
        if (z10) {
            p0.e eVarI = f0Var.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var2 = (f0) objArr[i11];
                if (f0Var2.v() && f0Var2.A() == d0.InMeasureBlock) {
                    s0 s0Var = f0Var2.r().f24860q;
                    br.l.b(s0Var);
                    s0 s0Var2 = f0Var2.r().f24860q;
                    t2.a aVar = s0Var2 != null ? s0Var2.f24923n : null;
                    br.l.b(aVar);
                    if (s0Var.W(aVar.f22381a)) {
                        f0.l0(f0Var, false, 7);
                    }
                }
            }
        }
        q qVar = d().O;
        br.l.b(qVar);
        if (i0Var.f24852g || (!qVar.k && i0Var.f24851f)) {
            i0Var.f24851f = false;
            b0 b0Var = i0Var.f24849d;
            i0Var.f24849d = b0.LookaheadLayingOut;
            Owner ownerT = k.t(f0Var);
            i0Var.i(false);
            n1 snapshotObserver = ownerT.getSnapshotObserver();
            qr.g gVar = new qr.g(this, 7, qVar);
            snapshotObserver.getClass();
            if (f0Var.f24804h != null) {
                snapshotObserver.a(f0Var, snapshotObserver.f24902h, gVar);
            } else {
                snapshotObserver.a(f0Var, snapshotObserver.f24899e, gVar);
            }
            i0Var.f24849d = b0Var;
            if (i0Var.f24856m && qVar.k) {
                requestLayout();
            }
            i0Var.f24852g = false;
        }
        if (g0Var.f24837d) {
            g0Var.f24838e = true;
        }
        if (g0Var.f24835b && g0Var.e()) {
            g0Var.g();
        }
        this.f24930u = false;
    }

    @Override // x1.a
    public final boolean x() {
        return this.f24926q != o0.IsNotPlaced;
    }
}
