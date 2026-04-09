package s0;

import Y0.s;
import Y0.t;
import m0.AbstractC6697d0;
import m0.AbstractC6721p0;
import m0.AbstractC6735w0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.J0;
import m0.K0;
import m0.L0;
import mh.InterfaceC6835l;
import o0.C7034a;
import o0.InterfaceC7039f;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7865a {

    /* renamed from: a, reason: collision with root package name */
    private J0 f60811a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6717n0 f60812b;

    /* renamed from: c, reason: collision with root package name */
    private Y0.d f60813c;

    /* renamed from: d, reason: collision with root package name */
    private t f60814d = t.Ltr;

    /* renamed from: e, reason: collision with root package name */
    private long f60815e = Y0.r.f24545b.a();

    /* renamed from: f, reason: collision with root package name */
    private int f60816f = K0.f52822b.b();

    /* renamed from: g, reason: collision with root package name */
    private final C7034a f60817g = new C7034a();

    private final void a(InterfaceC7039f interfaceC7039f) {
        InterfaceC7039f.u0(interfaceC7039f, C6733v0.f52951b.a(), 0L, 0L, 0.0f, null, null, AbstractC6697d0.f52884a.a(), 62, null);
    }

    public final void b(int i10, long j10, Y0.d dVar, t tVar, InterfaceC6835l interfaceC6835l) {
        this.f60813c = dVar;
        this.f60814d = tVar;
        J0 j0B = this.f60811a;
        InterfaceC6717n0 interfaceC6717n0A = this.f60812b;
        if (j0B == null || interfaceC6717n0A == null || Y0.r.g(j10) > j0B.getWidth() || Y0.r.f(j10) > j0B.getHeight() || !K0.i(this.f60816f, i10)) {
            j0B = L0.b(Y0.r.g(j10), Y0.r.f(j10), i10, false, null, 24, null);
            interfaceC6717n0A = AbstractC6721p0.a(j0B);
            this.f60811a = j0B;
            this.f60812b = interfaceC6717n0A;
            this.f60816f = i10;
        }
        this.f60815e = j10;
        C7034a c7034a = this.f60817g;
        long jD = s.d(j10);
        C7034a.C1996a c1996aB = c7034a.B();
        Y0.d dVarA = c1996aB.a();
        t tVarB = c1996aB.b();
        InterfaceC6717n0 interfaceC6717n0C = c1996aB.c();
        long jD2 = c1996aB.d();
        C7034a.C1996a c1996aB2 = c7034a.B();
        c1996aB2.j(dVar);
        c1996aB2.k(tVar);
        c1996aB2.i(interfaceC6717n0A);
        c1996aB2.l(jD);
        interfaceC6717n0A.j();
        a(c7034a);
        interfaceC6835l.invoke(c7034a);
        interfaceC6717n0A.r();
        C7034a.C1996a c1996aB3 = c7034a.B();
        c1996aB3.j(dVarA);
        c1996aB3.k(tVarB);
        c1996aB3.i(interfaceC6717n0C);
        c1996aB3.l(jD2);
        j0B.a();
    }

    public final void c(InterfaceC7039f interfaceC7039f, float f10, AbstractC6735w0 abstractC6735w0) {
        J0 j02 = this.f60811a;
        if (!(j02 != null)) {
            B0.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC7039f.u1(interfaceC7039f, j02, 0L, this.f60815e, 0L, 0L, f10, null, abstractC6735w0, 0, 0, 858, null);
    }

    public final J0 d() {
        return this.f60811a;
    }
}
