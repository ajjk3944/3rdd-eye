package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f25105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f25104b = i4;
        this.f25105c = qVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        ck.c cVar = (ck.c) obj3;
        switch (this.f25104b) {
            case 0:
                m mVar = new m(this.f25105c, cVar, 0);
                yj.u uVar = yj.u.f37649a;
                mVar.invokeSuspend(uVar);
                return uVar;
            default:
                m mVar2 = new m(this.f25105c, cVar, 1);
                yj.u uVar2 = yj.u.f37649a;
                mVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25104b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(false, this.f25105c.f25119d);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(false, this.f25105c.f25119d);
                break;
        }
        return yj.u.f37649a;
    }
}
