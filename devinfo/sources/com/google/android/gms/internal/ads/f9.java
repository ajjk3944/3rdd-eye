package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f9 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11059a;

    /* renamed from: b, reason: collision with root package name */
    public final sk0 f11060b = new sk0(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f11061c;

    /* renamed from: d, reason: collision with root package name */
    public final g8 f11062d;

    /* renamed from: e, reason: collision with root package name */
    public final w5 f11063e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f11064f;
    public final SparseBooleanArray g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f11065h;

    /* renamed from: i, reason: collision with root package name */
    public final z8 f11066i;
    public i3 j;

    /* renamed from: k, reason: collision with root package name */
    public z1 f11067k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11068l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11069m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11070n;

    /* renamed from: o, reason: collision with root package name */
    public int f11071o;

    public f9(w5 w5Var, zo0 zo0Var, g8 g8Var) {
        this.f11062d = g8Var;
        this.f11063e = w5Var;
        this.f11059a = Collections.singletonList(zo0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.f11065h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f11064f = sparseArray;
        this.f11061c = new SparseIntArray();
        this.f11066i = new z8(1);
        this.f11067k = z1.H8;
        this.f11071o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11064f.put(sparseArray2.keyAt(i4), (i9) sparseArray2.valueAt(i4));
        }
        this.f11064f.put(0, new d9(new ce1(this)));
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.y1 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.sk0 r0 = r6.f11060b
            byte[] r0 = r0.f16446a
            com.google.android.gms.internal.ads.t1 r7 = (com.google.android.gms.internal.ads.t1) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.O1(r0, r2, r1, r2)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.c(r1, r2)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.c(com.google.android.gms.internal.ads.y1):boolean");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f11067k = new b5.i0(z1Var, this.f11063e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.f11059a
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L35
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.zo0 r4 = (com.google.android.gms.internal.ads.zo0) r4
            long r5 = r4.b()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.a()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.c(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L40
            com.google.android.gms.internal.ads.i3 r10 = r9.j
            if (r10 == 0) goto L40
            r10.a(r12)
        L40:
            com.google.android.gms.internal.ads.sk0 r10 = r9.f11060b
            r10.y(r0)
            android.util.SparseIntArray r10 = r9.f11061c
            r10.clear()
        L4a:
            android.util.SparseArray r10 = r9.f11064f
            int r11 = r10.size()
            if (r0 >= r11) goto L5e
            java.lang.Object r10 = r10.valueAt(r0)
            com.google.android.gms.internal.ads.i9 r10 = (com.google.android.gms.internal.ads.i9) r10
            r10.a()
            int r0 = r0 + 1
            goto L4a
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.f(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0276  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r25, com.google.android.gms.internal.ads.c2 r26) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
