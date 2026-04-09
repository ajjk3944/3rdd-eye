package j2;

import android.os.Build;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.z3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 implements i2.l1 {

    /* renamed from: a, reason: collision with root package name */
    public s1.b f27144a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.x f27145b;

    /* renamed from: c, reason: collision with root package name */
    public final r f27146c;

    /* renamed from: d, reason: collision with root package name */
    public mk.e f27147d;

    /* renamed from: e, reason: collision with root package name */
    public mk.a f27148e;

    /* renamed from: f, reason: collision with root package name */
    public long f27149f;
    public boolean g;

    /* renamed from: i, reason: collision with root package name */
    public float[] f27151i;
    public boolean j;

    /* renamed from: n, reason: collision with root package name */
    public int f27155n;

    /* renamed from: p, reason: collision with root package name */
    public p1.z f27157p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27158q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27159r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27161t;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f27150h = p1.z.i();

    /* renamed from: k, reason: collision with root package name */
    public d3.c f27152k = d5.a();

    /* renamed from: l, reason: collision with root package name */
    public d3.l f27153l = d3.l.f21966a;

    /* renamed from: m, reason: collision with root package name */
    public final r1.b f27154m = new r1.b();

    /* renamed from: o, reason: collision with root package name */
    public long f27156o = p1.m0.f31006a;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27160s = true;

    /* renamed from: u, reason: collision with root package name */
    public final c2.l0 f27162u = new c2.l0(13, this);

    public g1(s1.b bVar, p1.x xVar, r rVar, mk.e eVar, mk.a aVar) {
        this.f27144a = bVar;
        this.f27145b = xVar;
        this.f27146c = rVar;
        this.f27147d = eVar;
        this.f27148e = aVar;
        long j = Integer.MAX_VALUE;
        this.f27149f = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrI = this.f27151i;
        if (fArrI == null) {
            fArrI = p1.z.i();
            this.f27151i = fArrI;
        }
        if (this.f27159r) {
            this.f27159r = false;
            float[] fArrB = b();
            if (this.f27160s) {
                return fArrB;
            }
            if (!d0.m(fArrB, fArrI)) {
                fArrI[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrI[0])) {
            return null;
        }
        return fArrI;
    }

    public final float[] b() {
        boolean z3 = this.f27158q;
        float[] fArr = this.f27150h;
        if (z3) {
            s1.b bVar = this.f27144a;
            long j = bVar.f33250v;
            s1.d dVar = bVar.f33231a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = z3.j(me.t1.F(this.f27149f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float fA = dVar.A();
            float fT = dVar.t();
            float fC = dVar.C();
            float fM = dVar.m();
            float fO = dVar.o();
            float fB = dVar.b();
            float fK = dVar.K();
            double d10 = fC * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fT * fCos) - (0.0f * fSin);
            float f12 = (0.0f * fCos) + (fT * fSin);
            double d11 = fM * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fA * fCos2);
            float f19 = (f12 * fCos2) + ((-fA) * fSin2);
            double d12 = fO * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = ((f14 * fSin3) + (fCos2 * fCos3)) * fB;
            float f23 = fSin3 * fCos * fB;
            float f24 = ((fSin3 * f15) + (fCos3 * f13)) * fB;
            float f25 = f21 * fK;
            float f26 = fCos * fCos3 * fK;
            float f27 = ((fCos3 * f15) + (f20 * f13)) * fK;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.f27158q = false;
            this.f27160s = p1.z.o(fArr);
        }
        return fArr;
    }

    public final void c(o1.a aVar, boolean z3) {
        float[] fArrA = z3 ? a() : b();
        if (this.f27160s) {
            return;
        }
        if (fArrA != null) {
            p1.z.q(fArrA, aVar);
            return;
        }
        aVar.f30360a = 0.0f;
        aVar.f30361b = 0.0f;
        aVar.f30362c = 0.0f;
        aVar.f30363d = 0.0f;
    }

    public final long d(long j, boolean z3) {
        float[] fArrB;
        if (z3) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.f27160s ? j : p1.z.p(fArrB, j);
    }

    public final void e(long j) {
        r rVar = this.f27146c;
        if (rVar.f27272l) {
            rVar.O(-4.0f);
        }
        s1.b bVar = this.f27144a;
        if (!d3.i.a(bVar.f33248t, j)) {
            bVar.f33248t = j;
            bVar.f33231a.l((int) (j >> 32), (int) (j & 4294967295L), bVar.f33249u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m2.a(rVar);
        } else {
            rVar.invalidate();
        }
    }

    public final void f(long j) {
        if (d3.k.a(j, this.f27149f)) {
            return;
        }
        r rVar = this.f27146c;
        if (rVar.f27272l) {
            rVar.O(-4.0f);
        }
        this.f27149f = j;
        if (this.j || this.g) {
            return;
        }
        rVar.invalidate();
        if (true != this.j) {
            this.j = true;
            rVar.z(this, true);
        }
    }

    public final void g() {
        if (this.j) {
            if (this.f27156o != p1.m0.f31006a && !d3.k.a(this.f27144a.f33249u, this.f27149f)) {
                s1.b bVar = this.f27144a;
                float fA = p1.m0.a(this.f27156o) * ((int) (this.f27149f >> 32));
                float fB = p1.m0.b(this.f27156o) * ((int) (this.f27149f & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32);
                if (!o1.b.b(bVar.f33250v, jFloatToRawIntBits)) {
                    bVar.f33250v = jFloatToRawIntBits;
                    bVar.f33231a.p(jFloatToRawIntBits);
                }
            }
            s1.b bVar2 = this.f27144a;
            d3.c cVar = this.f27152k;
            d3.l lVar = this.f27153l;
            long j = this.f27149f;
            long j8 = bVar2.f33249u;
            s1.d dVar = bVar2.f33231a;
            if (!d3.k.a(j8, j)) {
                bVar2.f33249u = j;
                long j9 = bVar2.f33248t;
                dVar.l((int) (j9 >> 32), (int) (4294967295L & j9), j);
                if (bVar2.f33238i == 9205357640488583168L) {
                    bVar2.g = true;
                    bVar2.a();
                }
            }
            bVar2.f33232b = cVar;
            bVar2.f33233c = lVar;
            bVar2.f33234d = this.f27162u;
            dVar.M(cVar, lVar, bVar2, bVar2.f33235e);
            if (this.j) {
                this.j = false;
                this.f27146c.z(this, false);
            }
        }
    }

    @Override // i2.l1
    public final void invalidate() {
        if (this.j || this.g) {
            return;
        }
        r rVar = this.f27146c;
        rVar.invalidate();
        if (true != this.j) {
            this.j = true;
            rVar.z(this, true);
        }
    }
}
