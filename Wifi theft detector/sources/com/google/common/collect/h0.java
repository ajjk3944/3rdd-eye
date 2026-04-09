package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.e0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f12045a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f12046b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f12047c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f12048d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f12049e;

    /* renamed from: f, reason: collision with root package name */
    public transient long[] f12050f;

    /* renamed from: g, reason: collision with root package name */
    public transient float f12051g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f12052h;

    public class a extends Multisets.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f12053a;

        /* renamed from: b, reason: collision with root package name */
        public int f12054b;

        public a(int i10) {
            this.f12053a = h0.this.f12045a[i10];
            this.f12054b = i10;
        }

        @Override // com.google.common.collect.e0.a
        public Object d() {
            return this.f12053a;
        }

        public void g() {
            int i10 = this.f12054b;
            if (i10 == -1 || i10 >= h0.this.z() || !com.google.common.base.f.a(this.f12053a, h0.this.f12045a[this.f12054b])) {
                this.f12054b = h0.this.j(this.f12053a);
            }
        }

        @Override // com.google.common.collect.e0.a
        public int getCount() {
            g();
            int i10 = this.f12054b;
            if (i10 == -1) {
                return 0;
            }
            return h0.this.f12046b[i10];
        }
    }

    public h0(int i10) {
        this(i10, 1.0f);
    }

    public static long A(long j10, int i10) {
        return (j10 & (-4294967296L)) | (4294967295L & i10);
    }

    public static int e(long j10) {
        return (int) (j10 >>> 32);
    }

    public static int g(long j10) {
        return (int) j10;
    }

    public static long[] n(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] o(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public void a() {
        this.f12048d++;
        Arrays.fill(this.f12045a, 0, this.f12047c, (Object) null);
        Arrays.fill(this.f12046b, 0, this.f12047c, 0);
        Arrays.fill(this.f12049e, -1);
        Arrays.fill(this.f12050f, -1L);
        this.f12047c = 0;
    }

    public int b() {
        return this.f12047c == 0 ? -1 : 0;
    }

    public int c(Object obj) {
        int iJ = j(obj);
        if (iJ == -1) {
            return 0;
        }
        return this.f12046b[iJ];
    }

    public e0.a d(int i10) {
        com.google.common.base.g.k(i10, this.f12047c);
        return new a(i10);
    }

    public Object f(int i10) {
        com.google.common.base.g.k(i10, this.f12047c);
        return this.f12045a[i10];
    }

    public int h(int i10) {
        com.google.common.base.g.k(i10, this.f12047c);
        return this.f12046b[i10];
    }

    public final int i() {
        return this.f12049e.length - 1;
    }

    public int j(Object obj) {
        int iD = z.d(obj);
        int iG = this.f12049e[i() & iD];
        while (iG != -1) {
            long j10 = this.f12050f[iG];
            if (e(j10) == iD && com.google.common.base.f.a(obj, this.f12045a[iG])) {
                return iG;
            }
            iG = g(j10);
        }
        return -1;
    }

    public void k(int i10, float f10) {
        com.google.common.base.g.e(i10 >= 0, "Initial capacity must be non-negative");
        com.google.common.base.g.e(f10 > 0.0f, "Illegal load factor");
        int iA = z.a(i10, f10);
        this.f12049e = o(iA);
        this.f12051g = f10;
        this.f12045a = new Object[i10];
        this.f12046b = new int[i10];
        this.f12050f = n(i10);
        this.f12052h = Math.max(1, (int) (iA * f10));
    }

    public void l(int i10, Object obj, int i11, int i12) {
        this.f12050f[i10] = (i12 << 32) | 4294967295L;
        this.f12045a[i10] = obj;
        this.f12046b[i10] = i11;
    }

    public void m(int i10) {
        int iZ = z() - 1;
        if (i10 >= iZ) {
            this.f12045a[i10] = null;
            this.f12046b[i10] = 0;
            this.f12050f[i10] = -1;
            return;
        }
        Object[] objArr = this.f12045a;
        objArr[i10] = objArr[iZ];
        int[] iArr = this.f12046b;
        iArr[i10] = iArr[iZ];
        objArr[iZ] = null;
        iArr[iZ] = 0;
        long[] jArr = this.f12050f;
        long j10 = jArr[iZ];
        jArr[i10] = j10;
        jArr[iZ] = -1;
        int iE = e(j10) & i();
        int[] iArr2 = this.f12049e;
        int i11 = iArr2[iE];
        if (i11 == iZ) {
            iArr2[iE] = i10;
            return;
        }
        while (true) {
            long j11 = this.f12050f[i11];
            int iG = g(j11);
            if (iG == iZ) {
                this.f12050f[i11] = A(j11, i10);
                return;
            }
            i11 = iG;
        }
    }

    public int p(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12047c) {
            return i11;
        }
        return -1;
    }

    public int q(int i10, int i11) {
        return i10 - 1;
    }

    public int r(Object obj, int i10) {
        j.c(i10, "count");
        long[] jArr = this.f12050f;
        Object[] objArr = this.f12045a;
        int[] iArr = this.f12046b;
        int iD = z.d(obj);
        int i11 = i() & iD;
        int i12 = this.f12047c;
        int[] iArr2 = this.f12049e;
        int i13 = iArr2[i11];
        if (i13 == -1) {
            iArr2[i11] = i12;
        } else {
            while (true) {
                long j10 = jArr[i13];
                if (e(j10) == iD && com.google.common.base.f.a(obj, objArr[i13])) {
                    int i14 = iArr[i13];
                    iArr[i13] = i10;
                    return i14;
                }
                int iG = g(j10);
                if (iG == -1) {
                    jArr[i13] = A(j10, i12);
                    break;
                }
                i13 = iG;
            }
        }
        if (i12 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i15 = i12 + 1;
        w(i15);
        l(i12, obj, i10, iD);
        this.f12047c = i15;
        if (i12 >= this.f12052h) {
            x(this.f12049e.length * 2);
        }
        this.f12048d++;
        return 0;
    }

    public int s(Object obj) {
        return t(obj, z.d(obj));
    }

    public final int t(Object obj, int i10) {
        int i11 = i() & i10;
        int i12 = this.f12049e[i11];
        if (i12 == -1) {
            return 0;
        }
        int i13 = -1;
        while (true) {
            if (e(this.f12050f[i12]) == i10 && com.google.common.base.f.a(obj, this.f12045a[i12])) {
                int i14 = this.f12046b[i12];
                if (i13 == -1) {
                    this.f12049e[i11] = g(this.f12050f[i12]);
                } else {
                    long[] jArr = this.f12050f;
                    jArr[i13] = A(jArr[i13], g(jArr[i12]));
                }
                m(i12);
                this.f12047c--;
                this.f12048d++;
                return i14;
            }
            int iG = g(this.f12050f[i12]);
            if (iG == -1) {
                return 0;
            }
            i13 = i12;
            i12 = iG;
        }
    }

    public int u(int i10) {
        return t(this.f12045a[i10], e(this.f12050f[i10]));
    }

    public void v(int i10) {
        this.f12045a = Arrays.copyOf(this.f12045a, i10);
        this.f12046b = Arrays.copyOf(this.f12046b, i10);
        long[] jArr = this.f12050f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f12050f = jArrCopyOf;
    }

    public final void w(int i10) {
        int length = this.f12050f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                v(iMax);
            }
        }
    }

    public final void x(int i10) {
        if (this.f12049e.length >= 1073741824) {
            this.f12052h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f12051g)) + 1;
        int[] iArrO = o(i10);
        long[] jArr = this.f12050f;
        int length = iArrO.length - 1;
        for (int i12 = 0; i12 < this.f12047c; i12++) {
            int iE = e(jArr[i12]);
            int i13 = iE & length;
            int i14 = iArrO[i13];
            iArrO[i13] = i12;
            jArr[i12] = (iE << 32) | (4294967295L & i14);
        }
        this.f12052h = i11;
        this.f12049e = iArrO;
    }

    public void y(int i10, int i11) {
        com.google.common.base.g.k(i10, this.f12047c);
        this.f12046b[i10] = i11;
    }

    public int z() {
        return this.f12047c;
    }

    public h0(int i10, float f10) {
        k(i10, f10);
    }
}
