package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.n52;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class et1 implements n52 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f27009A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f27010B;

    /* renamed from: a, reason: collision with root package name */
    private final dt1 f27011a;

    /* renamed from: d, reason: collision with root package name */
    private final d40 f27014d;

    /* renamed from: e, reason: collision with root package name */
    private final c40.a f27015e;

    /* renamed from: f, reason: collision with root package name */
    private c f27016f;

    /* renamed from: g, reason: collision with root package name */
    private dc0 f27017g;

    /* renamed from: h, reason: collision with root package name */
    private b40 f27018h;

    /* renamed from: p, reason: collision with root package name */
    private int f27025p;

    /* renamed from: q, reason: collision with root package name */
    private int f27026q;

    /* renamed from: r, reason: collision with root package name */
    private int f27027r;

    /* renamed from: s, reason: collision with root package name */
    private int f27028s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27032w;

    /* renamed from: z, reason: collision with root package name */
    private dc0 f27035z;

    /* renamed from: b, reason: collision with root package name */
    private final a f27012b = new a();
    private int i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int[] f27019j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f27020k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f27023n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f27022m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f27021l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private n52.a[] f27024o = new n52.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final d12<b> f27013c = new d12<>(new E0(0));

    /* renamed from: t, reason: collision with root package name */
    private long f27029t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f27030u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f27031v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f27034y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27033x = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f27036a;

        /* renamed from: b, reason: collision with root package name */
        public long f27037b;

        /* renamed from: c, reason: collision with root package name */
        public n52.a f27038c;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final dc0 f27039a;

        /* renamed from: b, reason: collision with root package name */
        public final d40.b f27040b;

        public /* synthetic */ b(dc0 dc0Var, d40.b bVar, int i) {
            this(dc0Var, bVar);
        }

        private b(dc0 dc0Var, d40.b bVar) {
            this.f27039a = dc0Var;
            this.f27040b = bVar;
        }
    }

    public interface c {
    }

    public et1(vc vcVar, d40 d40Var, c40.a aVar) {
        this.f27014d = d40Var;
        this.f27015e = aVar;
        this.f27011a = new dt1(vcVar);
    }

    private synchronized void j() {
        this.f27028s = 0;
        this.f27011a.c();
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final /* synthetic */ void a(int i, uf1 uf1Var) {
        U2.a(this, i, uf1Var);
    }

    public final int c() {
        return this.f27026q + this.f27028s;
    }

    public final synchronized dc0 d() {
        return this.f27034y ? null : this.f27035z;
    }

    public final int e() {
        return this.f27026q + this.f27025p;
    }

    public final synchronized boolean f() {
        return this.f27032w;
    }

    public final void g() throws IOException {
        b40 b40Var = this.f27018h;
        if (b40Var == null || b40Var.getState() != 1) {
            return;
        }
        b40.a error = this.f27018h.getError();
        error.getClass();
        throw error;
    }

    public final void h() {
        a();
        b40 b40Var = this.f27018h;
        if (b40Var != null) {
            b40Var.a(this.f27015e);
            this.f27018h = null;
            this.f27017g = null;
        }
    }

    public final void i() {
        b(true);
        b40 b40Var = this.f27018h;
        if (b40Var != null) {
            b40Var.a(this.f27015e);
            this.f27018h = null;
            this.f27017g = null;
        }
    }

    private synchronized void a(long j4, int i, long j10, int i10, n52.a aVar) {
        try {
            int i11 = this.f27025p;
            if (i11 > 0) {
                if (this.f27020k[c(i11 - 1)] + this.f27021l[r0] > j10) {
                    throw new IllegalArgumentException();
                }
            }
            int i12 = 0;
            this.f27032w = (536870912 & i) != 0;
            this.f27031v = Math.max(this.f27031v, j4);
            int iC = c(this.f27025p);
            this.f27023n[iC] = j4;
            this.f27020k[iC] = j10;
            this.f27021l[iC] = i10;
            this.f27022m[iC] = i;
            this.f27024o[iC] = aVar;
            this.f27019j[iC] = 0;
            if (this.f27013c.c() || !this.f27013c.b().f27039a.equals(this.f27035z)) {
                d40 d40Var = this.f27014d;
                d40.b bVarA = d40Var != null ? d40Var.a(this.f27015e, this.f27035z) : d40.b.f25946a;
                d12<b> d12Var = this.f27013c;
                int i13 = this.f27026q + this.f27025p;
                dc0 dc0Var = this.f27035z;
                dc0Var.getClass();
                d12Var.a(i13, new b(dc0Var, bVarA, i12));
            }
            int i14 = this.f27025p + 1;
            this.f27025p = i14;
            int i15 = this.i;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                int[] iArr = new int[i16];
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                n52.a[] aVarArr = new n52.a[i16];
                int i17 = this.f27027r;
                int i18 = i15 - i17;
                System.arraycopy(this.f27020k, i17, jArr, 0, i18);
                System.arraycopy(this.f27023n, this.f27027r, jArr2, 0, i18);
                System.arraycopy(this.f27022m, this.f27027r, iArr2, 0, i18);
                System.arraycopy(this.f27021l, this.f27027r, iArr3, 0, i18);
                System.arraycopy(this.f27024o, this.f27027r, aVarArr, 0, i18);
                System.arraycopy(this.f27019j, this.f27027r, iArr, 0, i18);
                int i19 = this.f27027r;
                System.arraycopy(this.f27020k, 0, jArr, i18, i19);
                System.arraycopy(this.f27023n, 0, jArr2, i18, i19);
                System.arraycopy(this.f27022m, 0, iArr2, i18, i19);
                System.arraycopy(this.f27021l, 0, iArr3, i18, i19);
                System.arraycopy(this.f27024o, 0, aVarArr, i18, i19);
                System.arraycopy(this.f27019j, 0, iArr, i18, i19);
                this.f27020k = jArr;
                this.f27023n = jArr2;
                this.f27022m = iArr2;
                this.f27021l = iArr3;
                this.f27024o = aVarArr;
                this.f27019j = iArr;
                this.f27027r = 0;
                this.i = i16;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int c(int i) {
        int i10 = this.f27027r + i;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final /* synthetic */ int b(lv lvVar, int i, boolean z10) {
        return U2.b(this, lvVar, i, z10);
    }

    public final synchronized void d(int i) {
        if (i >= 0) {
            int i10 = this.f27028s + i;
            if (i10 <= this.f27025p) {
                this.f27028s = i10;
            }
        }
        throw new IllegalArgumentException();
    }

    public final synchronized long b() {
        return this.f27031v;
    }

    private long b(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iC = c(i - 1);
        for (int i10 = 0; i10 < i; i10++) {
            jMax = Math.max(jMax, this.f27023n[iC]);
            if ((this.f27022m[iC] & 1) != 0) {
                return jMax;
            }
            iC--;
            if (iC == -1) {
                iC = this.i - 1;
            }
        }
        return jMax;
    }

    public final void b(boolean z10) {
        this.f27011a.b();
        this.f27025p = 0;
        this.f27026q = 0;
        this.f27027r = 0;
        this.f27028s = 0;
        this.f27033x = true;
        this.f27029t = Long.MIN_VALUE;
        this.f27030u = Long.MIN_VALUE;
        this.f27031v = Long.MIN_VALUE;
        this.f27032w = false;
        this.f27013c.a();
        if (z10) {
            this.f27035z = null;
            this.f27034y = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void b(int i, uf1 uf1Var) {
        this.f27011a.a(i, uf1Var);
    }

    public final synchronized boolean b(long j4, boolean z10) throws Throwable {
        try {
            try {
                j();
                int iC = c(this.f27028s);
                int i = this.f27028s;
                int i10 = this.f27025p;
                if (i != i10 && j4 >= this.f27023n[iC]) {
                    if (j4 <= this.f27031v || z10) {
                        int iA = a(iC, i10 - i, j4, true);
                        if (iA == -1) {
                            return false;
                        }
                        this.f27029t = j4;
                        this.f27028s += iA;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private long a(int i) {
        this.f27030u = Math.max(this.f27030u, b(i));
        this.f27025p -= i;
        int i10 = this.f27026q + i;
        this.f27026q = i10;
        int i11 = this.f27027r + i;
        this.f27027r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.f27027r = i11 - i12;
        }
        int i13 = this.f27028s - i;
        this.f27028s = i13;
        if (i13 < 0) {
            this.f27028s = 0;
        }
        this.f27013c.a(i10);
        if (this.f27025p == 0) {
            int i14 = this.f27027r;
            if (i14 == 0) {
                i14 = this.i;
            }
            return this.f27020k[i14 - 1] + this.f27021l[r6];
        }
        return this.f27020k[this.f27027r];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, boolean r14, boolean r15) {
        /*
            r11 = this;
            com.yandex.mobile.ads.impl.dt1 r0 = r11.f27011a
            monitor-enter(r11)
            int r1 = r11.f27025p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f27023n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f27027r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f27028s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.a(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.a(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.a(r2)
            return
        L40:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.et1.a(long, boolean, boolean):void");
    }

    public final void a() {
        long jA;
        dt1 dt1Var = this.f27011a;
        synchronized (this) {
            int i = this.f27025p;
            jA = i == 0 ? -1L : a(i);
        }
        dt1Var.a(jA);
    }

    private int a(int i, int i10, long j4, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f27023n[i];
            if (j10 > j4) {
                break;
            }
            if (!z10 || (this.f27022m[i] & 1) != 0) {
                if (j10 == j4) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i11;
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void a(dc0 dc0Var) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            try {
                this.f27034y = false;
                if (!s82.a(dc0Var, this.f27035z)) {
                    if (!this.f27013c.c() && this.f27013c.b().f27039a.equals(dc0Var)) {
                        this.f27035z = this.f27013c.b().f27039a;
                    } else {
                        this.f27035z = dc0Var;
                    }
                    dc0 dc0Var2 = this.f27035z;
                    this.f27009A = k01.a(dc0Var2.f26083m, dc0Var2.f26080j);
                    this.f27010B = false;
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f27016f;
        if (cVar == null || !z10) {
            return;
        }
        ((yl1) cVar).h();
    }

    public final synchronized int a(long j4, boolean z10) {
        try {
            try {
                int iC = c(this.f27028s);
                int i = this.f27028s;
                int i10 = this.f27025p;
                if (i == i10 || j4 < this.f27023n[iC]) {
                    return 0;
                }
                if (j4 > this.f27031v && z10) {
                    return i10 - i;
                }
                int iA = a(iC, i10 - i, j4, true);
                if (iA == -1) {
                    return 0;
                }
                return iA;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized boolean a(boolean z10) {
        dc0 dc0Var;
        int i = this.f27028s;
        boolean z11 = false;
        if (i != this.f27025p) {
            if (this.f27013c.b(this.f27026q + i).f27039a != this.f27017g) {
                return true;
            }
            int iC = c(this.f27028s);
            b40 b40Var = this.f27018h;
            if (b40Var == null || b40Var.getState() == 4 || ((this.f27022m[iC] & 1073741824) == 0 && this.f27018h.playClearSamplesWithoutKeys())) {
                z11 = true;
            }
            return z11;
        }
        if (z10 || this.f27032w || ((dc0Var = this.f27035z) != null && dc0Var != this.f27017g)) {
            z11 = true;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.f27040b.release();
    }

    private void a(dc0 dc0Var, ec0 ec0Var) {
        dc0 dc0Var2 = this.f27017g;
        boolean z10 = dc0Var2 == null;
        a40 a40Var = z10 ? null : dc0Var2.f26086p;
        this.f27017g = dc0Var;
        a40 a40Var2 = dc0Var.f26086p;
        d40 d40Var = this.f27014d;
        ec0Var.f26789b = d40Var != null ? dc0Var.a(d40Var.a(dc0Var)) : dc0Var;
        ec0Var.f26788a = this.f27018h;
        if (this.f27014d == null) {
            return;
        }
        if (z10 || !s82.a(a40Var, a40Var2)) {
            b40 b40Var = this.f27018h;
            b40 b40VarB = this.f27014d.b(this.f27015e, dc0Var);
            this.f27018h = b40VarB;
            ec0Var.f26788a = b40VarB;
            if (b40Var != null) {
                b40Var.a(this.f27015e);
            }
        }
    }

    public final int a(ec0 ec0Var, my myVar, int i, boolean z10) {
        int i10;
        boolean z11 = (i & 2) != 0;
        a aVar = this.f27012b;
        synchronized (this) {
            try {
                myVar.f30573e = false;
                int i11 = this.f27028s;
                i10 = -5;
                if (i11 != this.f27025p) {
                    dc0 dc0Var = this.f27013c.b(this.f27026q + i11).f27039a;
                    if (!z11 && dc0Var == this.f27017g) {
                        int iC = c(this.f27028s);
                        b40 b40Var = this.f27018h;
                        if (b40Var != null && b40Var.getState() != 4 && ((this.f27022m[iC] & 1073741824) != 0 || !this.f27018h.playClearSamplesWithoutKeys())) {
                            myVar.f30573e = true;
                            i10 = -3;
                        }
                        myVar.d(this.f27022m[iC]);
                        long j4 = this.f27023n[iC];
                        myVar.f30574f = j4;
                        if (j4 < this.f27029t) {
                            myVar.b(RecyclerView.UNDEFINED_DURATION);
                        }
                        aVar.f27036a = this.f27021l[iC];
                        aVar.f27037b = this.f27020k[iC];
                        aVar.f27038c = this.f27024o[iC];
                        i10 = -4;
                    }
                    a(dc0Var, ec0Var);
                } else {
                    if (!z10 && !this.f27032w) {
                        dc0 dc0Var2 = this.f27035z;
                        if (dc0Var2 == null || (!z11 && dc0Var2 == this.f27017g)) {
                            i10 = -3;
                        } else {
                            a(dc0Var2, ec0Var);
                        }
                    }
                    myVar.d(4);
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !myVar.f()) {
            boolean z12 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z12) {
                    this.f27011a.a(myVar, this.f27012b);
                } else {
                    this.f27011a.b(myVar, this.f27012b);
                }
            }
            if (!z12) {
                this.f27028s++;
            }
        }
        return i10;
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final int a(lv lvVar, int i, boolean z10) throws IOException {
        return this.f27011a.a(lvVar, i, z10);
    }

    @Override // com.yandex.mobile.ads.impl.n52
    public final void a(long j4, int i, int i10, int i11, n52.a aVar) {
        int i12 = i & 1;
        boolean z10 = i12 != 0;
        if (this.f27033x) {
            if (!z10) {
                return;
            } else {
                this.f27033x = false;
            }
        }
        if (this.f27009A) {
            if (j4 < this.f27029t) {
                return;
            }
            if (i12 == 0) {
                if (!this.f27010B) {
                    rs0.d("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f27035z);
                    this.f27010B = true;
                }
                i |= 1;
            }
        }
        a(j4, i, (this.f27011a.a() - i10) - i11, i10, aVar);
    }

    public final void a(long j4) {
        this.f27029t = j4;
    }

    public final void a(c cVar) {
        this.f27016f = cVar;
    }
}
