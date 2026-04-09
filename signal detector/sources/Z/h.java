package z;

import java.util.ArrayList;
import x.AbstractC2984e;
import x.C2981b;
import x.C2982c;
import x.C2985f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f24430q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f24431r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f24432s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f24433t0 = this.f24301J;

    /* renamed from: u0, reason: collision with root package name */
    public int f24434u0 = 0;
    public boolean v0;

    public h() {
        this.f24308R.clear();
        this.f24308R.add(this.f24433t0);
        int length = this.f24307Q.length;
        for (int i = 0; i < length; i++) {
            this.f24307Q[i] = this.f24433t0;
        }
    }

    @Override // z.d
    public final boolean A() {
        return this.v0;
    }

    @Override // z.d
    public final boolean B() {
        return this.v0;
    }

    @Override // z.d
    public final void Q(C2982c c2982c, boolean z6) {
        if (this.f24310T == null) {
            return;
        }
        c cVar = this.f24433t0;
        c2982c.getClass();
        int iN = C2982c.n(cVar);
        if (this.f24434u0 == 1) {
            this.f24315Y = iN;
            this.f24316Z = 0;
            L(this.f24310T.k());
            O(0);
            return;
        }
        this.f24315Y = 0;
        this.f24316Z = iN;
        O(this.f24310T.q());
        L(0);
    }

    public final void R(int i) {
        this.f24433t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.f24434u0 == i) {
            return;
        }
        this.f24434u0 = i;
        ArrayList arrayList = this.f24308R;
        arrayList.clear();
        if (this.f24434u0 == 1) {
            this.f24433t0 = this.f24300I;
        } else {
            this.f24433t0 = this.f24301J;
        }
        arrayList.add(this.f24433t0);
        c[] cVarArr = this.f24307Q;
        int length = cVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            cVarArr[i3] = this.f24433t0;
        }
    }

    @Override // z.d
    public final void b(C2982c c2982c, boolean z6) {
        e eVar = (e) this.f24310T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.f24310T;
        boolean z7 = dVar != null && dVar.f24346p0[0] == 2;
        if (this.f24434u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.f24310T;
            z7 = dVar2 != null && dVar2.f24346p0[1] == 2;
        }
        if (this.v0) {
            c cVar = this.f24433t0;
            if (cVar.f24286c) {
                C2985f c2985fK = c2982c.k(cVar);
                c2982c.d(c2985fK, this.f24433t0.d());
                if (this.f24431r0 != -1) {
                    if (z7) {
                        c2982c.f(c2982c.k(objI2), c2985fK, 0, 5);
                    }
                } else if (this.f24432s0 != -1 && z7) {
                    C2985f c2985fK2 = c2982c.k(objI2);
                    c2982c.f(c2985fK, c2982c.k(objI), 0, 5);
                    c2982c.f(c2985fK2, c2985fK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.f24431r0 != -1) {
            C2985f c2985fK3 = c2982c.k(this.f24433t0);
            c2982c.e(c2985fK3, c2982c.k(objI), this.f24431r0, 8);
            if (z7) {
                c2982c.f(c2982c.k(objI2), c2985fK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f24432s0 != -1) {
            C2985f c2985fK4 = c2982c.k(this.f24433t0);
            C2985f c2985fK5 = c2982c.k(objI2);
            c2982c.e(c2985fK4, c2985fK5, -this.f24432s0, 8);
            if (z7) {
                c2982c.f(c2985fK4, c2982c.k(objI), 0, 5);
                c2982c.f(c2985fK5, c2985fK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f24430q0 != -1.0f) {
            C2985f c2985fK6 = c2982c.k(this.f24433t0);
            C2985f c2985fK7 = c2982c.k(objI2);
            float f2 = this.f24430q0;
            C2981b c2981bL = c2982c.l();
            c2981bL.f23998d.g(c2985fK6, -1.0f);
            c2981bL.f23998d.g(c2985fK7, f2);
            c2982c.c(c2981bL);
        }
    }

    @Override // z.d
    public final boolean c() {
        return true;
    }

    @Override // z.d
    public final c i(int i) {
        int iC = AbstractC2984e.c(i);
        if (iC != 1) {
            if (iC != 2) {
                if (iC != 3) {
                    if (iC != 4) {
                        return null;
                    }
                }
            }
            if (this.f24434u0 == 0) {
                return this.f24433t0;
            }
            return null;
        }
        if (this.f24434u0 == 1) {
            return this.f24433t0;
        }
        return null;
    }
}
