package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.z0;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import b5.j;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.f0;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;
import com.google.android.material.internal.w;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import g5.h;
import g5.l;
import h.g;
import j4.k;
import java.util.Objects;
import p4.a;

/* loaded from: classes2.dex */
public class NavigationView extends w implements b5.b {

    /* renamed from: h, reason: collision with root package name */
    public final r f10779h;

    /* renamed from: i, reason: collision with root package name */
    public final s f10780i;

    /* renamed from: j, reason: collision with root package name */
    public d f10781j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10782k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f10783l;

    /* renamed from: m, reason: collision with root package name */
    public MenuInflater f10784m;

    /* renamed from: n, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f10785n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10786o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10787p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10788q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10789r;

    /* renamed from: s, reason: collision with root package name */
    public int f10790s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10791t;

    /* renamed from: u, reason: collision with root package name */
    public final int f10792u;

    /* renamed from: v, reason: collision with root package name */
    public final l f10793v;

    /* renamed from: w, reason: collision with root package name */
    public final j f10794w;

    /* renamed from: x, reason: collision with root package name */
    public final b5.c f10795x;

    /* renamed from: y, reason: collision with root package name */
    public final DrawerLayout.e f10796y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f10778z = {R.attr.state_checked};
    public static final int[] A = {-16842910};
    public static final int B = k.Widget_Design_NavigationView;

