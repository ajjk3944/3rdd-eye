package zc;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c0 extends w {
    public String B;
    public String D;
    public long E;
    public final long F;
    public final long G;
    public List H;
    public String I;
    public int J;
    public String K;
    public String L;
    public long M;
    public String N;

    /* renamed from: r, reason: collision with root package name */
    public String f26880r;

    /* renamed from: x, reason: collision with root package name */
    public String f26881x;

    /* renamed from: y, reason: collision with root package name */
    public int f26882y;

    public c0(c1 c1Var, long j, long j7) {
        super(c1Var);
        this.M = 0L;
        this.N = null;
        this.F = j;
        this.G = j7;
    }

    @Override // zc.w
    public final boolean v1() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzr w1(java.lang.String r45) throws java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.c0.w1(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    public final void x1() {
        String str;
        s1();
        c1 c1Var = (c1) this.f1504d;
        r0 r0Var = c1Var.f26888x;
        j0 j0Var = c1Var.f26889y;
        c1.e(r0Var);
        if (r0Var.z1().i(n1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            s3 s3Var = c1Var.E;
            c1.e(s3Var);
            s3Var.p2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            c1.g(j0Var);
            j0Var.J.b("Analytics Storage consent is not granted");
            str = null;
        }
        c1.g(j0Var);
        j0Var.J.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.L = str;
        c1Var.G.getClass();
        this.M = System.currentTimeMillis();
    }

    public final String y1() {
        t1();
        cc.s.h(this.f26880r);
        return this.f26880r;
    }

    public final String z1() {
        s1();
        t1();
        cc.s.h(this.K);
        return this.K;
    }
}
