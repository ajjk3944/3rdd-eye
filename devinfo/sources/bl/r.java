package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends cl.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(ck.h hVar, ck.c cVar, int i4) {
        super(cVar, hVar);
        this.f2328e = i4;
    }

    @Override // xk.f1
    public final boolean x(Throwable th2) {
        switch (this.f2328e) {
            case 0:
                if (th2 instanceof l) {
                    return true;
                }
                return r(th2);
            default:
                return false;
        }
    }
}
