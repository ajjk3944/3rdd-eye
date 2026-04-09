package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.f;
import com.google.android.exoplayer2.r;
import e3.b;
import e3.e;
import ed.j;
import ed.k;
import ee.i;
import ee.l;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u3.i0;
import u3.z;
import w.g;
import xu.d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: w, reason: collision with root package name */
    public static final int f5681w = j.side_sheet_accessibility_pane_title;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5682x = k.Widget_Material3_SideSheet;

    /* renamed from: a, reason: collision with root package name */
    public d f5683a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f5685c;

    /* renamed from: d, reason: collision with root package name */
    public final l f5686d;

    /* renamed from: e, reason: collision with root package name */
    public final bc.j f5687e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5689g;

    /* renamed from: h, reason: collision with root package name */
    public int f5690h;

    /* renamed from: i, reason: collision with root package name */
    public f f5691i;
    public boolean j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public int f5692l;

    /* renamed from: m, reason: collision with root package name */
    public int f5693m;

    /* renamed from: n, reason: collision with root package name */
    public int f5694n;

    /* renamed from: o, reason: collision with root package name */
    public int f5695o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f5696p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f5697q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5698r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f5699s;

    /* renamed from: t, reason: collision with root package name */
    public int f5700t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f5701u;

    /* renamed from: v, reason: collision with root package name */
    public final fe.b f5702v;

    public SideSheetBehavior() {
        this.f5687e = new bc.j(this);
        this.f5689g = true;
        this.f5690h = 5;
        this.k = 0.1f;
        this.f5698r = -1;
        this.f5701u = new LinkedHashSet();
        this.f5702v = new fe.b(this, 0);
    }

    @Override // e3.b
    public final void c(e eVar) {
        this.f5696p = null;
        this.f5691i = null;
    }

    @Override // e3.b
    public final void f() {
        this.f5696p = null;
        this.f5691i = null;
    }

    @Override // e3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && i0.e(view) == null) || !this.f5689g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f5699s) != null) {
            velocityTracker.recycle();
            this.f5699s = null;
        }
        if (this.f5699s == null) {
            this.f5699s = VelocityTracker.obtain();
        }
        this.f5699s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f5700t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (fVar = this.f5691i) == null || !fVar.p(motionEvent)) ? false : true;
    }

    @Override // e3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i11;
        View viewFindViewById;
        int i12 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f5696p;
        i iVar = this.f5684b;
        int iG = 0;
        if (weakReference == null) {
            this.f5696p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            f0.U(context, ed.b.motionDurationMedium2, 300);
            f0.U(context, ed.b.motionDurationShort3, 150);
            f0.U(context, ed.b.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(ed.d.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(ed.d.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(ed.d.m3_back_progress_side_container_max_scale_y_distance);
            if (iVar != null) {
                view.setBackground(iVar);
                float elevation = this.f5688f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                iVar.p(elevation);
            } else {
                ColorStateList colorStateList = this.f5685c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = i0.f23177a;
                    z.g(view, colorStateList);
                }
            }
            int i13 = this.f5690h == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (i0.e(view) == null) {
                i0.o(view, view.getResources().getString(f5681w));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f7773c, i10) == 3 ? 1 : 0;
        d dVar = this.f5683a;
        if (dVar == null || dVar.J() != i14) {
            e eVar = null;
            l lVar = this.f5686d;
            if (i14 == 0) {
                this.f5683a = new fe.a(this, i12);
                if (lVar != null) {
                    WeakReference weakReference2 = this.f5696p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        bk.f fVarG = lVar.g();
                        fVarG.f2808f = new ee.a(0.0f);
                        fVarG.f2809g = new ee.a(0.0f);
                        l lVarB = fVarG.b();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(lVarB);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(h0.b.m("Invalid sheet edge position value: ", i14, ". Must be 0 or 1."));
                }
                this.f5683a = new fe.a(this, iG);
                if (lVar != null) {
                    WeakReference weakReference3 = this.f5696p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        bk.f fVarG2 = lVar.g();
                        fVarG2.f2807e = new ee.a(0.0f);
                        fVarG2.f2810h = new ee.a(0.0f);
                        l lVarB2 = fVarG2.b();
                        if (iVar != null) {
                            iVar.setShapeAppearanceModel(lVarB2);
                        }
                    }
                }
            }
        }
        if (this.f5691i == null) {
            this.f5691i = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f5702v);
        }
        int iG2 = this.f5683a.G(view);
        coordinatorLayout.s(view, i10);
        this.f5693m = coordinatorLayout.getWidth();
        this.f5694n = this.f5683a.H(coordinatorLayout);
        this.f5692l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f5695o = marginLayoutParams != null ? this.f5683a.f(marginLayoutParams) : 0;
        int i15 = this.f5690h;
        if (i15 == 1 || i15 == 2) {
            iG = iG2 - this.f5683a.G(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f5690h);
            }
            iG = this.f5683a.x();
        }
        WeakHashMap weakHashMap2 = i0.f23177a;
        view.offsetLeftAndRight(iG);
        if (this.f5697q == null && (i11 = this.f5698r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f5697q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f5701u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // e3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // e3.b
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((SavedState) parcelable).f5703g;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f5690h = i10;
    }

    @Override // e3.b
    public final Parcelable o(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // e3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5690h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f5691i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f5699s) != null) {
            velocityTracker.recycle();
            this.f5699s = null;
        }
        if (this.f5699s == null) {
            this.f5699s = VelocityTracker.obtain();
        }
        this.f5699s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.f5700t - motionEvent.getX());
            f fVar = this.f5691i;
            if (fAbs > fVar.f2401b) {
                fVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void s(int i10) {
        View view;
        if (this.f5690h == i10) {
            return;
        }
        this.f5690h = i10;
        WeakReference weakReference = this.f5696p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f5690h == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f5701u.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
        v();
    }

    public final boolean t() {
        if (this.f5691i != null) {
            return this.f5689g || this.f5690h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        s(2);
        r2.f5687e.f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            xu.d r0 = r2.f5683a
            int r0 = r0.x()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = h0.b.h(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            xu.d r0 = r2.f5683a
            int r0 = r0.u()
        L1f:
            b4.f r1 = r2.f5691i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f2415r = r3
            r3 = -1
            r1.f2402c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f2400a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f2415r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f2415r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.s(r3)
            bc.j r3 = r2.f5687e
            r3.f(r4)
            return
        L57:
            r2.s(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.u(android.view.View, int, boolean):void");
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f5696p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        i0.k(view, 262144);
        i0.h(view, 0);
        i0.k(view, 1048576);
        i0.h(view, 0);
        int i10 = 5;
        if (this.f5690h != 5) {
            i0.l(view, v3.b.f23830l, new r(i10, 2, this));
        }
        int i11 = 3;
        if (this.f5690h != 3) {
            i0.l(view, v3.b.j, new r(i11, 2, this));
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public final int f5703g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5703g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5703g);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f5703g = sideSheetBehavior.f5690h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f5687e = new bc.j(this);
        this.f5689g = true;
        this.f5690h = 5;
        this.k = 0.1f;
        this.f5698r = -1;
        this.f5701u = new LinkedHashSet();
        this.f5702v = new fe.b(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.SideSheetBehavior_Layout_backgroundTint)) {
            this.f5685c = xu.l.q(context, typedArrayObtainStyledAttributes, ed.l.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f5686d = l.c(context, attributeSet, 0, f5682x).b();
        }
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(ed.l.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.f5698r = resourceId;
            WeakReference weakReference = this.f5697q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f5697q = null;
            WeakReference weakReference2 = this.f5696p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        l lVar = this.f5686d;
        if (lVar != null) {
            i iVar = new i(lVar);
            this.f5684b = iVar;
            iVar.m(context);
            ColorStateList colorStateList = this.f5685c;
            if (colorStateList != null) {
                this.f5684b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f5684b.setTint(typedValue.data);
            }
        }
        this.f5688f = typedArrayObtainStyledAttributes.getDimension(ed.l.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f5689g = typedArrayObtainStyledAttributes.getBoolean(ed.l.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
