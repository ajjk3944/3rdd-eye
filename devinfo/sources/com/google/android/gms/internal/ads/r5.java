package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r5 implements x1 {
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final mx1 M;
    public q5 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public z1 G;
    public u2[] H;
    public u2[] I;
    public boolean J;
    public long K;

    /* renamed from: a, reason: collision with root package name */
    public final r6 f15526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15527b;

    /* renamed from: c, reason: collision with root package name */
    public final List f15528c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15532h;

    /* renamed from: i, reason: collision with root package name */
    public final sk0 f15533i;

    /* renamed from: n, reason: collision with root package name */
    public final be1 f15537n;

    /* renamed from: o, reason: collision with root package name */
    public final fk0 f15538o;

    /* renamed from: p, reason: collision with root package name */
    public u51 f15539p;

    /* renamed from: q, reason: collision with root package name */
    public int f15540q;

    /* renamed from: r, reason: collision with root package name */
    public int f15541r;

    /* renamed from: s, reason: collision with root package name */
    public long f15542s;

    /* renamed from: t, reason: collision with root package name */
    public int f15543t;

    /* renamed from: u, reason: collision with root package name */
    public sk0 f15544u;

    /* renamed from: v, reason: collision with root package name */
    public long f15545v;

    /* renamed from: w, reason: collision with root package name */
    public int f15546w;

    /* renamed from: x, reason: collision with root package name */
    public long f15547x;

    /* renamed from: y, reason: collision with root package name */
    public long f15548y;

    /* renamed from: z, reason: collision with root package name */
    public long f15549z;
    public final l90 j = new l90(1);

    /* renamed from: k, reason: collision with root package name */
    public final sk0 f15534k = new sk0(16);

    /* renamed from: e, reason: collision with root package name */
    public final sk0 f15530e = new sk0(ls.f13608z);

    /* renamed from: f, reason: collision with root package name */
    public final sk0 f15531f = new sk0(6);
    public final sk0 g = new sk0();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f15535l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f15536m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f15529d = new SparseArray();

    static {
        lw1 lw1Var = new lw1();
        lw1Var.e("application/x-emsg");
        M = new mx1(lw1Var);
    }

    public r5(r6 r6Var, int i4, u51 u51Var) {
        this.f15526a = r6Var;
        this.f15527b = i4;
        this.f15528c = DesugarCollections.unmodifiableList(u51Var);
        byte[] bArr = new byte[16];
        this.f15532h = bArr;
        this.f15533i = new sk0(bArr);
        v41 v41Var = x41.f18307b;
        this.f15539p = u51.f17096e;
        this.f15548y = -9223372036854775807L;
        this.f15547x = -9223372036854775807L;
        this.f15549z = -9223372036854775807L;
        this.G = z1.H8;
        this.H = new u2[0];
        this.I = new u2[0];
        this.f15537n = new be1(new ix0(5, this));
        this.f15538o = new fk0(2);
        this.K = -1L;
    }

    public static void i(int i4) throws ua {
        if (i4 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i4);
        throw ua.a(null, sb2.toString());
    }

    public static void j(sk0 sk0Var, int i4, c6 c6Var) throws ua {
        sk0Var.E(i4 + 8);
        int iB = sk0Var.b();
        byte[] bArr = m5.f13762a;
        if ((iB & 1) != 0) {
            throw ua.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z3 = (iB & 2) != 0;
        int iH = sk0Var.h();
        if (iH == 0) {
            Arrays.fill(c6Var.f9991l, 0, c6Var.f9986e, false);
            return;
        }
        int i10 = c6Var.f9986e;
        sk0 sk0Var2 = c6Var.f9993n;
        if (iH != i10) {
            throw ua.a(null, je.u.q(iH, i10, "Senc sample count ", " is different from fragment sample count", new StringBuilder(String.valueOf(iH).length() + 58 + String.valueOf(i10).length())));
        }
        Arrays.fill(c6Var.f9991l, 0, iH, z3);
        sk0Var2.y(sk0Var.B());
        c6Var.f9990k = true;
        c6Var.f9994o = true;
        sk0Var.H(0, sk0Var2.f16448c, sk0Var2.f16446a);
        sk0Var2.E(0);
        c6Var.f9994o = false;
    }

    public static Pair k(long j, sk0 sk0Var) throws ua {
        long j8;
        long j9;
        sk0 sk0Var2 = sk0Var;
        sk0Var2.E(8);
        int iA = m5.a(sk0Var2.b());
        sk0Var2.G(4);
        long jP = sk0Var2.P();
        if (iA == 0) {
            j8 = sk0Var2.P();
            j9 = sk0Var2.P();
        } else {
            j8 = sk0Var2.j();
            j9 = sk0Var2.j();
        }
        long j10 = j9 + j;
        long jU = bq0.u(j8, 1000000L, jP, RoundingMode.DOWN);
        sk0Var2.G(2);
        int iL = sk0Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j11 = j10;
        long j12 = jU;
        int i4 = 0;
        while (i4 < iL) {
            int iB = sk0Var2.b();
            if ((Integer.MIN_VALUE & iB) != 0) {
                throw ua.a(null, "Unhandled indirect reference");
            }
            long jP2 = sk0Var2.P();
            iArr[i4] = iB & Integer.MAX_VALUE;
            jArr[i4] = j11;
            jArr3[i4] = j12;
            j8 += jP2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = bq0.u(j8, 1000000L, jP, RoundingMode.DOWN);
            jArr4[i4] = jU2 - jArr5[i4];
            sk0Var2.G(4);
            j11 += iArr[i4];
            i4++;
            iL = iL;
            sk0Var2 = sk0Var;
            j12 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new s1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.iv1 l(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.l(java.util.List):com.google.android.gms.internal.ads.iv1");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final /* synthetic */ List a() {
        return this.f15539p;
    }

    public final void b() {
        this.f15540q = 0;
        this.f15543t = 0;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        u51 u51VarL;
        r2 r2VarR = a80.r(y1Var, true, false);
        if (r2VarR != null) {
            u51VarL = x41.l(r2VarR);
        } else {
            v41 v41Var = x41.f18307b;
            u51VarL = u51.f17096e;
        }
        this.f15539p = u51VarL;
        return r2VarR == null;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        if ((this.f15527b & 32) == 0) {
            z1Var = new b5.i0(z1Var, this.f15526a);
        }
        this.G = z1Var;
        b();
        u2[] u2VarArr = new u2[2];
        this.H = u2VarArr;
        int i4 = 0;
        u2[] u2VarArr2 = (u2[]) bq0.m(u2VarArr, 0);
        this.H = u2VarArr2;
        for (u2 u2Var : u2VarArr2) {
            u2Var.f(M);
        }
        List list = this.f15528c;
        this.I = new u2[list.size()];
        int i10 = 100;
        while (i4 < this.I.length) {
            int i11 = i10 + 1;
            u2 u2VarM = this.G.m(i10, 3);
            u2VarM.f((mx1) list.get(i4));
            this.I[i4] = u2VarM;
            i4++;
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        SparseArray sparseArray = this.f15529d;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q5) sparseArray.valueAt(i4)).a();
        }
        this.f15536m.clear();
        this.f15546w = 0;
        ((PriorityQueue) this.f15537n.f9661e).clear();
        this.f15547x = j8;
        this.f15535l.clear();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
    
        if ((r4 + r2) <= (r35.B - r35.C)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e9, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01eb, code lost:
    
        r19 = r4;
        r32 = r7;
        ((com.google.android.gms.internal.ads.t1) r36).N1(r8, r12, r4 + r2, false);
        r6.E(0);
        r4 = r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        if (r4 < 0) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0201, code lost:
    
        r35.D = r4 - r2;
        r4 = r35.f15530e;
        r4.E(0);
        r3.b(4, r4);
        r35.C += 4;
        r35.B += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021a, code lost:
    
        if (r35.I.length <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021c, code lost:
    
        if (r2 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        r4 = r8[4];
        r7 = com.google.android.gms.internal.ads.ls.Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0228, code lost:
    
        if (j$.util.Objects.equals(r7, "video/avc") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022a, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022f, code lost:
    
        if ((r4 & 31) == 6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0232, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0239, code lost:
    
        if (j$.util.Objects.equals(r7, "video/hevc") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0243, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0245, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0247, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024b, code lost:
    
        r35.F = r7;
        r3.b(r2, r6);
        r35.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0255, code lost:
    
        if (r2 <= 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0259, code lost:
    
        if (r35.E != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025f, code lost:
    
        if (com.google.android.gms.internal.ads.ls.A(r8, r2, r5) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0261, code lost:
    
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0264, code lost:
    
        r2 = r17;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0268, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0273, code lost:
    
        throw com.google.android.gms.internal.ads.ua.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0274, code lost:
    
        r19 = r4;
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027b, code lost:
    
        if (r35.F == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027d, code lost:
    
        r7 = r35.g;
        r7.y(r2);
        r24 = r6;
        ((com.google.android.gms.internal.ads.t1) r36).N1(r7.f16446a, 0, r35.D, false);
        r3.b(r35.D, r7);
        r2 = r35.D;
        r4 = com.google.android.gms.internal.ads.ls.b(r7.f16448c, r7.f16446a);
        r7.E(0);
        r7.C(r4);
        r4 = r5.f14054o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a7, code lost:
    
        if (r4 != (-1)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ab, code lost:
    
        if (r11.f9657a == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ad, code lost:
    
        r11.J(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b3, code lost:
    
        if (r11.f9657a == r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b5, code lost:
    
        r11.J(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02b8, code lost:
    
        r11.K(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c4, code lost:
    
        if ((r17.b() & 4) == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c6, code lost:
    
        r11.L(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ca, code lost:
    
        r24 = r6;
        r2 = r3.g(r36, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d3, code lost:
    
        r35.C += r2;
        r35.D -= r2;
        r2 = r17;
        r4 = r19;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e4, code lost:
    
        r0 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ea, code lost:
    
        if (r35.E != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ec, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ef, code lost:
    
        r27 = r0;
        r0 = r17.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02f5, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f7, code lost:
    
        r30 = r0.f9599c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fc, code lost:
    
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02fe, code lost:
    
        r25 = r13;
        r3.d(r25, r27, r35.B, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030f, code lost:
    
        if (r32.isEmpty() != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0311, code lost:
    
        r0 = (com.google.android.gms.internal.ads.p5) r32.removeFirst();
        r2 = r35.f15546w;
        r7 = r0.f14898c;
        r35.f15546w = r2 - r7;
        r2 = r0.f14896a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0322, code lost:
    
        if (r0.f14897b == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0324, code lost:
    
        r2 = r2 + r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0326, code lost:
    
        r4 = r2;
        r0 = r35.H;
        r2 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032b, code lost:
    
        if (r10 >= r2) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032d, code lost:
    
        r0[r10].d(r4, 1, r7, r35.f15546w, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033d, code lost:
    
        if (r17.c() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033f, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0344, code lost:
    
        r35.f15540q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0348, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x06c8, code lost:
    
        throw com.google.android.gms.internal.ads.ua.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        r3 = r2.f15206a;
        r4 = r2.f15207b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        if (r35.f15540q != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r2.f15216m != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r6 = r2.f15209d.f10340d[r2.f15211f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        r6 = r4.f9988h[r2.f15211f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        r35.B = r6;
        r6 = r2.f15209d.f10337a.g.f14052m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (j$.util.Objects.equals(r6, "video/avc") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        j$.util.Objects.equals(r6, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        if (r2.f15211f >= r2.f15213i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        ((com.google.android.gms.internal.ads.t1) r36).c(r35.B, false);
        r0 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
    
        r3 = r4.f9993n;
        r0 = r0.f9600d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
    
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010f, code lost:
    
        r0 = r2.f15211f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        if (r4.f9990k == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0119, code lost:
    
        if (r4.f9991l[r0] == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011b, code lost:
    
        r3.G(r3.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        if (r2.c() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
    
        if (r2.f15209d.f10337a.f9219h != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
    
        r35.B -= 8;
        ((com.google.android.gms.internal.ads.t1) r36).c(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        if ("audio/ac4".equals(r2.f15209d.f10337a.g.f14052m) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0156, code lost:
    
        r35.C = r2.d(r35.B, 7);
        com.google.android.gms.internal.ads.a80.t(r35.B, r5);
        r3.b(7, r5);
        r5 = r35.C + 7;
        r35.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        r5 = r2.d(r35.B, 0);
        r35.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        r35.B += r5;
        r35.f15540q = 4;
        r35.D = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r5 = r2.f15209d;
        r6 = r5.f10337a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0184, code lost:
    
        if (r2.f15216m != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        r13 = r5.f10342f[r2.f15211f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        r13 = r4.f9989i[r2.f15211f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        r4 = r6.f9221k;
        r5 = r6.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        if (r4 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        r4 = r35.C;
        r5 = r35.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019d, code lost:
    
        if (r4 >= r5) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019f, code lost:
    
        r35.C += r3.g(r36, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01aa, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ac, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        r6 = r35.f15531f;
        r8 = r6.f16446a;
        r8[0] = 0;
        r8[1] = 0;
        r8[r18] = 0;
        r12 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        if (r35.C >= r35.B) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c6, code lost:
    
        r2 = r35.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c8, code lost:
    
        if (r2 != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cd, code lost:
    
        if (r35.I.length > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d1, code lost:
    
        if (r35.E != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        r2 = com.google.android.gms.internal.ads.ls.r(r5);
     */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r36, com.google.android.gms.internal.ads.c2 r37) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0794, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0797, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r54) throws java.lang.NumberFormatException, com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r5.h(long):void");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
