package bh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i4, ck.c cVar, int i10) {
        super(i4, cVar);
        this.f2227b = i10;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f2227b) {
            case 0:
                r rVar = new r(3, (ck.c) obj3, 0);
                yj.u uVar = yj.u.f37649a;
                rVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                r rVar2 = new r(3, (ck.c) obj3, 1);
                yj.u uVar2 = yj.u.f37649a;
                rVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                long j = ((o1.b) obj2).f30364a;
                r rVar3 = new r(3, (ck.c) obj3, 2);
                yj.u uVar3 = yj.u.f37649a;
                rVar3.invokeSuspend(uVar3);
                return uVar3;
            case 3:
                ((Number) obj2).floatValue();
                r rVar4 = new r(3, (ck.c) obj3, 3);
                yj.u uVar4 = yj.u.f37649a;
                rVar4.invokeSuspend(uVar4);
                return uVar4;
            default:
                long j8 = ((o1.b) obj2).f30364a;
                r rVar5 = new r(3, (ck.c) obj3, 4);
                yj.u uVar5 = yj.u.f37649a;
                rVar5.invokeSuspend(uVar5);
                return uVar5;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f2227b;
        yj.u uVar = yj.u.f37649a;
        switch (i4) {
            case 0:
                ci.b.D(obj);
                break;
            case 1:
                ci.b.D(obj);
                break;
            case 2:
                ci.b.D(obj);
                break;
            case 3:
                ci.b.D(obj);
                break;
            default:
                ci.b.D(obj);
                break;
        }
        return uVar;
    }
}
