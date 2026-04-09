package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.tw1;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b72 implements u70 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25108a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25109b;

    /* renamed from: c, reason: collision with root package name */
    private final List<c52> f25110c;

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f25111d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseIntArray f25112e;

    /* renamed from: f, reason: collision with root package name */
    private final c72.c f25113f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<c72> f25114g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f25115h;
    private final SparseBooleanArray i;

    /* renamed from: j, reason: collision with root package name */
    private final a72 f25116j;

    /* renamed from: k, reason: collision with root package name */
    private z62 f25117k;

    /* renamed from: l, reason: collision with root package name */
    private w70 f25118l;

    /* renamed from: m, reason: collision with root package name */
    private int f25119m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25120n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25121o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25122p;

    /* renamed from: q, reason: collision with root package name */
    private c72 f25123q;

    /* renamed from: r, reason: collision with root package name */
    private int f25124r;

    /* renamed from: s, reason: collision with root package name */
    private int f25125s;

    public class a implements rw1 {

        /* renamed from: a, reason: collision with root package name */
        private final tf1 f25126a = new tf1(new byte[4]);

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(c52 c52Var, w70 w70Var, c72.d dVar) {
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(uf1 uf1Var) {
            if (uf1Var.t() == 0 && (uf1Var.t() & 128) != 0) {
                uf1Var.f(6);
                int iA = uf1Var.a() / 4;
                for (int i = 0; i < iA; i++) {
                    tf1 tf1Var = this.f25126a;
                    uf1Var.a(tf1Var.f33573a, 0, 4);
                    tf1Var.c(0);
                    int iB = this.f25126a.b(16);
                    this.f25126a.d(3);
                    if (iB == 0) {
                        this.f25126a.d(13);
                    } else {
                        int iB2 = this.f25126a.b(13);
                        if (b72.this.f25114g.get(iB2) == null) {
                            b72 b72Var = b72.this;
                            b72Var.f25114g.put(iB2, new sw1(b72Var.new b(iB2)));
                            b72.this.f25119m++;
                        }
                    }
                }
                b72 b72Var2 = b72.this;
                if (b72Var2.f25108a != 2) {
                    b72Var2.f25114g.remove(0);
                }
            }
        }
    }

    public class b implements rw1 {

        /* renamed from: a, reason: collision with root package name */
        private final tf1 f25128a = new tf1(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<c72> f25129b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f25130c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f25131d;

        public b(int i) {
            this.f25131d = i;
        }

        @Override // com.yandex.mobile.ads.impl.rw1
        public final void a(c52 c52Var, w70 w70Var, c72.d dVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
        @Override // com.yandex.mobile.ads.impl.rw1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.yandex.mobile.ads.impl.uf1 r24) {
            /*
                Method dump skipped, instructions count: 763
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b72.b.a(com.yandex.mobile.ads.impl.uf1):void");
        }
    }

    public b72(int i) {
        this(new c52(0L), new o00());
    }

    public b72(c52 c52Var, o00 o00Var) {
        this.f25113f = (c72.c) zf.a(o00Var);
        this.f25109b = 112800;
        this.f25108a = 1;
        this.f25110c = Collections.singletonList(c52Var);
        this.f25111d = new uf1(0, new byte[9400]);
        this.f25115h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.f25114g = new SparseArray<>();
        this.f25112e = new SparseIntArray();
        this.f25116j = new a72();
        this.f25118l = w70.f34836a;
        this.f25125s = -1;
        b();
    }

    private void b() {
        this.f25115h.clear();
        this.f25114g.clear();
        SparseArray<c72> sparseArrayA = this.f25113f.a();
        int size = sparseArrayA.size();
        for (int i = 0; i < size; i++) {
            this.f25114g.put(sparseArrayA.keyAt(i), sparseArrayA.valueAt(i));
        }
        this.f25114g.put(0, new sw1(new a()));
        this.f25123q = null;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f25118l = w70Var;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final int a(v70 v70Var, jj1 jj1Var) throws IOException {
        long j4;
        long j10;
        rz rzVar = (rz) v70Var;
        long jB = rzVar.b();
        if (!this.f25120n) {
            j4 = -1;
        } else {
            if (jB != -1 && this.f25108a != 2 && !this.f25116j.c()) {
                return this.f25116j.a(rzVar, jj1Var, this.f25125s);
            }
            if (this.f25121o) {
                j4 = -1;
                j10 = 0;
            } else {
                this.f25121o = true;
                if (this.f25116j.a() != -9223372036854775807L) {
                    j4 = -1;
                    j10 = 0;
                    z62 z62Var = new z62(this.f25116j.b(), this.f25116j.a(), jB, this.f25125s, this.f25109b);
                    this.f25117k = z62Var;
                    this.f25118l.a(z62Var.a());
                } else {
                    j4 = -1;
                    j10 = 0;
                    this.f25118l.a(new tw1.b(this.f25116j.a(), 0L));
                }
            }
            if (this.f25122p) {
                this.f25122p = false;
                a(j10, j10);
                if (rzVar.a() != j10) {
                    jj1Var.f29169a = j10;
                    return 1;
                }
            }
            z62 z62Var2 = this.f25117k;
            if (z62Var2 != null && z62Var2.b()) {
                return this.f25117k.a(rzVar, jj1Var);
            }
        }
        byte[] bArrC = this.f25111d.c();
        if (9400 - this.f25111d.d() < 188) {
            int iA = this.f25111d.a();
            if (iA > 0) {
                System.arraycopy(bArrC, this.f25111d.d(), bArrC, 0, iA);
            }
            this.f25111d.a(iA, bArrC);
        }
        while (this.f25111d.a() < 188) {
            int iE = this.f25111d.e();
            int i = rzVar.read(bArrC, iE, 9400 - iE);
            if (i == -1) {
                return -1;
            }
            this.f25111d.d(iE + i);
        }
        int iD = this.f25111d.d();
        int iE2 = this.f25111d.e();
        byte[] bArrC2 = this.f25111d.c();
        int i10 = iD;
        while (i10 < iE2 && bArrC2[i10] != 71) {
            i10++;
        }
        this.f25111d.e(i10);
        int i11 = i10 + 188;
        if (i11 > iE2) {
            int i12 = (i10 - iD) + this.f25124r;
            this.f25124r = i12;
            if (this.f25108a == 2 && i12 > 376) {
                throw yf1.a("Cannot find sync byte. Most likely not a Transport Stream.", (Exception) null);
            }
        } else {
            this.f25124r = 0;
        }
        int iE3 = this.f25111d.e();
        if (i11 > iE3) {
            return 0;
        }
        int iH = this.f25111d.h();
        if ((8388608 & iH) != 0) {
            this.f25111d.e(i11);
            return 0;
        }
        int i13 = (4194304 & iH) != 0 ? 1 : 0;
        int i14 = (2096896 & iH) >> 8;
        boolean z10 = (iH & 32) != 0;
        c72 c72Var = (iH & 16) != 0 ? this.f25114g.get(i14) : null;
        if (c72Var == null) {
            this.f25111d.e(i11);
            return 0;
        }
        if (this.f25108a != 2) {
            int i15 = iH & 15;
            int i16 = this.f25112e.get(i14, i15 - 1);
            this.f25112e.put(i14, i15);
            if (i16 == i15) {
                this.f25111d.e(i11);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                c72Var.a();
            }
        }
        if (z10) {
            int iT = this.f25111d.t();
            i13 |= (this.f25111d.t() & 64) != 0 ? 2 : 0;
            this.f25111d.f(iT - 1);
        }
        boolean z11 = this.f25120n;
        if (this.f25108a == 2 || z11 || !this.i.get(i14, false)) {
            this.f25111d.d(i11);
            c72Var.a(i13, this.f25111d);
            this.f25111d.d(iE3);
        }
        if (this.f25108a != 2 && !z11 && this.f25120n && jB != j4) {
            this.f25122p = true;
        }
        this.f25111d.e(i11);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r9, long r11) {
        /*
            r8 = this;
            int r9 = r8.f25108a
            r10 = 2
            if (r9 == r10) goto L73
            java.util.List<com.yandex.mobile.ads.impl.c52> r9 = r8.f25110c
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        Ld:
            r1 = 0
            if (r0 >= r9) goto L44
            java.util.List<com.yandex.mobile.ads.impl.c52> r3 = r8.f25110c
            java.lang.Object r3 = r3.get(r0)
            com.yandex.mobile.ads.impl.c52 r3 = (com.yandex.mobile.ads.impl.c52) r3
            long r4 = r3.c()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r10
        L29:
            if (r4 != 0) goto L3c
            long r4 = r3.a()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L41
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L41
            goto L3e
        L3c:
            if (r4 == 0) goto L41
        L3e:
            r3.c(r11)
        L41:
            int r0 = r0 + 1
            goto Ld
        L44:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L4f
            com.yandex.mobile.ads.impl.z62 r9 = r8.f25117k
            if (r9 == 0) goto L4f
            r9.a(r11)
        L4f:
            com.yandex.mobile.ads.impl.uf1 r9 = r8.f25111d
            r9.c(r10)
            android.util.SparseIntArray r9 = r8.f25112e
            r9.clear()
            r9 = r10
        L5a:
            android.util.SparseArray<com.yandex.mobile.ads.impl.c72> r11 = r8.f25114g
            int r11 = r11.size()
            if (r9 >= r11) goto L70
            android.util.SparseArray<com.yandex.mobile.ads.impl.c72> r11 = r8.f25114g
            java.lang.Object r11 = r11.valueAt(r9)
            com.yandex.mobile.ads.impl.c72 r11 = (com.yandex.mobile.ads.impl.c72) r11
            r11.a()
            int r9 = r9 + 1
            goto L5a
        L70:
            r8.f25124r = r10
            return
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b72.a(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.yandex.mobile.ads.impl.v70 r7) throws java.io.IOException {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.uf1 r0 = r6.f25111d
            byte[] r0 = r0.c()
            com.yandex.mobile.ads.impl.rz r7 = (com.yandex.mobile.ads.impl.rz) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.a(r2)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b72.a(com.yandex.mobile.ads.impl.v70):boolean");
    }

    private static u70[] a() {
        return new u70[]{new b72(0)};
    }
}
