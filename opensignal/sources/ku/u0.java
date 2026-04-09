package ku;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u0 extends n {

    /* renamed from: b, reason: collision with root package name */
    public final t0 f14626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(gu.a aVar) {
        super(aVar);
        br.l.e(aVar, "primitiveSerializer");
        this.f14626b = new t0(aVar.getDescriptor());
    }

    @Override // ku.a
    public final Object a() {
        return (s0) g(j());
    }

    @Override // ku.a
    public final int b(Object obj) {
        s0 s0Var = (s0) obj;
        br.l.e(s0Var, "<this>");
        return s0Var.d();
    }

    @Override // ku.a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // ku.a, gu.a
    public final Object deserialize(ju.c cVar) {
        return e(cVar);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return this.f14626b;
    }

    @Override // ku.a
    public final Object h(Object obj) {
        s0 s0Var = (s0) obj;
        br.l.e(s0Var, "<this>");
        return s0Var.a();
    }

    @Override // ku.n
    public final void i(Object obj, int i10, Object obj2) {
        br.l.e((s0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(ju.b bVar, Object obj, int i10);

    @Override // ku.n, gu.a
    public final void serialize(ju.d dVar, Object obj) {
        int iD = d(obj);
        t0 t0Var = this.f14626b;
        br.l.e(t0Var, "descriptor");
        ju.b bVarB = ((mu.y) dVar).b(t0Var);
        k(bVarB, obj, iD);
        bVarB.c(t0Var);
    }
}
