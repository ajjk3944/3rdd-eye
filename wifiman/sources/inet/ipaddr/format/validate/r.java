package inet.ipaddr.format.validate;

import ag.InterfaceC3849g;
import com.google.ar.core.ImageMetadata;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.a;
import inet.ipaddr.c;
import inet.ipaddr.format.validate.d;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv4.M;
import inet.ipaddr.ipv4.Y;
import inet.ipaddr.ipv6.C6208e;
import inet.ipaddr.ipv6.Q;
import inet.ipaddr.ipv6.V;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes4.dex */
public class r extends inet.ipaddr.format.validate.c implements inet.ipaddr.format.validate.d {

    /* renamed from: B, reason: collision with root package name */
    private static final f f49413B = new f(true);

    /* renamed from: C, reason: collision with root package name */
    private static final f f49414C = new f(false);

    /* renamed from: D, reason: collision with root package name */
    private static final e[] f49415D = new e[129];

    /* renamed from: E, reason: collision with root package name */
    private static final e[] f49416E = new e[129];

    /* renamed from: F, reason: collision with root package name */
    private static final m[] f49417F = new m[65];

    /* renamed from: G, reason: collision with root package name */
    private static final m[] f49418G = new m[65];

    /* renamed from: H, reason: collision with root package name */
    private static final i[] f49419H = new i[65];

    /* renamed from: I, reason: collision with root package name */
    private static final i[] f49420I = new i[65];

    /* renamed from: J, reason: collision with root package name */
    private static final c f49421J = new c(true);

    /* renamed from: N, reason: collision with root package name */
    private static final c f49422N = new c(false);

    /* renamed from: X, reason: collision with root package name */
    private static final h[] f49423X = new h[65];

    /* renamed from: Y, reason: collision with root package name */
    private static final h[] f49424Y = new h[65];

