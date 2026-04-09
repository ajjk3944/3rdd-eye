package j6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27454a;

    /* renamed from: b, reason: collision with root package name */
    public o f27455b;

    public /* synthetic */ t() {
        this.f27454a = 1;
    }

    @Override // j6.p, j6.m
    public void a(o oVar) {
        switch (this.f27454a) {
            case 1:
                a aVar = (a) this.f27455b;
                if (!aVar.F) {
                    aVar.J();
                    aVar.F = true;
                    break;
                }
                break;
        }
    }

    @Override // j6.p, j6.m
    public void c(o oVar) {
        switch (this.f27454a) {
            case 0:
                a aVar = (a) this.f27455b;
                aVar.C.remove(oVar);
                if (!aVar.s()) {
                    aVar.w(aVar, n.U8, false);
                    aVar.f27440r = true;
                    aVar.w(aVar, n.T8, false);
                    break;
                }
                break;
        }
    }

    @Override // j6.p, j6.m
    public void d(o oVar) {
        switch (this.f27454a) {
            case 1:
                a aVar = (a) this.f27455b;
                int i4 = aVar.E - 1;
                aVar.E = i4;
                if (i4 == 0) {
                    aVar.F = false;
                    aVar.m();
                }
                oVar.z(this);
                break;
            case 2:
                this.f27455b.B();
                oVar.z(this);
                break;
        }
    }

    public /* synthetic */ t(o oVar, int i4) {
        this.f27454a = i4;
        this.f27455b = oVar;
    }
}
