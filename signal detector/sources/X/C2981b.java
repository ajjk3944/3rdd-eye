package x;

import java.util.ArrayList;
import o.a1;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2981b {

    /* renamed from: d, reason: collision with root package name */
    public final C2980a f23998d;

    /* renamed from: a, reason: collision with root package name */
    public C2985f f23995a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f23996b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23997c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23999e = false;

    public C2981b(a1 a1Var) {
        this.f23998d = new C2980a(this, a1Var);
    }

    public final void a(C2982c c2982c, int i) {
        this.f23998d.g(c2982c.j(i), 1.0f);
        this.f23998d.g(c2982c.j(i), -1.0f);
    }

    public final void b(C2985f c2985f, C2985f c2985f2, C2985f c2985f3, int i) {
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            this.f23996b = i;
        }
        if (z6) {
            this.f23998d.g(c2985f, 1.0f);
            this.f23998d.g(c2985f2, -1.0f);
            this.f23998d.g(c2985f3, -1.0f);
        } else {
            this.f23998d.g(c2985f, -1.0f);
            this.f23998d.g(c2985f2, 1.0f);
            this.f23998d.g(c2985f3, 1.0f);
        }
    }

    public final void c(C2985f c2985f, C2985f c2985f2, C2985f c2985f3, int i) {
        boolean z6 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z6 = true;
            }
            this.f23996b = i;
        }
        if (z6) {
            this.f23998d.g(c2985f, 1.0f);
            this.f23998d.g(c2985f2, -1.0f);
            this.f23998d.g(c2985f3, 1.0f);
        } else {
            this.f23998d.g(c2985f, -1.0f);
            this.f23998d.g(c2985f2, 1.0f);
            this.f23998d.g(c2985f3, -1.0f);
        }
    }

    public C2985f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f23995a == null && this.f23996b == 0.0f && this.f23998d.d() == 0;
    }

    public final C2985f f(boolean[] zArr, C2985f c2985f) {
        int i;
        int iD = this.f23998d.d();
        C2985f c2985f2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < iD; i3++) {
            float f5 = this.f23998d.f(i3);
            if (f5 < 0.0f) {
                C2985f c2985fE = this.f23998d.e(i3);
                if ((zArr == null || !zArr[c2985fE.f24021b]) && c2985fE != c2985f && (((i = c2985fE.f24030l) == 3 || i == 4) && f5 < f2)) {
                    f2 = f5;
                    c2985f2 = c2985fE;
                }
            }
        }
        return c2985f2;
    }

    public final void g(C2985f c2985f) {
        C2985f c2985f2 = this.f23995a;
        if (c2985f2 != null) {
            this.f23998d.g(c2985f2, -1.0f);
            this.f23995a.f24022c = -1;
            this.f23995a = null;
        }
        float fH = this.f23998d.h(c2985f, true) * (-1.0f);
        this.f23995a = c2985f;
        if (fH == 1.0f) {
            return;
        }
        this.f23996b /= fH;
        C2980a c2980a = this.f23998d;
        int i = c2980a.f23993h;
        for (int i3 = 0; i != -1 && i3 < c2980a.f23986a; i3++) {
            float[] fArr = c2980a.f23992g;
            fArr[i] = fArr[i] / fH;
            i = c2980a.f23991f[i];
        }
    }

    public final void h(C2982c c2982c, C2985f c2985f, boolean z6) {
        if (c2985f.f24025f) {
            float fC = this.f23998d.c(c2985f);
            this.f23996b = (c2985f.f24024e * fC) + this.f23996b;
            this.f23998d.h(c2985f, z6);
            if (z6) {
                c2985f.b(this);
            }
            if (this.f23998d.d() == 0) {
                this.f23999e = true;
                c2982c.f24002a = true;
            }
        }
    }

    public void i(C2982c c2982c, C2981b c2981b, boolean z6) {
        C2980a c2980a = this.f23998d;
        c2980a.getClass();
        float fC = c2980a.c(c2981b.f23995a);
        c2980a.h(c2981b.f23995a, z6);
        C2980a c2980a2 = c2981b.f23998d;
        int iD = c2980a2.d();
        for (int i = 0; i < iD; i++) {
            C2985f c2985fE = c2980a2.e(i);
            c2980a.a(c2985fE, c2980a2.c(c2985fE) * fC, z6);
        }
        this.f23996b = (c2981b.f23996b * fC) + this.f23996b;
        if (z6) {
            c2981b.f23995a.b(this);
        }
        if (this.f23995a == null || this.f23998d.d() != 0) {
            return;
        }
        this.f23999e = true;
        c2982c.f24002a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            x.f r0 = r10.f23995a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            x.f r1 = r10.f23995a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r1)
            float r1 = r10.f23996b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = x.AbstractC2984e.a(r0)
            float r1 = r10.f23996b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            x.a r5 = r10.f23998d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            x.a r6 = r10.f23998d
            x.f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            x.a r7 = r10.f23998d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = o4.AbstractC2763b.e(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2981b.toString():java.lang.String");
    }
}
