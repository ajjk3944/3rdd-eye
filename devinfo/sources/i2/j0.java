package i2;

import com.google.android.gms.internal.ads.be1;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 implements d3.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25692a;

    /* renamed from: b, reason: collision with root package name */
    public long f25693b = 9223372034707292159L;

    /* renamed from: c, reason: collision with root package name */
    public long f25694c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f25695d;

    public j0(m0 m0Var) {
        this.f25695d = m0Var;
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return this.f25695d.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return this.f25695d.a();
    }

    public final void b(g2.n nVar, float f10) {
        m0 m0Var = this.f25695d;
        be1 be1Var = m0Var.f25714m;
        if (be1Var == null) {
            be1Var = new be1();
            m0Var.f25714m = be1Var;
        }
        int iB0 = zj.m.b0(nVar, (g2.n[]) be1Var.f9658b);
        if (iB0 >= 0) {
            float[] fArr = (float[]) be1Var.f9659c;
            if (fArr[iB0] != f10) {
                fArr[iB0] = f10;
                ((byte[]) be1Var.f9660d)[iB0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) be1Var.f9660d;
                if (bArr[iB0] == 2) {
                    bArr[iB0] = 0;
                    return;
                }
                return;
            }
        }
        int i4 = be1Var.f9657a;
        g2.n[] nVarArr = (g2.n[]) be1Var.f9658b;
        if (i4 == nVarArr.length) {
            int i10 = i4 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(nVarArr, i10);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            be1Var.f9658b = (g2.n[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) be1Var.f9659c, i10);
            nk.k.d(fArrCopyOf, "copyOf(...)");
            be1Var.f9659c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) be1Var.f9660d, i10);
            nk.k.d(bArrCopyOf, "copyOf(...)");
            be1Var.f9660d = bArrCopyOf;
        }
        ((g2.n[]) be1Var.f9658b)[i4] = nVar;
        ((byte[]) be1Var.f9660d)[i4] = 3;
        ((float[]) be1Var.f9659c)[i4] = f10;
        be1Var.f9657a++;
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}
