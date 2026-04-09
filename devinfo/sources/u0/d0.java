package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends g1.y implements n2 {

    /* renamed from: b, reason: collision with root package name */
    public final mk.a f34762b;

    /* renamed from: c, reason: collision with root package name */
    public final j2 f34763c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f34764d = new c0(g1.m.j().g());

    public d0(mk.a aVar, e eVar) {
        this.f34762b = aVar;
        this.f34763c = eVar;
    }

    @Override // g1.x
    public final g1.z a() {
        return this.f34764d;
    }

    @Override // g1.x
    public final void d(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f34764d = (c0) zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u0.c0 g(u0.c0 r22, g1.g r23, boolean r24, mk.a r25) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d0.g(u0.c0, g1.g, boolean, mk.a):u0.c0");
    }

    @Override // u0.n2
    public final Object getValue() {
        mk.c cVarE = g1.m.j().e();
        if (cVarE != null) {
            cVarE.invoke(this);
        }
        g1.g gVarJ = g1.m.j();
        return g((c0) g1.m.i(this.f34764d, gVarJ), gVarJ, true, this.f34762b).f34756f;
    }

    public final c0 h() {
        g1.g gVarJ = g1.m.j();
        return g((c0) g1.m.i(this.f34764d, gVarJ), gVarJ, false, this.f34762b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        c0 c0Var = (c0) g1.m.h(this.f34764d);
        sb2.append(c0Var.c(this, g1.m.j()) ? String.valueOf(c0Var.f34756f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
