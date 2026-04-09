package x9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y {
    public static final y I = a(new y[0]);
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final int E;
    public final int F;
    public final int G;
    public final long[] H;

    /* renamed from: a, reason: collision with root package name */
    public final int f25213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25217e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25218f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25219g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25220h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25221i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25222l;

    /* renamed from: m, reason: collision with root package name */
    public final long f25223m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25224n;

    /* renamed from: o, reason: collision with root package name */
    public final long f25225o;

    /* renamed from: p, reason: collision with root package name */
    public final long f25226p;

    /* renamed from: q, reason: collision with root package name */
    public final long f25227q;

    /* renamed from: r, reason: collision with root package name */
    public final long f25228r;

    /* renamed from: s, reason: collision with root package name */
    public final long f25229s;

    /* renamed from: t, reason: collision with root package name */
    public final long f25230t;

    /* renamed from: u, reason: collision with root package name */
    public final int f25231u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25232v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25233w;

    /* renamed from: x, reason: collision with root package name */
    public final long f25234x;

    /* renamed from: y, reason: collision with root package name */
    public final int f25235y;

    /* renamed from: z, reason: collision with root package name */
    public final long f25236z;

    public y(int i10, long[] jArr, List list, List list2, long j, int i11, int i12, int i13, int i14, long j7, int i15, int i16, int i17, int i18, int i19, long j10, int i20, List list3, List list4, long j11, long j12, long j13, long j14, long j15, long j16, int i21, int i22, int i23, long j17, int i24, long j18, long j19, long j20, long j21, long j22, int i25, int i26, int i27, List list5, List list6) {
        this.f25213a = i10;
        this.H = jArr;
        Collections.unmodifiableList(list);
        Collections.unmodifiableList(list2);
        this.f25214b = j;
        this.f25215c = i11;
        this.f25216d = i12;
        this.f25217e = i13;
        this.f25218f = i14;
        this.f25219g = j7;
        this.f25220h = i15;
        this.f25221i = i16;
        this.j = i17;
        this.k = i18;
        this.f25222l = i19;
        this.f25223m = j10;
        this.f25224n = i20;
        Collections.unmodifiableList(list3);
        Collections.unmodifiableList(list4);
        this.f25225o = j11;
        this.f25226p = j12;
        this.f25227q = j13;
        this.f25228r = j14;
        this.f25229s = j15;
        this.f25230t = j16;
        this.f25231u = i21;
        this.f25232v = i22;
        this.f25233w = i23;
        this.f25234x = j17;
        this.f25235y = i24;
        this.f25236z = j18;
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

    public static y a(y... yVarArr) {
        y[] yVarArr2 = yVarArr;
        long[] jArr = new long[16];
        int length = yVarArr2.length;
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
            y yVar = yVarArr2[i25];
            int i29 = yVar.f25213a;
            long j21 = yVar.f25236z;
            long j22 = yVar.f25234x;
            int i30 = yVar.f25233w;
            int i31 = length;
            long j23 = yVar.f25223m;
            int i32 = i10;
            long[] jArr2 = jArr;
            long j24 = yVar.f25219g;
            long j25 = yVar.f25214b;
            int i33 = i32 + i29;
            int i34 = i25;
            int i35 = i26;
            for (int i36 = 0; i36 < 16; i36++) {
                jArr2[i36] = jArr2[i36] + yVar.H[i36];
            }
            if (jMin == -9223372036854775807L) {
                jMin = j25;
            } else if (j25 != -9223372036854775807L) {
                jMin = Math.min(jMin, j25);
            }
            i26 = i35 + yVar.f25215c;
            i27 += yVar.f25216d;
            i28 += yVar.f25217e;
            i11 += yVar.f25218f;
            if (j20 == -9223372036854775807L) {
                j20 = j24;
            } else if (j24 != -9223372036854775807L) {
                j20 += j24;
            }
            i12 += yVar.f25220h;
            i13 += yVar.f25221i;
            i14 += yVar.j;
            i15 += yVar.k;
            i16 += yVar.f25222l;
            if (jMax == -9223372036854775807L) {
                jMax = j23;
            } else if (j23 != -9223372036854775807L) {
                jMax = Math.max(jMax, j23);
            }
            i17 += yVar.f25224n;
            j += yVar.f25225o;
            j7 += yVar.f25226p;
            j10 += yVar.f25227q;
            j11 += yVar.f25228r;
            j12 += yVar.f25229s;
            j13 += yVar.f25230t;
            i18 += yVar.f25231u;
            i19 += yVar.f25232v;
            int i37 = i24;
            i24 = i37 == -1 ? i30 : i30 != -1 ? i37 + i30 : i37;
            if (j18 == -1) {
                j18 = j22;
            } else if (j22 != -1) {
                j18 += j22;
            }
            i20 += yVar.f25235y;
            if (j19 == -1) {
                j19 = j21;
            } else if (j21 != -1) {
                j19 += j21;
            }
            j14 += yVar.A;
            j15 += yVar.B;
            j16 += yVar.C;
            j17 += yVar.D;
            i21 += yVar.E;
            i22 += yVar.F;
            i23 += yVar.G;
            i25 = i34 + 1;
            yVarArr2 = yVarArr;
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
        return new y(i10, jArr, list, list, j26, i26, i27, i28, i38, j27, i39, i40, i41, i42, i43, j28, i17, list, list, j, j7, j10, j11, j12, j13, i18, i19, i24, j18, i20, j19, j14, j15, j16, j17, i21, i22, i23, list, list);
    }
}
