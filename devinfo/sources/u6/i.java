package u6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends ek.j implements mk.g {

    /* renamed from: b, reason: collision with root package name */
    public int f35153b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f35154c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f35155d;

    @Override // mk.g
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        i iVar = new i(4, (ck.c) obj4);
        iVar.f35154c = (Throwable) obj2;
        iVar.f35155d = jLongValue;
        return iVar.invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f35153b;
        if (i4 == 0) {
            ci.b.D(obj);
            Throwable th2 = this.f35154c;
            long j = this.f35155d;
            t6.v.e().d(k.f35158a, "Cannot check for unfinished work", th2);
            long jMin = Math.min(j * 30000, k.f35159b);
            this.f35153b = 1;
            Object objI = xk.x.i(jMin, this);
            dk.a aVar = dk.a.f22275a;
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
        }
        return Boolean.TRUE;
    }
}
