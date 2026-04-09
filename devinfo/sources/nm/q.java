package nm;

import android.content.Context;
import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(boolean z3, Object obj, Object obj2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f30113b = i4;
        this.f30114c = z3;
        this.f30115d = obj;
        this.f30116e = obj2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f30113b) {
            case 0:
                return new q(this.f30114c, (e0) this.f30115d, this.f30116e, cVar, 0);
            default:
                return new q(this.f30114c, (Context) this.f30115d, (u0) this.f30116e, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f30113b) {
            case 0:
                q qVar = (q) create(vVar, cVar);
                yj.u uVar = yj.u.f37649a;
                qVar.invokeSuspend(uVar);
                return uVar;
            default:
                q qVar2 = (q) create(vVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                qVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30113b) {
            case 0:
                e0 e0Var = (e0) this.f30115d;
                ci.b.D(obj);
                boolean z3 = this.f30114c;
                Object obj2 = this.f30116e;
                if (z3) {
                    e0Var.f30029r.add(obj2);
                } else {
                    e0Var.f30029r.remove(obj2);
                }
                break;
            default:
                ci.b.D(obj);
                ((u0) this.f30116e).setValue(pg.h.b((Context) this.f30115d, this.f30114c));
                break;
        }
        return yj.u.f37649a;
    }
}
