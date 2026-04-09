package v1;

import c2.l0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f35617b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f35618c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f35619d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f35620e = p1.s.f31018h;

    /* renamed from: f, reason: collision with root package name */
    public List f35621f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public p1.j f35622h;

    /* renamed from: i, reason: collision with root package name */
    public mk.c f35623i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public String f35624k;

    /* renamed from: l, reason: collision with root package name */
    public float f35625l;

    /* renamed from: m, reason: collision with root package name */
    public float f35626m;

    /* renamed from: n, reason: collision with root package name */
    public float f35627n;

    /* renamed from: o, reason: collision with root package name */
    public float f35628o;

    /* renamed from: p, reason: collision with root package name */
    public float f35629p;

    /* renamed from: q, reason: collision with root package name */
    public float f35630q;

    /* renamed from: r, reason: collision with root package name */
    public float f35631r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35632s;

    public c() {
        int i4 = g0.f35694a;
        this.f35621f = zj.s.f38317a;
        this.g = true;
        this.j = new l0(26, this);
        this.f35624k = "";
        this.f35628o = 1.0f;
        this.f35629p = 1.0f;
        this.f35632s = true;
    }

    @Override // v1.b0
    public final void a(r1.d dVar) {
        if (this.f35632s) {
            float[] fArrI = this.f35617b;
            if (fArrI == null) {
                fArrI = p1.z.i();
                this.f35617b = fArrI;
            } else {
                p1.z.r(fArrI);
            }
            p1.z.x(fArrI, this.f35630q + this.f35626m, this.f35631r + this.f35627n);
            float f10 = this.f35625l;
            if (fArrI.length >= 16) {
                double d10 = f10 * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrI[0];
                float f12 = fArrI[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrI[1];
                float f17 = fArrI[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrI[2];
                float f21 = fArrI[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrI[3];
                float f25 = fArrI[7];
                fArrI[0] = f13;
                fArrI[1] = f18;
                fArrI[2] = f22;
                fArrI[3] = (fSin * f25) + (fCos * f24);
                fArrI[4] = f15;
                fArrI[5] = f19;
                fArrI[6] = f23;
                fArrI[7] = (fCos * f25) + (f14 * f24);
            }
            float f26 = this.f35628o;
            float f27 = this.f35629p;
            if (fArrI.length >= 16) {
                fArrI[0] = fArrI[0] * f26;
                fArrI[1] = fArrI[1] * f26;
                fArrI[2] = fArrI[2] * f26;
                fArrI[3] = fArrI[3] * f26;
                fArrI[4] = fArrI[4] * f27;
                fArrI[5] = fArrI[5] * f27;
                fArrI[6] = fArrI[6] * f27;
                fArrI[7] = fArrI[7] * f27;
                fArrI[8] = fArrI[8] * 1.0f;
                fArrI[9] = fArrI[9] * 1.0f;
                fArrI[10] = fArrI[10] * 1.0f;
                fArrI[11] = fArrI[11] * 1.0f;
            }
            p1.z.x(fArrI, -this.f35626m, -this.f35627n);
            this.f35632s = false;
        }
        if (this.g) {
            if (!this.f35621f.isEmpty()) {
                p1.j jVarA = this.f35622h;
                if (jVarA == null) {
                    jVarA = p1.l.a();
                    this.f35622h = jVarA;
                }
                b.d(this.f35621f, jVarA);
            }
            this.g = false;
        }
        i0.f fVarM = dVar.M();
        long jE = fVarM.E();
        fVarM.x().c();
        try {
            i0.f fVar = (i0.f) ((nm.d0) fVarM.f25416b).f30011b;
            float[] fArr = this.f35617b;
            if (fArr != null) {
                fVar.x().e(fArr);
            }
            p1.j jVar = this.f35622h;
            if (!this.f35621f.isEmpty() && jVar != null) {
                fVar.x().g(jVar);
            }
            ArrayList arrayList = this.f35618c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b0) arrayList.get(i4)).a(dVar);
            }
        } finally {
            fVarM.x().k();
            fVarM.R(jE);
        }
    }

    @Override // v1.b0
    public final mk.c b() {
        return this.f35623i;
    }

    @Override // v1.b0
    public final void d(l0 l0Var) {
        this.f35623i = l0Var;
    }

    public final void e(int i4, b0 b0Var) {
        ArrayList arrayList = this.f35618c;
        if (i4 < arrayList.size()) {
            arrayList.set(i4, b0Var);
        } else {
            arrayList.add(b0Var);
        }
        g(b0Var);
        b0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f35619d && j != 16) {
            long j8 = this.f35620e;
            if (j8 == 16) {
                this.f35620e = j;
                return;
            }
            int i4 = g0.f35694a;
            if (p1.s.h(j8) == p1.s.h(j) && p1.s.g(j8) == p1.s.g(j) && p1.s.e(j8) == p1.s.e(j)) {
                return;
            }
            this.f35619d = false;
            this.f35620e = p1.s.f31018h;
        }
    }

    public final void g(b0 b0Var) {
        if (!(b0Var instanceof g)) {
            if (b0Var instanceof c) {
                c cVar = (c) b0Var;
                if (cVar.f35619d && this.f35619d) {
                    f(cVar.f35620e);
                    return;
                } else {
                    this.f35619d = false;
                    this.f35620e = p1.s.f31018h;
                    return;
                }
            }
            return;
        }
        g gVar = (g) b0Var;
        p1.z zVar = gVar.f35676b;
        if (this.f35619d && zVar != null) {
            if (zVar instanceof p1.l0) {
                f(((p1.l0) zVar).f31002f);
            } else {
                this.f35619d = false;
                this.f35620e = p1.s.f31018h;
            }
        }
        p1.z zVar2 = gVar.g;
        if (this.f35619d && zVar2 != null) {
            if (zVar2 instanceof p1.l0) {
                f(((p1.l0) zVar2).f31002f);
            } else {
                this.f35619d = false;
                this.f35620e = p1.s.f31018h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f35624k);
        ArrayList arrayList = this.f35618c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b0 b0Var = (b0) arrayList.get(i4);
            sb2.append("\t");
            sb2.append(b0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
