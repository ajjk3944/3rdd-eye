package f7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f23792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f23793c;

    public /* synthetic */ s(x xVar, float f10, int i4) {
        this.f23791a = i4;
        this.f23792b = xVar;
        this.f23793c = f10;
    }

    @Override // f7.w
    public final void run() {
        switch (this.f23791a) {
            case 0:
                x xVar = this.f23792b;
                j jVar = xVar.f23801a;
                float f10 = this.f23793c;
                if (jVar != null) {
                    r7.f fVar = xVar.f23802b;
                    fVar.k(fVar.j, r7.h.f(jVar.f23759l, jVar.f23760m, f10));
                    break;
                } else {
                    xVar.f23806f.add(new s(xVar, f10, 0));
                    break;
                }
            case 1:
                x xVar2 = this.f23792b;
                j jVar2 = xVar2.f23801a;
                float f11 = this.f23793c;
                if (jVar2 != null) {
                    xVar2.s((int) r7.h.f(jVar2.f23759l, jVar2.f23760m, f11));
                    break;
                } else {
                    xVar2.f23806f.add(new s(xVar2, f11, 1));
                    break;
                }
            default:
                this.f23792b.u(this.f23793c);
                break;
        }
    }
}
