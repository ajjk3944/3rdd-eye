package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f3 extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j3 f22712f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(j3 j3Var, o1 o1Var, int i4) {
        super(o1Var);
        this.f22711e = i4;
        this.f22712f = j3Var;
    }

    @Override // ec.n
    public final void a() {
        switch (this.f22711e) {
            case 0:
                j3 j3Var = this.f22712f;
                j3Var.B();
                if (j3Var.S()) {
                    s0 s0Var = ((o1) j3Var.f218b).f22954f;
                    o1.m(s0Var);
                    s0Var.f23060o.d("Inactivity, disconnecting from the service");
                    j3Var.J();
                    break;
                }
                break;
            default:
                s0 s0Var2 = ((o1) this.f22712f.f218b).f22954f;
                o1.m(s0Var2);
                s0Var2.j.d("Tasks have been queued for a long time");
                break;
        }
    }
}
