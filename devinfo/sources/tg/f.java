package tg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f34571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i4) {
        super(0);
        this.f34570a = i4;
        this.f34571b = gVar;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f34570a) {
            case 0:
                return this.f34571b.U().e();
            case 1:
                return this.f34571b.U().c();
            default:
                return this.f34571b.U().b();
        }
    }
}
