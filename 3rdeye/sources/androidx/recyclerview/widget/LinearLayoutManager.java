package androidx.recyclerview.widget;

import N7.C1154e9;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import g0.C4356c;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public final a f16410A;

    /* renamed from: B, reason: collision with root package name */
    public final b f16411B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16412C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f16413D;

    /* renamed from: p, reason: collision with root package name */
    public int f16414p;

    /* renamed from: q, reason: collision with root package name */
    public c f16415q;

    /* renamed from: r, reason: collision with root package name */
    public A f16416r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16417s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f16418t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16419u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16420v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16421w;

    /* renamed from: x, reason: collision with root package name */
    public int f16422x;

    /* renamed from: y, reason: collision with root package name */
    public int f16423y;

    /* renamed from: z, reason: collision with root package name */
    public d f16424z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public A f16425a;

        /* renamed from: b, reason: collision with root package name */
        public int f16426b;

        /* renamed from: c, reason: collision with root package name */
        public int f16427c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16428d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16429e;

        public a() {
            d();
        }

        public final void a() {
            this.f16427c = this.f16428d ? this.f16425a.g() : this.f16425a.k();
        }

        public final void b(int i, View view) {
            if (this.f16428d) {
                int iB = this.f16425a.b(view);
                A a10 = this.f16425a;
                this.f16427c = (Integer.MIN_VALUE == a10.f16365b ? 0 : a10.l() - a10.f16365b) + iB;
            } else {
                this.f16427c = this.f16425a.e(view);
            }
            this.f16426b = i;
        }

        public final void c(int i, View view) {
            A a10 = this.f16425a;
            int iL = Integer.MIN_VALUE == a10.f16365b ? 0 : a10.l() - a10.f16365b;
            if (iL >= 0) {
                b(i, view);
                return;
            }
            this.f16426b = i;
            if (!this.f16428d) {
                int iE = this.f16425a.e(view);
                int iK = iE - this.f16425a.k();
                this.f16427c = iE;
                if (iK > 0) {
                    int iG = (this.f16425a.g() - Math.min(0, (this.f16425a.g() - iL) - this.f16425a.b(view))) - (this.f16425a.c(view) + iE);
                    if (iG < 0) {
                        this.f16427c -= Math.min(iK, -iG);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG2 = (this.f16425a.g() - iL) - this.f16425a.b(view);
            this.f16427c = this.f16425a.g() - iG2;
            if (iG2 > 0) {
                int iC = this.f16427c - this.f16425a.c(view);
                int iK2 = this.f16425a.k();
                int iMin = iC - (Math.min(this.f16425a.e(view) - iK2, 0) + iK2);
                if (iMin < 0) {
                    this.f16427c = Math.min(iG2, -iMin) + this.f16427c;
                }
            }
        }

        public final void d() {
            this.f16426b = -1;
            this.f16427c = RecyclerView.UNDEFINED_DURATION;
            this.f16428d = false;
            this.f16429e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f16426b);
            sb.append(", mCoordinate=");
            sb.append(this.f16427c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f16428d);
            sb.append(", mValid=");
            return C1154e9.k(sb, this.f16429e, '}');
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16430a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16431b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16432c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16433d;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16434a;

        /* renamed from: b, reason: collision with root package name */
        public int f16435b;

        /* renamed from: c, reason: collision with root package name */
        public int f16436c;

        /* renamed from: d, reason: collision with root package name */
        public int f16437d;

        /* renamed from: e, reason: collision with root package name */
        public int f16438e;

        /* renamed from: f, reason: collision with root package name */
        public int f16439f;

        /* renamed from: g, reason: collision with root package name */
        public int f16440g;

        /* renamed from: h, reason: collision with root package name */
        public int f16441h;
        public int i;

        /* renamed from: j, reason: collision with root package name */
        public int f16442j;

        /* renamed from: k, reason: collision with root package name */
        public List<RecyclerView.F> f16443k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f16444l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f16443k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                View view3 = this.f16443k.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.f16518a.isRemoved() && (layoutPosition = (qVar.f16518a.getLayoutPosition() - this.f16437d) * this.f16438e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f16437d = -1;
            } else {
                this.f16437d = ((RecyclerView.q) view2.getLayoutParams()).f16518a.getLayoutPosition();
            }
        }

        public final View b(RecyclerView.w wVar) {
            List<RecyclerView.F> list = this.f16443k;
            if (list == null) {
                View view = wVar.l(this.f16437d, Long.MAX_VALUE).itemView;
                this.f16437d += this.f16438e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f16443k.get(i).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view2.getLayoutParams();
                if (!qVar.f16518a.isRemoved() && this.f16437d == qVar.f16518a.getLayoutPosition()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f16445b;

        /* renamed from: c, reason: collision with root package name */
        public int f16446c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16447d;

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.f16445b = parcel.readInt();
                dVar.f16446c = parcel.readInt();
                dVar.f16447d = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16445b);
            parcel.writeInt(this.f16446c);
            parcel.writeInt(this.f16447d ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final void A(int i, s.b bVar) {
        boolean z10;
        int i10;
        d dVar = this.f16424z;
        if (dVar == null || (i10 = dVar.f16445b) < 0) {
            w1();
            z10 = this.f16419u;
            i10 = this.f16422x;
            if (i10 == -1) {
                i10 = z10 ? i - 1 : 0;
            }
        } else {
            z10 = dVar.f16447d;
        }
        int i11 = z10 ? -1 : 1;
        for (int i12 = 0; i12 < this.f16412C && i10 >= 0 && i10 < i; i12++) {
            bVar.a(i10, 0);
            i10 += i11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final void A0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f16424z = dVar;
            if (this.f16422x != -1) {
                dVar.f16445b = -1;
            }
            J0();
        }
    }

    public final void A1(int i, int i10, boolean z10, RecyclerView.B b10) {
        int iK;
        this.f16415q.f16444l = this.f16416r.i() == 0 && this.f16416r.f() == 0;
        this.f16415q.f16439f = i;
        int[] iArr = this.f16413D;
        iArr[0] = 0;
        iArr[1] = 0;
        Y0(b10, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i == 1;
        c cVar = this.f16415q;
        int i11 = z11 ? iMax2 : iMax;
        cVar.f16441h = i11;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z11) {
            cVar.f16441h = this.f16416r.h() + i11;
            View viewP1 = p1();
            c cVar2 = this.f16415q;
            cVar2.f16438e = this.f16419u ? -1 : 1;
            int iB0 = RecyclerView.p.b0(viewP1);
            c cVar3 = this.f16415q;
            cVar2.f16437d = iB0 + cVar3.f16438e;
            cVar3.f16435b = this.f16416r.b(viewP1);
            iK = this.f16416r.b(viewP1) - this.f16416r.g();
        } else {
            View viewQ1 = q1();
            c cVar4 = this.f16415q;
            cVar4.f16441h = this.f16416r.k() + cVar4.f16441h;
            c cVar5 = this.f16415q;
            cVar5.f16438e = this.f16419u ? 1 : -1;
            int iB02 = RecyclerView.p.b0(viewQ1);
            c cVar6 = this.f16415q;
            cVar5.f16437d = iB02 + cVar6.f16438e;
            cVar6.f16435b = this.f16416r.e(viewQ1);
            iK = (-this.f16416r.e(viewQ1)) + this.f16416r.k();
        }
        c cVar7 = this.f16415q;
        cVar7.f16436c = i10;
        if (z10) {
            cVar7.f16436c = i10 - iK;
        }
        cVar7.f16440g = iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final int B(RecyclerView.B b10) {
        return a1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final Parcelable B0() {
        d dVar = this.f16424z;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.f16445b = dVar.f16445b;
            dVar2.f16446c = dVar.f16446c;
            dVar2.f16447d = dVar.f16447d;
            return dVar2;
        }
        d dVar3 = new d();
        if (O() <= 0) {
            dVar3.f16445b = -1;
            return dVar3;
        }
        e1();
        boolean z10 = this.f16417s ^ this.f16419u;
        dVar3.f16447d = z10;
        if (z10) {
            View viewP1 = p1();
            dVar3.f16446c = this.f16416r.g() - this.f16416r.b(viewP1);
            dVar3.f16445b = RecyclerView.p.b0(viewP1);
            return dVar3;
        }
        View viewQ1 = q1();
        dVar3.f16445b = RecyclerView.p.b0(viewQ1);
        dVar3.f16446c = this.f16416r.e(viewQ1) - this.f16416r.k();
        return dVar3;
    }

    public final void B1(int i, int i10) {
        this.f16415q.f16436c = this.f16416r.g() - i10;
        c cVar = this.f16415q;
        cVar.f16438e = this.f16419u ? -1 : 1;
        cVar.f16437d = i;
        cVar.f16439f = 1;
        cVar.f16435b = i10;
        cVar.f16440g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int C(RecyclerView.B b10) {
        return b1(b10);
    }

    public final void C1(int i, int i10) {
        this.f16415q.f16436c = i10 - this.f16416r.k();
        c cVar = this.f16415q;
        cVar.f16437d = i;
        cVar.f16438e = this.f16419u ? 1 : -1;
        cVar.f16439f = -1;
        cVar.f16435b = i10;
        cVar.f16440g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int D(RecyclerView.B b10) {
        return c1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final int E(RecyclerView.B b10) {
        return a1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int F(RecyclerView.B b10) {
        return b1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int G(RecyclerView.B b10) {
        return c1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final View J(int i) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iB0 = i - RecyclerView.p.b0(N(0));
        if (iB0 >= 0 && iB0 < iO) {
            View viewN = N(iB0);
            if (RecyclerView.p.b0(viewN) == i) {
                return viewN;
            }
        }
        return super.J(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q K() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int K0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f16414p == 1) {
            return 0;
        }
        return x1(i, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void L0(int i) {
        this.f16422x = i;
        this.f16423y = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.f16424z;
        if (dVar != null) {
            dVar.f16445b = -1;
        }
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int M0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f16414p == 0) {
            return 0;
        }
        return x1(i, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean T0() {
        if (this.f16509m != 1073741824 && this.f16508l != 1073741824) {
            int iO = O();
            for (int i = 0; i < iO; i++) {
                ViewGroup.LayoutParams layoutParams = N(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void V0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f16448a = i;
        W0(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean X0() {
        return this.f16424z == null && this.f16417s == this.f16420v;
    }

    public void Y0(RecyclerView.B b10, int[] iArr) {
        int i;
        int iL = b10.f16463a != -1 ? this.f16416r.l() : 0;
        if (this.f16415q.f16439f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void Z0(RecyclerView.B b10, c cVar, s.b bVar) {
        int i = cVar.f16437d;
        if (i < 0 || i >= b10.b()) {
            return;
        }
        bVar.a(i, Math.max(0, cVar.f16440g));
    }

    public final int a1(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        e1();
        A a10 = this.f16416r;
        boolean z10 = !this.f16421w;
        return E.a(b10, a10, h1(z10), g1(z10), this, this.f16421w);
    }

    public final int b1(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        e1();
        A a10 = this.f16416r;
        boolean z10 = !this.f16421w;
        return E.b(b10, a10, h1(z10), g1(z10), this, this.f16421w, this.f16419u);
    }

    public final int c1(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        e1();
        A a10 = this.f16416r;
        boolean z10 = !this.f16421w;
        return E.c(b10, a10, h1(z10), g1(z10), this, this.f16421w);
    }

    public final int d1(int i) {
        if (i == 1) {
            return (this.f16414p != 1 && r1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f16414p != 1 && r1()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f16414p == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (this.f16414p == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            if (this.f16414p == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130 && this.f16414p == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public int e() {
        return j1();
    }

    public final void e1() {
        if (this.f16415q == null) {
            c cVar = new c();
            cVar.f16434a = true;
            cVar.f16441h = 0;
            cVar.i = 0;
            cVar.f16443k = null;
            this.f16415q = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    @SuppressLint({"UnknownNullness"})
    public final PointF f(int i) {
        if (O() == 0) {
            return null;
        }
        int i10 = (i < RecyclerView.p.b0(N(0))) != this.f16419u ? -1 : 1;
        return this.f16414p == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean f0() {
        return true;
    }

    public final int f1(RecyclerView.w wVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i;
        int i10 = cVar.f16436c;
        int i11 = cVar.f16440g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f16440g = i11 + i10;
            }
            u1(wVar, cVar);
        }
        int i12 = cVar.f16436c + cVar.f16441h;
        while (true) {
            if ((!cVar.f16444l && i12 <= 0) || (i = cVar.f16437d) < 0 || i >= b10.b()) {
                break;
            }
            b bVar = this.f16411B;
            bVar.f16430a = 0;
            bVar.f16431b = false;
            bVar.f16432c = false;
            bVar.f16433d = false;
            s1(wVar, b10, cVar, bVar);
            if (!bVar.f16431b) {
                int i13 = cVar.f16435b;
                int i14 = bVar.f16430a;
                cVar.f16435b = (cVar.f16439f * i14) + i13;
                if (!bVar.f16432c || cVar.f16443k != null || !b10.f16469g) {
                    cVar.f16436c -= i14;
                    i12 -= i14;
                }
                int i15 = cVar.f16440g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f16440g = i16;
                    int i17 = cVar.f16436c;
                    if (i17 < 0) {
                        cVar.f16440g = i16 + i17;
                    }
                    u1(wVar, cVar);
                }
                if (z10 && bVar.f16433d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f16436c;
    }

    public final View g1(boolean z10) {
        return this.f16419u ? l1(0, O(), z10, true) : l1(O() - 1, -1, z10, true);
    }

    public final View h1(boolean z10) {
        return this.f16419u ? l1(O() - 1, -1, z10, true) : l1(0, O(), z10, true);
    }

    public final int i1() {
        View viewL1 = l1(0, O(), false, true);
        if (viewL1 == null) {
            return -1;
        }
        return RecyclerView.p.b0(viewL1);
    }

    public int j() {
        return i1();
    }

    public final int j1() {
        View viewL1 = l1(O() - 1, -1, false, true);
        if (viewL1 == null) {
            return -1;
        }
        return RecyclerView.p.b0(viewL1);
    }

    public final View k1(int i, int i10) {
        int i11;
        int i12;
        e1();
        if (i10 <= i && i10 >= i) {
            return N(i);
        }
        if (this.f16416r.e(N(i)) < this.f16416r.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.f16414p == 0 ? this.f16500c.a(i, i10, i11, i12) : this.f16501d.a(i, i10, i11, i12);
    }

    public final View l1(int i, int i10, boolean z10, boolean z11) {
        e1();
        int i11 = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        int i12 = z10 ? 24579 : 320;
        if (!z11) {
            i11 = 0;
        }
        return this.f16414p == 0 ? this.f16500c.a(i, i10, i12, i11) : this.f16501d.a(i, i10, i12, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m1(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.e1()
            int r1 = r0.O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.O()
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
            androidx.recyclerview.widget.A r7 = r0.f16416r
            int r7 = r7.k()
            androidx.recyclerview.widget.A r8 = r0.f16416r
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.N(r1)
            int r13 = androidx.recyclerview.widget.RecyclerView.p.b0(r12)
            androidx.recyclerview.widget.A r14 = r0.f16416r
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.A r15 = r0.f16416r
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            androidx.recyclerview.widget.RecyclerView$F r13 = r13.f16518a
            boolean r13 = r13.isRemoved()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.m1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean, boolean):android.view.View");
    }

    public final int n1(int i, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iG;
        int iG2 = this.f16416r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i10 = -x1(-iG2, wVar, b10);
        int i11 = i + i10;
        if (!z10 || (iG = this.f16416r.g() - i11) <= 0) {
            return i10;
        }
        this.f16416r.o(iG);
        return iG + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View o0(View view, int i, RecyclerView.w wVar, RecyclerView.B b10) {
        int iD1;
        w1();
        if (O() != 0 && (iD1 = d1(i)) != Integer.MIN_VALUE) {
            e1();
            A1(iD1, (int) (this.f16416r.l() * 0.33333334f), false, b10);
            c cVar = this.f16415q;
            cVar.f16440g = RecyclerView.UNDEFINED_DURATION;
            cVar.f16434a = false;
            f1(wVar, cVar, b10, true);
            View viewK1 = iD1 == -1 ? this.f16419u ? k1(O() - 1, -1) : k1(0, O()) : this.f16419u ? k1(0, O()) : k1(O() - 1, -1);
            View viewQ1 = iD1 == -1 ? q1() : p1();
            if (!viewQ1.hasFocusable()) {
                return viewK1;
            }
            if (viewK1 != null) {
                return viewQ1;
            }
        }
        return null;
    }

    public final int o1(int i, RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iK;
        int iK2 = i - this.f16416r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i10 = -x1(iK2, wVar, b10);
        int i11 = i + i10;
        if (!z10 || (iK = i11 - this.f16416r.k()) <= 0) {
            return i10;
        }
        this.f16416r.o(-iK);
        return i10 - iK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final void p0(AccessibilityEvent accessibilityEvent) {
        super.p0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(i1());
            accessibilityEvent.setToIndex(j1());
        }
    }

    public final View p1() {
        return N(this.f16419u ? 0 : O() - 1);
    }

    public final View q1() {
        return N(this.f16419u ? O() - 1 : 0);
    }

    public final boolean r1() {
        return W() == 1;
    }

    public void s1(RecyclerView.w wVar, RecyclerView.B b10, c cVar, b bVar) {
        int i;
        int i10;
        int iY;
        int i11;
        int iD;
        int i12;
        View viewB = cVar.b(wVar);
        if (viewB == null) {
            bVar.f16431b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewB.getLayoutParams();
        if (cVar.f16443k == null) {
            if (this.f16419u == (cVar.f16439f == -1)) {
                s(viewB, -1, false);
            } else {
                s(viewB, 0, false);
            }
        } else {
            if (this.f16419u == (cVar.f16439f == -1)) {
                s(viewB, -1, true);
            } else {
                s(viewB, 0, true);
            }
        }
        i0(viewB);
        bVar.f16430a = this.f16416r.c(viewB);
        if (this.f16414p == 1) {
            if (r1()) {
                iD = this.f16510n - Z();
                iY = iD - this.f16416r.d(viewB);
            } else {
                iY = Y();
                iD = this.f16416r.d(viewB) + iY;
            }
            if (cVar.f16439f == -1) {
                i12 = cVar.f16435b;
                i11 = i12 - bVar.f16430a;
            } else {
                i11 = cVar.f16435b;
                i12 = bVar.f16430a + i11;
            }
            i = i12;
            i10 = iD;
        } else {
            int iA0 = a0();
            int iD2 = this.f16416r.d(viewB) + iA0;
            if (cVar.f16439f == -1) {
                int i13 = cVar.f16435b;
                i10 = i13;
                i = iD2;
                iY = i13 - bVar.f16430a;
            } else {
                int i14 = cVar.f16435b;
                i = iD2;
                i10 = bVar.f16430a + i14;
                iY = i14;
            }
            i11 = iA0;
        }
        h0(viewB, iY, i11, i10, i);
        if (qVar.f16518a.isRemoved() || qVar.f16518a.isUpdated()) {
            bVar.f16432c = true;
        }
        bVar.f16433d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final void t(String str) {
        if (this.f16424z == null) {
            super.t(str);
        }
    }

    public final void u1(RecyclerView.w wVar, c cVar) {
        if (!cVar.f16434a || cVar.f16444l) {
            return;
        }
        int i = cVar.f16440g;
        int i10 = cVar.i;
        if (cVar.f16439f == -1) {
            int iO = O();
            if (i < 0) {
                return;
            }
            int iF = (this.f16416r.f() - i) + i10;
            if (this.f16419u) {
                for (int i11 = 0; i11 < iO; i11++) {
                    View viewN = N(i11);
                    if (this.f16416r.e(viewN) < iF || this.f16416r.n(viewN) < iF) {
                        v1(wVar, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = iO - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View viewN2 = N(i13);
                if (this.f16416r.e(viewN2) < iF || this.f16416r.n(viewN2) < iF) {
                    v1(wVar, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i14 = i - i10;
        int iO2 = O();
        if (!this.f16419u) {
            for (int i15 = 0; i15 < iO2; i15++) {
                View viewN3 = N(i15);
                if (this.f16416r.b(viewN3) > i14 || this.f16416r.m(viewN3) > i14) {
                    v1(wVar, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = iO2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View viewN4 = N(i17);
            if (this.f16416r.b(viewN4) > i14 || this.f16416r.m(viewN4) > i14) {
                v1(wVar, i16, i17);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v() {
        return this.f16414p == 0;
    }

    public final void v1(RecyclerView.w wVar, int i, int i10) {
        if (i == i10) {
            return;
        }
        if (i10 <= i) {
            while (i > i10) {
                View viewN = N(i);
                H0(i);
                wVar.i(viewN);
                i--;
            }
            return;
        }
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            View viewN2 = N(i11);
            H0(i11);
            wVar.i(viewN2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean w() {
        return this.f16414p == 1;
    }

    public final void w1() {
        if (this.f16414p == 1 || !r1()) {
            this.f16419u = this.f16418t;
        } else {
            this.f16419u = !this.f16418t;
        }
    }

    public final int x1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (O() != 0 && i != 0) {
            e1();
            this.f16415q.f16434a = true;
            int i10 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            A1(i10, iAbs, true, b10);
            c cVar = this.f16415q;
            int iF1 = f1(wVar, cVar, b10, false) + cVar.f16440g;
            if (iF1 >= 0) {
                if (iAbs > iF1) {
                    i = i10 * iF1;
                }
                this.f16416r.o(-i);
                this.f16415q.f16442j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y0(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.B r19) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.y0(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):void");
    }

    public final void y1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C4356c.h(i, "invalid orientation:"));
        }
        t(null);
        if (i != this.f16414p || this.f16416r == null) {
            A a10 = A.a(this, i);
            this.f16416r = a10;
            this.f16410A.f16425a = a10;
            this.f16414p = i;
            J0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public final void z(int i, int i10, RecyclerView.B b10, s.b bVar) {
        if (this.f16414p != 0) {
            i = i10;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        e1();
        A1(i > 0 ? 1 : -1, Math.abs(i), true, b10);
        Z0(b10, this.f16415q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void z0(RecyclerView.B b10) {
        this.f16424z = null;
        this.f16422x = -1;
        this.f16423y = RecyclerView.UNDEFINED_DURATION;
        this.f16410A.d();
    }

    public void z1(boolean z10) {
        t(null);
        if (this.f16420v == z10) {
            return;
        }
        this.f16420v = z10;
        J0();
    }

    public LinearLayoutManager(int i) {
        this.f16414p = 1;
        this.f16418t = false;
        this.f16419u = false;
        this.f16420v = false;
        this.f16421w = true;
        this.f16422x = -1;
        this.f16423y = RecyclerView.UNDEFINED_DURATION;
        this.f16424z = null;
        this.f16410A = new a();
        this.f16411B = new b();
        this.f16412C = 2;
        this.f16413D = new int[2];
        y1(i);
        t(null);
        if (this.f16418t) {
            this.f16418t = false;
            J0();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f16414p = 1;
        this.f16418t = false;
        this.f16419u = false;
        this.f16420v = false;
        this.f16421w = true;
        this.f16422x = -1;
        this.f16423y = RecyclerView.UNDEFINED_DURATION;
        this.f16424z = null;
        this.f16410A = new a();
        this.f16411B = new b();
        this.f16412C = 2;
        this.f16413D = new int[2];
        RecyclerView.p.c cVarC0 = RecyclerView.p.c0(context, attributeSet, i, i10);
        y1(cVarC0.f16514a);
        boolean z10 = cVarC0.f16516c;
        t(null);
        if (z10 != this.f16418t) {
            this.f16418t = z10;
            J0();
        }
        z1(cVarC0.f16517d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void n0(RecyclerView recyclerView, RecyclerView.w wVar) {
    }

    public void t1(RecyclerView.w wVar, RecyclerView.B b10, a aVar, int i) {
    }
}
