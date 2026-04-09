package y1;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class k1 implements x1.l1 {
    public boolean B;
    public float[] E;
    public boolean F;
    public int J;
    public g1.f0 L;
    public boolean M;
    public boolean N;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public j1.c f25727a;

    /* renamed from: d, reason: collision with root package name */
    public final g1.w f25728d;

    /* renamed from: g, reason: collision with root package name */
    public final AndroidComposeView f25729g;

    /* renamed from: r, reason: collision with root package name */
    public ar.n f25730r;

    /* renamed from: x, reason: collision with root package name */
    public ar.a f25731x;

    /* renamed from: y, reason: collision with root package name */
    public long f25732y;
    public final float[] D = g1.f0.g();
    public t2.c G = new t2.d(1.0f, 1.0f);
    public t2.i H = t2.i.Ltr;
    public final i1.b I = new i1.b();
    public long K = g1.l0.f9255a;
    public boolean O = true;
    public final j1.a Q = new j1.a(29, this);

    public k1(j1.c cVar, g1.w wVar, AndroidComposeView androidComposeView, ar.n nVar, ar.a aVar) {
        this.f25727a = cVar;
        this.f25728d = wVar;
        this.f25729g = androidComposeView;
        this.f25730r = nVar;
        this.f25731x = aVar;
        long j = Integer.MAX_VALUE;
        this.f25732y = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrG = this.E;
        if (fArrG == null) {
            fArrG = g1.f0.g();
            this.E = fArrG;
        }
        if (this.N) {
            this.N = false;
            float[] fArrB = b();
            if (this.O) {
                return fArrB;
            }
            if (!e0.o(fArrB, fArrG)) {
                fArrG[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrG[0])) {
            return null;
        }
        return fArrG;
    }

    public final float[] b() {
        boolean z10 = this.M;
        float[] fArr = this.D;
        if (z10) {
            j1.c cVar = this.f25727a;
            long jP = cVar.f13069v;
            j1.e eVar = cVar.f13050a;
            if ((9223372034707292159L & jP) == 9205357640488583168L) {
                jP = lf.t1.p(kc.f.V(this.f25732y));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L));
            float fB = eVar.B();
            float fR = eVar.r();
            float fE = eVar.E();
            float fK = eVar.k();
            float fM = eVar.m();
            float fB2 = eVar.b();
            float fL = eVar.L();
            double d6 = fE * 0.017453292519943295d;
            float fSin = (float) Math.sin(d6);
            float fCos = (float) Math.cos(d6);
            float f10 = -fSin;
            float f11 = (fR * fCos) - (1.0f * fSin);
            float f12 = (1.0f * fCos) + (fR * fSin);
            double d10 = fK * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d10);
            float fCos2 = (float) Math.cos(d10);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fB * fCos2);
            float f19 = (f12 * fCos2) + ((-fB) * fSin2);
            double d11 = fM * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d11);
            float fCos3 = (float) Math.cos(d11);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = ((f14 * fSin3) + (fCos2 * fCos3)) * fB2;
            float f23 = fSin3 * fCos * fB2;
            float f24 = ((fSin3 * f15) + (fCos3 * f13)) * fB2;
            float f25 = f21 * fL;
            float f26 = fCos * fCos3 * fL;
            float f27 = ((fCos3 * f15) + (f20 * f13)) * fL;
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
            this.M = false;
            this.O = g1.f0.j(fArr);
        }
        return fArr;
    }

    public final long c(long j, boolean z10) {
        float[] fArrB;
        if (z10) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.O ? j : g1.f0.k(j, fArrB);
    }

    public final void d(long j) {
        AndroidComposeView androidComposeView = this.f25729g;
        if (androidComposeView.f1186y) {
            androidComposeView.G(-4.0f);
        }
        j1.c cVar = this.f25727a;
        if (!i3.g.l(cVar.f13067t, j)) {
            cVar.f13067t = j;
            cVar.f13050a.j((int) (j >> 32), (int) (j & 4294967295L), cVar.f13068u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            androidComposeView.invalidate();
            return;
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void e(long j) {
        if (ir.f0.t(j, this.f25732y)) {
            return;
        }
        AndroidComposeView androidComposeView = this.f25729g;
        if (androidComposeView.f1186y) {
            androidComposeView.G(-4.0f);
        }
        this.f25732y = j;
        if (this.F || this.B) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.F) {
            this.F = true;
            androidComposeView.s(this, true);
        }
    }

    public final void f() {
        if (this.F) {
            if (this.K != g1.l0.f9255a && !ir.f0.t(this.f25727a.f13068u, this.f25732y)) {
                j1.c cVar = this.f25727a;
                float fA = g1.l0.a(this.K) * ((int) (this.f25732y >> 32));
                float fB = g1.l0.b(this.K) * ((int) (this.f25732y & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32);
                if (!f1.b.a(cVar.f13069v, jFloatToRawIntBits)) {
                    cVar.f13069v = jFloatToRawIntBits;
                    cVar.f13050a.n(jFloatToRawIntBits);
                }
            }
            j1.c cVar2 = this.f25727a;
            t2.c cVar3 = this.G;
            t2.i iVar = this.H;
            long j = this.f25732y;
            long j7 = cVar2.f13068u;
            j1.e eVar = cVar2.f13050a;
            if (!ir.f0.t(j7, j)) {
                cVar2.f13068u = j;
                long j10 = cVar2.f13067t;
                eVar.j((int) (j10 >> 32), (int) (4294967295L & j10), j);
                if (cVar2.f13058i == 9205357640488583168L) {
                    cVar2.f13056g = true;
                    cVar2.a();
                }
            }
            cVar2.f13051b = cVar3;
            cVar2.f13052c = iVar;
            cVar2.f13053d = this.Q;
            eVar.x(cVar3, iVar, cVar2, cVar2.f13054e);
            if (this.F) {
                this.F = false;
                this.f25729g.s(this, false);
            }
        }
    }

    @Override // x1.l1
    public final void invalidate() {
        if (this.F || this.B) {
            return;
        }
        AndroidComposeView androidComposeView = this.f25729g;
        androidComposeView.invalidate();
        if (true != this.F) {
            this.F = true;
            androidComposeView.s(this, true);
        }
    }
}
