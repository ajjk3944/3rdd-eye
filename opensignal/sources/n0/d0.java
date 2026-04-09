package n0;

/* loaded from: classes.dex */
public final class d0 extends x0.u implements g2 {

    /* renamed from: d, reason: collision with root package name */
    public final ar.a f17147d;

    /* renamed from: g, reason: collision with root package name */
    public c0 f17148g = new c0(x0.l.k().g());

    public d0(ar.a aVar) {
        this.f17147d = aVar;
    }

    @Override // x0.t
    public final void d(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f17148g = (c0) vVar;
    }

    @Override // x0.t
    public final x0.v e() {
        return this.f17148g;
    }

    @Override // n0.g2
    public final Object getValue() {
        ar.k kVarE = x0.l.k().e();
        if (kVarE != null) {
            kVarE.a(this);
        }
        x0.f fVarK = x0.l.k();
        return l((c0) x0.l.j(this.f17148g, fVarK), fVarK, true, this.f17147d).f17143f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n0.c0 l(n0.c0 r22, x0.f r23, boolean r24, ar.a r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d0.l(n0.c0, x0.f, boolean, ar.a):n0.c0");
    }

    public final c0 m() {
        x0.f fVarK = x0.l.k();
        return l((c0) x0.l.j(this.f17148g, fVarK), fVarK, false, this.f17147d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        c0 c0Var = (c0) x0.l.i(this.f17148g);
        sb2.append(c0Var.c(this, x0.l.k()) ? String.valueOf(c0Var.f17143f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
