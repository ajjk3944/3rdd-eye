package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f25080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f25079b = i4;
        this.f25080c = iVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        ck.c cVar = (ck.c) obj3;
        switch (this.f25079b) {
            case 0:
                f fVar = new f(this.f25080c, cVar, 0);
                yj.u uVar = yj.u.f37649a;
                fVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                f fVar2 = new f(this.f25080c, cVar, 1);
                yj.u uVar2 = yj.u.f37649a;
                fVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                f fVar3 = new f(this.f25080c, cVar, 2);
                yj.u uVar3 = yj.u.f37649a;
                fVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25079b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(false, this.f25080c.f25090f);
                break;
            case 1:
                ci.b.D(obj);
                r5.c.t(false, this.f25080c.f25090f);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(false, this.f25080c.f25090f);
                break;
        }
        return yj.u.f37649a;
    }
}
