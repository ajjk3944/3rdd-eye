package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    int f31805A;

    /* renamed from: B, reason: collision with root package name */
    int f31806B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f31807C;

    /* renamed from: D, reason: collision with root package name */
    d f31808D;

    /* renamed from: E, reason: collision with root package name */
    final a f31809E;

    /* renamed from: F, reason: collision with root package name */
    private final b f31810F;

    /* renamed from: G, reason: collision with root package name */
    private int f31811G;

    /* renamed from: H, reason: collision with root package name */
    private int[] f31812H;

    /* renamed from: s, reason: collision with root package name */
    int f31813s;

    /* renamed from: t, reason: collision with root package name */
    private c f31814t;

    /* renamed from: u, reason: collision with root package name */
    i f31815u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31816v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f31817w;

    /* renamed from: x, reason: collision with root package name */
    boolean f31818x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f31819y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f31820z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        i f31821a;

        /* renamed from: b, reason: collision with root package name */
        int f31822b;

        /* renamed from: c, reason: collision with root package name */
        int f31823c;

        /* renamed from: d, reason: collision with root package name */
        boolean f31824d;

        /* renamed from: e, reason: collision with root package name */
        boolean f31825e;

        a() {
            e();
        }

        void a() {
            this.f31823c = this.f31824d ? this.f31821a.i() : this.f31821a.m();
        }

        public void b(View view, int i10) {
            if (this.f31824d) {
                this.f31823c = this.f31821a.d(view) + this.f31821a.o();
            } else {
                this.f31823c = this.f31821a.g(view);
            }
            this.f31822b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f31821a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f31822b = i10;
            if (this.f31824d) {
                int i11 = (this.f31821a.i() - iO) - this.f31821a.d(view);
                this.f31823c = this.f31821a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f31823c - this.f31821a.e(view);
                    int iM = this.f31821a.m();
                    int iMin = iE - (iM + Math.min(this.f31821a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f31823c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f31821a.g(view);
            int iM2 = iG - this.f31821a.m();
            this.f31823c = iG;
            if (iM2 > 0) {
                int i12 = (this.f31821a.i() - Math.min(0, (this.f31821a.i() - iO) - this.f31821a.d(view))) - (iG + this.f31821a.e(view));
                if (i12 < 0) {
                    this.f31823c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        void e() {
            this.f31822b = -1;
            this.f31823c = PduHandle.NONE;
            this.f31824d = false;
            this.f31825e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f31822b + ", mCoordinate=" + this.f31823c + ", mLayoutFromEnd=" + this.f31824d + ", mValid=" + this.f31825e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f31826a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f31827b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31828c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f31829d;

        protected b() {
        }

        void a() {
            this.f31826a = 0;
            this.f31827b = false;
            this.f31828c = false;
            this.f31829d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f31831b;

        /* renamed from: c, reason: collision with root package name */
        int f31832c;

        /* renamed from: d, reason: collision with root package name */
        int f31833d;

        /* renamed from: e, reason: collision with root package name */
        int f31834e;

        /* renamed from: f, reason: collision with root package name */
        int f31835f;

        /* renamed from: g, reason: collision with root package name */
        int f31836g;

        /* renamed from: k, reason: collision with root package name */
        int f31840k;

        /* renamed from: m, reason: collision with root package name */
        boolean f31842m;

        /* renamed from: a, reason: collision with root package name */
        boolean f31830a = true;

        /* renamed from: h, reason: collision with root package name */
        int f31837h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f31838i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f31839j = false;

        /* renamed from: l, reason: collision with root package name */
        List f31841l = null;

        c() {
        }

        private View e() {
            int size = this.f31841l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.C) this.f31841l.get(i10)).f31934a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f31833d == pVar.a()) {
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
            if (viewF == null) {
                this.f31833d = -1;
            } else {
                this.f31833d = ((RecyclerView.p) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.z zVar) {
            int i10 = this.f31833d;
            return i10 >= 0 && i10 < zVar.b();
        }

        View d(RecyclerView.u uVar) {
            if (this.f31841l != null) {
                return e();
            }
            View viewO = uVar.o(this.f31833d);
            this.f31833d += this.f31834e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f31841l.size();
            View view2 = null;
            int i10 = MPv3.MAX_MESSAGE_ID;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.C) this.f31841l.get(i11)).f31934a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f31833d) * this.f31834e) >= 0 && iA < i10) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f31843a;

        /* renamed from: b, reason: collision with root package name */
        int f31844b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31845c;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f31843a >= 0;
        }

        void b() {
            this.f31843a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f31843a);
            parcel.writeInt(this.f31844b);
            parcel.writeInt(this.f31845c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f31843a = parcel.readInt();
            this.f31844b = parcel.readInt();
            this.f31845c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f31843a = dVar.f31843a;
            this.f31844b = dVar.f31844b;
            this.f31845c = dVar.f31845c;
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f31813s = 1;
        this.f31817w = false;
        this.f31818x = false;
        this.f31819y = false;
        this.f31820z = true;
        this.f31805A = -1;
        this.f31806B = PduHandle.NONE;
        this.f31808D = null;
        this.f31809E = new a();
        this.f31810F = new b();
        this.f31811G = 2;
        this.f31812H = new int[2];
        G2(i10);
        H2(z10);
    }

    private void A2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                r1(i10, uVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                r1(i12, uVar);
            }
        }
    }

    private void B2(RecyclerView.u uVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f31815u.h() - i10) + i11;
        if (this.f31818x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f31815u.g(viewN) < iH || this.f31815u.q(viewN) < iH) {
                    A2(uVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f31815u.g(viewN2) < iH || this.f31815u.q(viewN2) < iH) {
                A2(uVar, i13, i14);
                return;
            }
        }
    }

    private void C2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f31818x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f31815u.d(viewN) > i12 || this.f31815u.p(viewN) > i12) {
                    A2(uVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f31815u.d(viewN2) > i12 || this.f31815u.p(viewN2) > i12) {
                A2(uVar, i14, i15);
                return;
            }
        }
    }

    private void E2() {
        if (this.f31813s == 1 || !u2()) {
            this.f31818x = this.f31817w;
        } else {
            this.f31818x = !this.f31817w;
        }
    }

    private boolean J2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, zVar)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        if (this.f31816v != this.f31819y) {
            return false;
        }
        View viewM2 = aVar.f31824d ? m2(uVar, zVar) : n2(uVar, zVar);
        if (viewM2 == null) {
            return false;
        }
        aVar.b(viewM2, l0(viewM2));
        if (!zVar.e() && P1() && (this.f31815u.g(viewM2) >= this.f31815u.i() || this.f31815u.d(viewM2) < this.f31815u.m())) {
            aVar.f31823c = aVar.f31824d ? this.f31815u.i() : this.f31815u.m();
        }
        return true;
    }

    private boolean K2(RecyclerView.z zVar, a aVar) {
        int i10;
        if (!zVar.e() && (i10 = this.f31805A) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                aVar.f31822b = this.f31805A;
                d dVar = this.f31808D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.f31808D.f31845c;
                    aVar.f31824d = z10;
                    if (z10) {
                        aVar.f31823c = this.f31815u.i() - this.f31808D.f31844b;
                    } else {
                        aVar.f31823c = this.f31815u.m() + this.f31808D.f31844b;
                    }
                    return true;
                }
                if (this.f31806B != Integer.MIN_VALUE) {
                    boolean z11 = this.f31818x;
                    aVar.f31824d = z11;
                    if (z11) {
                        aVar.f31823c = this.f31815u.i() - this.f31806B;
                    } else {
                        aVar.f31823c = this.f31815u.m() + this.f31806B;
                    }
                    return true;
                }
                View viewH = H(this.f31805A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f31824d = (this.f31805A < l0(N(0))) == this.f31818x;
                    }
                    aVar.a();
                } else {
                    if (this.f31815u.e(viewH) > this.f31815u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f31815u.g(viewH) - this.f31815u.m() < 0) {
                        aVar.f31823c = this.f31815u.m();
                        aVar.f31824d = false;
                        return true;
                    }
                    if (this.f31815u.i() - this.f31815u.d(viewH) < 0) {
                        aVar.f31823c = this.f31815u.i();
                        aVar.f31824d = true;
                        return true;
                    }
                    aVar.f31823c = aVar.f31824d ? this.f31815u.d(viewH) + this.f31815u.o() : this.f31815u.g(viewH);
                }
                return true;
            }
            this.f31805A = -1;
            this.f31806B = PduHandle.NONE;
        }
        return false;
    }

    private void L2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (K2(zVar, aVar) || J2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f31822b = this.f31819y ? zVar.b() - 1 : 0;
    }

    private void M2(int i10, int i11, boolean z10, RecyclerView.z zVar) {
        int iM;
        this.f31814t.f31842m = D2();
        this.f31814t.f31835f = i10;
        int[] iArr = this.f31812H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int iMax = Math.max(0, this.f31812H[0]);
        int iMax2 = Math.max(0, this.f31812H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f31814t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f31837h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f31838i = iMax;
        if (z11) {
            cVar.f31837h = i12 + this.f31815u.j();
            View viewQ2 = q2();
            c cVar2 = this.f31814t;
            cVar2.f31834e = this.f31818x ? -1 : 1;
            int iL0 = l0(viewQ2);
            c cVar3 = this.f31814t;
            cVar2.f31833d = iL0 + cVar3.f31834e;
            cVar3.f31831b = this.f31815u.d(viewQ2);
            iM = this.f31815u.d(viewQ2) - this.f31815u.i();
        } else {
            View viewR2 = r2();
            this.f31814t.f31837h += this.f31815u.m();
            c cVar4 = this.f31814t;
            cVar4.f31834e = this.f31818x ? 1 : -1;
            int iL02 = l0(viewR2);
            c cVar5 = this.f31814t;
            cVar4.f31833d = iL02 + cVar5.f31834e;
            cVar5.f31831b = this.f31815u.g(viewR2);
            iM = (-this.f31815u.g(viewR2)) + this.f31815u.m();
        }
        c cVar6 = this.f31814t;
        cVar6.f31832c = i11;
        if (z10) {
            cVar6.f31832c = i11 - iM;
        }
        cVar6.f31836g = iM;
    }

    private void N2(int i10, int i11) {
        this.f31814t.f31832c = this.f31815u.i() - i11;
        c cVar = this.f31814t;
        cVar.f31834e = this.f31818x ? -1 : 1;
        cVar.f31833d = i10;
        cVar.f31835f = 1;
        cVar.f31831b = i11;
        cVar.f31836g = PduHandle.NONE;
    }

    private void O2(a aVar) {
        N2(aVar.f31822b, aVar.f31823c);
    }

    private void P2(int i10, int i11) {
        this.f31814t.f31832c = i11 - this.f31815u.m();
        c cVar = this.f31814t;
        cVar.f31833d = i10;
        cVar.f31834e = this.f31818x ? 1 : -1;
        cVar.f31835f = -1;
        cVar.f31831b = i11;
        cVar.f31836g = PduHandle.NONE;
    }

    private void Q2(a aVar) {
        P2(aVar.f31822b, aVar.f31823c);
    }

    private int S1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.a(zVar, this.f31815u, c2(!this.f31820z, true), b2(!this.f31820z, true), this, this.f31820z);
    }

    private int T1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.b(zVar, this.f31815u, c2(!this.f31820z, true), b2(!this.f31820z, true), this, this.f31820z, this.f31818x);
    }

    private int U1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return m.c(zVar, this.f31815u, c2(!this.f31820z, true), b2(!this.f31820z, true), this, this.f31820z);
    }

    private View Z1() {
        return h2(0, O());
    }

    private View a2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, 0, O(), zVar.b());
    }

    private View e2() {
        return h2(O() - 1, -1);
    }

    private View f2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, O() - 1, -1, zVar.b());
    }

    private View j2() {
        return this.f31818x ? Z1() : e2();
    }

    private View k2() {
        return this.f31818x ? e2() : Z1();
    }

    private View m2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f31818x ? a2(uVar, zVar) : f2(uVar, zVar);
    }

    private View n2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f31818x ? f2(uVar, zVar) : a2(uVar, zVar);
    }

    private int o2(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int i11;
        int i12 = this.f31815u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -F2(-i12, uVar, zVar);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f31815u.i() - i14) <= 0) {
            return i13;
        }
        this.f31815u.r(i11);
        return i11 + i13;
    }

    private int p2(int i10, RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int iM;
        int iM2 = i10 - this.f31815u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -F2(iM2, uVar, zVar);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f31815u.m()) <= 0) {
            return i11;
        }
        this.f31815u.r(-iM);
        return i11 - iM;
    }

    private View q2() {
        return N(this.f31818x ? 0 : O() - 1);
    }

    private View r2() {
        return N(this.f31818x ? O() - 1 : 0);
    }

    private void x2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11) {
        if (!zVar.g() || O() == 0 || zVar.e() || !P1()) {
            return;
        }
        List listK = uVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C c10 = (RecyclerView.C) listK.get(i12);
            if (!c10.v()) {
                if ((c10.m() < iL0) != this.f31818x) {
                    iE += this.f31815u.e(c10.f31934a);
                } else {
                    iE2 += this.f31815u.e(c10.f31934a);
                }
            }
        }
        this.f31814t.f31841l = listK;
        if (iE > 0) {
            P2(l0(r2()), i10);
            c cVar = this.f31814t;
            cVar.f31837h = iE;
            cVar.f31832c = 0;
            cVar.a();
            Y1(uVar, this.f31814t, zVar, false);
        }
        if (iE2 > 0) {
            N2(l0(q2()), i11);
            c cVar2 = this.f31814t;
            cVar2.f31837h = iE2;
            cVar2.f31832c = 0;
            cVar2.a();
            Y1(uVar, this.f31814t, zVar, false);
        }
        this.f31814t.f31841l = null;
    }

    private void z2(RecyclerView.u uVar, c cVar) {
        if (!cVar.f31830a || cVar.f31842m) {
            return;
        }
        int i10 = cVar.f31836g;
        int i11 = cVar.f31838i;
        if (cVar.f31835f == -1) {
            B2(uVar, i10, i11);
        } else {
            C2(uVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f31813s == 1) {
            return 0;
        }
        return F2(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i10) {
        this.f31805A = i10;
        this.f31806B = PduHandle.NONE;
        d dVar = this.f31808D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f31813s == 0) {
            return 0;
        }
        return F2(i10, uVar, zVar);
    }

    boolean D2() {
        return this.f31815u.k() == 0 && this.f31815u.h() == 0;
    }

    int F2(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        X1();
        this.f31814t.f31830a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        M2(i11, iAbs, true, zVar);
        c cVar = this.f31814t;
        int iY1 = cVar.f31836g + Y1(uVar, cVar, zVar, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i10 = i11 * iY1;
        }
        this.f31815u.r(-i10);
        this.f31814t.f31840k = i10;
        return i10;
    }

    public void G2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        h(null);
        if (i10 != this.f31813s || this.f31815u == null) {
            i iVarB = i.b(this, i10);
            this.f31815u = iVarB;
            this.f31809E.f31821a = iVarB;
            this.f31813s = i10;
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    public void H2(boolean z10) {
        h(null);
        if (z10 == this.f31817w) {
            return;
        }
        this.f31817w = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public void I2(boolean z10) {
        h(null);
        if (this.f31819y == z10) {
            return;
        }
        this.f31819y = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        if (this.f31807C) {
            o1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iV1;
        E2();
        if (O() == 0 || (iV1 = V1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        M2(iV1, (int) (this.f31815u.n() * 0.33333334f), false, zVar);
        c cVar = this.f31814t;
        cVar.f31836g = PduHandle.NONE;
        cVar.f31830a = false;
        Y1(uVar, cVar, zVar, true);
        View viewK2 = iV1 == -1 ? k2() : j2();
        View viewR2 = iV1 == -1 ? r2() : q2();
        if (!viewR2.hasFocusable()) {
            return viewK2;
        }
        if (viewK2 == null) {
            return null;
        }
        return viewR2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f31808D == null && this.f31816v == this.f31819y;
    }

    protected void Q1(RecyclerView.z zVar, int[] iArr) {
        int i10;
        int iS2 = s2(zVar);
        if (this.f31814t.f31835f == -1) {
            i10 = 0;
        } else {
            i10 = iS2;
            iS2 = 0;
        }
        iArr[0] = iS2;
        iArr[1] = i10;
    }

    void R1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f31833d;
        if (i10 < 0 || i10 >= zVar.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f31836g));
    }

    int V1(int i10) {
        if (i10 == 1) {
            return (this.f31813s != 1 && u2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f31813s != 1 && u2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f31813s == 0) {
                return -1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 33) {
            if (this.f31813s == 1) {
                return -1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 66) {
            if (this.f31813s == 0) {
                return 1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 130 && this.f31813s == 1) {
            return 1;
        }
        return PduHandle.NONE;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f31814t == null) {
            this.f31814t = W1();
        }
    }

    int Y1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z10) {
        int i10 = cVar.f31832c;
        int i11 = cVar.f31836g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f31836g = i11 + i10;
            }
            z2(uVar, cVar);
        }
        int i12 = cVar.f31832c + cVar.f31837h;
        b bVar = this.f31810F;
        while (true) {
            if ((!cVar.f31842m && i12 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            w2(uVar, zVar, cVar, bVar);
            if (!bVar.f31827b) {
                cVar.f31831b += bVar.f31826a * cVar.f31835f;
                if (!bVar.f31828c || cVar.f31841l != null || !zVar.e()) {
                    int i13 = cVar.f31832c;
                    int i14 = bVar.f31826a;
                    cVar.f31832c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f31836g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f31826a;
                    cVar.f31836g = i16;
                    int i17 = cVar.f31832c;
                    if (i17 < 0) {
                        cVar.f31836g = i16 + i17;
                    }
                    z2(uVar, cVar);
                }
                if (z10 && bVar.f31829d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f31832c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF b(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f31818x ? -1 : 1;
        return this.f31813s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iO2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f31808D == null && this.f31805A == -1) && zVar.b() == 0) {
            o1(uVar);
            return;
        }
        d dVar = this.f31808D;
        if (dVar != null && dVar.a()) {
            this.f31805A = this.f31808D.f31843a;
        }
        X1();
        this.f31814t.f31830a = false;
        E2();
        View viewA0 = a0();
        a aVar = this.f31809E;
        if (!aVar.f31825e || this.f31805A != -1 || this.f31808D != null) {
            aVar.e();
            a aVar2 = this.f31809E;
            aVar2.f31824d = this.f31818x ^ this.f31819y;
            L2(uVar, zVar, aVar2);
            this.f31809E.f31825e = true;
        } else if (viewA0 != null && (this.f31815u.g(viewA0) >= this.f31815u.i() || this.f31815u.d(viewA0) <= this.f31815u.m())) {
            this.f31809E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f31814t;
        cVar.f31835f = cVar.f31840k >= 0 ? 1 : -1;
        int[] iArr = this.f31812H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int iMax = Math.max(0, this.f31812H[0]) + this.f31815u.m();
        int iMax2 = Math.max(0, this.f31812H[1]) + this.f31815u.j();
        if (zVar.e() && (i14 = this.f31805A) != -1 && this.f31806B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f31818x) {
                i15 = this.f31815u.i() - this.f31815u.d(viewH);
                iG = this.f31806B;
            } else {
                iG = this.f31815u.g(viewH) - this.f31815u.m();
                i15 = this.f31806B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f31809E;
        if (!aVar3.f31824d ? !this.f31818x : this.f31818x) {
            i16 = 1;
        }
        y2(uVar, zVar, aVar3, i16);
        B(uVar);
        this.f31814t.f31842m = D2();
        this.f31814t.f31839j = zVar.e();
        this.f31814t.f31838i = 0;
        a aVar4 = this.f31809E;
        if (aVar4.f31824d) {
            Q2(aVar4);
            c cVar2 = this.f31814t;
            cVar2.f31837h = iMax;
            Y1(uVar, cVar2, zVar, false);
            c cVar3 = this.f31814t;
            i11 = cVar3.f31831b;
            int i18 = cVar3.f31833d;
            int i19 = cVar3.f31832c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            O2(this.f31809E);
            c cVar4 = this.f31814t;
            cVar4.f31837h = iMax2;
            cVar4.f31833d += cVar4.f31834e;
            Y1(uVar, cVar4, zVar, false);
            c cVar5 = this.f31814t;
            i10 = cVar5.f31831b;
            int i20 = cVar5.f31832c;
            if (i20 > 0) {
                P2(i18, i11);
                c cVar6 = this.f31814t;
                cVar6.f31837h = i20;
                Y1(uVar, cVar6, zVar, false);
                i11 = this.f31814t.f31831b;
            }
        } else {
            O2(aVar4);
            c cVar7 = this.f31814t;
            cVar7.f31837h = iMax2;
            Y1(uVar, cVar7, zVar, false);
            c cVar8 = this.f31814t;
            i10 = cVar8.f31831b;
            int i21 = cVar8.f31833d;
            int i22 = cVar8.f31832c;
            if (i22 > 0) {
                iMax += i22;
            }
            Q2(this.f31809E);
            c cVar9 = this.f31814t;
            cVar9.f31837h = iMax;
            cVar9.f31833d += cVar9.f31834e;
            Y1(uVar, cVar9, zVar, false);
            c cVar10 = this.f31814t;
            i11 = cVar10.f31831b;
            int i23 = cVar10.f31832c;
            if (i23 > 0) {
                N2(i21, i10);
                c cVar11 = this.f31814t;
                cVar11.f31837h = i23;
                Y1(uVar, cVar11, zVar, false);
                i10 = this.f31814t.f31831b;
            }
        }
        if (O() > 0) {
            if (this.f31818x ^ this.f31819y) {
                int iO22 = o2(i10, uVar, zVar, true);
                i12 = i11 + iO22;
                i13 = i10 + iO22;
                iO2 = p2(i12, uVar, zVar, false);
            } else {
                int iP2 = p2(i11, uVar, zVar, true);
                i12 = i11 + iP2;
                i13 = i10 + iP2;
                iO2 = o2(i13, uVar, zVar, false);
            }
            i11 = i12 + iO2;
            i10 = i13 + iO2;
        }
        x2(uVar, zVar, i11, i10);
        if (zVar.e()) {
            this.f31809E.e();
        } else {
            this.f31815u.s();
        }
        this.f31816v = this.f31819y;
    }

    View b2(boolean z10, boolean z11) {
        return this.f31818x ? i2(0, O(), z10, z11) : i2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f31808D = null;
        this.f31805A = -1;
        this.f31806B = PduHandle.NONE;
        this.f31809E.e();
    }

    View c2(boolean z10, boolean z11) {
        return this.f31818x ? i2(O() - 1, -1, z10, z11) : i2(0, O(), z10, z11);
    }

    public int d2() {
        View viewI2 = i2(0, O(), false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f31808D = (d) parcelable;
            x1();
        }
    }

    public int g2() {
        View viewI2 = i2(O() - 1, -1, false, true);
        if (viewI2 == null) {
            return -1;
        }
        return l0(viewI2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h(String str) {
        if (this.f31808D == null) {
            super.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable h1() {
        if (this.f31808D != null) {
            return new d(this.f31808D);
        }
        d dVar = new d();
        if (O() > 0) {
            X1();
            boolean z10 = this.f31816v ^ this.f31818x;
            dVar.f31845c = z10;
            if (z10) {
                View viewQ2 = q2();
                dVar.f31844b = this.f31815u.i() - this.f31815u.d(viewQ2);
                dVar.f31843a = l0(viewQ2);
            } else {
                View viewR2 = r2();
                dVar.f31843a = l0(viewR2);
                dVar.f31844b = this.f31815u.g(viewR2) - this.f31815u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View h2(int i10, int i11) {
        int i12;
        int i13;
        X1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f31815u.g(N(i10)) < this.f31815u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f31813s == 0 ? this.f31974e.a(i10, i11, i12, i13) : this.f31975f.a(i10, i11, i12, i13);
    }

    View i2(int i10, int i11, boolean z10, boolean z11) {
        X1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f31813s == 0 ? this.f31974e.a(i10, i11, i12, i13) : this.f31975f.a(i10, i11, i12, i13);
    }

    View l2(RecyclerView.u uVar, RecyclerView.z zVar, int i10, int i11, int i12) {
        X1();
        int iM = this.f31815u.m();
        int i13 = this.f31815u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewN = N(i10);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < i12) {
                if (((RecyclerView.p) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f31815u.g(viewN) < i13 && this.f31815u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.f31813s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.f31813s == 1;
    }

    protected int s2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f31815u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f31813s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        X1();
        M2(i10 > 0 ? 1 : -1, Math.abs(i10), true, zVar);
        R1(zVar, this.f31814t, cVar);
    }

    public int t2() {
        return this.f31813s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f31808D;
        if (dVar == null || !dVar.a()) {
            E2();
            z10 = this.f31818x;
            i11 = this.f31805A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f31808D;
            z10 = dVar2.f31845c;
            i11 = dVar2.f31843a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f31811G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    protected boolean u2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return S1(zVar);
    }

    public boolean v2() {
        return this.f31820z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return T1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    void w2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int iI0;
        int iF;
        View viewD = cVar.d(uVar);
        if (viewD == null) {
            bVar.f31827b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f31841l == null) {
            if (this.f31818x == (cVar.f31835f == -1)) {
                e(viewD);
            } else {
                f(viewD, 0);
            }
        } else {
            if (this.f31818x == (cVar.f31835f == -1)) {
                c(viewD);
            } else {
                d(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f31826a = this.f31815u.e(viewD);
        if (this.f31813s == 1) {
            if (u2()) {
                iF = s0() - j0();
                iI0 = iF - this.f31815u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f31815u.f(viewD) + iI0;
            }
            if (cVar.f31835f == -1) {
                int i13 = cVar.f31831b;
                i12 = i13;
                i11 = iF;
                i10 = i13 - bVar.f31826a;
            } else {
                int i14 = cVar.f31831b;
                i10 = i14;
                i11 = iF;
                i12 = bVar.f31826a + i14;
            }
        } else {
            int iK0 = k0();
            int iF2 = this.f31815u.f(viewD) + iK0;
            if (cVar.f31835f == -1) {
                int i15 = cVar.f31831b;
                i11 = i15;
                i10 = iK0;
                i12 = iF2;
                iI0 = i15 - bVar.f31826a;
            } else {
                int i16 = cVar.f31831b;
                i10 = iK0;
                i11 = bVar.f31826a + i16;
                i12 = iF2;
                iI0 = i16;
            }
        }
        D0(viewD, iI0, i10, i11, i12);
        if (pVar.c() || pVar.b()) {
            bVar.f31828c = true;
        }
        bVar.f31829d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return S1(zVar);
    }

    void y2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return T1(zVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f31813s = 1;
        this.f31817w = false;
        this.f31818x = false;
        this.f31819y = false;
        this.f31820z = true;
        this.f31805A = -1;
        this.f31806B = PduHandle.NONE;
        this.f31808D = null;
        this.f31809E = new a();
        this.f31810F = new b();
        this.f31811G = 2;
        this.f31812H = new int[2];
        RecyclerView.o.d dVarM0 = RecyclerView.o.m0(context, attributeSet, i10, i11);
        G2(dVarM0.f31990a);
        H2(dVarM0.f31992c);
        I2(dVarM0.f31993d);
    }
}