    /* renamed from: Z, reason: collision with root package name */
    private static final BigInteger f49425Z = new BigInteger(1, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: f1, reason: collision with root package name */
    private static final BigInteger f49426f1 = new BigInteger(1, new byte[]{-128, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: g1, reason: collision with root package name */
    private static final BigInteger[] f49427g1 = new BigInteger[64];

    /* renamed from: h1, reason: collision with root package name */
    private static final BigInteger[] f49428h1 = new BigInteger[64];

    /* renamed from: i1, reason: collision with root package name */
    private static final BigInteger[] f49429i1 = new BigInteger[64];

    /* renamed from: j1, reason: collision with root package name */
    private static final BigInteger[] f49430j1 = new BigInteger[64];

    /* renamed from: A, reason: collision with root package name */
    private j[] f49431A;

    /* renamed from: w, reason: collision with root package name */
    private final inet.ipaddr.o f49432w;

    /* renamed from: x, reason: collision with root package name */
    private final Zf.f f49433x;

    /* renamed from: y, reason: collision with root package name */
    private l f49434y;

    /* renamed from: z, reason: collision with root package name */
    private j[] f49435z;

    class a extends l {
        a() {
            super();
        }

        @Override // inet.ipaddr.format.validate.r.l
        inet.ipaddr.format.validate.f y() {
            return r.this.V1();
        }
    }

    class b extends l {
        b() {
            super();
        }

        @Override // inet.ipaddr.format.validate.r.l
        inet.ipaddr.format.validate.f y() {
            return r.this.W1();
        }
    }

    public static class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f49438a;

        public c(boolean z10) {
            this.f49438a = z10;
        }
    }

    static class d implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        protected inet.ipaddr.g f49439a;

        /* renamed from: b, reason: collision with root package name */
        protected inet.ipaddr.g f49440b;

        d() {
        }

        public inet.ipaddr.g a() {
            return this.f49439a;
        }

        public d(inet.ipaddr.g gVar) {
            this(gVar, gVar);
        }

        public d(inet.ipaddr.g gVar, inet.ipaddr.g gVar2) {
            this.f49439a = gVar;
            this.f49440b = gVar2;
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private final long f49441b;

        /* renamed from: c, reason: collision with root package name */
        private final long f49442c;

        e(int i10, boolean z10) {
            super(z10);
            if (i10 >= 64) {
                this.f49442c = 0L;
                this.f49441b = (-1) >>> (i10 - 64);
            } else {
                this.f49442c = (-1) >>> i10;
                this.f49441b = -1L;
            }
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long a(long j10, long j11) {
            return super.a(j10 & (~this.f49441b), j11);
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long c(long j10, long j11) {
            return super.c(j10 | this.f49441b, j11);
        }

        @Override // inet.ipaddr.format.validate.r.f
        public long g(long j10, long j11) {
            return super.g(j10 & (~this.f49442c), j11);
        }

        @Override // inet.ipaddr.format.validate.r.f
        public long h(long j10, long j11) {
            return super.c(j10 | this.f49442c, j11);
        }
    }

    public static class f extends j {
        public f(boolean z10) {
            super(z10);
        }

        public long g(long j10, long j11) {
            return j10 & j11;
        }

        public long h(long j10, long j11) {
            return j10 & j11;
        }
    }

    public static class g extends f {

        /* renamed from: b, reason: collision with root package name */
        private final long f49443b;

        /* renamed from: c, reason: collision with root package name */
        private final long f49444c;

        /* renamed from: d, reason: collision with root package name */
        private final long f49445d;

        /* renamed from: e, reason: collision with root package name */
        private final long f49446e;

        public g(long j10, long j11, long j12, long j13) {
            super(false);
            this.f49444c = j11;
            this.f49446e = j13;
            this.f49443b = j10;
            this.f49445d = j12;
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long a(long j10, long j11) {
            return super.a(this.f49444c, j11);
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long c(long j10, long j11) {
            return super.c(this.f49446e, j11);
        }

        @Override // inet.ipaddr.format.validate.r.f
        public long g(long j10, long j11) {
            return super.g(this.f49443b, j11);
        }

        @Override // inet.ipaddr.format.validate.r.f
        public long h(long j10, long j11) {
            return super.h(this.f49445d, j11);
        }
    }

    public static class h extends c {
    }

    public static class i extends j {

        /* renamed from: b, reason: collision with root package name */
        private final long f49447b;

        /* renamed from: c, reason: collision with root package name */
        public final int f49448c;

        public i(int i10, boolean z10) {
            super(z10);
            this.f49448c = i10;
            this.f49447b = (-1) >>> i10;
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long a(long j10, long j11) {
            return super.a(j10 & (~this.f49447b), j11);
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long c(long j10, long j11) {
            return super.c(j10 | this.f49447b, j11);
        }
    }

    public static abstract class j implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f49449a;

        public j(boolean z10) {
            this.f49449a = z10;
        }

        public long a(long j10, long j11) {
            return j10 & j11;
        }

        public long c(long j10, long j11) {
            return j10 & j11;
        }

        public boolean d() {
            return this.f49449a;
        }
    }

    public static class k extends j {

        /* renamed from: b, reason: collision with root package name */
        private final long f49450b;

        /* renamed from: c, reason: collision with root package name */
        private final long f49451c;

        public k(long j10, long j11) {
            super(false);
            this.f49450b = j10;
            this.f49451c = j11;
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long a(long j10, long j11) {
            return super.a(this.f49450b, j11);
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long c(long j10, long j11) {
            return super.c(this.f49451c, j11);
        }
    }

    abstract class l extends d {

        /* renamed from: c, reason: collision with root package name */
        private inet.ipaddr.j f49452c;

        /* renamed from: d, reason: collision with root package name */
        private inet.ipaddr.j f49453d;

        /* renamed from: e, reason: collision with root package name */
        private inet.ipaddr.j f49454e;

        /* renamed from: f, reason: collision with root package name */
        private inet.ipaddr.j f49455f;

        /* renamed from: g, reason: collision with root package name */
        private IncompatibleAddressException f49456g;

        /* renamed from: h, reason: collision with root package name */
        private IncompatibleAddressException f49457h;

        /* renamed from: i, reason: collision with root package name */
        private IncompatibleAddressException f49458i;

        /* renamed from: j, reason: collision with root package name */
        private IncompatibleAddressException f49459j;

        /* renamed from: k, reason: collision with root package name */
        private inet.ipaddr.m f49460k;

        /* renamed from: l, reason: collision with root package name */
        private inet.ipaddr.g f49461l;

        /* renamed from: m, reason: collision with root package name */
        private inet.ipaddr.g f49462m;

        /* renamed from: n, reason: collision with root package name */
        private ag.k f49463n;

        l() {
        }

        private CharSequence E() {
            return r.this.V0().o();
        }

        public inet.ipaddr.g B() {
            if (this.f49453d == null) {
                return a();
            }
            if (this.f49440b == null) {
                this.f49440b = (inet.ipaddr.g) y().j(this.f49453d, E(), null);
            }
            return this.f49440b;
        }

        inet.ipaddr.g C() {
            return (inet.ipaddr.g) y().j(this.f49454e, null, null);
        }

        boolean F() {
            return this.f49439a != null;
        }

        boolean J() {
            return this.f49440b != null;
        }

        boolean K() {
            return this.f49454e != null;
        }

        boolean P() {
            return this.f49457h == null && this.f49458i == null && this.f49459j == null;
        }

        boolean S() {
            return this.f49463n == null;
        }

        boolean T() {
            return this.f49460k == null;
        }

        @Override // inet.ipaddr.format.validate.r.d
        public inet.ipaddr.g a() {
            if (this.f49439a == null) {
                if (this.f49460k == null) {
                    this.f49439a = (inet.ipaddr.g) y().j(this.f49452c, E(), r.this.f49433x);
                } else {
                    this.f49439a = (inet.ipaddr.g) y().l(this.f49452c, E(), r.this.f49433x, this.f49461l, this.f49462m);
                }
            }
            return this.f49439a;
        }

        boolean b0() {
            return this.f49452c == null;
        }

        inet.ipaddr.m v() {
            inet.ipaddr.g gVar = (inet.ipaddr.g) y().j(this.f49454e, E(), null);
            this.f49461l = gVar;
            if (this.f49455f != null) {
                gVar = (inet.ipaddr.g) y().j(this.f49455f, E(), null);
            }
            this.f49462m = gVar;
            inet.ipaddr.m mVarJ1 = this.f49461l.j1(gVar);
            this.f49460k = mVarJ1;
            return mVarJ1;
        }

        abstract inet.ipaddr.format.validate.f y();
    }

    public static class m extends f {

        /* renamed from: b, reason: collision with root package name */
        private final j f49465b;

        m(j jVar) {
            super(jVar.d());
            this.f49465b = jVar;
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long a(long j10, long j11) {
            return this.f49465b.a(j10, j11);
        }

        @Override // inet.ipaddr.format.validate.r.j
        public long c(long j10, long j11) {
            return this.f49465b.c(j10, j11);
        }
    }

    r(Zf.f fVar, CharSequence charSequence, inet.ipaddr.o oVar) {
        super(charSequence);
        this.f49432w = oVar;
        this.f49433x = fVar;
    }

    private static inet.ipaddr.k[] H1(inet.ipaddr.k[] kVarArr, inet.ipaddr.k[] kVarArr2, c.a aVar, int i10, int i11) {
        if (kVarArr == null) {
            kVarArr = (inet.ipaddr.k[]) aVar.d(i10);
            if (i11 > 0) {
                System.arraycopy(kVarArr2, 0, kVarArr, 0, i11);
            }
        }
        return kVarArr;
    }

    private static Integer I1(int i10) {
        return inet.ipaddr.format.validate.g.a(i10);
    }

    private static boolean J1(inet.ipaddr.j jVar, int i10, int i11) {
        if (jVar == null || i10 >= i11) {
            return false;
        }
        boolean zA0 = jVar.q(i10).A0();
        do {
            i10++;
            inet.ipaddr.k kVarQ = jVar.q(i10);
            if (!zA0) {
                zA0 = kVarQ.A0();
            } else if (!kVarQ.w()) {
                return true;
            }
        } while (i10 < i11);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Boolean K1(inet.ipaddr.format.validate.r r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.r.K1(inet.ipaddr.format.validate.r, boolean, boolean):java.lang.Boolean");
    }

    static inet.ipaddr.g L1(g.a aVar, inet.ipaddr.format.validate.i iVar, Zf.f fVar, inet.ipaddr.o oVar) {
        int iC1 = inet.ipaddr.g.c1(aVar);
        inet.ipaddr.g gVarL = iVar.l();
        inet.ipaddr.g gVar = (gVarL == null || gVarL.W0(true) == null) ? gVarL : null;
        boolean z10 = gVar != null;
        Integer numX1 = X1(iVar);
        if (!aVar.isIPv4()) {
            C6208e.a aVarM = oVar.r().t().m();
            V[] vArr = (V[]) aVarM.d(iC1);
            int i10 = 0;
            while (i10 < iC1) {
                int i11 = i10;
                vArr[i11] = (V) M1(aVar, 0, 65535, i10, b2(i10, aVar, iVar), z10 ? I1(gVar.q(i10).Q()) : null, aVarM);
                i10 = i11 + 1;
            }
            return (inet.ipaddr.g) aVarM.o(vArr, iVar.o(), fVar, numX1);
        }
        C6183e.a aVarA = oVar.p().r().a();
        M[] mArr = (M[]) aVarA.d(iC1);
        int i12 = 0;
        while (i12 < iC1) {
            int i13 = i12;
            M[] mArr2 = mArr;
            mArr2[i13] = (M) M1(aVar, 0, 255, i12, b2(i12, aVar, iVar), z10 ? I1(gVar.q(i12).Q()) : null, aVarA);
            i12 = i13 + 1;
            mArr = mArr2;
        }
        return (inet.ipaddr.g) aVarA.n(mArr, fVar, numX1);
    }

    private static inet.ipaddr.k M1(g.a aVar, int i10, int i11, int i12, Integer num, Integer num2, inet.ipaddr.format.validate.f fVar) {
        int i13;
        int iC;
        if (num2 != null) {
            long j10 = i10;
            long j11 = i11;
            long jIntValue = num2.intValue();
            j jVarO2 = o2(j10, j11, jIntValue, fVar.y());
            if (!jVarO2.d()) {
                throw new IncompatibleAddressException(j10, j11, jIntValue, "ipaddress.error.maskMismatch");
            }
            int iA = (int) jVarO2.a(j10, jIntValue);
            iC = (int) jVarO2.c(j11, jIntValue);
            i13 = iA;
        } else {
            i13 = i10;
            iC = i11;
        }
        return R1(null, aVar, i13, iC, false, null, i12, num, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05aa A[PHI: r0
  0x05aa: PHI (r0v15 inet.ipaddr.ipv4.M[]) = (r0v5 inet.ipaddr.ipv4.M[]), (r0v16 inet.ipaddr.ipv4.M[]) binds: [B:219:0x0593, B:223:0x059e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[PHI: r0
  0x00ae: PHI (r0v56 boolean) = (r0v55 boolean), (r0v89 boolean), (r0v89 boolean) binds: [B:37:0x008d, B:43:0x009a, B:239:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N1(boolean r56, boolean r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.r.N1(boolean, boolean, boolean):void");
    }

    private static V O1(l lVar, InterfaceC3849g interfaceC3849g, int i10, int i11, int i12, int i13, Integer num, C6208e.a aVar) {
        if (i10 != i11) {
            if (num == null || !aVar.e().d().allPrefixedAddressesAreSubnets()) {
                if ((lVar.f49458i == null && i12 != 0) || i13 != 255) {
                    lVar.f49458i = new IncompatibleAddressException(interfaceC3849g, "ipaddress.error.invalidMixedRange");
                }
            } else if (num.intValue() > 8) {
                int iIntValue = (255 << (8 - (num.intValue() - 8))) & 255;
                i12 &= iIntValue;
                i13 |= (~iIntValue) & 255;
                if ((lVar.f49458i == null && i12 != 0) || i13 != 255) {
                    lVar.f49458i = new IncompatibleAddressException(interfaceC3849g, "ipaddress.error.invalidMixedRange");
                }
            } else {
                i12 = 0;
                i13 = 255;
            }
        }
        return aVar.c((i10 << 8) | i12, (i11 << 8) | i13, num);
    }

    private void P1(boolean z10, boolean z11, boolean z12) {
        V[] vArrD;
        V[] vArrD2;
        Integer num;
        C6208e.a aVar;
        V[] vArr;
        l lVar;
        Q q10;
        V[] vArr2;
        V[] vArr3;
        Integer num2;
        boolean z13;
        final V[] vArr4;
        final V[] vArr5;
        int i10;
        int i11;
        CharSequence charSequence;
        Q q11;
        V[] vArr6;
        V[] vArr7;
        V[] vArr8;
        inet.ipaddr.g gVar;
        int i12;
        Integer num3;
        C6208e.a aVar2;
        V[] vArr9;
        Y y10;
        int i13;
        l lVar2;
        int i14;
        int i15;
        int i16;
        int iA;
        boolean z14;
        r rVar;
        int i17;
        int i18;
        C6208e.a aVar3;
        V[] vArr10;
        boolean z15;
        V[] vArr11;
        V[] vArr12;
        V[] vArr13;
        int i19;
        Integer num4;
        int i20;
        int i21;
        int i22;
        int i23;
        V[] vArr14;
        int i24;
        int i25;
        inet.ipaddr.format.validate.i iVar;
        CharSequence charSequence2;
        boolean z16;
        V[] vArr15;
        l lVar3;
        inet.ipaddr.g gVar2;
        int i26;
        C6208e.a aVar4;
        inet.ipaddr.format.validate.a aVar5;
        int i27;
        boolean z17;
        C6208e.a aVar6;
        int i28;
        l lVar4;
        inet.ipaddr.g gVar3;
        long j10;
        long j11;
        inet.ipaddr.format.validate.i iVar2;
        int i29;
        boolean z18;
        inet.ipaddr.format.validate.i iVar3;
        int i30;
        int i31;
        inet.ipaddr.format.validate.a aVar7;
        l lVar5;
        long j12;
        V[] vArr16;
        V[] vArr17;
        long j13;
        V[] vArr18;
        C6208e.a aVar8;
        inet.ipaddr.format.validate.a aVar9;
        V[] vArr19;
        V[] vArr20;
        V[] vArr21;
        long j14;
        V[] vArr22;
        V[] vArr23;
        boolean z19;
        long jO;
        long jO2;
        int i32;
        boolean z20;
        int i33;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        int i34;
        long j20;
        C6208e.a aVar10;
        inet.ipaddr.format.validate.a aVar11;
        int i35;
        inet.ipaddr.g gVar4;
        int i36;
        long j21;
        l lVar6;
        int i37;
        long j22;
        long j23;
        boolean z21;
        long j24;
        inet.ipaddr.format.validate.i iVar4;
        int i38;
        int i39;
        int i40;
        long j25;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        V[] vArr24;
        long j26;
        inet.ipaddr.g gVar5;
        int i48;
        int i49;
        inet.ipaddr.format.validate.i iVar5;
        long j27;
        int i50;
        boolean z22;
        l lVar7;
        int i51;
        inet.ipaddr.format.validate.a aVar12;
        long j28;
        V[] vArr25;
        V[] vArr26;
        V[] vArr27;
        long j29;
        C6208e.a aVar13;
        V[] vArr28;
        int i52;
        int i53;
        V[] vArr29;
        long j30;
        boolean z23;
        long jC;
        long j31;
        int i54;
        f fVar;
        long j32;
        long j33;
        r rVar2 = this;
        inet.ipaddr.format.validate.i iVarV0 = V0();
        inet.ipaddr.g gVarY1 = Y1();
        inet.ipaddr.g gVar6 = (gVarY1 == null || gVarY1.W0(true) == null) ? gVarY1 : null;
        boolean z24 = gVar6 != null;
        inet.ipaddr.format.validate.a aVarU0 = U0();
        int iZ = aVarU0.Z();
        if (z24 && rVar2.f49435z == null) {
            rVar2.f49435z = new j[iZ];
        }
        C6208e.a aVarW1 = W1();
        if (z10) {
            vArrD2 = aVarW1.d(8);
            vArrD = null;
        } else {
            if (!z11) {
                return;
            }
            vArrD = aVarW1.d(8);
            vArrD2 = null;
        }
        l bVar = rVar2.f49434y;
        if (bVar == null) {
            bVar = rVar2.new b();
            rVar2.f49434y = bVar;
        }
        l lVar8 = bVar;
        boolean zG1 = g1();
        int i55 = (zG1 ? 6 : 8) - iZ;
        boolean z25 = i55 <= 0;
        CharSequence charSequence3 = rVar2.f49354j;
        int i56 = -1;
        int i57 = -1;
        int i58 = 0;
        int i59 = 0;
        boolean z26 = false;
        V[] vArr30 = null;
        V[] vArr31 = null;
        boolean z27 = z25;
        V[] vArr32 = vArrD;
        boolean z28 = z27;
        while (i59 < iZ) {
            l lVar9 = lVar8;
            V[] vArr33 = vArrD2;
            long jO3 = aVarU0.o(i59, 2);
            inet.ipaddr.g gVar7 = gVar6;
            long jO4 = aVarU0.o(i59, 10);
            if (z28) {
                vArr14 = vArr32;
                i24 = i55;
                i25 = iZ;
                iVar = iVarV0;
                charSequence2 = charSequence3;
                z16 = z24;
                vArr15 = vArr33;
                lVar3 = lVar9;
                gVar2 = gVar7;
                i26 = i58;
                aVar4 = aVarW1;
                aVar5 = aVarU0;
                i27 = i59;
                z17 = z28;
            } else {
                boolean z29 = i59 == iZ + (-1);
                boolean zC = aVarU0.C(i59);
                boolean zB1 = rVar2.b1(i59);
                boolean z30 = z29 || zB1;
                if (z30) {
                    z17 = z30;
                } else {
                    if (zC) {
                        for (int i60 = i59 + 1; i60 < iZ; i60++) {
                            if (aVarU0.C(i60) || rVar2.b1(i60)) {
                                z17 = false;
                                break;
                            }
                        }
                        z17 = zC;
                    } else {
                        z17 = zC;
                    }
                    int i61 = i31 + 1;
                    rVar2 = this;
                    aVarU0 = aVar9;
                    gVar6 = gVar3;
                    aVarW1 = aVar8;
                    vArrD2 = vArr18;
                    iZ = i25;
                    lVar8 = lVar5;
                    charSequence3 = charSequence2;
                    iVarV0 = iVar3;
                    z24 = z16;
                    i59 = i61;
                    i55 = i24;
                }
                if (z17) {
                    long j34 = 0;
                    if (zB1) {
                        vArr23 = vArr32;
                        i33 = i56;
                        i32 = i57;
                        j15 = 0;
                        j17 = 0;
                        j16 = 0;
                        jO2 = 0;
                        z20 = false;
                    } else if (zC) {
                        if (i55 > 3) {
                            j19 = (-1) >>> ((7 - i55) << 4);
                            j18 = -1;
                        } else {
                            j18 = (-1) >>> ((3 - i55) << 4);
                            j19 = 0;
                        }
                        vArr23 = vArr32;
                        j17 = j19;
                        j16 = 0;
                        j15 = j18;
                        z20 = true;
                        i33 = i56;
                        i32 = i57;
                        jO2 = 0;
                    } else {
                        vArr23 = vArr32;
                        if (i55 > 3) {
                            jO2 = aVarU0.o(i59, 4);
                            jO = aVarU0.o(i59, 12);
                            z19 = (jO3 == jO4 && jO2 == jO) ? false : true;
                        } else {
                            z19 = jO3 != jO4;
                            jO = 0;
                            jO2 = 0;
                        }
                        i32 = i59 + i55;
                        z20 = z19;
                        i33 = i59;
                        long j35 = jO;
                        j15 = jO4;
                        j16 = jO3;
                        j17 = j35;
                    }
                    int i62 = i55 + 1;
                    int i63 = iZ;
                    int i64 = i62 * 16;
                    if (!z24) {
                        i34 = i55;
                        j20 = j17;
                        aVar10 = aVarW1;
                        aVar11 = aVarU0;
                        iVar3 = iVarV0;
                        i35 = i59;
                        charSequence2 = charSequence3;
                        z16 = z24;
                        gVar4 = gVar7;
                        i36 = i58;
                        j21 = j16;
                        lVar6 = lVar9;
                        i37 = i64;
                        j22 = jO2;
                        j23 = j15;
                        j34 = j21;
                        z21 = z20;
                        j24 = j20;
                    } else if (zB1) {
                        aVar11 = aVarU0;
                        rVar2.f49435z[i59] = f49413B;
                        i34 = i55;
                        j20 = j17;
                        aVar10 = aVarW1;
                        iVar3 = iVarV0;
                        i35 = i59;
                        charSequence2 = charSequence3;
                        z16 = z24;
                        j23 = 0;
                        j24 = 0;
                        gVar4 = gVar7;
                        z21 = false;
                        i36 = i58;
                        j21 = j16;
                        lVar6 = lVar9;
                        i37 = i64;
                        j22 = jO2;
                        jO2 = 0;
                    } else {
                        aVar11 = aVarU0;
                        if (i55 >= 4) {
                            f fVarN2 = (f) rVar2.f49435z[i59];
                            charSequence2 = charSequence3;
                            int i65 = i55 - 3;
                            aVar10 = aVarW1;
                            iVar3 = iVarV0;
                            i35 = i59;
                            long jQ = 0;
                            int i66 = 0;
                            while (i66 < i65) {
                                jQ = (jQ << 16) | gVar7.q(i58 + i66).Q();
                                i66++;
                                i65 = i65;
                                z24 = z24;
                                j17 = j17;
                            }
                            long j36 = j17;
                            z16 = z24;
                            char c10 = 16;
                            long jQ2 = 0;
                            while (i65 <= i55) {
                                jQ2 = (jQ2 << c10) | gVar7.q(i58 + i65).Q();
                                i65++;
                                i58 = i58;
                                c10 = 16;
                            }
                            i36 = i58;
                            if (fVarN2 == null) {
                                long j37 = i64 == 64 ? -1L : ~((-1) << (i64 - 64));
                                j[] jVarArr = rVar2.f49435z;
                                fVarN2 = n2(j16, jO2, j15, j36, jQ2, jQ, -1L, j37);
                                jVarArr[i35] = fVarN2;
                            }
                            if (fVarN2.d() || lVar9.f49459j != null) {
                                i34 = i55;
                                i54 = i64;
                                fVar = fVarN2;
                                gVar4 = gVar7;
                                lVar6 = lVar9;
                                j22 = jO2;
                                j32 = j16;
                                j33 = j36;
                            } else {
                                int i67 = i62 * 2;
                                i54 = i64;
                                fVar = fVarN2;
                                gVar4 = gVar7;
                                j22 = jO2;
                                i34 = i55;
                                String string = new BigInteger(1, r2(j16, j22, i67)).toString();
                                j32 = j16;
                                j33 = j36;
                                IncompatibleAddressException incompatibleAddressException = new IncompatibleAddressException(string, new BigInteger(1, r2(j15, j33, i67)).toString(), new BigInteger(1, r2(jQ2, jQ, i67)).toString(), "ipaddress.error.maskMismatch");
                                lVar6 = lVar9;
                                lVar6.f49459j = incompatibleAddressException;
                            }
                            f fVar2 = fVar;
                            long jG = fVar2.g(j22, jQ);
                            long jH = fVar2.h(j33, jQ);
                            j21 = j32;
                            long jA = fVar2.a(j21, jQ2);
                            jC = fVar2.c(j15, jQ2);
                            z23 = (jA == jC && jG == jH) ? false : true;
                            z26 = (!z26 && jA == j21 && jC == j15 && jG == j22 && jH == j33) ? false : true;
                            j20 = j33;
                            i37 = i54;
                            j31 = jG;
                            j34 = jA;
                            j30 = jH;
                        } else {
                            int i68 = i55;
                            aVar10 = aVarW1;
                            iVar3 = iVarV0;
                            i35 = i59;
                            charSequence2 = charSequence3;
                            z16 = z24;
                            j22 = jO2;
                            i36 = i58;
                            j21 = j16;
                            lVar6 = lVar9;
                            long j38 = j17;
                            j jVar = rVar2.f49435z[i35];
                            long jQ3 = 0;
                            int i69 = i68;
                            int i70 = 0;
                            while (i70 <= i69) {
                                jQ3 = (jQ3 << 16) | gVar7.q(i36 + i70).Q();
                                i70++;
                                i69 = i69;
                                j38 = j38;
                            }
                            i34 = i69;
                            j20 = j38;
                            if (jVar == null) {
                                i37 = i64;
                                gVar4 = gVar7;
                                long j39 = i37 == 64 ? -1L : ~((-1) << i37);
                                j[] jVarArr2 = rVar2.f49435z;
                                j jVarO2 = o2(j21, j15, jQ3, j39);
                                jVarArr2[i35] = jVarO2;
                                jVar = jVarO2;
                            } else {
                                gVar4 = gVar7;
                                i37 = i64;
                            }
                            if (!jVar.d() && lVar6.f49459j == null) {
                                lVar6.f49459j = new IncompatibleAddressException(j21, j15, jQ3, "ipaddress.error.maskMismatch");
                            }
                            long jA2 = jVar.a(j21, jQ3);
                            long jC2 = jVar.c(j15, jQ3);
                            boolean z31 = jA2 != jC2;
                            z26 = (!z26 && jA2 == j21 && jC2 == j15) ? false : true;
                            j30 = 0;
                            j34 = jA2;
                            z23 = z31;
                            jC = jC2;
                            j31 = 0;
                        }
                        j23 = jC;
                        j24 = j30;
                        jO2 = j31;
                        z21 = z23;
                    }
                    int i71 = i37;
                    V[] vArr34 = vArr23;
                    V[] vArr35 = vArr30;
                    V[] vArr36 = vArr31;
                    int i72 = i36;
                    int i73 = i34;
                    while (i73 >= 0) {
                        l lVar10 = lVar6;
                        V[] vArr37 = vArr36;
                        inet.ipaddr.format.validate.i iVar6 = iVar3;
                        Integer numA2 = a2(i72, 16, iVar6);
                        if (zB1) {
                            j25 = j15;
                            i42 = i71;
                            i38 = i73;
                            iVar4 = iVar6;
                            i39 = 0;
                            i40 = 0;
                            i41 = 0;
                            i43 = 0;
                        } else {
                            int i74 = i71 - 16;
                            iVar4 = iVar6;
                            if (i73 >= 4) {
                                int i75 = i71 - 80;
                                i38 = i73;
                                int i76 = ((int) (j22 >>> i75)) & 65535;
                                if (z20) {
                                    i76 = ((int) (j20 >>> i75)) & 65535;
                                }
                                if (z16) {
                                    i44 = i76;
                                    int i77 = ((int) (jO2 >>> i75)) & 65535;
                                    i46 = z21 ? ((int) (j24 >>> i75)) & 65535 : i77;
                                    i45 = i77;
                                } else {
                                    i44 = i76;
                                    i45 = i76;
                                    i46 = i44;
                                }
                                i41 = i46;
                                i42 = i74;
                                i39 = i76;
                                i43 = i45;
                                i40 = i44;
                                j25 = j15;
                            } else {
                                i38 = i73;
                                i39 = ((int) (j21 >>> i74)) & 65535;
                                i40 = z20 ? ((int) (j15 >>> i74)) & 65535 : i39;
                                if (z16) {
                                    j25 = j15;
                                    int i78 = ((int) (j34 >>> i74)) & 65535;
                                    if (z21) {
                                        i78 = ((int) (j23 >>> i74)) & 65535;
                                    }
                                    i42 = i74;
                                    i43 = i78;
                                    i41 = i78;
                                } else {
                                    j25 = j15;
                                    i41 = i40;
                                    i42 = i74;
                                    i43 = i39;
                                }
                            }
                        }
                        if (z10) {
                            if (z26 || numA2 != null) {
                                i47 = i41;
                                V[] vArr38 = vArr33;
                                C6208e.a aVar14 = aVar10;
                                vArr26 = (V[]) H1(vArr35, vArr38, aVar14, 8, i72);
                                j26 = j25;
                                i48 = i34;
                                gVar5 = gVar4;
                                j27 = j20;
                                lVar7 = lVar10;
                                i51 = i38;
                                vArr29 = vArr38;
                                iVar5 = iVar4;
                                vArr24 = vArr37;
                                aVar10 = aVar14;
                                i50 = i43;
                                j28 = j22;
                                i49 = i63;
                                z22 = z21;
                                aVar12 = aVar11;
                                vArr26[i72] = (V) T1(charSequence2, g.a.IPV6, i39, i40, false, i35, null, aVar10);
                            } else {
                                i47 = i41;
                                vArr29 = vArr33;
                                vArr24 = vArr37;
                                j26 = j25;
                                gVar5 = gVar4;
                                i48 = i34;
                                i49 = i63;
                                iVar5 = iVar4;
                                j27 = j20;
                                vArr26 = vArr35;
                                i50 = i43;
                                z22 = z21;
                                lVar7 = lVar10;
                                i51 = i38;
                                aVar12 = aVar11;
                                j28 = j22;
                            }
                            vArr25 = vArr29;
                            vArr25[i72] = (V) T1(charSequence2, g.a.IPV6, i50, i47, false, i35, numA2, aVar10);
                        } else {
                            i47 = i41;
                            vArr24 = vArr37;
                            j26 = j25;
                            gVar5 = gVar4;
                            i48 = i34;
                            i49 = i63;
                            iVar5 = iVar4;
                            j27 = j20;
                            i50 = i43;
                            z22 = z21;
                            lVar7 = lVar10;
                            i51 = i38;
                            aVar12 = aVar11;
                            j28 = j22;
                            vArr25 = vArr33;
                            vArr26 = vArr35;
                        }
                        if (z11) {
                            int i79 = i47;
                            int i80 = i50;
                            boolean z32 = i80 != i79;
                            if (!z10 || z32) {
                                C6208e.a aVar15 = aVar10;
                                if (z10) {
                                    vArr34 = (V[]) H1(vArr34, vArr25, aVar15, 8, i72);
                                }
                                j29 = j21;
                                i52 = 8;
                                aVar13 = aVar15;
                                i53 = i79;
                                vArr27 = vArr25;
                                vArr34[i72] = (V) T1(charSequence2, g.a.IPV6, i80, i80, false, i35, numA2, aVar13);
                            } else {
                                if (vArr34 != null) {
                                    vArr34[i72] = vArr25[i72];
                                }
                                i53 = i79;
                                vArr27 = vArr25;
                                j29 = j21;
                                aVar13 = aVar10;
                                i52 = 8;
                            }
                            if (!z12) {
                                vArr28 = vArr24;
                            } else if (z32) {
                                V[] vArr39 = (V[]) H1(vArr24, vArr34, aVar13, i52, i72);
                                vArr39[i72] = (V) T1(charSequence2, g.a.IPV6, i53, i53, false, i35, numA2, aVar13);
                                vArr36 = vArr39;
                                i72++;
                                i73 = i51 - 1;
                                aVar11 = aVar12;
                                aVar10 = aVar13;
                                vArr35 = vArr26;
                                i71 = i42;
                                j22 = j28;
                                i63 = i49;
                                z21 = z22;
                                j15 = j26;
                                lVar6 = lVar7;
                                j20 = j27;
                                j21 = j29;
                                gVar4 = gVar5;
                                iVar3 = iVar5;
                                vArr33 = vArr27;
                                i34 = i48;
                            } else {
                                vArr28 = vArr24;
                                if (vArr28 != null) {
                                    vArr28[i72] = vArr34[i72];
                                }
                            }
                        } else {
                            vArr27 = vArr25;
                            j29 = j21;
                            aVar13 = aVar10;
                            vArr28 = vArr24;
                        }
                        vArr36 = vArr28;
                        i72++;
                        i73 = i51 - 1;
                        aVar11 = aVar12;
                        aVar10 = aVar13;
                        vArr35 = vArr26;
                        i71 = i42;
                        j22 = j28;
                        i63 = i49;
                        z21 = z22;
                        j15 = j26;
                        lVar6 = lVar7;
                        j20 = j27;
                        j21 = j29;
                        gVar4 = gVar5;
                        iVar3 = iVar5;
                        vArr33 = vArr27;
                        i34 = i48;
                    }
                    inet.ipaddr.g gVar8 = gVar4;
                    i24 = i34;
                    i25 = i63;
                    inet.ipaddr.format.validate.a aVar16 = aVar11;
                    int i81 = i35;
                    lVar5 = lVar6;
                    aVar16.d0(i81, i37);
                    vArr31 = vArr36;
                    vArr30 = vArr35;
                    aVar9 = aVar16;
                    vArr32 = vArr34;
                    i58 = i72;
                    aVar8 = aVar10;
                    z28 = z17;
                    i56 = i33;
                    i57 = i32;
                    gVar3 = gVar8;
                    vArr18 = vArr33;
                    i31 = i81;
                    int i612 = i31 + 1;
                    rVar2 = this;
                    aVarU0 = aVar9;
                    gVar6 = gVar3;
                    aVarW1 = aVar8;
                    vArrD2 = vArr18;
                    iZ = i25;
                    lVar8 = lVar5;
                    charSequence3 = charSequence2;
                    iVarV0 = iVar3;
                    z24 = z16;
                    i59 = i612;
                    i55 = i24;
                } else {
                    vArr14 = vArr32;
                    i24 = i55;
                    i25 = iZ;
                    iVar = iVarV0;
                    charSequence2 = charSequence3;
                    z16 = z24;
                    vArr15 = vArr33;
                    lVar3 = lVar9;
                    gVar2 = gVar7;
                    i26 = i58;
                    aVar4 = aVarW1;
                    aVar5 = aVarU0;
                    i27 = i59;
                }
            }
            if (z16) {
                j jVar2 = rVar2.f49435z[i27];
                i28 = i26;
                gVar3 = gVar2;
                int iQ = gVar3.q(i28).Q();
                if (jVar2 == null) {
                    j[] jVarArr3 = rVar2.f49435z;
                    aVar6 = aVar4;
                    j jVarO22 = o2(jO3, jO4, iQ, aVar4.y());
                    jVarArr3[i27] = jVarO22;
                    jVar2 = jVarO22;
                } else {
                    aVar6 = aVar4;
                }
                if (jVar2.d() || lVar3.f49459j != null) {
                    lVar4 = lVar3;
                } else {
                    lVar4 = lVar3;
                    lVar4.f49459j = new IncompatibleAddressException(jO3, jO4, iQ, "ipaddress.error.maskMismatch");
                }
                long j40 = iQ;
                long jA3 = (int) jVar2.a(jO3, j40);
                long jC3 = (int) jVar2.c(jO4, j40);
                boolean z33 = jO3 == jA3 && jO4 == jC3;
                z26 = z26 || !z33;
                z18 = z33;
                j10 = jA3;
                j11 = jC3;
                iVar2 = iVar;
                i29 = 16;
            } else {
                aVar6 = aVar4;
                i28 = i26;
                lVar4 = lVar3;
                gVar3 = gVar2;
                j10 = jO3;
                j11 = jO4;
                iVar2 = iVar;
                i29 = 16;
                z18 = true;
            }
            Integer numA22 = a2(i28, i29, iVar2);
            if (z10) {
                if (z26 || numA22 != null) {
                    iVar3 = iVar2;
                    long j41 = j11;
                    C6208e.a aVar17 = aVar6;
                    V[] vArr40 = vArr15;
                    vArr30 = (V[]) H1(vArr30, vArr40, aVar17, 8, i28);
                    int i82 = (int) jO4;
                    j14 = j10;
                    vArr16 = vArr14;
                    aVar6 = aVar17;
                    i30 = i28;
                    aVar7 = aVar5;
                    j13 = j41;
                    vArr22 = vArr40;
                    i31 = i27;
                    vArr30[i30] = (V) T1(charSequence2, g.a.IPV6, (int) jO3, i82, true, i27, null, aVar6);
                } else {
                    iVar3 = iVar2;
                    i30 = i28;
                    i31 = i27;
                    aVar7 = aVar5;
                    j14 = j10;
                    vArr16 = vArr14;
                    vArr22 = vArr15;
                    j13 = j11;
                }
                long j42 = j14;
                lVar5 = lVar4;
                j12 = j42;
                vArr17 = vArr22;
                vArr17[i30] = (V) T1(charSequence2, g.a.IPV6, (int) j42, (int) j13, z18, i31, numA22, aVar6);
            } else {
                iVar3 = iVar2;
                i30 = i28;
                i31 = i27;
                aVar7 = aVar5;
                lVar5 = lVar4;
                j12 = j10;
                vArr16 = vArr14;
                vArr17 = vArr15;
                j13 = j11;
            }
            if (z11) {
                boolean z34 = j12 != j13;
                if (!z10 || z34) {
                    V[] vArr41 = vArr16;
                    C6208e.a aVar18 = aVar6;
                    V[] vArr42 = z10 ? (V[]) H1(vArr41, vArr17, aVar18, 8, i30) : vArr41;
                    int i83 = (int) j12;
                    aVar8 = aVar18;
                    vArr18 = vArr17;
                    vArr42[i30] = (V) T1(charSequence2, g.a.IPV6, i83, i83, false, i31, numA22, aVar8);
                    vArr19 = vArr42;
                } else {
                    V[] vArr43 = vArr16;
                    if (vArr43 != null) {
                        vArr43[i30] = vArr17[i30];
                    }
                    vArr18 = vArr17;
                    aVar8 = aVar6;
                    vArr19 = vArr43;
                }
                if (!z12) {
                    vArr20 = vArr19;
                    vArr21 = vArr31;
                } else if (z34) {
                    vArr31 = (V[]) H1(vArr31, vArr19, aVar8, 8, i30);
                    int i84 = (int) j13;
                    vArr20 = vArr19;
                    vArr31[i30] = (V) T1(charSequence2, g.a.IPV6, i84, i84, false, i31, numA22, aVar8);
                    vArr32 = vArr20;
                } else {
                    vArr20 = vArr19;
                    vArr21 = vArr31;
                    if (vArr21 != null) {
                        vArr21[i30] = vArr20[i30];
                    }
                }
                vArr31 = vArr21;
                vArr32 = vArr20;
            } else {
                vArr18 = vArr17;
                aVar8 = aVar6;
                vArr32 = vArr16;
            }
            i58 = i30 + 1;
            aVar9 = aVar7;
            aVar9.d0(i31, 16);
            z28 = z17;
            int i6122 = i31 + 1;
            rVar2 = this;
            aVarU0 = aVar9;
            gVar6 = gVar3;
            aVarW1 = aVar8;
            vArrD2 = vArr18;
            iZ = i25;
            lVar8 = lVar5;
            charSequence3 = charSequence2;
            iVarV0 = iVar3;
            z24 = z16;
            i59 = i6122;
            i55 = i24;
        }
        V[] vArr44 = vArr32;
        l lVar11 = lVar8;
        int i85 = i58;
        inet.ipaddr.format.validate.i iVar7 = iVarV0;
        inet.ipaddr.g gVar9 = gVar6;
        CharSequence charSequence4 = charSequence3;
        boolean z35 = z24;
        V[] vArr45 = vArr30;
        V[] vArr46 = vArr31;
        V[] vArr47 = vArrD2;
        C6208e.a aVar19 = aVarW1;
        Integer numX1 = X1(iVar7);
        if (zG1) {
            r rVar3 = this;
            Y y11 = (Y) rVar3.f49365t.Z1();
            if (z35 && rVar3.f49431A == null) {
                rVar3.f49431A = new j[4];
            }
            int i86 = 2;
            int i87 = 0;
            V[] vArr48 = vArr44;
            V[] vArr49 = vArr45;
            while (i87 < i86) {
                int i88 = i87 << 1;
                Integer numA23 = a2(i85, 16, iVar7);
                M mQ = y11.q0().q(i88);
                int i89 = i88 + 1;
                M mQ2 = y11.q0().q(i89);
                Integer num5 = numX1;
                M mQ3 = y11.K0().q(i88);
                int i90 = i87;
                M mQ4 = y11.K0().q(i89);
                int iQ2 = mQ.Q();
                int iQ3 = mQ2.Q();
                int iQ4 = mQ3.Q();
                int iQ5 = mQ4.Q();
                if (z35) {
                    gVar = gVar9;
                    int iQ6 = gVar9.q(i85).Q();
                    vArr8 = vArr46;
                    int i91 = iQ6 >> 8;
                    vArr7 = vArr48;
                    j[] jVarArr4 = rVar3.f49431A;
                    j jVarO23 = jVarArr4[i88];
                    if (jVarO23 == null) {
                        aVar2 = aVar19;
                        vArr9 = vArr47;
                        i12 = i85;
                        num3 = numA23;
                        i20 = iQ3;
                        i21 = i89;
                        jVarO23 = o2(iQ2, iQ4, i91, 255L);
                        jVarArr4[i88] = jVarO23;
                    } else {
                        i20 = iQ3;
                        i21 = i89;
                        i12 = i85;
                        num3 = numA23;
                        aVar2 = aVar19;
                        vArr9 = vArr47;
                    }
                    j jVar3 = jVarO23;
                    if (jVar3.d() || lVar11.f49459j != null) {
                        lVar2 = lVar11;
                    } else {
                        lVar2 = lVar11;
                        lVar2.f49459j = new IncompatibleAddressException(iQ2, iQ4, i91, "ipaddress.error.maskMismatch");
                    }
                    long j43 = i91;
                    int iA2 = (int) jVar3.a(iQ2, j43);
                    int iC = (int) jVar3.c(iQ4, j43);
                    j[] jVarArr5 = rVar3.f49431A;
                    j jVarO24 = jVarArr5[i21];
                    if (jVarO24 == null) {
                        i13 = i20;
                        y10 = y11;
                        vArr6 = vArr49;
                        i22 = iC;
                        jVarO24 = o2(i13, iQ5, iQ6, 255L);
                        jVarArr5[i21] = jVarO24;
                    } else {
                        vArr6 = vArr49;
                        i22 = iC;
                        y10 = y11;
                        i13 = i20;
                    }
                    if (jVarO24.d() || lVar2.f49459j != null) {
                        i15 = iA2;
                    } else {
                        i15 = iA2;
                        lVar2.f49459j = new IncompatibleAddressException(i13, iQ5, iQ6, "ipaddress.error.maskMismatch");
                    }
                    long j44 = iQ6;
                    iA = (int) jVarO24.a(i13, j44);
                    int iC2 = (int) jVarO24.c(iQ5, j44);
                    if (z26 || i15 != iQ2) {
                        i23 = i22;
                    } else {
                        i23 = i22;
                        if (i23 == iQ4 && iA == i13 && iC2 == iQ5) {
                            z14 = false;
                        }
                        int i92 = i23;
                        i16 = iC2;
                        i14 = i92;
                    }
                    z14 = true;
                    int i922 = i23;
                    i16 = iC2;
                    i14 = i922;
                } else {
                    vArr6 = vArr49;
                    vArr7 = vArr48;
                    vArr8 = vArr46;
                    gVar = gVar9;
                    i12 = i85;
                    num3 = numA23;
                    aVar2 = aVar19;
                    vArr9 = vArr47;
                    y10 = y11;
                    i13 = iQ3;
                    lVar2 = lVar11;
                    i14 = iQ4;
                    i15 = iQ2;
                    i16 = iQ5;
                    iA = i13;
                    z14 = z26;
                }
                boolean z36 = (i15 == i14 && iA == i16) ? false : true;
                if (z10) {
                    boolean z37 = z14 || num3 != null;
                    i17 = i16;
                    i18 = i12;
                    aVar3 = aVar2;
                    vArr10 = vArr9;
                    if (z37) {
                        z15 = z14;
                        vArr11 = (V[]) H1(vArr6, vArr10, aVar3, 8, i18);
                    } else {
                        z15 = z14;
                        vArr11 = vArr6;
                    }
                    if (z36) {
                        rVar = this;
                        if (z37) {
                            vArr11[i18] = O1(lVar2, y10, iQ2, iQ4, i13, iQ5, null, aVar3);
                        }
                        vArr10[i18] = O1(lVar2, y10, i15, i14, iA, i17, num3, aVar3);
                    } else {
                        rVar = this;
                        if (z37) {
                            vArr11[i18] = rVar.Q1(iQ2, i13, null, aVar3);
                        }
                        Integer num6 = num3;
                        vArr10[i18] = rVar.Q1(i15, iA, num6, aVar3);
                        num3 = num6;
                    }
                } else {
                    rVar = this;
                    i17 = i16;
                    i18 = i12;
                    aVar3 = aVar2;
                    vArr10 = vArr9;
                    z15 = z14;
                    vArr11 = vArr6;
                }
                if (z11) {
                    if (!z10 || z36) {
                        vArr13 = vArr7;
                        i19 = 8;
                        if (z10) {
                            vArr13 = (V[]) H1(vArr13, vArr10, aVar3, 8, i18);
                        }
                        num4 = num3;
                        vArr13[i18] = rVar.Q1(i15, iA, num4, aVar3);
                    } else {
                        if (vArr7 != null) {
                            vArr7[i18] = vArr10[i18];
                        }
                        vArr13 = vArr7;
                        num4 = num3;
                        i19 = 8;
                    }
                    if (!z12) {
                        vArr12 = vArr8;
                    } else if (z36) {
                        vArr12 = (V[]) H1(vArr8, vArr13, aVar3, i19, i18);
                        vArr12[i18] = rVar.Q1(i14, i17, num4, aVar3);
                    } else {
                        vArr12 = vArr8;
                        if (vArr12 != null) {
                            vArr12[i18] = vArr13[i18];
                        }
                    }
                } else {
                    vArr12 = vArr8;
                    vArr13 = vArr7;
                }
                vArr48 = vArr13;
                i85 = i18 + 1;
                i87 = i90 + 1;
                vArr46 = vArr12;
                vArr49 = vArr11;
                lVar11 = lVar2;
                rVar3 = rVar;
                y11 = y10;
                numX1 = num5;
                z26 = z15;
                i86 = 2;
                vArr47 = vArr10;
                aVar19 = aVar3;
                gVar9 = gVar;
            }
            V[] vArr50 = vArr48;
            num = numX1;
            aVar = aVar19;
            vArr = vArr47;
            lVar = lVar11;
            q10 = null;
            V[] vArr51 = vArr49;
            vArr3 = vArr46;
            vArr45 = vArr51;
            vArr2 = vArr50;
        } else {
            num = numX1;
            aVar = aVar19;
            vArr = vArr47;
            lVar = lVar11;
            q10 = null;
            vArr2 = vArr44;
            vArr3 = vArr46;
        }
        if (z10) {
            if (vArr45 != null) {
                q11 = (Q) aVar.t(vArr45);
                lVar.f49453d = q11;
                i10 = i56;
                i11 = i57;
                if (J1(q11, i10, i11)) {
                    charSequence = charSequence4;
                    lVar.f49456g = new IncompatibleAddressException(charSequence, "ipaddress.error.invalid.joined.ranges");
                } else {
                    charSequence = charSequence4;
                }
            } else {
                i10 = i56;
                i11 = i57;
                charSequence = charSequence4;
                q11 = q10;
            }
            num2 = num;
            Q q12 = (Q) aVar.p(vArr, num2);
            lVar.f49452c = q12;
            if (J1(q12, i10, i11)) {
                lVar.f49457h = new IncompatibleAddressException(charSequence, "ipaddress.error.invalid.joined.ranges");
                if (q11 == null) {
                    lVar.f49456g = lVar.f49457h;
                }
            }
        } else {
            num2 = num;
        }
        if (z11) {
            Integer numX12 = X1(iVar7);
            if (numX12 != null) {
                C6208e c6208eT = getParameters().r().t();
                if (z10) {
                    vArr5 = vArr;
                    vArr4 = vArr5;
                } else {
                    vArr4 = vArr3 == null ? vArr2 : vArr3;
                    vArr5 = vArr2;
                }
                boolean zH = inet.ipaddr.format.validate.g.h(new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.j
                    @Override // inet.ipaddr.a.InterfaceC1855a
                    public final int a(int i93) {
                        return r.h2(vArr5, i93);
                    }
                }, new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.k
                    @Override // inet.ipaddr.a.InterfaceC1855a
                    public final int a(int i93) {
                        return r.i2(vArr4, i93);
                    }
                }, vArr5.length, 2, 16, 65535, numX12, c6208eT.d(), false);
                if (zH) {
                    if (vArr2 == null) {
                        vArr2 = (V[]) H1(vArr2, vArr, aVar, 8, 8);
                    }
                    if (vArr3 == null) {
                        vArr3 = (V[]) H1(vArr3, vArr2, aVar, 8, 8);
                    }
                }
                z13 = zH;
            } else {
                z13 = false;
            }
            if (vArr2 != null) {
                lVar.f49454e = ((Q) aVar.r(vArr2, num2, true)).y3();
            }
            if (vArr3 != null) {
                Q qB4 = (Q) aVar.p(vArr3, num2);
                if (z13) {
                    qB4 = qB4.B4();
                }
                lVar.f49455f = qB4.I3();
            }
        }
    }

    private V Q1(int i10, int i11, Integer num, C6208e.a aVar) {
        return aVar.g((i10 << 8) | i11, num);
    }

    private static inet.ipaddr.k R1(CharSequence charSequence, g.a aVar, int i10, int i11, boolean z10, inet.ipaddr.format.validate.a aVar2, int i12, Integer num, inet.ipaddr.format.validate.f fVar) {
        return !z10 ? (inet.ipaddr.k) fVar.c(i10, i11, num) : (inet.ipaddr.k) fVar.s(i10, i11, num, charSequence, i10, i11, aVar2.g(i12, 262144), aVar2.g(i12, ImageMetadata.LENS_APERTURE), aVar2.h(i12, 6), aVar2.h(i12, 7), aVar2.h(i12, 15));
    }

    private inet.ipaddr.k T1(CharSequence charSequence, g.a aVar, int i10, int i11, boolean z10, int i12, Integer num, inet.ipaddr.format.validate.f fVar) {
        inet.ipaddr.format.validate.a aVarU0 = U0();
        return i10 != i11 ? R1(charSequence, aVar, i10, i11, z10, aVarU0, i12, num, fVar) : !z10 ? (inet.ipaddr.k) fVar.c(i10, i10, num) : (inet.ipaddr.k) fVar.v(i10, num, charSequence, i10, aVarU0.g(i12, 262144), aVarU0.h(i12, 6), aVarU0.h(i12, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6183e.a V1() {
        return getParameters().p().r().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6208e.a W1() {
        return getParameters().r().t().m();
    }

    private static Integer X1(inet.ipaddr.format.validate.i iVar) {
        return iVar.h();
    }

    private static Integer a2(int i10, int i11, inet.ipaddr.format.validate.i iVar) {
        return inet.ipaddr.format.validate.g.g(i11, X1(iVar), i10);
    }

    private static Integer b2(int i10, g.a aVar, inet.ipaddr.format.validate.i iVar) {
        return a2(i10, inet.ipaddr.j.S1(aVar), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f2(M[] mArr, int i10) {
        return mArr[i10].Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g2(M[] mArr, int i10) {
        return mArr[i10].w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h2(V[] vArr, int i10) {
        return vArr[i10].Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i2(V[] vArr, int i10) {
        return vArr[i10].w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int j2(int i10, int i11, int[] iArr, int i12) {
        if (i12 >= i10) {
            if (i12 - i10 < i11) {
                return 0;
            }
            i12 -= i11;
        }
        return (int) inet.ipaddr.format.validate.a.p(i12, 2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int k2(int i10, int i11, int[] iArr, int i12) {
        if (i12 >= i10) {
            if (i12 - i10 < i11) {
                return 0;
            }
            i12 -= i11;
        }
        return (int) inet.ipaddr.format.validate.a.p(i12, 10, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int l2(int[] iArr, int i10) {
        return (int) inet.ipaddr.format.validate.a.p(i10, 2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m2(int[] iArr, int i10) {
        return (int) inet.ipaddr.format.validate.a.p(i10, 10, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static inet.ipaddr.format.validate.r.f n2(long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.r.n2(long, long, long, long, long, long, long, long):inet.ipaddr.format.validate.r$f");
    }

    public static j o2(long j10, long j11, long j12, long j13) {
        if (j10 == j11) {
            return f49413B;
        }
        if (j10 > j11) {
            throw new IllegalArgumentException("value > upper value");
        }
        if (j12 == 0 || j12 == j13) {
            return f49413B;
        }
        long j14 = j10 ^ j11;
        if (j14 != 1) {
            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j14);
            long j15 = j12 & ((-1) >>> iNumberOfLeadingZeros);
            if (j15 != 0) {
                int iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(j15);
                long j16 = iNumberOfLeadingZeros2 == 63 ? 0L : (-1) >>> (iNumberOfLeadingZeros2 + 1);
                boolean z10 = (j12 & j16) == j16;
                long jNumberOfLeadingZeros = (j13 != -1 || (z10 && iNumberOfLeadingZeros2 <= iNumberOfLeadingZeros)) ? j13 : (-1) >>> Long.numberOfLeadingZeros(j11);
                if (j10 == 0 && j11 == jNumberOfLeadingZeros) {
                    return z10 ? f49413B : f49414C;
                }
                if (iNumberOfLeadingZeros2 > iNumberOfLeadingZeros) {
                    boolean z11 = (!z10 || iNumberOfLeadingZeros2 >= 63 || (j11 - j10) + 1 >= (1 << (64 - iNumberOfLeadingZeros2))) ? z10 : false;
                    i[] iVarArr = z11 ? f49420I : f49419H;
                    i iVar = iVarArr[iNumberOfLeadingZeros2];
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar2 = new i(iNumberOfLeadingZeros2, z11);
                    iVarArr[iNumberOfLeadingZeros2] = iVar2;
                    return iVar2;
                }
                if (!z10) {
                    long j17 = j11 & (~j16);
                    long j18 = j10 | j16;
                    for (long j19 = 1 << (63 - (iNumberOfLeadingZeros2 + 1)); j19 != 0; j19 >>>= 1) {
                        if ((j12 & j19) != 0) {
                            long j20 = j17 | j19;
                            if (j20 <= j11) {
                                j17 = j20;
                            }
                            long j21 = (~j19) & j18;
                            if (j21 >= j10) {
                                j18 = j21;
                            }
                        }
                    }
                    return new k(j18, j17);
                }
            }
        }
        return f49413B;
    }

    private boolean p2(boolean z10) {
        int i10;
        int iZ = U0().Z();
        if (!e1()) {
            if (!g1()) {
                i10 = 8;
            } else {
                if (z10) {
                    return true;
                }
                i10 = 6;
            }
            if (iZ != i10 && !a1()) {
                return true;
            }
        } else if (iZ != 4) {
            return true;
        }
        inet.ipaddr.g gVarY1 = Y1();
        return gVarY1 != null && gVarY1.W0(true) == null;
    }

    static byte[] q2(long j10, long j11, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10 - 8;
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            if (i12 >= i11) {
                bArr[i12] = (byte) (255 & j10);
                j10 >>>= 8;
            } else {
                bArr[i12] = (byte) (255 & j11);
                j11 >>>= 8;
            }
        }
        return bArr;
    }

    static byte[] r2(long j10, long j11, int i10) {
        int i11 = i10 - 8;
        int i12 = i10 + i11;
        int i13 = 1;
        int i14 = i10;
        while (i13 <= i10) {
            if (((byte) (i13 <= i11 ? j11 >>> ((i10 - i13) << 3) : j10 >>> ((i12 - i13) << 3))) != 0) {
                break;
            }
            i14--;
            i13++;
        }
        return q2(j10, j11, i14);
    }

    @Override // inet.ipaddr.format.validate.d
    public inet.ipaddr.g M() {
        l lVarU1 = U1(false);
        if (lVarU1.f49458i != null) {
            throw lVarU1.f49458i;
        }
        if (lVarU1.f49459j != null) {
            throw lVarU1.f49459j;
        }
        if (lVarU1.f49457h == null) {
            return lVarU1.a();
        }
        throw lVarU1.f49457h;
    }

    @Override // inet.ipaddr.format.validate.d
    public boolean S0() {
        return true;
    }

    void S1(boolean z10, boolean z11, boolean z12) {
        g.a aVarO0 = o0();
        if (aVarO0.isIPv4()) {
            N1(z10, z11, z12);
        } else if (aVarO0.isIPv6()) {
            P1(z10, z11, z12);
        }
    }

    l U1(boolean z10) {
        l lVar = this.f49434y;
        if (lVar == null || lVar.b0()) {
            synchronized (this) {
                try {
                    lVar = this.f49434y;
                    if (lVar == null || lVar.b0()) {
                        S1(true, false, false);
                        lVar = this.f49434y;
                        if (d2()) {
                            E();
                        }
                    }
                    if (z10) {
                        lVar.B();
                    } else {
                        lVar.a();
                    }
                } finally {
                }
            }
        } else if (!z10 ? !lVar.F() : !lVar.J()) {
            synchronized (this) {
                try {
                    if (z10) {
                        lVar.B();
                    } else {
                        lVar.a();
                    }
                } finally {
                }
            }
        }
        return lVar;
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ boolean X0() {
        return super.X0();
    }

    public inet.ipaddr.g Y1() {
        return V0().l();
    }

    @Override // inet.ipaddr.format.validate.a
    public /* bridge */ /* synthetic */ int Z() {
        return super.Z();
    }

    public inet.ipaddr.m Z1() {
        l lVar = this.f49434y;
        if (lVar == null || lVar.f49460k == null) {
            synchronized (this) {
                try {
                    lVar = this.f49434y;
                    if (lVar == null || lVar.f49460k == null) {
                        if (lVar == null || lVar.b0() || !lVar.P()) {
                            S1(false, true, true);
                            lVar = this.f49434y;
                            lVar.v();
                            if (d2()) {
                                E();
                            }
                        } else {
                            lVar.f49460k = lVar.a().r1();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return lVar.f49460k;
    }

    inet.ipaddr.g c2() {
        l lVar = this.f49434y;
        if (lVar == null || !lVar.K()) {
            synchronized (this) {
                try {
                    lVar = this.f49434y;
                    if (lVar == null || !lVar.K()) {
                        S1(false, true, false);
                        lVar = this.f49434y;
                        E();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return lVar.C();
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ boolean d1() {
        return super.d1();
    }

    boolean d2() {
        l lVar = this.f49434y;
        return !lVar.b0() && (lVar.P() || !lVar.T()) && !lVar.S();
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ boolean e1() {
        return super.e1();
    }

    protected boolean e2(Integer num, inet.ipaddr.i iVar, final int[] iArr) {
        g.a aVarN0 = iVar.n0();
        int iT1 = inet.ipaddr.j.T1(aVarN0);
        int iS1 = inet.ipaddr.j.S1(aVarN0);
        int iX2 = inet.ipaddr.k.x2(aVarN0);
        c.b bVarD = iVar.d();
        inet.ipaddr.format.validate.a aVarU0 = U0();
        int iZ = aVarU0.Z();
        if (!a1()) {
            return inet.ipaddr.format.validate.g.h(new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.p
                @Override // inet.ipaddr.a.InterfaceC1855a
                public final int a(int i10) {
                    return r.l2(iArr, i10);
                }
            }, new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.q
                @Override // inet.ipaddr.a.InterfaceC1855a
                public final int a(int i10) {
                    return r.m2(iArr, i10);
                }
            }, iZ, iT1, iS1, iX2, num, bVarD, false);
        }
        final int i10 = 8 - iZ;
        final int iD = aVarU0.d();
        return inet.ipaddr.format.validate.g.h(new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.n
            @Override // inet.ipaddr.a.InterfaceC1855a
            public final int a(int i11) {
                return r.j2(iD, i10, iArr, i11);
            }
        }, new a.InterfaceC1855a() { // from class: inet.ipaddr.format.validate.o
            @Override // inet.ipaddr.a.InterfaceC1855a
            public final int a(int i11) {
                return r.k2(iD, i10, iArr, i11);
            }
        }, iZ + i10, iT1, iS1, iX2, num, bVarD, false);
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ boolean f1() {
        return super.f1();
    }

    @Override // inet.ipaddr.format.validate.d
    public Integer g0() {
        return V0().h();
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ boolean g1() {
        return super.g1();
    }

    @Override // inet.ipaddr.format.validate.d
    public inet.ipaddr.o getParameters() {
        return this.f49432w;
    }

    @Override // inet.ipaddr.format.validate.d
    public d.h getType() {
        return d.h.from(o0());
    }

    @Override // inet.ipaddr.format.validate.d
    public Boolean k0(inet.ipaddr.format.validate.d dVar) {
        if (!(dVar instanceof r)) {
            return null;
        }
        l lVar = this.f49434y;
        if (lVar != null && lVar != null) {
            return null;
        }
        r rVar = (r) dVar;
        boolean z10 = false;
        Boolean boolK1 = K1(rVar, false, true);
        if (boolK1 == null) {
            return null;
        }
        if (boolK1.booleanValue() && Objects.equals(V0().o(), rVar.V0().o())) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // inet.ipaddr.format.validate.c, inet.ipaddr.format.validate.d
    public /* bridge */ /* synthetic */ g.a o0() {
        return super.o0();
    }

    @Override // inet.ipaddr.format.validate.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // inet.ipaddr.format.validate.a, inet.ipaddr.format.validate.d
    public /* bridge */ /* synthetic */ boolean y0() {
        return super.y0();
    }
}
