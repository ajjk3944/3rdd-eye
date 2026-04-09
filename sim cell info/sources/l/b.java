package l;

import l.e;
import l.i;

/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f2791d;

    /* renamed from: a, reason: collision with root package name */
    i f2788a = null;

    /* renamed from: b, reason: collision with root package name */
    float f2789b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f2790c = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f2792e = false;

    public b(c cVar) {
        this.f2791d = new a(this, cVar);
    }

    @Override // l.e.a
    public i a(e eVar, boolean[] zArr) {
        return this.f2791d.g(zArr, null);
    }

    @Override // l.e.a
    public void b(i iVar) {
        int i2 = iVar.f2820d;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2791d.l(iVar, f2);
    }

    @Override // l.e.a
    public void c(e.a aVar) {
        if (!(aVar instanceof b)) {
            return;
        }
        b bVar = (b) aVar;
        this.f2788a = null;
        this.f2791d.c();
        int i2 = 0;
        while (true) {
            a aVar2 = bVar.f2791d;
            if (i2 >= aVar2.f2777a) {
                return;
            }
            this.f2791d.a(aVar2.h(i2), bVar.f2791d.i(i2), true);
            i2++;
        }
    }

    @Override // l.e.a
    public void clear() {
        this.f2791d.c();
        this.f2788a = null;
        this.f2789b = 0.0f;
    }

    public b d(e eVar, int i2) {
        this.f2791d.l(eVar.p(i2, "ep"), 1.0f);
        this.f2791d.l(eVar.p(i2, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i2) {
        this.f2791d.l(iVar, i2);
        return this;
    }

    boolean f(e eVar) {
        boolean z2;
        i iVarB = this.f2791d.b(eVar);
        if (iVarB == null) {
            z2 = true;
        } else {
            v(iVarB);
            z2 = false;
        }
        if (this.f2791d.f2777a == 0) {
            this.f2792e = true;
        }
        return z2;
    }

    b g(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        if (iVar2 == iVar3) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar4, 1.0f);
            this.f2791d.l(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
            this.f2791d.l(iVar3, -1.0f);
            this.f2791d.l(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                f3 = (-i2) + i3;
                this.f2789b = f3;
            }
        } else {
            if (f2 <= 0.0f) {
                this.f2791d.l(iVar, -1.0f);
                this.f2791d.l(iVar2, 1.0f);
                f3 = i2;
            } else if (f2 >= 1.0f) {
                this.f2791d.l(iVar3, -1.0f);
                this.f2791d.l(iVar4, 1.0f);
                f3 = i3;
            } else {
                float f4 = 1.0f - f2;
                this.f2791d.l(iVar, f4 * 1.0f);
                this.f2791d.l(iVar2, f4 * (-1.0f));
                this.f2791d.l(iVar3, (-1.0f) * f2);
                this.f2791d.l(iVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    f3 = ((-i2) * f4) + (i3 * f2);
                }
            }
            this.f2789b = f3;
        }
        return this;
    }

    @Override // l.e.a
    public i getKey() {
        return this.f2788a;
    }

    b h(i iVar, int i2) {
        this.f2788a = iVar;
        float f2 = i2;
        iVar.f2821e = f2;
        this.f2789b = f2;
        this.f2792e = true;
        return this;
    }

    b i(i iVar, i iVar2, i iVar3, float f2) {
        this.f2791d.l(iVar, -1.0f);
        this.f2791d.l(iVar2, 1.0f - f2);
        this.f2791d.l(iVar3, f2);
        return this;
    }

    public b j(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2791d.l(iVar, -1.0f);
        this.f2791d.l(iVar2, 1.0f);
        this.f2791d.l(iVar3, f2);
        this.f2791d.l(iVar4, -f2);
        return this;
    }

    public b k(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2789b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
            this.f2791d.l(iVar4, 1.0f);
            this.f2791d.l(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2791d.l(iVar3, 1.0f);
            this.f2791d.l(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
            this.f2791d.l(iVar4, f5);
            this.f2791d.l(iVar3, -f5);
        }
        return this;
    }

    public b l(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f2789b = i2 * (-1);
            aVar = this.f2791d;
            f2 = 1.0f;
        } else {
            this.f2789b = i2;
            aVar = this.f2791d;
            f2 = -1.0f;
        }
        aVar.l(iVar, f2);
        return this;
    }

    public b m(i iVar, i iVar2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2789b = i2;
        }
        if (z2) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
        } else {
            this.f2791d.l(iVar, -1.0f);
            this.f2791d.l(iVar2, 1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2789b = i2;
        }
        if (z2) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
            this.f2791d.l(iVar3, -1.0f);
        } else {
            this.f2791d.l(iVar, -1.0f);
            this.f2791d.l(iVar2, 1.0f);
            this.f2791d.l(iVar3, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2789b = i2;
        }
        if (z2) {
            this.f2791d.l(iVar, 1.0f);
            this.f2791d.l(iVar2, -1.0f);
            this.f2791d.l(iVar3, 1.0f);
        } else {
            this.f2791d.l(iVar, -1.0f);
            this.f2791d.l(iVar2, 1.0f);
            this.f2791d.l(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2791d.l(iVar3, 0.5f);
        this.f2791d.l(iVar4, 0.5f);
        this.f2791d.l(iVar, -0.5f);
        this.f2791d.l(iVar2, -0.5f);
        this.f2789b = -f2;
        return this;
    }

    void q() {
        float f2 = this.f2789b;
        if (f2 < 0.0f) {
            this.f2789b = f2 * (-1.0f);
            this.f2791d.j();
        }
    }

    boolean r() {
        i iVar = this.f2788a;
        return iVar != null && (iVar.f2823g == i.a.UNRESTRICTED || this.f2789b >= 0.0f);
    }

    boolean s(i iVar) {
        return this.f2791d.d(iVar);
    }

    public boolean t() {
        return this.f2788a == null && this.f2789b == 0.0f && this.f2791d.f2777a == 0;
    }

    public String toString() {
        return x();
    }

    i u(i iVar) {
        return this.f2791d.g(null, iVar);
    }

    void v(i iVar) {
        i iVar2 = this.f2788a;
        if (iVar2 != null) {
            this.f2791d.l(iVar2, -1.0f);
            this.f2788a = null;
        }
        float fM = this.f2791d.m(iVar, true) * (-1.0f);
        this.f2788a = iVar;
        if (fM == 1.0f) {
            return;
        }
        this.f2789b /= fM;
        this.f2791d.e(fM);
    }

    public void w() {
        this.f2788a = null;
        this.f2791d.c();
        this.f2789b = 0.0f;
        this.f2792e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String x() {
        /*
            r9 = this;
            l.i r0 = r9.f2788a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            l.i r1 = r9.f2788a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f2789b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f2789b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            l.a r5 = r9.f2791d
            int r5 = r5.f2777a
        L57:
            if (r2 >= r5) goto Ld4
            l.a r6 = r9.f2791d
            l.i r6 = r6.h(r2)
            if (r6 != 0) goto L62
            goto Ld1
        L62:
            l.a r7 = r9.f2791d
            float r7 = r7.i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Ld1
        L6d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La4
        L84:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Lad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc6
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld1:
            int r2 = r2 + 1
            goto L57
        Ld4:
            if (r1 != 0) goto Le7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b.x():java.lang.String");
    }
}
