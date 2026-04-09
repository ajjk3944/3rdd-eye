package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25139b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f25140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f25141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f25139b = i4;
        this.f25141d = yVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        ck.c cVar = (ck.c) obj3;
        switch (this.f25139b) {
            case 0:
                x xVar = new x(this.f25141d, cVar, 0);
                xVar.f25140c = th2;
                yj.u uVar = yj.u.f37649a;
                xVar.invokeSuspend(uVar);
                return uVar;
            default:
                x xVar2 = new x(this.f25141d, cVar, 1);
                xVar2.f25140c = th2;
                yj.u uVar2 = yj.u.f37649a;
                xVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25139b) {
            case 0:
                Throwable th2 = this.f25140c;
                ci.b.D(obj);
                y.g(this.f25141d, th2);
                break;
            default:
                Throwable th3 = this.f25140c;
                ci.b.D(obj);
                wi.e eVar = this.f25141d.f25142b;
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
