package bh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2208b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f2209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(w wVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f2208b = i4;
        this.f2210d = wVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        ck.c cVar = (ck.c) obj3;
        switch (this.f2208b) {
            case 0:
                l lVar = new l(this.f2210d, cVar, 0);
                lVar.f2209c = th2;
                yj.u uVar = yj.u.f37649a;
                lVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                l lVar2 = new l(this.f2210d, cVar, 1);
                lVar2.f2209c = th2;
                yj.u uVar2 = yj.u.f37649a;
                lVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                l lVar3 = new l(this.f2210d, cVar, 2);
                lVar3.f2209c = th2;
                yj.u uVar3 = yj.u.f37649a;
                lVar3.invokeSuspend(uVar3);
                return uVar3;
            case 3:
                l lVar4 = new l(this.f2210d, cVar, 3);
                lVar4.f2209c = th2;
                yj.u uVar4 = yj.u.f37649a;
                lVar4.invokeSuspend(uVar4);
                return uVar4;
            case 4:
                l lVar5 = new l(this.f2210d, cVar, 4);
                lVar5.f2209c = th2;
                yj.u uVar5 = yj.u.f37649a;
                lVar5.invokeSuspend(uVar5);
                return uVar5;
            case 5:
                l lVar6 = new l(this.f2210d, cVar, 5);
                lVar6.f2209c = th2;
                yj.u uVar6 = yj.u.f37649a;
                lVar6.invokeSuspend(uVar6);
                return uVar6;
            default:
                l lVar7 = new l(this.f2210d, cVar, 6);
                lVar7.f2209c = th2;
                yj.u uVar7 = yj.u.f37649a;
                lVar7.invokeSuspend(uVar7);
                return uVar7;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2208b) {
            case 0:
                Throwable th2 = this.f2209c;
                ci.b.D(obj);
                w.g(this.f2210d, th2);
                break;
            case 1:
                Throwable th3 = this.f2209c;
                ci.b.D(obj);
                w.h(this.f2210d, th3);
                break;
            case 2:
                Throwable th4 = this.f2209c;
                ci.b.D(obj);
                w.i(this.f2210d, th4);
                break;
            case 3:
                Throwable th5 = this.f2209c;
                ci.b.D(obj);
                w.j(this.f2210d, th5);
                break;
            case 4:
                Throwable th6 = this.f2209c;
                ci.b.D(obj);
                w.k(this.f2210d, th6);
                break;
            case 5:
                Throwable th7 = this.f2209c;
                ci.b.D(obj);
                w.l(this.f2210d, th7);
                break;
            default:
                Throwable th8 = this.f2209c;
                ci.b.D(obj);
                w.m(this.f2210d, th8);
                break;
        }
        return yj.u.f37649a;
    }
}
