package d;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import b5.i0;
import g2.j0;
import i2.f1;
import i2.g1;
import j0.b1;
import j0.l0;
import j0.m0;
import j0.x0;
import j0.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static StringBuilder A(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static /* synthetic */ void B(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            a3.a.k((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ void C(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void D(tb.a aVar, Bundle bundle, String str) {
        aVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static String E(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static l0 F(jf.c cVar, int i4) {
        i0.u uVar = (i0.u) cVar.f27642b;
        g1.g gVarF = g1.r.f();
        mk.c cVarE = gVarF != null ? gVarF.e() : null;
        g1.g gVarK = g1.r.k(gVarF);
        try {
            i0.p pVar = (i0.p) uVar.f25513f.getValue();
            g1.r.o(gVarF, gVarK, cVarE);
            m0 m0Var = uVar.f25521p;
            long j = pVar.j;
            boolean z3 = uVar.f25511d;
            b7.w wVar = new b7.w(i4, pVar);
            i0 i0Var = m0Var.f26929c;
            if (i0Var == null) {
                return j0.g.f26896a;
            }
            i0.f fVar = m0Var.f26928b;
            y0 y0Var = (y0) i0Var.f1823d;
            boolean z10 = y0Var instanceof j0.a;
            x0 x0Var = new x0(i0Var, i4, fVar, wVar);
            x0Var.f27011d = new d3.a(j);
            if (!z10) {
                y0Var.a(x0Var);
            } else if (z3) {
                j0.a aVar = (j0.a) y0Var;
                aVar.f26851b.add(new b1(1, x0Var));
                if (!aVar.f26852c) {
                    aVar.f26852c = true;
                    aVar.f26850a.post(aVar);
                }
            } else {
                j0.a aVar2 = (j0.a) y0Var;
                aVar2.f26851b.add(new b1(0, x0Var));
                if (!aVar2.f26852c) {
                    aVar2.f26852c = true;
                    aVar2.f26850a.post(aVar2);
                }
            }
            a4.l.o(i4, "compose:lazy:schedule_prefetch:index");
            return x0Var;
        } catch (Throwable th2) {
            g1.r.o(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    public static i1.n G() {
        if (1.0f <= 0.0d) {
            h0.a.a("invalid weight; must be greater than zero");
        }
        return new g0.u(1.0f, true);
    }

    public static int a(j0 j0Var, g2.q qVar, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new g2.j((g2.i0) list.get(i10), g2.r.f24402b, g2.s.f24406b, 0));
        }
        return j0Var.f(new g2.u(qVar, qVar.getLayoutDirection()), arrayList, d3.b.b(i4, 0, 13)).getHeight();
    }

    public static int b(i2.u uVar, g2.q qVar, g2.i0 i0Var, int i4) {
        return uVar.a0(new g2.u(qVar, qVar.getLayoutDirection()), new g2.j(i0Var, f1.f25666b, g1.f25671b, 1), d3.b.b(i4, 0, 13)).getHeight();
    }

    public static int c(j0 j0Var, g2.q qVar, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new g2.j((g2.i0) list.get(i10), g2.r.f24402b, g2.s.f24405a, 0));
        }
        return j0Var.f(new g2.u(qVar, qVar.getLayoutDirection()), arrayList, d3.b.b(0, i4, 7)).getWidth();
    }

    public static int d(i2.u uVar, g2.q qVar, g2.i0 i0Var, int i4) {
        return uVar.a0(new g2.u(qVar, qVar.getLayoutDirection()), new g2.j(i0Var, f1.f25666b, g1.f25670a, 1), d3.b.b(0, i4, 7)).getWidth();
    }

    public static int e(j0 j0Var, g2.q qVar, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new g2.j((g2.i0) list.get(i10), g2.r.f24401a, g2.s.f24406b, 0));
        }
        return j0Var.f(new g2.u(qVar, qVar.getLayoutDirection()), arrayList, d3.b.b(i4, 0, 13)).getHeight();
    }

    public static int f(i2.u uVar, g2.q qVar, g2.i0 i0Var, int i4) {
        return uVar.a0(new g2.u(qVar, qVar.getLayoutDirection()), new g2.j(i0Var, f1.f25665a, g1.f25671b, 1), d3.b.b(i4, 0, 13)).getHeight();
    }

    public static int g(j0 j0Var, g2.q qVar, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new g2.j((g2.i0) list.get(i10), g2.r.f24401a, g2.s.f24405a, 0));
        }
        return j0Var.f(new g2.u(qVar, qVar.getLayoutDirection()), arrayList, d3.b.b(0, i4, 7)).getWidth();
    }

    public static int h(i2.u uVar, g2.q qVar, g2.i0 i0Var, int i4) {
        return uVar.a0(new g2.u(qVar, qVar.getLayoutDirection()), new g2.j(i0Var, f1.f25665a, g1.f25670a, 1), d3.b.b(0, i4, 7)).getWidth();
    }

    public static int i(d3.c cVar, float f10) {
        float fI = cVar.I(f10);
        if (Float.isInfinite(fI)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fI);
    }

    public static i1.n j(i1.n nVar, i1.n nVar2) {
        return nVar2 == i1.k.f25553a ? nVar : new i1.g(nVar, nVar2);
    }

    public static float k(long j, d3.c cVar) {
        float fC;
        float F;
        if (!d3.o.a(d3.n.b(j), 4294967296L)) {
            d3.h.b("Only Sp can convert to Px");
        }
        float[] fArr = e3.b.f22294a;
        if (cVar.F() >= 1.03f) {
            e3.a aVarA = e3.b.a(cVar.F());
            fC = d3.n.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            F = cVar.F();
        } else {
            fC = d3.n.c(j);
            F = cVar.F();
        }
        return F * fC;
    }

    public static float l(long j, d3.c cVar) {
        if (!d3.o.a(d3.n.b(j), 4294967296L)) {
            d3.h.b("Only Sp can convert to Px");
        }
        return cVar.I(cVar.o(j));
    }

    public static long m(long j, d3.c cVar) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fI = cVar.I(Float.intBitsToFloat((int) (j >> 32)));
        float fI2 = cVar.I(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(fI) << 32) | (Float.floatToRawIntBits(fI2) & 4294967295L);
    }

    public static long n(d3.c cVar, float f10) {
        float[] fArr = e3.b.f22294a;
        if (cVar.F() < 1.03f) {
            return nh.a.p(4294967296L, f10 / cVar.F());
        }
        e3.a aVarA = e3.b.a(cVar.F());
        return nh.a.p(4294967296L, aVarA != null ? aVarA.a(f10) : f10 / cVar.F());
    }

    public static ac.m o(String str) {
        f2.a.c(str);
        return new ac.m();
    }

    public static String p(char c9, String str, String str2) {
        return str + str2 + c9;
    }

    public static String q(int i4, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i4);
        return sb2.toString();
    }

    public static String r(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static String t(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String u(StringBuilder sb2, int i4, char c9) {
        sb2.append(i4);
        sb2.append(c9);
        return sb2.toString();
    }

    public static String v(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static String w(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String x(StringBuilder sb2, boolean z3, char c9) {
        sb2.append(z3);
        sb2.append(c9);
        return sb2.toString();
    }

    public static StringBuilder y(long j, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }
}
