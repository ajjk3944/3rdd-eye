package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w1 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f27333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5.a1 f27334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a aVar, b5.a1 a1Var, v1 v1Var) {
        super(0);
        this.f27333a = aVar;
        this.f27334b = a1Var;
        this.f27335c = v1Var;
    }

    @Override // mk.a
    public final Object invoke() {
        b5.a1 a1Var = this.f27334b;
        a aVar = this.f27333a;
        aVar.removeOnAttachStateChangeListener(a1Var);
        v1 v1Var = this.f27335c;
        nk.k.e(v1Var, "listener");
        pd.b.k(aVar).f28588a.remove(v1Var);
        return yj.u.f37649a;
    }
}
