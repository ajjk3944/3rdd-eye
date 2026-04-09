package m;

import java.util.ArrayList;
import m.e;

/* loaded from: classes.dex */
public class f {
    public static float u0 = 0.5f;
    e B;
    protected e[] C;
    protected ArrayList<e> D;
    protected b[] E;
    f F;
    int G;
    int H;
    protected float I;
    protected int J;
    protected int K;
    protected int L;
    int M;
    int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    protected int S;
    protected int T;
    int U;
    protected int V;
    protected int W;
    private int X;
    private int Y;
    float Z;

    /* renamed from: a0, reason: collision with root package name */
    float f2879a0;

    /* renamed from: b0, reason: collision with root package name */
    private Object f2881b0;

    /* renamed from: c, reason: collision with root package name */
    n f2882c;

    /* renamed from: c0, reason: collision with root package name */
    private int f2883c0;

    /* renamed from: d, reason: collision with root package name */
    n f2884d;

    /* renamed from: d0, reason: collision with root package name */
    private int f2885d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f2887e0;

    /* renamed from: f0, reason: collision with root package name */
    private String f2889f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f2891g0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f2893h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f2895i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f2897j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f2899k0;

    /* renamed from: l0, reason: collision with root package name */
    int f2901l0;

    /* renamed from: m0, reason: collision with root package name */
    int f2903m0;

    /* renamed from: n, reason: collision with root package name */
    boolean f2904n;

    /* renamed from: n0, reason: collision with root package name */
    boolean f2905n0;

    /* renamed from: o, reason: collision with root package name */
    boolean f2906o;

    /* renamed from: o0, reason: collision with root package name */
    boolean f2907o0;

    /* renamed from: p0, reason: collision with root package name */
    float[] f2909p0;

    /* renamed from: q0, reason: collision with root package name */
    protected f[] f2911q0;
    protected f[] r0;
    f s0;
    f t0;

    /* renamed from: a, reason: collision with root package name */
    public int f2878a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2880b = -1;

    /* renamed from: e, reason: collision with root package name */
    int f2886e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f2888f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f2890g = new int[2];

    /* renamed from: h, reason: collision with root package name */
    int f2892h = 0;

    /* renamed from: i, reason: collision with root package name */
    int f2894i = 0;

    /* renamed from: j, reason: collision with root package name */
    float f2896j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    int f2898k = 0;

    /* renamed from: l, reason: collision with root package name */
    int f2900l = 0;

    /* renamed from: m, reason: collision with root package name */
    float f2902m = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    int f2908p = -1;

    /* renamed from: q, reason: collision with root package name */
    float f2910q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    h f2912r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f2913s = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: t, reason: collision with root package name */
    private float f2914t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    e f2915u = new e(this, e.d.LEFT);

    /* renamed from: v, reason: collision with root package name */
    e f2916v = new e(this, e.d.TOP);

    /* renamed from: w, reason: collision with root package name */
    e f2917w = new e(this, e.d.RIGHT);

    /* renamed from: x, reason: collision with root package name */
    e f2918x = new e(this, e.d.BOTTOM);

    /* renamed from: y, reason: collision with root package name */
    e f2919y = new e(this, e.d.BASELINE);

    /* renamed from: z, reason: collision with root package name */
    e f2920z = new e(this, e.d.CENTER_X);
    e A = new e(this, e.d.CENTER_Y);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2921a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2922b;

