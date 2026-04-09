package com.google.android.material.floatingactionbutton;

import E.u;
import L0.I;
import L0.S;
import L3.g;
import O3.b;
import O3.d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.C1851b;
import b4.InterfaceC1850a;
import c4.C2062a;
import c4.C2063b;
import c4.C2064c;
import c4.e;
import c4.f;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import d4.j;
import d4.n;
import d4.o;
import h4.C4415c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l4.C5287f;
import l4.C5288g;
import l4.C5290i;
import l4.m;
import m0.C5316i;
import o.C5390h;
import o.C5394l;
import o4.C5421a;
import r4.C5522a;

/* loaded from: classes2.dex */
public class FloatingActionButton extends o implements InterfaceC1850a, m, CoordinatorLayout.b {

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f22901c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f22902d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f22903e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f22904f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f22905g;

    /* renamed from: h, reason: collision with root package name */
    public int f22906h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f22907j;

    /* renamed from: k, reason: collision with root package name */
    public int f22908k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22909l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f22910m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f22911n;

    /* renamed from: o, reason: collision with root package name */
    public final C5394l f22912o;

    /* renamed from: p, reason: collision with root package name */
    public final C1851b f22913p;

    /* renamed from: q, reason: collision with root package name */
    public f f22914q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements b.f {
        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(C5522a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f22910m = new Rect();
        this.f22911n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, K3.a.f3121h, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f22901c = C4415c.a(context2, typedArrayD, 1);
        this.f22902d = n.b(typedArrayD.getInt(2, -1), null);
        this.f22905g = C4415c.a(context2, typedArrayD, 12);
        this.f22906h = typedArrayD.getInt(7, -1);
        this.i = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, 0.0f);
        float dimension2 = typedArrayD.getDimension(9, 0.0f);
        float dimension3 = typedArrayD.getDimension(11, 0.0f);
        this.f22909l = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        g gVarA = g.a(context2, typedArrayD, 15);
        g gVarA2 = g.a(context2, typedArrayD, 8);
        C5288g c5288g = C5290i.f43799m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, K3.a.f3130r, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C5290i c5290iA = C5290i.a(context2, resourceId, resourceId2, c5288g).a();
        boolean z10 = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        C5394l c5394l = new C5394l(this);
        this.f22912o = c5394l;
        c5394l.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.f22913p = new C1851b(this);
        getImpl().n(c5290iA);
        getImpl().g(this.f22901c, this.f22902d, this.f22905g, dimensionPixelSize);
        getImpl().f22942k = dimensionPixelSize2;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22940h != dimension) {
            impl.f22940h = dimension;
            impl.k(dimension, impl.i, impl.f22941j);
        }
        com.google.android.material.floatingactionbutton.b impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.k(impl2.f22940h, dimension2, impl2.f22941j);
        }
        com.google.android.material.floatingactionbutton.b impl3 = getImpl();
        if (impl3.f22941j != dimension3) {
            impl3.f22941j = dimension3;
            impl3.k(impl3.f22940h, impl3.i, dimension3);
        }
        getImpl().f22944m = gVarA;
        getImpl().f22945n = gVarA2;
        getImpl().f22938f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f22914q == null) {
            this.f22914q = new f(this, new b());
        }
        return this.f22914q;
    }

    @Override // b4.InterfaceC1850a
    public final boolean a() {
        return this.f22913p.f17181b;
    }

    public final void d() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22951t == null) {
            impl.f22951t = new ArrayList<>();
        }
        impl.f22951t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(d dVar) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22950s == null) {
            impl.f22950s = new ArrayList<>();
        }
        impl.f22950s.add(dVar);
    }

    public final void f() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        c cVar = new c();
        if (impl.f22952u == null) {
            impl.f22952u = new ArrayList<>();
        }
        impl.f22952u.add(cVar);
    }

    public final int g(int i) {
        int i10 = this.i;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f22901c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f22902d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f22941j;
    }

    public Drawable getContentBackground() {
        return getImpl().f22937e;
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        return this.f22913p.f17182c;
    }

    public g getHideMotionSpec() {
        return getImpl().f22945n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f22905g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f22905g;
    }

    public C5290i getShapeAppearanceModel() {
        C5290i c5290i = getImpl().f22933a;
        c5290i.getClass();
        return c5290i;
    }

    public g getShowMotionSpec() {
        return getImpl().f22944m;
    }

    public int getSize() {
        return this.f22906h;
    }

    public int getSizeDimension() {
        return g(this.f22906h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f22903e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f22904f;
    }

    public boolean getUseCompatPadding() {
        return this.f22909l;
    }

    public final void h(O3.b bVar, boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar = bVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, bVar);
        if (impl.f22953v.getVisibility() == 0) {
            if (impl.f22949r == 1) {
                return;
            }
        } else if (impl.f22949r != 2) {
            return;
        }
        Animator animator = impl.f22943l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        FloatingActionButton floatingActionButton = impl.f22953v;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.b(z10 ? 8 : 4, z10);
            if (aVar != null) {
                aVar.f22918a.a(aVar.f22919b);
                return;
            }
            return;
        }
        g gVar = impl.f22945n;
        AnimatorSet animatorSetB = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, com.google.android.material.floatingactionbutton.b.f22923F, com.google.android.material.floatingactionbutton.b.f22924G);
        animatorSetB.addListener(new C2063b(impl, z10, aVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f22951t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22953v.getVisibility() == 0) {
            if (impl.f22949r != 1) {
                return false;
            }
        } else if (impl.f22949r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22953v.getVisibility() != 0) {
            if (impl.f22949r != 2) {
                return false;
            }
        } else if (impl.f22949r == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f22910m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f22903e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f22904f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C5390h.c(colorForState, mode));
    }

    public final void m(b.a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.f22953v.getVisibility() != 0) {
            if (impl.f22949r == 2) {
                return;
            }
        } else if (impl.f22949r != 1) {
            return;
        }
        Animator animator = impl.f22943l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f22944m == null;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        FloatingActionButton floatingActionButton = impl.f22953v;
        boolean z12 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f22931A;
        if (!z12) {
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f22947p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f22918a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f10 = z11 ? 0.4f : 0.0f;
            impl.f22947p = f10;
            impl.a(f10, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        g gVar = impl.f22944m;
        AnimatorSet animatorSetB = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, com.google.android.material.floatingactionbutton.b.f22921D, com.google.android.material.floatingactionbutton.b.f22922E);
        animatorSetB.addListener(new C2064c(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f22950s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        C5287f c5287f = impl.f22934b;
        FloatingActionButton floatingActionButton = impl.f22953v;
        if (c5287f != null) {
            u.N(floatingActionButton, c5287f);
        }
        if (impl instanceof f) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f22932B == null) {
            impl.f22932B = new e(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f22932B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f22953v.getViewTreeObserver();
        e eVar = impl.f22932B;
        if (eVar != null) {
            viewTreeObserver.removeOnPreDrawListener(eVar);
            impl.f22932B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i10) {
        int sizeDimension = getSizeDimension();
        this.f22907j = (sizeDimension - this.f22908k) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i10));
        Rect rect = this.f22910m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5421a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5421a c5421a = (C5421a) parcelable;
        super.onRestoreInstanceState(c5421a.f12348b);
        Bundle bundle = c5421a.f44831d.get("expandableWidgetHelper");
        bundle.getClass();
        C1851b c1851b = this.f22913p;
        c1851b.getClass();
        c1851b.f17181b = bundle.getBoolean("expanded", false);
        c1851b.f17182c = bundle.getInt("expandedComponentIdHint", 0);
        if (c1851b.f17181b) {
            View view = c1851b.f17180a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C5421a c5421a = new C5421a(parcelableOnSaveInstanceState);
        C5316i<String, Bundle> c5316i = c5421a.f44831d;
        C1851b c1851b = this.f22913p;
        c1851b.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c1851b.f17181b);
        bundle.putInt("expandedComponentIdHint", c1851b.f17182c);
        c5316i.put("expandableWidgetHelper", bundle);
        return c5421a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f22911n;
            rect.set(0, 0, measuredWidth, measuredHeight);
            k(rect);
            f fVar = this.f22914q;
            int i = -(fVar.f22938f ? Math.max((fVar.f22942k - fVar.f22953v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f22901c != colorStateList) {
            this.f22901c = colorStateList;
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            C5287f c5287f = impl.f22934b;
            if (c5287f != null) {
                c5287f.setTintList(colorStateList);
            }
            C2062a c2062a = impl.f22936d;
            if (c2062a != null) {
                if (colorStateList != null) {
                    c2062a.f18471m = colorStateList.getColorForState(c2062a.getState(), c2062a.f18471m);
                }
                c2062a.f18474p = colorStateList;
                c2062a.f18472n = true;
                c2062a.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f22902d != mode) {
            this.f22902d = mode;
            C5287f c5287f = getImpl().f22934b;
            if (c5287f != null) {
                c5287f.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22940h != f10) {
            impl.f22940h = f10;
            impl.k(f10, impl.i, impl.f22941j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.i != f10) {
            impl.i = f10;
            impl.k(impl.f22940h, f10, impl.f22941j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22941j != f10) {
            impl.f22941j = f10;
            impl.k(impl.f22940h, impl.i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C5287f c5287f = getImpl().f22934b;
        if (c5287f != null) {
            c5287f.j(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f22938f) {
            getImpl().f22938f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f22913p.f17182c = i;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f22945n = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            float f10 = impl.f22947p;
            impl.f22947p = f10;
            Matrix matrix = impl.f22931A;
            impl.a(f10, matrix);
            impl.f22953v.setImageMatrix(matrix);
            if (this.f22903e != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f22912o.c(i);
        l();
    }

    public void setMaxImageSize(int i) {
        this.f22908k = i;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f22948q != i) {
            impl.f22948q = i;
            float f10 = impl.f22947p;
            impl.f22947p = f10;
            Matrix matrix = impl.f22931A;
            impl.a(f10, matrix);
            impl.f22953v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<b.f> arrayList = getImpl().f22952u;
        if (arrayList != null) {
            Iterator<b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<b.f> arrayList = getImpl().f22952u;
        if (arrayList != null) {
            Iterator<b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        impl.f22939g = z10;
        impl.q();
    }

    @Override // l4.m
    public void setShapeAppearanceModel(C5290i c5290i) {
        getImpl().n(c5290i);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f22944m = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.b(getContext(), i));
    }

    public void setSize(int i) {
        this.i = 0;
        if (i != this.f22906h) {
            this.f22906h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f22903e != colorStateList) {
            this.f22903e = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f22904f != mode) {
            this.f22904f = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f22909l != z10) {
            this.f22909l = z10;
            getImpl().i();
        }
    }

    @Override // d4.o, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f22915a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22916b;

        public BaseBehavior() {
            this.f22916b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f22910m;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f15475h == 0) {
                fVar.f15475h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f15468a instanceof BottomSheetBehavior : false) {
                    t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListE = coordinatorLayout.e(floatingActionButton);
            int size = arrayListE.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListE.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f15468a instanceof BottomSheetBehavior : false) && t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i, floatingActionButton);
            Rect rect = floatingActionButton.f22910m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i12 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    floatingActionButton.offsetTopAndBottom(i10);
                }
                if (i12 != 0) {
                    WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                    floatingActionButton.offsetLeftAndRight(i12);
                }
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f22916b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f15473f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f22915a == null) {
                this.f22915a = new Rect();
            }
            Rect rect = this.f22915a;
            d4.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
            } else {
                floatingActionButton.m(null, false);
            }
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f22916b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f15473f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
            } else {
                floatingActionButton.m(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.i);
            this.f22916b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f22905g != colorStateList) {
            this.f22905g = colorStateList;
            getImpl().m(this.f22905g);
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }
}
