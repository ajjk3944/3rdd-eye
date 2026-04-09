package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jj1 implements lf1 {
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ph4 M;
    public ij1 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public nf1 G;
    public jg1[] H;
    public jg1[] I;
    public boolean J;
    public long K;
    public final jk1 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final kz2 i;
    public final fw3 n;
    public final cf1 o;
    public sn3 p;
    public int q;
    public int r;
    public long s;
    public int t;
    public kz2 u;
    public long v;
    public int w;
    public long x;
    public long y;
    public long z;
    public final gw3 j = new gw3(19);
    public final kz2 k = new kz2(16);
    public final kz2 e = new kz2(wl2.G);
    public final kz2 f = new kz2(6);
    public final kz2 g = new kz2();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        gg4 gg4Var = new gg4();
        gg4Var.e("application/x-emsg");
        M = new ph4(gg4Var);
    }

    public jj1(jk1 jk1Var, int i, sn3 sn3Var) {
        this.a = jk1Var;
        this.b = i;
        this.c = Collections.unmodifiableList(sn3Var);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new kz2(bArr);
        vm3 vm3Var = xm3.g;
        this.p = sn3.j;
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.G = nf1.d;
        this.H = new jg1[0];
        this.I = new jg1[0];
        this.n = new fw3(new sq0(9, this));
        this.o = new cf1();
        this.K = -1L;
    }

    public static void h(int i) throws lq1 {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw lq1.a(null, sb.toString());
    }

    public static void i(kz2 kz2Var, int i, sj1 sj1Var) throws lq1 {
        kz2Var.E(i + 8);
        int iB = kz2Var.b();
        byte[] bArr = ej1.a;
        if ((iB & 1) != 0) {
            throw lq1.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iH = kz2Var.h();
        if (iH == 0) {
            Arrays.fill(sj1Var.l, 0, sj1Var.e, false);
            return;
        }
        int i2 = sj1Var.e;
        kz2 kz2Var2 = sj1Var.n;
        if (iH != i2) {
            throw lq1.a(null, ga1.l(new StringBuilder(String.valueOf(iH).length() + 58 + String.valueOf(i2).length()), "Senc sample count ", iH, " is different from fragment sample count", i2));
        }
        Arrays.fill(sj1Var.l, 0, iH, z);
        kz2Var2.y(kz2Var.B());
        sj1Var.k = true;
        sj1Var.o = true;
        kz2Var.H(kz2Var2.a, 0, kz2Var2.c);
        kz2Var2.E(0);
        sj1Var.o = false;
    }

    public static Pair j(long j, kz2 kz2Var) throws lq1 {
        long j2;
        long j3;
        kz2 kz2Var2 = kz2Var;
        kz2Var2.E(8);
        int iA = ej1.a(kz2Var2.b());
        kz2Var2.G(4);
        long jP = kz2Var2.P();
        if (iA == 0) {
            j2 = kz2Var2.P();
            j3 = kz2Var2.P();
        } else {
            j2 = kz2Var2.j();
            j3 = kz2Var2.j();
        }
        long j4 = j3 + j;
        long jT = v23.t(j2, 1000000L, jP, RoundingMode.DOWN);
        kz2Var2.G(2);
        int iL = kz2Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j5 = j4;
        long j6 = jT;
        int i = 0;
        while (i < iL) {
            int iB = kz2Var2.b();
            if ((Integer.MIN_VALUE & iB) != 0) {
                throw lq1.a(null, "Unhandled indirect reference");
            }
            long jP2 = kz2Var2.P();
            iArr[i] = iB & Integer.MAX_VALUE;
            jArr[i] = j5;
            jArr3[i] = j6;
            j2 += jP2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jT2 = v23.t(j2, 1000000L, jP, RoundingMode.DOWN);
            jArr4[i] = jT2 - jArr5[i];
            kz2Var2.G(4);
            j5 += iArr[i];
            i++;
            iL = iL;
            kz2Var2 = kz2Var;
            j6 = jT2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jT), new bf1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ie4 k(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj1.k(java.util.List):ie4");
    }

    public final void a() {
        this.q = 0;
        this.t = 0;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        sn3 sn3VarI;
        gg1 gg1VarD = g82.D(mf1Var, true, false);
        if (gg1VarD != null) {
            sn3VarI = xm3.i(gg1VarD);
        } else {
            vm3 vm3Var = xm3.g;
            sn3VarI = sn3.j;
        }
        this.p = sn3VarI;
        return gg1VarD == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e4, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        r2 = defpackage.wl2.H(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f6, code lost:
    
        if ((r23 + r2) <= (r34.B - r34.C)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f9, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
    
        r31 = r3;
        ((defpackage.df1) r0).w(r10, r15, r23 + r2, false);
        r7.E(0);
        r3 = r7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020d, code lost:
    
        if (r3 < 0) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020f, code lost:
    
        r34.D = r3 - r2;
        r3 = r34.e;
        r3.E(0);
        r13.a(r3, 4, 0);
        r34.C += 4;
        r34.B += r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0228, code lost:
    
        if (r34.I.length <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022a, code lost:
    
        if (r2 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022c, code lost:
    
        r0 = r10[4];
        r3 = r6.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0234, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (defpackage.pp1.e(r12, "video/avc") == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023d, code lost:
    
        r19 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        r19 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0246, code lost:
    
        if ((r0 & 31) == 6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024c, code lost:
    
        if (java.util.Objects.equals(r3, "video/hevc") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0252, code lost:
    
        if (defpackage.pp1.e(r12, "video/hevc") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0255, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025f, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0261, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0265, code lost:
    
        r34.F = r3;
        r13.a(r7, r2, 0);
        r34.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0270, code lost:
    
        if (r2 <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0274, code lost:
    
        if (r34.E != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027a, code lost:
    
        if (defpackage.wl2.M(r10, r2, r6) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027c, code lost:
    
        r34.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027f, code lost:
    
        r0 = r35;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0283, code lost:
    
        r3 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028e, code lost:
    
        throw defpackage.lq1.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x028f, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (r34.F == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r3 = r34.g;
        r3.y(r2);
        r24 = r7;
        ((defpackage.df1) r35).w(r3.a, 0, r34.D, false);
        r13.a(r3, r34.D, 0);
        r0 = r34.D;
        r2 = defpackage.wl2.z(r3.c, r3.a);
        r3.E(0);
        r3.C(r2);
        r2 = r6.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c1, code lost:
    
        if (r2 != (-1)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c5, code lost:
    
        if (r11.f == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c7, code lost:
    
        r11.w(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02cd, code lost:
    
        if (r11.f == r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        r11.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d2, code lost:
    
        r11.x(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02de, code lost:
    
        if ((r20.b() & 4) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e0, code lost:
    
        r11.y(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e3, code lost:
    
        r2 = r0;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e7, code lost:
    
        r0 = r35;
        r24 = r7;
        r2 = r13.b(r0, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f2, code lost:
    
        r34.C += r2;
        r34.D -= r2;
        r14 = r23;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0301, code lost:
    
        r0 = r20.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0307, code lost:
    
        if (r34.E != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0309, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x030c, code lost:
    
        r26 = r0;
        r0 = r20.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0312, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0314, code lost:
    
        r29 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0319, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x031b, code lost:
    
        r13.c(r4, r26, r34.B, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032c, code lost:
    
        if (r31.isEmpty() != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032e, code lost:
    
        r0 = (defpackage.hj1) r31.removeFirst();
        r2 = r34.w;
        r7 = r0.c;
        r34.w = r2 - r7;
        r2 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033f, code lost:
    
        if (r0.b == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0341, code lost:
    
        r2 = r2 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0343, code lost:
    
        r4 = r2;
        r0 = r34.H;
        r2 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0348, code lost:
    
        if (r10 >= r2) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034a, code lost:
    
        r0[r10].c(r4, 1, r7, r34.w, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x035a, code lost:
    
        if (r20.c() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x035c, code lost:
    
        r34.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0361, code lost:
    
        r34.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0365, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06de, code lost:
    
        throw defpackage.lq1.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r4 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r34.q != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        if (r2.m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        r6 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        r6 = r4.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        r34.B = r6;
        r6 = r2.d.a.g.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
    
        if (java.util.Objects.equals(r6, "video/avc") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        java.util.Objects.equals(r6, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        r34.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        if (r2.f >= r2.i) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        ((defpackage.df1) r0).c(r34.B, false);
        r0 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        r3 = r4.n;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
    
        if (r0 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0112, code lost:
    
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
    
        if (r4.k == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r4.l[r0] == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r3.G(r3.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        if (r2.c() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
    
        r34.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013b, code lost:
    
        if (r2.d.a.h != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013d, code lost:
    
        r34.B -= 8;
        ((defpackage.df1) r0).c(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if ("audio/ac4".equals(r2.d.a.g.m) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
    
        r34.C = r2.d(r34.B, 7);
        defpackage.zt0.P(r34.B, r5);
        r2.a.a(r5, 7, 0);
        r5 = r34.C + 7;
        r34.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        r5 = r2.d(r34.B, 0);
        r34.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r34.B += r5;
        r34.q = 4;
        r34.D = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        r5 = r2.d;
        r6 = r5.a;
        r13 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (r2.m != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018f, code lost:
    
        r16 = r5.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0198, code lost:
    
        r16 = r4.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        r14 = r6.k;
        r6 = r6.g;
        r12 = r6.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a5, code lost:
    
        if (r14 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a7, code lost:
    
        r6 = r34.C;
        r7 = r34.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ab, code lost:
    
        if (r6 >= r7) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ad, code lost:
    
        r34.C += r13.b(r0, r7 - r6, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01be, code lost:
    
        r7 = r34.f;
        r10 = r7.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[r19] = 0;
        r15 = 4 - r14;
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
    
        if (r34.C >= r34.B) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r2 = r34.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d8, code lost:
    
        if (r2 != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        if (r34.I.length > 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
    
        if (r34.E != false) goto L100;
     */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r35, defpackage.pf1 r36) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final /* synthetic */ List d() {
        return this.p;
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((ij1) sparseArray.valueAt(i)).a();
        }
        this.m.clear();
        this.w = 0;
        ((PriorityQueue) this.n.j).clear();
        this.x = j2;
        this.l.clear();
        a();
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        if ((this.b & 32) == 0) {
            nf1Var = new rl(nf1Var, this.a);
        }
        this.G = nf1Var;
        a();
        jg1[] jg1VarArr = new jg1[2];
        this.H = jg1VarArr;
        int i = 0;
        jg1[] jg1VarArr2 = (jg1[]) v23.m(jg1VarArr, 0);
        this.H = jg1VarArr2;
        for (jg1 jg1Var : jg1VarArr2) {
            jg1Var.d(M);
        }
        List list = this.c;
        this.I = new jg1[list.size()];
        int i2 = 100;
        while (i < this.I.length) {
            int i3 = i2 + 1;
            jg1 jg1VarZ = this.G.z(i2, 3);
            jg1VarZ.d((ph4) list.get(i));
            this.I[i] = jg1VarZ;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0791, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0794, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r54) throws java.lang.NumberFormatException, defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 1941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj1.g(long):void");
    }
}
