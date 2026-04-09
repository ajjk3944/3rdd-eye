package v;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f24550a;

    /* renamed from: b, reason: collision with root package name */
    public C0490a[] f24551b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24552c = true;

    /* renamed from: v.a$a, reason: collision with other inner class name */
    public static class C0490a {

        /* renamed from: s, reason: collision with root package name */
        public static double[] f24553s = new double[91];

        /* renamed from: a, reason: collision with root package name */
        public double[] f24554a;

        /* renamed from: b, reason: collision with root package name */
        public double f24555b;

        /* renamed from: c, reason: collision with root package name */
        public double f24556c;

        /* renamed from: d, reason: collision with root package name */
        public double f24557d;

        /* renamed from: e, reason: collision with root package name */
        public double f24558e;

        /* renamed from: f, reason: collision with root package name */
        public double f24559f;

        /* renamed from: g, reason: collision with root package name */
        public double f24560g;

        /* renamed from: h, reason: collision with root package name */
        public double f24561h;

        /* renamed from: i, reason: collision with root package name */
        public double f24562i;

        /* renamed from: j, reason: collision with root package name */
        public double f24563j;

        /* renamed from: k, reason: collision with root package name */
        public double f24564k;

        /* renamed from: l, reason: collision with root package name */
        public double f24565l;

        /* renamed from: m, reason: collision with root package name */
        public double f24566m;

        /* renamed from: n, reason: collision with root package name */
        public double f24567n;

        /* renamed from: o, reason: collision with root package name */
        public double f24568o;

        /* renamed from: p, reason: collision with root package name */
        public double f24569p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f24570q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f24571r;

        public C0490a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f24571r = false;
            this.f24570q = i10 == 1;
            this.f24556c = d10;
            this.f24557d = d11;
            this.f24562i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f24571r = true;
            }
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (!this.f24571r && Math.abs(d16) >= 0.001d && Math.abs(d17) >= 0.001d) {
                this.f24554a = new double[101];
                boolean z10 = this.f24570q;
                this.f24563j = d16 * (z10 ? -1 : 1);
                this.f24564k = d17 * (z10 ? 1 : -1);
                this.f24565l = z10 ? d14 : d12;
                this.f24566m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f24567n = this.f24555b * this.f24562i;
                return;
            }
            this.f24571r = true;
            this.f24558e = d12;
            this.f24559f = d14;
            this.f24560g = d13;
            this.f24561h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f24555b = dHypot;
            this.f24567n = dHypot * this.f24562i;
            double d18 = this.f24557d;
            double d19 = this.f24556c;
            this.f24565l = d16 / (d18 - d19);
            this.f24566m = d17 / (d18 - d19);
        }

        public final void a(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double dHypot = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                if (i10 >= f24553s.length) {
                    break;
                }
                int i11 = i10;
                double radians = Math.toRadians((i10 * 90.0d) / (r15.length - 1));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i11 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    f24553s[i11] = dHypot;
                }
                i10 = i11 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.f24555b = dHypot;
            int i12 = 0;
            while (true) {
                double[] dArr = f24553s;
                if (i12 >= dArr.length) {
                    break;
                }
                dArr[i12] = dArr[i12] / dHypot;
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= this.f24554a.length) {
                    return;
                }
                double length = i13 / (r1.length - 1);
                int iBinarySearch = Arrays.binarySearch(f24553s, length);
                if (iBinarySearch >= 0) {
                    this.f24554a[i13] = iBinarySearch / (f24553s.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f24554a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double[] dArr2 = f24553s;
                    double d18 = dArr2[i15];
                    this.f24554a[i13] = (i15 + ((length - d18) / (dArr2[i14 - 1] - d18))) / (dArr2.length - 1);
                }
                i13++;
            }
        }

        public double b() {
            double d10 = this.f24563j * this.f24569p;
            double dHypot = this.f24567n / Math.hypot(d10, (-this.f24564k) * this.f24568o);
            return this.f24570q ? (-d10) * dHypot : d10 * dHypot;
        }

        public double c() {
            double d10 = this.f24563j * this.f24569p;
            double d11 = (-this.f24564k) * this.f24568o;
            double dHypot = this.f24567n / Math.hypot(d10, d11);
            return this.f24570q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f24565l;
        }

        public double e(double d10) {
            return this.f24566m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f24556c) * this.f24562i;
            double d12 = this.f24558e;
            return d12 + (d11 * (this.f24559f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f24556c) * this.f24562i;
            double d12 = this.f24560g;
            return d12 + (d11 * (this.f24561h - d12));
        }

        public double h() {
            return this.f24565l + (this.f24563j * this.f24568o);
        }

        public double i() {
            return this.f24566m + (this.f24564k * this.f24569p);
        }

        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f24554a;
            double length = d10 * (dArr.length - 1);
            int i10 = (int) length;
            double d11 = length - i10;
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        public void k(double d10) {
            double dJ = j((this.f24570q ? this.f24557d - d10 : d10 - this.f24556c) * this.f24562i) * 1.5707963267948966d;
            this.f24568o = Math.sin(dJ);
            this.f24569p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r24, double[] r25, double[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.f24552c = r2
            r0.f24550a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            v.a$a[] r3 = new v.a.C0490a[r3]
            r0.f24551b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            v.a$a[] r7 = r0.f24551b
            int r8 = r7.length
            if (r4 >= r8) goto L55
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L32
            if (r8 == r2) goto L30
            r10 = 2
            if (r8 == r10) goto L2e
            if (r8 == r9) goto L29
            r9 = r6
            goto L32
        L29:
            if (r5 != r2) goto L30
            goto L2e
        L2c:
            r9 = r5
            goto L32
        L2e:
            r5 = r10
            goto L2c
        L30:
            r5 = r2
            goto L2c
        L32:
            v.a$a r8 = new v.a$a
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r3]
            r17 = r14[r2]
            r14 = r26[r6]
            r19 = r14[r3]
            r21 = r14[r2]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.a.<init>(int[], double[], double[][]):void");
    }

    @Override // v.b
    public double c(double d10, int i10) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i11 = 0;
        if (this.f24552c) {
            C0490a[] c0490aArr = this.f24551b;
            C0490a c0490a = c0490aArr[0];
            double d11 = c0490a.f24556c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0490a.f24571r) {
                    if (i10 == 0) {
                        dG2 = c0490a.f(d11);
                        dE2 = this.f24551b[0].d(d11);
                    } else {
                        dG2 = c0490a.g(d11);
                        dE2 = this.f24551b[0].e(d11);
                    }
                    return dG2 + (d12 * dE2);
                }
                c0490a.k(d11);
                if (i10 == 0) {
                    dI = this.f24551b[0].h();
                    dC = this.f24551b[0].b();
                } else {
                    dI = this.f24551b[0].i();
                    dC = this.f24551b[0].c();
                }
                return dI + (d12 * dC);
            }
            if (d10 > c0490aArr[c0490aArr.length - 1].f24557d) {
                double d13 = c0490aArr[c0490aArr.length - 1].f24557d;
                double d14 = d10 - d13;
                int length = c0490aArr.length - 1;
                if (i10 == 0) {
                    dG = c0490aArr[length].f(d13);
                    dE = this.f24551b[length].d(d13);
                } else {
                    dG = c0490aArr[length].g(d13);
                    dE = this.f24551b[length].e(d13);
                }
                return dG + (d14 * dE);
            }
        } else {
            C0490a[] c0490aArr2 = this.f24551b;
            double d15 = c0490aArr2[0].f24556c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0490aArr2[c0490aArr2.length - 1].f24557d) {
                d10 = c0490aArr2[c0490aArr2.length - 1].f24557d;
            }
        }
        while (true) {
            C0490a[] c0490aArr3 = this.f24551b;
            if (i11 >= c0490aArr3.length) {
                return Double.NaN;
            }
            C0490a c0490a2 = c0490aArr3[i11];
            if (d10 <= c0490a2.f24557d) {
                if (c0490a2.f24571r) {
                    return i10 == 0 ? c0490a2.f(d10) : c0490a2.g(d10);
                }
                c0490a2.k(d10);
                return i10 == 0 ? this.f24551b[i11].h() : this.f24551b[i11].i();
            }
            i11++;
        }
    }

    @Override // v.b
    public void d(double d10, double[] dArr) {
        if (this.f24552c) {
            C0490a[] c0490aArr = this.f24551b;
            C0490a c0490a = c0490aArr[0];
            double d11 = c0490a.f24556c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0490a.f24571r) {
                    dArr[0] = c0490a.f(d11) + (this.f24551b[0].d(d11) * d12);
                    dArr[1] = this.f24551b[0].g(d11) + (d12 * this.f24551b[0].e(d11));
                    return;
                } else {
                    c0490a.k(d11);
                    dArr[0] = this.f24551b[0].h() + (this.f24551b[0].b() * d12);
                    dArr[1] = this.f24551b[0].i() + (d12 * this.f24551b[0].c());
                    return;
                }
            }
            if (d10 > c0490aArr[c0490aArr.length - 1].f24557d) {
                double d13 = c0490aArr[c0490aArr.length - 1].f24557d;
                double d14 = d10 - d13;
                int length = c0490aArr.length - 1;
                C0490a c0490a2 = c0490aArr[length];
                if (c0490a2.f24571r) {
                    dArr[0] = c0490a2.f(d13) + (this.f24551b[length].d(d13) * d14);
                    dArr[1] = this.f24551b[length].g(d13) + (d14 * this.f24551b[length].e(d13));
                    return;
                } else {
                    c0490a2.k(d10);
                    dArr[0] = this.f24551b[length].h() + (this.f24551b[length].b() * d14);
                    dArr[1] = this.f24551b[length].i() + (d14 * this.f24551b[length].c());
                    return;
                }
            }
        } else {
            C0490a[] c0490aArr2 = this.f24551b;
            double d15 = c0490aArr2[0].f24556c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > c0490aArr2[c0490aArr2.length - 1].f24557d) {
                d10 = c0490aArr2[c0490aArr2.length - 1].f24557d;
            }
        }
        int i10 = 0;
        while (true) {
            C0490a[] c0490aArr3 = this.f24551b;
            if (i10 >= c0490aArr3.length) {
                return;
            }
            C0490a c0490a3 = c0490aArr3[i10];
            if (d10 <= c0490a3.f24557d) {
                if (c0490a3.f24571r) {
                    dArr[0] = c0490a3.f(d10);
                    dArr[1] = this.f24551b[i10].g(d10);
                    return;
                } else {
                    c0490a3.k(d10);
                    dArr[0] = this.f24551b[i10].h();
                    dArr[1] = this.f24551b[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public void e(double d10, float[] fArr) {
        if (this.f24552c) {
            C0490a[] c0490aArr = this.f24551b;
            C0490a c0490a = c0490aArr[0];
            double d11 = c0490a.f24556c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c0490a.f24571r) {
                    fArr[0] = (float) (c0490a.f(d11) + (this.f24551b[0].d(d11) * d12));
                    fArr[1] = (float) (this.f24551b[0].g(d11) + (d12 * this.f24551b[0].e(d11)));
                    return;
                } else {
                    c0490a.k(d11);
                    fArr[0] = (float) (this.f24551b[0].h() + (this.f24551b[0].b() * d12));
                    fArr[1] = (float) (this.f24551b[0].i() + (d12 * this.f24551b[0].c()));
                    return;
                }
            }
            if (d10 > c0490aArr[c0490aArr.length - 1].f24557d) {
                double d13 = c0490aArr[c0490aArr.length - 1].f24557d;
                double d14 = d10 - d13;
                int length = c0490aArr.length - 1;
                C0490a c0490a2 = c0490aArr[length];
                if (c0490a2.f24571r) {
                    fArr[0] = (float) (c0490a2.f(d13) + (this.f24551b[length].d(d13) * d14));
                    fArr[1] = (float) (this.f24551b[length].g(d13) + (d14 * this.f24551b[length].e(d13)));
                    return;
                } else {
                    c0490a2.k(d10);
                    fArr[0] = (float) this.f24551b[length].h();
                    fArr[1] = (float) this.f24551b[length].i();
                    return;
                }
            }
        } else {
            C0490a[] c0490aArr2 = this.f24551b;
            double d15 = c0490aArr2[0].f24556c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c0490aArr2[c0490aArr2.length - 1].f24557d) {
                d10 = c0490aArr2[c0490aArr2.length - 1].f24557d;
            }
        }
        int i10 = 0;
        while (true) {
            C0490a[] c0490aArr3 = this.f24551b;
            if (i10 >= c0490aArr3.length) {
                return;
            }
            C0490a c0490a3 = c0490aArr3[i10];
            if (d10 <= c0490a3.f24557d) {
                if (c0490a3.f24571r) {
                    fArr[0] = (float) c0490a3.f(d10);
                    fArr[1] = (float) this.f24551b[i10].g(d10);
                    return;
                } else {
                    c0490a3.k(d10);
                    fArr[0] = (float) this.f24551b[i10].h();
                    fArr[1] = (float) this.f24551b[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public void f(double d10, double[] dArr) {
        C0490a[] c0490aArr = this.f24551b;
        double d11 = c0490aArr[0].f24556c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0490aArr[c0490aArr.length - 1].f24557d) {
            d10 = c0490aArr[c0490aArr.length - 1].f24557d;
        }
        int i10 = 0;
        while (true) {
            C0490a[] c0490aArr2 = this.f24551b;
            if (i10 >= c0490aArr2.length) {
                return;
            }
            C0490a c0490a = c0490aArr2[i10];
            if (d10 <= c0490a.f24557d) {
                if (c0490a.f24571r) {
                    dArr[0] = c0490a.d(d10);
                    dArr[1] = this.f24551b[i10].e(d10);
                    return;
                } else {
                    c0490a.k(d10);
                    dArr[0] = this.f24551b[i10].b();
                    dArr[1] = this.f24551b[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // v.b
    public double[] g() {
        return this.f24550a;
    }
}
