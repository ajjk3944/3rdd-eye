package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f24425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(s0 s0Var, int i4) {
        super(1);
        this.f24424a = i4;
        this.f24425b = s0Var;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f24424a) {
            case 0:
                r0.j((r0) obj, this.f24425b);
                break;
            case 1:
                r0.g((r0) obj, this.f24425b, 0, 0);
                break;
            default:
                r0.i((r0) obj, this.f24425b, 0, 0);
                break;
        }
        return yj.u.f37649a;
    }
}
