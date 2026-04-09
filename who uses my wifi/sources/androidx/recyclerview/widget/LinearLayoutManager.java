package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ef;
import defpackage.ex0;
import defpackage.go0;
import defpackage.ho0;
import defpackage.io0;
import defpackage.no0;
import defpackage.nr;
import defpackage.r60;
import defpackage.s60;
import defpackage.so0;
import defpackage.t60;
import defpackage.to0;
import defpackage.u60;
import defpackage.w60;
import defpackage.yb;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class LinearLayoutManager extends ho0 implements so0 {
    public final r60 A;
    public final s60 B;
    public final int C;
    public final int[] D;
    public int p;
    public t60 q;
    public nr r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public u60 z;

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new r60();
        this.B = new s60();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    @Override // defpackage.ho0
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(to0 to0Var, int[] iArr) {
        int i;
        int iL = to0Var.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void C0(to0 to0Var, t60 t60Var, ef efVar) {
        int i = t60Var.d;
        if (i < 0 || i >= to0Var.b()) {
            return;
        }
        efVar.b(i, Math.max(0, t60Var.g));
    }

    public final int D0(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        nr nrVar = this.r;
        boolean z = !this.w;
        return yb.f(to0Var, nrVar, K0(z), J0(z), this, this.w);
    }

    public final int E0(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        nr nrVar = this.r;
        boolean z = !this.w;
        return yb.g(to0Var, nrVar, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(to0 to0Var) {
        if (v() == 0) {
            return 0;
        }
        H0();
        nr nrVar = this.r;
        boolean z = !this.w;
        return yb.h(to0Var, nrVar, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && T0()) ? -1 : 1 : (this.p != 1 && T0()) ? 1 : -1;
    }

    public final void H0() {
        if (this.q == null) {
            t60 t60Var = new t60();
            t60Var.a = true;
            t60Var.h = 0;
            t60Var.i = 0;
            t60Var.k = null;
            this.q = t60Var;
        }
    }

    public final int I0(no0 no0Var, t60 t60Var, to0 to0Var, boolean z) {
        int i;
        int i2 = t60Var.c;
        int i3 = t60Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                t60Var.g = i3 + i2;
            }
            W0(no0Var, t60Var);
        }
        int i4 = t60Var.c + t60Var.h;
        while (true) {
            if ((!t60Var.l && i4 <= 0) || (i = t60Var.d) < 0 || i >= to0Var.b()) {
                break;
            }
            s60 s60Var = this.B;
            s60Var.a = 0;
            s60Var.b = false;
            s60Var.c = false;
            s60Var.d = false;
            U0(no0Var, to0Var, t60Var, s60Var);
            if (!s60Var.b) {
                int i5 = t60Var.b;
                int i6 = s60Var.a;
                t60Var.b = (t60Var.f * i6) + i5;
                if (!s60Var.c || t60Var.k != null || !to0Var.g) {
                    t60Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = t60Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    t60Var.g = i8;
                    int i9 = t60Var.c;
                    if (i9 < 0) {
                        t60Var.g = i8 + i9;
                    }
                    W0(no0Var, t60Var);
                }
                if (z && s60Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - t60Var.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, v(), z) : N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, -1, z) : N0(0, v(), z);
    }

    @Override // defpackage.ho0
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View viewN0 = N0(v() - 1, -1, false);
        if (viewN0 == null) {
            return -1;
        }
        return ho0.H(viewN0);
    }

    public final View M0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.f(i, i2, i3, i4) : this.d.f(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.f(i, i2, i3, 320) : this.d.f(i, i2, i3, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View O0(defpackage.no0 r17, defpackage.to0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.H0()
            int r1 = r0.v()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.v()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            nr r7 = r0.r
            int r7 = r7.k()
            nr r8 = r0.r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = defpackage.ho0.H(r12)
            nr r14 = r0.r
            int r14 = r14.e(r12)
            nr r15 = r0.r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            io0 r13 = (defpackage.io0) r13
            wo0 r13 = r13.a
            boolean r13 = r13.h()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.O0(no0, to0, boolean, boolean):android.view.View");
    }

    public final int P0(int i, no0 no0Var, to0 to0Var, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-iG2, no0Var, to0Var);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(iG);
        return iG + i2;
    }

    public final int Q0(int i, no0 no0Var, to0 to0Var, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -Z0(iK2, no0Var, to0Var);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-iK);
        return i2 - iK;
    }

    public final View R0() {
        return u(this.u ? 0 : v() - 1);
    }

    public final View S0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.ho0
    public View T(View view, int i, no0 no0Var, to0 to0Var) {
        int iG0;
        Y0();
        if (v() != 0 && (iG0 = G0(i)) != Integer.MIN_VALUE) {
            H0();
            c1(iG0, (int) (this.r.l() * 0.33333334f), false, to0Var);
            t60 t60Var = this.q;
            t60Var.g = Integer.MIN_VALUE;
            t60Var.a = false;
            I0(no0Var, t60Var, to0Var, true);
            View viewM0 = iG0 == -1 ? this.u ? M0(v() - 1, -1) : M0(0, v()) : this.u ? M0(0, v()) : M0(v() - 1, -1);
            View viewS0 = iG0 == -1 ? S0() : R0();
            if (!viewS0.hasFocusable()) {
                return viewM0;
            }
            if (viewM0 != null) {
                return viewS0;
            }
        }
        return null;
    }

    public final boolean T0() {
        return C() == 1;
    }

    @Override // defpackage.ho0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View viewN0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(viewN0 == null ? -1 : ho0.H(viewN0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public void U0(no0 no0Var, to0 to0Var, t60 t60Var, s60 s60Var) {
        int iE;
        int i;
        int i2;
        int iD;
        View viewB = t60Var.b(no0Var);
        if (viewB == null) {
            s60Var.b = true;
            return;
        }
        io0 io0Var = (io0) viewB.getLayoutParams();
        if (t60Var.k == null) {
            if (this.u == (t60Var.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.u == (t60Var.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        io0 io0Var2 = (io0) viewB.getLayoutParams();
        Rect rectJ = this.b.J(viewB);
        int i3 = rectJ.left + rectJ.right;
        int i4 = rectJ.top + rectJ.bottom;
        int iW = ho0.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) io0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) io0Var2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) io0Var2).width);
        int iW2 = ho0.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) io0Var2).topMargin + ((ViewGroup.MarginLayoutParams) io0Var2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) io0Var2).height);
        if (v0(viewB, iW, iW2, io0Var2)) {
            viewB.measure(iW, iW2);
        }
        s60Var.a = this.r.c(viewB);
        if (this.p == 1) {
            if (T0()) {
                iD = this.n - F();
                iE = iD - this.r.d(viewB);
            } else {
                iE = E();
                iD = this.r.d(viewB) + iE;
            }
            if (t60Var.f == -1) {
                i = t60Var.b;
                i2 = i - s60Var.a;
            } else {
                i2 = t60Var.b;
                i = s60Var.a + i2;
            }
        } else {
            int iG = G();
            int iD2 = this.r.d(viewB) + iG;
            if (t60Var.f == -1) {
                int i5 = t60Var.b;
                int i6 = i5 - s60Var.a;
                iD = i5;
                i = iD2;
                iE = i6;
                i2 = iG;
            } else {
                int i7 = t60Var.b;
                int i8 = s60Var.a + i7;
                iE = i7;
                i = iD2;
                i2 = iG;
                iD = i8;
            }
        }
        ho0.N(viewB, iE, i2, iD, i);
        if (io0Var.a.h() || io0Var.a.k()) {
            s60Var.c = true;
        }
        s60Var.d = viewB.hasFocusable();
    }

    public final void W0(no0 no0Var, t60 t60Var) {
        if (!t60Var.a || t60Var.l) {
            return;
        }
        int i = t60Var.g;
        int i2 = t60Var.i;
        if (t60Var.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.n(viewU) < iF) {
                        X0(no0Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.n(viewU2) < iF) {
                    X0(no0Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.m(viewU3) > i6) {
                    X0(no0Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.m(viewU4) > i6) {
                X0(no0Var, i8, i9);
                return;
            }
        }
    }

    public final void X0(no0 no0Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                k0(i);
                no0Var.g(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            k0(i3);
            no0Var.g(viewU2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, no0 no0Var, to0 to0Var) {
        if (v() != 0 && i != 0) {
            H0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            c1(i2, iAbs, true, to0Var);
            t60 t60Var = this.q;
            int iI0 = I0(no0Var, t60Var, to0Var, false) + t60Var.g;
            if (iI0 >= 0) {
                if (iAbs > iI0) {
                    i = i2 * iI0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.so0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < ho0.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ex0.f("invalid orientation:", i));
        }
        c(null);
        if (i != this.p || this.r == null) {
            nr nrVarA = nr.a(this, i);
            this.r = nrVarA;
            this.A.f = nrVarA;
            this.p = i;
            m0();
        }
    }

    public void b1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        m0();
    }

    @Override // defpackage.ho0
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // defpackage.ho0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c0(defpackage.no0 r18, defpackage.to0 r19) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c0(no0, to0):void");
    }

    public final void c1(int i, int i2, boolean z, to0 to0Var) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(to0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        t60 t60Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        t60Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        t60Var.i = iMax;
        if (z2) {
            t60Var.h = this.r.h() + i3;
            View viewR0 = R0();
            t60 t60Var2 = this.q;
            t60Var2.e = this.u ? -1 : 1;
            int iH = ho0.H(viewR0);
            t60 t60Var3 = this.q;
            t60Var2.d = iH + t60Var3.e;
            t60Var3.b = this.r.b(viewR0);
            iK = this.r.b(viewR0) - this.r.g();
        } else {
            View viewS0 = S0();
            t60 t60Var4 = this.q;
            t60Var4.h = this.r.k() + t60Var4.h;
            t60 t60Var5 = this.q;
            t60Var5.e = this.u ? 1 : -1;
            int iH2 = ho0.H(viewS0);
            t60 t60Var6 = this.q;
            t60Var5.d = iH2 + t60Var6.e;
            t60Var6.b = this.r.e(viewS0);
            iK = (-this.r.e(viewS0)) + this.r.k();
        }
        t60 t60Var7 = this.q;
        t60Var7.c = i2;
        if (z) {
            t60Var7.c = i2 - iK;
        }
        t60Var7.g = iK;
    }

    @Override // defpackage.ho0
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.ho0
    public void d0(to0 to0Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        t60 t60Var = this.q;
        t60Var.e = this.u ? -1 : 1;
        t60Var.d = i;
        t60Var.f = 1;
        t60Var.b = i2;
        t60Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.ho0
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.ho0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof u60) {
            u60 u60Var = (u60) parcelable;
            this.z = u60Var;
            if (this.x != -1) {
                u60Var.f = -1;
            }
            m0();
        }
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        t60 t60Var = this.q;
        t60Var.d = i;
        t60Var.e = this.u ? 1 : -1;
        t60Var.f = -1;
        t60Var.b = i2;
        t60Var.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.ho0
    public final Parcelable f0() {
        u60 u60Var = this.z;
        if (u60Var != null) {
            u60 u60Var2 = new u60();
            u60Var2.f = u60Var.f;
            u60Var2.g = u60Var.g;
            u60Var2.h = u60Var.h;
            return u60Var2;
        }
        u60 u60Var3 = new u60();
        if (v() <= 0) {
            u60Var3.f = -1;
            return u60Var3;
        }
        H0();
        boolean z = this.s ^ this.u;
        u60Var3.h = z;
        if (z) {
            View viewR0 = R0();
            u60Var3.g = this.r.g() - this.r.b(viewR0);
            u60Var3.f = ho0.H(viewR0);
            return u60Var3;
        }
        View viewS0 = S0();
        u60Var3.f = ho0.H(viewS0);
        u60Var3.g = this.r.e(viewS0) - this.r.k();
        return u60Var3;
    }

    @Override // defpackage.ho0
    public final void h(int i, int i2, to0 to0Var, ef efVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, to0Var);
        C0(to0Var, this.q, efVar);
    }

    @Override // defpackage.ho0
    public final void i(int i, ef efVar) {
        boolean z;
        int i2;
        u60 u60Var = this.z;
        if (u60Var == null || (i2 = u60Var.f) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = u60Var.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            efVar.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.ho0
    public final int j(to0 to0Var) {
        return D0(to0Var);
    }

    @Override // defpackage.ho0
    public int k(to0 to0Var) {
        return E0(to0Var);
    }

    @Override // defpackage.ho0
    public int l(to0 to0Var) {
        return F0(to0Var);
    }

    @Override // defpackage.ho0
    public final int m(to0 to0Var) {
        return D0(to0Var);
    }

    @Override // defpackage.ho0
    public int n(to0 to0Var) {
        return E0(to0Var);
    }

    @Override // defpackage.ho0
    public int n0(int i, no0 no0Var, to0 to0Var) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, no0Var, to0Var);
    }

    @Override // defpackage.ho0
    public int o(to0 to0Var) {
        return F0(to0Var);
    }

    @Override // defpackage.ho0
    public final void o0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        u60 u60Var = this.z;
        if (u60Var != null) {
            u60Var.f = -1;
        }
        m0();
    }

    @Override // defpackage.ho0
    public int p0(int i, no0 no0Var, to0 to0Var) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, no0Var, to0Var);
    }

    @Override // defpackage.ho0
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i - ho0.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (ho0.H(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.ho0
    public io0 r() {
        return new io0(-2, -2);
    }

    @Override // defpackage.ho0
    public final boolean w0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ho0
    public void y0(RecyclerView recyclerView, int i) {
        w60 w60Var = new w60(recyclerView.getContext());
        w60Var.a = i;
        z0(w60Var);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new r60();
        this.B = new s60();
        this.C = 2;
        this.D = new int[2];
        go0 go0VarI = ho0.I(context, attributeSet, i, i2);
        a1(go0VarI.a);
        boolean z = go0VarI.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(go0VarI.d);
    }

    @Override // defpackage.ho0
    public final void S(RecyclerView recyclerView) {
    }

    public void V0(no0 no0Var, to0 to0Var, r60 r60Var, int i) {
    }
}
