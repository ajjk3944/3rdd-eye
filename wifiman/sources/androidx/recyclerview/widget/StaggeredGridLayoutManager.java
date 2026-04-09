package androidx.recyclerview.widget;

import G1.t;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: B, reason: collision with root package name */
    private BitSet f32047B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f32052G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32053H;

    /* renamed from: I, reason: collision with root package name */
    private e f32054I;

    /* renamed from: J, reason: collision with root package name */
    private int f32055J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f32060O;

    /* renamed from: t, reason: collision with root package name */
    f[] f32063t;

    /* renamed from: u, reason: collision with root package name */
    i f32064u;

    /* renamed from: v, reason: collision with root package name */
    i f32065v;

    /* renamed from: w, reason: collision with root package name */
    private int f32066w;

    /* renamed from: x, reason: collision with root package name */
    private int f32067x;

    /* renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f32068y;

    /* renamed from: s, reason: collision with root package name */
    private int f32062s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f32069z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f32046A = false;

    /* renamed from: C, reason: collision with root package name */
    int f32048C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f32049D = PduHandle.NONE;

    /* renamed from: E, reason: collision with root package name */
    d f32050E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f32051F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f32056K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f32057L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f32058M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f32059N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f32061P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f32071a;

        /* renamed from: b, reason: collision with root package name */
        int f32072b;

        /* renamed from: c, reason: collision with root package name */
        boolean f32073c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32074d;

        /* renamed from: e, reason: collision with root package name */
        boolean f32075e;

        /* renamed from: f, reason: collision with root package name */
        int[] f32076f;

        b() {
            c();
        }

        void a() {
            this.f32072b = this.f32073c ? StaggeredGridLayoutManager.this.f32064u.i() : StaggeredGridLayoutManager.this.f32064u.m();
        }

        void b(int i10) {
            if (this.f32073c) {
                this.f32072b = StaggeredGridLayoutManager.this.f32064u.i() - i10;
            } else {
                this.f32072b = StaggeredGridLayoutManager.this.f32064u.m() + i10;
            }
        }

        void c() {
            this.f32071a = -1;
            this.f32072b = PduHandle.NONE;
            this.f32073c = false;
            this.f32074d = false;
            this.f32075e = false;
            int[] iArr = this.f32076f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f32076f;
            if (iArr == null || iArr.length < length) {
                this.f32076f = new int[StaggeredGridLayoutManager.this.f32063t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f32076f[i10] = fVarArr[i10].p(PduHandle.NONE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        f f32078e;

        /* renamed from: f, reason: collision with root package name */
        boolean f32079f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f32078e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f32100e;
        }

        public boolean f() {
            return this.f32079f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f32086a;

        /* renamed from: b, reason: collision with root package name */
        int f32087b;

        /* renamed from: c, reason: collision with root package name */
        int f32088c;

        /* renamed from: d, reason: collision with root package name */
        int[] f32089d;

        /* renamed from: e, reason: collision with root package name */
        int f32090e;

        /* renamed from: f, reason: collision with root package name */
        int[] f32091f;

        /* renamed from: g, reason: collision with root package name */
        List f32092g;

        /* renamed from: h, reason: collision with root package name */
        boolean f32093h;

        /* renamed from: i, reason: collision with root package name */
        boolean f32094i;

        /* renamed from: j, reason: collision with root package name */
        boolean f32095j;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f32089d = null;
            this.f32088c = 0;
            this.f32086a = -1;
            this.f32087b = -1;
        }

        void b() {
            this.f32089d = null;
            this.f32088c = 0;
            this.f32090e = 0;
            this.f32091f = null;
            this.f32092g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f32086a);
            parcel.writeInt(this.f32087b);
            parcel.writeInt(this.f32088c);
            if (this.f32088c > 0) {
                parcel.writeIntArray(this.f32089d);
            }
            parcel.writeInt(this.f32090e);
            if (this.f32090e > 0) {
                parcel.writeIntArray(this.f32091f);
            }
            parcel.writeInt(this.f32093h ? 1 : 0);
            parcel.writeInt(this.f32094i ? 1 : 0);
            parcel.writeInt(this.f32095j ? 1 : 0);
            parcel.writeList(this.f32092g);
        }

        e(Parcel parcel) {
            this.f32086a = parcel.readInt();
            this.f32087b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f32088c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f32089d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f32090e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f32091f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f32093h = parcel.readInt() == 1;
            this.f32094i = parcel.readInt() == 1;
            this.f32095j = parcel.readInt() == 1;
            this.f32092g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f32088c = eVar.f32088c;
            this.f32086a = eVar.f32086a;
            this.f32087b = eVar.f32087b;
            this.f32089d = eVar.f32089d;
            this.f32090e = eVar.f32090e;
            this.f32091f = eVar.f32091f;
            this.f32093h = eVar.f32093h;
            this.f32094i = eVar.f32094i;
            this.f32095j = eVar.f32095j;
            this.f32092g = eVar.f32092g;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f32096a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f32097b = PduHandle.NONE;

        /* renamed from: c, reason: collision with root package name */
        int f32098c = PduHandle.NONE;

        /* renamed from: d, reason: collision with root package name */
        int f32099d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f32100e;

        f(int i10) {
            this.f32100e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f32078e = this;
            this.f32096a.add(view);
            this.f32098c = PduHandle.NONE;
            if (this.f32096a.size() == 1) {
                this.f32097b = PduHandle.NONE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f32099d += StaggeredGridLayoutManager.this.f32064u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(PduHandle.NONE) : p(PduHandle.NONE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f32064u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f32064u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f32098c = iL;
                    this.f32097b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f32096a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f32098c = StaggeredGridLayoutManager.this.f32064u.d(view);
            if (cVarN.f32079f && (aVarF = StaggeredGridLayoutManager.this.f32050E.f(cVarN.a())) != null && aVarF.f32083b == 1) {
                this.f32098c += aVarF.a(this.f32100e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f32096a.get(0);
            c cVarN = n(view);
            this.f32097b = StaggeredGridLayoutManager.this.f32064u.g(view);
            if (cVarN.f32079f && (aVarF = StaggeredGridLayoutManager.this.f32050E.f(cVarN.a())) != null && aVarF.f32083b == -1) {
                this.f32097b -= aVarF.a(this.f32100e);
            }
        }

        void e() {
            this.f32096a.clear();
            q();
            this.f32099d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f32069z ? i(this.f32096a.size() - 1, -1, true) : i(0, this.f32096a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f32069z ? i(0, this.f32096a.size(), true) : i(this.f32096a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f32064u.m();
            int i12 = StaggeredGridLayoutManager.this.f32064u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f32096a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f32064u.g(view);
                int iD = StaggeredGridLayoutManager.this.f32064u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f32099d;
        }

        int k() {
            int i10 = this.f32098c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f32098c;
        }

        int l(int i10) {
            int i11 = this.f32098c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f32096a.size() == 0) {
                return i10;
            }
            c();
            return this.f32098c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f32096a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f32096a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f32069z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f32069z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f32096a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = (View) this.f32096a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f32069z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f32069z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f32097b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f32097b;
        }

        int p(int i10) {
            int i11 = this.f32097b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f32096a.size() == 0) {
                return i10;
            }
            d();
            return this.f32097b;
        }

        void q() {
            this.f32097b = PduHandle.NONE;
            this.f32098c = PduHandle.NONE;
        }

        void r(int i10) {
            int i11 = this.f32097b;
            if (i11 != Integer.MIN_VALUE) {
                this.f32097b = i11 + i10;
            }
            int i12 = this.f32098c;
            if (i12 != Integer.MIN_VALUE) {
                this.f32098c = i12 + i10;
            }
        }

        void s() {
            int size = this.f32096a.size();
            View view = (View) this.f32096a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f32078e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f32099d -= StaggeredGridLayoutManager.this.f32064u.e(view);
            }
            if (size == 1) {
                this.f32097b = PduHandle.NONE;
            }
            this.f32098c = PduHandle.NONE;
        }

        void t() {
            View view = (View) this.f32096a.remove(0);
            c cVarN = n(view);
            cVarN.f32078e = null;
            if (this.f32096a.size() == 0) {
                this.f32098c = PduHandle.NONE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f32099d -= StaggeredGridLayoutManager.this.f32064u.e(view);
            }
            this.f32097b = PduHandle.NONE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f32078e = this;
            this.f32096a.add(0, view);
            this.f32097b = PduHandle.NONE;
            if (this.f32096a.size() == 1) {
                this.f32098c = PduHandle.NONE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f32099d += StaggeredGridLayoutManager.this.f32064u.e(view);
            }
        }

        void v(int i10) {
            this.f32097b = i10;
            this.f32098c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d dVarM0 = RecyclerView.o.m0(context, attributeSet, i10, i11);
        L2(dVarM0.f31990a);
        N2(dVarM0.f31991b);
        M2(dVarM0.f31992c);
        this.f32068y = new androidx.recyclerview.widget.f();
        e2();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean B2(int i10) {
        if (this.f32066w == 0) {
            return (i10 == -1) != this.f32046A;
        }
        return ((i10 == -1) == this.f32046A) == x2();
    }

    private void D2(View view) {
        for (int i10 = this.f32062s - 1; i10 >= 0; i10--) {
            this.f32063t[i10].u(view);
        }
    }

    private void E2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.f32221a || fVar.f32229i) {
            return;
        }
        if (fVar.f32222b == 0) {
            if (fVar.f32225e == -1) {
                F2(uVar, fVar.f32227g);
                return;
            } else {
                G2(uVar, fVar.f32226f);
                return;
            }
        }
        if (fVar.f32225e != -1) {
            int iR2 = r2(fVar.f32227g) - fVar.f32227g;
            G2(uVar, iR2 < 0 ? fVar.f32226f : Math.min(iR2, fVar.f32222b) + fVar.f32226f);
        } else {
            int i10 = fVar.f32226f;
            int iQ2 = i10 - q2(i10);
            F2(uVar, iQ2 < 0 ? fVar.f32227g : fVar.f32227g - Math.min(iQ2, fVar.f32222b));
        }
    }

    private void F2(RecyclerView.u uVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f32064u.g(viewN) < i10 || this.f32064u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f32079f) {
                for (int i11 = 0; i11 < this.f32062s; i11++) {
                    if (this.f32063t[i11].f32096a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f32062s; i12++) {
                    this.f32063t[i12].s();
                }
            } else if (cVar.f32078e.f32096a.size() == 1) {
                return;
            } else {
                cVar.f32078e.s();
            }
            q1(viewN, uVar);
        }
    }

    private void G2(RecyclerView.u uVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f32064u.d(viewN) > i10 || this.f32064u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f32079f) {
                for (int i11 = 0; i11 < this.f32062s; i11++) {
                    if (this.f32063t[i11].f32096a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f32062s; i12++) {
                    this.f32063t[i12].t();
                }
            } else if (cVar.f32078e.f32096a.size() == 1) {
                return;
            } else {
                cVar.f32078e.t();
            }
            q1(viewN, uVar);
        }
    }

    private void H2() {
        if (this.f32065v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f32065v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f32062s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f32067x;
        int iRound = Math.round(fMax * this.f32062s);
        if (this.f32065v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f32065v.n());
        }
        T2(iRound);
        if (this.f32067x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f32079f) {
                if (x2() && this.f32066w == 1) {
                    int i13 = this.f32062s;
                    int i14 = cVar.f32078e.f32100e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f32067x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f32078e.f32100e;
                    int i16 = this.f32067x * i15;
                    int i17 = i15 * i11;
                    if (this.f32066w == 1) {
                        viewN2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewN2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void I2() {
        if (this.f32066w == 1 || !x2()) {
            this.f32046A = this.f32069z;
        } else {
            this.f32046A = !this.f32069z;
        }
    }

    private void K2(int i10) {
        androidx.recyclerview.widget.f fVar = this.f32068y;
        fVar.f32225e = i10;
        fVar.f32224d = this.f32046A != (i10 == -1) ? -1 : 1;
    }

    private void O2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f32062s; i12++) {
            if (!this.f32063t[i12].f32096a.isEmpty()) {
                U2(this.f32063t[i12], i10, i11);
            }
        }
    }

    private boolean P2(RecyclerView.z zVar, b bVar) {
        bVar.f32071a = this.f32052G ? k2(zVar.b()) : g2(zVar.b());
        bVar.f32072b = PduHandle.NONE;
        return true;
    }

    private void Q1(View view) {
        for (int i10 = this.f32062s - 1; i10 >= 0; i10--) {
            this.f32063t[i10].a(view);
        }
    }

    private void R1(b bVar) {
        e eVar = this.f32054I;
        int i10 = eVar.f32088c;
        if (i10 > 0) {
            if (i10 == this.f32062s) {
                for (int i11 = 0; i11 < this.f32062s; i11++) {
                    this.f32063t[i11].e();
                    e eVar2 = this.f32054I;
                    int i12 = eVar2.f32089d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f32094i ? this.f32064u.i() : this.f32064u.m();
                    }
                    this.f32063t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f32054I;
                eVar3.f32086a = eVar3.f32087b;
            }
        }
        e eVar4 = this.f32054I;
        this.f32053H = eVar4.f32095j;
        M2(eVar4.f32093h);
        I2();
        e eVar5 = this.f32054I;
        int i13 = eVar5.f32086a;
        if (i13 != -1) {
            this.f32048C = i13;
            bVar.f32073c = eVar5.f32094i;
        } else {
            bVar.f32073c = this.f32046A;
        }
        if (eVar5.f32090e > 1) {
            d dVar = this.f32050E;
            dVar.f32080a = eVar5.f32091f;
            dVar.f32081b = eVar5.f32092g;
        }
    }

    private void S2(int i10, RecyclerView.z zVar) {
        int iN;
        int iN2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f32068y;
        boolean z10 = false;
        fVar.f32222b = 0;
        fVar.f32223c = i10;
        if (!B0() || (iC = zVar.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f32046A == (iC < i10)) {
                iN = this.f32064u.n();
                iN2 = 0;
            } else {
                iN2 = this.f32064u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f32068y.f32226f = this.f32064u.m() - iN2;
            this.f32068y.f32227g = this.f32064u.i() + iN;
        } else {
            this.f32068y.f32227g = this.f32064u.h() + iN;
            this.f32068y.f32226f = -iN2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f32068y;
        fVar2.f32228h = false;
        fVar2.f32221a = true;
        if (this.f32064u.k() == 0 && this.f32064u.h() == 0) {
            z10 = true;
        }
        fVar2.f32229i = z10;
    }

    private void U1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f32225e == 1) {
            if (cVar.f32079f) {
                Q1(view);
                return;
            } else {
                cVar.f32078e.a(view);
                return;
            }
        }
        if (cVar.f32079f) {
            D2(view);
        } else {
            cVar.f32078e.u(view);
        }
    }

    private void U2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f32047B.set(fVar.f32100e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f32047B.set(fVar.f32100e, false);
        }
    }

    private int V1(int i10) {
        if (O() == 0) {
            return this.f32046A ? 1 : -1;
        }
        return (i10 < n2()) != this.f32046A ? -1 : 1;
    }

    private int V2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean X1(f fVar) {
        if (this.f32046A) {
            if (fVar.k() < this.f32064u.i()) {
                ArrayList arrayList = fVar.f32096a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f32079f;
            }
        } else if (fVar.o() > this.f32064u.m()) {
            return !fVar.n((View) fVar.f32096a.get(0)).f32079f;
        }
        return false;
    }

    private int Y1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return m.a(zVar, this.f32064u, i2(!this.f32059N), h2(!this.f32059N), this, this.f32059N);
    }

    private int Z1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return m.b(zVar, this.f32064u, i2(!this.f32059N), h2(!this.f32059N), this, this.f32059N, this.f32046A);
    }

    private int a2(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return m.c(zVar, this.f32064u, i2(!this.f32059N), h2(!this.f32059N), this, this.f32059N);
    }

    private int b2(int i10) {
        if (i10 == 1) {
            return (this.f32066w != 1 && x2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f32066w != 1 && x2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f32066w == 0) {
                return -1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 33) {
            if (this.f32066w == 1) {
                return -1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 66) {
            if (this.f32066w == 0) {
                return 1;
            }
            return PduHandle.NONE;
        }
        if (i10 == 130 && this.f32066w == 1) {
            return 1;
        }
        return PduHandle.NONE;
    }

    private d.a c2(int i10) {
        d.a aVar = new d.a();
        aVar.f32084c = new int[this.f32062s];
        for (int i11 = 0; i11 < this.f32062s; i11++) {
            aVar.f32084c[i11] = i10 - this.f32063t[i11].l(i10);
        }
        return aVar;
    }

    private d.a d2(int i10) {
        d.a aVar = new d.a();
        aVar.f32084c = new int[this.f32062s];
        for (int i11 = 0; i11 < this.f32062s; i11++) {
            aVar.f32084c[i11] = this.f32063t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void e2() {
        this.f32064u = i.b(this, this.f32066w);
        this.f32065v = i.b(this, 1 - this.f32066w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int f2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar, RecyclerView.z zVar) {
        f fVarT2;
        int iE;
        int i10;
        int iE2;
        int iE3;
        boolean z10;
        ?? r92 = 0;
        this.f32047B.set(0, this.f32062s, true);
        int i11 = this.f32068y.f32229i ? fVar.f32225e == 1 ? MPv3.MAX_MESSAGE_ID : PduHandle.NONE : fVar.f32225e == 1 ? fVar.f32227g + fVar.f32222b : fVar.f32226f - fVar.f32222b;
        O2(fVar.f32225e, i11);
        int i12 = this.f32046A ? this.f32064u.i() : this.f32064u.m();
        boolean z11 = false;
        while (fVar.a(zVar) && (this.f32068y.f32229i || !this.f32047B.isEmpty())) {
            View viewB = fVar.b(uVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.f32050E.g(iA);
            boolean z12 = iG == -1 ? true : r92;
            if (z12) {
                fVarT2 = cVar.f32079f ? this.f32063t[r92] : t2(fVar);
                this.f32050E.n(iA, fVarT2);
            } else {
                fVarT2 = this.f32063t[iG];
            }
            f fVar2 = fVarT2;
            cVar.f32078e = fVar2;
            if (fVar.f32225e == 1) {
                e(viewB);
            } else {
                f(viewB, r92);
            }
            z2(viewB, cVar, r92);
            if (fVar.f32225e == 1) {
                int iP2 = cVar.f32079f ? p2(i12) : fVar2.l(i12);
                int iE4 = this.f32064u.e(viewB) + iP2;
                if (z12 && cVar.f32079f) {
                    d.a aVarC2 = c2(iP2);
                    aVarC2.f32083b = -1;
                    aVarC2.f32082a = iA;
                    this.f32050E.a(aVarC2);
                }
                i10 = iE4;
                iE = iP2;
            } else {
                int iS2 = cVar.f32079f ? s2(i12) : fVar2.p(i12);
                iE = iS2 - this.f32064u.e(viewB);
                if (z12 && cVar.f32079f) {
                    d.a aVarD2 = d2(iS2);
                    aVarD2.f32083b = 1;
                    aVarD2.f32082a = iA;
                    this.f32050E.a(aVarD2);
                }
                i10 = iS2;
            }
            if (cVar.f32079f && fVar.f32224d == -1) {
                if (z12) {
                    this.f32058M = true;
                } else {
                    if (!(fVar.f32225e == 1 ? S1() : T1())) {
                        d.a aVarF = this.f32050E.f(iA);
                        if (aVarF != null) {
                            aVarF.f32085d = true;
                        }
                        this.f32058M = true;
                    }
                }
            }
            U1(viewB, cVar, fVar);
            if (x2() && this.f32066w == 1) {
                int i13 = cVar.f32079f ? this.f32065v.i() : this.f32065v.i() - (((this.f32062s - 1) - fVar2.f32100e) * this.f32067x);
                iE3 = i13;
                iE2 = i13 - this.f32065v.e(viewB);
            } else {
                int iM = cVar.f32079f ? this.f32065v.m() : (fVar2.f32100e * this.f32067x) + this.f32065v.m();
                iE2 = iM;
                iE3 = this.f32065v.e(viewB) + iM;
            }
            if (this.f32066w == 1) {
                D0(viewB, iE2, iE, iE3, i10);
            } else {
                D0(viewB, iE, iE2, i10, iE3);
            }
            if (cVar.f32079f) {
                O2(this.f32068y.f32225e, i11);
            } else {
                U2(fVar2, this.f32068y.f32225e, i11);
            }
            E2(uVar, this.f32068y);
            if (!this.f32068y.f32228h || !viewB.hasFocusable()) {
                z10 = false;
            } else if (cVar.f32079f) {
                this.f32047B.clear();
                z10 = false;
            } else {
                z10 = false;
                this.f32047B.set(fVar2.f32100e, false);
            }
            r92 = z10;
            z11 = true;
        }
        int i14 = r92;
        if (!z11) {
            E2(uVar, this.f32068y);
        }
        int iM2 = this.f32068y.f32225e == -1 ? this.f32064u.m() - s2(this.f32064u.m()) : p2(this.f32064u.i()) - this.f32064u.i();
        return iM2 > 0 ? Math.min(fVar.f32222b, iM2) : i14;
    }

    private int g2(int i10) {
        int iO = O();
        for (int i11 = 0; i11 < iO; i11++) {
            int iL0 = l0(N(i11));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private int k2(int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private void l2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int i10;
        int iP2 = p2(PduHandle.NONE);
        if (iP2 != Integer.MIN_VALUE && (i10 = this.f32064u.i() - iP2) > 0) {
            int i11 = i10 - (-J2(-i10, uVar, zVar));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f32064u.r(i11);
        }
    }

    private void m2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z10) {
        int iM;
        int iS2 = s2(MPv3.MAX_MESSAGE_ID);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.f32064u.m()) > 0) {
            int iJ2 = iM - J2(iM, uVar, zVar);
            if (!z10 || iJ2 <= 0) {
                return;
            }
            this.f32064u.r(-iJ2);
        }
    }

    private int p2(int i10) {
        int iL = this.f32063t[0].l(i10);
        for (int i11 = 1; i11 < this.f32062s; i11++) {
            int iL2 = this.f32063t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int q2(int i10) {
        int iP = this.f32063t[0].p(i10);
        for (int i11 = 1; i11 < this.f32062s; i11++) {
            int iP2 = this.f32063t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int r2(int i10) {
        int iL = this.f32063t[0].l(i10);
        for (int i11 = 1; i11 < this.f32062s; i11++) {
            int iL2 = this.f32063t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i10) {
        int iP = this.f32063t[0].p(i10);
        for (int i11 = 1; i11 < this.f32062s; i11++) {
            int iP2 = this.f32063t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f t2(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12;
        if (B2(fVar.f32225e)) {
            i11 = this.f32062s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f32062s;
            i11 = 0;
            i12 = 1;
        }
        f fVar2 = null;
        if (fVar.f32225e == 1) {
            int iM = this.f32064u.m();
            int i13 = MPv3.MAX_MESSAGE_ID;
            while (i11 != i10) {
                f fVar3 = this.f32063t[i11];
                int iL = fVar3.l(iM);
                if (iL < i13) {
                    fVar2 = fVar3;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar2;
        }
        int i14 = this.f32064u.i();
        int i15 = PduHandle.NONE;
        while (i11 != i10) {
            f fVar4 = this.f32063t[i11];
            int iP = fVar4.p(i14);
            if (iP > i15) {
                fVar2 = fVar4;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f32046A
            if (r0 == 0) goto L9
            int r0 = r6.o2()
            goto Ld
        L9:
            int r0 = r6.n2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f32050E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f32050E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f32050E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f32050E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f32050E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f32046A
            if (r7 == 0) goto L4e
            int r7 = r6.n2()
            goto L52
        L4e:
            int r7 = r6.o2()
        L52:
            if (r3 > r7) goto L57
            r6.x1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2(int, int, int):void");
    }

    private void y2(View view, int i10, int i11, boolean z10) {
        o(view, this.f32056K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f32056K;
        int iV2 = V2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f32056K;
        int iV22 = V2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? L1(view, iV2, iV22, cVar) : J1(view, iV2, iV22, cVar)) {
            view.measure(iV2, iV22);
        }
    }

    private void z2(View view, c cVar, boolean z10) {
        if (cVar.f32079f) {
            if (this.f32066w == 1) {
                y2(view, this.f32055J, RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                y2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f32055J, z10);
                return;
            }
        }
        if (this.f32066w == 1) {
            y2(view, RecyclerView.o.P(this.f32067x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            y2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.P(this.f32067x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return a2(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return J2(i10, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i10) {
        e eVar = this.f32054I;
        if (eVar != null && eVar.f32086a != i10) {
            eVar.a();
        }
        this.f32048C = i10;
        this.f32049D = PduHandle.NONE;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        return J2(i10, uVar, zVar);
    }

    void C2(int i10, RecyclerView.z zVar) {
        int iN2;
        int i11;
        if (i10 > 0) {
            iN2 = o2();
            i11 = 1;
        } else {
            iN2 = n2();
            i11 = -1;
        }
        this.f32068y.f32221a = true;
        S2(iN2, zVar);
        K2(i11);
        androidx.recyclerview.widget.f fVar = this.f32068y;
        fVar.f32223c = iN2 + fVar.f32224d;
        fVar.f32222b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(int i10) {
        super.G0(i10);
        for (int i11 = 0; i11 < this.f32062s; i11++) {
            this.f32063t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f32066w == 1) {
            iS2 = RecyclerView.o.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.o.s(i10, (this.f32067x * this.f32062s) + iI0, g0());
        } else {
            iS = RecyclerView.o.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.o.s(i11, (this.f32067x * this.f32062s) + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f32062s; i11++) {
            this.f32063t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return this.f32066w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int J2(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        C2(i10, zVar);
        int iF2 = f2(uVar, this.f32068y, zVar);
        if (this.f32068y.f32222b >= iF2) {
            i10 = i10 < 0 ? -iF2 : iF2;
        }
        this.f32064u.r(-i10);
        this.f32052G = this.f32046A;
        androidx.recyclerview.widget.f fVar = this.f32068y;
        fVar.f32222b = 0;
        E2(uVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void L2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        h(null);
        if (i10 == this.f32066w) {
            return;
        }
        this.f32066w = i10;
        i iVar = this.f32064u;
        this.f32064u = this.f32065v;
        this.f32065v = iVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        s1(this.f32061P);
        for (int i10 = 0; i10 < this.f32062s; i10++) {
            this.f32063t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    public void M2(boolean z10) {
        h(null);
        e eVar = this.f32054I;
        if (eVar != null && eVar.f32093h != z10) {
            eVar.f32093h = z10;
        }
        this.f32069z = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i10);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z10 = cVar.f32079f;
        f fVar = cVar.f32078e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, zVar);
        K2(iB2);
        androidx.recyclerview.widget.f fVar2 = this.f32068y;
        fVar2.f32223c = fVar2.f32224d + iO2;
        fVar2.f32222b = (int) (this.f32064u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f32068y;
        fVar3.f32228h = true;
        fVar3.f32221a = false;
        f2(uVar, fVar3, zVar);
        this.f32052G = this.f32046A;
        if (!z10 && (viewM = fVar.m(iO2, iB2)) != null && viewM != viewG) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i11 = this.f32062s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f32063t[i11].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f32062s; i12++) {
                View viewM3 = this.f32063t[i12].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f32069z ^ true) == (iB2 == -1);
        if (!z10) {
            View viewH = H(z11 ? fVar.f() : fVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (B2(iB2)) {
            for (int i13 = this.f32062s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f32100e) {
                    View viewH2 = H(z11 ? this.f32063t[i13].f() : this.f32063t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f32062s; i14++) {
                View viewH3 = H(z11 ? this.f32063t[i14].f() : this.f32063t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void N2(int i10) {
        h(null);
        if (i10 != this.f32062s) {
            w2();
            this.f32062s = i10;
            this.f32047B = new BitSet(this.f32062s);
            this.f32063t = new f[this.f32062s];
            for (int i11 = 0; i11 < this.f32062s; i11++) {
                this.f32063t[i11] = new f(i11);
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View viewI2 = i2(false);
            View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iL0 = l0(viewI2);
            int iL02 = l0(viewH2);
            if (iL0 < iL02) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL02);
            } else {
                accessibilityEvent.setFromIndex(iL02);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f32054I == null;
    }

    boolean Q2(RecyclerView.z zVar, b bVar) {
        int i10;
        if (!zVar.e() && (i10 = this.f32048C) != -1) {
            if (i10 >= 0 && i10 < zVar.b()) {
                e eVar = this.f32054I;
                if (eVar == null || eVar.f32086a == -1 || eVar.f32088c < 1) {
                    View viewH = H(this.f32048C);
                    if (viewH != null) {
                        bVar.f32071a = this.f32046A ? o2() : n2();
                        if (this.f32049D != Integer.MIN_VALUE) {
                            if (bVar.f32073c) {
                                bVar.f32072b = (this.f32064u.i() - this.f32049D) - this.f32064u.d(viewH);
                            } else {
                                bVar.f32072b = (this.f32064u.m() + this.f32049D) - this.f32064u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f32064u.e(viewH) > this.f32064u.n()) {
                            bVar.f32072b = bVar.f32073c ? this.f32064u.i() : this.f32064u.m();
                            return true;
                        }
                        int iG = this.f32064u.g(viewH) - this.f32064u.m();
                        if (iG < 0) {
                            bVar.f32072b = -iG;
                            return true;
                        }
                        int i11 = this.f32064u.i() - this.f32064u.d(viewH);
                        if (i11 < 0) {
                            bVar.f32072b = i11;
                            return true;
                        }
                        bVar.f32072b = PduHandle.NONE;
                    } else {
                        int i12 = this.f32048C;
                        bVar.f32071a = i12;
                        int i13 = this.f32049D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f32073c = V1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f32074d = true;
                    }
                } else {
                    bVar.f32072b = PduHandle.NONE;
                    bVar.f32071a = this.f32048C;
                }
                return true;
            }
            this.f32048C = -1;
            this.f32049D = PduHandle.NONE;
        }
        return false;
    }

    void R2(RecyclerView.z zVar, b bVar) {
        if (Q2(zVar, bVar) || P2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f32071a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f32066w == 1 ? this.f32062s : super.S(uVar, zVar);
    }

    boolean S1() {
        int iL = this.f32063t[0].l(PduHandle.NONE);
        for (int i10 = 1; i10 < this.f32062s; i10++) {
            if (this.f32063t[i10].l(PduHandle.NONE) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView.u uVar, RecyclerView.z zVar, View view, t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.S0(view, tVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f32066w == 0) {
            tVar.j0(t.f.a(cVar.e(), cVar.f32079f ? this.f32062s : 1, -1, -1, false, false));
        } else {
            tVar.j0(t.f.a(-1, -1, cVar.e(), cVar.f32079f ? this.f32062s : 1, false, false));
        }
    }

    boolean T1() {
        int iP = this.f32063t[0].p(PduHandle.NONE);
        for (int i10 = 1; i10 < this.f32062s; i10++) {
            if (this.f32063t[i10].p(PduHandle.NONE) != iP) {
                return false;
            }
        }
        return true;
    }

    void T2(int i10) {
        this.f32067x = i10 / this.f32062s;
        this.f32055J = View.MeasureSpec.makeMeasureSpec(i10, this.f32065v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        u2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView) {
        this.f32050E.b();
        x1();
    }

    boolean W1() {
        int iN2;
        int iO2;
        if (O() == 0 || this.f32051F == 0 || !v0()) {
            return false;
        }
        if (this.f32046A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.f32050E.b();
            y1();
            x1();
            return true;
        }
        if (!this.f32058M) {
            return false;
        }
        int i10 = this.f32046A ? -1 : 1;
        int i11 = iO2 + 1;
        d.a aVarE = this.f32050E.e(iN2, i11, i10, true);
        if (aVarE == null) {
            this.f32058M = false;
            this.f32050E.d(i11);
            return false;
        }
        d.a aVarE2 = this.f32050E.e(iN2, aVarE.f32082a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f32050E.d(aVarE.f32082a);
        } else {
            this.f32050E.d(aVarE2.f32082a + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        u2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        u2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        u2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF b(int i10) {
        int iV1 = V1(i10);
        PointF pointF = new PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.f32066w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        A2(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f32048C = -1;
        this.f32049D = PduHandle.NONE;
        this.f32054I = null;
        this.f32057L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f32054I = (e) parcelable;
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h(String str) {
        if (this.f32054I == null) {
            super.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable h1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f32054I != null) {
            return new e(this.f32054I);
        }
        e eVar = new e();
        eVar.f32093h = this.f32069z;
        eVar.f32094i = this.f32052G;
        eVar.f32095j = this.f32053H;
        d dVar = this.f32050E;
        if (dVar == null || (iArr = dVar.f32080a) == null) {
            eVar.f32090e = 0;
        } else {
            eVar.f32091f = iArr;
            eVar.f32090e = iArr.length;
            eVar.f32092g = dVar.f32081b;
        }
        if (O() > 0) {
            eVar.f32086a = this.f32052G ? o2() : n2();
            eVar.f32087b = j2();
            int i10 = this.f32062s;
            eVar.f32088c = i10;
            eVar.f32089d = new int[i10];
            for (int i11 = 0; i11 < this.f32062s; i11++) {
                if (this.f32052G) {
                    iP = this.f32063t[i11].l(PduHandle.NONE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f32064u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f32063t[i11].p(PduHandle.NONE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f32064u.m();
                        iP -= iM;
                    }
                }
                eVar.f32089d[i11] = iP;
            }
        } else {
            eVar.f32086a = -1;
            eVar.f32087b = -1;
            eVar.f32088c = 0;
        }
        return eVar;
    }

    View h2(boolean z10) {
        int iM = this.f32064u.m();
        int i10 = this.f32064u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f32064u.g(viewN);
            int iD = this.f32064u.d(viewN);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(int i10) {
        if (i10 == 0) {
            W1();
        }
    }

    View i2(boolean z10) {
        int iM = this.f32064u.m();
        int i10 = this.f32064u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f32064u.g(viewN);
            if (this.f32064u.d(viewN) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int j2() {
        View viewH2 = this.f32046A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f32066w == 0 ? this.f32062s : super.o0(uVar, zVar);
    }

    int o2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.f32066w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.f32066w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i10, int i11, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int iL;
        int iP;
        if (this.f32066w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        C2(i10, zVar);
        int[] iArr = this.f32060O;
        if (iArr == null || iArr.length < this.f32062s) {
            this.f32060O = new int[this.f32062s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f32062s; i13++) {
            androidx.recyclerview.widget.f fVar = this.f32068y;
            if (fVar.f32224d == -1) {
                iL = fVar.f32226f;
                iP = this.f32063t[i13].p(iL);
            } else {
                iL = this.f32063t[i13].l(fVar.f32227g);
                iP = this.f32068y.f32227g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f32060O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f32060O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f32068y.a(zVar); i15++) {
            cVar.a(this.f32068y.f32223c, this.f32060O[i15]);
            androidx.recyclerview.widget.f fVar2 = this.f32068y;
            fVar2.f32223c += fVar2.f32224d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View v2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f32062s
            r2.<init>(r3)
            int r3 = r12.f32062s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f32066w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.x2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f32046A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f32078e
            int r9 = r9.f32100e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f32078e
            boolean r9 = r12.X1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f32078e
            int r9 = r9.f32100e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f32079f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.f32046A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.f32064u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f32064u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.f32064u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f32064u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f32078e
            int r8 = r8.f32100e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f32078e
            int r9 = r9.f32100e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return this.f32051F != 0;
    }

    public void w2() {
        this.f32050E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return a2(zVar);
    }

    boolean x2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f32080a;

        /* renamed from: b, reason: collision with root package name */
        List f32081b;

        d() {
        }

        private int i(int i10) {
            if (this.f32081b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f32081b.remove(aVarF);
            }
            int size = this.f32081b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f32081b.get(i11)).f32082a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f32081b.get(i11);
            this.f32081b.remove(i11);
            return aVar.f32082a;
        }

        private void l(int i10, int i11) {
            List list = this.f32081b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f32081b.get(size);
                int i12 = aVar.f32082a;
                if (i12 >= i10) {
                    aVar.f32082a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f32081b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f32081b.get(size);
                int i13 = aVar.f32082a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f32081b.remove(size);
                    } else {
                        aVar.f32082a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f32081b == null) {
                this.f32081b = new ArrayList();
            }
            int size = this.f32081b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f32081b.get(i10);
                if (aVar2.f32082a == aVar.f32082a) {
                    this.f32081b.remove(i10);
                }
                if (aVar2.f32082a >= aVar.f32082a) {
                    this.f32081b.add(i10, aVar);
                    return;
                }
            }
            this.f32081b.add(aVar);
        }

        void b() {
            int[] iArr = this.f32080a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f32081b = null;
        }

        void c(int i10) {
            int[] iArr = this.f32080a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f32080a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f32080a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f32080a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f32081b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f32081b.get(size)).f32082a >= i10) {
                        this.f32081b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f32081b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f32081b.get(i13);
                int i14 = aVar.f32082a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f32083b == i12 || (z10 && aVar.f32085d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f32081b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f32081b.get(size);
                if (aVar.f32082a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f32080a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f32080a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f32080a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f32080a.length;
            }
            int i12 = i11 + 1;
            Arrays.fill(this.f32080a, i10, i12, -1);
            return i12;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f32080a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f32080a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f32080a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f32080a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f32080a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f32080a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f32080a[i10] = fVar.f32100e;
        }

        int o(int i10) {
            int length = this.f32080a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C1116a();

            /* renamed from: a, reason: collision with root package name */
            int f32082a;

            /* renamed from: b, reason: collision with root package name */
            int f32083b;

            /* renamed from: c, reason: collision with root package name */
            int[] f32084c;

            /* renamed from: d, reason: collision with root package name */
            boolean f32085d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C1116a implements Parcelable.Creator {
                C1116a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f32082a = parcel.readInt();
                this.f32083b = parcel.readInt();
                this.f32085d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f32084c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f32084c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f32082a + ", mGapDir=" + this.f32083b + ", mHasUnwantedGapAfter=" + this.f32085d + ", mGapPerSpan=" + Arrays.toString(this.f32084c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f32082a);
                parcel.writeInt(this.f32083b);
                parcel.writeInt(this.f32085d ? 1 : 0);
                int[] iArr = this.f32084c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f32084c);
                }
            }

            a() {
            }
        }
    }
}
