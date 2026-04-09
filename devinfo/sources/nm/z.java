package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f30158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, int i4) {
        super(1);
        this.f30157a = i4;
        this.f30158b = e0Var;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f30157a) {
            case 0:
                p1.h0 h0Var = (p1.h0) obj;
                nk.k.e(h0Var, "$this$graphicsLayer");
                h0Var.e(o1.b.e(this.f30158b.e()));
                break;
            case 1:
                p1.h0 h0Var2 = (p1.h0) obj;
                nk.k.e(h0Var2, "$this$graphicsLayer");
                h0Var2.d(o1.b.d(this.f30158b.e()));
                break;
            case 2:
                p1.h0 h0Var3 = (p1.h0) obj;
                nk.k.e(h0Var3, "$this$graphicsLayer");
                h0Var3.e(o1.b.e(((o1.b) this.f30158b.f30031t.d()).f30364a));
                break;
            default:
                p1.h0 h0Var4 = (p1.h0) obj;
                nk.k.e(h0Var4, "$this$graphicsLayer");
                h0Var4.d(o1.b.d(((o1.b) this.f30158b.f30031t.d()).f30364a));
                break;
        }
        return yj.u.f37649a;
    }
}
