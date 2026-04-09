package p0;

import java.util.ArrayList;
import p0.c;
import p0.e;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d, reason: collision with root package name */
    public final a f44978d;

    /* renamed from: a, reason: collision with root package name */
    public e f44975a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f44976b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f44977c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f44979e = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        boolean a(e eVar);

        void b(e eVar, float f10, boolean z10);

        void c(e eVar, float f10);

        void clear();

        int d();

        float e(e eVar);

        e f(int i);

        void g();

        float h(int i);

        float i(e eVar, boolean z10);

        float j(b bVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    @Override // p0.c.a
    public e a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i) {
        this.f44978d.c(cVar.j(i), 1.0f);
        this.f44978d.c(cVar.j(i), -1.0f);
    }

    public final void c(e eVar, e eVar2, e eVar3, int i) {
        boolean z10 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z10 = true;
            }
            this.f44976b = i;
        }
        if (z10) {
            this.f44978d.c(eVar, 1.0f);
            this.f44978d.c(eVar2, -1.0f);
            this.f44978d.c(eVar3, -1.0f);
        } else {
            this.f44978d.c(eVar, -1.0f);
            this.f44978d.c(eVar2, 1.0f);
            this.f44978d.c(eVar3, 1.0f);
        }
    }

    public final void d(e eVar, e eVar2, e eVar3, int i) {
        boolean z10 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z10 = true;
            }
            this.f44976b = i;
        }
        if (z10) {
            this.f44978d.c(eVar, 1.0f);
            this.f44978d.c(eVar2, -1.0f);
            this.f44978d.c(eVar3, 1.0f);
        } else {
            this.f44978d.c(eVar, -1.0f);
            this.f44978d.c(eVar2, 1.0f);
            this.f44978d.c(eVar3, -1.0f);
        }
    }

    public boolean e() {
        return this.f44975a == null && this.f44976b == 0.0f && this.f44978d.d() == 0;
    }

    public final e f(boolean[] zArr, e eVar) {
        e.a aVar;
        int iD = this.f44978d.d();
        e eVar2 = null;
        float f10 = 0.0f;
        for (int i = 0; i < iD; i++) {
            float fH = this.f44978d.h(i);
            if (fH < 0.0f) {
                e eVarF = this.f44978d.f(i);
                if ((zArr == null || !zArr[eVarF.f45002c]) && eVarF != eVar && (((aVar = eVarF.f45008j) == e.a.SLACK || aVar == e.a.ERROR) && fH < f10)) {
                    f10 = fH;
                    eVar2 = eVarF;
                }
            }
        }
        return eVar2;
    }

    public final void g(e eVar) {
        e eVar2 = this.f44975a;
        if (eVar2 != null) {
            this.f44978d.c(eVar2, -1.0f);
            this.f44975a.f45003d = -1;
            this.f44975a = null;
        }
        float fI = this.f44978d.i(eVar, true) * (-1.0f);
        this.f44975a = eVar;
        if (fI == 1.0f) {
            return;
        }
        this.f44976b /= fI;
        this.f44978d.k(fI);
    }

    public final void h(c cVar, e eVar, boolean z10) {
        if (eVar == null || !eVar.f45006g) {
            return;
        }
        float fE = this.f44978d.e(eVar);
        this.f44976b = (eVar.f45005f * fE) + this.f44976b;
        this.f44978d.i(eVar, z10);
        if (z10) {
            eVar.b(this);
        }
        if (this.f44978d.d() == 0) {
            this.f44979e = true;
            cVar.f44982a = true;
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float fJ = this.f44978d.j(bVar, z10);
        this.f44976b = (bVar.f44976b * fJ) + this.f44976b;
        if (z10) {
            bVar.f44975a.b(this);
        }
        if (this.f44975a == null || this.f44978d.d() != 0) {
            return;
        }
        this.f44979e = true;
        cVar.f44982a = true;
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
            p0.e r0 = r10.f44975a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            p0.e r1 = r10.f44975a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = N7.G8.s(r0, r1)
            float r1 = r10.f44976b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = N7.G8.u(r0)
            float r1 = r10.f44976b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            p0.b$a r5 = r10.f44978d
            int r5 = r5.d()
        L3c:
            if (r4 >= r5) goto L9c
            p0.b$a r6 = r10.f44978d
            p0.e r6 = r6.f(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            p0.b$a r7 = r10.f44978d
            float r7 = r7.h(r4)
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
            java.lang.String r0 = N7.G8.s(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = N7.G8.s(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = N7.G8.s(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = N7.G8.s(r0, r6)
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
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = N7.G8.s(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.toString():java.lang.String");
    }

    public b(N5.c cVar) {
        this.f44978d = new C5439a(this, cVar);
    }
}
