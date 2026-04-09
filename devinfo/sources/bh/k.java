package bh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f2207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(w wVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2206b = i4;
        this.f2207c = wVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2206b) {
            case 0:
                return new k(this.f2207c, cVar, 0);
            case 1:
                return new k(this.f2207c, cVar, 1);
            case 2:
                return new k(this.f2207c, cVar, 2);
            default:
                return new k(this.f2207c, cVar, 3);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2206b) {
            case 0:
                k kVar = (k) create(iVar, cVar);
                yj.u uVar = yj.u.f37649a;
                kVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                k kVar2 = (k) create(iVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                kVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                k kVar3 = (k) create(iVar, cVar);
                yj.u uVar3 = yj.u.f37649a;
                kVar3.invokeSuspend(uVar3);
                return uVar3;
            default:
                k kVar4 = (k) create(iVar, cVar);
                yj.u uVar4 = yj.u.f37649a;
                kVar4.invokeSuspend(uVar4);
                return uVar4;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2206b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(true, this.f2207c.f2244b);
                break;
            case 1:
                ci.b.D(obj);
                r5.c.t(true, this.f2207c.f2244b);
                break;
            case 2:
                ci.b.D(obj);
                r5.c.t(true, this.f2207c.f2244b);
                break;
            default:
                ci.b.D(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                w wVar = this.f2207c;
                wVar.f2253m = jCurrentTimeMillis;
                r5.c.t(true, wVar.f2244b);
                break;
        }
        return yj.u.f37649a;
    }
}
