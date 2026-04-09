package androidx.viewpager.widget;

import a0.a0;
import a0.p;
import a0.s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: i0, reason: collision with root package name */
    static final int[] f2346i0 = {R.attr.layout_gravity};

    /* renamed from: j0, reason: collision with root package name */
    private static final Comparator<f> f2347j0 = new a();

    /* renamed from: k0, reason: collision with root package name */
    private static final Interpolator f2348k0 = new b();

    /* renamed from: l0, reason: collision with root package name */
    private static final n f2349l0 = new n();
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private List<j> V;
    private j W;

    /* renamed from: a0, reason: collision with root package name */
    private j f2350a0;

    /* renamed from: b, reason: collision with root package name */
    private int f2351b;

    /* renamed from: b0, reason: collision with root package name */
    private List<i> f2352b0;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<f> f2353c;

    /* renamed from: c0, reason: collision with root package name */
    private k f2354c0;

    /* renamed from: d, reason: collision with root package name */
    private final f f2355d;

    /* renamed from: d0, reason: collision with root package name */
    private int f2356d0;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f2357e;

    /* renamed from: e0, reason: collision with root package name */
    private int f2358e0;

    /* renamed from: f, reason: collision with root package name */
    androidx.viewpager.widget.a f2359f;

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList<View> f2360f0;

    /* renamed from: g, reason: collision with root package name */
    int f2361g;

    /* renamed from: g0, reason: collision with root package name */
    private final Runnable f2362g0;

    /* renamed from: h, reason: collision with root package name */
    private int f2363h;

    /* renamed from: h0, reason: collision with root package name */
    private int f2364h0;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f2365i;

    /* renamed from: j, reason: collision with root package name */
    private ClassLoader f2366j;

    /* renamed from: k, reason: collision with root package name */
    private Scroller f2367k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2368l;

    /* renamed from: m, reason: collision with root package name */
    private l f2369m;

    /* renamed from: n, reason: collision with root package name */
    private int f2370n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f2371o;

    /* renamed from: p, reason: collision with root package name */
    private int f2372p;

    /* renamed from: q, reason: collision with root package name */
    private int f2373q;

    /* renamed from: r, reason: collision with root package name */
    private float f2374r;

    /* renamed from: s, reason: collision with root package name */
    private float f2375s;

    /* renamed from: t, reason: collision with root package name */
    private int f2376t;

    /* renamed from: u, reason: collision with root package name */
    private int f2377u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2378v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2379w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2380x;

    /* renamed from: y, reason: collision with root package name */
    private int f2381y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f2382z;

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f2387b - fVar2.f2387b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.C();
        }
    }

    class d implements p {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f2384a = new Rect();

        d() {
        }

        @Override // a0.p
        public a0 a(View view, a0 a0Var) {
            a0 a0VarI = s.I(view, a0Var);
            if (a0VarI.i()) {
                return a0VarI;
            }
            Rect rect = this.f2384a;
            rect.left = a0VarI.e();
            rect.top = a0VarI.g();
            rect.right = a0VarI.f();
            rect.bottom = a0VarI.d();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a0 a0VarE = s.e(ViewPager.this.getChildAt(i2), a0VarI);
                rect.left = Math.min(a0VarE.e(), rect.left);
                rect.top = Math.min(a0VarE.g(), rect.top);
                rect.right = Math.min(a0VarE.f(), rect.right);
                rect.bottom = Math.min(a0VarE.d(), rect.bottom);
            }
            return a0VarI.j(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f2386a;

        /* renamed from: b, reason: collision with root package name */
        int f2387b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2388c;

        /* renamed from: d, reason: collision with root package name */
        float f2389d;

        /* renamed from: e, reason: collision with root package name */
        float f2390e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2391a;

        /* renamed from: b, reason: collision with root package name */
        public int f2392b;

        /* renamed from: c, reason: collision with root package name */
        float f2393c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2394d;

        /* renamed from: e, reason: collision with root package name */
        int f2395e;

        /* renamed from: f, reason: collision with root package name */
        int f2396f;

        public g() {
            super(-1, -1);
            this.f2393c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2393c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2346i0);
            this.f2392b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class h extends a0.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f2359f;
            return aVar != null && aVar.c() > 1;
        }

        @Override // a0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f2359f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f2361g);
            accessibilityEvent.setToIndex(ViewPager.this.f2361g);
        }

        @Override // a0.a
        public void g(View view, b0.c cVar) {
            super.g(view, cVar);
            cVar.J(ViewPager.class.getName());
            cVar.P(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        @Override // a0.a
        public boolean j(View view, int i2, Bundle bundle) throws Resources.NotFoundException {
            ViewPager viewPager;
            int i3;
            if (super.j(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f2361g - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i3 = viewPager.f2361g + 1;
            }
            viewPager.setCurrentItem(i3);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i2);

        void b(int i2, float f2, int i3);

        void c(int i2);
    }

    public interface k {
        void a(View view, float f2);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.f();
        }
    }

    public static class m extends d0.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f2399d;

        /* renamed from: e, reason: collision with root package name */
        Parcelable f2400e;

        /* renamed from: f, reason: collision with root package name */
        ClassLoader f2401f;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f2399d = parcel.readInt();
            this.f2400e = parcel.readParcelable(classLoader);
            this.f2401f = classLoader;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2399d + "}";
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f2399d);
            parcel.writeParcelable(this.f2400e, i2);
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z2 = gVar.f2391a;
            return z2 != gVar2.f2391a ? z2 ? 1 : -1 : gVar.f2395e - gVar2.f2395e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2353c = new ArrayList<>();
        this.f2355d = new f();
        this.f2357e = new Rect();
        this.f2363h = -1;
        this.f2365i = null;
        this.f2366j = null;
        this.f2374r = -3.4028235E38f;
        this.f2375s = Float.MAX_VALUE;
        this.f2381y = 1;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.f2362g0 = new c();
        this.f2364h0 = 0;
        t();
    }

    private boolean A(int i2) {
        if (this.f2353c.size() == 0) {
            if (this.R) {
                return false;
            }
            this.T = false;
            w(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarR = r();
        int clientWidth = getClientWidth();
        int i3 = this.f2370n;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarR.f2387b;
        float f3 = ((i2 / f2) - fVarR.f2390e) / (fVarR.f2389d + (i3 / f2));
        this.T = false;
        w(i5, f3, (int) (i4 * f3));
        if (this.T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean B(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.E - f2;
        this.E = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f2374r * clientWidth;
        float f5 = this.f2375s * clientWidth;
        boolean z4 = false;
        f fVar = this.f2353c.get(0);
        ArrayList<f> arrayList = this.f2353c;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2387b != 0) {
            f4 = fVar.f2390e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.f2387b != this.f2359f.c() - 1) {
            f5 = fVar2.f2390e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.P.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.Q.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.E += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z4;
    }

    private void E(int i2, int i3, int i4, int i5) {
        int iMin;
        if (i3 <= 0 || this.f2353c.isEmpty()) {
            f fVarS = s(this.f2361g);
            iMin = (int) ((fVarS != null ? Math.min(fVarS.f2390e, this.f2375s) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                e(false);
            }
        } else if (!this.f2367k.isFinished()) {
            this.f2367k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(iMin, getScrollY());
    }

    private void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f2391a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void G(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean H() {
        this.I = -1;
        m();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    private void I(int i2, boolean z2, int i3, boolean z3) throws Resources.NotFoundException {
        f fVarS = s(i2);
        int clientWidth = fVarS != null ? (int) (getClientWidth() * Math.max(this.f2374r, Math.min(fVarS.f2390e, this.f2375s))) : 0;
        if (z2) {
            M(clientWidth, 0, i3);
            if (z3) {
                i(i2);
                return;
            }
            return;
        }
        if (z3) {
            i(i2);
        }
        e(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    private void N() {
        if (this.f2358e0 != 0) {
            ArrayList<View> arrayList = this.f2360f0;
            if (arrayList == null) {
                this.f2360f0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f2360f0.add(getChildAt(i2));
            }
            Collections.sort(this.f2360f0, f2349l0);
        }
    }

    private void c(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iC = this.f2359f.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.f2370n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f2387b;
            int i6 = fVar.f2387b;
            if (i5 < i6) {
                float fE = fVar2.f2390e + fVar2.f2389d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f2387b && i8 < this.f2353c.size()) {
                    while (true) {
                        fVar4 = this.f2353c.get(i8);
                        if (i7 <= fVar4.f2387b || i8 >= this.f2353c.size() - 1) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    while (i7 < fVar4.f2387b) {
                        fE += this.f2359f.e(i7) + f2;
                        i7++;
                    }
                    fVar4.f2390e = fE;
                    fE += fVar4.f2389d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f2353c.size() - 1;
                float fE2 = fVar2.f2390e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f2387b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f2353c.get(size);
                        if (i5 >= fVar3.f2387b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i5 > fVar3.f2387b) {
                        fE2 -= this.f2359f.e(i5) + f2;
                        i5--;
                    }
                    fE2 -= fVar3.f2389d + f2;
                    fVar3.f2390e = fE2;
                }
            }
        }
        int size2 = this.f2353c.size();
        float fE3 = fVar.f2390e;
        int i9 = fVar.f2387b;
        int i10 = i9 - 1;
        this.f2374r = i9 == 0 ? fE3 : -3.4028235E38f;
        int i11 = iC - 1;
        this.f2375s = i9 == i11 ? (fVar.f2389d + fE3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.f2353c.get(i12);
            while (true) {
                i4 = fVar5.f2387b;
                if (i10 <= i4) {
                    break;
                }
                fE3 -= this.f2359f.e(i10) + f2;
                i10--;
            }
            fE3 -= fVar5.f2389d + f2;
            fVar5.f2390e = fE3;
            if (i4 == 0) {
                this.f2374r = fE3;
            }
            i12--;
            i10--;
        }
        float fE4 = fVar.f2390e + fVar.f2389d + f2;
        int i13 = fVar.f2387b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.f2353c.get(i14);
            while (true) {
                i3 = fVar6.f2387b;
                if (i13 >= i3) {
                    break;
                }
                fE4 += this.f2359f.e(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.f2375s = (fVar6.f2389d + fE4) - 1.0f;
            }
            fVar6.f2390e = fE4;
            fE4 += fVar6.f2389d + f2;
            i14++;
            i13++;
        }
        this.S = false;
    }

    private void e(boolean z2) {
        boolean z3 = this.f2364h0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f2367k.isFinished()) {
                this.f2367k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2367k.getCurrX();
                int currY = this.f2367k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.f2380x = false;
        for (int i2 = 0; i2 < this.f2353c.size(); i2++) {
            f fVar = this.f2353c.get(i2);
            if (fVar.f2388c) {
                fVar.f2388c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                s.L(this, this.f2362g0);
            } else {
                this.f2362g0.run();
            }
        }
    }

    private int g(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.M || Math.abs(i3) <= this.K) {
            i2 += (int) (f2 + (i2 >= this.f2361g ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f2353c.size() <= 0) {
            return i2;
        }
        return Math.max(this.f2353c.get(0).f2387b, Math.min(i2, this.f2353c.get(r4.size() - 1).f2387b));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i2, float f2, int i3) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.b(i2, f2, i3);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.V.get(i4);
                if (jVar2 != null) {
                    jVar2.b(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.f2350a0;
        if (jVar3 != null) {
            jVar3.b(i2, f2, i3);
        }
    }

    private void i(int i2) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.a(i2);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.V.get(i3);
                if (jVar2 != null) {
                    jVar2.a(i2);
                }
            }
        }
        j jVar3 = this.f2350a0;
        if (jVar3 != null) {
            jVar3.a(i2);
        }
    }

    private void j(int i2) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.V.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.f2350a0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void l(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.f2356d0 : 0, null);
        }
    }

    private void m() {
        this.f2382z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    private Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f r() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f2370n / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f2353c.size()) {
            f fVar2 = this.f2353c.get(i4);
            if (!z2 && fVar2.f2387b != (i2 = i3 + 1)) {
                fVar2 = this.f2355d;
                fVar2.f2390e = f2 + f4 + f3;
                fVar2.f2387b = i2;
                fVar2.f2389d = this.f2359f.e(i2);
                i4--;
            }
            f2 = fVar2.f2390e;
            float f5 = fVar2.f2389d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f2353c.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f2387b;
            f4 = fVar2.f2389d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.f2379w != z2) {
            this.f2379w = z2;
        }
    }

    private static boolean u(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean v(float f2, float f3) {
        return (f2 < ((float) this.C) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.C)) && f3 < 0.0f);
    }

    private void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i2);
            this.I = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    void C() throws Resources.NotFoundException {
        D(this.f2361g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[PHI: r7 r10 r15
  0x00de: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[PHI: r7 r10 r15
  0x00e7: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void D(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int):void");
    }

    public void J(int i2, boolean z2) throws Resources.NotFoundException {
        this.f2380x = false;
        K(i2, z2, false);
    }

    void K(int i2, boolean z2, boolean z3) throws Resources.NotFoundException {
        L(i2, z2, z3, 0);
    }

    void L(int i2, boolean z2, boolean z3, int i3) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f2359f;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z3 && this.f2361g == i2 && this.f2353c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f2359f.c()) {
            i2 = this.f2359f.c() - 1;
        }
        int i4 = this.f2381y;
        int i5 = this.f2361g;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f2353c.size(); i6++) {
                this.f2353c.get(i6).f2388c = true;
            }
        }
        boolean z4 = this.f2361g != i2;
        if (!this.R) {
            D(i2);
            I(i2, z2, i3, z4);
        } else {
            this.f2361g = i2;
            if (z4) {
                i(i2);
            }
            requestLayout();
        }
    }

    void M(int i2, int i3, int i4) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f2367k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f2368l ? this.f2367k.getCurrX() : this.f2367k.getStartX();
            this.f2367k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            e(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fK = f3 + (k(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fK / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.f2359f.e(this.f2361g)) + this.f2370n)) + 1.0f) * 100.0f), 600);
        this.f2368l = false;
        this.f2367k.startScroll(i5, scrollY, i6, i7, iMin);
        s.K(this);
    }

    f a(int i2, int i3) {
        f fVar = new f();
        fVar.f2387b = i2;
        fVar.f2386a = this.f2359f.f(this, i2);
        fVar.f2389d = this.f2359f.e(i2);
        if (i3 < 0 || i3 >= this.f2353c.size()) {
            this.f2353c.add(fVar);
        } else {
            this.f2353c.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarQ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f2387b == this.f2361g) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarQ;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f2387b == this.f2361g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zU = gVar.f2391a | u(view);
        gVar.f2391a = zU;
        if (!this.f2378v) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zU) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f2394d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb5
            if (r3 == r0) goto Lb5
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f2357e
            android.graphics.Rect r1 = r6.o(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2357e
            android.graphics.Rect r2 = r6.o(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.y()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lc8
        L9a:
            if (r7 != r4) goto Lc8
            android.graphics.Rect r1 = r6.f2357e
            android.graphics.Rect r1 = r6.o(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2357e
            android.graphics.Rect r2 = r6.o(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 > r2) goto L94
            boolean r0 = r6.z()
            goto L98
        Lb5:
            if (r7 == r5) goto Lc4
            if (r7 != r1) goto Lba
            goto Lc4
        Lba:
            if (r7 == r4) goto Lbf
            r0 = 2
            if (r7 != r0) goto Lc8
        Lbf:
            boolean r2 = r6.z()
            goto Lc8
        Lc4:
            boolean r2 = r6.y()
        Lc8:
            if (r2 == 0) goto Ld1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f2359f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2374r)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f2375s));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f2368l = true;
        if (this.f2367k.isFinished() || !this.f2367k.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2367k.getCurrX();
        int currY = this.f2367k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.f2367k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        s.K(this);
    }

    protected boolean d(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && d(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarQ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f2387b == this.f2361g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2359f) != null && aVar.c() > 1)) {
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f2374r * width);
                this.P.setSize(height, width);
                zDraw = false | this.P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Q.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f2375s + 1.0f)) * width2);
                this.Q.setSize(height2, width2);
                zDraw |= this.Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (zDraw) {
            s.K(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2371o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    void f() throws Resources.NotFoundException {
        int iC = this.f2359f.c();
        this.f2351b = iC;
        boolean z2 = this.f2353c.size() < (this.f2381y * 2) + 1 && this.f2353c.size() < iC;
        int iMax = this.f2361g;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f2353c.size()) {
            f fVar = this.f2353c.get(i2);
            int iD = this.f2359f.d(fVar.f2386a);
            if (iD != -1) {
                if (iD == -2) {
                    this.f2353c.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f2359f.l(this);
                        z3 = true;
                    }
                    this.f2359f.a(this, fVar.f2387b, fVar.f2386a);
                    int i3 = this.f2361g;
                    if (i3 == fVar.f2387b) {
                        iMax = Math.max(0, Math.min(i3, iC - 1));
                    }
                } else {
                    int i4 = fVar.f2387b;
                    if (i4 != iD) {
                        if (i4 == this.f2361g) {
                            iMax = iD;
                        }
                        fVar.f2387b = iD;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f2359f.b(this);
        }
        Collections.sort(this.f2353c, f2347j0);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.f2391a) {
                    gVar.f2393c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f2359f;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.f2358e0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.f2360f0.get(i3).getLayoutParams()).f2396f;
    }

    public int getCurrentItem() {
        return this.f2361g;
    }

    public int getOffscreenPageLimit() {
        return this.f2381y;
    }

    public int getPageMargin() {
        return this.f2370n;
    }

    float k(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public boolean n(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return b(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return b(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return z();
                    }
                    i2 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return y();
                }
                i2 = 17;
            }
            return b(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2362g0);
        Scroller scroller = this.f2367k;
        if (scroller != null && !scroller.isFinished()) {
            this.f2367k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f2370n <= 0 || this.f2371o == null || this.f2353c.size() <= 0 || this.f2359f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f2370n / width;
        int i3 = 0;
        f fVar = this.f2353c.get(0);
        float f5 = fVar.f2390e;
        int size = this.f2353c.size();
        int i4 = fVar.f2387b;
        int i5 = this.f2353c.get(size - 1).f2387b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f2387b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.f2353c.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.f2390e;
                float f7 = fVar.f2389d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float fE = this.f2359f.e(i4);
                f2 = (f5 + fE) * width;
                f5 += fE + f4;
            }
            if (this.f2370n + f2 > scrollX) {
                f3 = f4;
                this.f2371o.setBounds(Math.round(f2), this.f2372p, Math.round(this.f2370n + f2), this.f2373q);
                this.f2371o.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.f2382z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.G = x2;
            this.E = x2;
            float y2 = motionEvent.getY();
            this.H = y2;
            this.F = y2;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f2368l = true;
            this.f2367k.computeScrollOffset();
            if (this.f2364h0 != 2 || Math.abs(this.f2367k.getFinalX() - this.f2367k.getCurrX()) <= this.N) {
                e(false);
                this.f2382z = false;
            } else {
                this.f2367k.abortAnimation();
                this.f2380x = false;
                C();
                this.f2382z = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.I;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float f2 = x3 - this.E;
                float fAbs = Math.abs(f2);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y3 - this.H);
                if (f2 != 0.0f && !v(this.E, f2) && d(this, false, (int) f2, (int) x3, (int) y3)) {
                    this.E = x3;
                    this.F = y3;
                    this.A = true;
                    return false;
                }
                int i3 = this.D;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.f2382z = true;
                    G(true);
                    setScrollState(1);
                    this.E = f2 > 0.0f ? this.G + this.D : this.G - this.D;
                    this.F = y3;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.A = true;
                }
                if (this.f2382z && B(x3)) {
                    s.K(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f2382z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f fVarQ;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f2387b == this.f2361g && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.f2359f;
        if (aVar != null) {
            aVar.h(mVar.f2400e, mVar.f2401f);
            K(mVar.f2399d, false, true);
        } else {
            this.f2363h = mVar.f2399d;
            this.f2365i = mVar.f2400e;
            this.f2366j = mVar.f2401f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f2399d = this.f2361g;
        androidx.viewpager.widget.a aVar = this.f2359f;
        if (aVar != null) {
            mVar.f2400e = aVar.i();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f2370n;
            E(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    f p(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f q(View view) {
        for (int i2 = 0; i2 < this.f2353c.size(); i2++) {
            f fVar = this.f2353c.get(i2);
            if (this.f2359f.g(view, fVar.f2386a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2378v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    f s(int i2) {
        for (int i3 = 0; i3 < this.f2353c.size(); i3++) {
            f fVar = this.f2353c.get(i3);
            if (fVar.f2387b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar2 = this.f2359f;
        if (aVar2 != null) {
            aVar2.k(null);
            this.f2359f.l(this);
            for (int i2 = 0; i2 < this.f2353c.size(); i2++) {
                f fVar = this.f2353c.get(i2);
                this.f2359f.a(this, fVar.f2387b, fVar.f2386a);
            }
            this.f2359f.b(this);
            this.f2353c.clear();
            F();
            this.f2361g = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f2359f;
        this.f2359f = aVar;
        this.f2351b = 0;
        if (aVar != null) {
            if (this.f2369m == null) {
                this.f2369m = new l();
            }
            this.f2359f.k(this.f2369m);
            this.f2380x = false;
            boolean z2 = this.R;
            this.R = true;
            this.f2351b = this.f2359f.c();
            if (this.f2363h >= 0) {
                this.f2359f.h(this.f2365i, this.f2366j);
                K(this.f2363h, false, true);
                this.f2363h = -1;
                this.f2365i = null;
                this.f2366j = null;
            } else if (z2) {
                requestLayout();
            } else {
                C();
            }
        }
        List<i> list = this.f2352b0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f2352b0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2352b0.get(i3).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i2) throws Resources.NotFoundException {
        this.f2380x = false;
        K(i2, !this.R, false);
    }

    public void setOffscreenPageLimit(int i2) throws Resources.NotFoundException {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f2381y) {
            this.f2381y = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.W = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f2370n;
        this.f2370n = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(r.a.c(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2371o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i2) {
        if (this.f2364h0 == i2) {
            return;
        }
        this.f2364h0 = i2;
        if (this.f2354c0 != null) {
            l(i2 != 0);
        }
        j(i2);
    }

    void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2367k = new Scroller(context, f2348k0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f2);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.M = (int) (25.0f * f2);
        this.N = (int) (2.0f * f2);
        this.B = (int) (f2 * 16.0f);
        s.Q(this, new h());
        if (s.r(this) == 0) {
            s.V(this, 1);
        }
        s.X(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2371o;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void w(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f2391a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f2392b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.h(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f2354c0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f2391a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f2354c0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.w(int, float, int):void");
    }

    boolean y() throws Resources.NotFoundException {
        int i2 = this.f2361g;
        if (i2 <= 0) {
            return false;
        }
        J(i2 - 1, true);
        return true;
    }

    boolean z() throws Resources.NotFoundException {
        androidx.viewpager.widget.a aVar = this.f2359f;
        if (aVar == null || this.f2361g >= aVar.c() - 1) {
            return false;
        }
        J(this.f2361g + 1, true);
        return true;
    }
}
