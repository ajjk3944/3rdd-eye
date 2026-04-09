package i0;

import androidx.recyclerview.widget.LinearLayoutManager;
import g2.r0;
import g2.s0;
import g2.t0;
import g2.u0;
import j0.y;
import java.util.List;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f25479a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25480b;

    /* renamed from: c, reason: collision with root package name */
    public final i1.c f25481c;

    /* renamed from: d, reason: collision with root package name */
    public final d3.l f25482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25483e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25484f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final long f25485h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f25486i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final y f25487k;

    /* renamed from: l, reason: collision with root package name */
    public final long f25488l;

    /* renamed from: m, reason: collision with root package name */
    public int f25489m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25490n;

    /* renamed from: o, reason: collision with root package name */
    public final int f25491o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25492p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25493q;

    /* renamed from: r, reason: collision with root package name */
    public int f25494r = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: s, reason: collision with root package name */
    public int f25495s;

    /* renamed from: t, reason: collision with root package name */
    public int f25496t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f25497u;

    public q(int i4, List list, i1.c cVar, d3.l lVar, int i10, int i11, int i12, long j, Object obj, Object obj2, y yVar, long j8) {
        this.f25479a = i4;
        this.f25480b = list;
        this.f25481c = cVar;
        this.f25482d = lVar;
        this.f25483e = i10;
        this.f25484f = i11;
        this.g = i12;
        this.f25485h = j;
        this.f25486i = obj;
        this.j = obj2;
        this.f25487k = yVar;
        this.f25488l = j8;
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            s0 s0Var = (s0) list.get(i14);
            i13 += s0Var.f24409b;
            iMax = Math.max(iMax, s0Var.f24408a);
        }
        this.f25490n = i13;
        int i15 = i13 + this.g;
        this.f25491o = i15 >= 0 ? i15 : 0;
        this.f25492p = iMax;
        this.f25497u = new int[this.f25480b.size() * 2];
    }

    public final long a(int i4) {
        int i10;
        long j;
        if (i4 == 0 && this.f25480b.size() == 0) {
            i10 = this.f25489m;
            j = 0;
        } else {
            int i11 = i4 * 2;
            int[] iArr = this.f25497u;
            int i12 = iArr[i11];
            i10 = iArr[i11 + 1];
            j = i12;
        }
        return (4294967295L & i10) | (j << 32);
    }

    public final void b(r0 r0Var, boolean z3) {
        List list;
        int i4;
        t0 t0Var = t0.f24417b;
        if (this.f25494r == Integer.MIN_VALUE) {
            f0.a.a("position() should be called first");
        }
        List list2 = this.f25480b;
        int size = list2.size();
        int i10 = 0;
        while (i10 < size) {
            s0 s0Var = (s0) list2.get(i10);
            int i11 = this.f25495s - s0Var.f24409b;
            int i12 = this.f25496t;
            long jA = a(i10);
            j0.w wVar = (j0.w) this.f25487k.f27024a.g(this.f25486i);
            s1.b bVar = null;
            byte b10 = 0;
            j0.s sVar = wVar != null ? wVar.f26993a[i10] : null;
            if (sVar != null) {
                if (z3) {
                    sVar.f26973r = jA;
                    list = list2;
                    i4 = size;
                } else {
                    list = list2;
                    i4 = size;
                    if (!d3.i.a(sVar.f26973r, j0.s.f26956s)) {
                        jA = sVar.f26973r;
                    }
                    long jC = d3.i.c(jA, ((d3.i) sVar.f26972q.getValue()).f21959a);
                    int i13 = (int) (jA & 4294967295L);
                    if (((i13 <= i11 && ((int) (jC & 4294967295L)) <= i11) || (i13 >= i12 && ((int) (jC & 4294967295L)) >= i12)) && ((Boolean) sVar.f26964h.getValue()).booleanValue()) {
                        x.v(sVar.f26958a, null, null, new j0.q(sVar, b10 == true ? 1 : 0, 1), 3);
                    }
                    jA = jC;
                }
                bVar = sVar.f26969n;
            } else {
                list = list2;
                i4 = size;
            }
            long jC2 = d3.i.c(jA, this.f25485h);
            if (!z3 && sVar != null) {
                sVar.f26968m = jC2;
            }
            if (bVar != null) {
                r0Var.getClass();
                r0.b(r0Var, s0Var);
                s0Var.S(d3.i.c(jC2, s0Var.f24412e), 0.0f, bVar);
            } else {
                int i14 = u0.f24423b;
                r0Var.getClass();
                r0.b(r0Var, s0Var);
                s0Var.R(d3.i.c(jC2, s0Var.f24412e), 0.0f, t0Var);
            }
            i10++;
            list2 = list;
            size = i4;
        }
    }

    public final void c(int i4, int i10, int i11) {
        this.f25489m = i4;
        this.f25494r = i11;
        List list = this.f25480b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            s0 s0Var = (s0) list.get(i12);
            int i13 = i12 * 2;
            i1.c cVar = this.f25481c;
            if (cVar == null) {
                f0.a.b("null horizontalAlignment when isVertical == true");
                throw new ac.m();
            }
            int i14 = s0Var.f24408a;
            float f10 = cVar.f25542a;
            float f11 = (i10 - i14) / 2.0f;
            if (this.f25482d != d3.l.f21966a) {
                f10 *= -1;
            }
            int iRound = Math.round((1 + f10) * f11);
            int[] iArr = this.f25497u;
            iArr[i13] = iRound;
            iArr[i13 + 1] = i4;
            i4 += s0Var.f24409b;
        }
        this.f25495s = -this.f25483e;
        this.f25496t = this.f25494r + this.f25484f;
    }
}
