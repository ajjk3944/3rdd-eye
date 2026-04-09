package com.google.android.material.navigation;

import A3.AbstractC0135d;
import A3.C;
import A3.C0133b;
import A3.C0134c;
import A3.D;
import A3.E;
import G3.A;
import G3.C0147a;
import G3.j;
import G3.n;
import G3.o;
import a4.p;
import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import c.C0377b;
import com.google.android.material.internal.NavigationMenuView;
import d0.c;
import e3.AbstractC2303a;
import java.util.ArrayList;
import m.h;
import n.m;
import o.a1;
import x3.C3001f;
import x3.q;
import x3.t;
import z3.C3018c;
import z3.C3023h;
import z3.InterfaceC3017b;

/* loaded from: classes.dex */
public class NavigationView extends t implements InterfaceC3017b {

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f18400N = {R.attr.state_checked};

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f18401O = {-16842910};

    /* renamed from: C, reason: collision with root package name */
    public boolean f18402C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18403D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18404E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18405F;

    /* renamed from: G, reason: collision with root package name */
    public int f18406G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f18407H;

    /* renamed from: I, reason: collision with root package name */
    public final int f18408I;

    /* renamed from: J, reason: collision with root package name */
    public final A f18409J;

    /* renamed from: K, reason: collision with root package name */
    public final C3023h f18410K;

    /* renamed from: L, reason: collision with root package name */
    public final a1 f18411L;
    public final A3.A M;

    /* renamed from: h, reason: collision with root package name */
    public final C3001f f18412h;
    public final q i;

    /* renamed from: j, reason: collision with root package name */
    public D f18413j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18414k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f18415l;

    /* renamed from: m, reason: collision with root package name */
    public h f18416m;

    /* renamed from: n, reason: collision with root package name */
    public final C f18417n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf A[PHI: r11
  0x01bf: PHI (r11v3 android.graphics.drawable.Drawable) = 
  (r11v2 android.graphics.drawable.Drawable)
  (r11v6 android.graphics.drawable.Drawable)
  (r11v2 android.graphics.drawable.Drawable)
 binds: [B:54:0x0182, B:60:0x01a8, B:58:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f18416m == null) {
            this.f18416m = new h(getContext());
        }
        return this.f18416m;
    }

    @Override // z3.InterfaceC3017b
    public final void a(C0377b c0377b) {
        h();
        this.f18410K.f24467f = c0377b;
    }

