package r0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0.a0 f32531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1.h f32532c;

    public g(long j, g0.a0 a0Var, c1.h hVar) {
        this.f32530a = j;
        this.f32531b = a0Var;
        this.f32532c = hVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        u0.p pVar = (u0.p) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            s0.c.a(this.f32530a, ((w0) pVar.j(x0.f32709a)).f32694m, c1.n.c(417635459, new f(this.f32531b, this.f32532c, 0), pVar), pVar, 384);
        } else {
            pVar.R();
        }
        return yj.u.f37649a;
    }
}
