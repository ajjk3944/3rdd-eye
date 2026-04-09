package ht;

/* loaded from: classes.dex */
public final class k0 extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f10917b = new k0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f10918c = new k0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f10919d = new k0(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10920a;

    public /* synthetic */ k0(int i10) {
        this.f10920a = i10;
    }

    @Override // ht.c
    public final lt.e x(l0 l0Var, lt.d dVar) {
        switch (this.f10920a) {
            case 0:
                br.l.e(l0Var, "state");
                br.l.e(dVar, "type");
                return l0Var.f10923c.h0(dVar);
            case 1:
                br.l.e(l0Var, "state");
                br.l.e(dVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                br.l.e(l0Var, "state");
                br.l.e(dVar, "type");
                return l0Var.f10923c.C(dVar);
        }
    }
}
