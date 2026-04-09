package ur;

/* loaded from: classes.dex */
public final class x extends n implements rr.j0 {
    public static final /* synthetic */ ir.v[] E;
    public final gt.i B;
    public final at.j D;

    /* renamed from: r, reason: collision with root package name */
    public final a0 f23678r;

    /* renamed from: x, reason: collision with root package name */
    public final qs.c f23679x;

    /* renamed from: y, reason: collision with root package name */
    public final gt.i f23680y;

    static {
        br.y yVar = br.x.f2918a;
        E = new ir.v[]{yVar.f(new br.q(yVar.b(x.class), "fragments", "getFragments()Ljava/util/List;")), yVar.f(new br.q(yVar.b(x.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, qs.c cVar, gt.l lVar) {
        super(sr.g.f22217a, cVar.g());
        br.l.e(cVar, "fqName");
        br.l.e(lVar, "storageManager");
        this.f23678r = a0Var;
        this.f23679x = cVar;
        this.f23680y = new gt.i(lVar, new w(this, 1));
        this.B = new gt.i(lVar, new w(this, 0));
        this.D = new at.j(lVar, new w(this, 2));
    }

    public final boolean equals(Object obj) {
        rr.j0 j0Var = obj instanceof rr.j0 ? (rr.j0) obj : null;
        if (j0Var == null) {
            return false;
        }
        x xVar = (x) j0Var;
        return br.l.a(this.f23679x, xVar.f23679x) && br.l.a(this.f23678r, xVar.f23678r);
    }

    public final int hashCode() {
        return this.f23679x.hashCode() + (this.f23678r.hashCode() * 31);
    }

    @Override // rr.l
    public final rr.l o() {
        qs.c cVar = this.f23679x;
        if (cVar.d()) {
            return null;
        }
        return this.f23678r.J0(cVar.e());
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.R(this, obj);
    }
}
