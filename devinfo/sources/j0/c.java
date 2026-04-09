package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends i1.m {

    /* renamed from: o, reason: collision with root package name */
    public q2.d f26872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f26873p;

    public c(d dVar) {
        this.f26873p = dVar;
    }

    @Override // i1.m
    public final void f0() {
        d dVar = this.f26873p;
        dVar.f26879a = this;
        if (dVar.f26880b != null) {
            p0();
        }
    }

    @Override // i1.m
    public final void h0() {
        d dVar = this.f26873p;
        if (dVar.f26879a == this) {
            dVar.f26879a = null;
        }
        q2.d dVar2 = this.f26872o;
        if (dVar2 != null) {
            dVar2.b();
        }
        this.f26872o = null;
    }

    public final void p0() {
        b7.b bVar = new b7.b(16, this, this.f26873p);
        i2.e0 e0VarS = i2.k.s(this);
        int i4 = e0VarS.f25628b;
        q2.b rectManager = ((j2.r) i2.h0.a(e0VarS)).getRectManager();
        q2.e eVar = rectManager.f32148b;
        eVar.getClass();
        x.u uVar = eVar.f32168a;
        q2.d dVar = new q2.d(eVar, i4, this, bVar);
        Object objB = uVar.b(i4);
        if (objB == null) {
            uVar.h(i4, dVar);
            objB = dVar;
        }
        q2.d dVar2 = (q2.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                q2.d dVar3 = dVar2.f32164d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f32164d = dVar;
        }
        if (i2.k.s(this.f25554a).f25633h) {
            rectManager.f32147a.n(i4, true);
        }
        rectManager.f32150d = true;
        rectManager.i();
        this.f26872o = dVar;
    }
}
