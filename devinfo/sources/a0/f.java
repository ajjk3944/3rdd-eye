package a0;

import j2.j1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final n f35a = new n(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final o f36b = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final p f37c = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final q f38d = new q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final n f39e = new n(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final o f40f = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final p g = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final q f41h = new q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f42i = new float[91];
    public static final y4.a j = new y4.a(new q0(1), new q0(18));

    /* renamed from: k, reason: collision with root package name */
    public static final y4.a f43k = new y4.a(new q0(2), new q0(3));

    /* renamed from: l, reason: collision with root package name */
    public static final y4.a f44l = new y4.a(new q0(4), new q0(5));

    /* renamed from: m, reason: collision with root package name */
    public static final y4.a f45m = new y4.a(new q0(6), new q0(7));

    /* renamed from: n, reason: collision with root package name */
    public static final y4.a f46n = new y4.a(new q0(8), new q0(9));

    /* renamed from: o, reason: collision with root package name */
    public static final y4.a f47o = new y4.a(new q0(10), new q0(11));

    /* renamed from: p, reason: collision with root package name */
    public static final y4.a f48p = new y4.a(new q0(12), new q0(13));

    /* renamed from: q, reason: collision with root package name */
    public static final y4.a f49q = new y4.a(new q0(14), new q0(15));

    /* renamed from: r, reason: collision with root package name */
    public static final y4.a f50r = new y4.a(new q0(16), new q0(17));

    public static e a(float f10) {
        return new e(Float.valueOf(f10), j, Float.valueOf(0.01f), 8);
    }

    public static m b(int i4, float f10) {
        if ((i4 & 2) != 0) {
            f10 = 0.0f;
        }
        return new m(j, Float.valueOf(0.0f), new n(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(a0.m r22, a0.h r23, long r24, final mk.c r26, ek.c r27) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f.c(a0.m, a0.h, long, mk.c, ek.c):java.lang.Object");
    }

    public static Object d(float f10, l lVar, mk.e eVar, ek.j jVar, int i4) {
        if ((i4 & 8) != 0) {
            lVar = k(0.0f, 0.0f, null, 7);
        }
        l lVar2 = lVar;
        Float f11 = new Float(0.0f);
        Float f12 = new Float(f10);
        Float f13 = new Float(0.0f);
        y4.a aVar = j;
        mk.c cVar = (mk.c) aVar.f37323a;
        r rVarC = (r) cVar.invoke(f13);
        if (rVarC == null) {
            rVarC = ((r) cVar.invoke(f11)).c();
        }
        r rVar = rVarC;
        Object objC = c(new m(aVar, f11, rVar, 56), new t0(lVar2, aVar, f11, f12, rVar), Long.MIN_VALUE, new r0(0, eVar), jVar);
        yj.u uVar = yj.u.f37649a;
        dk.a aVar2 = dk.a.f22275a;
        if (objC != aVar2) {
            objC = uVar;
        }
        return objC == aVar2 ? objC : uVar;
    }

    public static final Object e(m mVar, Float f10, z zVar, mk.c cVar, ek.j jVar) {
        Object objC = c(mVar, new t0(zVar, mVar.f80a, mVar.f81b.getValue(), f10, mVar.f82c), mVar.f83d, cVar, jVar);
        return objC == dk.a.f22275a ? objC : yj.u.f37649a;
    }

    public static final Object f(h hVar, mk.c cVar, s0 s0Var) {
        if (!hVar.d()) {
            return u0.q.o(s0Var.getContext()).a(new p0(cVar, 0), s0Var);
        }
        if (s0Var.getContext().O(j1.f27199a) == null) {
            return u0.q.o(s0Var.getContext()).a(cVar, s0Var);
        }
        throw new ClassCastException();
    }

    public static final r g(r rVar) {
        r rVarC = rVar.c();
        int iB = rVarC.b();
        for (int i4 = 0; i4 < iB; i4++) {
            rVarC.e(i4, rVar.a(i4));
        }
        return rVarC;
    }

    public static m h(m mVar, float f10) {
        float f11 = ((n) mVar.f82c).f92a;
        return new m(mVar.f80a, Float.valueOf(f10), new n(f11), mVar.f83d, mVar.f84e, mVar.f85f);
    }

    public static final void i(k kVar, long j8, float f10, h hVar, m mVar, mk.c cVar) {
        long jE = f10 == 0.0f ? hVar.e() : (long) ((j8 - kVar.f68c) / f10);
        kVar.g = j8;
        kVar.f70e.setValue(hVar.i(jE));
        kVar.f71f = hVar.g(jE);
        if (hVar.h(jE)) {
            kVar.f72h = kVar.g;
            kVar.f73i.setValue(Boolean.FALSE);
        }
        l(kVar, mVar);
        cVar.invoke(kVar);
    }

    public static final float j(ck.h hVar) {
        i1.o oVar = (i1.o) hVar.O(i1.b.f25541m);
        float fV = oVar != null ? oVar.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        i0.b("negative scale factor");
        return fV;
    }

    public static l0 k(float f10, float f11, Object obj, int i4) {
        if ((i4 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i4 & 4) != 0) {
            obj = null;
        }
        return new l0(f10, f11, obj);
    }

    public static final void l(k kVar, m mVar) {
        mVar.f81b.setValue(kVar.f70e.getValue());
        r rVar = mVar.f82c;
        r rVar2 = kVar.f71f;
        int iB = rVar.b();
        for (int i4 = 0; i4 < iB; i4++) {
            rVar.e(i4, rVar2.a(i4));
        }
        mVar.f84e = kVar.f72h;
        mVar.f83d = kVar.g;
        mVar.f85f = ((Boolean) kVar.f73i.getValue()).booleanValue();
    }
}
