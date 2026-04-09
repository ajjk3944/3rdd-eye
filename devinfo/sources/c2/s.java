package c2;

import com.google.android.gms.internal.measurement.i4;
import u0.a1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2683a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2684b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2685c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2686d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2687e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(yb.i iVar, j2.r rVar, boolean z3) {
        byte b10;
        int i4;
        int i10;
        d dVar = (d) this.f2685c;
        i2.o oVar = (i2.o) this.f2687e;
        if (this.f2683a) {
            return 0;
        }
        try {
            this.f2683a = true;
            i4 i4VarY = ((jf.c) this.f2686d).y(iVar, rVar);
            x.o oVar2 = (x.o) i4VarY.f19782c;
            int iK = oVar2.k();
            for (int i11 = 0; i11 < iK; i11++) {
                p pVar = (p) oVar2.l(i11);
                if (!pVar.f2661d && !pVar.f2664h) {
                }
                b10 = false;
                break;
            }
            b10 = true;
            int iK2 = oVar2.k();
            for (int i12 = 0; i12 < iK2; i12++) {
                p pVar2 = (p) oVar2.l(i12);
                if (b10 != false || h0.a(pVar2)) {
                    ((i2.e0) this.f2684b).A(pVar2.f2660c, (i2.o) this.f2687e, pVar2.f2665i, true);
                    if (!oVar.f25725a.h()) {
                        dVar.a(oVar, h0.a(pVar2), pVar2.f2658a);
                        oVar.clear();
                    }
                }
            }
            boolean zB = dVar.b(i4VarY, z3);
            if (i4VarY.f19781b) {
                i4 = 0;
            } else {
                int iK3 = oVar2.k();
                for (int i13 = 0; i13 < iK3; i13++) {
                    p pVar3 = (p) oVar2.l(i13);
                    if (!o1.b.b(h0.f(pVar3, true), 0L) && pVar3.b()) {
                        i4 = 1;
                        break;
                    }
                }
                i4 = 0;
            }
            int iK4 = oVar2.k();
            int i14 = 0;
            while (true) {
                if (i14 >= iK4) {
                    i10 = 0;
                    break;
                }
                if (((p) oVar2.l(i14)).b()) {
                    i10 = 1;
                    break;
                }
                i14++;
            }
            int i15 = (zB ? 1 : 0) | (i4 << 1) | (i10 << 2);
            this.f2683a = false;
            return i15;
        } catch (Throwable th2) {
            this.f2683a = false;
            throw th2;
        }
    }

    public void b(int i4, int i10) {
        if (i4 < 0.0f) {
            f0.a.a("Index should be non-negative (" + i4 + ')');
        }
        ((a1) this.f2684b).h(i4);
        j0.g0 g0Var = (j0.g0) this.f2687e;
        if (i4 != g0Var.f26898b) {
            g0Var.f26898b = i4;
            int i11 = (i4 / 30) * 30;
            g0Var.f26897a.setValue(ci.b.E(Math.max(i11 - 100, 0), i11 + 130));
        }
        ((a1) this.f2685c).h(i10);
    }
}
