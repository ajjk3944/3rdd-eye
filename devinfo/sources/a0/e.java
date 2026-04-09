package a0;

import u0.d1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final y4.a f27a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28b;

    /* renamed from: c, reason: collision with root package name */
    public final m f29c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f30d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f31e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f32f;
    public final r g;

    /* renamed from: h, reason: collision with root package name */
    public final r f33h;

    /* renamed from: i, reason: collision with root package name */
    public final r f34i;
    public final r j;

    public e(Object obj, y4.a aVar, Float f10, int i4) {
        f10 = (i4 & 4) != 0 ? null : f10;
        this.f27a = aVar;
        this.f28b = f10;
        m mVar = new m(aVar, obj, null, 60);
        this.f29c = mVar;
        this.f30d = u0.q.r(Boolean.FALSE);
        this.f31e = u0.q.r(obj);
        this.f32f = new h0();
        new l0(1.0f, 1500.0f, f10);
        r rVar = mVar.f82c;
        boolean z3 = rVar instanceof n;
        r rVar2 = z3 ? f.f39e : rVar instanceof o ? f.f40f : rVar instanceof p ? f.g : f.f41h;
        this.g = rVar2;
        r rVar3 = z3 ? f.f35a : rVar instanceof o ? f.f36b : rVar instanceof p ? f.f37c : f.f38d;
        this.f33h = rVar3;
        this.f34i = rVar2;
        this.j = rVar3;
    }

    public static final Object a(e eVar, Object obj) {
        y4.a aVar = eVar.f27a;
        r rVar = eVar.j;
        r rVar2 = eVar.f34i;
        if (!nk.k.a(rVar2, eVar.g) || !nk.k.a(rVar, eVar.f33h)) {
            r rVar3 = (r) ((mk.c) aVar.f37323a).invoke(obj);
            int iB = rVar3.b();
            boolean z3 = false;
            for (int i4 = 0; i4 < iB; i4++) {
                if (rVar3.a(i4) < rVar2.a(i4) || rVar3.a(i4) > rVar.a(i4)) {
                    rVar3.e(i4, ci.b.d(rVar3.a(i4), rVar2.a(i4), rVar.a(i4)));
                    z3 = true;
                }
            }
            if (z3) {
                return ((mk.c) aVar.f37324b).invoke(rVar3);
            }
        }
        return obj;
    }

    public static final void b(e eVar) {
        m mVar = eVar.f29c;
        mVar.f82c.d();
        mVar.f83d = Long.MIN_VALUE;
        eVar.f30d.setValue(Boolean.FALSE);
    }

    public static Object c(e eVar, Object obj, l lVar, mk.c cVar, ek.j jVar, int i4) {
        Object objInvoke = ((mk.c) eVar.f27a.f37324b).invoke(eVar.f29c.f82c);
        mk.c cVar2 = (i4 & 8) != 0 ? null : cVar;
        Object objD = eVar.d();
        y4.a aVar = eVar.f27a;
        return h0.a(eVar.f32f, new b(eVar, objInvoke, new t0(lVar, aVar, objD, obj, (r) ((mk.c) aVar.f37323a).invoke(objInvoke)), eVar.f29c.f83d, cVar2, null), jVar);
    }

    public final Object d() {
        return this.f29c.f81b.getValue();
    }

    public final Object e(Object obj, ek.j jVar) {
        Object objA = h0.a(this.f32f, new c(this, obj, null), jVar);
        return objA == dk.a.f22275a ? objA : yj.u.f37649a;
    }

    public final Object f(ek.j jVar) {
        Object objA = h0.a(this.f32f, new d(this, null), jVar);
        return objA == dk.a.f22275a ? objA : yj.u.f37649a;
    }
}
