package d0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public nk.r f21759b;

    /* renamed from: c, reason: collision with root package name */
    public a0.m f21760c;

    /* renamed from: d, reason: collision with root package name */
    public int f21761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f21762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f21763f;
    public final /* synthetic */ v1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(float f10, k kVar, v1 v1Var, ck.c cVar) {
        super(2, cVar);
        this.f21762e = f10;
        this.f21763f = kVar;
        this.g = v1Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new j(this.f21762e, this.f21763f, this.g, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        float f10;
        a0.m mVar;
        nk.r rVar;
        a0.m mVar2;
        a0.v vVar;
        a0.a aVar;
        Object objC;
        Object obj2;
        int i4 = this.f21761d;
        if (i4 == 0) {
            ci.b.D(obj);
            f10 = this.f21762e;
            if (Math.abs(f10) > 1.0f) {
                nk.r rVar2 = new nk.r();
                rVar2.f29983a = f10;
                nk.r rVar3 = new nk.r();
                a0.m mVarB = a0.f.b(28, f10);
                try {
                    k kVar = this.f21763f;
                    vVar = kVar.f21765a;
                    aVar = new a0.a(rVar3, this.g, rVar2, kVar, 2);
                    this.f21759b = rVar2;
                    this.f21760c = mVarB;
                    this.f21761d = 1;
                    mVar = mVarB;
                } catch (CancellationException unused) {
                    mVar = mVarB;
                }
                try {
                    objC = a0.f.c(mVar, new a0.u(vVar, a0.f.j, mVarB.f81b.getValue(), mVarB.f82c), Long.MIN_VALUE, aVar, this);
                    obj2 = dk.a.f22275a;
                    if (objC != obj2) {
                        objC = yj.u.f37649a;
                    }
                } catch (CancellationException unused2) {
                    rVar = rVar2;
                    mVar2 = mVar;
                    rVar.f29983a = ((Number) ((mk.c) mVar2.f80a.f37324b).invoke(mVar2.f82c)).floatValue();
                    f10 = rVar.f29983a;
                    return new Float(f10);
                }
                if (objC == obj2) {
                    return obj2;
                }
                rVar = rVar2;
                f10 = rVar.f29983a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar2 = this.f21760c;
            rVar = this.f21759b;
            try {
                ci.b.D(obj);
            } catch (CancellationException unused3) {
                rVar.f29983a = ((Number) ((mk.c) mVar2.f80a.f37324b).invoke(mVar2.f82c)).floatValue();
                f10 = rVar.f29983a;
                return new Float(f10);
            }
            f10 = rVar.f29983a;
        }
        return new Float(f10);
    }
}
