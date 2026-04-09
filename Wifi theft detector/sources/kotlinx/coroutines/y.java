package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class y extends y1 implements x {
    public y(r1 r1Var) {
        super(true);
        n0(r1Var);
    }

    @Override // kotlinx.coroutines.y1
    public boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.o0
    public Object l() {
        return b0();
    }

    @Override // kotlinx.coroutines.x
    public boolean o(Throwable th) {
        return s0(new c0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.x
    public boolean p(Object obj) {
        return s0(obj);
    }

    @Override // kotlinx.coroutines.o0
    public Object q(c9.c cVar) throws Throwable {
        Object objJ = J(cVar);
        kotlin.coroutines.intrinsics.a.f();
        return objJ;
    }
}
