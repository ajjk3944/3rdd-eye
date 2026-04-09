package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.e0;
import com.google.android.material.stateful.ExtendableSavedState;
import g5.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import k4.h;
import r0.i;

/* loaded from: classes2.dex */
public class FloatingActionButton extends e0 implements y4.a, k, CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f10532r = j4.k.Widget_Design_FloatingActionButton;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f10533b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f10534c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f10535d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f10536e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f10537f;

    /* renamed from: g, reason: collision with root package name */
    public int f10538g;

    /* renamed from: h, reason: collision with root package name */
    public int f10539h;

    /* renamed from: i, reason: collision with root package name */
    public int f10540i;

    /* renamed from: j, reason: collision with root package name */
    public int f10541j;

    /* renamed from: k, reason: collision with root package name */
    public int f10542k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10543l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f10544m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f10545n;

    /* renamed from: o, reason: collision with root package name */
    public final o f10546o;

    /* renamed from: p, reason: collision with root package name */
    public final y4.b f10547p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f10548q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.e eVar) {
            super.k(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Size {
    }

    public class a implements a.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f10552a;

        public a(b bVar) {
            this.f10552a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void a() {
            this.f10552a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.g
        public void b() {
            this.f10552a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class c implements f5.b {
        public c() {
        }

        @Override // f5.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f10544m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f10541j, i11 + FloatingActionButton.this.f10541j, i12 + FloatingActionButton.this.f10541j, i13 + FloatingActionButton.this.f10541j);
        }

        @Override // f5.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // f5.b
        public boolean c() {
            return FloatingActionButton.this.f10543l;
        }
    }

    public class d implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final k4.k f10555a;

        public d(k4.k kVar) {
            this.f10555a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.f
        public void a() {
            this.f10555a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.f
        public void b() {
            this.f10555a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f10555a.equals(this.f10555a);
        }

        public int hashCode() {
            return this.f10555a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f10548q == null) {
            this.f10548q = new com.google.android.material.floatingactionbutton.a(this, new c());
        }
        return this.f10548q;
    }

    @Override // y4.a
    public boolean a() {
        return this.f10547p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(k4.k kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f10533b;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10534c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().p();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().s();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().u();
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().o();
    }

    @Px
    public int getCustomSize() {
        return this.f10540i;
    }

    public int getExpandedComponentIdHint() {
        return this.f10547p.b();
    }

    @Nullable
    public h getHideMotionSpec() {
        return getImpl().r();
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10537f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f10537f;
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return (com.google.android.material.shape.a) i.g(getImpl().v());
    }

    @Nullable
    public h getShowMotionSpec() {
        return getImpl().w();
    }

    public int getSize() {
        return this.f10539h;
    }

    public int getSizeDimension() {
        return i(this.f10539h);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f10535d;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10536e;
    }

    public boolean getUseCompatPadding() {
        return this.f10543l;
    }

    public void h(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        o(rect);
    }

    public final int i(int i10) {
        int i11 = this.f10540i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(j4.d.design_fab_size_normal) : resources.getDimensionPixelSize(j4.d.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? i(1) : i(0);
    }

    public final void j(Rect rect) {
        h(rect);
        int i10 = -this.f10548q.x();
        rect.inset(i10, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public void k(b bVar) {
        l(bVar, true);
    }

    public void l(b bVar, boolean z10) {
        getImpl().y(s(bVar), z10);
    }

    public boolean m() {
        return getImpl().B();
    }

    public boolean n() {
        return getImpl().C();
    }

    public final void o(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f10544m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().F();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f10541j = (sizeDimension - this.f10542k) / 2;
        getImpl().c0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f10544m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.c());
        this.f10547p.d((Bundle) i.g((Bundle) extendableSavedState.f11183c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f11183c.put("expandableWidgetHelper", this.f10547p.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j(this.f10545n);
            if (!this.f10545n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f10535d;
        if (colorStateList == null) {
            k0.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f10536e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.i.e(colorForState, mode));
    }

    public void q(b bVar) {
        r(bVar, true);
    }

    public void r(b bVar, boolean z10) {
        getImpl().a0(s(bVar), z10);
    }

    public final a.g s(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f10533b != colorStateList) {
            this.f10533b = colorStateList;
            getImpl().K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f10534c != mode) {
            this.f10534c = mode;
            getImpl().L(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().M(f10);
    }

    public void setCompatElevationResource(@DimenRes int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().P(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().T(f10);
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f10540i) {
            this.f10540i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().d0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().q()) {
            getImpl().N(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.f10547p.f(i10);
    }

    public void setHideMotionSpec(@Nullable h hVar) {
        getImpl().O(hVar);
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(h.d(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.f10535d != null) {
                p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        this.f10546o.i(i10);
        p();
    }

    public void setMaxImageSize(int i10) {
        this.f10542k = i10;
        getImpl().R(i10);
    }

    public void setRippleColor(@ColorInt int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().I();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().V(z10);
    }

    @Override // g5.k
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        getImpl().W(aVar);
    }

    public void setShowMotionSpec(@Nullable h hVar) {
        getImpl().X(hVar);
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(h.d(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f10540i = 0;
        if (i10 != this.f10539h) {
            this.f10539h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f10535d != colorStateList) {
            this.f10535d = colorStateList;
            p();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f10536e != mode) {
            this.f10536e = mode;
            p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f10543l != z10) {
            this.f10543l = z10;
            getImpl().E();
        }
    }

    @Override // com.google.android.material.internal.e0, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* renamed from: a, reason: collision with root package name */
        public Rect f10549a;

        /* renamed from: b, reason: collision with root package name */
        public b f10550b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10551c;

        public BaseBehavior() {
            this.f10551c = true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f10544m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            return (this.f10551c && ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        public final void L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f10544m;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                ViewCompat.U(floatingActionButton, i10);
            }
            if (i11 != 0) {
                ViewCompat.T(floatingActionButton, i11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            L(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f10549a == null) {
                this.f10549a = new Rect();
            }
            Rect rect = this.f10549a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.l(this.f10550b, false);
                return true;
            }
            floatingActionButton.r(this.f10550b, false);
            return true;
        }

        public final boolean P(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.l(this.f10550b, false);
                return true;
            }
            floatingActionButton.r(this.f10550b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.e eVar) {
            if (eVar.f2339h == 0) {
                eVar.f2339h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.FloatingActionButton_Behavior_Layout);
            this.f10551c = typedArrayObtainStyledAttributes.getBoolean(l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.floatingActionButtonStyle);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f10537f != colorStateList) {
            this.f10537f = colorStateList;
            getImpl().U(this.f10537f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f10532r;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10544m = new Rect();
        this.f10545n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.FloatingActionButton, i10, i11, new int[0]);
        this.f10533b = d5.c.a(context2, typedArrayI, l.FloatingActionButton_backgroundTint);
        this.f10534c = d0.m(typedArrayI.getInt(l.FloatingActionButton_backgroundTintMode, -1), null);
        this.f10537f = d5.c.a(context2, typedArrayI, l.FloatingActionButton_rippleColor);
        this.f10539h = typedArrayI.getInt(l.FloatingActionButton_fabSize, -1);
        this.f10540i = typedArrayI.getDimensionPixelSize(l.FloatingActionButton_fabCustomSize, 0);
        this.f10538g = typedArrayI.getDimensionPixelSize(l.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayI.getDimension(l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayI.getDimension(l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayI.getDimension(l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f10543l = typedArrayI.getBoolean(l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(j4.d.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(l.FloatingActionButton_maxImageSize, 0));
        h hVarC = h.c(context2, typedArrayI, l.FloatingActionButton_showMotionSpec);
        h hVarC2 = h.c(context2, typedArrayI, l.FloatingActionButton_hideMotionSpec);
        com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.g(context2, attributeSet, i10, i11, com.google.android.material.shape.a.f10982m).m();
        boolean z10 = typedArrayI.getBoolean(l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayI.getBoolean(l.FloatingActionButton_android_enabled, true));
        typedArrayI.recycle();
        o oVar = new o(this);
        this.f10546o = oVar;
        oVar.g(attributeSet, i10);
        this.f10547p = new y4.b(this);
        getImpl().W(aVarM);
        getImpl().A(this.f10533b, this.f10534c, this.f10537f, this.f10538g);
        getImpl().S(dimensionPixelSize);
        getImpl().M(dimension);
        getImpl().P(dimension2);
        getImpl().T(dimension3);
        getImpl().X(hVarC);
        getImpl().O(hVarC2);
        getImpl().N(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
