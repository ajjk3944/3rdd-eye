package xi;

/* loaded from: classes.dex */
public final class q extends d {
    public final bk.c B;
    public hk.k D;

    /* renamed from: y, reason: collision with root package name */
    public final bk.f f25360y;

    public q(al.b bVar, bk.f fVar, bk.c cVar) {
        super(bVar, fVar);
        this.f25360y = fVar;
        this.B = cVar;
    }

    @Override // androidx.lifecycle.o
    public final hk.k g1() {
        return this.D;
    }

    @Override // androidx.lifecycle.o
    public final void r1(hk.k kVar) {
        this.D = kVar;
        bk.c cVar = this.B;
        if (kVar == null) {
            cVar.x(this);
        } else {
            cVar.s(this);
        }
    }
}
