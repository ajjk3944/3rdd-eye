package com.bytedance.adsdk.ugeno.pno;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import je.u;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh extends ViewGroup {
    private final vt bly;
    private int bs;

    /* renamed from: cd, reason: collision with root package name */
    private boolean f6934cd;

    /* renamed from: cf, reason: collision with root package name */
    private int f6935cf;

    /* renamed from: cj, reason: collision with root package name */
    private EdgeEffect f6936cj;
    private final Runnable coz;
    private int ex;
    private float ey;
    private float fak;
    public List<yu> fkw;
    private int fqk;
    private int fvf;
    private int hun;
    private boolean jae;

    /* renamed from: jg, reason: collision with root package name */
    private Scroller f6937jg;
    private int jqy;
    private VelocityTracker jvy;
    private boolean kn;
    private boolean ko;
    private boolean ksc;

    /* renamed from: lh, reason: collision with root package name */
    com.bytedance.adsdk.ugeno.pno.vt f6938lh;
    private int lso;
    private int lvd;
    private List<Object> mt;
    private ClassLoader mwh;
    private int myk;

    /* renamed from: ng, reason: collision with root package name */
    private ArrayList<View> f6939ng;

    /* renamed from: od, reason: collision with root package name */
    private int f6940od;
    private float osn;
    private int ouw;

    /* renamed from: pd, reason: collision with root package name */
    private int f6941pd;
    private final ArrayList<vt> pno;
    private EdgeEffect pv;
    private int qbp;
    private le rn;
    private int rrs;
    private Parcelable ryl;
    private boolean tc;

    /* renamed from: th, reason: collision with root package name */
    private int f6942th;
    private final Rect tlj;

    /* renamed from: ub, reason: collision with root package name */
    private boolean f6943ub;
    private boolean ucs;
    private float uoy;
    private boolean uq;
    private int ux;

    /* renamed from: vh, reason: collision with root package name */
    private int f6944vh;
    private Drawable vm;
    private float vpp;
    private boolean wp;
    private fkw xdk;
    private yu yhj;
    private yu yib;
    int yu;
    private int zih;
    private float zin;
    private int zvq;
    static final int[] vt = {R.attr.layout_gravity};

    /* renamed from: le, reason: collision with root package name */
    private static final Comparator<vt> f6933le = new Comparator<vt>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(vt vtVar, vt vtVar2) {
            return vtVar.vt - vtVar2.vt;
        }
    };
    private static final Interpolator ra = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.pno.lh.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final pno fwd = new pno();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface fkw {
        void ouw(View view, float f10);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class le extends DataSetObserver {
        public le() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() throws Resources.NotFoundException {
            lh.this.ouw();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() throws Resources.NotFoundException {
            lh.this.ouw();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ouw {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class pno implements Comparator<View> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C0034lh c0034lh = (C0034lh) view.getLayoutParams();
            C0034lh c0034lh2 = (C0034lh) view2.getLayoutParams();
            boolean z3 = c0034lh.ouw;
            return z3 != c0034lh2.ouw ? z3 ? 1 : -1 : c0034lh.fkw - c0034lh2.fkw;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ra extends com.bytedance.adsdk.ugeno.pno.ouw {
        public static final Parcelable.Creator<ra> CREATOR = new Parcelable.ClassLoaderCreator<ra>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.ra.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ra createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ra(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i4) {
                return new ra[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ra(parcel, null);
            }
        };
        ClassLoader fkw;

        /* renamed from: lh, reason: collision with root package name */
        int f6947lh;
        Parcelable yu;

        public ra(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return c.j(this.f6947lh, "}", sb2);
        }

        @Override // com.bytedance.adsdk.ugeno.pno.ouw, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f6947lh);
            parcel.writeParcelable(this.yu, i4);
        }

        public ra(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? ra.class.getClassLoader() : classLoader;
            this.f6947lh = parcel.readInt();
            this.yu = parcel.readParcelable(classLoader);
            this.fkw = classLoader;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {
        float fkw;

        /* renamed from: lh, reason: collision with root package name */
        boolean f6948lh;
        Object ouw;
        int vt;
        float yu;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface yu {
        void bly(int i4);

        void ouw(int i4, float f10, int i10);

        void tlj(int i4);
    }

    public lh(Context context) {
        super(context);
        this.pno = new ArrayList<>();
        this.bly = new vt();
        this.tlj = new Rect();
        this.f6935cf = -1;
        this.ryl = null;
        this.mwh = null;
        this.zin = -3.4028235E38f;
        this.vpp = Float.MAX_VALUE;
        this.f6940od = 1;
        this.rrs = -1;
        this.wp = true;
        this.kn = false;
        this.coz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.pno.lh.3
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                lh.this.setScrollState(0);
                lh.this.vt();
            }
        };
        this.lvd = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f6937jg = new Scroller(context2, ra);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.bs = viewConfiguration.getScaledPagingTouchSlop();
        this.fqk = (int) (400.0f * f10);
        this.hun = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6936cj = new EdgeEffect(context2);
        this.pv = new EdgeEffect(context2);
        this.ux = (int) (25.0f * f10);
        this.lso = (int) (2.0f * f10);
        this.f6941pd = (int) (f10 * 16.0f);
    }

    private boolean bly() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f6938lh;
        if (vtVar == null || this.yu >= vtVar.ouw() - 1) {
            return false;
        }
        ouw(this.yu + 1, true);
        return true;
    }

    private void fkw() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private vt le() {
        int i4;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.zih / clientWidth : 0.0f;
        int i10 = 0;
        boolean z3 = true;
        vt vtVar = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (i10 < this.pno.size()) {
            vt vtVar2 = this.pno.get(i10);
            if (!z3 && vtVar2.vt != (i4 = i11 + 1)) {
                vtVar2 = this.bly;
                vtVar2.fkw = f10 + f12 + f11;
                vtVar2.vt = i4;
                vtVar2.yu = this.f6938lh.vt();
                i10--;
            }
            vt vtVar3 = vtVar2;
            f10 = vtVar3.fkw;
            float f13 = vtVar3.yu + f10 + f11;
            if (!z3 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i10 == this.pno.size() - 1) {
                return vtVar3;
            }
            int i12 = vtVar3.vt;
            float f14 = vtVar3.yu;
            i10++;
            i11 = i12;
            f12 = f14;
            vtVar = vtVar3;
            z3 = false;
        }
        return vtVar;
    }

    private void lh() {
        if (this.myk != 0) {
            ArrayList<View> arrayList = this.f6939ng;
            if (arrayList == null) {
                this.f6939ng = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f6939ng.add(getChildAt(i4));
            }
            Collections.sort(this.f6939ng, fwd);
        }
    }

    private boolean pno() throws Resources.NotFoundException {
        int i4 = this.yu;
        if (i4 <= 0) {
            return false;
        }
        ouw(i4 - 1, true);
        return true;
    }

    private void ra() {
        this.f6934cd = false;
        this.uq = false;
        VelocityTracker velocityTracker = this.jvy;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.jvy = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.ksc != z3) {
            this.ksc = z3;
        }
    }

    private void vt(boolean z3, fkw fkwVar) throws Resources.NotFoundException {
        boolean z10 = fkwVar != null;
        boolean z11 = z10 != (this.xdk != null);
        this.xdk = fkwVar;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            this.myk = z3 ? 2 : 1;
            this.zvq = 2;
        } else {
            this.myk = 0;
        }
        if (z11) {
            vt();
        }
    }

    private void yu(int i4) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.bly(i4);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                yu yuVar2 = this.fkw.get(i10);
                if (yuVar2 != null) {
                    yuVar2.bly(i4);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.bly(i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i10) {
        vt vtVarOuw;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
                    childAt.addFocusables(arrayList, i4, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        vt vtVarOuw;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0034lh c0034lh = (C0034lh) layoutParams;
        boolean z3 = c0034lh.ouw | (view.getClass().getAnnotation(ouw.class) != null);
        c0034lh.ouw = z3;
        if (!this.tc) {
            super.addView(view, i4, layoutParams);
        } else {
            if (z3) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0034lh.yu = true;
            addViewInLayout(view, i4, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (this.f6938lh == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i4 < 0 ? scrollX > ((int) (((float) clientWidth) * this.zin)) : i4 > 0 && scrollX < ((int) (((float) clientWidth) * this.vpp));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0034lh) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.ko = true;
        if (this.f6937jg.isFinished() || !this.f6937jg.computeScrollOffset()) {
            ouw(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f6937jg.getCurrX();
        int currY = this.f6937jg.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!lh(currX)) {
                this.f6937jg.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.fkw(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.fkw(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.bly()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.fkw(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.pno()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.fkw(r6)
            goto L5b
        L5a:
            r6 = r2
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vt vtVarOuw;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (vtVar = this.f6938lh) != null && vtVar.ouw() > 1)) {
            if (!this.f6936cj.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.zin * width);
                this.f6936cj.setSize(height, width);
                zDraw = this.f6936cj.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.pv.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.vpp + 1.0f)) * width2);
                this.pv.setSize(height2, width2);
                zDraw |= this.pv.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f6936cj.finish();
            this.pv.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.vm;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0034lh();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.pno.vt getAdapter() {
        return this.f6938lh;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i4, int i10) {
        if (this.myk == 2) {
            i10 = (i4 - 1) - i10;
        }
        return ((C0034lh) this.f6939ng.get(i10).getLayoutParams()).f6945le;
    }

    public int getCurrentItem() {
        return this.yu;
    }

    public int getOffscreenPageLimit() {
        return this.f6940od;
    }

    public int getPageMargin() {
        return this.zih;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.wp = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.coz);
        Scroller scroller = this.f6937jg;
        if (scroller != null && !scroller.isFinished()) {
            this.f6937jg.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i4;
        float f10;
        int i10;
        super.onDraw(canvas);
        if (this.zih <= 0 || this.vm == null || this.pno.size() <= 0 || this.f6938lh == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.zih / width;
        int i11 = 0;
        vt vtVar = this.pno.get(0);
        float f12 = vtVar.fkw;
        int size = this.pno.size();
        int i12 = vtVar.vt;
        int i13 = this.pno.get(size - 1).vt;
        while (i12 < i13) {
            while (true) {
                i4 = vtVar.vt;
                if (i12 <= i4 || i11 >= size) {
                    break;
                }
                i11++;
                vtVar = this.pno.get(i11);
            }
            if (i12 == i4) {
                float f13 = vtVar.fkw;
                float f14 = vtVar.yu;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fVt = this.f6938lh.vt();
                f10 = (f12 + fVt) * width;
                f12 = fVt + f11 + f12;
            }
            if (this.zih + f10 > scrollX) {
                i10 = scrollX;
                this.vm.setBounds(Math.round(f10), this.f6942th, Math.round(this.zih + f10), this.qbp);
                this.vm.draw(canvas);
            } else {
                i10 = scrollX;
            }
            if (f10 > i10 + r2) {
                return;
            }
            i12++;
            scrollX = i10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            yu();
            return false;
        }
        if (action != 0) {
            if (this.f6934cd) {
                return true;
            }
            if (this.uq) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
            this.uq = false;
            this.ko = true;
            this.f6937jg.computeScrollOffset();
            if (this.lvd != 2 || Math.abs(this.f6937jg.getFinalX() - this.f6937jg.getCurrX()) <= this.lso) {
                ouw(false);
                this.f6934cd = false;
            } else {
                this.f6937jg.abortAnimation();
                this.jae = false;
                vt();
                this.f6934cd = true;
                fkw();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i4 = this.rrs;
            if (i4 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i4)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.fak;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.ey);
                if (f10 != 0.0f) {
                    float f11 = this.fak;
                    if ((f11 >= this.fvf || f10 <= 0.0f) && ((f11 <= getWidth() - this.fvf || f10 >= 0.0f) && ouw(this, false, (int) f10, (int) x11, (int) y11))) {
                        this.fak = x11;
                        this.uoy = y11;
                        this.uq = true;
                        return false;
                    }
                }
                int i10 = this.bs;
                if (fAbs > i10 && fAbs * 0.5f > fAbs2) {
                    this.f6934cd = true;
                    fkw();
                    setScrollState(1);
                    this.fak = f10 > 0.0f ? this.osn + this.bs : this.osn - this.bs;
                    this.uoy = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i10) {
                    this.uq = true;
                }
                if (this.f6934cd && vt(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ouw(motionEvent);
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        return this.f6934cd;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i10) throws Resources.NotFoundException {
        C0034lh c0034lh;
        C0034lh c0034lh2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i4), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.fvf = Math.min(measuredWidth / 10, this.f6941pd);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z3 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (c0034lh2 = (C0034lh) childAt.getLayoutParams()) != null && c0034lh2.ouw) {
                int i14 = c0034lh2.vt;
                int i15 = i14 & 7;
                int i16 = i14 & AppLovinMediationAdapter.ERROR_CHILD_USER;
                boolean z10 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z3 = false;
                }
                int i17 = LinearLayoutManager.INVALID_OFFSET;
                if (z10) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) c0034lh2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) c0034lh2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        this.jqy = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ex = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.tc = true;
        vt();
        this.tc = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((c0034lh = (C0034lh) childAt2.getLayoutParams()) == null || !c0034lh.ouw)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0034lh.f6946lh), 1073741824), this.ex);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        int i10;
        int i11;
        int i12;
        vt vtVarOuw;
        int childCount = getChildCount();
        if ((i4 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.requestFocus(i4, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof ra)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ra raVar = (ra) parcelable;
        super.onRestoreInstanceState(raVar.vt);
        if (this.f6938lh != null) {
            ouw(raVar.f6947lh, false, true);
            return;
        }
        this.f6935cf = raVar.f6947lh;
        this.ryl = raVar.yu;
        this.mwh = raVar.fkw;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ra raVar = new ra(super.onSaveInstanceState());
        raVar.f6947lh = this.yu;
        if (this.f6938lh != null) {
            raVar.yu = com.bytedance.adsdk.ugeno.pno.vt.yu();
        }
        return raVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        if (i4 != i11) {
            int i13 = this.zih;
            ouw(i4, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        int iFindPointerIndex;
        if (this.f6943ub) {
            return true;
        }
        boolean zYu = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (vtVar = this.f6938lh) == null || vtVar.ouw() == 0) {
            return false;
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f6937jg.abortAnimation();
            this.jae = false;
            vt();
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.fak = motionEvent.getX(actionIndex);
                            this.rrs = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ouw(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.rrs);
                        if (iFindPointerIndex2 != -1) {
                            this.fak = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f6934cd) {
                    ouw(this.yu, true, 0, false);
                    zYu = yu();
                }
            } else if (!this.f6934cd) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.rrs);
                if (iFindPointerIndex3 == -1) {
                    zYu = yu();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.fak);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.uoy);
                    if (fAbs > this.bs && fAbs > fAbs2) {
                        this.f6934cd = true;
                        fkw();
                        float f10 = this.osn;
                        this.fak = x11 - f10 > 0.0f ? f10 + this.bs : f10 - this.bs;
                        this.uoy = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f6934cd) {
                        zYu = vt(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f6934cd && (iFindPointerIndex = motionEvent.findPointerIndex(this.rrs)) != -1) {
                zYu = vt(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f6934cd) {
            VelocityTracker velocityTracker = this.jvy;
            velocityTracker.computeCurrentVelocity(1000, this.hun);
            int xVelocity = (int) velocityTracker.getXVelocity(this.rrs);
            this.jae = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            vt vtVarLe = le();
            float f11 = clientWidth;
            int iMax = vtVarLe.vt;
            float f12 = ((scrollX / f11) - vtVarLe.fkw) / (vtVarLe.yu + (this.zih / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.rrs);
            if (iFindPointerIndex4 != -1) {
                if (Math.abs((int) (motionEvent.getX(iFindPointerIndex4) - this.osn)) <= this.ux || Math.abs(xVelocity) <= this.fqk) {
                    iMax += (int) (f12 + (iMax >= this.yu ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.pno.size() > 0) {
                    iMax = Math.max(this.pno.get(0).vt, Math.min(iMax, ((vt) u.p(1, this.pno)).vt));
                }
                ouw(iMax, true, true, xVelocity);
                zYu = yu();
            }
        }
        if (zYu) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void ouw(int i4, boolean z3) throws Resources.NotFoundException {
        this.jae = false;
        ouw(i4, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.tc) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.pno.vt vtVar) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.pno.vt vtVar2 = this.f6938lh;
        if (vtVar2 != null) {
            vtVar2.ouw(null);
            for (int i4 = 0; i4 < this.pno.size(); i4++) {
                this.f6938lh.ouw((ViewGroup) this, this.pno.get(i4).ouw);
            }
            this.pno.clear();
            int i10 = 0;
            while (i10 < getChildCount()) {
                if (!((C0034lh) getChildAt(i10).getLayoutParams()).ouw) {
                    removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
            this.yu = 0;
            scrollTo(0, 0);
        }
        this.f6938lh = vtVar;
        this.ouw = 0;
        if (vtVar != null) {
            if (this.rn == null) {
                this.rn = new le();
            }
            this.f6938lh.ouw(this.rn);
            this.jae = false;
            boolean z3 = this.wp;
            this.wp = true;
            this.ouw = this.f6938lh.ouw();
            int i11 = this.f6935cf;
            if (i11 >= 0) {
                ouw(i11, false, true);
                this.f6935cf = -1;
                this.ryl = null;
                this.mwh = null;
            } else if (z3) {
                requestLayout();
            } else {
                vt();
            }
        }
        List<Object> list = this.mt;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mt.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.mt.get(i12);
        }
    }

    public void setCurrentItem(int i4) throws Resources.NotFoundException {
        this.jae = false;
        ouw(i4, !this.wp, false);
    }

    public void setOffscreenPageLimit(int i4) throws Resources.NotFoundException {
        if (i4 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i4 + " too small; defaulting to 1");
            i4 = 1;
        }
        if (i4 != this.f6940od) {
            this.f6940od = i4;
            vt();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(yu yuVar) {
        this.yib = yuVar;
    }

    public void setPageMargin(int i4) {
        int i10 = this.zih;
        this.zih = i4;
        int width = getWidth();
        ouw(width, width, i4, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.vm = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i4) {
        if (this.lvd == i4) {
            return;
        }
        this.lvd = i4;
        if (this.xdk != null) {
            boolean z3 = i4 != 0;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setLayerType(z3 ? this.zvq : 0, null);
            }
        }
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.tlj(i4);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                yu yuVar2 = this.fkw.get(i11);
                if (yuVar2 != null) {
                    yuVar2.tlj(i4);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.tlj(i4);
        }
    }

    public void setScroller(Scroller scroller) {
        this.f6937jg = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.vm;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.pno.lh$lh, reason: collision with other inner class name */
    public static class C0034lh extends ViewGroup.LayoutParams {
        int fkw;

        /* renamed from: le, reason: collision with root package name */
        int f6945le;

        /* renamed from: lh, reason: collision with root package name */
        float f6946lh;
        public boolean ouw;
        public int vt;
        boolean yu;

        public C0034lh() {
            super(-1, -1);
            this.f6946lh = 0.0f;
        }

        public C0034lh(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6946lh = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lh.vt);
            this.vt = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0034lh(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean fkw(int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lab
            if (r1 == r0) goto Lab
            if (r5 != r3) goto L90
            android.graphics.Rect r2 = r4.tlj
            android.graphics.Rect r2 = r4.ouw(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.tlj
            android.graphics.Rect r3 = r4.ouw(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.pno()
            goto Lc2
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc2
        L90:
            if (r5 != r2) goto Lb7
            android.graphics.Rect r2 = r4.tlj
            android.graphics.Rect r2 = r4.ouw(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.tlj
            android.graphics.Rect r3 = r4.ouw(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La6
            if (r2 <= r3) goto Lb9
        La6:
            boolean r0 = r1.requestFocus()
            goto Lc2
        Lab:
            if (r5 == r3) goto Lbe
            r0 = 1
            if (r5 != r0) goto Lb1
            goto Lbe
        Lb1:
            if (r5 == r2) goto Lb9
            r0 = 2
            if (r5 != r0) goto Lb7
            goto Lb9
        Lb7:
            r0 = 0
            goto Lc2
        Lb9:
            boolean r0 = r4.bly()
            goto Lc2
        Lbe:
            boolean r0 = r4.pno()
        Lc2:
            if (r0 == 0) goto Lcb
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.fkw(int):boolean");
    }

    private void ouw(int i4, boolean z3, boolean z10) throws Resources.NotFoundException {
        ouw(i4, z3, z10, 0);
    }

    private void ouw(int i4, boolean z3, boolean z10, int i10) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f6938lh;
        if (vtVar != null && vtVar.ouw() > 0) {
            if (!z10 && this.yu == i4 && this.pno.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i4 < 0) {
                i4 = 0;
            } else if (i4 >= this.f6938lh.ouw()) {
                i4 = this.f6938lh.ouw() - 1;
            }
            int i11 = this.f6940od;
            int i12 = this.yu;
            if (i4 > i12 + i11 || i4 < i12 - i11) {
                for (int i13 = 0; i13 < this.pno.size(); i13++) {
                    this.pno.get(i13).f6948lh = true;
                }
            }
            boolean z11 = this.yu != i4;
            if (this.wp) {
                this.yu = i4;
                if (z11) {
                    yu(i4);
                }
                requestLayout();
                return;
            }
            ouw(i4);
            ouw(i4, z3, i10, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageMarginDrawable(int i4) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i4));
    }

    private vt vt(int i4, int i10) {
        vt vtVar = new vt();
        vtVar.vt = i4;
        vtVar.ouw = this.f6938lh.ouw(this, i4);
        vtVar.yu = this.f6938lh.vt();
        if (i10 >= 0 && i10 < this.pno.size()) {
            this.pno.add(i10, vtVar);
            return vtVar;
        }
        this.pno.add(vtVar);
        return vtVar;
    }

    private boolean lh(int i4) {
        if (this.pno.size() == 0) {
            if (this.wp) {
                return false;
            }
            this.ucs = false;
            ouw(0, 0.0f, 0);
            if (this.ucs) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        vt vtVarLe = le();
        int clientWidth = getClientWidth();
        int i10 = this.zih;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = vtVarLe.vt;
        float f11 = ((i4 / f10) - vtVarLe.fkw) / (vtVarLe.yu + (i10 / f10));
        this.ucs = false;
        ouw(i12, f11, (int) (i11 * f11));
        if (this.ucs) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean yu() {
        this.rrs = -1;
        ra();
        this.f6936cj.onRelease();
        this.pv.onRelease();
        return this.f6936cj.isFinished() || this.pv.isFinished();
    }

    public final void vt() throws Resources.NotFoundException {
        ouw(this.yu);
    }

    private vt vt(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return ouw(view);
            }
        }
    }

    private vt vt(int i4) {
        for (int i10 = 0; i10 < this.pno.size(); i10++) {
            vt vtVar = this.pno.get(i10);
            if (vtVar.vt == i4) {
                return vtVar;
            }
        }
        return null;
    }

    private void ouw(int i4, boolean z3, int i10, boolean z10) throws Resources.NotFoundException {
        int iMax;
        vt vtVarVt = vt(i4);
        if (vtVarVt != null) {
            iMax = (int) (Math.max(this.zin, Math.min(vtVarVt.fkw, this.vpp)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z3) {
            ouw(iMax, i10);
            if (z10) {
                yu(i4);
                return;
            }
            return;
        }
        if (z10) {
            yu(i4);
        }
        ouw(false);
        scrollTo(iMax, 0);
        lh(iMax);
    }

    private void vt(int i4, float f10, int i10) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.ouw(i4, f10, i10);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                yu yuVar2 = this.fkw.get(i11);
                if (yuVar2 != null) {
                    yuVar2.ouw(i4, f10, i10);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.ouw(i4, f10, i10);
        }
    }

    private boolean vt(float f10) {
        boolean z3;
        boolean z10;
        float f11 = this.fak - f10;
        this.fak = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.zin * clientWidth;
        float f13 = this.vpp * clientWidth;
        boolean z11 = false;
        vt vtVar = this.pno.get(0);
        vt vtVar2 = (vt) u.p(1, this.pno);
        if (vtVar.vt != 0) {
            f12 = vtVar.fkw * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (vtVar2.vt != this.f6938lh.ouw() - 1) {
            f13 = vtVar2.fkw * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z3) {
                this.f6936cj.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.pv.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i4 = (int) scrollX;
        this.fak = (scrollX - i4) + this.fak;
        scrollTo(i4, getScrollY());
        lh(i4);
        return z11;
    }

    public final void ouw(yu yuVar) {
        if (this.fkw == null) {
            this.fkw = new ArrayList();
        }
        this.fkw.add(yuVar);
    }

    public final void ouw(boolean z3, fkw fkwVar) throws Resources.NotFoundException {
        vt(z3, fkwVar);
    }

    private static float ouw(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void ouw(int i4, int i10) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f6937jg;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.ko ? this.f6937jg.getCurrX() : this.f6937jg.getStartX();
            this.f6937jg.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i11 = scrollX;
        int scrollY = getScrollY();
        int i12 = i4 - i11;
        int i13 = 0 - scrollY;
        if (i12 == 0 && i13 == 0) {
            ouw(false);
            vt();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i14 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i14;
        float fOuw = (ouw(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i10);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fOuw / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i12) / ((this.f6938lh.vt() * f10) + this.zih)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.ko = false;
        this.f6937jg.startScroll(i11, scrollY, i12, i13, iMin);
        postInvalidateOnAnimation();
    }

    public final void ouw() throws Resources.NotFoundException {
        int iOuw = this.f6938lh.ouw();
        this.ouw = iOuw;
        boolean z3 = this.pno.size() < (this.f6940od * 2) + 1 && this.pno.size() < iOuw;
        int iMax = this.yu;
        int i4 = 0;
        while (i4 < this.pno.size()) {
            vt vtVar = this.pno.get(i4);
            int iLh = this.f6938lh.lh();
            if (iLh != -1) {
                if (iLh == -2) {
                    this.pno.remove(i4);
                    i4--;
                    this.f6938lh.ouw((ViewGroup) this, vtVar.ouw);
                    int i10 = this.yu;
                    if (i10 == vtVar.vt) {
                        iMax = Math.max(0, Math.min(i10, iOuw - 1));
                    }
                } else {
                    int i11 = vtVar.vt;
                    if (i11 != iLh) {
                        if (i11 == this.yu) {
                            iMax = iLh;
                        }
                        vtVar.vt = iLh;
                    }
                }
                z3 = true;
            }
            i4++;
        }
        Collections.sort(this.pno, f6933le);
        if (z3) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                C0034lh c0034lh = (C0034lh) getChildAt(i12).getLayoutParams();
                if (!c0034lh.ouw) {
                    c0034lh.f6946lh = 0.0f;
                }
            }
            ouw(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r14
  0x00c6: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.ouw(int):void");
    }

    private void ouw(vt vtVar, int i4, vt vtVar2) {
        int i10;
        int i11;
        vt vtVar3;
        vt vtVar4;
        int iOuw = this.f6938lh.ouw();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.zih / clientWidth : 0.0f;
        if (vtVar2 != null) {
            int i12 = vtVar2.vt;
            int i13 = vtVar.vt;
            if (i12 < i13) {
                float fVt = vtVar2.fkw + vtVar2.yu + f10;
                int i14 = i12 + 1;
                int i15 = 0;
                while (i14 <= vtVar.vt && i15 < this.pno.size()) {
                    vt vtVar5 = this.pno.get(i15);
                    while (true) {
                        vtVar4 = vtVar5;
                        if (i14 <= vtVar4.vt || i15 >= this.pno.size() - 1) {
                            break;
                        }
                        i15++;
                        vtVar5 = this.pno.get(i15);
                    }
                    while (i14 < vtVar4.vt) {
                        fVt += this.f6938lh.vt() + f10;
                        i14++;
                    }
                    vtVar4.fkw = fVt;
                    fVt += vtVar4.yu + f10;
                    i14++;
                }
            } else if (i12 > i13) {
                int size = this.pno.size() - 1;
                float fVt2 = vtVar2.fkw;
                while (true) {
                    i12--;
                    if (i12 < vtVar.vt || size < 0) {
                        break;
                    }
                    vt vtVar6 = this.pno.get(size);
                    while (true) {
                        vtVar3 = vtVar6;
                        if (i12 >= vtVar3.vt || size <= 0) {
                            break;
                        }
                        size--;
                        vtVar6 = this.pno.get(size);
                    }
                    while (i12 > vtVar3.vt) {
                        fVt2 -= this.f6938lh.vt() + f10;
                        i12--;
                    }
                    fVt2 -= vtVar3.yu + f10;
                    vtVar3.fkw = fVt2;
                }
            }
        }
        int size2 = this.pno.size();
        float fVt3 = vtVar.fkw;
        int i16 = vtVar.vt;
        int i17 = i16 - 1;
        this.zin = i16 == 0 ? fVt3 : -3.4028235E38f;
        int i18 = iOuw - 1;
        this.vpp = i16 == i18 ? (vtVar.yu + fVt3) - 1.0f : Float.MAX_VALUE;
        int i19 = i4 - 1;
        while (i19 >= 0) {
            vt vtVar7 = this.pno.get(i19);
            while (true) {
                i11 = vtVar7.vt;
                if (i17 <= i11) {
                    break;
                }
                i17--;
                fVt3 -= this.f6938lh.vt() + f10;
            }
            fVt3 -= vtVar7.yu + f10;
            vtVar7.fkw = fVt3;
            if (i11 == 0) {
                this.zin = fVt3;
            }
            i19--;
            i17--;
        }
        float fVt4 = vtVar.fkw + vtVar.yu + f10;
        int i20 = vtVar.vt + 1;
        int i21 = i4 + 1;
        while (i21 < size2) {
            vt vtVar8 = this.pno.get(i21);
            while (true) {
                i10 = vtVar8.vt;
                if (i20 >= i10) {
                    break;
                }
                i20++;
                fVt4 += this.f6938lh.vt() + f10;
            }
            if (i10 == i18) {
                this.vpp = (vtVar8.yu + fVt4) - 1.0f;
            }
            vtVar8.fkw = fVt4;
            fVt4 += vtVar8.yu + f10;
            i21++;
            i20++;
        }
        this.kn = false;
    }

    private vt ouw(View view) {
        for (int i4 = 0; i4 < this.pno.size(); i4++) {
            vt vtVar = this.pno.get(i4);
            if (this.f6938lh.ouw(view, vtVar.ouw)) {
                return vtVar;
            }
        }
        return null;
    }

    private void ouw(int i4, int i10, int i11, int i12) {
        if (i10 > 0 && !this.pno.isEmpty()) {
            if (!this.f6937jg.isFinished()) {
                this.f6937jg.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i4 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        vt vtVarVt = vt(this.yu);
        int iMin = (int) ((vtVarVt != null ? Math.min(vtVarVt.fkw, this.vpp) : 0.0f) * ((i4 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ouw(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f6944vh
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.pno.lh$lh r9 = (com.bytedance.adsdk.ugeno.pno.lh.C0034lh) r9
            boolean r10 = r9.ouw
            if (r10 == 0) goto L68
            int r9 = r9.vt
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
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
            r12.vt(r13, r14, r15)
            com.bytedance.adsdk.ugeno.pno.lh$fkw r13 = r12.xdk
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.pno.lh$lh r0 = (com.bytedance.adsdk.ugeno.pno.lh.C0034lh) r0
            boolean r0 = r0.ouw
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.pno.lh$fkw r3 = r12.xdk
            r3.ouw(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.ucs = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.ouw(int, float, int):void");
    }

    private void ouw(boolean z3) {
        boolean z10 = this.lvd == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f6937jg.isFinished()) {
                this.f6937jg.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f6937jg.getCurrX();
                int currY = this.f6937jg.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        lh(currX);
                    }
                }
            }
        }
        this.jae = false;
        for (int i4 = 0; i4 < this.pno.size(); i4++) {
            vt vtVar = this.pno.get(i4);
            if (vtVar.f6948lh) {
                vtVar.f6948lh = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z3) {
                postOnAnimation(this.coz);
            } else {
                this.coz.run();
            }
        }
    }

    private void ouw(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.rrs) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.fak = motionEvent.getX(i4);
            this.rrs = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.jvy;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean ouw(View view, boolean z3, int i4, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && ouw(childAt, true, i4, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i4);
    }

    private Rect ouw(Rect rect, View view) {
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
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
