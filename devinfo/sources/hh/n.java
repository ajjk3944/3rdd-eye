package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25106b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f25107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f25108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f25106b = i4;
        this.f25108d = qVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        ck.c cVar = (ck.c) obj3;
        switch (this.f25106b) {
            case 0:
                n nVar = new n(this.f25108d, cVar, 0);
                nVar.f25107c = th2;
                yj.u uVar = yj.u.f37649a;
                nVar.invokeSuspend(uVar);
                return uVar;
            default:
                n nVar2 = new n(this.f25108d, cVar, 1);
                nVar2.f25107c = th2;
                yj.u uVar2 = yj.u.f37649a;
                nVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25106b) {
            case 0:
                Throwable th2 = this.f25107c;
                ci.b.D(obj);
                q.g(this.f25108d, th2);
                break;
            default:
                Throwable th3 = this.f25107c;
                ci.b.D(obj);
                wi.e eVar = this.f25108d.f25117b;
                String message = th3.getMessage();
                if (message == null) {
                    message = a0.g.o("error@", th3);
                }
                eVar.h(message);
                break;
        }
        return yj.u.f37649a;
    }
}
