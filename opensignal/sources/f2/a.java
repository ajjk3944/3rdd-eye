package f2;

import al.c;
import android.os.Handler;
import as.x;
import bc.f0;
import i3.g;
import p0.e;
import u.z;
import x1.f1;
import x1.l1;
import x1.r;
import y1.k1;
import y1.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f8417a;

    /* renamed from: b, reason: collision with root package name */
    public final b f8418b;

    /* renamed from: c, reason: collision with root package name */
    public final z f8419c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8420d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8421e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8422f;

    /* renamed from: g, reason: collision with root package name */
    public s f8423g;

    /* renamed from: h, reason: collision with root package name */
    public long f8424h;

    /* renamed from: i, reason: collision with root package name */
    public final x f8425i;
    public final f1.a j;

    public a() {
        f0 f0Var = new f0(1, (byte) 0);
        f0Var.f2603g = new long[192];
        f0Var.f2604r = new long[192];
        this.f8417a = f0Var;
        this.f8418b = new b();
        this.f8419c = new z();
        this.f8424h = -1L;
        this.f8425i = new x(20, this);
        this.j = new f1.a();
    }

    public static long a(f1 f1Var, long j) {
        float[] fArrB;
        int iB;
        l1 l1Var = f1Var.I;
        if (l1Var == null || (iB = se.b.b((fArrB = ((k1) l1Var).b()))) == 3) {
            return j;
        }
        if ((iB & 2) == 0) {
            return 9223372034707292159L;
        }
        return ic.a.I(g1.f0.k((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), fArrB));
    }

    public static long h(x1.f0 f0Var) {
        c cVar = f0Var.D;
        f1 f1Var = (f1) cVar.f823e;
        long jA = 0;
        for (f1 f1Var2 = (r) cVar.f822d; f1Var2 != null && f1Var2 != f1Var; f1Var2 = f1Var2.f24823q) {
            long jA2 = a(f1Var2, jA);
            if (g.l(jA2, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jA = g.A(jA2, f1Var2.f24832z);
        }
        return jA;
    }

    public static void i(x1.f0 f0Var) {
        long jH;
        f1 f1Var = (f1) f0Var.D.f823e;
        long jA = a(f1Var, 0L);
        long jA2 = 9223372034707292159L;
        if (!se.b.e(jA)) {
            f0Var.f24800d = 9223372034707292159L;
            return;
        }
        long jA3 = g.A(jA, f1Var.f24832z);
        x1.f0 f0VarC = f0Var.C();
        if (f0VarC != null) {
            if (!se.b.e(f0VarC.f24800d)) {
                i(f0VarC);
            }
            long j = f0VarC.f24800d;
            if (se.b.e(j)) {
                if (f0VarC.f24803g) {
                    jH = h(f0VarC);
                    f0VarC.f24802f = jH;
                    f0VarC.f24803g = false;
                } else {
                    jH = f0VarC.f24802f;
                }
                if (se.b.e(jH)) {
                    jA2 = g.A(g.A(j, jH), jA3);
                }
            }
        } else {
            jA2 = jA3;
        }
        f0Var.f24800d = jA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x1.f0 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.c(x1.f0, boolean):void");
    }

    public final void d(x1.f0 f0Var) {
        e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            x1.f0 f0Var2 = (x1.f0) objArr[i11];
            c(f0Var2, false);
            d(f0Var2);
        }
    }

    public final void e(x1.f0 f0Var) {
        this.f8420d = true;
        int i10 = f0Var.f24799c & 67108863;
        f0 f0Var2 = this.f8417a;
        long[] jArr = (long[]) f0Var2.f2603g;
        int i11 = f0Var2.f2602d;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            long j = jArr[i13];
            if ((((int) j) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j;
                break;
            }
            i12 += 3;
        }
        k();
    }

    public final void f(x1.f0 f0Var) {
        long jH = h(f0Var);
        if (!se.b.e(jH)) {
            d(f0Var);
            return;
        }
        f0Var.f24802f = jH;
        f0Var.f24803g = false;
        e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            g((x1.f0) objArr[i11], false);
        }
        e(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(x1.f0 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.g(x1.f0, boolean):void");
    }

    public final void j(x1.f0 f0Var) {
        int i10 = f0Var.f24799c & 67108863;
        f0 f0Var2 = this.f8417a;
        long[] jArr = (long[]) f0Var2.f2603g;
        int i11 = f0Var2.f2602d;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                break;
            }
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
            i12 += 3;
        }
        this.f8420d = true;
        this.f8422f = true;
    }

    public final void k() {
        s sVar = this.f8423g;
        boolean z10 = sVar != null;
        long j = this.f8418b.f8427b;
        if (j >= 0 || !z10) {
            if (this.f8424h == j && z10) {
                return;
            }
            if (sVar != null) {
                Handler handler = z0.a.f26479a;
                z0.a.f26479a.removeCallbacks(sVar);
            }
            Handler handler2 = z0.a.f26479a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f8424h = jMax;
            s sVar2 = new s(this.f8425i, 1);
            z0.a.f26479a.postDelayed(sVar2, jMax - jCurrentTimeMillis);
            this.f8423g = sVar2;
        }
    }
}
