package x2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f24990d;

    /* renamed from: a, reason: collision with root package name */
    public f f24987a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f24988b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24989c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f24991e = false;

    public b(qm.c cVar) {
        this.f24990d = new a(this, cVar);
    }

    public final void a(c cVar, int i10) {
        this.f24990d.g(cVar.j(i10), 1.0f);
        this.f24990d.g(cVar.j(i10), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f24988b = i10;
        }
        if (z10) {
            this.f24990d.g(fVar, 1.0f);
            this.f24990d.g(fVar2, -1.0f);
            this.f24990d.g(fVar3, -1.0f);
        } else {
            this.f24990d.g(fVar, -1.0f);
            this.f24990d.g(fVar2, 1.0f);
            this.f24990d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f24988b = i10;
        }
        if (z10) {
            this.f24990d.g(fVar, 1.0f);
            this.f24990d.g(fVar2, -1.0f);
            this.f24990d.g(fVar3, 1.0f);
        } else {
            this.f24990d.g(fVar, -1.0f);
            this.f24990d.g(fVar2, 1.0f);
            this.f24990d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f24987a == null && this.f24988b == 0.0f && this.f24990d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        e eVar;
        int iD = this.f24990d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f11 = this.f24990d.f(i10);
            if (f11 < 0.0f) {
                f fVarE = this.f24990d.e(i10);
                if ((zArr == null || !zArr[fVarE.f25012d]) && fVarE != fVar && (((eVar = fVarE.E) == e.SLACK || eVar == e.ERROR) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f24987a;
        if (fVar2 != null) {
            this.f24990d.g(fVar2, -1.0f);
            this.f24987a.f25013g = -1;
            this.f24987a = null;
        }
        float fH = this.f24990d.h(fVar, true) * (-1.0f);
        this.f24987a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f24988b /= fH;
        a aVar = this.f24990d;
        int i10 = aVar.f24985h;
        for (int i11 = 0; i10 != -1 && i11 < aVar.f24978a; i11++) {
            float[] fArr = aVar.f24984g;
            fArr[i10] = fArr[i10] / fH;
            i10 = aVar.f24983f[i10];
        }
    }

    public final void h(c cVar, f fVar, boolean z10) {
        if (fVar.f25016y) {
            float fC = this.f24990d.c(fVar);
            this.f24988b = (fVar.f25015x * fC) + this.f24988b;
            this.f24990d.h(fVar, z10);
            if (z10) {
                fVar.b(this);
            }
            if (this.f24990d.d() == 0) {
                this.f24991e = true;
                cVar.f24994b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        a aVar = this.f24990d;
        aVar.getClass();
        float fC = aVar.c(bVar.f24987a);
        aVar.h(bVar.f24987a, z10);
        a aVar2 = bVar.f24990d;
        int iD = aVar2.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar2.e(i10);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z10);
        }
        this.f24988b = (bVar.f24988b * fC) + this.f24988b;
        if (z10) {
            bVar.f24987a.b(this);
        }
        if (this.f24987a == null || this.f24990d.d() != 0) {
            return;
        }
        this.f24991e = true;
        cVar.f24994b = true;
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
            x2.f r0 = r10.f24987a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            x2.f r1 = r10.f24987a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = w.g.f(r0, r1)
            float r1 = r10.f24988b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = c7.a.t(r0)
            float r1 = r10.f24988b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            x2.a r5 = r10.f24990d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            x2.a r6 = r10.f24990d
            x2.f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            x2.a r7 = r10.f24990d
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
            java.lang.String r0 = w.g.f(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = w.g.f(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = w.g.f(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = w.g.f(r0, r6)
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
            java.lang.String r0 = w.g.f(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.b.toString():java.lang.String");
    }
}
