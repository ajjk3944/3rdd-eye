package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s, reason: collision with root package name */
    int f1862s;

    /* renamed from: t, reason: collision with root package name */
    private c f1863t;

    /* renamed from: u, reason: collision with root package name */
    h f1864u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1865v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1866w;

    /* renamed from: x, reason: collision with root package name */
    boolean f1867x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1868y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1869z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        h f1870a;

        /* renamed from: b, reason: collision with root package name */
        int f1871b;

        /* renamed from: c, reason: collision with root package name */
        int f1872c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1873d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1874e;

        a() {
            e();
        }

        void a() {
            this.f1872c = this.f1873d ? this.f1870a.i() : this.f1870a.m();
        }

        public void b(View view, int i2) {
            this.f1872c = this.f1873d ? this.f1870a.d(view) + this.f1870a.o() : this.f1870a.g(view);
            this.f1871b = i2;
        }

        public void c(View view, int i2) {
            int iO = this.f1870a.o();
            if (iO >= 0) {
                b(view, i2);
                return;
            }
            this.f1871b = i2;
            if (this.f1873d) {
                int i3 = (this.f1870a.i() - iO) - this.f1870a.d(view);
                this.f1872c = this.f1870a.i() - i3;
                if (i3 > 0) {
                    int iE = this.f1872c - this.f1870a.e(view);
                    int iM = this.f1870a.m();
                    int iMin = iE - (iM + Math.min(this.f1870a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f1872c += Math.min(i3, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f1870a.g(view);
            int iM2 = iG - this.f1870a.m();
            this.f1872c = iG;
            if (iM2 > 0) {
                int i4 = (this.f1870a.i() - Math.min(0, (this.f1870a.i() - iO) - this.f1870a.d(view))) - (iG + this.f1870a.e(view));
                if (i4 < 0) {
                    this.f1872c -= Math.min(iM2, -i4);
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        void e() {
            this.f1871b = -1;
            this.f1872c = Integer.MIN_VALUE;
            this.f1873d = false;
            this.f1874e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1871b + ", mCoordinate=" + this.f1872c + ", mLayoutFromEnd=" + this.f1873d + ", mValid=" + this.f1874e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1875a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1876b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1877c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1878d;

        protected b() {
        }

        void a() {
            this.f1875a = 0;
            this.f1876b = false;
            this.f1877c = false;
            this.f1878d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f1880b;

        /* renamed from: c, reason: collision with root package name */
        int f1881c;

        /* renamed from: d, reason: collision with root package name */
        int f1882d;

        /* renamed from: e, reason: collision with root package name */
        int f1883e;

        /* renamed from: f, reason: collision with root package name */
        int f1884f;

        /* renamed from: g, reason: collision with root package name */
        int f1885g;

        /* renamed from: k, reason: collision with root package name */
        int f1889k;

        /* renamed from: m, reason: collision with root package name */
        boolean f1891m;

        /* renamed from: a, reason: collision with root package name */
        boolean f1879a = true;

        /* renamed from: h, reason: collision with root package name */
        int f1886h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f1887i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f1888j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.d0> f1890l = null;

        c() {
        }

        private View e() {
            int size = this.f1890l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f1890l.get(i2).f1965a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f1882d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f1882d = viewF == null ? -1 : ((RecyclerView.p) viewF.getLayoutParams()).a();
        }

        boolean c(RecyclerView.a0 a0Var) {
            int i2 = this.f1882d;
            return i2 >= 0 && i2 < a0Var.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.f1890l != null) {
                return e();
            }
            View viewO = vVar.o(this.f1882d);
            this.f1882d += this.f1883e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f1890l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f1890l.get(i3).f1965a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f1882d) * this.f1883e) >= 0 && iA < i2) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i2 = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f1892b;

        /* renamed from: c, reason: collision with root package name */
        int f1893c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1894d;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f1892b = parcel.readInt();
            this.f1893c = parcel.readInt();
            this.f1894d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f1892b = dVar.f1892b;
            this.f1893c = dVar.f1893c;
            this.f1894d = dVar.f1894d;
        }

        boolean a() {
            return this.f1892b >= 0;
        }

        void b() {
            this.f1892b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1892b);
            parcel.writeInt(this.f1893c);
            parcel.writeInt(this.f1894d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.f1862s = 1;
        this.f1866w = false;
        this.f1867x = false;
        this.f1868y = false;
        this.f1869z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        w2(i2);
        x2(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1862s = 1;
        this.f1866w = false;
        this.f1867x = false;
        this.f1868y = false;
        this.f1869z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d dVarG0 = RecyclerView.o.g0(context, attributeSet, i2, i3);
        w2(dVarG0.f2018a);
        x2(dVarG0.f2020c);
        y2(dVarG0.f2021d);
    }

    private boolean A2(RecyclerView.a0 a0Var, a aVar) {
        int i2;
        if (!a0Var.e() && (i2 = this.A) != -1) {
            if (i2 >= 0 && i2 < a0Var.b()) {
                aVar.f1871b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z2 = this.D.f1894d;
                    aVar.f1873d = z2;
                    aVar.f1872c = z2 ? this.f1864u.i() - this.D.f1893c : this.f1864u.m() + this.D.f1893c;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z3 = this.f1867x;
                    aVar.f1873d = z3;
                    aVar.f1872c = z3 ? this.f1864u.i() - this.B : this.f1864u.m() + this.B;
                    return true;
                }
                View viewB = B(this.A);
                if (viewB == null) {
                    if (I() > 0) {
                        aVar.f1873d = (this.A < f0(H(0))) == this.f1867x;
                    }
                    aVar.a();
                } else {
                    if (this.f1864u.e(viewB) > this.f1864u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f1864u.g(viewB) - this.f1864u.m() < 0) {
                        aVar.f1872c = this.f1864u.m();
                        aVar.f1873d = false;
                        return true;
                    }
                    if (this.f1864u.i() - this.f1864u.d(viewB) < 0) {
                        aVar.f1872c = this.f1864u.i();
                        aVar.f1873d = true;
                        return true;
                    }
                    aVar.f1872c = aVar.f1873d ? this.f1864u.d(viewB) + this.f1864u.o() : this.f1864u.g(viewB);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void B2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (A2(a0Var, aVar) || z2(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f1871b = this.f1868y ? a0Var.b() - 1 : 0;
    }

    private void C2(int i2, int i3, boolean z2, RecyclerView.a0 a0Var) {
        int iM;
        this.f1863t.f1891m = t2();
        this.f1863t.f1884f = i2;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        G1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z3 = i2 == 1;
        c cVar = this.f1863t;
        int i4 = z3 ? iMax2 : iMax;
        cVar.f1886h = i4;
        if (!z3) {
            iMax = iMax2;
        }
        cVar.f1887i = iMax;
        if (z3) {
            cVar.f1886h = i4 + this.f1864u.j();
            View viewG2 = g2();
            c cVar2 = this.f1863t;
            cVar2.f1883e = this.f1867x ? -1 : 1;
            int iF0 = f0(viewG2);
            c cVar3 = this.f1863t;
            cVar2.f1882d = iF0 + cVar3.f1883e;
            cVar3.f1880b = this.f1864u.d(viewG2);
            iM = this.f1864u.d(viewG2) - this.f1864u.i();
        } else {
            View viewH2 = h2();
            this.f1863t.f1886h += this.f1864u.m();
            c cVar4 = this.f1863t;
            cVar4.f1883e = this.f1867x ? 1 : -1;
            int iF02 = f0(viewH2);
            c cVar5 = this.f1863t;
            cVar4.f1882d = iF02 + cVar5.f1883e;
            cVar5.f1880b = this.f1864u.g(viewH2);
            iM = (-this.f1864u.g(viewH2)) + this.f1864u.m();
        }
        c cVar6 = this.f1863t;
        cVar6.f1881c = i3;
        if (z2) {
            cVar6.f1881c = i3 - iM;
        }
        cVar6.f1885g = iM;
    }

    private void D2(int i2, int i3) {
        this.f1863t.f1881c = this.f1864u.i() - i3;
        c cVar = this.f1863t;
        cVar.f1883e = this.f1867x ? -1 : 1;
        cVar.f1882d = i2;
        cVar.f1884f = 1;
        cVar.f1880b = i3;
        cVar.f1885g = Integer.MIN_VALUE;
    }

    private void E2(a aVar) {
        D2(aVar.f1871b, aVar.f1872c);
    }

    private void F2(int i2, int i3) {
        this.f1863t.f1881c = i3 - this.f1864u.m();
        c cVar = this.f1863t;
        cVar.f1882d = i2;
        cVar.f1883e = this.f1867x ? 1 : -1;
        cVar.f1884f = -1;
        cVar.f1880b = i3;
        cVar.f1885g = Integer.MIN_VALUE;
    }

    private void G2(a aVar) {
        F2(aVar.f1871b, aVar.f1872c);
    }

    private int I1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        N1();
        return j.a(a0Var, this.f1864u, S1(!this.f1869z, true), R1(!this.f1869z, true), this, this.f1869z);
    }

    private int J1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        N1();
        return j.b(a0Var, this.f1864u, S1(!this.f1869z, true), R1(!this.f1869z, true), this, this.f1869z, this.f1867x);
    }

    private int K1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        N1();
        return j.c(a0Var, this.f1864u, S1(!this.f1869z, true), R1(!this.f1869z, true), this, this.f1869z);
    }

    private View P1() {
        return X1(0, I());
    }

    private View Q1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return b2(vVar, a0Var, 0, I(), a0Var.b());
    }

    private View U1() {
        return X1(I() - 1, -1);
    }

    private View V1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return b2(vVar, a0Var, I() - 1, -1, a0Var.b());
    }

    private View Z1() {
        return this.f1867x ? P1() : U1();
    }

    private View a2() {
        return this.f1867x ? U1() : P1();
    }

    private View c2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f1867x ? Q1(vVar, a0Var) : V1(vVar, a0Var);
    }

    private View d2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f1867x ? V1(vVar, a0Var) : Q1(vVar, a0Var);
    }

    private int e2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i3;
        int i4 = this.f1864u.i() - i2;
        if (i4 <= 0) {
            return 0;
        }
        int i5 = -v2(-i4, vVar, a0Var);
        int i6 = i2 + i5;
        if (!z2 || (i3 = this.f1864u.i() - i6) <= 0) {
            return i5;
        }
        this.f1864u.r(i3);
        return i3 + i5;
    }

    private int f2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int iM;
        int iM2 = i2 - this.f1864u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i3 = -v2(iM2, vVar, a0Var);
        int i4 = i2 + i3;
        if (!z2 || (iM = i4 - this.f1864u.m()) <= 0) {
            return i3;
        }
        this.f1864u.r(-iM);
        return i3 - iM;
    }

    private View g2() {
        return H(this.f1867x ? 0 : I() - 1);
    }

    private View h2() {
        return H(this.f1867x ? I() - 1 : 0);
    }

    private void n2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3) {
        if (!a0Var.g() || I() == 0 || a0Var.e() || !F1()) {
            return;
        }
        List<RecyclerView.d0> listK = vVar.k();
        int size = listK.size();
        int iF0 = f0(H(0));
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.d0 d0Var = listK.get(i6);
            if (!d0Var.v()) {
                char c2 = (d0Var.m() < iF0) != this.f1867x ? (char) 65535 : (char) 1;
                int iE = this.f1864u.e(d0Var.f1965a);
                if (c2 == 65535) {
                    i4 += iE;
                } else {
                    i5 += iE;
                }
            }
        }
        this.f1863t.f1890l = listK;
        if (i4 > 0) {
            F2(f0(h2()), i2);
            c cVar = this.f1863t;
            cVar.f1886h = i4;
            cVar.f1881c = 0;
            cVar.a();
            O1(vVar, this.f1863t, a0Var, false);
        }
        if (i5 > 0) {
            D2(f0(g2()), i3);
            c cVar2 = this.f1863t;
            cVar2.f1886h = i5;
            cVar2.f1881c = 0;
            cVar2.a();
            O1(vVar, this.f1863t, a0Var, false);
        }
        this.f1863t.f1890l = null;
    }

    private void p2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f1879a || cVar.f1891m) {
            return;
        }
        int i2 = cVar.f1885g;
        int i3 = cVar.f1887i;
        if (cVar.f1884f == -1) {
            r2(vVar, i2, i3);
        } else {
            s2(vVar, i2, i3);
        }
    }

    private void q2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                k1(i2, vVar);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                k1(i4, vVar);
            }
        }
    }

    private void r2(RecyclerView.v vVar, int i2, int i3) {
        int I = I();
        if (i2 < 0) {
            return;
        }
        int iH = (this.f1864u.h() - i2) + i3;
        if (this.f1867x) {
            for (int i4 = 0; i4 < I; i4++) {
                View viewH = H(i4);
                if (this.f1864u.g(viewH) < iH || this.f1864u.q(viewH) < iH) {
                    q2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = I - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewH2 = H(i6);
            if (this.f1864u.g(viewH2) < iH || this.f1864u.q(viewH2) < iH) {
                q2(vVar, i5, i6);
                return;
            }
        }
    }

    private void s2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int I = I();
        if (!this.f1867x) {
            for (int i5 = 0; i5 < I; i5++) {
                View viewH = H(i5);
                if (this.f1864u.d(viewH) > i4 || this.f1864u.p(viewH) > i4) {
                    q2(vVar, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = I - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View viewH2 = H(i7);
            if (this.f1864u.d(viewH2) > i4 || this.f1864u.p(viewH2) > i4) {
                q2(vVar, i6, i7);
                return;
            }
        }
    }

    private void u2() {
        this.f1867x = (this.f1862s == 1 || !k2()) ? this.f1866w : !this.f1866w;
    }

    private boolean z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (I() == 0) {
            return false;
        }
        View viewU = U();
        if (viewU != null && aVar.d(viewU, a0Var)) {
            aVar.c(viewU, f0(viewU));
            return true;
        }
        if (this.f1865v != this.f1868y) {
            return false;
        }
        View viewC2 = aVar.f1873d ? c2(vVar, a0Var) : d2(vVar, a0Var);
        if (viewC2 == null) {
            return false;
        }
        aVar.b(viewC2, f0(viewC2));
        if (!a0Var.e() && F1()) {
            if (this.f1864u.g(viewC2) >= this.f1864u.i() || this.f1864u.d(viewC2) < this.f1864u.m()) {
                aVar.f1872c = aVar.f1873d ? this.f1864u.i() : this.f1864u.m();
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View B(int i2) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int iF0 = i2 - f0(H(0));
        if (iF0 >= 0 && iF0 < I) {
            View viewH = H(iF0);
            if (f0(viewH) == i2) {
                return viewH;
            }
        }
        return super.B(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean C1() {
        return (W() == 1073741824 || n0() == 1073741824 || !o0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F1() {
        return this.D == null && this.f1865v == this.f1868y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.G0(recyclerView, vVar);
        if (this.C) {
            h1(vVar);
            vVar.c();
        }
    }

    protected void G1(RecyclerView.a0 a0Var, int[] iArr) {
        int i2;
        int iI2 = i2(a0Var);
        if (this.f1863t.f1884f == -1) {
            i2 = 0;
        } else {
            i2 = iI2;
            iI2 = 0;
        }
        iArr[0] = iI2;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iL1;
        u2();
        if (I() == 0 || (iL1 = L1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        N1();
        C2(iL1, (int) (this.f1864u.n() * 0.33333334f), false, a0Var);
        c cVar = this.f1863t;
        cVar.f1885g = Integer.MIN_VALUE;
        cVar.f1879a = false;
        O1(vVar, cVar, a0Var, true);
        View viewA2 = iL1 == -1 ? a2() : Z1();
        View viewH2 = iL1 == -1 ? h2() : g2();
        if (!viewH2.hasFocusable()) {
            return viewA2;
        }
        if (viewA2 == null) {
            return null;
        }
        return viewH2;
    }

    void H1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i2 = cVar.f1882d;
        if (i2 < 0 || i2 >= a0Var.b()) {
            return;
        }
        cVar2.a(i2, Math.max(0, cVar.f1885g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(T1());
            accessibilityEvent.setToIndex(W1());
        }
    }

    int L1(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1862s == 1) ? 1 : Integer.MIN_VALUE : this.f1862s == 0 ? 1 : Integer.MIN_VALUE : this.f1862s == 1 ? -1 : Integer.MIN_VALUE : this.f1862s == 0 ? -1 : Integer.MIN_VALUE : (this.f1862s != 1 && k2()) ? -1 : 1 : (this.f1862s != 1 && k2()) ? 1 : -1;
    }

    c M1() {
        return new c();
    }

    void N1() {
        if (this.f1863t == null) {
            this.f1863t = M1();
        }
    }

    int O1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2 = cVar.f1881c;
        int i3 = cVar.f1885g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f1885g = i3 + i2;
            }
            p2(vVar, cVar);
        }
        int i4 = cVar.f1881c + cVar.f1886h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f1891m && i4 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            m2(vVar, a0Var, cVar, bVar);
            if (!bVar.f1876b) {
                cVar.f1880b += bVar.f1875a * cVar.f1884f;
                if (!bVar.f1877c || cVar.f1890l != null || !a0Var.e()) {
                    int i5 = cVar.f1881c;
                    int i6 = bVar.f1875a;
                    cVar.f1881c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f1885g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + bVar.f1875a;
                    cVar.f1885g = i8;
                    int i9 = cVar.f1881c;
                    if (i9 < 0) {
                        cVar.f1885g = i8 + i9;
                    }
                    p2(vVar, cVar);
                }
                if (z2 && bVar.f1878d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f1881c;
    }

    View R1(boolean z2, boolean z3) {
        int I;
        int I2;
        if (this.f1867x) {
            I = 0;
            I2 = I();
        } else {
            I = I() - 1;
            I2 = -1;
        }
        return Y1(I, I2, z2, z3);
    }

    View S1(boolean z2, boolean z3) {
        int I;
        int I2;
        if (this.f1867x) {
            I = I() - 1;
            I2 = -1;
        } else {
            I = 0;
            I2 = I();
        }
        return Y1(I, I2, z2, z3);
    }

    public int T1() {
        View viewY1 = Y1(0, I(), false, true);
        if (viewY1 == null) {
            return -1;
        }
        return f0(viewY1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iE2;
        int i6;
        View viewB;
        int iG;
        int i7;
        int i8 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            h1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f1892b;
        }
        N1();
        this.f1863t.f1879a = false;
        u2();
        View viewU = U();
        a aVar = this.E;
        if (!aVar.f1874e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f1873d = this.f1867x ^ this.f1868y;
            B2(vVar, a0Var, aVar2);
            this.E.f1874e = true;
        } else if (viewU != null && (this.f1864u.g(viewU) >= this.f1864u.i() || this.f1864u.d(viewU) <= this.f1864u.m())) {
            this.E.c(viewU, f0(viewU));
        }
        c cVar = this.f1863t;
        cVar.f1884f = cVar.f1889k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        G1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f1864u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f1864u.j();
        if (a0Var.e() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewB = B(i6)) != null) {
            if (this.f1867x) {
                i7 = this.f1864u.i() - this.f1864u.d(viewB);
                iG = this.B;
            } else {
                iG = this.f1864u.g(viewB) - this.f1864u.m();
                i7 = this.B;
            }
            int i9 = i7 - iG;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f1873d ? !this.f1867x : this.f1867x) {
            i8 = 1;
        }
        o2(vVar, a0Var, aVar3, i8);
        v(vVar);
        this.f1863t.f1891m = t2();
        this.f1863t.f1888j = a0Var.e();
        this.f1863t.f1887i = 0;
        a aVar4 = this.E;
        if (aVar4.f1873d) {
            G2(aVar4);
            c cVar2 = this.f1863t;
            cVar2.f1886h = iMax;
            O1(vVar, cVar2, a0Var, false);
            c cVar3 = this.f1863t;
            i3 = cVar3.f1880b;
            int i10 = cVar3.f1882d;
            int i11 = cVar3.f1881c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            E2(this.E);
            c cVar4 = this.f1863t;
            cVar4.f1886h = iMax2;
            cVar4.f1882d += cVar4.f1883e;
            O1(vVar, cVar4, a0Var, false);
            c cVar5 = this.f1863t;
            i2 = cVar5.f1880b;
            int i12 = cVar5.f1881c;
            if (i12 > 0) {
                F2(i10, i3);
                c cVar6 = this.f1863t;
                cVar6.f1886h = i12;
                O1(vVar, cVar6, a0Var, false);
                i3 = this.f1863t.f1880b;
            }
        } else {
            E2(aVar4);
            c cVar7 = this.f1863t;
            cVar7.f1886h = iMax2;
            O1(vVar, cVar7, a0Var, false);
            c cVar8 = this.f1863t;
            i2 = cVar8.f1880b;
            int i13 = cVar8.f1882d;
            int i14 = cVar8.f1881c;
            if (i14 > 0) {
                iMax += i14;
            }
            G2(this.E);
            c cVar9 = this.f1863t;
            cVar9.f1886h = iMax;
            cVar9.f1882d += cVar9.f1883e;
            O1(vVar, cVar9, a0Var, false);
            c cVar10 = this.f1863t;
            i3 = cVar10.f1880b;
            int i15 = cVar10.f1881c;
            if (i15 > 0) {
                D2(i13, i2);
                c cVar11 = this.f1863t;
                cVar11.f1886h = i15;
                O1(vVar, cVar11, a0Var, false);
                i2 = this.f1863t.f1880b;
            }
        }
        if (I() > 0) {
            if (this.f1867x ^ this.f1868y) {
                int iE22 = e2(i2, vVar, a0Var, true);
                i4 = i3 + iE22;
                i5 = i2 + iE22;
                iE2 = f2(i4, vVar, a0Var, false);
            } else {
                int iF2 = f2(i3, vVar, a0Var, true);
                i4 = i3 + iF2;
                i5 = i2 + iF2;
                iE2 = e2(i5, vVar, a0Var, false);
            }
            i3 = i4 + iE2;
            i2 = i5 + iE2;
        }
        n2(vVar, a0Var, i3, i2);
        if (a0Var.e()) {
            this.E.e();
        } else {
            this.f1864u.s();
        }
        this.f1865v = this.f1868y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.a0 a0Var) {
        super.W0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int W1() {
        View viewY1 = Y1(I() - 1, -1, false, true);
        if (viewY1 == null) {
            return -1;
        }
        return f0(viewY1);
    }

    View X1(int i2, int i3) {
        int i4;
        int i5;
        N1();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return H(i2);
        }
        if (this.f1864u.g(H(i2)) < this.f1864u.m()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return (this.f1862s == 0 ? this.f2002e : this.f2003f).a(i2, i3, i4, i5);
    }

    View Y1(int i2, int i3, boolean z2, boolean z3) {
        N1();
        return (this.f1862s == 0 ? this.f2002e : this.f2003f).a(i2, i3, z2 ? 24579 : 320, z3 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable b1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (I() > 0) {
            N1();
            boolean z2 = this.f1865v ^ this.f1867x;
            dVar.f1894d = z2;
            if (z2) {
                View viewG2 = g2();
                dVar.f1893c = this.f1864u.i() - this.f1864u.d(viewG2);
                dVar.f1892b = f0(viewG2);
            } else {
                View viewH2 = h2();
                dVar.f1892b = f0(viewH2);
                dVar.f1893c = this.f1864u.g(viewH2) - this.f1864u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3, int i4) {
        N1();
        int iM = this.f1864u.m();
        int i5 = this.f1864u.i();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View viewH = H(i2);
            int iF0 = f0(viewH);
            if (iF0 >= 0 && iF0 < i4) {
                if (((RecyclerView.p) viewH.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.f1864u.g(viewH) < i5 && this.f1864u.d(viewH) >= iM) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(String str) {
        if (this.D == null) {
            super.f(str);
        }
    }

    @Deprecated
    protected int i2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f1864u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j() {
        return this.f1862s == 0;
    }

    public int j2() {
        return this.f1862s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f1862s == 1;
    }

    protected boolean k2() {
        return X() == 1;
    }

    public boolean l2() {
        return this.f1869z;
    }

    void m2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int iC0;
        int iF;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f1876b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f1890l == null) {
            if (this.f1867x == (cVar.f1884f == -1)) {
                c(viewD);
            } else {
                d(viewD, 0);
            }
        } else {
            if (this.f1867x == (cVar.f1884f == -1)) {
                a(viewD);
            } else {
                b(viewD, 0);
            }
        }
        y0(viewD, 0, 0);
        bVar.f1875a = this.f1864u.e(viewD);
        if (this.f1862s == 1) {
            if (k2()) {
                iF = m0() - d0();
                iC0 = iF - this.f1864u.f(viewD);
            } else {
                iC0 = c0();
                iF = this.f1864u.f(viewD) + iC0;
            }
            int i5 = cVar.f1884f;
            int i6 = cVar.f1880b;
            if (i5 == -1) {
                i4 = i6;
                i3 = iF;
                i2 = i6 - bVar.f1875a;
            } else {
                i2 = i6;
                i3 = iF;
                i4 = bVar.f1875a + i6;
            }
        } else {
            int iE0 = e0();
            int iF2 = this.f1864u.f(viewD) + iE0;
            int i7 = cVar.f1884f;
            int i8 = cVar.f1880b;
            if (i7 == -1) {
                i3 = i8;
                i2 = iE0;
                i4 = iF2;
                iC0 = i8 - bVar.f1875a;
            } else {
                i2 = iE0;
                i3 = bVar.f1875a + i8;
                i4 = iF2;
                iC0 = i8;
            }
        }
        x0(viewD, iC0, i2, i3, i4);
        if (pVar.c() || pVar.b()) {
            bVar.f1877c = true;
        }
        bVar.f1878d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f1862s != 0) {
            i2 = i3;
        }
        if (I() == 0 || i2 == 0) {
            return;
        }
        N1();
        C2(i2 > 0 ? 1 : -1, Math.abs(i2), true, a0Var);
        H1(a0Var, this.f1863t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i2, RecyclerView.o.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            u2();
            z2 = this.f1867x;
            i3 = this.A;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z2 = dVar2.f1894d;
            i3 = dVar2.f1892b;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.G && i3 >= 0 && i3 < i2; i5++) {
            cVar.a(i3, 0);
            i3 += i4;
        }
    }

    void o2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int p(RecyclerView.a0 a0Var) {
        return I1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return J1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return K1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return I1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return J1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f1862s == 1) {
            return 0;
        }
        return v2(i2, vVar, a0Var);
    }

    boolean t2() {
        return this.f1864u.k() == 0 && this.f1864u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return K1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f1862s == 0) {
            return 0;
        }
        return v2(i2, vVar, a0Var);
    }

    int v2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (I() == 0 || i2 == 0) {
            return 0;
        }
        N1();
        this.f1863t.f1879a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        C2(i3, iAbs, true, a0Var);
        c cVar = this.f1863t;
        int iO1 = cVar.f1885g + O1(vVar, cVar, a0Var, false);
        if (iO1 < 0) {
            return 0;
        }
        if (iAbs > iO1) {
            i2 = i3 * iO1;
        }
        this.f1864u.r(-i2);
        this.f1863t.f1889k = i2;
        return i2;
    }

    public void w2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        f(null);
        if (i2 != this.f1862s || this.f1864u == null) {
            h hVarB = h.b(this, i2);
            this.f1864u = hVarB;
            this.E.f1870a = hVarB;
            this.f1862s = i2;
            q1();
        }
    }

    public void x2(boolean z2) {
        f(null);
        if (z2 == this.f1866w) {
            return;
        }
        this.f1866w = z2;
        q1();
    }

    public void y2(boolean z2) {
        f(null);
        if (this.f1868y == z2) {
            return;
        }
        this.f1868y = z2;
        q1();
    }
}