    @Override // z3.InterfaceC3017b
    public final void b() {
        Pair pairH = h();
        DrawerLayout drawerLayout = (DrawerLayout) pairH.first;
        C3023h c3023h = this.f18410K;
        C0377b c0377b = c3023h.f24467f;
        c3023h.f24467f = null;
        if (c0377b == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i = ((c) pairH.second).f19700a;
        int i3 = AbstractC0135d.f367a;
        c3023h.b(c0377b, i, new C0134c(this, 0, drawerLayout), new C0133b(0, drawerLayout));
    }

    @Override // z3.InterfaceC3017b
    public final void c(C0377b c0377b) {
        float f2 = c0377b.f5820c;
        int i = ((c) h().second).f19700a;
        C3023h c3023h = this.f18410K;
        if (c3023h.f24467f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0377b c0377b2 = c3023h.f24467f;
        c3023h.f24467f = c0377b;
        if (c0377b2 != null) {
            c3023h.c(i, f2, c0377b.f5821d == 0);
        }
        if (this.f18407H) {
            this.f18406G = AbstractC2303a.c(c3023h.f24462a.getInterpolation(f2), 0, this.f18408I);
            g(getWidth(), getHeight());
        }
    }

    @Override // z3.InterfaceC3017b
    public final void d() {
        h();
        this.f18410K.a();
        if (!this.f18407H || this.f18406G == 0) {
            return;
        }
        this.f18406G = 0;
        g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        A a6 = this.f18409J;
        Path path = a6.f1523e;
        if (!a6.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final ColorStateList e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = G.c.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.apm.insight.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f18401O;
        return new ColorStateList(new int[][]{iArr, f18400N, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListB.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    public final InsetDrawable f(a1 a1Var, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) a1Var.f22480c;
        j jVar = new j(o.a(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).a());
        jVar.q(colorStateList);
        return new InsetDrawable((Drawable) jVar, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public final void g(int i, int i3) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof c)) {
            if ((this.f18406G > 0 || this.f18407H) && (getBackground() instanceof j)) {
                boolean z6 = Gravity.getAbsoluteGravity(((c) getLayoutParams()).f19700a, getLayoutDirection()) == 3;
                j jVar = (j) getBackground();
                n nVarG = jVar.f1597b.f1560a.g();
                nVarG.c(this.f18406G);
                if (z6) {
                    nVarG.f1616e = new C0147a(0.0f);
                    nVarG.f1619h = new C0147a(0.0f);
                } else {
                    nVarG.f1617f = new C0147a(0.0f);
                    nVarG.f1618g = new C0147a(0.0f);
                }
                o oVarA = nVarG.a();
                jVar.setShapeAppearanceModel(oVarA);
                A a6 = this.f18409J;
                a6.f1521c = oVarA;
                a6.c();
                a6.a(this);
                a6.f1522d = new RectF(0.0f, 0.0f, i, i3);
                a6.c();
                a6.a(this);
                a6.f1520b = true;
                a6.a(this);
            }
        }
    }

    public C3023h getBackHelper() {
        return this.f18410K;
    }

    public MenuItem getCheckedItem() {
        return this.i.f24148e.f24122b;
    }

    public int getDividerInsetEnd() {
        return this.i.f24135H;
    }

    public int getDividerInsetStart() {
        return this.i.f24134G;
    }

    public int getHeaderCount() {
        return this.i.f24145b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.i.f24155m;
    }

    public int getItemHorizontalPadding() {
        return this.i.f24130C;
    }

    public int getItemIconPadding() {
        return this.i.f24132E;
    }

    public ColorStateList getItemIconTintList() {
        return this.i.f24154l;
    }

    public int getItemMaxLines() {
        return this.i.M;
    }

    public ColorStateList getItemTextColor() {
        return this.i.f24153k;
    }

    public int getItemVerticalPadding() {
        return this.i.f24131D;
    }

    public Menu getMenu() {
        return this.f18412h;
    }

    public int getSubheaderInsetEnd() {
        return this.i.f24137J;
    }

    public int getSubheaderInsetStart() {
        return this.i.f24136I;
    }

    public final Pair h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof c)) {
            return new Pair((DrawerLayout) parent, (c) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // x3.t, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C3018c c3018c;
        super.onAttachedToWindow();
        p.s(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            a1 a1Var = this.f18411L;
            if (((C3018c) a1Var.f22479b) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                A3.A a6 = this.M;
                if (a6 == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f5144H;
                    if (arrayList != null) {
                        arrayList.remove(a6);
                    }
                }
                if (a6 != null) {
                    if (drawerLayout.f5144H == null) {
                        drawerLayout.f5144H = new ArrayList();
                    }
                    drawerLayout.f5144H.add(a6);
                }
                if (!DrawerLayout.k(this) || (c3018c = (C3018c) a1Var.f22479b) == null) {
                    return;
                }
                c3018c.b((InterfaceC3017b) a1Var.f22480c, (View) a1Var.f22481d, true);
            }
        }
    }

    @Override // x3.t, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f18417n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            A3.A a6 = this.M;
            if (a6 == null) {
                drawerLayout.getClass();
            } else {
                ArrayList arrayList = drawerLayout.f5144H;
                if (arrayList != null) {
                    arrayList.remove(a6);
                }
            }
        }
        a1 a1Var = this.f18411L;
        C3018c c3018c = (C3018c) a1Var.f22479b;
        if (c3018c != null) {
            c3018c.c((View) a1Var.f22481d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int i6 = this.f18414k;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i6), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E e6 = (E) parcelable;
        super.onRestoreInstanceState(e6.f3954a);
        this.f18412h.t(e6.f361c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        E e6 = new E(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        e6.f361c = bundle;
        this.f18412h.v(bundle);
        return e6;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        g(i, i3);
    }

    public void setBottomInsetScrimEnabled(boolean z6) {
        this.f18403D = z6;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.f18412h.findItem(i);
        if (menuItemFindItem != null) {
            this.i.f24148e.b((m) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        q qVar = this.i;
        qVar.f24135H = i;
        qVar.a();
    }

    public void setDividerInsetStart(int i) {
        q qVar = this.i;
        qVar.f24134G = i;
        qVar.a();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        p.q(this, f2);
    }

    public void setEndInsetScrimEnabled(boolean z6) {
        this.f18405F = z6;
    }

    public void setForceCompatClippingEnabled(boolean z6) {
        A a6 = this.f18409J;
        if (z6 != a6.f1519a) {
            a6.f1519a = z6;
            a6.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        q qVar = this.i;
        qVar.f24155m = drawable;
        qVar.i();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        q qVar = this.i;
        qVar.f24130C = i;
        qVar.i();
    }

    public void setItemHorizontalPaddingResource(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        q qVar = this.i;
        qVar.f24130C = dimensionPixelSize;
        qVar.i();
    }

    public void setItemIconPadding(int i) {
        q qVar = this.i;
        qVar.f24132E = i;
        qVar.i();
    }

    public void setItemIconPaddingResource(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        q qVar = this.i;
        qVar.f24132E = dimensionPixelSize;
        qVar.i();
    }

    public void setItemIconSize(int i) {
        q qVar = this.i;
        if (qVar.f24133F != i) {
            qVar.f24133F = i;
            qVar.f24138K = true;
            qVar.i();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        q qVar = this.i;
        qVar.f24154l = colorStateList;
        qVar.i();
    }

    public void setItemMaxLines(int i) {
        q qVar = this.i;
        qVar.M = i;
        qVar.i();
    }

    public void setItemTextAppearance(int i) {
        q qVar = this.i;
        qVar.i = i;
        qVar.i();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) {
        q qVar = this.i;
        qVar.f24152j = z6;
        qVar.i();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        q qVar = this.i;
        qVar.f24153k = colorStateList;
        qVar.i();
    }

    public void setItemVerticalPadding(int i) {
        q qVar = this.i;
        qVar.f24131D = i;
        qVar.i();
    }

    public void setItemVerticalPaddingResource(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        q qVar = this.i;
        qVar.f24131D = dimensionPixelSize;
        qVar.i();
    }

    public void setNavigationItemSelectedListener(D d6) {
        this.f18413j = d6;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        q qVar = this.i;
        if (qVar != null) {
            qVar.f24142P = i;
            NavigationMenuView navigationMenuView = qVar.f24144a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z6) {
        this.f18404E = z6;
    }

    public void setSubheaderInsetEnd(int i) {
        q qVar = this.i;
        qVar.f24137J = i;
        qVar.g();
    }

    public void setSubheaderInsetStart(int i) {
        q qVar = this.i;
        qVar.f24136I = i;
        qVar.g();
    }

    public void setTopInsetScrimEnabled(boolean z6) {
        this.f18402C = z6;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f18412h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.i.f24148e.b((m) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