    public class a extends DrawerLayout.g {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final b5.c cVar = navigationView.f10795x;
                Objects.requireNonNull(cVar);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f10795x.f();
                NavigationView.this.u();
            }
        }
    }

    public class b implements d.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            d dVar2 = NavigationView.this.f10781j;
            return dVar2 != null && dVar2.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f10783l);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f10783l[1] == 0;
            NavigationView.this.f10780i.D(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.t());
            boolean z12 = NavigationView.this.getLayoutDirection() == 1;
            boolean z13 = NavigationView.this.f10783l[0] == 0 || NavigationView.this.f10783l[0] + NavigationView.this.getWidth() == 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawLeftInsetForeground(z13 && (!z12 ? !navigationView3.s() : !navigationView3.r()));
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectA = f0.a(activityA);
                boolean z14 = rectA.height() - NavigationView.this.getHeight() == NavigationView.this.f10783l[1];
                boolean z15 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView4 = NavigationView.this;
                navigationView4.setDrawBottomInsetForeground(z14 && z15 && navigationView4.q());
                boolean z16 = rectA.width() == NavigationView.this.f10783l[0] || rectA.width() - NavigationView.this.getWidth() == NavigationView.this.f10783l[0];
                NavigationView navigationView5 = NavigationView.this;
                if (!z16 || (!z12 ? !navigationView5.r() : !navigationView5.s())) {
                    z10 = false;
                }
                navigationView5.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f10784m == null) {
            this.f10784m = new g(getContext());
        }
        return this.f10784m;
    }

    @Override // b5.b
    public void a() {
        w();
        this.f10794w.f();
        u();
    }

    @Override // b5.b
    public void b(BackEventCompat backEventCompat) {
        w();
        this.f10794w.j(backEventCompat);
    }

    @Override // b5.b
    public void c(BackEventCompat backEventCompat) {
        this.f10794w.l(backEventCompat, ((DrawerLayout.f) w().second).f2963a);
        if (this.f10791t) {
            this.f10790s = k4.a.c(0, this.f10792u, this.f10794w.a(backEventCompat.a()));
            v(getWidth(), getHeight());
        }
    }

    @Override // b5.b
    public void d() {
        Pair pairW = w();
        DrawerLayout drawerLayout = (DrawerLayout) pairW.first;
        BackEventCompat backEventCompatC = this.f10794w.c();
        if (backEventCompatC == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.f(this);
            return;
        }
        this.f10794w.h(backEventCompatC, ((DrawerLayout.f) pairW.second).f2963a, com.google.android.material.navigation.b.b(drawerLayout, this), com.google.android.material.navigation.b.c(drawerLayout));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f10793v.d(canvas, new a.InterfaceC0453a() { // from class: com.google.android.material.navigation.c
            @Override // p4.a.InterfaceC0453a
            public final void a(Canvas canvas2) {
                super/*android.widget.FrameLayout*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.w
    public void e(WindowInsetsCompat windowInsetsCompat) {
        this.f10780i.m(windowInsetsCompat);
    }

    @VisibleForTesting
    public j getBackHelper() {
        return this.f10794w;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.f10780i.n();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f10780i.o();
    }

    @Px
    public int getDividerInsetStart() {
        return this.f10780i.p();
    }

    public int getHeaderCount() {
        return this.f10780i.q();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f10780i.r();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.f10780i.s();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.f10780i.t();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f10780i.w();
    }

    public int getItemMaxLines() {
        return this.f10780i.u();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f10780i.v();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.f10780i.x();
    }

    @NonNull
    public Menu getMenu() {
        return this.f10779h;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.f10780i.z();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.f10780i.A();
    }

    public final ColorStateList k(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = d.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(c.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = A;
        return new ColorStateList(new int[][]{iArr, f10778z, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final Drawable l(z0 z0Var) {
        return m(z0Var, d5.c.b(getContext(), z0Var, j4.l.NavigationView_itemShapeFillColor));
    }

    public final Drawable m(z0 z0Var, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(com.google.android.material.shape.a.b(getContext(), z0Var.n(j4.l.NavigationView_itemShapeAppearance, 0), z0Var.n(j4.l.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        materialShapeDrawable.i0(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, z0Var.f(j4.l.NavigationView_itemShapeInsetStart, 0), z0Var.f(j4.l.NavigationView_itemShapeInsetTop, 0), z0Var.f(j4.l.NavigationView_itemShapeInsetEnd, 0), z0Var.f(j4.l.NavigationView_itemShapeInsetBottom, 0));
    }

    public final boolean n(z0 z0Var) {
        return z0Var.s(j4.l.NavigationView_itemShapeAppearance) || z0Var.s(j4.l.NavigationView_itemShapeAppearanceOverlay);
    }

    public View o(int i10) {
        return this.f10780i.C(i10);
    }

    @Override // com.google.android.material.internal.w, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f10795x.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.O(this.f10796y);
            drawerLayout.a(this.f10796y);
            if (drawerLayout.D(this)) {
                this.f10795x.e();
            }
        }
    }

    @Override // com.google.android.material.internal.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f10785n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).O(this.f10796y);
        }
        this.f10795x.f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f10782k), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f10782k, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        this.f10779h.T(savedState.f10797c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f10797c = bundle;
        this.f10779h.V(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        v(i10, i11);
    }

    public void p(int i10) {
        this.f10780i.Y(true);
        getMenuInflater().inflate(i10, this.f10779h);
        this.f10780i.Y(false);
        this.f10780i.h(false);
    }

    public boolean q() {
        return this.f10787p;
    }

    public boolean r() {
        return this.f10789r;
    }

    public boolean s() {
        return this.f10788q;
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f10787p = z10;
    }

    public void setCheckedItem(@IdRes int i10) {
        MenuItem menuItemFindItem = this.f10779h.findItem(i10);
        if (menuItemFindItem != null) {
            this.f10780i.E((f) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f10780i.F(i10);
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f10780i.G(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setEndInsetScrimEnabled(boolean z10) {
        this.f10789r = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z10) {
        this.f10793v.g(this, z10);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f10780i.I(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i10) {
        setItemBackground(getContext().getDrawable(i10));
    }

    public void setItemHorizontalPadding(@Dimension int i10) {
        this.f10780i.K(i10);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i10) {
        this.f10780i.K(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@Dimension int i10) {
        this.f10780i.L(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f10780i.L(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@Dimension int i10) {
        this.f10780i.M(i10);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f10780i.N(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f10780i.O(i10);
    }

    public void setItemTextAppearance(@StyleRes int i10) {
        this.f10780i.P(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f10780i.Q(z10);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f10780i.R(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i10) {
        this.f10780i.S(i10);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i10) {
        this.f10780i.S(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(@Nullable d dVar) {
        this.f10781j = dVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        s sVar = this.f10780i;
        if (sVar != null) {
            sVar.T(i10);
        }
    }

    public void setStartInsetScrimEnabled(boolean z10) {
        this.f10788q = z10;
    }

    public void setSubheaderInsetEnd(@Px int i10) {
        this.f10780i.V(i10);
    }

    public void setSubheaderInsetStart(@Px int i10) {
        this.f10780i.W(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f10786o = z10;
    }

    public boolean t() {
        return this.f10786o;
    }

    public final void u() {
        if (!this.f10791t || this.f10790s == 0) {
            return;
        }
        this.f10790s = 0;
        v(getWidth(), getHeight());
    }

    public final void v(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f)) {
            if ((this.f10790s > 0 || this.f10791t) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z10 = Gravity.getAbsoluteGravity(((DrawerLayout.f) getLayoutParams()).f2963a, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                a.b bVarO = materialShapeDrawable.K().w().o(this.f10790s);
                if (z10) {
                    bVarO.D(0.0f);
                    bVarO.u(0.0f);
                } else {
                    bVarO.H(0.0f);
                    bVarO.y(0.0f);
                }
                com.google.android.material.shape.a aVarM = bVarO.m();
                materialShapeDrawable.setShapeAppearanceModel(aVarM);
                this.f10793v.f(this, aVarM);
                this.f10793v.e(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f10793v.h(this, true);
            }
        }
    }

    public final Pair w() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public final void x() {
        this.f10785n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10785n);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f10797c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10797c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f10797c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListK;
        int i11;
        int i12 = B;
        super(l5.a.d(context, attributeSet, i10, i12), attributeSet, i10);
        s sVar = new s();
        this.f10780i = sVar;
        this.f10783l = new int[2];
        this.f10786o = true;
        this.f10787p = true;
        this.f10788q = true;
        this.f10789r = true;
        this.f10790s = 0;
        this.f10793v = l.a(this);
        this.f10794w = new j(this);
        this.f10795x = new b5.c(this);
        this.f10796y = new a();
        Context context2 = getContext();
        r rVar = new r(context2);
        this.f10779h = rVar;
        z0 z0VarJ = a0.j(context2, attributeSet, j4.l.NavigationView, i10, i12, new int[0]);
        int i13 = j4.l.NavigationView_android_background;
        if (z0VarJ.s(i13)) {
            setBackground(z0VarJ.g(i13));
        }
        int iF = z0VarJ.f(j4.l.NavigationView_drawerLayoutCornerSize, 0);
        this.f10790s = iF;
        this.f10791t = iF == 0;
        this.f10792u = getResources().getDimensionPixelSize(j4.d.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListF = w4.d.f(background);
        if (background == null || colorStateListF != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(com.google.android.material.shape.a.e(context2, attributeSet, i10, i12).m());
            if (colorStateListF != null) {
                materialShapeDrawable.i0(colorStateListF);
            }
            materialShapeDrawable.W(context2);
            setBackground(materialShapeDrawable);
        }
        if (z0VarJ.s(j4.l.NavigationView_elevation)) {
            setElevation(z0VarJ.f(r2, 0));
        }
        setFitsSystemWindows(z0VarJ.a(j4.l.NavigationView_android_fitsSystemWindows, false));
        this.f10782k = z0VarJ.f(j4.l.NavigationView_android_maxWidth, 0);
        int i14 = j4.l.NavigationView_subheaderColor;
        ColorStateList colorStateListC = z0VarJ.s(i14) ? z0VarJ.c(i14) : null;
        int i15 = j4.l.NavigationView_subheaderTextAppearance;
        int iN = z0VarJ.s(i15) ? z0VarJ.n(i15, 0) : 0;
        if (iN == 0 && colorStateListC == null) {
            colorStateListC = k(R.attr.textColorSecondary);
        }
        int i16 = j4.l.NavigationView_itemIconTint;
        if (z0VarJ.s(i16)) {
            colorStateListK = z0VarJ.c(i16);
        } else {
            colorStateListK = k(R.attr.textColorSecondary);
        }
        int i17 = j4.l.NavigationView_itemTextAppearance;
        int iN2 = z0VarJ.s(i17) ? z0VarJ.n(i17, 0) : 0;
        boolean zA = z0VarJ.a(j4.l.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i18 = j4.l.NavigationView_itemIconSize;
        if (z0VarJ.s(i18)) {
            setItemIconSize(z0VarJ.f(i18, 0));
        }
        int i19 = j4.l.NavigationView_itemTextColor;
        ColorStateList colorStateListC2 = z0VarJ.s(i19) ? z0VarJ.c(i19) : null;
        if (iN2 == 0 && colorStateListC2 == null) {
            colorStateListC2 = k(R.attr.textColorPrimary);
        }
        Drawable drawableG = z0VarJ.g(j4.l.NavigationView_itemBackground);
        if (drawableG == null && n(z0VarJ)) {
            drawableG = l(z0VarJ);
            ColorStateList colorStateListB = d5.c.b(context2, z0VarJ, j4.l.NavigationView_itemRippleColor);
            if (colorStateListB != null) {
                sVar.J(new RippleDrawable(e5.a.d(colorStateListB), null, m(z0VarJ, null)));
            }
        }
        int i20 = j4.l.NavigationView_itemHorizontalPadding;
        if (z0VarJ.s(i20)) {
            i11 = 0;
            setItemHorizontalPadding(z0VarJ.f(i20, 0));
        } else {
            i11 = 0;
        }
        int i21 = j4.l.NavigationView_itemVerticalPadding;
        if (z0VarJ.s(i21)) {
            setItemVerticalPadding(z0VarJ.f(i21, i11));
        }
        setDividerInsetStart(z0VarJ.f(j4.l.NavigationView_dividerInsetStart, i11));
        setDividerInsetEnd(z0VarJ.f(j4.l.NavigationView_dividerInsetEnd, i11));
        setSubheaderInsetStart(z0VarJ.f(j4.l.NavigationView_subheaderInsetStart, i11));
        setSubheaderInsetEnd(z0VarJ.f(j4.l.NavigationView_subheaderInsetEnd, i11));
        setTopInsetScrimEnabled(z0VarJ.a(j4.l.NavigationView_topInsetScrimEnabled, this.f10786o));
        setBottomInsetScrimEnabled(z0VarJ.a(j4.l.NavigationView_bottomInsetScrimEnabled, this.f10787p));
        setStartInsetScrimEnabled(z0VarJ.a(j4.l.NavigationView_startInsetScrimEnabled, this.f10788q));
        setEndInsetScrimEnabled(z0VarJ.a(j4.l.NavigationView_endInsetScrimEnabled, this.f10789r));
        int iF2 = z0VarJ.f(j4.l.NavigationView_itemIconPadding, 0);
        setItemMaxLines(z0VarJ.k(j4.l.NavigationView_itemMaxLines, 1));
        rVar.W(new b());
        sVar.H(1);
        sVar.k(context2, rVar);
        if (iN != 0) {
            sVar.X(iN);
        }
        sVar.U(colorStateListC);
        sVar.N(colorStateListK);
        sVar.T(getOverScrollMode());
        if (iN2 != 0) {
            sVar.P(iN2);
        }
        sVar.Q(zA);
        sVar.R(colorStateListC2);
        sVar.I(drawableG);
        sVar.L(iF2);
        rVar.b(sVar);
        addView((View) sVar.y(this));
        int i22 = j4.l.NavigationView_menu;
        if (z0VarJ.s(i22)) {
            p(z0VarJ.n(i22, 0));
        }
        int i23 = j4.l.NavigationView_headerLayout;
        if (z0VarJ.s(i23)) {
            o(z0VarJ.n(i23, 0));
        }
        z0VarJ.x();
        x();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f10779h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f10780i.E((f) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
