package c0;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import i2.h1;
import i2.u1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends i1.m implements i2.l, h1, u1 {

    /* renamed from: o, reason: collision with root package name */
    public long f2481o;

    /* renamed from: p, reason: collision with root package name */
    public p1.j0 f2482p;

    /* renamed from: q, reason: collision with root package name */
    public long f2483q;

    /* renamed from: r, reason: collision with root package name */
    public d3.l f2484r;

    /* renamed from: s, reason: collision with root package name */
    public p1.z f2485s;

    /* renamed from: t, reason: collision with root package name */
    public p1.j0 f2486t;

    /* renamed from: u, reason: collision with root package name */
    public p1.z f2487u;

    @Override // i2.l
    public final void J(i2.g0 g0Var) {
        p1.z zVar;
        r1.b bVar = g0Var.f25668a;
        if (this.f2482p != p1.z.f31032b) {
            if (o1.e.a(bVar.f32718b.E(), this.f2483q) && g0Var.getLayoutDirection() == this.f2484r && nk.k.a(this.f2486t, this.f2482p)) {
                zVar = this.f2485s;
                nk.k.b(zVar);
            } else {
                i2.k.p(this, new p(0, this, g0Var));
                zVar = this.f2487u;
                this.f2487u = null;
            }
            this.f2485s = zVar;
            this.f2483q = bVar.f32718b.E();
            this.f2484r = g0Var.getLayoutDirection();
            this.f2486t = this.f2482p;
            nk.k.b(zVar);
            if (!p1.s.c(this.f2481o, p1.s.f31018h)) {
                long j = this.f2481o;
                boolean z3 = zVar instanceof p1.e0;
                r1.f fVar = r1.f.f32723b;
                if (z3) {
                    o1.c cVar = ((p1.e0) zVar).f30955f;
                    float f10 = cVar.f30366a;
                    float f11 = cVar.f30367b;
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(f11));
                    float f12 = cVar.f30368c - cVar.f30366a;
                    float f13 = cVar.f30369d - cVar.f30367b;
                    g0Var.k(j, jFloatToRawIntBits, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), fVar, 3);
                } else if (zVar instanceof p1.f0) {
                    p1.f0 f0Var = (p1.f0) zVar;
                    p1.j jVar = f0Var.g;
                    if (jVar != null) {
                        g0Var.e(jVar, j, fVar);
                    } else {
                        o1.d dVar = f0Var.f30962f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f30376h >> 32));
                        float f14 = dVar.f30370a;
                        float f15 = dVar.f30371b;
                        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
                        float fB = dVar.b();
                        float fA = dVar.a();
                        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fA) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                        long jFloatToRawIntBits4 = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        int i4 = (int) (jFloatToRawIntBits2 >> 32);
                        int i10 = (int) (jFloatToRawIntBits2 & 4294967295L);
                        bVar.f32717a.f32715c.l(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), r1.b.b(bVar, j, fVar, 3));
                    }
                } else {
                    if (!(zVar instanceof p1.d0)) {
                        throw new ac.m();
                    }
                    g0Var.e(((p1.d0) zVar).f30953f, j, fVar);
                }
            }
        } else if (!p1.s.c(this.f2481o, p1.s.f31018h)) {
            je.u.g(g0Var, this.f2481o, 0L, WebSocketProtocol.PAYLOAD_SHORT);
        }
        g0Var.b();
    }

    @Override // i2.h1
    public final void P() {
        this.f2483q = 9205357640488583168L;
        this.f2484r = null;
        this.f2485s = null;
        this.f2486t = null;
        i2.k.j(this);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // i2.u1
    public final boolean b() {
        return false;
    }

    @Override // i2.u1
    public final void l(p2.x xVar) {
        p2.v.b(xVar, this.f2482p);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // i2.l
    public final /* synthetic */ void z() {
    }
}
