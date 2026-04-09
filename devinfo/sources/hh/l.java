package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f25103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f25102b = i4;
        this.f25103c = qVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25102b) {
            case 0:
                return new l(this.f25103c, cVar, 0);
            default:
                return new l(this.f25103c, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f25102b) {
            case 0:
                l lVar = (l) create(iVar, cVar);
                yj.u uVar = yj.u.f37649a;
                lVar.invokeSuspend(uVar);
                return uVar;
            default:
                l lVar2 = (l) create(iVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                lVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25102b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(true, this.f25103c.f25119d);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(true, this.f25103c.f25119d);
                break;
        }
        return yj.u.f37649a;
    }
}
