package dh;

import ek.j;
import hh.y;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hg.e f22263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(hg.e eVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f22262b = i4;
        this.f22263c = eVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        ck.c cVar = (ck.c) obj3;
        switch (this.f22262b) {
            case 0:
                f fVar = new f((g) this.f22263c, cVar, 0);
                u uVar = u.f37649a;
                fVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                f fVar2 = new f((gh.e) this.f22263c, cVar, 1);
                u uVar2 = u.f37649a;
                fVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                f fVar3 = new f((y) this.f22263c, cVar, 2);
                u uVar3 = u.f37649a;
                fVar3.invokeSuspend(uVar3);
                return uVar3;
            default:
                f fVar4 = new f((ih.c) this.f22263c, cVar, 3);
                u uVar4 = u.f37649a;
                fVar4.invokeSuspend(uVar4);
                return uVar4;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22262b) {
            case 0:
                ci.b.D(obj);
                r5.c.t(false, ((g) this.f22263c).f22264b);
                break;
            case 1:
                ci.b.D(obj);
                r5.c.t(false, ((gh.e) this.f22263c).f24736d);
                break;
            case 2:
                ci.b.D(obj);
                r5.c.t(false, ((y) this.f22263c).f25146f);
                break;
            default:
                ci.b.D(obj);
                r5.c.t(false, ((ih.c) this.f22263c).f25999d);
                break;
        }
        return u.f37649a;
    }
}
