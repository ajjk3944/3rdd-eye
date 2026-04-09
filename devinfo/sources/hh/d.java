package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f25075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25074b = i4;
        this.f25075c = iVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25074b) {
            case 0:
                return new d(this.f25075c, cVar, 0);
            case 1:
                return new d(this.f25075c, cVar, 1);
            default:
                return new d(this.f25075c, cVar, 2);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f25074b) {
            case 0:
                d dVar = (d) create(iVar, cVar);
                yj.u uVar = yj.u.f37649a;
                dVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                d dVar2 = (d) create(iVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                dVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                d dVar3 = (d) create(iVar, cVar);
                yj.u uVar3 = yj.u.f37649a;
                dVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25074b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(true, this.f25075c.f25090f);
                break;
            case 1:
                ci.b.D(obj);
                r5.c.t(true, this.f25075c.f25090f);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(true, this.f25075c.f25090f);
                break;
        }
        return yj.u.f37649a;
    }
}
