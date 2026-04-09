package z5;

import t5.s;
import xk.v;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f37919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f37920c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk.c f37922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ck.c cVar, mk.c cVar2, s sVar, boolean z3) {
        super(2, cVar);
        this.f37920c = sVar;
        this.f37921d = z3;
        this.f37922e = cVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new c(cVar, this.f37922e, this.f37920c, this.f37921d);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((v) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f37919b;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return obj;
        }
        ci.b.D(obj);
        mk.c cVar = this.f37922e;
        s sVar = this.f37920c;
        boolean z3 = this.f37921d;
        e eVar = new e(null, cVar, sVar, z3);
        this.f37919b = 1;
        Object objQ = sVar.q(z3, eVar, this);
        dk.a aVar = dk.a.f22275a;
        return objQ == aVar ? aVar : objQ;
    }
}
