package c1;

import c1.C4193i;
import j1.d;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4188d {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f33664s = false;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f33665t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f33666u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f33667v = true;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f33668w = false;

    /* renamed from: x, reason: collision with root package name */
    public static long f33669x;

    /* renamed from: y, reason: collision with root package name */
    public static long f33670y;

    /* renamed from: e, reason: collision with root package name */
    private a f33675e;

    /* renamed from: o, reason: collision with root package name */
    final C4187c f33685o;

    /* renamed from: r, reason: collision with root package name */
    private a f33688r;

    /* renamed from: a, reason: collision with root package name */
    private int f33671a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33672b = false;

    /* renamed from: c, reason: collision with root package name */
    int f33673c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f33674d = null;

    /* renamed from: f, reason: collision with root package name */
    private int f33676f = 32;

    /* renamed from: g, reason: collision with root package name */
    private int f33677g = 32;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33679i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33680j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean[] f33681k = new boolean[32];

    /* renamed from: l, reason: collision with root package name */
    int f33682l = 1;

    /* renamed from: m, reason: collision with root package name */
    int f33683m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f33684n = 32;

    /* renamed from: p, reason: collision with root package name */
    private C4193i[] f33686p = new C4193i[1000];

    /* renamed from: q, reason: collision with root package name */
    private int f33687q = 0;

    /* renamed from: h, reason: collision with root package name */
    C4186b[] f33678h = new C4186b[32];

    /* renamed from: c1.d$a */
    interface a {
        C4193i a(C4188d c4188d, boolean[] zArr);

        void b(a aVar);

        void c(C4193i c4193i);

        void clear();

        C4193i getKey();

        boolean isEmpty();
    }

    /* renamed from: c1.d$b */
    static class b extends C4186b {
        b(C4187c c4187c) {
            this.f33658e = new C4194j(this, c4187c);
        }
    }

    public C4188d() {
        C();
        C4187c c4187c = new C4187c();
        this.f33685o = c4187c;
        this.f33675e = new C4192h(c4187c);
        if (f33668w) {
            this.f33688r = new b(c4187c);
        } else {
            this.f33688r = new C4186b(c4187c);
        }
    }

    private int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f33682l; i10++) {
            this.f33681k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f33682l * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f33681k[aVar.getKey().f33704c] = true;
            }
            C4193i c4193iA = aVar.a(this, this.f33681k);
            if (c4193iA != null) {
                boolean[] zArr = this.f33681k;
                int i12 = c4193iA.f33704c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c4193iA != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f33683m; i14++) {
                    C4186b c4186b = this.f33678h[i14];
                    if (c4186b.f33654a.f33711j != C4193i.a.UNRESTRICTED && !c4186b.f33659f && c4186b.t(c4193iA)) {
                        float fJ = c4186b.f33658e.j(c4193iA);
                        if (fJ < 0.0f) {
                            float f11 = (-c4186b.f33655b) / fJ;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C4186b c4186b2 = this.f33678h[i13];
                    c4186b2.f33654a.f33705d = -1;
                    c4186b2.x(c4193iA);
                    C4193i c4193i = c4186b2.f33654a;
                    c4193i.f33705d = i13;
                    c4193i.l(this, c4186b2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f33668w) {
            while (i10 < this.f33683m) {
                C4186b c4186b = this.f33678h[i10];
                if (c4186b != null) {
                    this.f33685o.f33660a.a(c4186b);
                }
                this.f33678h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f33683m) {
            C4186b c4186b2 = this.f33678h[i10];
            if (c4186b2 != null) {
                this.f33685o.f33661b.a(c4186b2);
            }
            this.f33678h[i10] = null;
            i10++;
        }
    }

    private C4193i a(C4193i.a aVar, String str) {
        C4193i c4193i = (C4193i) this.f33685o.f33662c.b();
        if (c4193i == null) {
            c4193i = new C4193i(aVar, str);
            c4193i.j(aVar, str);
        } else {
            c4193i.g();
            c4193i.j(aVar, str);
        }
        int i10 = this.f33687q;
        int i11 = this.f33671a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f33671a = i12;
            this.f33686p = (C4193i[]) Arrays.copyOf(this.f33686p, i12);
        }
        C4193i[] c4193iArr = this.f33686p;
        int i13 = this.f33687q;
        this.f33687q = i13 + 1;
        c4193iArr[i13] = c4193i;
        return c4193i;
    }

    private void l(C4186b c4186b) {
        int i10;
        if (f33666u && c4186b.f33659f) {
            c4186b.f33654a.h(this, c4186b.f33655b);
        } else {
            C4186b[] c4186bArr = this.f33678h;
            int i11 = this.f33683m;
            c4186bArr[i11] = c4186b;
            C4193i c4193i = c4186b.f33654a;
            c4193i.f33705d = i11;
            this.f33683m = i11 + 1;
            c4193i.l(this, c4186b);
        }
        if (f33666u && this.f33672b) {
            int i12 = 0;
            while (i12 < this.f33683m) {
                if (this.f33678h[i12] == null) {
                    System.out.println("WTF");
                }
                C4186b c4186b2 = this.f33678h[i12];
                if (c4186b2 != null && c4186b2.f33659f) {
                    c4186b2.f33654a.h(this, c4186b2.f33655b);
                    if (f33668w) {
                        this.f33685o.f33660a.a(c4186b2);
                    } else {
                        this.f33685o.f33661b.a(c4186b2);
                    }
                    this.f33678h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f33683m;
                        if (i13 >= i10) {
                            break;
                        }
                        C4186b[] c4186bArr2 = this.f33678h;
                        int i15 = i13 - 1;
                        C4186b c4186b3 = c4186bArr2[i13];
                        c4186bArr2[i15] = c4186b3;
                        C4193i c4193i2 = c4186b3.f33654a;
                        if (c4193i2.f33705d == i13) {
                            c4193i2.f33705d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f33678h[i14] = null;
                    }
                    this.f33683m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f33672b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f33683m; i10++) {
            C4186b c4186b = this.f33678h[i10];
            c4186b.f33654a.f33707f = c4186b.f33655b;
        }
    }

    public static C4186b s(C4188d c4188d, C4193i c4193i, C4193i c4193i2, float f10) {
        return c4188d.r().j(c4193i, c4193i2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f33683m; i10++) {
            C4186b c4186b = this.f33678h[i10];
            if (c4186b.f33654a.f33711j != C4193i.a.UNRESTRICTED && c4186b.f33655b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f33683m) {
                            break;
                        }
                        C4186b c4186b2 = this.f33678h[i12];
                        if (c4186b2.f33654a.f33711j != C4193i.a.UNRESTRICTED && !c4186b2.f33659f && c4186b2.f33655b < 0.0f) {
                            int i16 = 9;
                            if (f33667v) {
                                int iA = c4186b2.f33658e.a();
                                int i17 = 0;
                                while (i17 < iA) {
                                    C4193i c4193iB = c4186b2.f33658e.b(i17);
                                    float fJ = c4186b2.f33658e.j(c4193iB);
                                    if (fJ > 0.0f) {
                                        int i18 = 0;
                                        while (i18 < i16) {
                                            float f11 = c4193iB.f33709h[i18] / fJ;
                                            if ((f11 < f10 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                i14 = c4193iB.f33704c;
                                                i13 = i12;
                                                f10 = f11;
                                            }
                                            i18++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i19 = 1; i19 < this.f33682l; i19++) {
                                    C4193i c4193i = this.f33685o.f33663d[i19];
                                    float fJ2 = c4186b2.f33658e.j(c4193i);
                                    if (fJ2 > 0.0f) {
                                        for (int i20 = 0; i20 < 9; i20++) {
                                            float f12 = c4193i.f33709h[i20] / fJ2;
                                            if ((f12 < f10 && i20 == i15) || i20 > i15) {
                                                i13 = i12;
                                                i14 = i19;
                                                i15 = i20;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        C4186b c4186b3 = this.f33678h[i13];
                        c4186b3.f33654a.f33705d = -1;
                        c4186b3.x(this.f33685o.f33663d[i14]);
                        C4193i c4193i2 = c4186b3.f33654a;
                        c4193i2.f33705d = i13;
                        c4193i2.l(this, c4186b3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f33682l / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static AbstractC4189e w() {
        return null;
    }

    private void y() {
        int i10 = this.f33676f * 2;
        this.f33676f = i10;
        this.f33678h = (C4186b[]) Arrays.copyOf(this.f33678h, i10);
        C4187c c4187c = this.f33685o;
        c4187c.f33663d = (C4193i[]) Arrays.copyOf(c4187c.f33663d, this.f33676f);
        int i11 = this.f33676f;
        this.f33681k = new boolean[i11];
        this.f33677g = i11;
        this.f33684n = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        C4187c c4187c;
        int i10 = 0;
        while (true) {
            c4187c = this.f33685o;
            C4193i[] c4193iArr = c4187c.f33663d;
            if (i10 >= c4193iArr.length) {
                break;
            }
            C4193i c4193i = c4193iArr[i10];
            if (c4193i != null) {
                c4193i.g();
            }
            i10++;
        }
        c4187c.f33662c.c(this.f33686p, this.f33687q);
        this.f33687q = 0;
        Arrays.fill(this.f33685o.f33663d, (Object) null);
        HashMap map = this.f33674d;
        if (map != null) {
            map.clear();
        }
        this.f33673c = 0;
        this.f33675e.clear();
        this.f33682l = 1;
        for (int i11 = 0; i11 < this.f33683m; i11++) {
            C4186b c4186b = this.f33678h[i11];
            if (c4186b != null) {
                c4186b.f33656c = false;
            }
        }
        C();
        this.f33683m = 0;
        if (f33668w) {
            this.f33688r = new b(this.f33685o);
        } else {
            this.f33688r = new C4186b(this.f33685o);
        }
    }

    public void b(j1.e eVar, j1.e eVar2, float f10, int i10) {
        d.a aVar = d.a.LEFT;
        C4193i c4193iQ = q(eVar.l(aVar));
        d.a aVar2 = d.a.TOP;
        C4193i c4193iQ2 = q(eVar.l(aVar2));
        d.a aVar3 = d.a.RIGHT;
        C4193i c4193iQ3 = q(eVar.l(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        C4193i c4193iQ4 = q(eVar.l(aVar4));
        C4193i c4193iQ5 = q(eVar2.l(aVar));
        C4193i c4193iQ6 = q(eVar2.l(aVar2));
        C4193i c4193iQ7 = q(eVar2.l(aVar3));
        C4193i c4193iQ8 = q(eVar2.l(aVar4));
        C4186b c4186bR = r();
        double d10 = f10;
        double d11 = i10;
        c4186bR.q(c4193iQ2, c4193iQ4, c4193iQ6, c4193iQ8, (float) (Math.sin(d10) * d11));
        d(c4186bR);
        C4186b c4186bR2 = r();
        c4186bR2.q(c4193iQ, c4193iQ3, c4193iQ5, c4193iQ7, (float) (Math.cos(d10) * d11));
        d(c4186bR2);
    }

    public void c(C4193i c4193i, C4193i c4193i2, int i10, float f10, C4193i c4193i3, C4193i c4193i4, int i11, int i12) {
        C4186b c4186bR = r();
        c4186bR.h(c4193i, c4193i2, i10, f10, c4193i3, c4193i4, i11);
        if (i12 != 8) {
            c4186bR.d(this, i12);
        }
        d(c4186bR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(c1.C4186b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f33683m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f33684n
            if (r0 >= r2) goto L12
            int r0 = r5.f33682l
            int r0 = r0 + r1
            int r2 = r5.f33677g
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            boolean r0 = r6.f33659f
            r2 = 0
            if (r0 != 0) goto L84
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7b
            c1.i r0 = r5.p()
            r6.f33654a = r0
            int r3 = r5.f33683m
            r5.l(r6)
            int r4 = r5.f33683m
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            c1.d$a r2 = r5.f33688r
            r2.b(r6)
            c1.d$a r2 = r5.f33688r
            r5.B(r2, r1)
            int r2 = r0.f33705d
            r3 = -1
            if (r2 != r3) goto L7c
            c1.i r2 = r6.f33654a
            if (r2 != r0) goto L59
            c1.i r0 = r6.v(r0)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f33659f
            if (r0 != 0) goto L62
            c1.i r0 = r6.f33654a
            r0.l(r5, r6)
        L62:
            boolean r0 = c1.C4188d.f33668w
            if (r0 == 0) goto L6e
            c1.c r0 = r5.f33685o
            c1.f r0 = r0.f33660a
            r0.a(r6)
            goto L75
        L6e:
            c1.c r0 = r5.f33685o
            c1.f r0 = r0.f33661b
            r0.a(r6)
        L75:
            int r0 = r5.f33683m
            int r0 = r0 - r1
            r5.f33683m = r0
            goto L7c
        L7b:
            r1 = r2
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r2 = r1
        L84:
            if (r2 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C4188d.d(c1.b):void");
    }

    public C4186b e(C4193i c4193i, C4193i c4193i2, int i10, int i11) {
        if (f33665t && i11 == 8 && c4193i2.f33708g && c4193i.f33705d == -1) {
            c4193i.h(this, c4193i2.f33707f + i10);
            return null;
        }
        C4186b c4186bR = r();
        c4186bR.n(c4193i, c4193i2, i10);
        if (i11 != 8) {
            c4186bR.d(this, i11);
        }
        d(c4186bR);
        return c4186bR;
    }

    public void f(C4193i c4193i, int i10) {
        if (f33665t && c4193i.f33705d == -1) {
            float f10 = i10;
            c4193i.h(this, f10);
            for (int i11 = 0; i11 < this.f33673c + 1; i11++) {
                C4193i c4193i2 = this.f33685o.f33663d[i11];
                if (c4193i2 != null && c4193i2.f33715n && c4193i2.f33716o == c4193i.f33704c) {
                    c4193i2.h(this, c4193i2.f33717p + f10);
                }
            }
            return;
        }
        int i12 = c4193i.f33705d;
        if (i12 == -1) {
            C4186b c4186bR = r();
            c4186bR.i(c4193i, i10);
            d(c4186bR);
            return;
        }
        C4186b c4186b = this.f33678h[i12];
        if (c4186b.f33659f) {
            c4186b.f33655b = i10;
            return;
        }
        if (c4186b.f33658e.a() == 0) {
            c4186b.f33659f = true;
            c4186b.f33655b = i10;
        } else {
            C4186b c4186bR2 = r();
            c4186bR2.m(c4193i, i10);
            d(c4186bR2);
        }
    }

    public void g(C4193i c4193i, C4193i c4193i2, int i10, boolean z10) {
        C4186b c4186bR = r();
        C4193i c4193iT = t();
        c4193iT.f33706e = 0;
        c4186bR.o(c4193i, c4193i2, c4193iT, i10);
        d(c4186bR);
    }

    public void h(C4193i c4193i, C4193i c4193i2, int i10, int i11) {
        C4186b c4186bR = r();
        C4193i c4193iT = t();
        c4193iT.f33706e = 0;
        c4186bR.o(c4193i, c4193i2, c4193iT, i10);
        if (i11 != 8) {
            m(c4186bR, (int) (c4186bR.f33658e.j(c4193iT) * (-1.0f)), i11);
        }
        d(c4186bR);
    }

    public void i(C4193i c4193i, C4193i c4193i2, int i10, boolean z10) {
        C4186b c4186bR = r();
        C4193i c4193iT = t();
        c4193iT.f33706e = 0;
        c4186bR.p(c4193i, c4193i2, c4193iT, i10);
        d(c4186bR);
    }

    public void j(C4193i c4193i, C4193i c4193i2, int i10, int i11) {
        C4186b c4186bR = r();
        C4193i c4193iT = t();
        c4193iT.f33706e = 0;
        c4186bR.p(c4193i, c4193i2, c4193iT, i10);
        if (i11 != 8) {
            m(c4186bR, (int) (c4186bR.f33658e.j(c4193iT) * (-1.0f)), i11);
        }
        d(c4186bR);
    }

    public void k(C4193i c4193i, C4193i c4193i2, C4193i c4193i3, C4193i c4193i4, float f10, int i10) {
        C4186b c4186bR = r();
        c4186bR.k(c4193i, c4193i2, c4193i3, c4193i4, f10);
        if (i10 != 8) {
            c4186bR.d(this, i10);
        }
        d(c4186bR);
    }

    void m(C4186b c4186b, int i10, int i11) {
        c4186b.e(o(i11, null), i10);
    }

    public C4193i o(int i10, String str) {
        if (this.f33682l + 1 >= this.f33677g) {
            y();
        }
        C4193i c4193iA = a(C4193i.a.ERROR, str);
        int i11 = this.f33673c + 1;
        this.f33673c = i11;
        this.f33682l++;
        c4193iA.f33704c = i11;
        c4193iA.f33706e = i10;
        this.f33685o.f33663d[i11] = c4193iA;
        this.f33675e.c(c4193iA);
        return c4193iA;
    }

    public C4193i p() {
        if (this.f33682l + 1 >= this.f33677g) {
            y();
        }
        C4193i c4193iA = a(C4193i.a.SLACK, null);
        int i10 = this.f33673c + 1;
        this.f33673c = i10;
        this.f33682l++;
        c4193iA.f33704c = i10;
        this.f33685o.f33663d[i10] = c4193iA;
        return c4193iA;
    }

    public C4193i q(Object obj) {
        C4193i c4193iI = null;
        if (obj == null) {
            return null;
        }
        if (this.f33682l + 1 >= this.f33677g) {
            y();
        }
        if (obj instanceof j1.d) {
            j1.d dVar = (j1.d) obj;
            c4193iI = dVar.i();
            if (c4193iI == null) {
                dVar.s(this.f33685o);
                c4193iI = dVar.i();
            }
            int i10 = c4193iI.f33704c;
            if (i10 == -1 || i10 > this.f33673c || this.f33685o.f33663d[i10] == null) {
                if (i10 != -1) {
                    c4193iI.g();
                }
                int i11 = this.f33673c + 1;
                this.f33673c = i11;
                this.f33682l++;
                c4193iI.f33704c = i11;
                c4193iI.f33711j = C4193i.a.UNRESTRICTED;
                this.f33685o.f33663d[i11] = c4193iI;
            }
        }
        return c4193iI;
    }

    public C4186b r() {
        C4186b c4186b;
        if (f33668w) {
            c4186b = (C4186b) this.f33685o.f33660a.b();
            if (c4186b == null) {
                c4186b = new b(this.f33685o);
                f33670y++;
            } else {
                c4186b.y();
            }
        } else {
            c4186b = (C4186b) this.f33685o.f33661b.b();
            if (c4186b == null) {
                c4186b = new C4186b(this.f33685o);
                f33669x++;
            } else {
                c4186b.y();
            }
        }
        C4193i.c();
        return c4186b;
    }

    public C4193i t() {
        if (this.f33682l + 1 >= this.f33677g) {
            y();
        }
        C4193i c4193iA = a(C4193i.a.SLACK, null);
        int i10 = this.f33673c + 1;
        this.f33673c = i10;
        this.f33682l++;
        c4193iA.f33704c = i10;
        this.f33685o.f33663d[i10] = c4193iA;
        return c4193iA;
    }

    public C4187c v() {
        return this.f33685o;
    }

    public int x(Object obj) {
        C4193i c4193iI = ((j1.d) obj).i();
        if (c4193iI != null) {
            return (int) (c4193iI.f33707f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f33675e.isEmpty()) {
            n();
            return;
        }
        if (!this.f33679i && !this.f33680j) {
            A(this.f33675e);
            return;
        }
        for (int i10 = 0; i10 < this.f33683m; i10++) {
            if (!this.f33678h[i10].f33659f) {
                A(this.f33675e);
                return;
            }
        }
        n();
    }
}
