package y;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import c8.x;
import g1.a0;
import g1.b0;
import g1.f0;
import g1.i0;
import g1.r;
import g1.z;
import x1.h0;
import x1.h1;
import x1.t1;

/* loaded from: classes.dex */
public final class g extends z0.l implements x1.m, h1, t1 {

    /* renamed from: p, reason: collision with root package name */
    public long f25575p;

    /* renamed from: q, reason: collision with root package name */
    public i0 f25576q;

    /* renamed from: r, reason: collision with root package name */
    public long f25577r;

    /* renamed from: s, reason: collision with root package name */
    public t2.i f25578s;

    /* renamed from: t, reason: collision with root package name */
    public f0 f25579t;

    /* renamed from: u, reason: collision with root package name */
    public i0 f25580u;

    /* renamed from: v, reason: collision with root package name */
    public f0 f25581v;

    @Override // x1.h1
    public final void E() {
        this.f25577r = 9205357640488583168L;
        this.f25578s = null;
        this.f25579t = null;
        this.f25580u = null;
        x1.k.j(this);
    }

    @Override // x1.t1
    public final boolean c() {
        return false;
    }

    @Override // x1.m
    public final void d(h0 h0Var) {
        f0 f0Var;
        h0 h0Var2;
        g1.i iVar;
        i1.b bVar = h0Var.f24844b;
        if (this.f25576q != f0.f9213a) {
            if (f1.e.a(bVar.C(), this.f25577r) && h0Var.getLayoutDirection() == this.f25578s && br.l.a(this.f25580u, this.f25576q)) {
                f0Var = this.f25579t;
                br.l.b(f0Var);
            } else {
                x1.k.p(this, new x(this, 5, h0Var));
                f0Var = this.f25581v;
                this.f25581v = null;
            }
            this.f25579t = f0Var;
            this.f25577r = bVar.C();
            this.f25578s = h0Var.getLayoutDirection();
            this.f25580u = this.f25576q;
            br.l.b(f0Var);
            if (!r.c(this.f25575p, r.f9269g)) {
                long j = this.f25575p;
                boolean z10 = f0Var instanceof a0;
                i1.f fVar = i1.f.f11146b;
                if (z10) {
                    f1.c cVar = ((a0) f0Var).f9197e;
                    float f10 = cVar.f8404a;
                    float f11 = cVar.f8405b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f10);
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    float f12 = cVar.f8406c - cVar.f8404a;
                    float f13 = cVar.f8407d - cVar.f8405b;
                    h0Var.m(j, (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), 1.0f, fVar, 3);
                } else {
                    h0Var2 = h0Var;
                    if (f0Var instanceof b0) {
                        b0 b0Var = (b0) f0Var;
                        iVar = b0Var.f9202f;
                        if (iVar == null) {
                            f1.d dVar = b0Var.f9201e;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f8415h >> 32));
                            float f14 = dVar.f8408a;
                            float f15 = dVar.f8409b;
                            long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
                            float fB = dVar.b();
                            float fA = dVar.a();
                            long jFloatToRawIntBits4 = (Float.floatToRawIntBits(fA) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                            long jFloatToRawIntBits5 = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i10 = (int) (jFloatToRawIntBits3 >> 32);
                            int i11 = (int) (jFloatToRawIntBits3 & 4294967295L);
                            bVar.f11140b.f11138c.j(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits5 & 4294967295L)), i1.b.a(bVar, j, fVar, 1.0f, 3));
                            h0Var2 = h0Var;
                        }
                    } else {
                        if (!(f0Var instanceof z)) {
                            throw new bf.n();
                        }
                        iVar = ((z) f0Var).f9276e;
                        h0Var2 = h0Var;
                    }
                    h0Var2.c(iVar, j, fVar);
                }
            }
            h0Var2.a();
        }
        if (!r.c(this.f25575p, r.f9269g)) {
            i1.d.g(h0Var, this.f25575p, 0L, 0.0f, 126);
        }
        h0Var2 = h0Var;
        h0Var2.a();
    }

    @Override // x1.t1
    public final void O(SemanticsConfiguration semanticsConfiguration) {
    }
}
