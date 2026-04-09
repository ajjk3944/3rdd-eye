package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.b f30013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(e0.b bVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f30012b = i4;
        this.f30013c = bVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f30012b) {
            case 0:
                return new e(this.f30013c, cVar, 0);
            case 1:
                return new e(this.f30013c, cVar, 1);
            case 2:
                return new e(this.f30013c, cVar, 2);
            default:
                return new e(this.f30013c, cVar, 3);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f30012b) {
            case 0:
                e eVar = (e) create(vVar, cVar);
                yj.u uVar = yj.u.f37649a;
                eVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                e eVar2 = (e) create(vVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                eVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                e eVar3 = (e) create(vVar, cVar);
                yj.u uVar3 = yj.u.f37649a;
                eVar3.invokeSuspend(uVar3);
                return uVar3;
            default:
                e eVar4 = (e) create(vVar, cVar);
                yj.u uVar4 = yj.u.f37649a;
                eVar4.invokeSuspend(uVar4);
                return uVar4;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30012b) {
            case 0:
                ci.b.D(obj);
                break;
            case 1:
                ci.b.D(obj);
                break;
            case 2:
                ci.b.D(obj);
                break;
            default:
                ci.b.D(obj);
                break;
        }
        return yj.u.f37649a;
    }
}
