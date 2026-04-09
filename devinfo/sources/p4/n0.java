package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f31258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(r0 r0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31257b = i4;
        this.f31258c = r0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31257b) {
            case 0:
                return new n0(this.f31258c, cVar, 0);
            default:
                return new n0(this.f31258c, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f31257b) {
        }
        return ((n0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f31257b;
        ci.b.D(obj);
        switch (i4) {
            case 0:
                return new Integer(x0.f31345b.nativeGetCounterValue(((x0) this.f31258c.f31299i.getValue()).f31346a));
            default:
                return new Integer(x0.f31345b.nativeIncrementAndGetCounterValue(((x0) this.f31258c.f31299i.getValue()).f31346a));
        }
    }
}
