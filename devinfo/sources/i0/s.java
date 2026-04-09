package i0;

import c0.v0;
import d0.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25499b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f25500c;

    /* renamed from: d, reason: collision with root package name */
    public int f25501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, int i4, ck.c cVar) {
        super(2, cVar);
        this.f25500c = uVar;
        this.f25501d = i4;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f25499b) {
            case 0:
                return new s(this.f25500c, cVar);
            default:
                return new s(this.f25500c, this.f25501d, cVar);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f25499b) {
            case 0:
                return ((s) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                s sVar = (s) create((f1) obj, (ck.c) obj2);
                yj.u uVar = yj.u.f37649a;
                sVar.invokeSuspend(uVar);
                return uVar;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f25499b) {
            case 0:
                int i4 = this.f25501d;
                if (i4 == 0) {
                    ci.b.D(obj);
                    bh.p pVar = new bh.p(2, null, 4);
                    this.f25501d = 1;
                    Object objF = this.f25500c.f(v0.f2516a, pVar, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                ci.b.D(obj);
                this.f25500c.i(this.f25501d, 0, true);
                return yj.u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, ck.c cVar) {
        super(2, cVar);
        this.f25500c = uVar;
    }
}
