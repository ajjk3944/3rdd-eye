package z5;

import h5.InterfaceC2370d;

/* loaded from: classes3.dex */
public final class Y extends C3030f {
    public final C3036l i;

    public Y(InterfaceC2370d interfaceC2370d, C3036l c3036l) {
        super(1, interfaceC2370d);
        this.i = c3036l;
    }

    @Override // z5.C3030f
    public final Throwable r(c0 c0Var) {
        Throwable thC;
        Object objY = this.i.y();
        return (!(objY instanceof a0) || (thC = ((a0) objY).c()) == null) ? objY instanceof C3038n ? ((C3038n) objY).f24546a : c0Var.u() : thC;
    }

    @Override // z5.C3030f
    public final String z() {
        return "AwaitContinuation";
    }
}
