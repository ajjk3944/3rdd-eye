package ec;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public String f22845d;

    /* renamed from: e, reason: collision with root package name */
    public String f22846e;

    /* renamed from: f, reason: collision with root package name */
    public int f22847f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public String f22848h;

    /* renamed from: i, reason: collision with root package name */
    public long f22849i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f22850k;

    /* renamed from: l, reason: collision with root package name */
    public List f22851l;

    /* renamed from: m, reason: collision with root package name */
    public String f22852m;

    /* renamed from: n, reason: collision with root package name */
    public int f22853n;

    /* renamed from: o, reason: collision with root package name */
    public String f22854o;

    /* renamed from: p, reason: collision with root package name */
    public String f22855p;

    /* renamed from: q, reason: collision with root package name */
    public long f22856q;

    /* renamed from: r, reason: collision with root package name */
    public String f22857r;

    public l0(o1 o1Var, long j, long j8) {
        super(o1Var);
        this.f22856q = 0L;
        this.f22857r = null;
        this.j = j;
        this.f22850k = j8;
    }

    @Override // ec.f0
    public final boolean E() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.n4 F(java.lang.String r45) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.security.NoSuchAlgorithmException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.l0.F(java.lang.String):ec.n4");
    }

    public final void G() {
        String str;
        B();
        o1 o1Var = (o1) this.f218b;
        b1 b1Var = o1Var.f22953e;
        s0 s0Var = o1Var.f22954f;
        o1.k(b1Var);
        if (b1Var.I().i(z1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            l4 l4Var = o1Var.f22956i;
            o1.k(l4Var);
            l4Var.z0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            o1.m(s0Var);
            s0Var.f23059n.d("Analytics Storage consent is not granted");
            str = null;
        }
        o1.m(s0Var);
        s0Var.f23059n.d("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f22855p = str;
        o1Var.f22957k.getClass();
        this.f22856q = System.currentTimeMillis();
    }

    public final String H() {
        C();
        pb.y.h(this.f22845d);
        return this.f22845d;
    }

    public final String I() {
        B();
        C();
        pb.y.h(this.f22854o);
        return this.f22854o;
    }
}
