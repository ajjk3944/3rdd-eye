package androidx.appcompat.widget;

import A9.I;
import L0.C0781l;
import L0.InterfaceC0778i;
import L0.InterfaceC0783n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f2.RunnableC4331a;
import g.C4353a;
import h.AbstractC4397a;
import h.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import m.InterfaceC5305b;
import o.C5393k;
import o.InterfaceC5374B;
import o.P;
import o.X;
import o.a0;
import o.f0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0778i {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f14701A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f14702B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f14703C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14704D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList<View> f14705E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList<View> f14706F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f14707G;

    /* renamed from: H, reason: collision with root package name */
    public final C0781l f14708H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList<MenuItem> f14709I;

    /* renamed from: J, reason: collision with root package name */
    public h f14710J;

    /* renamed from: K, reason: collision with root package name */
    public final a f14711K;

    /* renamed from: L, reason: collision with root package name */
    public androidx.appcompat.widget.c f14712L;

    /* renamed from: M, reason: collision with root package name */
    public androidx.appcompat.widget.a f14713M;

    /* renamed from: N, reason: collision with root package name */
    public f f14714N;

    /* renamed from: O, reason: collision with root package name */
    public q.c f14715O;

    /* renamed from: P, reason: collision with root package name */
    public q.d f14716P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14717Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedCallback f14718R;

    /* renamed from: S, reason: collision with root package name */
    public OnBackInvokedDispatcher f14719S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f14720T;

    /* renamed from: U, reason: collision with root package name */
    public final b f14721U;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f14722b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f14723c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatTextView f14724d;

    /* renamed from: e, reason: collision with root package name */
    public C5393k f14725e;

    /* renamed from: f, reason: collision with root package name */
    public AppCompatImageView f14726f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f14727g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f14728h;
    public C5393k i;

    /* renamed from: j, reason: collision with root package name */
    public View f14729j;

    /* renamed from: k, reason: collision with root package name */
    public Context f14730k;

    /* renamed from: l, reason: collision with root package name */
    public int f14731l;

    /* renamed from: m, reason: collision with root package name */
    public int f14732m;

    /* renamed from: n, reason: collision with root package name */
    public int f14733n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14734o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14735p;

    /* renamed from: q, reason: collision with root package name */
    public int f14736q;

    /* renamed from: r, reason: collision with root package name */
    public int f14737r;

    /* renamed from: s, reason: collision with root package name */
    public int f14738s;

    /* renamed from: t, reason: collision with root package name */
    public int f14739t;

    /* renamed from: u, reason: collision with root package name */
    public P f14740u;

    /* renamed from: v, reason: collision with root package name */
    public int f14741v;

    /* renamed from: w, reason: collision with root package name */
    public int f14742w;

    /* renamed from: x, reason: collision with root package name */
    public final int f14743x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f14744y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f14745z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.u();
        }
    }

    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            q.d dVar = Toolbar.this.f14716P;
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.a aVar = toolbar.f14722b.f14580u;
            if (aVar == null || !aVar.k()) {
                Iterator<InterfaceC0783n> it = toolbar.f14708H.f3922b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            q.d dVar = toolbar.f14716P;
            if (dVar != null) {
                dVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.f14714N;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f14751c;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: o.Y
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static class g extends AbstractC4397a.C0461a {

        /* renamed from: b, reason: collision with root package name */
        public int f14753b;
    }

    public interface h {
    }

    public static class i extends U0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public int f14754d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14755e;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new i[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14754d = parcel.readInt();
            this.f14755e = parcel.readInt() != 0;
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14754d);
            parcel.writeInt(this.f14755e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
        return new m.f(getContext());
    }

    public static g h() {
        g gVar = new g(-2, -2);
        gVar.f14753b = 0;
        gVar.f37966a = 8388627;
        return gVar;
    }

    public static g i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.f14753b = 0;
            gVar2.f14753b = gVar.f14753b;
            return gVar2;
        }
        if (layoutParams instanceof AbstractC4397a.C0461a) {
            g gVar3 = new g((AbstractC4397a.C0461a) layoutParams);
            gVar3.f14753b = 0;
            return gVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            g gVar4 = new g(layoutParams);
            gVar4.f14753b = 0;
            return gVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        g gVar5 = new g(marginLayoutParams);
        gVar5.f14753b = 0;
        ((ViewGroup.MarginLayoutParams) gVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return gVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14753b == 0 && t(childAt)) {
                    int i12 = gVar.f37966a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f14753b == 0 && t(childAt2)) {
                int i14 = gVar2.f37966a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // L0.InterfaceC0778i
    public final void addMenuProvider(InterfaceC0783n interfaceC0783n) {
        C0781l c0781l = this.f14708H;
        c0781l.f3922b.add(interfaceC0783n);
        c0781l.f3921a.run();
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (g) layoutParams;
        gVarH.f14753b = 1;
        if (!z10 || this.f14729j == null) {
            addView(view, gVarH);
        } else {
            view.setLayoutParams(gVarH);
            this.f14706F.add(view);
        }
    }

    public final void c() {
        if (this.i == null) {
            C5393k c5393k = new C5393k(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = c5393k;
            c5393k.setImageDrawable(this.f14727g);
            this.i.setContentDescription(this.f14728h);
            g gVarH = h();
            gVarH.f37966a = (this.f14734o & 112) | 8388611;
            gVarH.f14753b = 2;
            this.i.setLayoutParams(gVarH);
            this.i.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.f14740u == null) {
            P p10 = new P();
            p10.f44581a = 0;
            p10.f44582b = 0;
            p10.f44583c = RecyclerView.UNDEFINED_DURATION;
            p10.f44584d = RecyclerView.UNDEFINED_DURATION;
            p10.f44585e = 0;
            p10.f44586f = 0;
            p10.f44587g = false;
            p10.f44588h = false;
            this.f14740u = p10;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f14722b;
        if (actionMenuView.f14576q == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f14714N == null) {
                this.f14714N = new f();
            }
            this.f14722b.setExpandedActionViewsExclusive(true);
            fVar.b(this.f14714N, this.f14730k);
            v();
        }
    }

    public final void f() {
        if (this.f14722b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f14722b = actionMenuView;
            actionMenuView.setPopupTheme(this.f14731l);
            this.f14722b.setOnMenuItemClickListener(this.f14711K);
            ActionMenuView actionMenuView2 = this.f14722b;
            q.c cVar = this.f14715O;
            c cVar2 = new c();
            actionMenuView2.f14581v = cVar;
            actionMenuView2.f14582w = cVar2;
            g gVarH = h();
            gVarH.f37966a = (this.f14734o & 112) | 8388613;
            this.f14722b.setLayoutParams(gVarH);
            b(this.f14722b, false);
        }
    }

    public final void g() {
        if (this.f14725e == null) {
            this.f14725e = new C5393k(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVarH = h();
            gVarH.f37966a = (this.f14734o & 112) | 8388611;
            this.f14725e.setLayoutParams(gVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C5393k c5393k = this.i;
        if (c5393k != null) {
            return c5393k.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C5393k c5393k = this.i;
        if (c5393k != null) {
            return c5393k.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P p10 = this.f14740u;
        if (p10 != null) {
            return p10.f44587g ? p10.f44581a : p10.f44582b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f14742w;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P p10 = this.f14740u;
        if (p10 != null) {
            return p10.f44581a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P p10 = this.f14740u;
        if (p10 != null) {
            return p10.f44582b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P p10 = this.f14740u;
        if (p10 != null) {
            return p10.f44587g ? p10.f44582b : p10.f44581a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f14741v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f14722b;
        return (actionMenuView == null || (fVar = actionMenuView.f14576q) == null || !fVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f14742w, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f14741v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f14726f;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f14726f;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f14722b.getMenu();
    }

    public View getNavButtonView() {
        return this.f14725e;
    }

    public CharSequence getNavigationContentDescription() {
        C5393k c5393k = this.f14725e;
        if (c5393k != null) {
            return c5393k.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C5393k c5393k = this.f14725e;
        if (c5393k != null) {
            return c5393k.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f14713M;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f14722b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f14730k;
    }

    public int getPopupTheme() {
        return this.f14731l;
    }

    public CharSequence getSubtitle() {
        return this.f14745z;
    }

    public final TextView getSubtitleTextView() {
        return this.f14724d;
    }

    public CharSequence getTitle() {
        return this.f14744y;
    }

    public int getTitleMarginBottom() {
        return this.f14739t;
    }

    public int getTitleMarginEnd() {
        return this.f14737r;
    }

    public int getTitleMarginStart() {
        return this.f14736q;
    }

    public int getTitleMarginTop() {
        return this.f14738s;
    }

    public final TextView getTitleTextView() {
        return this.f14723c;
    }

    public InterfaceC5374B getWrapper() {
        if (this.f14712L == null) {
            this.f14712L = new androidx.appcompat.widget.c(this, true);
        }
        return this.f14712L;
    }

    public final int j(int i10, View view) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = gVar.f37966a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f14743x & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void n() {
        Iterator<MenuItem> it = this.f14709I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0783n> it2 = this.f14708H.f3922b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f14709I = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f14706F.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f14721U);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14704D = false;
        }
        if (!this.f14704D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f14704D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f14704D = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8 A[LOOP:2: B:108:0x02c6->B:109:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0318 A[LOOP:3: B:117:0x0316->B:118:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        byte b10;
        byte b11;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z10 = f0.f44665a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            b11 = true;
            b10 = 0;
        } else {
            b10 = 1;
            b11 = false;
        }
        if (t(this.f14725e)) {
            s(this.f14725e, i10, 0, i11, this.f14735p);
            iK = k(this.f14725e) + this.f14725e.getMeasuredWidth();
            iMax = Math.max(0, l(this.f14725e) + this.f14725e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f14725e.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.i)) {
            s(this.i, i10, 0, i11, this.f14735p);
            iK = k(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b12 = b11;
        int[] iArr = this.f14707G;
        iArr[b12 == true ? 1 : 0] = iMax4;
        if (t(this.f14722b)) {
            s(this.f14722b, i10, iMax3, i11, this.f14735p);
            iK2 = k(this.f14722b) + this.f14722b.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f14722b) + this.f14722b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14722b.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b10] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f14729j)) {
            iMax5 += r(this.f14729j, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f14729j) + this.f14729j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14729j.getMeasuredState());
        }
        if (t(this.f14726f)) {
            iMax5 += r(this.f14726f, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f14726f) + this.f14726f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14726f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f14753b == 0 && t(childAt)) {
                iMax5 += r(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f14738s + this.f14739t;
        int i16 = this.f14736q + this.f14737r;
        if (t(this.f14723c)) {
            r(this.f14723c, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.f14723c) + this.f14723c.getMeasuredWidth();
            iL = l(this.f14723c) + this.f14723c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f14723c.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f14724d)) {
            iMax2 = Math.max(iMax2, r(this.f14724d, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.f14724d) + this.f14724d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f14724d.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f14717Q) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f12348b);
        ActionMenuView actionMenuView = this.f14722b;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.f14576q : null;
        int i10 = iVar.f14754d;
        if (i10 != 0 && this.f14714N != null && fVar != null && (menuItemFindItem = fVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f14755e) {
            b bVar = this.f14721U;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        P p10 = this.f14740u;
        boolean z10 = i10 == 1;
        if (z10 == p10.f44587g) {
            return;
        }
        p10.f44587g = z10;
        if (!p10.f44588h) {
            p10.f44581a = p10.f44585e;
            p10.f44582b = p10.f44586f;
            return;
        }
        if (z10) {
            int i11 = p10.f44584d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = p10.f44585e;
            }
            p10.f44581a = i11;
            int i12 = p10.f44583c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = p10.f44586f;
            }
            p10.f44582b = i12;
            return;
        }
        int i13 = p10.f44583c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = p10.f44585e;
        }
        p10.f44581a = i13;
        int i14 = p10.f44584d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = p10.f44586f;
        }
        p10.f44582b = i14;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.a aVar;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f14714N;
        if (fVar != null && (hVar = fVar.f14751c) != null) {
            iVar.f14754d = hVar.f14460a;
        }
        ActionMenuView actionMenuView = this.f14722b;
        iVar.f14755e = (actionMenuView == null || (aVar = actionMenuView.f14580u) == null || !aVar.k()) ? false : true;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14703C = false;
        }
        if (!this.f14703C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f14703C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f14703C = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int r(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // L0.InterfaceC0778i
    public final void removeMenuProvider(InterfaceC0783n interfaceC0783n) {
        this.f14708H.a(interfaceC0783n);
    }

    public final void s(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f14720T != z10) {
            this.f14720T = z10;
            v();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(I.w(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f14717Q = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f14742w) {
            this.f14742w = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f14741v) {
            this.f14741v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(I.w(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(I.w(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f14725e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f14710J = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f14722b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f14731l != i10) {
            this.f14731l = i10;
            if (i10 == 0) {
                this.f14730k = getContext();
            } else {
                this.f14730k = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f14739t = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f14737r = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f14736q = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f14738s = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f14722b;
        return (actionMenuView == null || (aVar = actionMenuView.f14580u) == null || !aVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            f fVar = this.f14714N;
            boolean z10 = (fVar == null || fVar.f14751c == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f14720T) ? false : true;
            if (z10 && this.f14719S == null) {
                if (this.f14718R == null) {
                    this.f14718R = e.b(new RunnableC4331a(this, 4));
                }
                e.c(onBackInvokedDispatcherA, this.f14718R);
                this.f14719S = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f14719S) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f14718R);
            this.f14719S = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f14743x = 8388627;
        this.f14705E = new ArrayList<>();
        this.f14706F = new ArrayList<>();
        this.f14707G = new int[2];
        this.f14708H = new C0781l(new C8.a(this, 21));
        this.f14709I = new ArrayList<>();
        this.f14711K = new a();
        this.f14721U = new b();
        Context context2 = getContext();
        int[] iArr = C4353a.f37898x;
        X xE = X.e(context2, attributeSet, iArr, R.attr.toolbarStyle);
        L0.I.n(this, context, iArr, attributeSet, xE.f44608b, R.attr.toolbarStyle);
        TypedArray typedArray = xE.f44608b;
        this.f14732m = typedArray.getResourceId(28, 0);
        this.f14733n = typedArray.getResourceId(19, 0);
        this.f14743x = typedArray.getInteger(0, 8388627);
        this.f14734o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f14739t = dimensionPixelOffset;
        this.f14738s = dimensionPixelOffset;
        this.f14737r = dimensionPixelOffset;
        this.f14736q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f14736q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f14737r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f14738s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f14739t = dimensionPixelOffset5;
        }
        this.f14735p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P p10 = this.f14740u;
        p10.f44588h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p10.f44585e = dimensionPixelSize;
            p10.f44581a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p10.f44586f = dimensionPixelSize2;
            p10.f44582b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p10.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f14741v = typedArray.getDimensionPixelOffset(10, RecyclerView.UNDEFINED_DURATION);
        this.f14742w = typedArray.getDimensionPixelOffset(6, RecyclerView.UNDEFINED_DURATION);
        this.f14727g = xE.b(4);
        this.f14728h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f14730k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableB = xE.b(16);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = xE.b(11);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(xE.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(xE.a(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        xE.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f37966a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37877b);
        gVar.f37966a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.f14753b = 0;
        return gVar;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C5393k c5393k = this.i;
        if (c5393k != null) {
            c5393k.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
        } else {
            C5393k c5393k = this.i;
            if (c5393k != null) {
                c5393k.setImageDrawable(this.f14727g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f14726f == null) {
                this.f14726f = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f14726f)) {
                b(this.f14726f, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f14726f;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f14726f);
                this.f14706F.remove(this.f14726f);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f14726f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f14726f == null) {
            this.f14726f = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f14726f;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C5393k c5393k = this.f14725e;
        if (c5393k != null) {
            c5393k.setContentDescription(charSequence);
            a0.a(this.f14725e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f14725e)) {
                b(this.f14725e, true);
            }
        } else {
            C5393k c5393k = this.f14725e;
            if (c5393k != null && o(c5393k)) {
                removeView(this.f14725e);
                this.f14706F.remove(this.f14725e);
            }
        }
        C5393k c5393k2 = this.f14725e;
        if (c5393k2 != null) {
            c5393k2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f14724d;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f14724d);
                this.f14706F.remove(this.f14724d);
            }
        } else {
            if (this.f14724d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f14724d = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f14724d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f14733n;
                if (i10 != 0) {
                    this.f14724d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f14702B;
                if (colorStateList != null) {
                    this.f14724d.setTextColor(colorStateList);
                }
            }
            if (!o(this.f14724d)) {
                b(this.f14724d, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f14724d;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f14745z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f14702B = colorStateList;
        AppCompatTextView appCompatTextView = this.f14724d;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f14723c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f14723c);
                this.f14706F.remove(this.f14723c);
            }
        } else {
            if (this.f14723c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f14723c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f14723c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f14732m;
                if (i10 != 0) {
                    this.f14723c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f14701A;
                if (colorStateList != null) {
                    this.f14723c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f14723c)) {
                b(this.f14723c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f14723c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f14744y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f14701A = colorStateList;
        AppCompatTextView appCompatTextView = this.f14723c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public class f implements j {

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f14750b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f14751c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f14729j;
            if (callback instanceof InterfaceC5305b) {
                ((InterfaceC5305b) callback).c();
            }
            toolbar.removeView(toolbar.f14729j);
            toolbar.removeView(toolbar.i);
            toolbar.f14729j = null;
            ArrayList<View> arrayList = toolbar.f14706F;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.f14751c = null;
            toolbar.requestLayout();
            hVar.f14459C = false;
            hVar.f14472n.p(false);
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void f(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f14750b;
            if (fVar2 != null && (hVar = this.f14751c) != null) {
                fVar2.d(hVar);
            }
            this.f14750b = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void g() {
            if (this.f14751c != null) {
                androidx.appcompat.view.menu.f fVar = this.f14750b;
                if (fVar != null) {
                    int size = fVar.f14436f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f14750b.getItem(i) == this.f14751c) {
                            return;
                        }
                    }
                }
                e(this.f14751c);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean i(m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean j(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.i.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                toolbar.addView(toolbar.i);
            }
            View actionView = hVar.getActionView();
            toolbar.f14729j = actionView;
            this.f14751c = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f14729j);
                }
                g gVarH = Toolbar.h();
                gVarH.f37966a = (toolbar.f14734o & 112) | 8388611;
                gVarH.f14753b = 2;
                toolbar.f14729j.setLayoutParams(gVarH);
                toolbar.addView(toolbar.f14729j);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f14753b != 2 && childAt != toolbar.f14722b) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f14706F.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.f14459C = true;
            hVar.f14472n.p(false);
            KeyEvent.Callback callback = toolbar.f14729j;
            if (callback instanceof InterfaceC5305b) {
                ((InterfaceC5305b) callback).b();
            }
            toolbar.v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }
    }
}
