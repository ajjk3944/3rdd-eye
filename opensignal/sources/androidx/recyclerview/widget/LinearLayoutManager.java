package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.l;
import h7.c0;
import h7.d0;
import h7.e0;
import h7.f1;
import h7.i1;
import h7.j0;
import h7.j1;
import h7.t;
import h7.x0;
import h7.y0;
import h7.z0;
import ma.v;

/* loaded from: classes.dex */
public class LinearLayoutManager extends y0 implements i1 {
    public final v A;
    public final c0 B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f2036p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f2037q;

    /* renamed from: r, reason: collision with root package name */
    public j0 f2038r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2039s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2040t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2041u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2042v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2043w;

    /* renamed from: x, reason: collision with root package name */
    public int f2044x;

    /* renamed from: y, reason: collision with root package name */
    public int f2045y;

    /* renamed from: z, reason: collision with root package name */
    public SavedState f2046z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f2047a;

        /* renamed from: d, reason: collision with root package name */
        public int f2048d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2049g;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2047a);
            parcel.writeInt(this.f2048d);
            parcel.writeInt(this.f2049g ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // h7.y0
    public void A0(RecyclerView recyclerView, int i10) {
        e0 e0Var = new e0(recyclerView.getContext());
        e0Var.f10038a = i10;
        B0(e0Var);
    }

    @Override // h7.y0
    public boolean C0() {
        return this.f2046z == null && this.f2039s == this.f2042v;
    }

    public void D0(j1 j1Var, int[] iArr) {
        int i10;
        int iL = j1Var.f10101a != -1 ? this.f2038r.l() : 0;
        if (this.f2037q.f10027f == -1) {
            i10 = 0;
        } else {
            i10 = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i10;
    }

    public void E0(j1 j1Var, d0 d0Var, l lVar) {
        int i10 = d0Var.f10025d;
        if (i10 < 0 || i10 >= j1Var.b()) {
            return;
        }
        lVar.b(i10, Math.max(0, d0Var.f10028g));
    }

    public final int F0(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        j0 j0Var = this.f2038r;
        boolean z10 = !this.f2043w;
        return t.a(j1Var, j0Var, M0(z10), L0(z10), this, this.f2043w);
    }

    public final int G0(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        j0 j0Var = this.f2038r;
        boolean z10 = !this.f2043w;
        return t.b(j1Var, j0Var, M0(z10), L0(z10), this, this.f2043w, this.f2041u);
    }

    public final int H0(j1 j1Var) {
        if (v() == 0) {
            return 0;
        }
        J0();
        j0 j0Var = this.f2038r;
        boolean z10 = !this.f2043w;
        return t.c(j1Var, j0Var, M0(z10), L0(z10), this, this.f2043w);
    }

    public final int I0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f2036p == 1) ? 1 : Integer.MIN_VALUE : this.f2036p == 0 ? 1 : Integer.MIN_VALUE : this.f2036p == 1 ? -1 : Integer.MIN_VALUE : this.f2036p == 0 ? -1 : Integer.MIN_VALUE : (this.f2036p != 1 && W0()) ? -1 : 1 : (this.f2036p != 1 && W0()) ? 1 : -1;
    }

    public final void J0() {
        if (this.f2037q == null) {
            d0 d0Var = new d0();
            d0Var.f10022a = true;
            d0Var.f10029h = 0;
            d0Var.f10030i = 0;
            d0Var.k = null;
            this.f2037q = d0Var;
        }
    }

    public final int K0(f1 f1Var, d0 d0Var, j1 j1Var, boolean z10) {
        int i10;
        int i11 = d0Var.f10024c;
        int i12 = d0Var.f10028g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                d0Var.f10028g = i12 + i11;
            }
            Z0(f1Var, d0Var);
        }
        int i13 = d0Var.f10024c + d0Var.f10029h;
        while (true) {
            if ((!d0Var.f10031l && i13 <= 0) || (i10 = d0Var.f10025d) < 0 || i10 >= j1Var.b()) {
                break;
            }
            c0 c0Var = this.B;
            c0Var.f10018a = 0;
            c0Var.f10019b = false;
            c0Var.f10020c = false;
            c0Var.f10021d = false;
            X0(f1Var, j1Var, d0Var, c0Var);
            if (!c0Var.f10019b) {
                int i14 = d0Var.f10023b;
                int i15 = c0Var.f10018a;
                d0Var.f10023b = (d0Var.f10027f * i15) + i14;
                if (!c0Var.f10020c || d0Var.k != null || !j1Var.f10107g) {
                    d0Var.f10024c -= i15;
                    i13 -= i15;
                }
                int i16 = d0Var.f10028g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    d0Var.f10028g = i17;
                    int i18 = d0Var.f10024c;
                    if (i18 < 0) {
                        d0Var.f10028g = i17 + i18;
                    }
                    Z0(f1Var, d0Var);
                }
                if (z10 && c0Var.f10021d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - d0Var.f10024c;
    }

    @Override // h7.y0
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z10) {
        return this.f2041u ? Q0(0, z10, v()) : Q0(v() - 1, z10, -1);
    }

    public final View M0(boolean z10) {
        return this.f2041u ? Q0(v() - 1, z10, -1) : Q0(0, z10, v());
    }

    public final int N0() {
        View viewQ0 = Q0(0, false, v());
        if (viewQ0 == null) {
            return -1;
        }
        return y0.H(viewQ0);
    }

    public final int O0() {
        View viewQ0 = Q0(v() - 1, false, -1);
        if (viewQ0 == null) {
            return -1;
        }
        return y0.H(viewQ0);
    }

    public final View P0(int i10, int i11) {
        int i12;
        int i13;
        J0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f2038r.e(u(i10)) < this.f2038r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f2036p == 0 ? this.f10275c.h(i10, i11, i12, i13) : this.f10276d.h(i10, i11, i12, i13);
    }

    public final View Q0(int i10, boolean z10, int i11) {
        J0();
        int i12 = z10 ? 24579 : 320;
        return this.f2036p == 0 ? this.f10275c.h(i10, i11, i12, 320) : this.f10276d.h(i10, i11, i12, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View R0(h7.f1 r17, h7.j1 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.J0()
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
            h7.j0 r7 = r0.f2038r
            int r7 = r7.k()
            h7.j0 r8 = r0.f2038r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.u(r1)
            int r13 = h7.y0.H(r12)
            h7.j0 r14 = r0.f2038r
            int r14 = r14.e(r12)
            h7.j0 r15 = r0.f2038r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            h7.z0 r13 = (h7.z0) r13
            h7.n1 r13 = r13.f10292a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.R0(h7.f1, h7.j1, boolean, boolean):android.view.View");
    }

    public final int S0(int i10, f1 f1Var, j1 j1Var, boolean z10) {
        int iG;
        int iG2 = this.f2038r.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -c1(-iG2, f1Var, j1Var);
        int i12 = i10 + i11;
        if (!z10 || (iG = this.f2038r.g() - i12) <= 0) {
            return i11;
        }
        this.f2038r.o(iG);
        return iG + i11;
    }

    @Override // h7.y0
    public View T(View view, int i10, f1 f1Var, j1 j1Var) {
        int iI0;
        b1();
        if (v() != 0 && (iI0 = I0(i10)) != Integer.MIN_VALUE) {
            J0();
            f1(iI0, (int) (this.f2038r.l() * 0.33333334f), false, j1Var);
            d0 d0Var = this.f2037q;
            d0Var.f10028g = Integer.MIN_VALUE;
            d0Var.f10022a = false;
            K0(f1Var, d0Var, j1Var, true);
            View viewP0 = iI0 == -1 ? this.f2041u ? P0(v() - 1, -1) : P0(0, v()) : this.f2041u ? P0(0, v()) : P0(v() - 1, -1);
            View viewV0 = iI0 == -1 ? V0() : U0();
            if (!viewV0.hasFocusable()) {
                return viewP0;
            }
            if (viewP0 != null) {
                return viewV0;
            }
        }
        return null;
    }

    public final int T0(int i10, f1 f1Var, j1 j1Var, boolean z10) {
        int iK;
        int iK2 = i10 - this.f2038r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -c1(iK2, f1Var, j1Var);
        int i12 = i10 + i11;
        if (!z10 || (iK = i12 - this.f2038r.k()) <= 0) {
            return i11;
        }
        this.f2038r.o(-iK);
        return i11 - iK;
    }

    @Override // h7.y0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(N0());
            accessibilityEvent.setToIndex(O0());
        }
    }

    public final View U0() {
        return u(this.f2041u ? 0 : v() - 1);
    }

    public final View V0() {
        return u(this.f2041u ? v() - 1 : 0);
    }

    public final boolean W0() {
        return C() == 1;
    }

    public void X0(f1 f1Var, j1 j1Var, d0 d0Var, c0 c0Var) {
        int iE;
        int i10;
        int i11;
        int iD;
        View viewB = d0Var.b(f1Var);
        if (viewB == null) {
            c0Var.f10019b = true;
            return;
        }
        z0 z0Var = (z0) viewB.getLayoutParams();
        if (d0Var.k == null) {
            if (this.f2041u == (d0Var.f10027f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f2041u == (d0Var.f10027f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        z0 z0Var2 = (z0) viewB.getLayoutParams();
        Rect rectO = this.f10274b.O(viewB);
        int i12 = rectO.left + rectO.right;
        int i13 = rectO.top + rectO.bottom;
        int iW = y0.w(d(), this.f10284n, this.f10282l, F() + E() + ((ViewGroup.MarginLayoutParams) z0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) z0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) z0Var2).width);
        int iW2 = y0.w(e(), this.f10285o, this.f10283m, D() + G() + ((ViewGroup.MarginLayoutParams) z0Var2).topMargin + ((ViewGroup.MarginLayoutParams) z0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) z0Var2).height);
        if (x0(viewB, iW, iW2, z0Var2)) {
            viewB.measure(iW, iW2);
        }
        c0Var.f10018a = this.f2038r.c(viewB);
        if (this.f2036p == 1) {
            if (W0()) {
                iD = this.f10284n - F();
                iE = iD - this.f2038r.d(viewB);
            } else {
                iE = E();
                iD = this.f2038r.d(viewB) + iE;
            }
            if (d0Var.f10027f == -1) {
                i10 = d0Var.f10023b;
                i11 = i10 - c0Var.f10018a;
            } else {
                i11 = d0Var.f10023b;
                i10 = c0Var.f10018a + i11;
            }
        } else {
            int iG = G();
            int iD2 = this.f2038r.d(viewB) + iG;
            if (d0Var.f10027f == -1) {
                int i14 = d0Var.f10023b;
                int i15 = i14 - c0Var.f10018a;
                iD = i14;
                i10 = iD2;
                iE = i15;
                i11 = iG;
            } else {
                int i16 = d0Var.f10023b;
                int i17 = c0Var.f10018a + i16;
                iE = i16;
                i10 = iD2;
                i11 = iG;
                iD = i17;
            }
        }
        y0.N(viewB, iE, i11, iD, i10);
        if (z0Var.f10292a.h() || z0Var.f10292a.k()) {
            c0Var.f10020c = true;
        }
        c0Var.f10021d = viewB.hasFocusable();
    }

    public final void Z0(f1 f1Var, d0 d0Var) {
        if (!d0Var.f10022a || d0Var.f10031l) {
            return;
        }
        int i10 = d0Var.f10028g;
        int i11 = d0Var.f10030i;
        if (d0Var.f10027f == -1) {
            int iV = v();
            if (i10 < 0) {
                return;
            }
            int iF = (this.f2038r.f() - i10) + i11;
            if (this.f2041u) {
                for (int i12 = 0; i12 < iV; i12++) {
                    View viewU = u(i12);
                    if (this.f2038r.e(viewU) < iF || this.f2038r.n(viewU) < iF) {
                        a1(f1Var, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iV - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewU2 = u(i14);
                if (this.f2038r.e(viewU2) < iF || this.f2038r.n(viewU2) < iF) {
                    a1(f1Var, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iV2 = v();
        if (!this.f2041u) {
            for (int i16 = 0; i16 < iV2; i16++) {
                View viewU3 = u(i16);
                if (this.f2038r.b(viewU3) > i15 || this.f2038r.m(viewU3) > i15) {
                    a1(f1Var, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iV2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewU4 = u(i18);
            if (this.f2038r.b(viewU4) > i15 || this.f2038r.m(viewU4) > i15) {
                a1(f1Var, i17, i18);
                return;
            }
        }
    }

    @Override // h7.i1
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < y0.H(u(0))) != this.f2041u ? -1 : 1;
        return this.f2036p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final void a1(f1 f1Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                m0(i10);
                f1Var.i(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            m0(i12);
            f1Var.i(viewU2);
        }
    }

    public final void b1() {
        if (this.f2036p == 1 || !W0()) {
            this.f2041u = this.f2040t;
        } else {
            this.f2041u = !this.f2040t;
        }
    }

    @Override // h7.y0
    public final void c(String str) {
        if (this.f2046z == null) {
            super.c(str);
        }
    }

    public final int c1(int i10, f1 f1Var, j1 j1Var) {
        if (v() != 0 && i10 != 0) {
            J0();
            this.f2037q.f10022a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            f1(i11, iAbs, true, j1Var);
            d0 d0Var = this.f2037q;
            int iK0 = K0(f1Var, d0Var, j1Var, false) + d0Var.f10028g;
            if (iK0 >= 0) {
                if (iAbs > iK0) {
                    i10 = i11 * iK0;
                }
                this.f2038r.o(-i10);
                this.f2037q.j = i10;
                return i10;
            }
        }
        return 0;
    }

    @Override // h7.y0
    public final boolean d() {
        return this.f2036p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // h7.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d0(h7.f1 r18, h7.j1 r19) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.d0(h7.f1, h7.j1):void");
    }

    public final void d1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(h0.b.h(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f2036p || this.f2038r == null) {
            j0 j0VarA = j0.a(this, i10);
            this.f2038r = j0VarA;
            this.A.f16625e = j0VarA;
            this.f2036p = i10;
            o0();
        }
    }

    @Override // h7.y0
    public final boolean e() {
        return this.f2036p == 1;
    }

    @Override // h7.y0
    public void e0(j1 j1Var) {
        this.f2046z = null;
        this.f2044x = -1;
        this.f2045y = Integer.MIN_VALUE;
        this.A.f();
    }

    public void e1(boolean z10) {
        c(null);
        if (this.f2042v == z10) {
            return;
        }
        this.f2042v = z10;
        o0();
    }

    @Override // h7.y0
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f2046z = savedState;
            if (this.f2044x != -1) {
                savedState.f2047a = -1;
            }
            o0();
        }
    }

    public final void f1(int i10, int i11, boolean z10, j1 j1Var) {
        int iK;
        this.f2037q.f10031l = this.f2038r.i() == 0 && this.f2038r.f() == 0;
        this.f2037q.f10027f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(j1Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        d0 d0Var = this.f2037q;
        int i12 = z11 ? iMax2 : iMax;
        d0Var.f10029h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        d0Var.f10030i = iMax;
        if (z11) {
            d0Var.f10029h = this.f2038r.h() + i12;
            View viewU0 = U0();
            d0 d0Var2 = this.f2037q;
            d0Var2.f10026e = this.f2041u ? -1 : 1;
            int iH = y0.H(viewU0);
            d0 d0Var3 = this.f2037q;
            d0Var2.f10025d = iH + d0Var3.f10026e;
            d0Var3.f10023b = this.f2038r.b(viewU0);
            iK = this.f2038r.b(viewU0) - this.f2038r.g();
        } else {
            View viewV0 = V0();
            d0 d0Var4 = this.f2037q;
            d0Var4.f10029h = this.f2038r.k() + d0Var4.f10029h;
            d0 d0Var5 = this.f2037q;
            d0Var5.f10026e = this.f2041u ? 1 : -1;
            int iH2 = y0.H(viewV0);
            d0 d0Var6 = this.f2037q;
            d0Var5.f10025d = iH2 + d0Var6.f10026e;
            d0Var6.f10023b = this.f2038r.e(viewV0);
            iK = (-this.f2038r.e(viewV0)) + this.f2038r.k();
        }
        d0 d0Var7 = this.f2037q;
        d0Var7.f10024c = i11;
        if (z10) {
            d0Var7.f10024c = i11 - iK;
        }
        d0Var7.f10028g = iK;
    }

    @Override // h7.y0
    public final Parcelable g0() {
        SavedState savedState = this.f2046z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f2047a = savedState.f2047a;
            savedState2.f2048d = savedState.f2048d;
            savedState2.f2049g = savedState.f2049g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (v() <= 0) {
            savedState3.f2047a = -1;
            return savedState3;
        }
        J0();
        boolean z10 = this.f2039s ^ this.f2041u;
        savedState3.f2049g = z10;
        if (z10) {
            View viewU0 = U0();
            savedState3.f2048d = this.f2038r.g() - this.f2038r.b(viewU0);
            savedState3.f2047a = y0.H(viewU0);
            return savedState3;
        }
        View viewV0 = V0();
        savedState3.f2047a = y0.H(viewV0);
        savedState3.f2048d = this.f2038r.e(viewV0) - this.f2038r.k();
        return savedState3;
    }

    public final void g1(int i10, int i11) {
        this.f2037q.f10024c = this.f2038r.g() - i11;
        d0 d0Var = this.f2037q;
        d0Var.f10026e = this.f2041u ? -1 : 1;
        d0Var.f10025d = i10;
        d0Var.f10027f = 1;
        d0Var.f10023b = i11;
        d0Var.f10028g = Integer.MIN_VALUE;
    }

    @Override // h7.y0
    public final void h(int i10, int i11, j1 j1Var, l lVar) {
        if (this.f2036p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        J0();
        f1(i10 > 0 ? 1 : -1, Math.abs(i10), true, j1Var);
        E0(j1Var, this.f2037q, lVar);
    }

    public final void h1(int i10, int i11) {
        this.f2037q.f10024c = i11 - this.f2038r.k();
        d0 d0Var = this.f2037q;
        d0Var.f10025d = i10;
        d0Var.f10026e = this.f2041u ? 1 : -1;
        d0Var.f10027f = -1;
        d0Var.f10023b = i11;
        d0Var.f10028g = Integer.MIN_VALUE;
    }

    @Override // h7.y0
    public final void i(int i10, l lVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f2046z;
        if (savedState == null || (i11 = savedState.f2047a) < 0) {
            b1();
            z10 = this.f2041u;
            i11 = this.f2044x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = savedState.f2049g;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            lVar.b(i11, 0);
            i11 += i12;
        }
    }

    @Override // h7.y0
    public final int j(j1 j1Var) {
        return F0(j1Var);
    }

    @Override // h7.y0
    public int k(j1 j1Var) {
        return G0(j1Var);
    }

    @Override // h7.y0
    public int l(j1 j1Var) {
        return H0(j1Var);
    }

    @Override // h7.y0
    public final int m(j1 j1Var) {
        return F0(j1Var);
    }

    @Override // h7.y0
    public int n(j1 j1Var) {
        return G0(j1Var);
    }

    @Override // h7.y0
    public int o(j1 j1Var) {
        return H0(j1Var);
    }

    @Override // h7.y0
    public int p0(int i10, f1 f1Var, j1 j1Var) {
        if (this.f2036p == 1) {
            return 0;
        }
        return c1(i10, f1Var, j1Var);
    }

    @Override // h7.y0
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i10 - y0.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (y0.H(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override // h7.y0
    public final void q0(int i10) {
        this.f2044x = i10;
        this.f2045y = Integer.MIN_VALUE;
        SavedState savedState = this.f2046z;
        if (savedState != null) {
            savedState.f2047a = -1;
        }
        o0();
    }

    @Override // h7.y0
    public z0 r() {
        return new z0(-2, -2);
    }

    @Override // h7.y0
    public int r0(int i10, f1 f1Var, j1 j1Var) {
        if (this.f2036p == 0) {
            return 0;
        }
        return c1(i10, f1Var, j1Var);
    }

    @Override // h7.y0
    public final boolean y0() {
        if (this.f10283m != 1073741824 && this.f10282l != 1073741824) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public LinearLayoutManager(int i10, boolean z10) {
        this.f2036p = 1;
        this.f2040t = false;
        this.f2041u = false;
        this.f2042v = false;
        this.f2043w = true;
        this.f2044x = -1;
        this.f2045y = Integer.MIN_VALUE;
        this.f2046z = null;
        this.A = new v();
        this.B = new c0();
        this.C = 2;
        this.D = new int[2];
        d1(i10);
        c(null);
        if (z10 == this.f2040t) {
            return;
        }
        this.f2040t = z10;
        o0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2036p = 1;
        this.f2040t = false;
        this.f2041u = false;
        this.f2042v = false;
        this.f2043w = true;
        this.f2044x = -1;
        this.f2045y = Integer.MIN_VALUE;
        this.f2046z = null;
        this.A = new v();
        this.B = new c0();
        this.C = 2;
        this.D = new int[2];
        x0 x0VarI = y0.I(context, attributeSet, i10, i11);
        d1(x0VarI.f10259a);
        boolean z10 = x0VarI.f10261c;
        c(null);
        if (z10 != this.f2040t) {
            this.f2040t = z10;
            o0();
        }
        e1(x0VarI.f10262d);
    }

    @Override // h7.y0
    public final void S(RecyclerView recyclerView) {
    }

    public void Y0(f1 f1Var, j1 j1Var, v vVar, int i10) {
    }
}