        static {
            int[] iArr = new int[b.values().length];
            f2922b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2922b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2922b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2922b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.d.values().length];
            f2921a = iArr2;
            try {
                iArr2[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2921a[e.d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2921a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2921a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2921a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2921a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2921a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2921a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2921a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public f() {
        e eVar = new e(this, e.d.CENTER);
        this.B = eVar;
        this.C = new e[]{this.f2915u, this.f2917w, this.f2916v, this.f2918x, this.f2919y, eVar};
        this.D = new ArrayList<>();
        b bVar = b.FIXED;
        this.E = new b[]{bVar, bVar};
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f2 = u0;
        this.Z = f2;
        this.f2879a0 = f2;
        this.f2883c0 = 0;
        this.f2885d0 = 0;
        this.f2887e0 = null;
        this.f2889f0 = null;
        this.f2895i0 = false;
        this.f2897j0 = false;
        this.f2899k0 = false;
        this.f2901l0 = 0;
        this.f2903m0 = 0;
        this.f2909p0 = new float[]{-1.0f, -1.0f};
        this.f2911q0 = new f[]{null, null};
        this.r0 = new f[]{null, null};
        this.s0 = null;
        this.t0 = null;
        a();
    }

    private boolean K(int i2) {
        int i3 = i2 * 2;
        e[] eVarArr = this.C;
        if (eVarArr[i3].f2853d != null && eVarArr[i3].f2853d.f2853d != eVarArr[i3]) {
            int i4 = i3 + 1;
            if (eVarArr[i4].f2853d != null && eVarArr[i4].f2853d.f2853d == eVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    private void a() {
        this.D.add(this.f2915u);
        this.D.add(this.f2916v);
        this.D.add(this.f2917w);
        this.D.add(this.f2918x);
        this.D.add(this.f2920z);
        this.D.add(this.A);
        this.D.add(this.B);
        this.D.add(this.f2919y);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(l.e r26, boolean r27, l.i r28, l.i r29, m.f.b r30, boolean r31, m.e r32, m.e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.e(l.e, boolean, l.i, l.i, m.f$b, boolean, m.e, m.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    protected int A() {
        return this.L + this.T;
    }

    public void A0(int i2) {
        this.Y = i2;
    }

    public b B() {
        return this.E[1];
    }

    public void B0(int i2) {
        this.X = i2;
    }

    public int C() {
        return this.f2885d0;
    }

    public void C0(int i2) {
        this.K = i2;
    }

    public int D() {
        if (this.f2885d0 == 8) {
            return 0;
        }
        return this.G;
    }

    public void D0(int i2) {
        this.L = i2;
    }

    public int E() {
        return this.Y;
    }

    public void E0(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f2908p == -1) {
            if (z4 && !z5) {
                this.f2908p = 0;
            } else if (!z4 && z5) {
                this.f2908p = 1;
                if (this.J == -1) {
                    this.f2910q = 1.0f / this.f2910q;
                }
            }
        }
        if (this.f2908p == 0 && (!this.f2916v.k() || !this.f2918x.k())) {
            this.f2908p = 1;
        } else if (this.f2908p == 1 && (!this.f2915u.k() || !this.f2917w.k())) {
            this.f2908p = 0;
        }
        if (this.f2908p == -1 && (!this.f2916v.k() || !this.f2918x.k() || !this.f2915u.k() || !this.f2917w.k())) {
            if (this.f2916v.k() && this.f2918x.k()) {
                this.f2908p = 0;
            } else if (this.f2915u.k() && this.f2917w.k()) {
                this.f2910q = 1.0f / this.f2910q;
                this.f2908p = 1;
            }
        }
        if (this.f2908p == -1) {
            if (z2 && !z3) {
                this.f2908p = 0;
            } else if (!z2 && z3) {
                this.f2910q = 1.0f / this.f2910q;
                this.f2908p = 1;
            }
        }
        if (this.f2908p == -1) {
            int i2 = this.f2892h;
            if (i2 > 0 && this.f2898k == 0) {
                this.f2908p = 0;
            } else if (i2 == 0 && this.f2898k > 0) {
                this.f2910q = 1.0f / this.f2910q;
                this.f2908p = 1;
            }
        }
        if (this.f2908p == -1 && z2 && z3) {
            this.f2910q = 1.0f / this.f2910q;
            this.f2908p = 1;
        }
    }

    public int F() {
        return this.X;
    }

    public void F0() {
        int i2 = this.K;
        int i3 = this.L;
        int i4 = this.G + i2;
        int i5 = this.H + i3;
        this.O = i2;
        this.P = i3;
        this.Q = i4 - i2;
        this.R = i5 - i3;
    }

    public int G() {
        return this.K;
    }

    public void G0(l.e eVar) {
        int iY = eVar.y(this.f2915u);
        int iY2 = eVar.y(this.f2916v);
        int iY3 = eVar.y(this.f2917w);
        int iY4 = eVar.y(this.f2918x);
        int i2 = iY4 - iY2;
        if (iY3 - iY < 0 || i2 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY4 = 0;
            iY = 0;
            iY2 = 0;
            iY3 = 0;
        }
        a0(iY, iY2, iY3, iY4);
    }

    public int H() {
        return this.L;
    }

    public void H0() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.C[i2].f().q();
        }
    }

    public boolean I() {
        return this.U > 0;
    }

    public void J(e.d dVar, f fVar, e.d dVar2, int i2, int i3) {
        h(dVar).a(fVar.h(dVar2), i2, i3, e.c.STRONG, 0, true);
    }

    public boolean L() {
        return this.f2915u.f().f2956b == 1 && this.f2917w.f().f2956b == 1 && this.f2916v.f().f2956b == 1 && this.f2918x.f().f2956b == 1;
    }

    public boolean M() {
        e eVar = this.f2915u;
        e eVar2 = eVar.f2853d;
        if (eVar2 != null && eVar2.f2853d == eVar) {
            return true;
        }
        e eVar3 = this.f2917w;
        e eVar4 = eVar3.f2853d;
        return eVar4 != null && eVar4.f2853d == eVar3;
    }

    public boolean N() {
        e eVar = this.f2916v;
        e eVar2 = eVar.f2853d;
        if (eVar2 != null && eVar2.f2853d == eVar) {
            return true;
        }
        e eVar3 = this.f2918x;
        e eVar4 = eVar3.f2853d;
        return eVar4 != null && eVar4.f2853d == eVar3;
    }

    public boolean O() {
        return this.f2888f == 0 && this.I == 0.0f && this.f2898k == 0 && this.f2900l == 0 && this.E[1] == b.MATCH_CONSTRAINT;
    }

    public boolean P() {
        return this.f2886e == 0 && this.I == 0.0f && this.f2892h == 0 && this.f2894i == 0 && this.E[0] == b.MATCH_CONSTRAINT;
    }

    public void Q() {
        this.f2915u.m();
        this.f2916v.m();
        this.f2917w.m();
        this.f2918x.m();
        this.f2919y.m();
        this.f2920z.m();
        this.A.m();
        this.B.m();
        this.F = null;
        this.f2914t = 0.0f;
        this.G = 0;
        this.H = 0;
        this.I = 0.0f;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f2 = u0;
        this.Z = f2;
        this.f2879a0 = f2;
        b[] bVarArr = this.E;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f2881b0 = null;
        this.f2883c0 = 0;
        this.f2885d0 = 0;
        this.f2889f0 = null;
        this.f2891g0 = false;
        this.f2893h0 = false;
        this.f2901l0 = 0;
        this.f2903m0 = 0;
        this.f2905n0 = false;
        this.f2907o0 = false;
        float[] fArr = this.f2909p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2878a = -1;
        this.f2880b = -1;
        int[] iArr = this.f2913s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2886e = 0;
        this.f2888f = 0;
        this.f2896j = 1.0f;
        this.f2902m = 1.0f;
        this.f2894i = Integer.MAX_VALUE;
        this.f2900l = Integer.MAX_VALUE;
        this.f2892h = 0;
        this.f2898k = 0;
        this.f2908p = -1;
        this.f2910q = 1.0f;
        n nVar = this.f2882c;
        if (nVar != null) {
            nVar.e();
        }
        n nVar2 = this.f2884d;
        if (nVar2 != null) {
            nVar2.e();
        }
        this.f2912r = null;
        this.f2895i0 = false;
        this.f2897j0 = false;
        this.f2899k0 = false;
    }

    public void R() {
        f fVarU = u();
        if (fVarU != null && (fVarU instanceof g) && ((g) u()).S0()) {
            return;
        }
        int size = this.D.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D.get(i2).m();
        }
    }

    public void S() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.C[i2].f().e();
        }
    }

    public void T(l.c cVar) {
        this.f2915u.n(cVar);
        this.f2916v.n(cVar);
        this.f2917w.n(cVar);
        this.f2918x.n(cVar);
        this.f2919y.n(cVar);
        this.B.n(cVar);
        this.f2920z.n(cVar);
        this.A.n(cVar);
    }

    public void U() {
    }

    public void V(int i2) {
        this.U = i2;
    }

    public void W(Object obj) {
        this.f2881b0 = obj;
    }

    public void X(String str) {
        this.f2887e0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.I = r9
            r8.J = r1
        L8d:
            return
        L8e:
            r8.I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.Y(java.lang.String):void");
    }

    public void Z(int i2, int i3, int i4) {
        if (i4 == 0) {
            f0(i2, i3);
        } else if (i4 == 1) {
            t0(i2, i3);
        }
        this.f2897j0 = true;
    }

    public void a0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.K = i2;
        this.L = i3;
        if (this.f2885d0 == 8) {
            this.G = 0;
            this.H = 0;
            return;
        }
        b[] bVarArr = this.E;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.G)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.H)) {
            i9 = i6;
        }
        this.G = i8;
        this.H = i9;
        int i10 = this.W;
        if (i9 < i10) {
            this.H = i10;
        }
        int i11 = this.V;
        if (i8 < i11) {
            this.G = i11;
        }
        this.f2897j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0233 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(l.e r42) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.b(l.e):void");
    }

    public void b0(int i2) {
        this.H = i2;
        int i3 = this.W;
        if (i2 < i3) {
            this.H = i3;
        }
    }

    public boolean c() {
        return this.f2885d0 != 8;
    }

    public void c0(boolean z2) {
        this.f2906o = z2;
    }

    public void d(int i2) {
        k.a(i2, this);
    }

    public void d0(float f2) {
        this.Z = f2;
    }

    public void e0(int i2) {
        this.f2901l0 = i2;
    }

    public void f(f fVar, float f2, int i2) {
        e.d dVar = e.d.CENTER;
        J(dVar, fVar, dVar, i2, 0);
        this.f2914t = f2;
    }

    public void f0(int i2, int i3) {
        this.K = i2;
        int i4 = i3 - i2;
        this.G = i4;
        int i5 = this.V;
        if (i4 < i5) {
            this.G = i5;
        }
    }

    public void g(l.e eVar) {
        eVar.r(this.f2915u);
        eVar.r(this.f2916v);
        eVar.r(this.f2917w);
        eVar.r(this.f2918x);
        if (this.U > 0) {
            eVar.r(this.f2919y);
        }
    }

    public void g0(b bVar) {
        this.E[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            y0(this.X);
        }
    }

    public e h(e.d dVar) {
        switch (a.f2921a[dVar.ordinal()]) {
            case 1:
                return this.f2915u;
            case 2:
                return this.f2916v;
            case 3:
                return this.f2917w;
            case 4:
                return this.f2918x;
            case 5:
                return this.f2919y;
            case 6:
                return this.B;
            case 7:
                return this.f2920z;
            case 8:
                return this.A;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public void h0(int i2, int i3, int i4, float f2) {
        this.f2886e = i2;
        this.f2892h = i3;
        this.f2894i = i4;
        this.f2896j = f2;
        if (f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f2886e = 2;
    }

    public ArrayList<e> i() {
        return this.D;
    }

    public void i0(float f2) {
        this.f2909p0[0] = f2;
    }

    public int j() {
        return this.U;
    }

    public void j0(int i2) {
        this.f2913s[1] = i2;
    }

    public float k(int i2) {
        if (i2 == 0) {
            return this.Z;
        }
        if (i2 == 1) {
            return this.f2879a0;
        }
        return -1.0f;
    }

    public void k0(int i2) {
        this.f2913s[0] = i2;
    }

    public int l() {
        return H() + this.H;
    }

    public void l0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.W = i2;
    }

    public Object m() {
        return this.f2881b0;
    }

    public void m0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.V = i2;
    }

    public String n() {
        return this.f2887e0;
    }

    public void n0(int i2, int i3) {
        this.S = i2;
        this.T = i3;
    }

    public b o(int i2) {
        if (i2 == 0) {
            return s();
        }
        if (i2 == 1) {
            return B();
        }
        return null;
    }

    public void o0(int i2, int i3) {
        this.K = i2;
        this.L = i3;
    }

    public int p() {
        return this.O + this.S;
    }

    public void p0(f fVar) {
        this.F = fVar;
    }

    public int q() {
        return this.P + this.T;
    }

    void q0(int i2, int i3) {
        if (i3 == 0) {
            this.M = i2;
        } else if (i3 == 1) {
            this.N = i2;
        }
    }

    public int r() {
        if (this.f2885d0 == 8) {
            return 0;
        }
        return this.H;
    }

    public void r0(float f2) {
        this.f2879a0 = f2;
    }

    public b s() {
        return this.E[0];
    }

    public void s0(int i2) {
        this.f2903m0 = i2;
    }

    public int t(int i2) {
        if (i2 == 0) {
            return D();
        }
        if (i2 == 1) {
            return r();
        }
        return 0;
    }

    public void t0(int i2, int i3) {
        this.L = i2;
        int i4 = i3 - i2;
        this.H = i4;
        int i5 = this.W;
        if (i4 < i5) {
            this.H = i5;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f2889f0 != null) {
            str = "type: " + this.f2889f0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f2887e0 != null) {
            str2 = "id: " + this.f2887e0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.K);
        sb.append(", ");
        sb.append(this.L);
        sb.append(") - (");
        sb.append(this.G);
        sb.append(" x ");
        sb.append(this.H);
        sb.append(") wrap: (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public f u() {
        return this.F;
    }

    public void u0(b bVar) {
        this.E[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            b0(this.Y);
        }
    }

    int v(int i2) {
        if (i2 == 0) {
            return this.M;
        }
        if (i2 == 1) {
            return this.N;
        }
        return 0;
    }

    public void v0(int i2, int i3, int i4, float f2) {
        this.f2888f = i2;
        this.f2898k = i3;
        this.f2900l = i4;
        this.f2902m = f2;
        if (f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f2888f = 2;
    }

    public n w() {
        if (this.f2884d == null) {
            this.f2884d = new n();
        }
        return this.f2884d;
    }

    public void w0(float f2) {
        this.f2909p0[1] = f2;
    }

    public n x() {
        if (this.f2882c == null) {
            this.f2882c = new n();
        }
        return this.f2882c;
    }

    public void x0(int i2) {
        this.f2885d0 = i2;
    }

    public int y() {
        return G() + this.G;
    }

    public void y0(int i2) {
        this.G = i2;
        int i3 = this.V;
        if (i2 < i3) {
            this.G = i3;
        }
    }

    protected int z() {
        return this.K + this.S;
    }

    public void z0(boolean z2) {
        this.f2904n = z2;
    }
}
