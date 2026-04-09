package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c40 extends kd {
    public final mg n;

    public c40(oj ojVar, mg mgVar) {
        super(1, ojVar);
        this.n = mgVar;
    }

    @Override // defpackage.kd
    public final Throwable s(g40 g40Var) {
        Throwable thC;
        Object objA = this.n.A();
        return (!(objA instanceof e40) || (thC = ((e40) objA).c()) == null) ? objA instanceof pg ? ((pg) objA).a : g40Var.v() : thC;
    }

    @Override // defpackage.kd
    public final String z() {
        return "AwaitContinuation";
    }
}
