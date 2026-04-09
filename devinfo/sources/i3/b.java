package i3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f25832d;

    /* renamed from: a, reason: collision with root package name */
    public f f25829a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f25830b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25831c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f25833e = false;

    public b(i0.f fVar) {
        this.f25832d = new a(this, fVar);
    }

    public final void a(c cVar, int i4) {
        this.f25832d.g(cVar.j(i4), 1.0f);
        this.f25832d.g(cVar.j(i4), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f25830b = i4;
        }
        if (z3) {
            this.f25832d.g(fVar, 1.0f);
            this.f25832d.g(fVar2, -1.0f);
            this.f25832d.g(fVar3, -1.0f);
        } else {
            this.f25832d.g(fVar, -1.0f);
            this.f25832d.g(fVar2, 1.0f);
            this.f25832d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i4) {
        boolean z3 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z3 = true;
            }
            this.f25830b = i4;
        }
        if (z3) {
            this.f25832d.g(fVar, 1.0f);
            this.f25832d.g(fVar2, -1.0f);
            this.f25832d.g(fVar3, 1.0f);
        } else {
            this.f25832d.g(fVar, -1.0f);
            this.f25832d.g(fVar2, 1.0f);
            this.f25832d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f25829a == null && this.f25830b == 0.0f && this.f25832d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i4;
        int iD = this.f25832d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f11 = this.f25832d.f(i10);
            if (f11 < 0.0f) {
                f fVarE = this.f25832d.e(i10);
                if ((zArr == null || !zArr[fVarE.f25854b]) && fVarE != fVar && (((i4 = fVarE.f25862l) == 3 || i4 == 4) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f25829a;
        if (fVar2 != null) {
            this.f25832d.g(fVar2, -1.0f);
            this.f25829a.f25855c = -1;
            this.f25829a = null;
        }
        float fH = this.f25832d.h(fVar, true) * (-1.0f);
        this.f25829a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f25830b /= fH;
        a aVar = this.f25832d;
        int i4 = aVar.f25827h;
        for (int i10 = 0; i4 != -1 && i10 < aVar.f25821a; i10++) {
            float[] fArr = aVar.g;
            fArr[i4] = fArr[i4] / fH;
            i4 = aVar.f25826f[i4];
        }
    }

    public final void h(c cVar, f fVar, boolean z3) {
        if (fVar.f25858f) {
            float fC = this.f25832d.c(fVar);
            this.f25830b = (fVar.f25857e * fC) + this.f25830b;
            this.f25832d.h(fVar, z3);
            if (z3) {
                fVar.b(this);
            }
            if (this.f25832d.d() == 0) {
                this.f25833e = true;
                cVar.f25836b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z3) {
        a aVar = this.f25832d;
        aVar.getClass();
        float fC = aVar.c(bVar.f25829a);
        aVar.h(bVar.f25829a, z3);
        a aVar2 = bVar.f25832d;
        int iD = aVar2.d();
        for (int i4 = 0; i4 < iD; i4++) {
            f fVarE = aVar2.e(i4);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z3);
        }
        this.f25830b = (bVar.f25830b * fC) + this.f25830b;
        if (z3) {
            bVar.f25829a.b(this);
        }
        if (this.f25829a == null || this.f25832d.d() != 0) {
            return;
        }
        this.f25833e = true;
        cVar.f25836b = true;
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
            i3.f r0 = r10.f25829a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            i3.f r1 = r10.f25829a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = d.h.s(r0, r1)
            float r1 = r10.f25830b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = d.h.z(r0)
            float r1 = r10.f25830b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            i3.a r5 = r10.f25832d
            int r5 = r5.d()
        L3c:
            if (r3 >= r5) goto L9c
            i3.a r6 = r10.f25832d
            i3.f r6 = r6.e(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            i3.a r7 = r10.f25832d
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
            java.lang.String r0 = d.h.s(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = d.h.s(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = d.h.s(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = d.h.s(r0, r6)
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
            java.lang.String r0 = d.h.s(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.toString():java.lang.String");
    }
}
