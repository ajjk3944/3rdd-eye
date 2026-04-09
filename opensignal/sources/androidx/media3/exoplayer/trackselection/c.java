package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.os.SystemClock;
import androidx.media3.common.b1;
import java.util.ArrayList;
import java.util.List;
import oe.e0;
import oe.h0;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    public final r5.d f1864h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1865i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1866l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1867m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1868n;

    /* renamed from: o, reason: collision with root package name */
    public final float f1869o;

    /* renamed from: p, reason: collision with root package name */
    public final h0 f1870p;

    /* renamed from: q, reason: collision with root package name */
    public final a5.x f1871q;

    /* renamed from: r, reason: collision with root package name */
    public float f1872r;

    /* renamed from: s, reason: collision with root package name */
    public int f1873s;

    /* renamed from: t, reason: collision with root package name */
    public int f1874t;

    /* renamed from: u, reason: collision with root package name */
    public long f1875u;

    /* renamed from: v, reason: collision with root package name */
    public p5.l f1876v;

    public c(b1 b1Var, int[] iArr, int i10, r5.d dVar, long j, long j7, long j10, float f10, h0 h0Var) {
        super(i10, b1Var, iArr);
        if (j10 < j) {
            a5.a.B("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j10 = j;
        }
        this.f1864h = dVar;
        this.f1865i = j * 1000;
        this.j = j7 * 1000;
        this.k = j10 * 1000;
        this.f1866l = 1279;
        this.f1867m = 719;
        this.f1868n = f10;
        this.f1869o = 0.75f;
        this.f1870p = h0.l(h0Var);
        this.f1871q = a5.b.f92a;
        this.f1872r = 1.0f;
        this.f1874t = 0;
        this.f1875u = -9223372036854775807L;
    }

    public static void q(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j7 : jArr) {
            j += j7;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            if (e0Var != null) {
                e0Var.a(new a(j, jArr[i10]));
            }
        }
    }

    public static long s(List list) {
        if (!list.isEmpty()) {
            p5.l lVar = (p5.l) oe.s.i(list);
            long j = lVar.B;
            if (j != -9223372036854775807L) {
                long j7 = lVar.D;
                if (j7 != -9223372036854775807L) {
                    return j7 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int a() {
        return this.f1873s;
    }

    @Override // androidx.media3.exoplayer.trackselection.e, androidx.media3.exoplayer.trackselection.v
    public final void b() {
        this.f1875u = -9223372036854775807L;
        this.f1876v = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.e, androidx.media3.exoplayer.trackselection.v
    public final int c(long j, List list) {
        int i10;
        int i11;
        this.f1871q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = this.f1875u;
        if (j7 != -9223372036854775807L && jElapsedRealtime - j7 < 1000 && (list.isEmpty() || ((p5.l) oe.s.i(list)).equals(this.f1876v))) {
            return list.size();
        }
        this.f1875u = jElapsedRealtime;
        this.f1876v = list.isEmpty() ? null : (p5.l) oe.s.i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = d0.x(((p5.l) list.get(size - 1)).B - j, this.f1872r);
        long j10 = this.k;
        if (jX >= j10) {
            s(list);
            androidx.media3.common.r rVar = this.f1887e[r(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                p5.l lVar = (p5.l) list.get(i12);
                androidx.media3.common.r rVar2 = lVar.f20267r;
                if (d0.x(lVar.B - j, this.f1872r) >= j10 && rVar2.D < rVar.D && (i10 = rVar2.N) != -1 && i10 <= this.f1867m && (i11 = rVar2.M) != -1 && i11 <= this.f1866l && i10 < rVar.N) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.e, androidx.media3.exoplayer.trackselection.v
    public final void d() {
        this.f1876v = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final int e() {
        return this.f1874t;
    }

    @Override // androidx.media3.exoplayer.trackselection.e, androidx.media3.exoplayer.trackselection.v
    public final void f(float f10) {
        this.f1872r = f10;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final Object g() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.v
    public final void h(long j, long j7, long j10, List list, p5.m[] mVarArr) {
        long jS;
        this.f1871q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f1873s;
        if (i10 >= mVarArr.length || !mVarArr[i10].next()) {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jS = s(list);
                    break;
                }
                p5.m mVar = mVarArr[i11];
                if (mVar.next()) {
                    jS = mVar.b() - mVar.a();
                    break;
                }
                i11++;
            }
        } else {
            p5.m mVar2 = mVarArr[this.f1873s];
            jS = mVar2.b() - mVar2.a();
        }
        int i12 = this.f1874t;
        if (i12 == 0) {
            this.f1874t = 1;
            this.f1873s = r(jElapsedRealtime);
            return;
        }
        int i13 = this.f1873s;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((p5.l) oe.s.i(list)).f20267r);
        if (iIndexOf != -1) {
            i12 = ((p5.l) oe.s.i(list)).f20268x;
            i13 = iIndexOf;
        }
        int iR = r(jElapsedRealtime);
        if (!k(i13, jElapsedRealtime)) {
            androidx.media3.common.r[] rVarArr = this.f1887e;
            androidx.media3.common.r rVar = rVarArr[i13];
            androidx.media3.common.r rVar2 = rVarArr[iR];
            long jMin = this.f1865i;
            if (j10 != -9223372036854775807L) {
                jMin = Math.min((long) ((jS != -9223372036854775807L ? j10 - jS : j10) * this.f1869o), jMin);
            }
            int i14 = rVar2.D;
            int i15 = rVar.D;
            if ((i14 > i15 && j7 < jMin) || (i14 < i15 && j7 >= this.j)) {
                iR = i13;
            }
        }
        if (iR != i13) {
            i12 = 3;
        }
        this.f1874t = i12;
        this.f1873s = iR;
    }

    public final int r(long j) {
        long jB = (long) (((long) (this.f1864h.b() * this.f1868n)) / this.f1872r);
        h0 h0Var = this.f1870p;
        if (!h0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < h0Var.size() - 1 && ((a) h0Var.get(i10)).f1858a < jB) {
                i10++;
            }
            a aVar = (a) h0Var.get(i10 - 1);
            a aVar2 = (a) h0Var.get(i10);
            long j7 = aVar.f1858a;
            long j10 = aVar.f1859b;
            jB = ((long) (((jB - j7) / (aVar2.f1858a - j7)) * (aVar2.f1859b - j10))) + j10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1884b; i12++) {
            if (j == Long.MIN_VALUE || !k(i12, j)) {
                if (this.f1887e[i12].D <= jB) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
