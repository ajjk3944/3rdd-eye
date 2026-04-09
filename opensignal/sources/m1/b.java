package m1;

import g1.k0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f16120b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16121c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f16122d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f16123e = g1.r.f9269g;

    /* renamed from: f, reason: collision with root package name */
    public List f16124f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16125g;

    /* renamed from: h, reason: collision with root package name */
    public g1.i f16126h;

    /* renamed from: i, reason: collision with root package name */
    public ar.k f16127i;
    public final j1.a j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public float f16128l;

    /* renamed from: m, reason: collision with root package name */
    public float f16129m;

    /* renamed from: n, reason: collision with root package name */
    public float f16130n;

    /* renamed from: o, reason: collision with root package name */
    public float f16131o;

    /* renamed from: p, reason: collision with root package name */
    public float f16132p;

    /* renamed from: q, reason: collision with root package name */
    public float f16133q;

    /* renamed from: r, reason: collision with root package name */
    public float f16134r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16135s;

    public b() {
        int i10 = f0.f16195a;
        this.f16124f = mq.w.f16945a;
        this.f16125g = true;
        this.j = new j1.a(3, this);
        this.k = "";
        this.f16131o = 1.0f;
        this.f16132p = 1.0f;
        this.f16135s = true;
    }

    @Override // m1.a0
    public final void a(i1.d dVar) {
        if (this.f16135s) {
            float[] fArrG = this.f16120b;
            if (fArrG == null) {
                fArrG = g1.f0.g();
                this.f16120b = fArrG;
            } else {
                g1.f0.m(fArrG);
            }
            g1.f0.v(fArrG, this.f16133q + this.f16129m, this.f16134r + this.f16130n);
            float f10 = this.f16128l;
            if (fArrG.length >= 16) {
                double d6 = f10 * 0.017453292519943295d;
                float fSin = (float) Math.sin(d6);
                float fCos = (float) Math.cos(d6);
                float f11 = fArrG[0];
                float f12 = fArrG[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrG[1];
                float f17 = fArrG[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrG[2];
                float f21 = fArrG[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrG[3];
                float f25 = fArrG[7];
                fArrG[0] = f13;
                fArrG[1] = f18;
                fArrG[2] = f22;
                fArrG[3] = (fSin * f25) + (fCos * f24);
                fArrG[4] = f15;
                fArrG[5] = f19;
                fArrG[6] = f23;
                fArrG[7] = (fCos * f25) + (f14 * f24);
            }
            float f26 = this.f16131o;
            float f27 = this.f16132p;
            if (fArrG.length >= 16) {
                fArrG[0] = fArrG[0] * f26;
                fArrG[1] = fArrG[1] * f26;
                fArrG[2] = fArrG[2] * f26;
                fArrG[3] = fArrG[3] * f26;
                fArrG[4] = fArrG[4] * f27;
                fArrG[5] = fArrG[5] * f27;
                fArrG[6] = fArrG[6] * f27;
                fArrG[7] = fArrG[7] * f27;
                fArrG[8] = fArrG[8] * 1.0f;
                fArrG[9] = fArrG[9] * 1.0f;
                fArrG[10] = fArrG[10] * 1.0f;
                fArrG[11] = fArrG[11] * 1.0f;
            }
            g1.f0.v(fArrG, -this.f16129m, -this.f16130n);
            this.f16135s = false;
        }
        if (this.f16125g) {
            if (!this.f16124f.isEmpty()) {
                g1.i iVarA = this.f16126h;
                if (iVarA == null) {
                    iVarA = g1.l.a();
                    this.f16126h = iVarA;
                }
                a.c(this.f16124f, iVarA);
            }
            this.f16125g = false;
        }
        bm.d dVarA = dVar.A();
        long jH = dVarA.H();
        dVarA.y().g();
        try {
            bm.d dVar2 = (bm.d) ((h7.h0) dVarA.f2826d).f10078a;
            float[] fArr = this.f16120b;
            if (fArr != null) {
                dVar2.y().k(fArr);
            }
            g1.i iVar = this.f16126h;
            if (!this.f16124f.isEmpty() && iVar != null) {
                dVar2.y().i(iVar);
            }
            ArrayList arrayList = this.f16121c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a0) arrayList.get(i10)).a(dVar);
            }
        } finally {
            dVarA.y().n();
            dVarA.R(jH);
        }
    }

    @Override // m1.a0
    public final ar.k b() {
        return this.f16127i;
    }

    @Override // m1.a0
    public final void d(j1.a aVar) {
        this.f16127i = aVar;
    }

    public final void e(int i10, a0 a0Var) {
        ArrayList arrayList = this.f16121c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, a0Var);
        } else {
            arrayList.add(a0Var);
        }
        g(a0Var);
        a0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f16122d && j != 16) {
            long j7 = this.f16123e;
            if (j7 == 16) {
                this.f16123e = j;
                return;
            }
            int i10 = f0.f16195a;
            if (g1.r.h(j7) == g1.r.h(j) && g1.r.g(j7) == g1.r.g(j) && g1.r.e(j7) == g1.r.e(j)) {
                return;
            }
            this.f16122d = false;
            this.f16123e = g1.r.f9269g;
        }
    }

    public final void g(a0 a0Var) {
        if (!(a0Var instanceof f)) {
            if (a0Var instanceof b) {
                b bVar = (b) a0Var;
                if (bVar.f16122d && this.f16122d) {
                    f(bVar.f16123e);
                    return;
                } else {
                    this.f16122d = false;
                    this.f16123e = g1.r.f9269g;
                    return;
                }
            }
            return;
        }
        f fVar = (f) a0Var;
        g1.f0 f0Var = fVar.f16178b;
        if (this.f16122d && f0Var != null) {
            if (f0Var instanceof k0) {
                f(((k0) f0Var).f9254e);
            } else {
                this.f16122d = false;
                this.f16123e = g1.r.f9269g;
            }
        }
        g1.f0 f0Var2 = fVar.f16183g;
        if (this.f16122d && f0Var2 != null) {
            if (f0Var2 instanceof k0) {
                f(((k0) f0Var2).f9254e);
            } else {
                this.f16122d = false;
                this.f16123e = g1.r.f9269g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.k);
        ArrayList arrayList = this.f16121c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(a0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
