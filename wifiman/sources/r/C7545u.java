package r;

import Zg.AbstractC3682n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7545u {

    /* renamed from: c, reason: collision with root package name */
    public static final b f59866c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f59867d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final a[][] f59868a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f59869b = true;

    /* renamed from: r.u$a */
    public static final class a {

        /* renamed from: s, reason: collision with root package name */
        public static final C2088a f59870s = new C2088a(null);

        /* renamed from: t, reason: collision with root package name */
        public static final int f59871t = 8;

        /* renamed from: u, reason: collision with root package name */
        private static float[] f59872u;

        /* renamed from: a, reason: collision with root package name */
        private final float f59873a;

        /* renamed from: b, reason: collision with root package name */
        private final float f59874b;

        /* renamed from: c, reason: collision with root package name */
        private final float f59875c;

        /* renamed from: d, reason: collision with root package name */
        private final float f59876d;

        /* renamed from: e, reason: collision with root package name */
        private final float f59877e;

        /* renamed from: f, reason: collision with root package name */
        private final float f59878f;

        /* renamed from: g, reason: collision with root package name */
        private float f59879g;

        /* renamed from: h, reason: collision with root package name */
        private float f59880h;

        /* renamed from: i, reason: collision with root package name */
        private float f59881i;

        /* renamed from: j, reason: collision with root package name */
        private final float[] f59882j;

        /* renamed from: k, reason: collision with root package name */
        private final float f59883k;

        /* renamed from: l, reason: collision with root package name */
        private final float f59884l;

        /* renamed from: m, reason: collision with root package name */
        private final float f59885m;

        /* renamed from: n, reason: collision with root package name */
        private final float f59886n;

        /* renamed from: o, reason: collision with root package name */
        private final float f59887o;

        /* renamed from: p, reason: collision with root package name */
        private final float f59888p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f59889q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f59890r;

        /* renamed from: r.u$a$a, reason: collision with other inner class name */
        public static final class C2088a {
            public /* synthetic */ C2088a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] b() {
                if (a.f59872u != null) {
                    float[] fArr = a.f59872u;
                    AbstractC6492s.f(fArr);
                    return fArr;
                }
                a.f59872u = new float[91];
                float[] fArr2 = a.f59872u;
                AbstractC6492s.f(fArr2);
                return fArr2;
            }

            private C2088a() {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f59873a = f10;
            this.f59874b = f11;
            this.f59875c = f12;
            this.f59876d = f13;
            this.f59877e = f14;
            this.f59878f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            this.f59889q = z11;
            float f18 = 1 / (f11 - f10);
            this.f59883k = f18;
            boolean z12 = 3 == i10;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f59879g = fHypot;
                this.f59888p = fHypot * f18;
                this.f59886n = f16 / (f11 - f10);
                this.f59887o = f17 / (f11 - f10);
                this.f59882j = new float[101];
                this.f59884l = Float.NaN;
                this.f59885m = Float.NaN;
            } else {
                this.f59882j = new float[101];
                this.f59884l = f16 * (z11 ? -1 : 1);
                this.f59885m = f17 * (z11 ? 1 : -1);
                this.f59886n = z11 ? f14 : f12;
                this.f59887o = z11 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.f59888p = this.f59879g * f18;
                z10 = z12;
            }
            this.f59890r = z10;
        }

        private final void c(float f10, float f11, float f12, float f13) {
            float f14 = f12 - f10;
            float f15 = f11 - f13;
            int length = f59870s.b().length;
            float fHypot = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                C2088a c2088a = f59870s;
                double radians = (float) Math.toRadians((i10 * 90.0d) / (c2088a.b().length - 1));
                float fSin = ((float) Math.sin(radians)) * f14;
                float fCos = ((float) Math.cos(radians)) * f15;
                if (i10 > 0) {
                    fHypot += (float) Math.hypot(fSin - f16, fCos - f17);
                    c2088a.b()[i10] = fHypot;
                }
                i10++;
                f17 = fCos;
                f16 = fSin;
            }
            this.f59879g = fHypot;
            int length2 = f59870s.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArrB = f59870s.b();
                fArrB[i11] = fArrB[i11] / fHypot;
            }
            int length3 = this.f59882j.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = i12 / (this.f59882j.length - 1);
                C2088a c2088a2 = f59870s;
                int iG = AbstractC3682n.g(c2088a2.b(), length4, 0, 0, 6, null);
                if (iG >= 0) {
                    this.f59882j[i12] = iG / (c2088a2.b().length - 1);
                } else if (iG == -1) {
                    this.f59882j[i12] = 0.0f;
                } else {
                    int i13 = -iG;
                    int i14 = i13 - 2;
                    this.f59882j[i12] = (i14 + ((length4 - c2088a2.b()[i14]) / (c2088a2.b()[i13 - 1] - c2088a2.b()[i14]))) / (c2088a2.b().length - 1);
                }
            }
        }

        private final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f59882j;
            float length = f10 * (fArr.length - 1);
            int i10 = (int) length;
            float f11 = length - i10;
            float f12 = fArr[i10];
            return f12 + (f11 * (fArr[i10 + 1] - f12));
        }

        public final float d() {
            float f10 = this.f59884l * this.f59881i;
            float fHypot = this.f59888p / ((float) Math.hypot(f10, (-this.f59885m) * this.f59880h));
            if (this.f59889q) {
                f10 = -f10;
            }
            return f10 * fHypot;
        }

        public final float e() {
            float f10 = this.f59884l * this.f59881i;
            float f11 = (-this.f59885m) * this.f59880h;
            float fHypot = this.f59888p / ((float) Math.hypot(f10, f11));
            return this.f59889q ? (-f11) * fHypot : f11 * fHypot;
        }

        public final float f() {
            return this.f59886n + (this.f59884l * this.f59880h);
        }

        public final float g() {
            return this.f59887o + (this.f59885m * this.f59881i);
        }

        public final float h() {
            return this.f59886n;
        }

        public final float i() {
            return this.f59887o;
        }

        public final float j(float f10) {
            float f11 = (f10 - this.f59873a) * this.f59883k;
            float f12 = this.f59875c;
            return f12 + (f11 * (this.f59877e - f12));
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f59873a) * this.f59883k;
            float f12 = this.f59876d;
            return f12 + (f11 * (this.f59878f - f12));
        }

        public final float l() {
            return this.f59873a;
        }

        public final float m() {
            return this.f59874b;
        }

        public final boolean n() {
            return this.f59890r;
        }

        public final void p(float f10) {
            double dO = o((this.f59889q ? this.f59874b - f10 : f10 - this.f59873a) * this.f59883k) * 1.5707964f;
            this.f59880h = (float) Math.sin(dO);
            this.f59881i = (float) Math.cos(dO);
        }
    }

    /* renamed from: r.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[PHI: r10
  0x0027: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7545u(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.f59869b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            r.u$a[][] r4 = new r.C7545u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L27
            if (r9 == r2) goto L30
            if (r9 == r11) goto L2e
            if (r9 == r10) goto L29
            r10 = 4
            if (r9 == r10) goto L27
            r10 = 5
            if (r9 == r10) goto L27
            goto L32
        L27:
            r8 = r10
            goto L32
        L29:
            if (r7 != r2) goto L30
            goto L2e
        L2c:
            r8 = r7
            goto L32
        L2e:
            r7 = r11
            goto L2c
        L30:
            r7 = r2
            goto L2c
        L32:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            r.u$a[] r9 = new r.C7545u.a[r10]
            r11 = r5
        L3c:
            if (r11 >= r10) goto L69
            int r12 = r11 * 2
            r.u$a r20 = new r.u$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L3c
        L69:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L12
        L6e:
            r0.f59868a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C7545u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].m()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C7545u.a(float, float[]):void");
    }

    public final void b(float f10, float[] fArr) {
        if (f10 < this.f59868a[0][0].l()) {
            f10 = this.f59868a[0][0].l();
        } else {
            a[][] aVarArr = this.f59868a;
            if (f10 > aVarArr[aVarArr.length - 1][0].m()) {
                a[][] aVarArr2 = this.f59868a;
                f10 = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.f59868a.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                if (f10 <= this.f59868a[i10][i12].m()) {
                    if (this.f59868a[i10][i12].n()) {
                        fArr[i11] = this.f59868a[i10][i12].h();
                        fArr[i11 + 1] = this.f59868a[i10][i12].i();
                    } else {
                        this.f59868a[i10][i12].p(f10);
                        fArr[i11] = this.f59868a[i10][i12].d();
                        fArr[i11 + 1] = this.f59868a[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z10) {
                return;
            }
        }
    }
}
