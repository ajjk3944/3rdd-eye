package o5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class j0 implements x, w {
    public h1 B;
    public x[] D;
    public o2.g E;

    /* renamed from: a, reason: collision with root package name */
    public final x[] f18969a;

    /* renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f18970d;

    /* renamed from: g, reason: collision with root package name */
    public final k f18971g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f18972r = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f18973x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public w f18974y;

    public j0(et.d dVar, long[] jArr, x... xVarArr) {
        this.f18971g = dVar;
        this.f18969a = xVarArr;
        dVar.getClass();
        this.E = new o2.g(1, new z0[0]);
        this.f18970d = new IdentityHashMap();
        this.D = new x[0];
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            long j = jArr[i10];
            if (j != 0) {
                this.f18969a[i10] = new h0(xVarArr[i10], j);
            }
        }
    }

    @Override // o5.x
    public final long C(androidx.media3.exoplayer.trackselection.v[] vVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[vVarArr.length];
        int[] iArr3 = new int[vVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = vVarArr.length;
            identityHashMap = this.f18970d;
            if (i11 >= length) {
                break;
            }
            x0 x0Var = x0VarArr[i11];
            Integer num = x0Var == null ? null : (Integer) identityHashMap.get(x0Var);
            iArr2[i11] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.v vVar = vVarArr[i11];
            if (vVar != null) {
                String str = vVar.getTrackGroup().f1573d;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = vVarArr.length;
        x0[] x0VarArr2 = new x0[length2];
        x0[] x0VarArr3 = new x0[vVarArr.length];
        androidx.media3.exoplayer.trackselection.v[] vVarArr2 = new androidx.media3.exoplayer.trackselection.v[vVarArr.length];
        x[] xVarArr = this.f18969a;
        ArrayList arrayList = new ArrayList(xVarArr.length);
        long j7 = j;
        int i12 = 0;
        while (i12 < xVarArr.length) {
            int i13 = i10;
            while (i13 < vVarArr.length) {
                x0VarArr3[i13] = iArr2[i13] == i12 ? x0VarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    androidx.media3.exoplayer.trackselection.v vVar2 = vVarArr[i13];
                    vVar2.getClass();
                    iArr = iArr2;
                    androidx.media3.common.b1 b1Var = (androidx.media3.common.b1) this.f18973x.get(vVar2.getTrackGroup());
                    b1Var.getClass();
                    vVarArr2[i13] = new g0(vVar2, b1Var);
                } else {
                    iArr = iArr2;
                    vVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            x[] xVarArr2 = xVarArr;
            int i14 = i12;
            long jC = xVarArr2[i12].C(vVarArr2, zArr, x0VarArr3, zArr2, j7);
            if (i14 == 0) {
                j7 = jC;
            } else if (jC != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < vVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    x0 x0Var2 = x0VarArr3[i15];
                    x0Var2.getClass();
                    x0VarArr2[i15] = x0VarArr3[i15];
                    identityHashMap.put(x0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    a5.a.i(x0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(xVarArr2[i14]);
            }
            i12 = i14 + 1;
            xVarArr = xVarArr2;
            iArr2 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(x0VarArr2, i16, x0VarArr, i16, length2);
        x[] xVarArr3 = (x[]) arrayList.toArray(new x[i16]);
        this.D = xVarArr3;
        ((et.d) this.f18971g).getClass();
        this.E = new o2.g(1, xVarArr3);
        return j7;
    }

    @Override // o5.z0
    public final long d() {
        return this.E.d();
    }

    @Override // o5.x
    public final void e() {
        for (x xVar : this.f18969a) {
            xVar.e();
        }
    }

    @Override // o5.x
    public final long f(long j) {
        long jF = this.D[0].f(j);
        int i10 = 1;
        while (true) {
            x[] xVarArr = this.D;
            if (i10 >= xVarArr.length) {
                return jF;
            }
            if (xVarArr[i10].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // o5.x
    public final void g(long j) {
        for (x xVar : this.D) {
            xVar.g(j);
        }
    }

    @Override // o5.z0
    public final boolean i(long j) {
        ArrayList arrayList = this.f18972r;
        if (arrayList.isEmpty()) {
            return this.E.i(j);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((x) arrayList.get(i10)).i(j);
        }
        return false;
    }

    @Override // o5.z0
    public final boolean isLoading() {
        return this.E.isLoading();
    }

    @Override // o5.w
    public final void j(x xVar) {
        ArrayList arrayList = this.f18972r;
        arrayList.remove(xVar);
        if (arrayList.isEmpty()) {
            x[] xVarArr = this.f18969a;
            int i10 = 0;
            for (x xVar2 : xVarArr) {
                i10 += xVar2.l().f18958a;
            }
            androidx.media3.common.b1[] b1VarArr = new androidx.media3.common.b1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < xVarArr.length; i12++) {
                h1 h1VarL = xVarArr[i12].l();
                int i13 = h1VarL.f18958a;
                int i14 = 0;
                while (i14 < i13) {
                    androidx.media3.common.b1 b1VarA = h1VarL.a(i14);
                    androidx.media3.common.b1 b1Var = new androidx.media3.common.b1(i12 + ":" + b1VarA.f1573d, b1VarA.f1575r);
                    this.f18973x.put(b1Var, b1VarA);
                    b1VarArr[i11] = b1Var;
                    i14++;
                    i11++;
                }
            }
            this.B = new h1(b1VarArr);
            w wVar = this.f18974y;
            wVar.getClass();
            wVar.j(this);
        }
    }

    @Override // o5.x
    public final long k() {
        long j = -9223372036854775807L;
        for (x xVar : this.D) {
            long jK = xVar.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && xVar.f(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (x xVar2 : this.D) {
                    if (xVar2 == xVar) {
                        break;
                    }
                    if (xVar2.f(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jK;
            } else if (jK != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // o5.x
    public final h1 l() {
        h1 h1Var = this.B;
        h1Var.getClass();
        return h1Var;
    }

    @Override // o5.z0
    public final long m() {
        return this.E.m();
    }

    @Override // o5.z0
    public final void o(long j) {
        this.E.o(j);
    }

    @Override // o5.x
    public final long p(long j, d5.x0 x0Var) {
        x[] xVarArr = this.D;
        return (xVarArr.length > 0 ? xVarArr[0] : this.f18969a[0]).p(j, x0Var);
    }

    @Override // o5.y0
    public final void r(z0 z0Var) {
        w wVar = this.f18974y;
        wVar.getClass();
        wVar.r(this);
    }

    @Override // o5.x
    public final void t(w wVar, long j) {
        this.f18974y = wVar;
        ArrayList arrayList = this.f18972r;
        x[] xVarArr = this.f18969a;
        Collections.addAll(arrayList, xVarArr);
        for (x xVar : xVarArr) {
            xVar.t(this, j);
        }
    }
}
