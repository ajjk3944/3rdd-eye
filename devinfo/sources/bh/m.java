package bh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f2212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(w wVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f2211b = i4;
        this.f2212c = wVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        ck.c cVar = (ck.c) obj3;
        switch (this.f2211b) {
            case 0:
                m mVar = new m(this.f2212c, cVar, 0);
                yj.u uVar = yj.u.f37649a;
                mVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                m mVar2 = new m(this.f2212c, cVar, 1);
                yj.u uVar2 = yj.u.f37649a;
                mVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                m mVar3 = new m(this.f2212c, cVar, 2);
                yj.u uVar3 = yj.u.f37649a;
                mVar3.invokeSuspend(uVar3);
                return uVar3;
            case 3:
                m mVar4 = new m(this.f2212c, cVar, 3);
                yj.u uVar4 = yj.u.f37649a;
                mVar4.invokeSuspend(uVar4);
                return uVar4;
            default:
                m mVar5 = new m(this.f2212c, cVar, 4);
                yj.u uVar5 = yj.u.f37649a;
                mVar5.invokeSuspend(uVar5);
                return uVar5;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2211b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(false, this.f2212c.f2244b);
                break;
            case 1:
                ci.b.D(obj);
                w wVar = this.f2212c;
                wVar.f2254n = null;
                r5.c.t(false, wVar.f2244b);
                break;
            case 2:
                ci.b.D(obj);
                w wVar2 = this.f2212c;
                wVar2.f2254n = null;
                r5.c.t(false, wVar2.f2244b);
                break;
            case 3:
                ci.b.D(obj);
                r5.c.t(false, this.f2212c.f2244b);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(false, this.f2212c.f2244b);
                break;
        }
        return yj.u.f37649a;
    }
}
