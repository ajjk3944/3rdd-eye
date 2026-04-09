package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 extends i0 implements y {

    /* renamed from: e, reason: collision with root package name */
    public final a0 f1143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f1144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, a0 a0Var, m0 m0Var) {
        super(l0Var, m0Var);
        this.f1144f = l0Var;
        this.f1143e = a0Var;
    }

    @Override // androidx.lifecycle.i0
    public final void b() {
        this.f1143e.j().b(this);
    }

    @Override // androidx.lifecycle.i0
    public final boolean d(a0 a0Var) {
        return this.f1143e == a0Var;
    }

    @Override // androidx.lifecycle.i0
    public final boolean f() {
        return this.f1143e.j().f1110d.compareTo(s.f1183d) >= 0;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) {
        a0 a0Var2 = this.f1143e;
        s sVar = a0Var2.j().f1110d;
        if (sVar == s.f1180a) {
            this.f1144f.i(this.f1146a);
            return;
        }
        s sVar2 = null;
        while (sVar2 != sVar) {
            a(f());
            sVar2 = sVar;
            sVar = a0Var2.j().f1110d;
        }
    }
}
