package z5;

import t5.s;
import xk.v;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f37914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f37915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mk.c f37918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ck.c cVar, mk.c cVar2, s sVar, boolean z3, boolean z10) {
        super(2, cVar);
        this.f37915c = sVar;
        this.f37916d = z3;
        this.f37917e = z10;
        this.f37918f = cVar2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new b(cVar, this.f37918f, this.f37915c, this.f37916d, this.f37917e);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((v) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f37914b;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return obj;
        }
        ci.b.D(obj);
        mk.c cVar = this.f37918f;
        s sVar = this.f37915c;
        boolean z3 = this.f37917e;
        boolean z10 = this.f37916d;
        a aVar = new a(null, cVar, sVar, z3, z10);
        this.f37914b = 1;
        Object objQ = sVar.q(z10, aVar, this);
        dk.a aVar2 = dk.a.f22275a;
        return objQ == aVar2 ? aVar2 : objQ;
    }
}
