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
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import s0.x;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.n implements RecyclerView.x.b {

    /* renamed from: b, reason: collision with root package name */
    public d[] f3804b;

    /* renamed from: c, reason: collision with root package name */
    public i f3805c;

    /* renamed from: d, reason: collision with root package name */
    public i f3806d;

    /* renamed from: e, reason: collision with root package name */
    public int f3807e;

    /* renamed from: f, reason: collision with root package name */
    public int f3808f;

    /* renamed from: g, reason: collision with root package name */
    public final f f3809g;

    /* renamed from: j, reason: collision with root package name */
    public BitSet f3812j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3817o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3818p;

    /* renamed from: q, reason: collision with root package name */
    public SavedState f3819q;

    /* renamed from: r, reason: collision with root package name */
    public int f3820r;

    /* renamed from: w, reason: collision with root package name */
    public int[] f3825w;

    /* renamed from: a, reason: collision with root package name */
    public int f3803a = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3810h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3811i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f3813k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f3814l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public LazySpanLookup f3815m = new LazySpanLookup();

    /* renamed from: n, reason: collision with root package name */
    public int f3816n = 2;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f3821s = new Rect();

    /* renamed from: t, reason: collision with root package name */
    public final b f3822t = new b();

    /* renamed from: u, reason: collision with root package name */
    public boolean f3823u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3824v = true;

    /* renamed from: x, reason: collision with root package name */
    public final Runnable f3826x = new a();

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f3833a;

        /* renamed from: b, reason: collision with root package name */
        public int f3834b;

        /* renamed from: c, reason: collision with root package name */
        public int f3835c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f3836d;

        /* renamed from: e, reason: collision with root package name */
        public int f3837e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f3838f;

        /* renamed from: g, reason: collision with root package name */
        public List f3839g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f3840h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3841i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3842j;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public void c() {
            this.f3836d = null;
            this.f3835c = 0;
            this.f3833a = -1;
            this.f3834b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e() {
            this.f3836d = null;
            this.f3835c = 0;
            this.f3837e = 0;
            this.f3838f = null;
            this.f3839g = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3833a);
            parcel.writeInt(this.f3834b);
            parcel.writeInt(this.f3835c);
            if (this.f3835c > 0) {
                parcel.writeIntArray(this.f3836d);
            }
            parcel.writeInt(this.f3837e);
            if (this.f3837e > 0) {
                parcel.writeIntArray(this.f3838f);
            }
            parcel.writeInt(this.f3840h ? 1 : 0);
            parcel.writeInt(this.f3841i ? 1 : 0);
            parcel.writeInt(this.f3842j ? 1 : 0);
            parcel.writeList(this.f3839g);
        }

        public SavedState(Parcel parcel) {
            this.f3833a = parcel.readInt();
            this.f3834b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f3835c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f3836d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f3837e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f3838f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3840h = parcel.readInt() == 1;
            this.f3841i = parcel.readInt() == 1;
            this.f3842j = parcel.readInt() == 1;
            this.f3839g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3835c = savedState.f3835c;
            this.f3833a = savedState.f3833a;
            this.f3834b = savedState.f3834b;
            this.f3836d = savedState.f3836d;
            this.f3837e = savedState.f3837e;
            this.f3838f = savedState.f3838f;
            this.f3840h = savedState.f3840h;
            this.f3841i = savedState.f3841i;
            this.f3842j = savedState.f3842j;
            this.f3839g = savedState.f3839g;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3844a;

        /* renamed from: b, reason: collision with root package name */
        public int f3845b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3846c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3847d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3848e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f3849f;

        public b() {
            c();
        }

        public void a() {
            this.f3845b = this.f3846c ? StaggeredGridLayoutManager.this.f3805c.i() : StaggeredGridLayoutManager.this.f3805c.n();
        }

        public void b(int i10) {
            if (this.f3846c) {
                this.f3845b = StaggeredGridLayoutManager.this.f3805c.i() - i10;
            } else {
                this.f3845b = StaggeredGridLayoutManager.this.f3805c.n() + i10;
            }
        }

        public void c() {
            this.f3844a = -1;
            this.f3845b = Integer.MIN_VALUE;
            this.f3846c = false;
            this.f3847d = false;
            this.f3848e = false;
            int[] iArr = this.f3849f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f3849f;
            if (iArr == null || iArr.length < length) {
                this.f3849f = new int[StaggeredGridLayoutManager.this.f3804b.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3849f[i10] = dVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* renamed from: e, reason: collision with root package name */
        public d f3851e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3852f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            d dVar = this.f3851e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f3857e;
        }

        public boolean f() {
            return this.f3852f;
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

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f3853a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f3854b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f3855c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f3856d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f3857e;

        public d(int i10) {
            this.f3857e = i10;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f3851e = this;
            this.f3853a.add(view);
            this.f3855c = Integer.MIN_VALUE;
            if (this.f3853a.size() == 1) {
                this.f3854b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3856d += StaggeredGridLayoutManager.this.f3805c.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f3805c.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f3805c.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f3855c = iL;
                    this.f3854b = iL;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList arrayList = this.f3853a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f3855c = StaggeredGridLayoutManager.this.f3805c.d(view);
            if (cVarN.f3852f && (fullSpanItemF = StaggeredGridLayoutManager.this.f3815m.f(cVarN.a())) != null && fullSpanItemF.f3830b == 1) {
                this.f3855c += fullSpanItemF.c(this.f3857e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) this.f3853a.get(0);
            c cVarN = n(view);
            this.f3854b = StaggeredGridLayoutManager.this.f3805c.g(view);
            if (cVarN.f3852f && (fullSpanItemF = StaggeredGridLayoutManager.this.f3815m.f(cVarN.a())) != null && fullSpanItemF.f3830b == -1) {
                this.f3854b -= fullSpanItemF.c(this.f3857e);
            }
        }

        public void e() {
            this.f3853a.clear();
            q();
            this.f3856d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3810h ? i(this.f3853a.size() - 1, -1, true) : i(0, this.f3853a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3810h ? i(0, this.f3853a.size(), true) : i(this.f3853a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iN = StaggeredGridLayoutManager.this.f3805c.n();
            int i12 = StaggeredGridLayoutManager.this.f3805c.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f3853a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f3805c.g(view);
                int iD = StaggeredGridLayoutManager.this.f3805c.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iN : iD >= iN) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iN && iD <= i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iG < iN || iD > i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3856d;
        }

        public int k() {
            int i10 = this.f3855c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3855c;
        }

        public int l(int i10) {
            int i11 = this.f3855c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3853a.size() == 0) {
                return i10;
            }
            c();
            return this.f3855c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3853a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3853a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3810h && staggeredGridLayoutManager.getPosition(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3810h && staggeredGridLayoutManager2.getPosition(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f3853a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f3853a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f3810h && staggeredGridLayoutManager3.getPosition(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f3810h && staggeredGridLayoutManager4.getPosition(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.f3854b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3854b;
        }

        public int p(int i10) {
            int i11 = this.f3854b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3853a.size() == 0) {
                return i10;
            }
            d();
            return this.f3854b;
        }

        public void q() {
            this.f3854b = Integer.MIN_VALUE;
            this.f3855c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.f3854b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3854b = i11 + i10;
            }
            int i12 = this.f3855c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3855c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f3853a.size();
            View view = (View) this.f3853a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f3851e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f3856d -= StaggeredGridLayoutManager.this.f3805c.e(view);
            }
            if (size == 1) {
                this.f3854b = Integer.MIN_VALUE;
            }
            this.f3855c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f3853a.remove(0);
            c cVarN = n(view);
            cVarN.f3851e = null;
            if (this.f3853a.size() == 0) {
                this.f3855c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3856d -= StaggeredGridLayoutManager.this.f3805c.e(view);
            }
            this.f3854b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f3851e = this;
            this.f3853a.add(0, view);
            this.f3854b = Integer.MIN_VALUE;
            if (this.f3853a.size() == 1) {
                this.f3855c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3856d += StaggeredGridLayoutManager.this.f3805c.e(view);
            }
        }

        public void v(int i10) {
            this.f3854b = i10;
            this.f3855c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f3755a);
        c0(properties.f3756b);
        setReverseLayout(properties.f3757c);
        this.f3809g = new f();
        x();
    }

    private void Q(View view, int i10, int i11, boolean z10) {
        calculateItemDecorationsForChild(view, this.f3821s);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f3821s;
        int iK0 = k0(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f3821s;
        int iK02 = k0(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? shouldReMeasureChild(view, iK0, iK02, cVar) : shouldMeasureChild(view, iK0, iK02, cVar)) {
            view.measure(iK0, iK02);
        }
    }

    private void a0() {
        if (this.f3807e == 1 || !isLayoutRTL()) {
            this.f3811i = this.f3810h;
        } else {
            this.f3811i = !this.f3810h;
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f3807e == 1) ? 1 : Integer.MIN_VALUE : this.f3807e == 0 ? 1 : Integer.MIN_VALUE : this.f3807e == 1 ? -1 : Integer.MIN_VALUE : this.f3807e == 0 ? -1 : Integer.MIN_VALUE : (this.f3807e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f3807e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private int s(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.a(yVar, this.f3805c, B(!this.f3824v), A(!this.f3824v), this, this.f3824v);
    }

    private int t(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.b(yVar, this.f3805c, B(!this.f3824v), A(!this.f3824v), this, this.f3824v, this.f3811i);
    }

    private int u(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.c(yVar, this.f3805c, B(!this.f3824v), A(!this.f3824v), this, this.f3824v);
    }

    public View A(boolean z10) {
        int iN = this.f3805c.n();
        int i10 = this.f3805c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iG = this.f3805c.g(childAt);
            int iD = this.f3805c.d(childAt);
            if (iD > iN && iG < i10) {
                if (iD <= i10 || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View B(boolean z10) {
        int iN = this.f3805c.n();
        int i10 = this.f3805c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iG = this.f3805c.g(childAt);
            if (this.f3805c.d(childAt) > iN && iG < i10) {
                if (iG >= iN || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int C() {
        View viewA = this.f3811i ? A(true) : B(true);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    public final int D(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    public final void E(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int i10;
        int I = I(Integer.MIN_VALUE);
        if (I != Integer.MIN_VALUE && (i10 = this.f3805c.i() - I) > 0) {
            int i11 = i10 - (-scrollBy(-i10, uVar, yVar));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3805c.s(i11);
        }
    }

    public final void F(RecyclerView.u uVar, RecyclerView.y yVar, boolean z10) {
        int iN;
        int iL = L(Integer.MAX_VALUE);
        if (iL != Integer.MAX_VALUE && (iN = iL - this.f3805c.n()) > 0) {
            int iScrollBy = iN - scrollBy(iN, uVar, yVar);
            if (!z10 || iScrollBy <= 0) {
                return;
            }
            this.f3805c.s(-iScrollBy);
        }
    }

    public int G() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int H() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int I(int i10) {
        int iL = this.f3804b[0].l(i10);
        for (int i11 = 1; i11 < this.f3803a; i11++) {
            int iL2 = this.f3804b[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int J(int i10) {
        int iP = this.f3804b[0].p(i10);
        for (int i11 = 1; i11 < this.f3803a; i11++) {
            int iP2 = this.f3804b[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final int K(int i10) {
        int iL = this.f3804b[0].l(i10);
        for (int i11 = 1; i11 < this.f3803a; i11++) {
            int iL2 = this.f3804b[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int L(int i10) {
        int iP = this.f3804b[0].p(i10);
        for (int i11 = 1; i11 < this.f3803a; i11++) {
            int iP2 = this.f3804b[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final d M(f fVar) {
        int i10;
        int i11;
        int i12;
        if (T(fVar.f3986e)) {
            i11 = this.f3803a - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f3803a;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (fVar.f3986e == 1) {
            int iN = this.f3805c.n();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.f3804b[i11];
                int iL = dVar2.l(iN);
                if (iL < i13) {
                    dVar = dVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f3805c.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            d dVar3 = this.f3804b[i11];
            int iP = dVar3.p(i14);
            if (iP > i15) {
                dVar = dVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3811i
            if (r0 == 0) goto L9
            int r0 = r6.H()
            goto Ld
        L9:
            int r0 = r6.G()
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f3815m
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3815m
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f3815m
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3815m
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3815m
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f3811i
            if (r7 == 0) goto L4e
            int r7 = r6.G()
            goto L52
        L4e:
            int r7 = r6.H()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View O() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3803a
            r2.<init>(r3)
            int r3 = r12.f3803a
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f3807e
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f3811i
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
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3851e
            int r9 = r9.f3857e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3851e
            boolean r9 = r12.r(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3851e
            int r9 = r9.f3857e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f3852f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f3811i
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.f3805c
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3805c
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.f3805c
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3805c
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f3851e
            int r8 = r8.f3857e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f3851e
            int r9 = r9.f3857e
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
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O():android.view.View");
    }

    public void P() {
        this.f3815m.b();
        requestLayout();
    }

    public final void R(View view, c cVar, boolean z10) {
        if (cVar.f3852f) {
            if (this.f3807e == 1) {
                Q(view, this.f3820r, RecyclerView.n.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                Q(view, RecyclerView.n.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f3820r, z10);
                return;
            }
        }
        if (this.f3807e == 1) {
            Q(view, RecyclerView.n.getChildMeasureSpec(this.f3808f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.n.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            Q(view, RecyclerView.n.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.n.getChildMeasureSpec(this.f3808f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.y r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public final boolean T(int i10) {
        if (this.f3807e == 0) {
            return (i10 == -1) != this.f3811i;
        }
        return ((i10 == -1) == this.f3811i) == isLayoutRTL();
    }

    public void U(int i10, RecyclerView.y yVar) {
        int iG;
        int i11;
        if (i10 > 0) {
            iG = H();
            i11 = 1;
        } else {
            iG = G();
            i11 = -1;
        }
        this.f3809g.f3982a = true;
        h0(iG, yVar);
        b0(i11);
        f fVar = this.f3809g;
        fVar.f3984c = iG + fVar.f3985d;
        fVar.f3983b = Math.abs(i10);
    }

    public final void V(View view) {
        for (int i10 = this.f3803a - 1; i10 >= 0; i10--) {
            this.f3804b[i10].u(view);
        }
    }

    public final void W(RecyclerView.u uVar, f fVar) {
        if (!fVar.f3982a || fVar.f3990i) {
            return;
        }
        if (fVar.f3983b == 0) {
            if (fVar.f3986e == -1) {
                X(uVar, fVar.f3988g);
                return;
            } else {
                Y(uVar, fVar.f3987f);
                return;
            }
        }
        if (fVar.f3986e != -1) {
            int iK = K(fVar.f3988g) - fVar.f3988g;
            Y(uVar, iK < 0 ? fVar.f3987f : Math.min(iK, fVar.f3983b) + fVar.f3987f);
        } else {
            int i10 = fVar.f3987f;
            int iJ = i10 - J(i10);
            X(uVar, iJ < 0 ? fVar.f3988g : fVar.f3988g - Math.min(iJ, fVar.f3983b));
        }
    }

    public final void X(RecyclerView.u uVar, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f3805c.g(childAt) < i10 || this.f3805c.r(childAt) < i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f3852f) {
                for (int i11 = 0; i11 < this.f3803a; i11++) {
                    if (this.f3804b[i11].f3853a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3803a; i12++) {
                    this.f3804b[i12].s();
                }
            } else if (cVar.f3851e.f3853a.size() == 1) {
                return;
            } else {
                cVar.f3851e.s();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void Y(RecyclerView.u uVar, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f3805c.d(childAt) > i10 || this.f3805c.q(childAt) > i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f3852f) {
                for (int i11 = 0; i11 < this.f3803a; i11++) {
                    if (this.f3804b[i11].f3853a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3803a; i12++) {
                    this.f3804b[i12].t();
                }
            } else if (cVar.f3851e.f3853a.size() == 1) {
                return;
            } else {
                cVar.f3851e.t();
            }
            removeAndRecycleView(childAt, uVar);
        }
    }

    public final void Z() {
        if (this.f3806d.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float fE = this.f3806d.e(childAt);
            if (fE >= fMax) {
                if (((c) childAt.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f3803a;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f3808f;
        int iRound = Math.round(fMax * this.f3803a);
        if (this.f3806d.l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3806d.o());
        }
        i0(iRound);
        if (this.f3808f == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f3852f) {
                if (isLayoutRTL() && this.f3807e == 1) {
                    int i13 = this.f3803a;
                    int i14 = cVar.f3851e.f3857e;
                    childAt2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3808f) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3851e.f3857e;
                    int i16 = this.f3808f * i15;
                    int i17 = i15 * i11;
                    if (this.f3807e == 1) {
                        childAt2.offsetLeftAndRight(i16 - i17);
                    } else {
                        childAt2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f3819q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final void b0(int i10) {
        f fVar = this.f3809g;
        fVar.f3986e = i10;
        fVar.f3985d = this.f3811i != (i10 == -1) ? -1 : 1;
    }

    public void c0(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f3803a) {
            P();
            this.f3803a = i10;
            this.f3812j = new BitSet(this.f3803a);
            this.f3804b = new d[this.f3803a];
            for (int i11 = 0; i11 < this.f3803a; i11++) {
                this.f3804b[i11] = new d(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollHorizontally() {
        return this.f3807e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canScrollVertically() {
        return this.f3807e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        int iL;
        int iP;
        if (this.f3807e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        U(i10, yVar);
        int[] iArr = this.f3825w;
        if (iArr == null || iArr.length < this.f3803a) {
            this.f3825w = new int[this.f3803a];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3803a; i13++) {
            f fVar = this.f3809g;
            if (fVar.f3985d == -1) {
                iL = fVar.f3987f;
                iP = this.f3804b[i13].p(iL);
            } else {
                iL = this.f3804b[i13].l(fVar.f3988g);
                iP = this.f3809g.f3988g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f3825w[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f3825w, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f3809g.a(yVar); i15++) {
            cVar.a(this.f3809g.f3984c, this.f3825w[i15]);
            f fVar2 = this.f3809g;
            fVar2.f3984c += fVar2.f3985d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return s(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return t(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return u(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF computeScrollVectorForPosition(int i10) {
        int iP = p(i10);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        if (this.f3807e == 0) {
            pointF.x = iP;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iP;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return s(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return t(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return u(yVar);
    }

    public final void d0(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3803a; i12++) {
            if (!this.f3804b[i12].f3853a.isEmpty()) {
                j0(this.f3804b[i12], i10, i11);
            }
        }
    }

    public final boolean e0(RecyclerView.y yVar, b bVar) {
        bVar.f3844a = this.f3817o ? D(yVar.b()) : z(yVar.b());
        bVar.f3845b = Integer.MIN_VALUE;
        return true;
    }

    public boolean f0(RecyclerView.y yVar, b bVar) {
        int i10;
        if (!yVar.e() && (i10 = this.f3813k) != -1) {
            if (i10 >= 0 && i10 < yVar.b()) {
                SavedState savedState = this.f3819q;
                if (savedState == null || savedState.f3833a == -1 || savedState.f3835c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f3813k);
                    if (viewFindViewByPosition != null) {
                        bVar.f3844a = this.f3811i ? H() : G();
                        if (this.f3814l != Integer.MIN_VALUE) {
                            if (bVar.f3846c) {
                                bVar.f3845b = (this.f3805c.i() - this.f3814l) - this.f3805c.d(viewFindViewByPosition);
                            } else {
                                bVar.f3845b = (this.f3805c.n() + this.f3814l) - this.f3805c.g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f3805c.e(viewFindViewByPosition) > this.f3805c.o()) {
                            bVar.f3845b = bVar.f3846c ? this.f3805c.i() : this.f3805c.n();
                            return true;
                        }
                        int iG = this.f3805c.g(viewFindViewByPosition) - this.f3805c.n();
                        if (iG < 0) {
                            bVar.f3845b = -iG;
                            return true;
                        }
                        int i11 = this.f3805c.i() - this.f3805c.d(viewFindViewByPosition);
                        if (i11 < 0) {
                            bVar.f3845b = i11;
                            return true;
                        }
                        bVar.f3845b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f3813k;
                        bVar.f3844a = i12;
                        int i13 = this.f3814l;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3846c = p(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3847d = true;
                    }
                } else {
                    bVar.f3845b = Integer.MIN_VALUE;
                    bVar.f3844a = this.f3813k;
                }
                return true;
            }
            this.f3813k = -1;
            this.f3814l = Integer.MIN_VALUE;
        }
        return false;
    }

    public void g0(RecyclerView.y yVar, b bVar) {
        if (f0(yVar, bVar) || e0(yVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3844a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateDefaultLayoutParams() {
        return this.f3807e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int getColumnCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f3807e == 1) {
            return Math.min(this.f3803a, yVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int getRowCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.f3807e == 0) {
            return Math.min(this.f3803a, yVar.b());
        }
        return -1;
    }

    public final void h0(int i10, RecyclerView.y yVar) {
        int iO;
        int iO2;
        int iC;
        f fVar = this.f3809g;
        boolean z10 = false;
        fVar.f3983b = 0;
        fVar.f3984c = i10;
        if (!isSmoothScrolling() || (iC = yVar.c()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.f3811i == (iC < i10)) {
                iO = this.f3805c.o();
                iO2 = 0;
            } else {
                iO2 = this.f3805c.o();
                iO = 0;
            }
        }
        if (getClipToPadding()) {
            this.f3809g.f3987f = this.f3805c.n() - iO2;
            this.f3809g.f3988g = this.f3805c.i() + iO;
        } else {
            this.f3809g.f3988g = this.f3805c.h() + iO;
            this.f3809g.f3987f = -iO2;
        }
        f fVar2 = this.f3809g;
        fVar2.f3989h = false;
        fVar2.f3982a = true;
        if (this.f3805c.l() == 0 && this.f3805c.h() == 0) {
            z10 = true;
        }
        fVar2.f3990i = z10;
    }

    public void i0(int i10) {
        this.f3808f = i10 / this.f3803a;
        this.f3820r = View.MeasureSpec.makeMeasureSpec(i10, this.f3806d.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isAutoMeasureEnabled() {
        return this.f3816n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isLayoutReversed() {
        return this.f3810h;
    }

    public final void j0(d dVar, int i10, int i11) {
        int iJ = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + iJ <= i11) {
                this.f3812j.set(dVar.f3857e, false);
            }
        } else if (dVar.k() - iJ >= i11) {
            this.f3812j.set(dVar.f3857e, false);
        }
    }

    public final void k(View view) {
        for (int i10 = this.f3803a - 1; i10 >= 0; i10--) {
            this.f3804b[i10].a(view);
        }
    }

    public final int k0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final void l(b bVar) {
        SavedState savedState = this.f3819q;
        int i10 = savedState.f3835c;
        if (i10 > 0) {
            if (i10 == this.f3803a) {
                for (int i11 = 0; i11 < this.f3803a; i11++) {
                    this.f3804b[i11].e();
                    SavedState savedState2 = this.f3819q;
                    int i12 = savedState2.f3836d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f3841i ? this.f3805c.i() : this.f3805c.n();
                    }
                    this.f3804b[i11].v(i12);
                }
            } else {
                savedState.e();
                SavedState savedState3 = this.f3819q;
                savedState3.f3833a = savedState3.f3834b;
            }
        }
        SavedState savedState4 = this.f3819q;
        this.f3818p = savedState4.f3842j;
        setReverseLayout(savedState4.f3840h);
        a0();
        SavedState savedState5 = this.f3819q;
        int i13 = savedState5.f3833a;
        if (i13 != -1) {
            this.f3813k = i13;
            bVar.f3846c = savedState5.f3841i;
        } else {
            bVar.f3846c = this.f3811i;
        }
        if (savedState5.f3837e > 1) {
            LazySpanLookup lazySpanLookup = this.f3815m;
            lazySpanLookup.f3827a = savedState5.f3838f;
            lazySpanLookup.f3828b = savedState5.f3839g;
        }
    }

    public boolean m() {
        int iL = this.f3804b[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3803a; i10++) {
            if (this.f3804b[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        int iP = this.f3804b[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3803a; i10++) {
            if (this.f3804b[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public final void o(View view, c cVar, f fVar) {
        if (fVar.f3986e == 1) {
            if (cVar.f3852f) {
                k(view);
                return;
            } else {
                cVar.f3851e.a(view);
                return;
            }
        }
        if (cVar.f3852f) {
            V(view);
        } else {
            cVar.f3851e.u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f3803a; i11++) {
            this.f3804b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f3803a; i11++) {
            this.f3804b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f3815m.b();
        for (int i10 = 0; i10 < this.f3803a; i10++) {
            this.f3804b[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        removeCallbacks(this.f3826x);
        for (int i10 = 0; i10 < this.f3803a; i10++) {
            this.f3804b[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public View onFocusSearchFailed(View view, int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        View viewFindContainingItemView;
        View viewM;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        a0();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        boolean z10 = cVar.f3852f;
        d dVar = cVar.f3851e;
        int iH = iConvertFocusDirectionToLayoutDirection == 1 ? H() : G();
        h0(iH, yVar);
        b0(iConvertFocusDirectionToLayoutDirection);
        f fVar = this.f3809g;
        fVar.f3984c = fVar.f3985d + iH;
        fVar.f3983b = (int) (this.f3805c.o() * 0.33333334f);
        f fVar2 = this.f3809g;
        fVar2.f3989h = true;
        fVar2.f3982a = false;
        y(uVar, fVar2, yVar);
        this.f3817o = this.f3811i;
        if (!z10 && (viewM = dVar.m(iH, iConvertFocusDirectionToLayoutDirection)) != null && viewM != viewFindContainingItemView) {
            return viewM;
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i11 = this.f3803a - 1; i11 >= 0; i11--) {
                View viewM2 = this.f3804b[i11].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM2 != null && viewM2 != viewFindContainingItemView) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3803a; i12++) {
                View viewM3 = this.f3804b[i12].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM3 != null && viewM3 != viewFindContainingItemView) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f3810h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z10) {
            View viewFindViewByPosition = findViewByPosition(z11 ? dVar.f() : dVar.g());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i13 = this.f3803a - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f3857e) {
                    View viewFindViewByPosition2 = findViewByPosition(z11 ? this.f3804b[i13].f() : this.f3804b[i13].g());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3803a; i14++) {
                View viewFindViewByPosition3 = findViewByPosition(z11 ? this.f3804b[i14].f() : this.f3804b[i14].g());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewB = B(false);
            View viewA = A(false);
            if (viewB == null || viewA == null) {
                return;
            }
            int position = getPosition(viewB);
            int position2 = getPosition(viewA);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityNodeInfo(RecyclerView.u uVar, RecyclerView.y yVar, x xVar) {
        super.onInitializeAccessibilityNodeInfo(uVar, yVar, xVar);
        xVar.m0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.y yVar, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, xVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f3807e == 0) {
            xVar.p0(x.f.a(cVar.e(), cVar.f3852f ? this.f3803a : 1, -1, -1, false, false));
        } else {
            xVar.p0(x.f.a(-1, -1, cVar.e(), cVar.f3852f ? this.f3803a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f3815m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        N(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        N(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        S(uVar, yVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.f3813k = -1;
        this.f3814l = Integer.MIN_VALUE;
        this.f3819q = null;
        this.f3822t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f3819q = savedState;
            if (this.f3813k != -1) {
                savedState.c();
                this.f3819q.e();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable onSaveInstanceState() {
        int iP;
        int iN;
        int[] iArr;
        if (this.f3819q != null) {
            return new SavedState(this.f3819q);
        }
        SavedState savedState = new SavedState();
        savedState.f3840h = this.f3810h;
        savedState.f3841i = this.f3817o;
        savedState.f3842j = this.f3818p;
        LazySpanLookup lazySpanLookup = this.f3815m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3827a) == null) {
            savedState.f3837e = 0;
        } else {
            savedState.f3838f = iArr;
            savedState.f3837e = iArr.length;
            savedState.f3839g = lazySpanLookup.f3828b;
        }
        if (getChildCount() <= 0) {
            savedState.f3833a = -1;
            savedState.f3834b = -1;
            savedState.f3835c = 0;
            return savedState;
        }
        savedState.f3833a = this.f3817o ? H() : G();
        savedState.f3834b = C();
        int i10 = this.f3803a;
        savedState.f3835c = i10;
        savedState.f3836d = new int[i10];
        for (int i11 = 0; i11 < this.f3803a; i11++) {
            if (this.f3817o) {
                iP = this.f3804b[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f3805c.i();
                    iP -= iN;
                }
            } else {
                iP = this.f3804b[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f3805c.n();
                    iP -= iN;
                }
            }
            savedState.f3836d[i11] = iP;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            q();
        }
    }

    public final int p(int i10) {
        if (getChildCount() == 0) {
            return this.f3811i ? 1 : -1;
        }
        return (i10 < G()) != this.f3811i ? -1 : 1;
    }

    public boolean q() {
        int iG;
        int iH;
        if (getChildCount() == 0 || this.f3816n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f3811i) {
            iG = H();
            iH = G();
        } else {
            iG = G();
            iH = H();
        }
        if (iG == 0 && O() != null) {
            this.f3815m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f3823u) {
            return false;
        }
        int i10 = this.f3811i ? -1 : 1;
        int i11 = iH + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.f3815m.e(iG, i11, i10, true);
        if (fullSpanItemE == null) {
            this.f3823u = false;
            this.f3815m.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.f3815m.e(iG, fullSpanItemE.f3829a, i10 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.f3815m.d(fullSpanItemE.f3829a);
        } else {
            this.f3815m.d(fullSpanItemE2.f3829a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final boolean r(d dVar) {
        boolean z10;
        if (!this.f3811i) {
            if (dVar.o() > this.f3805c.n()) {
                z10 = dVar.n((View) dVar.f3853a.get(0)).f3852f;
                return !z10;
            }
            return false;
        }
        if (dVar.k() < this.f3805c.i()) {
            z10 = dVar.n((View) dVar.f3853a.get(r0.size() - 1)).f3852f;
            return !z10;
        }
        return false;
    }

    public int scrollBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        U(i10, yVar);
        int iY = y(uVar, this.f3809g, yVar);
        if (this.f3809g.f3983b >= iY) {
            i10 = i10 < 0 ? -iY : iY;
        }
        this.f3805c.s(-i10);
        this.f3817o = this.f3811i;
        f fVar = this.f3809g;
        fVar.f3983b = 0;
        W(uVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int scrollHorizontallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i10, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void scrollToPosition(int i10) {
        SavedState savedState = this.f3819q;
        if (savedState != null && savedState.f3833a != i10) {
            savedState.c();
        }
        this.f3813k = i10;
        this.f3814l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int scrollVerticallyBy(int i10, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i10, uVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3807e == 1) {
            iChooseSize2 = RecyclerView.n.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.n.chooseSize(i10, (this.f3808f * this.f3803a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.n.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.n.chooseSize(i11, (this.f3808f * this.f3803a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f3807e) {
            return;
        }
        this.f3807e = i10;
        i iVar = this.f3805c;
        this.f3805c = this.f3806d;
        this.f3806d = iVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f3819q;
        if (savedState != null && savedState.f3840h != z10) {
            savedState.f3840h = z10;
        }
        this.f3810h = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.setTargetPosition(i10);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean supportsPredictiveItemAnimations() {
        return this.f3819q == null;
    }

    public final LazySpanLookup.FullSpanItem v(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3831c = new int[this.f3803a];
        for (int i11 = 0; i11 < this.f3803a; i11++) {
            fullSpanItem.f3831c[i11] = i10 - this.f3804b[i11].l(i10);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem w(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3831c = new int[this.f3803a];
        for (int i11 = 0; i11 < this.f3803a; i11++) {
            fullSpanItem.f3831c[i11] = this.f3804b[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    public final void x() {
        this.f3805c = i.b(this, this.f3807e);
        this.f3806d = i.b(this, 1 - this.f3807e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int y(RecyclerView.u uVar, f fVar, RecyclerView.y yVar) {
        d dVarM;
        int iL;
        int iE;
        int iN;
        int iE2;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r82 = 0;
        staggeredGridLayoutManager2.f3812j.set(0, staggeredGridLayoutManager2.f3803a, true);
        int i10 = staggeredGridLayoutManager2.f3809g.f3990i ? fVar.f3986e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar.f3986e == 1 ? fVar.f3988g + fVar.f3983b : fVar.f3987f - fVar.f3983b;
        staggeredGridLayoutManager2.d0(fVar.f3986e, i10);
        int i11 = staggeredGridLayoutManager2.f3811i ? staggeredGridLayoutManager2.f3805c.i() : staggeredGridLayoutManager2.f3805c.n();
        boolean z10 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (fVar.a(yVar) && (staggeredGridLayoutManager3.f3809g.f3990i || !staggeredGridLayoutManager3.f3812j.isEmpty())) {
            View viewB = fVar.b(uVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = staggeredGridLayoutManager3.f3815m.g(iA);
            boolean z11 = iG == -1 ? true : r82;
            if (z11) {
                dVarM = cVar.f3852f ? staggeredGridLayoutManager3.f3804b[r82] : staggeredGridLayoutManager3.M(fVar);
                staggeredGridLayoutManager3.f3815m.n(iA, dVarM);
            } else {
                dVarM = staggeredGridLayoutManager3.f3804b[iG];
            }
            d dVar = dVarM;
            cVar.f3851e = dVar;
            if (fVar.f3986e == 1) {
                staggeredGridLayoutManager3.addView(viewB);
            } else {
                staggeredGridLayoutManager3.addView(viewB, r82);
            }
            staggeredGridLayoutManager3.R(viewB, cVar, r82);
            if (fVar.f3986e == 1) {
                iE = cVar.f3852f ? staggeredGridLayoutManager3.I(i11) : dVar.l(i11);
                iL = staggeredGridLayoutManager3.f3805c.e(viewB) + iE;
                if (z11 && cVar.f3852f) {
                    LazySpanLookup.FullSpanItem fullSpanItemV = staggeredGridLayoutManager3.v(iE);
                    fullSpanItemV.f3830b = -1;
                    fullSpanItemV.f3829a = iA;
                    staggeredGridLayoutManager3.f3815m.a(fullSpanItemV);
                }
            } else {
                iL = cVar.f3852f ? staggeredGridLayoutManager3.L(i11) : dVar.p(i11);
                iE = iL - staggeredGridLayoutManager3.f3805c.e(viewB);
                if (z11 && cVar.f3852f) {
                    LazySpanLookup.FullSpanItem fullSpanItemW = staggeredGridLayoutManager3.w(iL);
                    fullSpanItemW.f3830b = 1;
                    fullSpanItemW.f3829a = iA;
                    staggeredGridLayoutManager3.f3815m.a(fullSpanItemW);
                }
            }
            if (cVar.f3852f && fVar.f3985d == -1) {
                if (z11) {
                    staggeredGridLayoutManager3.f3823u = true;
                } else {
                    if (!(fVar.f3986e == 1 ? staggeredGridLayoutManager3.m() : staggeredGridLayoutManager3.n())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = staggeredGridLayoutManager3.f3815m.f(iA);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f3832d = true;
                        }
                        staggeredGridLayoutManager3.f3823u = true;
                    }
                }
            }
            staggeredGridLayoutManager3.o(viewB, cVar, fVar);
            if (staggeredGridLayoutManager3.isLayoutRTL() && staggeredGridLayoutManager3.f3807e == 1) {
                iE2 = cVar.f3852f ? staggeredGridLayoutManager3.f3806d.i() : staggeredGridLayoutManager3.f3806d.i() - (((staggeredGridLayoutManager3.f3803a - 1) - dVar.f3857e) * staggeredGridLayoutManager3.f3808f);
                iN = iE2 - staggeredGridLayoutManager3.f3806d.e(viewB);
            } else {
                iN = cVar.f3852f ? staggeredGridLayoutManager3.f3806d.n() : (dVar.f3857e * staggeredGridLayoutManager3.f3808f) + staggeredGridLayoutManager3.f3806d.n();
                iE2 = staggeredGridLayoutManager3.f3806d.e(viewB) + iN;
            }
            int i12 = iE2;
            int i13 = iN;
            if (staggeredGridLayoutManager3.f3807e == 1) {
                staggeredGridLayoutManager3.layoutDecoratedWithMargins(viewB, i13, iE, i12, iL);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.layoutDecoratedWithMargins(viewB, iE, i13, iL, i12);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f3852f) {
                staggeredGridLayoutManager.d0(staggeredGridLayoutManager.f3809g.f3986e, i10);
            } else {
                staggeredGridLayoutManager.j0(dVar, staggeredGridLayoutManager.f3809g.f3986e, i10);
            }
            staggeredGridLayoutManager.W(uVar, staggeredGridLayoutManager.f3809g);
            if (staggeredGridLayoutManager.f3809g.f3989h && viewB.hasFocusable()) {
                if (cVar.f3852f) {
                    staggeredGridLayoutManager.f3812j.clear();
                } else {
                    staggeredGridLayoutManager.f3812j.set(dVar.f3857e, false);
                }
            }
            z10 = true;
            r82 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z10) {
            staggeredGridLayoutManager3.W(uVar, staggeredGridLayoutManager3.f3809g);
        }
        int iN2 = staggeredGridLayoutManager3.f3809g.f3986e == -1 ? staggeredGridLayoutManager3.f3805c.n() - staggeredGridLayoutManager3.L(staggeredGridLayoutManager3.f3805c.n()) : staggeredGridLayoutManager3.I(staggeredGridLayoutManager3.f3805c.i()) - staggeredGridLayoutManager3.f3805c.i();
        if (iN2 > 0) {
            return Math.min(fVar.f3983b, iN2);
        }
        return 0;
    }

    public final int z(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f3827a;

        /* renamed from: b, reason: collision with root package name */
        public List f3828b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.f3828b == null) {
                this.f3828b = new ArrayList();
            }
            int size = this.f3828b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f3828b.get(i10);
                if (fullSpanItem2.f3829a == fullSpanItem.f3829a) {
                    this.f3828b.remove(i10);
                }
                if (fullSpanItem2.f3829a >= fullSpanItem.f3829a) {
                    this.f3828b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f3828b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f3827a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3828b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f3827a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3827a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3827a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3827a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List list = this.f3828b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f3828b.get(size)).f3829a >= i10) {
                        this.f3828b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List list = this.f3828b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3828b.get(i13);
                int i14 = fullSpanItem.f3829a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f3830b == i12 || (z10 && fullSpanItem.f3832d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List list = this.f3828b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3828b.get(size);
                if (fullSpanItem.f3829a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f3827a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f3827a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3827a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3827a.length;
            }
            int iMin = Math.min(i11 + 1, this.f3827a.length);
            Arrays.fill(this.f3827a, i10, iMin, -1);
            return iMin;
        }

        public final int i(int i10) {
            if (this.f3828b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i10);
            if (fullSpanItemF != null) {
                this.f3828b.remove(fullSpanItemF);
            }
            int size = this.f3828b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((FullSpanItem) this.f3828b.get(i11)).f3829a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f3828b.get(i11);
            this.f3828b.remove(i11);
            return fullSpanItem.f3829a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f3827a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3827a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3827a, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f3827a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3827a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3827a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List list = this.f3828b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3828b.get(size);
                int i12 = fullSpanItem.f3829a;
                if (i12 >= i10) {
                    fullSpanItem.f3829a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List list = this.f3828b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3828b.get(size);
                int i13 = fullSpanItem.f3829a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3828b.remove(size);
                    } else {
                        fullSpanItem.f3829a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, d dVar) {
            c(i10);
            this.f3827a[i10] = dVar.f3857e;
        }

        public int o(int i10) {
            int length = this.f3827a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public int f3829a;

            /* renamed from: b, reason: collision with root package name */
            public int f3830b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f3831c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f3832d;

            public class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f3829a = parcel.readInt();
                this.f3830b = parcel.readInt();
                this.f3832d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f3831c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int c(int i10) {
                int[] iArr = this.f3831c;
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
                return "FullSpanItem{mPosition=" + this.f3829a + ", mGapDir=" + this.f3830b + ", mHasUnwantedGapAfter=" + this.f3832d + ", mGapPerSpan=" + Arrays.toString(this.f3831c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3829a);
                parcel.writeInt(this.f3830b);
                parcel.writeInt(this.f3832d ? 1 : 0);
                int[] iArr = this.f3831c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3831c);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
