package i0;

import d0.a1;
import g2.k0;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f25464a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25465b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25466c;

    /* renamed from: d, reason: collision with root package name */
    public final float f25467d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f25468e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25469f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final xk.v f25470h;

    /* renamed from: i, reason: collision with root package name */
    public final d3.c f25471i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f25472k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25473l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25474m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25475n;

    /* renamed from: o, reason: collision with root package name */
    public final a1 f25476o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25477p;

    /* renamed from: q, reason: collision with root package name */
    public final int f25478q;

    public p(q qVar, int i4, boolean z3, float f10, k0 k0Var, float f11, boolean z10, xk.v vVar, d3.c cVar, long j, List list, int i10, int i11, int i12, a1 a1Var, int i13, int i14) {
        this.f25464a = qVar;
        this.f25465b = i4;
        this.f25466c = z3;
        this.f25467d = f10;
        this.f25468e = k0Var;
        this.f25469f = f11;
        this.g = z10;
        this.f25470h = vVar;
        this.f25471i = cVar;
        this.j = j;
        this.f25472k = list;
        this.f25473l = i10;
        this.f25474m = i11;
        this.f25475n = i12;
        this.f25476o = a1Var;
        this.f25477p = i13;
        this.f25478q = i14;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final p a(int i4, boolean z3) {
        q qVar;
        int i10;
        if (this.g) {
            return null;
        }
        ?? r22 = this.f25472k;
        if (r22.isEmpty() || (qVar = this.f25464a) == null) {
            return null;
        }
        int i11 = qVar.f25491o;
        int i12 = this.f25465b - i4;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        q qVar2 = (q) zj.n.c0(r22);
        q qVar3 = (q) zj.n.h0(r22);
        if (qVar2.f25493q || qVar3.f25493q) {
            return null;
        }
        int i13 = this.f25474m;
        int i14 = this.f25473l;
        if (i4 < 0) {
            if (Math.min((qVar2.f25489m + qVar2.f25491o) - i14, (qVar3.f25489m + qVar3.f25491o) - i13) <= (-i4)) {
                return null;
            }
        } else if (Math.min(i14 - qVar2.f25489m, i13 - qVar3.f25489m) <= i4) {
            return null;
        }
        int size = r22.size();
        int i15 = 0;
        while (i15 < size) {
            q qVar4 = (q) r22.get(i15);
            qVar4.getClass();
            int[] iArr = qVar4.f25497u;
            if (!qVar4.f25493q) {
                qVar4.f25489m += i4;
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    if ((i16 & 1) != 0) {
                        iArr[i16] = iArr[i16] + i4;
                    }
                }
                if (z3) {
                    int size2 = qVar4.f25480b.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        j0.w wVar = (j0.w) qVar4.f25487k.f27024a.g(qVar4.f25486i);
                        j0.s sVar = wVar != null ? wVar.f26993a[i17] : null;
                        if (sVar != null) {
                            long j = sVar.f26967l;
                            i10 = size;
                            sVar.f26967l = ((((int) (j & 4294967295L)) + i4) & 4294967295L) | (((int) (j >> 32)) << 32);
                        } else {
                            i10 = size;
                        }
                        i17++;
                        size = i10;
                    }
                }
            }
            i15++;
            size = size;
        }
        return new p(this.f25464a, i12, this.f25466c || i4 > 0, i4, this.f25468e, this.f25469f, this.g, this.f25470h, this.f25471i, this.j, r22, this.f25473l, this.f25474m, this.f25475n, this.f25476o, this.f25477p, this.f25478q);
    }

    @Override // g2.k0
    public final Map b() {
        return this.f25468e.b();
    }

    @Override // g2.k0
    public final void c() {
        this.f25468e.c();
    }

    @Override // g2.k0
    public final mk.c d() {
        return this.f25468e.d();
    }

    public final long e() {
        k0 k0Var = this.f25468e;
        return (k0Var.getWidth() << 32) | (k0Var.getHeight() & 4294967295L);
    }

    @Override // g2.k0
    public final int getHeight() {
        return this.f25468e.getHeight();
    }

    @Override // g2.k0
    public final int getWidth() {
        return this.f25468e.getWidth();
    }
}
