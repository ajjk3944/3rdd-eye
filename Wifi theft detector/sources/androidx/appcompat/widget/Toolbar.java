package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.u {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final androidx.core.view.x G;
    public ArrayList H;
    public h I;
    public final ActionMenuView.e J;
    public d1 K;
    public ActionMenuPresenter L;
    public f M;
    public h.a N;
    public d.a O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final Runnable T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1045a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f1046b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f1047c;

    /* renamed from: d, reason: collision with root package name */
    public ImageButton f1048d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1049e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1050f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1051g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f1052h;

    /* renamed from: i, reason: collision with root package name */
    public View f1053i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1054j;

    /* renamed from: k, reason: collision with root package name */
    public int f1055k;

    /* renamed from: l, reason: collision with root package name */
    public int f1056l;

    /* renamed from: m, reason: collision with root package name */
    public int f1057m;

    /* renamed from: n, reason: collision with root package name */
    public int f1058n;

    /* renamed from: o, reason: collision with root package name */
    public int f1059o;

    /* renamed from: p, reason: collision with root package name */
    public int f1060p;

    /* renamed from: q, reason: collision with root package name */
    public int f1061q;

    /* renamed from: r, reason: collision with root package name */
    public int f1062r;

    /* renamed from: s, reason: collision with root package name */
    public int f1063s;

    /* renamed from: t, reason: collision with root package name */
    public s0 f1064t;

    /* renamed from: u, reason: collision with root package name */
    public int f1065u;

    /* renamed from: v, reason: collision with root package name */
    public int f1066v;

    /* renamed from: w, reason: collision with root package name */
    public int f1067w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1068x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1069y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1070z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    public class c implements d.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            d.a aVar = Toolbar.this.O;
            return aVar != null && aVar.a(dVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            if (!Toolbar.this.f1045a.H()) {
                Toolbar.this.G.i(dVar);
            }
            d.a aVar = Toolbar.this.O;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        @Nullable
        @DoNotInline
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        @DoNotInline
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.c1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @DoNotInline
        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.h {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f1077a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f1078b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.h
        public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.h
        public boolean c(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1052h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1052h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1052h);
            }
            Toolbar.this.f1053i = fVar.getActionView();
            this.f1078b = fVar;
            ViewParent parent2 = Toolbar.this.f1053i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1053i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f336a = (toolbar4.f1058n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f1080b = 2;
                toolbar4.f1053i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1053i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            fVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1053i;
            if (callback instanceof h.c) {
                ((h.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.h
        public void e(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.h
        public boolean f(androidx.appcompat.view.menu.k kVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h
        public Parcelable g() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.h
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.h
        public void h(boolean z10) {
            if (this.f1078b != null) {
                androidx.appcompat.view.menu.d dVar = this.f1077a;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1077a.getItem(i10) == this.f1078b) {
                            return;
                        }
                    }
                }
                j(this.f1077a, this.f1078b);
            }
        }

        @Override // androidx.appcompat.view.menu.h
        public boolean i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h
        public boolean j(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.f fVar) {
            KeyEvent.Callback callback = Toolbar.this.f1053i;
            if (callback instanceof h.c) {
                ((h.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1053i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1052h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1053i = null;
            toolbar3.a();
            this.f1078b = null;
            Toolbar.this.requestLayout();
            fVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.h
        public void k(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.f fVar;
            androidx.appcompat.view.menu.d dVar2 = this.f1077a;
            if (dVar2 != null && (fVar = this.f1078b) != null) {
                dVar2.f(fVar);
            }
            this.f1077a = dVar;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1045a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1045a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.T);
        post(this.T);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1080b != 2 && childAt != this.f1045a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1064t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.d dVar, ActionMenuPresenter actionMenuPresenter) {
        if (dVar == null && this.f1045a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.d dVarL = this.f1045a.L();
        if (dVarL == dVar) {
            return;
        }
        if (dVarL != null) {
            dVarL.R(this.L);
            dVarL.R(this.M);
        }
        if (this.M == null) {
            this.M = new f();
        }
        actionMenuPresenter.I(true);
        if (dVar != null) {
            dVar.c(actionMenuPresenter, this.f1054j);
            dVar.c(this.M, this.f1054j);
        } else {
            actionMenuPresenter.k(this.f1054j, null);
            this.M.k(this.f1054j, null);
            actionMenuPresenter.h(true);
            this.M.h(true);
        }
        this.f1045a.setPopupTheme(this.f1055k);
        this.f1045a.setPresenter(actionMenuPresenter);
        this.L = actionMenuPresenter;
        R();
    }

    public void L(h.a aVar, d.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.f1045a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1057m = i10;
        TextView textView = this.f1047c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1056l = i10;
        TextView textView = this.f1046b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean O() {
        if (!this.P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1045a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.S;
            if (z10 && this.R == null) {
                if (this.Q == null) {
                    this.Q = e.b(new Runnable() { // from class: androidx.appcompat.widget.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1096a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.Q);
                this.R = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView((View) this.E.get(size));
        }
        this.E.clear();
    }

    @Override // androidx.core.view.u
    public void addMenuProvider(androidx.core.view.z zVar) {
        this.G.c(zVar);
    }

    public final void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = androidx.core.view.r.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1080b == 0 && P(childAt) && p(gVar.f336a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1080b == 0 && P(childAt2) && p(gVar2.f336a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f1080b = 1;
        if (!z10 || this.f1053i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1045a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.M;
        androidx.appcompat.view.menu.f fVar2 = fVar == null ? null : fVar.f1078b;
        if (fVar2 != null) {
            fVar2.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1045a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f1052h == null) {
            n nVar = new n(getContext(), null, c.a.toolbarNavigationButtonStyle);
            this.f1052h = nVar;
            nVar.setImageDrawable(this.f1050f);
            this.f1052h.setContentDescription(this.f1051g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f336a = (this.f1058n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f1080b = 2;
            this.f1052h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1052h.setOnClickListener(new d());
        }
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1052h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1052h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.f1064t;
        if (s0Var != null) {
            return s0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1066v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.f1064t;
        if (s0Var != null) {
            return s0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.f1064t;
        if (s0Var != null) {
            return s0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.f1064t;
        if (s0Var != null) {
            return s0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1065u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.d dVarL;
        ActionMenuView actionMenuView = this.f1045a;
        return (actionMenuView == null || (dVarL = actionMenuView.L()) == null || !dVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1066v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1065u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1049e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1049e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1045a.getMenu();
    }

    @Nullable
    @VisibleForTesting
    public View getNavButtonView() {
        return this.f1048d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1048d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1048d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.L;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        j();
        return this.f1045a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1054j;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.f1055k;
    }

    public CharSequence getSubtitle() {
        return this.f1069y;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getSubtitleTextView() {
        return this.f1047c;
    }

    public CharSequence getTitle() {
        return this.f1068x;
    }

    public int getTitleMarginBottom() {
        return this.f1063s;
    }

    public int getTitleMarginEnd() {
        return this.f1061q;
    }

    public int getTitleMarginStart() {
        return this.f1060p;
    }

    public int getTitleMarginTop() {
        return this.f1062r;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getTitleTextView() {
        return this.f1046b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public e0 getWrapper() {
        if (this.K == null) {
            this.K = new d1(this, true);
        }
        return this.K;
    }

    public final void h() {
        if (this.f1064t == null) {
            this.f1064t = new s0();
        }
    }

    public final void i() {
        if (this.f1049e == null) {
            this.f1049e = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1045a.L() == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) this.f1045a.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.f1045a.setExpandedActionViewsExclusive(true);
            dVar.c(this.M, this.f1054j);
            R();
        }
    }

    public final void k() {
        if (this.f1045a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1045a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1055k);
            this.f1045a.setOnMenuItemClickListener(this.J);
            this.f1045a.M(this.N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f336a = (this.f1058n & 112) | 8388613;
            this.f1045a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1045a, false);
        }
    }

    public final void l() {
        if (this.f1048d == null) {
            this.f1048d = new n(getContext(), null, c.a.toolbarNavigationButtonStyle);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f336a = (this.f1058n & 112) | 8388611;
            this.f1048d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof ActionBar.a ? new g((ActionBar.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.F;
        boolean zB = k1.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f1048d)) {
            F(this.f1048d, i10, 0, i11, 0, this.f1059o);
            measuredWidth = this.f1048d.getMeasuredWidth() + s(this.f1048d);
            iMax = Math.max(0, this.f1048d.getMeasuredHeight() + t(this.f1048d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1048d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f1052h)) {
            F(this.f1052h, i10, 0, i11, 0, this.f1059o);
            measuredWidth = this.f1052h.getMeasuredWidth() + s(this.f1052h);
            iMax = Math.max(iMax, this.f1052h.getMeasuredHeight() + t(this.f1052h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1052h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f1045a)) {
            F(this.f1045a, i10, iMax3, i11, 0, this.f1059o);
            measuredWidth2 = this.f1045a.getMeasuredWidth() + s(this.f1045a);
            iMax = Math.max(iMax, this.f1045a.getMeasuredHeight() + t(this.f1045a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1045a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f1053i)) {
            iArr = iArr2;
            iMax4 += E(this.f1053i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1053i.getMeasuredHeight() + t(this.f1053i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1053i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f1049e)) {
            iMax4 += E(this.f1049e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1049e.getMeasuredHeight() + t(this.f1049e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1049e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f1080b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f1062r + this.f1063s;
        int i16 = this.f1060p + this.f1061q;
        if (P(this.f1046b)) {
            E(this.f1046b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f1046b.getMeasuredWidth() + s(this.f1046b);
            int measuredHeight2 = this.f1046b.getMeasuredHeight() + t(this.f1046b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1046b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f1047c)) {
            iMax2 = Math.max(iMax2, E(this.f1047c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f1047c.getMeasuredHeight() + t(this.f1047c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1047c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        ActionMenuView actionMenuView = this.f1045a;
        androidx.appcompat.view.menu.d dVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = savedState.f1071c;
        if (i10 != 0 && this.M != null && dVarL != null && (menuItemFindItem = dVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1072d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1064t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.f fVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar2 = this.M;
        if (fVar2 != null && (fVar = fVar2.f1078b) != null) {
            savedState.f1071c = fVar.getItemId();
        }
        savedState.f1072d = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = androidx.core.view.r.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f336a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1067w & 112;
    }

    @Override // androidx.core.view.u
    public void removeMenuProvider(androidx.core.view.z zVar) {
        this.G.j(zVar);
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            R();
        }
    }

    public void setCollapseContentDescription(@StringRes int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(@DrawableRes int i10) {
        setCollapseIcon(d.a.b(getContext(), i10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1066v) {
            this.f1066v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1065u) {
            this.f1065u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@DrawableRes int i10) {
        setLogo(d.a.b(getContext(), i10));
    }

    public void setLogoDescription(@StringRes int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(@StringRes int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(@DrawableRes int i10) {
        setNavigationIcon(d.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1048d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        j();
        this.f1045a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i10) {
        if (this.f1055k != i10) {
            this.f1055k = i10;
            if (i10 == 0) {
                this.f1054j = getContext();
            } else {
                this.f1054j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@StringRes int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(@ColorInt int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(@StringRes int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1063s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1061q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1060p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1062r = i10;
        requestLayout();
    }

    public void setTitleTextColor(@ColorInt int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        f fVar = this.M;
        return (fVar == null || fVar.f1078b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1045a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public static class g extends ActionBar.a {

        /* renamed from: b, reason: collision with root package name */
        public int f1080b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1080b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1080b = 0;
            this.f336a = 8388627;
        }

        public g(g gVar) {
            super((ActionBar.a) gVar);
            this.f1080b = 0;
            this.f1080b = gVar.f1080b;
        }

        public g(ActionBar.a aVar) {
            super(aVar);
            this.f1080b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1080b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1080b = 0;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.toolbarStyle);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1052h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1052h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1052h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1050f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1049e)) {
                c(this.f1049e, true);
            }
        } else {
            ImageView imageView = this.f1049e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1049e);
                this.E.remove(this.f1049e);
            }
        }
        ImageView imageView2 = this.f1049e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1049e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1048d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f1048d, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1048d)) {
                c(this.f1048d, true);
            }
        } else {
            ImageButton imageButton = this.f1048d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1048d);
                this.E.remove(this.f1048d);
            }
        }
        ImageButton imageButton2 = this.f1048d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1047c;
            if (textView != null && z(textView)) {
                removeView(this.f1047c);
                this.E.remove(this.f1047c);
            }
        } else {
            if (this.f1047c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1047c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1047c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1057m;
                if (i10 != 0) {
                    this.f1047c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1047c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1047c)) {
                c(this.f1047c, true);
            }
        }
        TextView textView2 = this.f1047c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1069y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1047c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1046b;
            if (textView != null && z(textView)) {
                removeView(this.f1046b);
                this.E.remove(this.f1046b);
            }
        } else {
            if (this.f1046b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1046b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1046b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1056l;
                if (i10 != 0) {
                    this.f1046b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1070z;
                if (colorStateList != null) {
                    this.f1046b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1046b)) {
                c(this.f1046b, true);
            }
        }
        TextView textView2 = this.f1046b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1068x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1070z = colorStateList;
        TextView textView = this.f1046b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f1071c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1072d;

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
            this.f1071c = parcel.readInt();
            this.f1072d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1071c);
            parcel.writeInt(this.f1072d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1067w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new androidx.core.view.x(new Runnable() { // from class: androidx.appcompat.widget.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f1098a.y();
            }
        });
        this.H = new ArrayList();
        this.J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = c.j.Toolbar;
        z0 z0VarV = z0.v(context2, attributeSet, iArr, i10, 0);
        ViewCompat.h0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        this.f1056l = z0VarV.n(c.j.Toolbar_titleTextAppearance, 0);
        this.f1057m = z0VarV.n(c.j.Toolbar_subtitleTextAppearance, 0);
        this.f1067w = z0VarV.l(c.j.Toolbar_android_gravity, this.f1067w);
        this.f1058n = z0VarV.l(c.j.Toolbar_buttonGravity, 48);
        int iE = z0VarV.e(c.j.Toolbar_titleMargin, 0);
        int i11 = c.j.Toolbar_titleMargins;
        iE = z0VarV.s(i11) ? z0VarV.e(i11, iE) : iE;
        this.f1063s = iE;
        this.f1062r = iE;
        this.f1061q = iE;
        this.f1060p = iE;
        int iE2 = z0VarV.e(c.j.Toolbar_titleMarginStart, -1);
        if (iE2 >= 0) {
            this.f1060p = iE2;
        }
        int iE3 = z0VarV.e(c.j.Toolbar_titleMarginEnd, -1);
        if (iE3 >= 0) {
            this.f1061q = iE3;
        }
        int iE4 = z0VarV.e(c.j.Toolbar_titleMarginTop, -1);
        if (iE4 >= 0) {
            this.f1062r = iE4;
        }
        int iE5 = z0VarV.e(c.j.Toolbar_titleMarginBottom, -1);
        if (iE5 >= 0) {
            this.f1063s = iE5;
        }
        this.f1059o = z0VarV.f(c.j.Toolbar_maxButtonHeight, -1);
        int iE6 = z0VarV.e(c.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iE7 = z0VarV.e(c.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iF = z0VarV.f(c.j.Toolbar_contentInsetLeft, 0);
        int iF2 = z0VarV.f(c.j.Toolbar_contentInsetRight, 0);
        h();
        this.f1064t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f1064t.g(iE6, iE7);
        }
        this.f1065u = z0VarV.e(c.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1066v = z0VarV.e(c.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1050f = z0VarV.g(c.j.Toolbar_collapseIcon);
        this.f1051g = z0VarV.p(c.j.Toolbar_collapseContentDescription);
        CharSequence charSequenceP = z0VarV.p(c.j.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = z0VarV.p(c.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f1054j = getContext();
        setPopupTheme(z0VarV.n(c.j.Toolbar_popupTheme, 0));
        Drawable drawableG = z0VarV.g(c.j.Toolbar_navigationIcon);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = z0VarV.p(c.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = z0VarV.g(c.j.Toolbar_logo);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = z0VarV.p(c.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = c.j.Toolbar_titleTextColor;
        if (z0VarV.s(i12)) {
            setTitleTextColor(z0VarV.c(i12));
        }
        int i13 = c.j.Toolbar_subtitleTextColor;
        if (z0VarV.s(i13)) {
            setSubtitleTextColor(z0VarV.c(i13));
        }
        int i14 = c.j.Toolbar_menu;
        if (z0VarV.s(i14)) {
            x(z0VarV.n(i14, 0));
        }
        z0VarV.x();
    }
}
