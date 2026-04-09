package e5;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public int G;
    public int H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long O;
    public androidx.media3.common.r P;
    public androidx.media3.common.r Q;
    public long R;
    public long S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7874a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7875b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public final List f7876c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7877d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7878e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7879f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7880g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7881h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7882i;
    public long j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7883l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7884m;

    /* renamed from: n, reason: collision with root package name */
    public int f7885n;

    /* renamed from: o, reason: collision with root package name */
    public int f7886o;

    /* renamed from: p, reason: collision with root package name */
    public int f7887p;

    /* renamed from: q, reason: collision with root package name */
    public int f7888q;

    /* renamed from: r, reason: collision with root package name */
    public long f7889r;

    /* renamed from: s, reason: collision with root package name */
    public int f7890s;

    /* renamed from: t, reason: collision with root package name */
    public long f7891t;

    /* renamed from: u, reason: collision with root package name */
    public long f7892u;

    /* renamed from: v, reason: collision with root package name */
    public long f7893v;

    /* renamed from: w, reason: collision with root package name */
    public long f7894w;

    /* renamed from: x, reason: collision with root package name */
    public long f7895x;

    /* renamed from: y, reason: collision with root package name */
    public long f7896y;

    /* renamed from: z, reason: collision with root package name */
    public long f7897z;

    public m0(a aVar, boolean z10) {
        this.f7874a = z10;
        this.f7876c = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f7877d = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f7878e = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f7879f = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f7880g = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f7881h = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        boolean z11 = false;
        this.H = 0;
        this.I = aVar.f7788a;
        this.j = -9223372036854775807L;
        this.f7889r = -9223372036854775807L;
        o5.z zVar = aVar.f7791d;
        if (zVar != null && zVar.a()) {
            z11 = true;
        }
        this.f7882i = z11;
        this.f7892u = -1L;
        this.f7891t = -1L;
        this.f7890s = -1;
        this.T = 1.0f;
    }

    public static boolean c(int i10) {
        return i10 == 6 || i10 == 7 || i10 == 10;
    }

    public final k0 a(boolean z10) {
        List list;
        long[] jArrCopyOf = this.f7875b;
        List list2 = this.f7877d;
        if (z10) {
            list = list2;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, 16);
            long jMax = Math.max(0L, jElapsedRealtime - this.I);
            int i10 = this.H;
            jArrCopyOf[i10] = jArrCopyOf[i10] + jMax;
            g(jElapsedRealtime);
            e(jElapsedRealtime);
            d(jElapsedRealtime);
            ArrayList arrayList = new ArrayList(list2);
            if (this.f7874a && this.H == 3) {
                arrayList.add(b(jElapsedRealtime));
            }
            list = arrayList;
        }
        long[] jArr = jArrCopyOf;
        int i11 = (this.f7884m || !this.k) ? 1 : 0;
        long j = i11 != 0 ? -9223372036854775807L : jArr[2];
        int i12 = jArr[1] > 0 ? 1 : 0;
        List list3 = this.f7878e;
        List arrayList2 = z10 ? list3 : new ArrayList(list3);
        List list4 = this.f7879f;
        List arrayList3 = z10 ? list4 : new ArrayList(list4);
        List list5 = this.f7876c;
        List arrayList4 = z10 ? list5 : new ArrayList(list5);
        long j7 = this.j;
        boolean z11 = this.K;
        int i13 = !this.k ? 1 : 0;
        boolean z12 = this.f7883l;
        int i14 = i11 ^ 1;
        int i15 = this.f7885n;
        int i16 = this.f7886o;
        int i17 = this.f7887p;
        int i18 = this.f7888q;
        long j10 = this.f7889r;
        long j11 = this.f7893v;
        long j12 = this.f7894w;
        long j13 = this.f7895x;
        long j14 = this.f7896y;
        long j15 = this.f7897z;
        long j16 = this.A;
        int i19 = this.f7890s;
        int i20 = i19 == -1 ? 0 : 1;
        long j17 = this.f7891t;
        int i21 = j17 == -1 ? 0 : 1;
        long j18 = this.f7892u;
        int i22 = j18 == -1 ? 0 : 1;
        long j19 = this.B;
        long j20 = this.C;
        long j21 = this.D;
        long j22 = this.E;
        int i23 = this.F;
        return new k0(1, jArr, arrayList4, list, j7, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j, i14, i15, i16, i17, i18, j10, this.f7882i ? 1 : 0, arrayList2, arrayList3, j11, j12, j13, j14, j15, j16, i20, i21, i19, j17, i22, j18, j19, j20, j21, j22, i23 > 0 ? 1 : 0, i23, this.G, this.f7880g, this.f7881h);
    }

    public final long[] b(long j) {
        List list = this.f7877d;
        return new long[]{j, ((long[]) list.get(list.size() - 1))[1] + ((long) ((j - r0[0]) * this.T))};
    }

    public final void d(long j) {
        androidx.media3.common.r rVar;
        int i10;
        if (this.H == 3 && (rVar = this.Q) != null && (i10 = rVar.D) != -1) {
            long j7 = (long) ((j - this.S) * this.T);
            this.f7897z += j7;
            this.A = (j7 * i10) + this.A;
        }
        this.S = j;
    }

    public final void e(long j) {
        androidx.media3.common.r rVar;
        if (this.H == 3 && (rVar = this.P) != null) {
            long j7 = (long) ((j - this.R) * this.T);
            int i10 = rVar.N;
            if (i10 != -1) {
                this.f7893v += j7;
                this.f7894w = (i10 * j7) + this.f7894w;
            }
            int i11 = rVar.D;
            if (i11 != -1) {
                this.f7895x += j7;
                this.f7896y = (j7 * i11) + this.f7896y;
            }
        }
        this.R = j;
    }

    public final void f(a aVar, androidx.media3.common.r rVar) {
        int i10;
        if (a5.d0.a(this.Q, rVar)) {
            return;
        }
        d(aVar.f7788a);
        if (rVar != null && this.f7892u == -1 && (i10 = rVar.D) != -1) {
            this.f7892u = i10;
        }
        this.Q = rVar;
        if (this.f7874a) {
            this.f7879f.add(new i0(aVar, rVar));
        }
    }

    public final void g(long j) {
        if (c(this.H)) {
            long j7 = j - this.O;
            long j10 = this.f7889r;
            if (j10 == -9223372036854775807L || j7 > j10) {
                this.f7889r = j7;
            }
        }
    }

    public final void h(long j, long j7) {
        if (this.f7874a) {
            int i10 = this.H;
            List list = this.f7877d;
            if (i10 != 3) {
                if (j7 == -9223372036854775807L) {
                    return;
                }
                if (!list.isEmpty()) {
                    long j10 = ((long[]) list.get(list.size() - 1))[1];
                    if (j10 != j7) {
                        list.add(new long[]{j, j10});
                    }
                }
            }
            if (j7 != -9223372036854775807L) {
                list.add(new long[]{j, j7});
            } else {
                if (list.isEmpty()) {
                    return;
                }
                list.add(b(j));
            }
        }
    }

    public final void i(a aVar, androidx.media3.common.r rVar) {
        int i10;
        int i11;
        if (a5.d0.a(this.P, rVar)) {
            return;
        }
        e(aVar.f7788a);
        if (rVar != null) {
            if (this.f7890s == -1 && (i11 = rVar.N) != -1) {
                this.f7890s = i11;
            }
            if (this.f7891t == -1 && (i10 = rVar.D) != -1) {
                this.f7891t = i10;
            }
        }
        this.P = rVar;
        if (this.f7874a) {
            this.f7878e.add(new i0(aVar, rVar));
        }
    }

    public final void j(a aVar, int i10) {
        long j = aVar.f7788a;
        a5.a.e(j >= this.I);
        long j7 = j - this.I;
        int i11 = this.H;
        long[] jArr = this.f7875b;
        jArr[i11] = jArr[i11] + j7;
        if (this.j == -9223372036854775807L) {
            this.j = j;
        }
        this.f7884m |= ((i11 != 1 && i11 != 2 && i11 != 14) || i10 == 1 || i10 == 2 || i10 == 14 || i10 == 3 || i10 == 4 || i10 == 9 || i10 == 11) ? false : true;
        this.k |= i10 == 3 || i10 == 4 || i10 == 9;
        this.f7883l = (i10 == 11) | this.f7883l;
        if (i11 != 4 && i11 != 7 && (i10 == 4 || i10 == 7)) {
            this.f7885n++;
        }
        if (i10 == 5) {
            this.f7887p++;
        }
        if (!c(i11) && c(i10)) {
            this.f7888q++;
            this.O = j;
        }
        if (c(this.H) && this.H != 7 && i10 == 7) {
            this.f7886o++;
        }
        g(j);
        this.H = i10;
        this.I = j;
        if (this.f7874a) {
            this.f7876c.add(new j0(aVar, i10));
        }
    }
}
