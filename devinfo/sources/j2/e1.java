package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb.i f27135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z3, yb.i iVar, String str) {
        super(0);
        this.f27134a = z3;
        this.f27135b = iVar;
        this.f27136c = str;
    }

    @Override // mk.a
    public final Object invoke() {
        if (this.f27134a) {
            yb.i iVar = this.f27135b;
            String str = this.f27136c;
            c6.a aVar = (c6.a) iVar.f37516b;
            synchronized (aVar.f2764c) {
            }
        }
        return yj.u.f37649a;
    }
}
