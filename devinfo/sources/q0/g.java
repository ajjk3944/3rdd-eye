package q0;

import a0.l;
import c2.s;
import ek.j;
import xk.v;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f32058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f32059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f32061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, float f10, l lVar, ck.c cVar) {
        super(2, cVar);
        this.f32059c = sVar;
        this.f32060d = f10;
        this.f32061e = lVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new g(this.f32059c, this.f32060d, this.f32061e, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((v) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f32058b;
        if (i4 == 0) {
            ci.b.D(obj);
            a0.e eVar = (a0.e) this.f32059c.f2685c;
            Float f10 = new Float(this.f32060d);
            this.f32058b = 1;
            Object objC = a0.e.c(eVar, f10, this.f32061e, null, this, 12);
            dk.a aVar = dk.a.f22275a;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
        }
        return u.f37649a;
    }
}
