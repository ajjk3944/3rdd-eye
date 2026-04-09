package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25076b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f25077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f25078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f25076b = i4;
        this.f25078d = iVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        ck.c cVar = (ck.c) obj3;
        switch (this.f25076b) {
            case 0:
                e eVar = new e(this.f25078d, cVar, 0);
                eVar.f25077c = th2;
                yj.u uVar = yj.u.f37649a;
                eVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                e eVar2 = new e(this.f25078d, cVar, 1);
                eVar2.f25077c = th2;
                yj.u uVar2 = yj.u.f37649a;
                eVar2.invokeSuspend(uVar2);
                return uVar2;
            default:
                e eVar3 = new e(this.f25078d, cVar, 2);
                eVar3.f25077c = th2;
                yj.u uVar3 = yj.u.f37649a;
                eVar3.invokeSuspend(uVar3);
                return uVar3;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25076b) {
            case 0:
                Throwable th2 = this.f25077c;
                ci.b.D(obj);
                i.g(this.f25078d, th2);
                break;
            case 1:
                Throwable th3 = this.f25077c;
                ci.b.D(obj);
                i.h(this.f25078d, th3);
                break;
            default:
                Throwable th4 = this.f25077c;
                ci.b.D(obj);
                i.i(this.f25078d, th4);
                break;
        }
        return yj.u.f37649a;
    }
}
