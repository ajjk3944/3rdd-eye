package r0;

import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f32544a = new o2(new b6.a(29));

    public static final p1.j0 a(t0.k kVar, u0.p pVar) {
        g0 g0Var = (g0) pVar.j(f32544a);
        switch (kVar.ordinal()) {
            case 0:
                return g0Var.f32539h;
            case 1:
                return g0Var.f32537e;
            case 2:
                return g0Var.g;
            case 3:
                return b(g0Var.f32537e);
            case 4:
                return g0Var.f32533a;
            case 5:
                return b(g0Var.f32533a);
            case 6:
                return m0.e.f28855a;
            case 7:
                return g0Var.f32536d;
            case 8:
                m0.d dVar = g0Var.f32536d;
                m0.b bVar = f0.f32529i;
                return m0.d.b(dVar, bVar, null, null, bVar, 6);
            case 9:
                return g0Var.f32538f;
            case 10:
                m0.d dVar2 = g0Var.f32536d;
                m0.b bVar2 = f0.f32529i;
                return m0.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case 11:
                return b(g0Var.f32536d);
            case 12:
                return g0Var.f32535c;
            case 13:
                return p1.z.f31032b;
            case 14:
                return g0Var.f32534b;
            default:
                throw new ac.m();
        }
    }

    public static m0.d b(m0.d dVar) {
        m0.b bVar = f0.f32529i;
        return m0.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
