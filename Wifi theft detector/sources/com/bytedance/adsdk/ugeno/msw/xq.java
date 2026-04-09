package com.bytedance.adsdk.ugeno.msw;

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
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
public class xq extends ViewGroup {

    /* renamed from: aa, reason: collision with root package name */
    private Drawable f9212aa;
    private boolean but;
    private ycc cf;
    private bw cn;
    private int cuf;
    private boolean db;
    int dg;
    private boolean dr;
    private boolean ee;
    private int emc;
    private List<dg> ffd;
    private int fu;
    private Parcelable gbl;
    private dg hj;
    private boolean hxp;
    private float iyl;
    private int lt;
    private final Runnable ltx;
    private float mkp;
    private final ypw msw;
    private float mxo;
    private dg ndl;
    private int nw;
    private EdgeEffect pxa;
    private boolean qh;
    private int ra;
    private int rie;
    private int rig;
    private boolean rqm;
    private float rtt;
    private int ru;
    private int sb;
    private int sba;
    private boolean sf;
    private int sra;
    private ClassLoader sup;
    private Scroller sz;
    private int tp;
    private float ul;
    private final ArrayList<ypw> uym;
    private int vk;
    private VelocityTracker vw;
    private EdgeEffect wa;
    private boolean wad;
    private ArrayList<View> wbn;
    private int wd;
    private int wo;
    private boolean wpn;
    private List<Object> xhi;
    private int xmt;
    com.bytedance.adsdk.ugeno.msw.ypw xq;
    private int xxg;
    private float ylm;
    private int yz;
    private int yzg;
    private final Rect zz;
    static final int[] ypw = {R.attr.layout_gravity};
    private static final Comparator<ypw> bw = new Comparator<ypw>() { // from class: com.bytedance.adsdk.ugeno.msw.xq.1
        @Override // java.util.Comparator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compare(ypw ypwVar, ypw ypwVar2) {
            return ypwVar.ypw - ypwVar2.ypw;
        }
    };
    private static final Interpolator ycc = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.msw.xq.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final msw jp = new msw();

    public interface bw {
        void emc(View view, float f10);
    }

    public interface dg {
        void emc(int i10, float f10, int i11);

        void gbl(int i10);

        void sup(int i10);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface emc {
    }

    public static class msw implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0096xq c0096xq = (C0096xq) view.getLayoutParams();
            C0096xq c0096xq2 = (C0096xq) view2.getLayoutParams();
            boolean z10 = c0096xq.emc;
            return z10 != c0096xq2.emc ? z10 ? 1 : -1 : c0096xq.bw - c0096xq2.bw;
        }
    }

    public static class uym extends com.bytedance.adsdk.ugeno.msw.emc {
        public static final Parcelable.Creator<uym> CREATOR = new Parcelable.ClassLoaderCreator<uym>() { // from class: com.bytedance.adsdk.ugeno.msw.xq.uym.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public uym createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new uym(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public uym createFromParcel(Parcel parcel) {
                return new uym(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public uym[] newArray(int i10) {
                return new uym[i10];
            }
        };
        ClassLoader dg;
        Parcelable xq;
        int ypw;

        public uym(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.ypw + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.msw.emc, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.ypw);
            parcel.writeParcelable(this.xq, i10);
        }

        public uym(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.ypw = parcel.readInt();
            this.xq = parcel.readParcelable(classLoader);
            this.dg = classLoader;
        }
    }

    public class ycc extends DataSetObserver {
        public ycc() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            xq.this.ypw();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            xq.this.ypw();
        }
    }

    public static class ypw {
        float bw;
        float dg;
        Object emc;
        boolean xq;
        int ypw;
    }

    public xq(Context context) {
        super(context);
        this.uym = new ArrayList<>();
        this.msw = new ypw();
        this.zz = new Rect();
        this.ru = -1;
        this.gbl = null;
        this.sup = null;
        this.ul = -3.4028235E38f;
        this.ylm = Float.MAX_VALUE;
        this.sb = 1;
        this.tp = -1;
        this.rqm = true;
        this.wad = false;
        this.ltx = new Runnable() { // from class: com.bytedance.adsdk.ugeno.msw.xq.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                xq.this.setScrollState(0);
                xq.this.xq();
            }
        };
        this.rig = 0;
        emc();
    }

    private void bw(int i10) {
        dg dgVar = this.ndl;
        if (dgVar != null) {
            dgVar.gbl(i10);
        }
        List<dg> list = this.ffd;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                dg dgVar2 = this.ffd.get(i11);
                if (dgVar2 != null) {
                    dgVar2.gbl(i10);
                }
            }
        }
        dg dgVar3 = this.hj;
        if (dgVar3 != null) {
            dgVar3.gbl(i10);
        }
    }

    private boolean dg(int i10) {
        if (this.uym.size() == 0) {
            if (this.rqm) {
                return false;
            }
            this.but = false;
            emc(0, 0.0f, 0);
            if (this.but) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ypw ypwVarZz = zz();
        int clientWidth = getClientWidth();
        int i11 = this.vk;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = ypwVarZz.ypw;
        float f11 = ((i10 / f10) - ypwVarZz.bw) / (ypwVarZz.dg + (i11 / f10));
        this.but = false;
        emc(i13, f11, (int) (i12 * f11));
        if (this.but) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean msw() {
        this.tp = -1;
        ru();
        this.pxa.onRelease();
        this.wa.onRelease();
        return this.pxa.isFinished() || this.wa.isFinished();
    }

    private void ru() {
        this.sf = false;
        this.dr = false;
        VelocityTracker velocityTracker = this.vw;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.vw = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.ee != z10) {
            this.ee = z10;
        }
    }

    private void uym() {
        if (this.nw != 0) {
            ArrayList<View> arrayList = this.wbn;
            if (arrayList == null) {
                this.wbn = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.wbn.add(getChildAt(i10));
            }
            Collections.sort(this.wbn, jp);
        }
    }

    private void ycc() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0096xq) getChildAt(i10).getLayoutParams()).emc) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private ypw zz() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.vk / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        ypw ypwVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.uym.size()) {
            ypw ypwVar2 = this.uym.get(i11);
            if (!z10 && ypwVar2.ypw != (i10 = i12 + 1)) {
                ypwVar2 = this.msw;
                ypwVar2.bw = f10 + f12 + f11;
                ypwVar2.ypw = i10;
                ypwVar2.dg = this.xq.emc(i10);
                i11--;
            }
            ypw ypwVar3 = ypwVar2;
            f10 = ypwVar3.bw;
            float f13 = ypwVar3.dg + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.uym.size() - 1) {
                return ypwVar3;
            }
            int i13 = ypwVar3.ypw;
            float f14 = ypwVar3.dg;
            i11++;
            i12 = i13;
            f12 = f14;
            ypwVar = ypwVar3;
            z10 = false;
        }
        return ypwVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ypw ypwVarEmc;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (ypwVarEmc = emc(childAt)) != null && ypwVarEmc.ypw == this.dg) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ypw ypwVarEmc;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (ypwVarEmc = emc(childAt)) != null && ypwVarEmc.ypw == this.dg) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0096xq c0096xq = (C0096xq) layoutParams;
        boolean zXq = c0096xq.emc | xq(view);
        c0096xq.emc = zXq;
        if (!this.hxp) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zXq) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0096xq.dg = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.xq == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.ul)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.ylm));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0096xq) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.qh = true;
        if (this.sz.isFinished() || !this.sz.computeScrollOffset()) {
            emc(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.sz.getCurrX();
        int currY = this.sz.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!dg(currX)) {
                this.sz.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || emc(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ypw ypwVarEmc;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (ypwVarEmc = emc(childAt)) != null && ypwVarEmc.ypw == this.dg && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (ypwVar = this.xq) != null && ypwVar.emc() > 1)) {
            if (!this.pxa.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.ul * width);
                this.pxa.setSize(height, width);
                zDraw = this.pxa.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.wa.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.ylm + 1.0f)) * width2);
                this.wa.setSize(height2, width2);
                zDraw |= this.wa.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.pxa.finish();
            this.wa.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9212aa;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void emc() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.sz = new Scroller(context, ycc);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.cuf = viewConfiguration.getScaledPagingTouchSlop();
        this.ra = (int) (400.0f * f10);
        this.wo = viewConfiguration.getScaledMaximumFlingVelocity();
        this.pxa = new EdgeEffect(context);
        this.wa = new EdgeEffect(context);
        this.xxg = (int) (25.0f * f10);
        this.yz = (int) (2.0f * f10);
        this.xmt = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0096xq();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.msw.ypw getAdapter() {
        return this.xq;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.nw == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0096xq) this.wbn.get(i11).getLayoutParams()).ycc;
    }

    public int getCurrentItem() {
        return this.dg;
    }

    public int getOffscreenPageLimit() {
        return this.sb;
    }

    public int getPageMargin() {
        return this.vk;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rqm = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.ltx);
        Scroller scroller = this.sz;
        if (scroller != null && !scroller.isFinished()) {
            this.sz.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.vk <= 0 || this.f9212aa == null || this.uym.size() <= 0 || this.xq == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.vk / width;
        int i12 = 0;
        ypw ypwVar = this.uym.get(0);
        float f12 = ypwVar.bw;
        int size = this.uym.size();
        int i13 = ypwVar.ypw;
        int i14 = this.uym.get(size - 1).ypw;
        while (i13 < i14) {
            while (true) {
                i10 = ypwVar.ypw;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                ypwVar = this.uym.get(i12);
            }
            if (i13 == i10) {
                float f13 = ypwVar.bw;
                float f14 = ypwVar.dg;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fEmc = this.xq.emc(i13);
                f10 = (f12 + fEmc) * width;
                f12 += fEmc + f11;
            }
            if (this.vk + f10 > scrollX) {
                i11 = scrollX;
                this.f9212aa.setBounds(Math.round(f10), this.sba, Math.round(this.vk + f10), this.yzg);
                this.f9212aa.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            msw();
            return false;
        }
        if (action != 0) {
            if (this.sf) {
                return true;
            }
            if (this.dr) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.iyl = x10;
            this.rtt = x10;
            float y10 = motionEvent.getY();
            this.mxo = y10;
            this.mkp = y10;
            this.tp = motionEvent.getPointerId(0);
            this.dr = false;
            this.qh = true;
            this.sz.computeScrollOffset();
            if (this.rig != 2 || Math.abs(this.sz.getFinalX() - this.sz.getCurrX()) <= this.yz) {
                emc(false);
                this.sf = false;
            } else {
                this.sz.abortAnimation();
                this.db = false;
                xq();
                this.sf = true;
                xq(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.tp;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.rtt;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.mxo);
                if (f10 != 0.0f && !emc(this.rtt, f10) && emc(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.rtt = x11;
                    this.mkp = y11;
                    this.dr = true;
                    return false;
                }
                int i11 = this.cuf;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.sf = true;
                    xq(true);
                    setScrollState(1);
                    this.rtt = f10 > 0.0f ? this.iyl + this.cuf : this.iyl - this.cuf;
                    this.mkp = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.dr = true;
                }
                if (this.sf && ypw(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            emc(motionEvent);
        }
        if (this.vw == null) {
            this.vw = VelocityTracker.obtain();
        }
        this.vw.addMovement(motionEvent);
        return this.sf;
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.msw.xq.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        C0096xq c0096xq;
        C0096xq c0096xq2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.lt = Math.min(measuredWidth / 10, this.xmt);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0096xq2 = (C0096xq) childAt.getLayoutParams()) != null && c0096xq2.emc) {
                int i15 = c0096xq2.ypw;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0096xq2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0096xq2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.sra = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.rie = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.hxp = true;
        xq();
        this.hxp = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0096xq = (C0096xq) childAt2.getLayoutParams()) == null || !c0096xq.emc)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0096xq.xq), 1073741824), this.rie);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        ypw ypwVarEmc;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (ypwVarEmc = emc(childAt)) != null && ypwVarEmc.ypw == this.dg && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof uym)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uym uymVar = (uym) parcelable;
        super.onRestoreInstanceState(uymVar.emc());
        if (this.xq != null) {
            emc(uymVar.ypw, false, true);
            return;
        }
        this.ru = uymVar.ypw;
        this.gbl = uymVar.xq;
        this.sup = uymVar.dg;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        uym uymVar = new uym(super.onSaveInstanceState());
        uymVar.ypw = this.dg;
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar = this.xq;
        if (ypwVar != null) {
            uymVar.xq = ypwVar.ypw();
        }
        return uymVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.vk;
            emc(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar;
        int iFindPointerIndex;
        if (this.wpn) {
            return true;
        }
        boolean zMsw = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (ypwVar = this.xq) == null || ypwVar.emc() == 0) {
            return false;
        }
        if (this.vw == null) {
            this.vw = VelocityTracker.obtain();
        }
        this.vw.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.sz.abortAnimation();
            this.db = false;
            xq();
            float x10 = motionEvent.getX();
            this.iyl = x10;
            this.rtt = x10;
            float y10 = motionEvent.getY();
            this.mxo = y10;
            this.mkp = y10;
            this.tp = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.rtt = motionEvent.getX(actionIndex);
                            this.tp = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        emc(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.tp);
                        if (iFindPointerIndex2 != -1) {
                            this.rtt = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.sf) {
                    emc(this.dg, true, 0, false);
                    zMsw = msw();
                }
            } else if (!this.sf) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.tp);
                if (iFindPointerIndex3 == -1) {
                    zMsw = msw();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.rtt);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.mkp);
                    if (fAbs > this.cuf && fAbs > fAbs2) {
                        this.sf = true;
                        xq(true);
                        float f10 = this.iyl;
                        this.rtt = x11 - f10 > 0.0f ? f10 + this.cuf : f10 - this.cuf;
                        this.mkp = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.sf) {
                        zMsw = ypw(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.sf && (iFindPointerIndex = motionEvent.findPointerIndex(this.tp)) != -1) {
                zMsw = ypw(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.sf) {
            VelocityTracker velocityTracker = this.vw;
            velocityTracker.computeCurrentVelocity(1000, this.wo);
            int xVelocity = (int) velocityTracker.getXVelocity(this.tp);
            this.db = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ypw ypwVarZz = zz();
            float f11 = clientWidth;
            int i10 = ypwVarZz.ypw;
            float f12 = ((scrollX / f11) - ypwVarZz.bw) / (ypwVarZz.dg + (this.vk / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.tp);
            if (iFindPointerIndex4 != -1) {
                emc(emc(i10, f12, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.iyl)), true, true, xVelocity);
                zMsw = msw();
            }
        }
        if (zMsw) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.hxp) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.msw.ypw ypwVar) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar2 = this.xq;
        if (ypwVar2 != null) {
            ypwVar2.emc((DataSetObserver) null);
            for (int i10 = 0; i10 < this.uym.size(); i10++) {
                ypw ypwVar3 = this.uym.get(i10);
                this.xq.emc((ViewGroup) this, ypwVar3.ypw, ypwVar3.emc);
            }
            this.uym.clear();
            ycc();
            this.dg = 0;
            scrollTo(0, 0);
        }
        this.xq = ypwVar;
        this.emc = 0;
        if (ypwVar != null) {
            if (this.cf == null) {
                this.cf = new ycc();
            }
            this.xq.emc((DataSetObserver) this.cf);
            this.db = false;
            boolean z10 = this.rqm;
            this.rqm = true;
            this.emc = this.xq.emc();
            int i11 = this.ru;
            if (i11 >= 0) {
                emc(i11, false, true);
                this.ru = -1;
                this.gbl = null;
                this.sup = null;
            } else if (z10) {
                requestLayout();
            } else {
                xq();
            }
        }
        List<Object> list = this.xhi;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.xhi.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.xhi.get(i12);
        }
    }

    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        this.db = false;
        emc(i10, !this.rqm, false);
    }

    public void setOffscreenPageLimit(int i10) throws Resources.NotFoundException {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.sb) {
            this.sb = i10;
            xq();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(dg dgVar) {
        this.ndl = dgVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.vk;
        this.vk = i10;
        int width = getWidth();
        emc(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f9212aa = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.rig == i10) {
            return;
        }
        this.rig = i10;
        if (this.cn != null) {
            ypw(i10 != 0);
        }
        ycc(i10);
    }

    public void setScroller(Scroller scroller) {
        this.sz = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9212aa;
    }

    public void xq() throws Resources.NotFoundException {
        emc(this.dg);
    }

    public void ypw(dg dgVar) {
        List<dg> list = this.ffd;
        if (list != null) {
            list.remove(dgVar);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.msw.xq$xq, reason: collision with other inner class name */
    public static class C0096xq extends ViewGroup.LayoutParams {
        int bw;
        boolean dg;
        public boolean emc;
        float xq;
        int ycc;
        public int ypw;

        public C0096xq() {
            super(-1, -1);
            this.xq = 0.0f;
        }

        public C0096xq(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.xq = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xq.ypw);
            this.ypw = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean xq(View view) {
        return view.getClass().getAnnotation(emc.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0096xq(getContext(), attributeSet);
    }

    public void ypw() throws Resources.NotFoundException {
        int iEmc = this.xq.emc();
        this.emc = iEmc;
        boolean z10 = this.uym.size() < (this.sb * 2) + 1 && this.uym.size() < iEmc;
        int iMax = this.dg;
        int i10 = 0;
        while (i10 < this.uym.size()) {
            ypw ypwVar = this.uym.get(i10);
            int iEmc2 = this.xq.emc(ypwVar.emc);
            if (iEmc2 != -1) {
                if (iEmc2 == -2) {
                    this.uym.remove(i10);
                    i10--;
                    this.xq.emc((ViewGroup) this, ypwVar.ypw, ypwVar.emc);
                    int i11 = this.dg;
                    if (i11 == ypwVar.ypw) {
                        iMax = Math.max(0, Math.min(i11, iEmc - 1));
                    }
                } else {
                    int i12 = ypwVar.ypw;
                    if (i12 != iEmc2) {
                        if (i12 == this.dg) {
                            iMax = iEmc2;
                        }
                        ypwVar.ypw = iEmc2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.uym, bw);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0096xq c0096xq = (C0096xq) getChildAt(i13).getLayoutParams();
                if (!c0096xq.emc) {
                    c0096xq.xq = 0.0f;
                }
            }
            emc(iMax, false, true);
            requestLayout();
        }
    }

    private void xq(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void ycc(int i10) {
        dg dgVar = this.ndl;
        if (dgVar != null) {
            dgVar.sup(i10);
        }
        List<dg> list = this.ffd;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                dg dgVar2 = this.ffd.get(i11);
                if (dgVar2 != null) {
                    dgVar2.sup(i10);
                }
            }
        }
        dg dgVar3 = this.hj;
        if (dgVar3 != null) {
            dgVar3.sup(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean xq(int r5) throws android.content.res.Resources.NotFoundException {
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
            android.graphics.Rect r2 = r4.zz
            android.graphics.Rect r2 = r4.emc(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.zz
            android.graphics.Rect r3 = r4.emc(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.dg()
            goto Lc2
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc2
        L90:
            if (r5 != r2) goto Lb7
            android.graphics.Rect r2 = r4.zz
            android.graphics.Rect r2 = r4.emc(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.zz
            android.graphics.Rect r3 = r4.emc(r3, r0)
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
            boolean r0 = r4.bw()
            goto Lc2
        Lbe:
            boolean r0 = r4.dg()
        Lc2:
            if (r0 == 0) goto Lcb
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.msw.xq.xq(int):boolean");
    }

    public boolean bw() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar = this.xq;
        if (ypwVar == null || this.dg >= ypwVar.emc() - 1) {
            return false;
        }
        emc(this.dg + 1, true);
        return true;
    }

    public boolean dg() throws Resources.NotFoundException {
        int i10 = this.dg;
        if (i10 <= 0) {
            return false;
        }
        emc(i10 - 1, true);
        return true;
    }

    public void emc(int i10, boolean z10) throws Resources.NotFoundException {
        this.db = false;
        emc(i10, z10, false);
    }

    public void emc(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        emc(i10, z10, z11, 0);
    }

    public void emc(int i10, boolean z10, boolean z11, int i11) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.msw.ypw ypwVar = this.xq;
        if (ypwVar != null && ypwVar.emc() > 0) {
            if (!z11 && this.dg == i10 && this.uym.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.xq.emc()) {
                i10 = this.xq.emc() - 1;
            }
            int i12 = this.sb;
            int i13 = this.dg;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.uym.size(); i14++) {
                    this.uym.get(i14).xq = true;
                }
            }
            boolean z12 = this.dg != i10;
            if (this.rqm) {
                this.dg = i10;
                if (z12) {
                    bw(i10);
                }
                requestLayout();
                return;
            }
            emc(i10);
            emc(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public ypw ypw(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return emc(view);
            }
        }
    }

    public ypw ypw(int i10) {
        for (int i11 = 0; i11 < this.uym.size(); i11++) {
            ypw ypwVar = this.uym.get(i11);
            if (ypwVar.ypw == i10) {
                return ypwVar;
            }
        }
        return null;
    }

    private void ypw(int i10, float f10, int i11) {
        dg dgVar = this.ndl;
        if (dgVar != null) {
            dgVar.emc(i10, f10, i11);
        }
        List<dg> list = this.ffd;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                dg dgVar2 = this.ffd.get(i12);
                if (dgVar2 != null) {
                    dgVar2.emc(i10, f10, i11);
                }
            }
        }
        dg dgVar3 = this.hj;
        if (dgVar3 != null) {
            dgVar3.emc(i10, f10, i11);
        }
    }

    private void emc(int i10, boolean z10, int i11, boolean z11) throws Resources.NotFoundException {
        ypw ypwVarYpw = ypw(i10);
        int clientWidth = ypwVarYpw != null ? (int) (getClientWidth() * Math.max(this.ul, Math.min(ypwVarYpw.bw, this.ylm))) : 0;
        if (z10) {
            emc(clientWidth, 0, i11);
            if (z11) {
                bw(i10);
                return;
            }
            return;
        }
        if (z11) {
            bw(i10);
        }
        emc(false);
        scrollTo(clientWidth, 0);
        dg(clientWidth);
    }

    private void ypw(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.fu : 0, null);
        }
    }

    private boolean ypw(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.rtt - f10;
        this.rtt = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.ul * clientWidth;
        float f13 = this.ylm * clientWidth;
        boolean z12 = false;
        ypw ypwVar = this.uym.get(0);
        ArrayList<ypw> arrayList = this.uym;
        ypw ypwVar2 = arrayList.get(arrayList.size() - 1);
        if (ypwVar.ypw != 0) {
            f12 = ypwVar.bw * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (ypwVar2.ypw != this.xq.emc() - 1) {
            f13 = ypwVar2.bw * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.pxa.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.wa.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.rtt += scrollX - i10;
        scrollTo(i10, getScrollY());
        dg(i10);
        return z12;
    }

    public void emc(dg dgVar) {
        if (this.ffd == null) {
            this.ffd = new ArrayList();
        }
        this.ffd.add(dgVar);
    }

    public void emc(boolean z10, bw bwVar) throws Resources.NotFoundException {
        emc(z10, bwVar, 2);
    }

    public void emc(boolean z10, bw bwVar, int i10) throws Resources.NotFoundException {
        boolean z11 = bwVar != null;
        boolean z12 = z11 != (this.cn != null);
        this.cn = bwVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.nw = z10 ? 2 : 1;
            this.fu = i10;
        } else {
            this.nw = 0;
        }
        if (z12) {
            xq();
        }
    }

    public float emc(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void emc(int i10, int i11, int i12) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.sz;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.qh ? this.sz.getCurrX() : this.sz.getStartX();
            this.sz.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            emc(false);
            xq();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fEmc = f11 + (emc(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fEmc / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.xq.emc(this.dg)) + this.vk)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
        this.qh = false;
        this.sz.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    public ypw emc(int i10, int i11) {
        ypw ypwVar = new ypw();
        ypwVar.ypw = i10;
        ypwVar.emc = this.xq.emc((ViewGroup) this, i10);
        ypwVar.dg = this.xq.emc(i10);
        if (i11 >= 0 && i11 < this.uym.size()) {
            this.uym.add(i11, ypwVar);
            return ypwVar;
        }
        this.uym.add(ypwVar);
        return ypwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r15
  0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.msw.xq.emc(int):void");
    }

    private void emc(ypw ypwVar, int i10, ypw ypwVar2) {
        int i11;
        int i12;
        ypw ypwVar3;
        ypw ypwVar4;
        int iEmc = this.xq.emc();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.vk / clientWidth : 0.0f;
        if (ypwVar2 != null) {
            int i13 = ypwVar2.ypw;
            int i14 = ypwVar.ypw;
            if (i13 < i14) {
                float fEmc = ypwVar2.bw + ypwVar2.dg + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= ypwVar.ypw && i16 < this.uym.size()) {
                    ypw ypwVar5 = this.uym.get(i16);
                    while (true) {
                        ypwVar4 = ypwVar5;
                        if (i15 <= ypwVar4.ypw || i16 >= this.uym.size() - 1) {
                            break;
                        }
                        i16++;
                        ypwVar5 = this.uym.get(i16);
                    }
                    while (i15 < ypwVar4.ypw) {
                        fEmc += this.xq.emc(i15) + f10;
                        i15++;
                    }
                    ypwVar4.bw = fEmc;
                    fEmc += ypwVar4.dg + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.uym.size() - 1;
                float fEmc2 = ypwVar2.bw;
                while (true) {
                    i13--;
                    if (i13 < ypwVar.ypw || size < 0) {
                        break;
                    }
                    ypw ypwVar6 = this.uym.get(size);
                    while (true) {
                        ypwVar3 = ypwVar6;
                        if (i13 >= ypwVar3.ypw || size <= 0) {
                            break;
                        }
                        size--;
                        ypwVar6 = this.uym.get(size);
                    }
                    while (i13 > ypwVar3.ypw) {
                        fEmc2 -= this.xq.emc(i13) + f10;
                        i13--;
                    }
                    fEmc2 -= ypwVar3.dg + f10;
                    ypwVar3.bw = fEmc2;
                }
            }
        }
        int size2 = this.uym.size();
        float fEmc3 = ypwVar.bw;
        int i17 = ypwVar.ypw;
        int i18 = i17 - 1;
        this.ul = i17 == 0 ? fEmc3 : -3.4028235E38f;
        int i19 = iEmc - 1;
        this.ylm = i17 == i19 ? (ypwVar.dg + fEmc3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            ypw ypwVar7 = this.uym.get(i20);
            while (true) {
                i12 = ypwVar7.ypw;
                if (i18 <= i12) {
                    break;
                }
                fEmc3 -= this.xq.emc(i18) + f10;
                i18--;
            }
            fEmc3 -= ypwVar7.dg + f10;
            ypwVar7.bw = fEmc3;
            if (i12 == 0) {
                this.ul = fEmc3;
            }
            i20--;
            i18--;
        }
        float fEmc4 = ypwVar.bw + ypwVar.dg + f10;
        int i21 = ypwVar.ypw + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            ypw ypwVar8 = this.uym.get(i22);
            while (true) {
                i11 = ypwVar8.ypw;
                if (i21 >= i11) {
                    break;
                }
                fEmc4 += this.xq.emc(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.ylm = (ypwVar8.dg + fEmc4) - 1.0f;
            }
            ypwVar8.bw = fEmc4;
            fEmc4 += ypwVar8.dg + f10;
            i22++;
            i21++;
        }
        this.wad = false;
    }

    public ypw emc(View view) {
        for (int i10 = 0; i10 < this.uym.size(); i10++) {
            ypw ypwVar = this.uym.get(i10);
            if (this.xq.emc(view, ypwVar.emc)) {
                return ypwVar;
            }
        }
        return null;
    }

    private void emc(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.uym.isEmpty()) {
            if (!this.sz.isFinished()) {
                this.sz.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        ypw ypwVarYpw = ypw(this.dg);
        int iMin = (int) ((ypwVarYpw != null ? Math.min(ypwVarYpw.bw, this.ylm) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            emc(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.wd
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
            com.bytedance.adsdk.ugeno.msw.xq$xq r9 = (com.bytedance.adsdk.ugeno.msw.xq.C0096xq) r9
            boolean r10 = r9.emc
            if (r10 == 0) goto L68
            int r9 = r9.ypw
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
            r12.ypw(r13, r14, r15)
            com.bytedance.adsdk.ugeno.msw.xq$bw r13 = r12.cn
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.msw.xq$xq r0 = (com.bytedance.adsdk.ugeno.msw.xq.C0096xq) r0
            boolean r0 = r0.emc
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.msw.xq$bw r3 = r12.cn
            r3.emc(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.but = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.msw.xq.emc(int, float, int):void");
    }

    private void emc(boolean z10) {
        boolean z11 = this.rig == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.sz.isFinished()) {
                this.sz.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.sz.getCurrX();
                int currY = this.sz.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        dg(currX);
                    }
                }
            }
        }
        this.db = false;
        for (int i10 = 0; i10 < this.uym.size(); i10++) {
            ypw ypwVar = this.uym.get(i10);
            if (ypwVar.xq) {
                ypwVar.xq = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.ltx);
            } else {
                this.ltx.run();
            }
        }
    }

    private boolean emc(float f10, float f11) {
        if (f10 >= this.lt || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.lt)) && f11 < 0.0f;
        }
        return true;
    }

    private int emc(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.xxg || Math.abs(i11) <= this.ra) {
            i10 += (int) (f10 + (i10 >= this.dg ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.uym.size() <= 0) {
            return i10;
        }
        return Math.max(this.uym.get(0).ypw, Math.min(i10, this.uym.get(r4.size() - 1).ypw));
    }

    private void emc(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.tp) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.rtt = motionEvent.getX(i10);
            this.tp = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.vw;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean emc(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && emc(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean emc(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return dg();
            }
            return xq(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return bw();
            }
            return xq(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return xq(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return xq(1);
        }
        return false;
    }

    private Rect emc(Rect rect, View view) {
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
}
