package x9;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 {
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
    public Format P;
    public Format Q;
    public long R;
    public long S;
    public float T;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25102a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25103b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public final List f25104c;

    /* renamed from: d, reason: collision with root package name */
    public final List f25105d;

    /* renamed from: e, reason: collision with root package name */
    public final List f25106e;

    /* renamed from: f, reason: collision with root package name */
    public final List f25107f;

    /* renamed from: g, reason: collision with root package name */
    public final List f25108g;

    /* renamed from: h, reason: collision with root package name */
    public final List f25109h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25110i;
    public long j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25111l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25112m;

    /* renamed from: n, reason: collision with root package name */
    public int f25113n;

    /* renamed from: o, reason: collision with root package name */
    public int f25114o;

    /* renamed from: p, reason: collision with root package name */
    public int f25115p;

    /* renamed from: q, reason: collision with root package name */
    public int f25116q;

    /* renamed from: r, reason: collision with root package name */
    public long f25117r;

    /* renamed from: s, reason: collision with root package name */
    public int f25118s;

    /* renamed from: t, reason: collision with root package name */
    public long f25119t;

    /* renamed from: u, reason: collision with root package name */
    public long f25120u;

    /* renamed from: v, reason: collision with root package name */
    public long f25121v;

    /* renamed from: w, reason: collision with root package name */
    public long f25122w;

    /* renamed from: x, reason: collision with root package name */
    public long f25123x;

    /* renamed from: y, reason: collision with root package name */
    public long f25124y;

    /* renamed from: z, reason: collision with root package name */
    public long f25125z;

    public a0(q qVar, boolean z10) {
        this.f25102a = z10;
        this.f25104c = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f25105d = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f25106e = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f25107f = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f25108g = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        this.f25109h = z10 ? new ArrayList() : Collections.EMPTY_LIST;
        boolean z11 = false;
        this.H = 0;
        this.I = qVar.f25181a;
        this.j = -9223372036854775807L;
        this.f25117r = -9223372036854775807L;
        ya.v vVar = qVar.f25184d;
        if (vVar != null && vVar.a()) {
            z11 = true;
        }
        this.f25110i = z11;
        this.f25120u = -1L;
        this.f25119t = -1L;
        this.f25118s = -1;
        this.T = 1.0f;
    }

    public static boolean c(int i10) {
        return i10 == 6 || i10 == 7 || i10 == 10;
    }

    public final y a(boolean z10) {
        List list;
        long[] jArrCopyOf = this.f25103b;
        List list2 = this.f25105d;
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
            if (this.f25102a && this.H == 3) {
                arrayList.add(b(jElapsedRealtime));
            }
            list = arrayList;
        }
        long[] jArr = jArrCopyOf;
        int i11 = (this.f25112m || !this.k) ? 1 : 0;
        long j = i11 != 0 ? -9223372036854775807L : jArr[2];
        int i12 = jArr[1] > 0 ? 1 : 0;
        List list3 = this.f25106e;
        List arrayList2 = z10 ? list3 : new ArrayList(list3);
        List list4 = this.f25107f;
        List arrayList3 = z10 ? list4 : new ArrayList(list4);
        List list5 = this.f25104c;
        List arrayList4 = z10 ? list5 : new ArrayList(list5);
        long j7 = this.j;
        boolean z11 = this.K;
        int i13 = !this.k ? 1 : 0;
        boolean z12 = this.f25111l;
        int i14 = i11 ^ 1;
        int i15 = this.f25113n;
        int i16 = this.f25114o;
        int i17 = this.f25115p;
        int i18 = this.f25116q;
        long j10 = this.f25117r;
        long j11 = this.f25121v;
        long j12 = this.f25122w;
        long j13 = this.f25123x;
        long j14 = this.f25124y;
        long j15 = this.f25125z;
        long j16 = this.A;
        int i19 = this.f25118s;
        int i20 = i19 == -1 ? 0 : 1;
        long j17 = this.f25119t;
        int i21 = j17 == -1 ? 0 : 1;
        long j18 = this.f25120u;
        int i22 = j18 == -1 ? 0 : 1;
        long j19 = this.B;
        long j20 = this.C;
        long j21 = this.D;
        long j22 = this.E;
        int i23 = this.F;
        return new y(1, jArr, arrayList4, list, j7, z11 ? 1 : 0, i13, z12 ? 1 : 0, i12, j, i14, i15, i16, i17, i18, j10, this.f25110i ? 1 : 0, arrayList2, arrayList3, j11, j12, j13, j14, j15, j16, i20, i21, i19, j17, i22, j18, j19, j20, j21, j22, i23 > 0 ? 1 : 0, i23, this.G, this.f25108g, this.f25109h);
    }

    public final long[] b(long j) {
        List list = this.f25105d;
        return new long[]{j, ((long[]) list.get(list.size() - 1))[1] + ((long) ((j - r0[0]) * this.T))};
    }

    public final void d(long j) {
        Format format;
        int i10;
        if (this.H == 3 && (format = this.Q) != null && (i10 = format.D) != -1) {
            long j7 = (long) ((j - this.S) * this.T);
            this.f25125z += j7;
            this.A = (j7 * i10) + this.A;
        }
        this.S = j;
    }

    public final void e(long j) {
        Format format;
        if (this.H == 3 && (format = this.P) != null) {
            long j7 = (long) ((j - this.R) * this.T);
            int i10 = format.N;
            if (i10 != -1) {
                this.f25121v += j7;
                this.f25122w = (i10 * j7) + this.f25122w;
            }
            int i11 = format.D;
            if (i11 != -1) {
                this.f25123x += j7;
                this.f25124y = (j7 * i11) + this.f25124y;
            }
        }
        this.R = j;
    }

    public final void f(q qVar, Format format) {
        int i10;
        if (qb.v.a(this.Q, format)) {
            return;
        }
        d(qVar.f25181a);
        if (format != null && this.f25120u == -1 && (i10 = format.D) != -1) {
            this.f25120u = i10;
        }
        this.Q = format;
        if (this.f25102a) {
            this.f25107f.add(new w(qVar, format));
        }
    }

    public final void g(long j) {
        if (c(this.H)) {
            long j7 = j - this.O;
            long j10 = this.f25117r;
            if (j10 == -9223372036854775807L || j7 > j10) {
                this.f25117r = j7;
            }
        }
    }

    public final void h(long j, long j7) {
        if (this.f25102a) {
            int i10 = this.H;
            List list = this.f25105d;
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

    public final void i(q qVar, Format format) {
        int i10;
        int i11;
        if (qb.v.a(this.P, format)) {
            return;
        }
        e(qVar.f25181a);
        if (format != null) {
            if (this.f25118s == -1 && (i11 = format.N) != -1) {
                this.f25118s = i11;
            }
            if (this.f25119t == -1 && (i10 = format.D) != -1) {
                this.f25119t = i10;
            }
        }
        this.P = format;
        if (this.f25102a) {
            this.f25106e.add(new w(qVar, format));
        }
    }

    public final void j(q qVar, int i10) {
        long j = qVar.f25181a;
        qb.b.g(j >= this.I);
        long j7 = j - this.I;
        int i11 = this.H;
        long[] jArr = this.f25103b;
        jArr[i11] = jArr[i11] + j7;
        if (this.j == -9223372036854775807L) {
            this.j = j;
        }
        this.f25112m |= ((i11 != 1 && i11 != 2 && i11 != 14) || i10 == 1 || i10 == 2 || i10 == 14 || i10 == 3 || i10 == 4 || i10 == 9 || i10 == 11) ? false : true;
        this.k |= i10 == 3 || i10 == 4 || i10 == 9;
        this.f25111l = (i10 == 11) | this.f25111l;
        if (i11 != 4 && i11 != 7 && (i10 == 4 || i10 == 7)) {
            this.f25113n++;
        }
        if (i10 == 5) {
            this.f25115p++;
        }
        if (!c(i11) && c(i10)) {
            this.f25116q++;
            this.O = j;
        }
        if (c(this.H) && this.H != 7 && i10 == 7) {
            this.f25114o++;
        }
        g(j);
        this.H = i10;
        this.I = j;
        if (this.f25102a) {
            this.f25104c.add(new x(qVar, i10));
        }
    }
}
