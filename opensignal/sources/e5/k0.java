package e5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 {
    public static final k0 I = a(new k0[0]);
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final int E;
    public final int F;
    public final int G;
    public final long[] H;

    /* renamed from: a, reason: collision with root package name */
    public final int f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7847d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7849f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7850g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7851h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7852i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7853l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7854m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7855n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7856o;

    /* renamed from: p, reason: collision with root package name */
    public final long f7857p;

    /* renamed from: q, reason: collision with root package name */
    public final long f7858q;

    /* renamed from: r, reason: collision with root package name */
    public final long f7859r;

    /* renamed from: s, reason: collision with root package name */
    public final long f7860s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7861t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7862u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7863v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7864w;

    /* renamed from: x, reason: collision with root package name */
    public final long f7865x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7866y;

    /* renamed from: z, reason: collision with root package name */
    public final long f7867z;

    public k0(int i10, long[] jArr, List list, List list2, long j, int i11, int i12, int i13, int i14, long j7, int i15, int i16, int i17, int i18, int i19, long j10, int i20, List list3, List list4, long j11, long j12, long j13, long j14, long j15, long j16, int i21, int i22, int i23, long j17, int i24, long j18, long j19, long j20, long j21, long j22, int i25, int i26, int i27, List list5, List list6) {
        this.f7844a = i10;
        this.H = jArr;
        Collections.unmodifiableList(list);
        Collections.unmodifiableList(list2);
        this.f7845b = j;
        this.f7846c = i11;
        this.f7847d = i12;
        this.f7848e = i13;
        this.f7849f = i14;
        this.f7850g = j7;
        this.f7851h = i15;
        this.f7852i = i16;
        this.j = i17;
        this.k = i18;
        this.f7853l = i19;
        this.f7854m = j10;
        this.f7855n = i20;
        Collections.unmodifiableList(list3);
        Collections.unmodifiableList(list4);
        this.f7856o = j11;
        this.f7857p = j12;
        this.f7858q = j13;
        this.f7859r = j14;
        this.f7860s = j15;
        this.f7861t = j16;
        this.f7862u = i21;
        this.f7863v = i22;
        this.f7864w = i23;
        this.f7865x = j17;
        this.f7866y = i24;
        this.f7867z = j18;
        this.A = j19;
        this.B = j20;
        this.C = j21;
        this.D = j22;
        this.E = i25;
        this.F = i26;
        this.G = i27;
        Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
    }

    public static k0 a(k0... k0VarArr) {
        k0[] k0VarArr2 = k0VarArr;
        long[] jArr = new long[16];
        int length = k0VarArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j = 0;
        long j7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = -1;
        long j19 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i25 < length) {
            k0 k0Var = k0VarArr2[i25];
            int i29 = k0Var.f7844a;
            long j21 = k0Var.f7867z;
            long j22 = k0Var.f7865x;
            int i30 = k0Var.f7864w;
            int i31 = length;
            long j23 = k0Var.f7854m;
            int i32 = i10;
            long[] jArr2 = jArr;
            long j24 = k0Var.f7850g;
            long j25 = k0Var.f7845b;
            int i33 = i32 + i29;
            int i34 = i25;
            int i35 = i26;
            for (int i36 = 0; i36 < 16; i36++) {
                jArr2[i36] = jArr2[i36] + k0Var.H[i36];
            }
            if (jMin == -9223372036854775807L) {
                jMin = j25;
            } else if (j25 != -9223372036854775807L) {
                jMin = Math.min(jMin, j25);
            }
            i26 = i35 + k0Var.f7846c;
            i27 += k0Var.f7847d;
            i28 += k0Var.f7848e;
            i11 += k0Var.f7849f;
            if (j20 == -9223372036854775807L) {
                j20 = j24;
            } else if (j24 != -9223372036854775807L) {
                j20 += j24;
            }
            i12 += k0Var.f7851h;
            i13 += k0Var.f7852i;
            i14 += k0Var.j;
            i15 += k0Var.k;
            i16 += k0Var.f7853l;
            if (jMax == -9223372036854775807L) {
                jMax = j23;
            } else if (j23 != -9223372036854775807L) {
                jMax = Math.max(jMax, j23);
            }
            i17 += k0Var.f7855n;
            j += k0Var.f7856o;
            j7 += k0Var.f7857p;
            j10 += k0Var.f7858q;
            j11 += k0Var.f7859r;
            j12 += k0Var.f7860s;
            j13 += k0Var.f7861t;
            i18 += k0Var.f7862u;
            i19 += k0Var.f7863v;
            int i37 = i24;
            i24 = i37 == -1 ? i30 : i30 != -1 ? i37 + i30 : i37;
            if (j18 == -1) {
                j18 = j22;
            } else if (j22 != -1) {
                j18 += j22;
            }
            i20 += k0Var.f7866y;
            if (j19 == -1) {
                j19 = j21;
            } else if (j21 != -1) {
                j19 += j21;
            }
            j14 += k0Var.A;
            j15 += k0Var.B;
            j16 += k0Var.C;
            j17 += k0Var.D;
            i21 += k0Var.E;
            i22 += k0Var.F;
            i23 += k0Var.G;
            i25 = i34 + 1;
            k0VarArr2 = k0VarArr;
            i10 = i33;
            length = i31;
            jArr = jArr2;
        }
        long j26 = jMin;
        int i38 = i11;
        long j27 = j20;
        int i39 = i12;
        int i40 = i13;
        int i41 = i14;
        int i42 = i15;
        int i43 = i16;
        long j28 = jMax;
        List list = Collections.EMPTY_LIST;
        return new k0(i10, jArr, list, list, j26, i26, i27, i28, i38, j27, i39, i40, i41, i42, i43, j28, i17, list, list, j, j7, j10, j11, j12, j13, i18, i19, i24, j18, i20, j19, j14, j15, j16, j17, i21, i22, i23, list, list);
    }
}
