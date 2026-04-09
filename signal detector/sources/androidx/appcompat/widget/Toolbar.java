package androidx.appcompat.widget;

import A3.o;
import P.g;
import R.O;
import U0.j;
import V2.e;
import a4.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import d5.y;
import g.AbstractC2327a;
import h0.C2352b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.D;
import m.h;
import n.MenuC2677k;
import n.m;
import n1.RunnableC2683a;
import o.C2723l;
import o.C2742v;
import o.InterfaceC2714g0;
import o.K0;
import o.a1;
import o.b1;
import o.c1;
import o.d1;
import o.e1;
import o.f1;
import o.g1;
import o.i1;
import o.q1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: C, reason: collision with root package name */
    public final int f4985C;

    /* renamed from: D, reason: collision with root package name */
    public int f4986D;

    /* renamed from: E, reason: collision with root package name */
    public int f4987E;

    /* renamed from: F, reason: collision with root package name */
    public int f4988F;

    /* renamed from: G, reason: collision with root package name */
    public int f4989G;

    /* renamed from: H, reason: collision with root package name */
    public K0 f4990H;

    /* renamed from: I, reason: collision with root package name */
    public int f4991I;

    /* renamed from: J, reason: collision with root package name */
    public int f4992J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4993K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f4994L;
    public CharSequence M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f4995N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f4996O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4997P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4998Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f4999R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f5000S;

    /* renamed from: T, reason: collision with root package name */
    public final int[] f5001T;

    /* renamed from: U, reason: collision with root package name */
    public final e f5002U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f5003V;

    /* renamed from: W, reason: collision with root package name */
    public f1 f5004W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f5005a;

    /* renamed from: a0, reason: collision with root package name */
    public final C2352b f5006a0;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f5007b;
    public i1 b0;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f5008c;

    /* renamed from: c0, reason: collision with root package name */
    public C2723l f5009c0;

    /* renamed from: d, reason: collision with root package name */
    public C2742v f5010d;

    /* renamed from: d0, reason: collision with root package name */
    public d1 f5011d0;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f5012e;

    /* renamed from: e0, reason: collision with root package name */
    public g f5013e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f5014f;

    /* renamed from: f0, reason: collision with root package name */
    public j f5015f0;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f5016g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5017g0;

    /* renamed from: h, reason: collision with root package name */
    public C2742v f5018h;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f5019h0;
    public View i;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedDispatcher f5020i0;

    /* renamed from: j, reason: collision with root package name */
    public Context f5021j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f5022j0;

    /* renamed from: k, reason: collision with root package name */
    public int f5023k;

    /* renamed from: k0, reason: collision with root package name */
    public final RunnableC2683a f5024k0;

    /* renamed from: l, reason: collision with root package name */
    public int f5025l;

    /* renamed from: m, reason: collision with root package name */
    public int f5026m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5027n;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static e1 h() {
        e1 e1Var = new e1(-2, -2);
        e1Var.f22506b = 0;
        e1Var.f22505a = 8388627;
        return e1Var;
    }

    public static e1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof e1;
        if (z6) {
            e1 e1Var = (e1) layoutParams;
            e1 e1Var2 = new e1(e1Var);
            e1Var2.f22506b = 0;
            e1Var2.f22506b = e1Var.f22506b;
            return e1Var2;
        }
        if (z6) {
            e1 e1Var3 = new e1((e1) layoutParams);
            e1Var3.f22506b = 0;
            return e1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e1 e1Var4 = new e1(layoutParams);
            e1Var4.f22506b = 0;
            return e1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e1 e1Var5 = new e1(marginLayoutParams);
        e1Var5.f22506b = 0;
        ((ViewGroup.MarginLayoutParams) e1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e1 e1Var = (e1) childAt.getLayoutParams();
                if (e1Var.f22506b == 0 && t(childAt)) {
                    int i6 = e1Var.f22505a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
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
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            e1 e1Var2 = (e1) childAt2.getLayoutParams();
            if (e1Var2.f22506b == 0 && t(childAt2)) {
                int i8 = e1Var2.f22505a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e1 e1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        e1VarH.f22506b = 1;
        if (!z6 || this.i == null) {
            addView(view, e1VarH);
        } else {
            view.setLayoutParams(e1VarH);
            this.f5000S.add(view);
        }
    }

    public final void c() {
        if (this.f5018h == null) {
            C2742v c2742v = new C2742v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f5018h = c2742v;
            c2742v.setImageDrawable(this.f5014f);
            this.f5018h.setContentDescription(this.f5016g);
            e1 e1VarH = h();
            e1VarH.f22505a = (this.f5027n & 112) | 8388611;
            e1VarH.f22506b = 2;
            this.f5018h.setLayoutParams(e1VarH);
            this.f5018h.setOnClickListener(new o(6, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f4990H == null) {
            K0 k02 = new K0();
            k02.f22399a = 0;
            k02.f22400b = 0;
            k02.f22401c = LinearLayoutManager.INVALID_OFFSET;
            k02.f22402d = LinearLayoutManager.INVALID_OFFSET;
            k02.f22403e = 0;
            k02.f22404f = 0;
            k02.f22405g = false;
            k02.f22406h = false;
            this.f4990H = k02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f5005a;
        if (actionMenuView.f4844D == null) {
            MenuC2677k menuC2677k = (MenuC2677k) actionMenuView.getMenu();
            if (this.f5011d0 == null) {
                this.f5011d0 = new d1(this);
            }
            this.f5005a.setExpandedActionViewsExclusive(true);
            menuC2677k.b(this.f5011d0, this.f5021j);
            v();
        }
    }

    public final void f() {
        if (this.f5005a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f5005a = actionMenuView;
            actionMenuView.setPopupTheme(this.f5023k);
            this.f5005a.setOnMenuItemClickListener(this.f5006a0);
            ActionMenuView actionMenuView2 = this.f5005a;
            g gVar = this.f5013e0;
            d4.h hVar = new d4.h(11, this);
            actionMenuView2.f4849I = gVar;
            actionMenuView2.f4850J = hVar;
            e1 e1VarH = h();
            e1VarH.f22505a = (this.f5027n & 112) | 8388613;
            this.f5005a.setLayoutParams(e1VarH);
            b(this.f5005a, false);
        }
    }

    public final void g() {
        if (this.f5010d == null) {
            this.f5010d = new C2742v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 e1VarH = h();
            e1VarH.f22505a = (this.f5027n & 112) | 8388611;
            this.f5010d.setLayoutParams(e1VarH);
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
        C2742v c2742v = this.f5018h;
        if (c2742v != null) {
            return c2742v.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2742v c2742v = this.f5018h;
        if (c2742v != null) {
            return c2742v.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k02 = this.f4990H;
        if (k02 != null) {
            return k02.f22405g ? k02.f22399a : k02.f22400b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4992J;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k02 = this.f4990H;
        if (k02 != null) {
            return k02.f22399a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k02 = this.f4990H;
        if (k02 != null) {
            return k02.f22400b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k02 = this.f4990H;
        if (k02 != null) {
            return k02.f22405g ? k02.f22400b : k02.f22399a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4991I;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC2677k menuC2677k;
        ActionMenuView actionMenuView = this.f5005a;
        return (actionMenuView == null || (menuC2677k = actionMenuView.f4844D) == null || !menuC2677k.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4992J, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4991I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f5012e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f5012e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f5005a.getMenu();
    }

    public View getNavButtonView() {
        return this.f5010d;
    }

    public CharSequence getNavigationContentDescription() {
        C2742v c2742v = this.f5010d;
        if (c2742v != null) {
            return c2742v.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2742v c2742v = this.f5010d;
        if (c2742v != null) {
            return c2742v.getDrawable();
        }
        return null;
    }

    public C2723l getOuterActionMenuPresenter() {
        return this.f5009c0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f5005a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f5021j;
    }

    public int getPopupTheme() {
        return this.f5023k;
    }

    public CharSequence getSubtitle() {
        return this.M;
    }

    public final TextView getSubtitleTextView() {
        return this.f5008c;
    }

    public CharSequence getTitle() {
        return this.f4994L;
    }

    public int getTitleMarginBottom() {
        return this.f4989G;
    }

    public int getTitleMarginEnd() {
        return this.f4987E;
    }

    public int getTitleMarginStart() {
        return this.f4986D;
    }

    public int getTitleMarginTop() {
        return this.f4988F;
    }

    public final TextView getTitleTextView() {
        return this.f5007b;
    }

    public InterfaceC2714g0 getWrapper() {
        if (this.b0 == null) {
            this.b0 = new i1(this, true);
        }
        return this.b0;
    }

    public final int j(int i, View view) {
        e1 e1Var = (e1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i6 = e1Var.f22505a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4993K & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i3;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (iMax < i7) {
            iMax = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
            if (i8 < i9) {
                iMax = Math.max(0, iMax - (i9 - i8));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.f5003V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f5002U.f3869c).iterator();
        while (it.hasNext()) {
            ((D) it.next()).f21478a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5003V = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f5000S.contains(view);
    }

    public final boolean o() {
        C2723l c2723l;
        ActionMenuView actionMenuView = this.f5005a;
        return (actionMenuView == null || (c2723l = actionMenuView.f4848H) == null || !c2723l.i()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5024k0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4998Q = false;
        }
        if (!this.f4998Q) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4998Q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4998Q = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
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
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        byte b5;
        byte b6;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = q1.f22618a;
        int i6 = 0;
        if (getLayoutDirection() == 1) {
            b6 = true;
            b5 = 0;
        } else {
            b5 = 1;
            b6 = false;
        }
        if (t(this.f5010d)) {
            s(this.f5010d, i, 0, i3, this.f4985C);
            iK = k(this.f5010d) + this.f5010d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f5010d) + this.f5010d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5010d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f5018h)) {
            s(this.f5018h, i, 0, i3, this.f4985C);
            iK = k(this.f5018h) + this.f5018h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5018h) + this.f5018h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5018h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b7 = b6;
        int[] iArr = this.f5001T;
        iArr[b7 == true ? 1 : 0] = iMax4;
        if (t(this.f5005a)) {
            s(this.f5005a, i, iMax3, i3, this.f4985C);
            iK2 = k(this.f5005a) + this.f5005a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5005a) + this.f5005a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5005a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b5] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.i)) {
            iMax5 += r(this.i, i, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (t(this.f5012e)) {
            iMax5 += r(this.f5012e, i, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f5012e) + this.f5012e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5012e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((e1) childAt.getLayoutParams()).f22506b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i8 = iMax5;
        int i9 = this.f4988F + this.f4989G;
        int i10 = this.f4986D + this.f4987E;
        if (t(this.f5007b)) {
            r(this.f5007b, i, i8 + i10, i3, i9, iArr);
            int iK3 = k(this.f5007b) + this.f5007b.getMeasuredWidth();
            iL = l(this.f5007b) + this.f5007b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5007b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f5008c)) {
            iMax2 = Math.max(iMax2, r(this.f5008c, i, i8 + i10, i3, i9 + iL, iArr));
            iL += l(this.f5008c) + this.f5008c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5008c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i8 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f5017g0) {
            i6 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i6 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g1 g1Var = (g1) parcelable;
        super.onRestoreInstanceState(g1Var.f3954a);
        ActionMenuView actionMenuView = this.f5005a;
        MenuC2677k menuC2677k = actionMenuView != null ? actionMenuView.f4844D : null;
        int i = g1Var.f22509c;
        if (i != 0 && this.f5011d0 != null && menuC2677k != null && (menuItemFindItem = menuC2677k.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (g1Var.f22510d) {
            RunnableC2683a runnableC2683a = this.f5024k0;
            removeCallbacks(runnableC2683a);
            post(runnableC2683a);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        K0 k02 = this.f4990H;
        boolean z6 = i == 1;
        if (z6 == k02.f22405g) {
            return;
        }
        k02.f22405g = z6;
        if (!k02.f22406h) {
            k02.f22399a = k02.f22403e;
            k02.f22400b = k02.f22404f;
            return;
        }
        if (z6) {
            int i3 = k02.f22402d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = k02.f22403e;
            }
            k02.f22399a = i3;
            int i6 = k02.f22401c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = k02.f22404f;
            }
            k02.f22400b = i6;
            return;
        }
        int i7 = k02.f22401c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = k02.f22403e;
        }
        k02.f22399a = i7;
        int i8 = k02.f22402d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = k02.f22404f;
        }
        k02.f22400b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m mVar;
        g1 g1Var = new g1(super.onSaveInstanceState());
        d1 d1Var = this.f5011d0;
        if (d1Var != null && (mVar = d1Var.f22503b) != null) {
            g1Var.f22509c = mVar.f22106a;
        }
        g1Var.f22510d = o();
        return g1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4997P = false;
        }
        if (!this.f4997P) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4997P = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4997P = false;
        return true;
    }

    public final int p(View view, int i, int i3, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i6) + i;
        iArr[0] = Math.max(0, -i6);
        int iJ = j(i3, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + iMax;
    }

    public final int q(View view, int i, int i3, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iJ = j(i3, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
    }

    public final int r(View view, int i, int i3, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f5022j0 != z6) {
            this.f5022j0 = z6;
            v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(t.i(getContext(), i));
    }

    public void setCollapsible(boolean z6) {
        this.f5017g0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i != this.f4992J) {
            this.f4992J = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i != this.f4991I) {
            this.f4991I = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(t.i(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(t.i(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f5010d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
        this.f5004W = f1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f5005a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f5023k != i) {
            this.f5023k = i;
            if (i == 0) {
                this.f5021j = getContext();
            } else {
                this.f5021j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f4989G = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f4987E = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4986D = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4988F = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        C2723l c2723l;
        ActionMenuView actionMenuView = this.f5005a;
        return (actionMenuView == null || (c2723l = actionMenuView.f4848H) == null || !c2723l.n()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c1.a(this);
            d1 d1Var = this.f5011d0;
            boolean z6 = (d1Var == null || d1Var.f22503b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f5022j0) ? false : true;
            if (z6 && this.f5020i0 == null) {
                if (this.f5019h0 == null) {
                    this.f5019h0 = c1.b(new b1(this, 0));
                }
                c1.c(onBackInvokedDispatcherA, this.f5019h0);
                this.f5020i0 = onBackInvokedDispatcherA;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f5020i0) == null) {
                return;
            }
            c1.d(onBackInvokedDispatcher, this.f5019h0);
            this.f5020i0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4993K = 8388627;
        this.f4999R = new ArrayList();
        this.f5000S = new ArrayList();
        this.f5001T = new int[2];
        this.f5002U = new e(new b1(this, 1));
        this.f5003V = new ArrayList();
        this.f5006a0 = new C2352b(8, this);
        this.f5024k0 = new RunnableC2683a(2, this);
        Context context2 = getContext();
        int[] iArr = AbstractC2327a.f20138z;
        a1 a1VarI = a1.i(context2, attributeSet, iArr, R.attr.toolbarStyle);
        O.l(this, context, iArr, attributeSet, (TypedArray) a1VarI.f22480c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        this.f5025l = typedArray.getResourceId(28, 0);
        this.f5026m = typedArray.getResourceId(19, 0);
        this.f4993K = typedArray.getInteger(0, 8388627);
        this.f5027n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4989G = dimensionPixelOffset;
        this.f4988F = dimensionPixelOffset;
        this.f4987E = dimensionPixelOffset;
        this.f4986D = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4986D = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4987E = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4988F = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4989G = dimensionPixelOffset5;
        }
        this.f4985C = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k02 = this.f4990H;
        k02.f22406h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k02.f22403e = dimensionPixelSize;
            k02.f22399a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k02.f22404f = dimensionPixelSize2;
            k02.f22400b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4991I = typedArray.getDimensionPixelOffset(10, LinearLayoutManager.INVALID_OFFSET);
        this.f4992J = typedArray.getDimensionPixelOffset(6, LinearLayoutManager.INVALID_OFFSET);
        this.f5014f = a1VarI.d(4);
        this.f5016g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f5021j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableD = a1VarI.d(16);
        if (drawableD != null) {
            setNavigationIcon(drawableD);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableD2 = a1VarI.d(11);
        if (drawableD2 != null) {
            setLogo(drawableD2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(a1VarI.c(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(a1VarI.c(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        a1VarI.j();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f22505a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20115b);
        e1Var.f22505a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        e1Var.f22506b = 0;
        return e1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C2742v c2742v = this.f5018h;
        if (c2742v != null) {
            c2742v.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f5018h.setImageDrawable(drawable);
        } else {
            C2742v c2742v = this.f5018h;
            if (c2742v != null) {
                c2742v.setImageDrawable(this.f5014f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5012e == null) {
                this.f5012e = new AppCompatImageView(getContext(), null);
            }
            if (!n(this.f5012e)) {
                b(this.f5012e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f5012e;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.f5012e);
                this.f5000S.remove(this.f5012e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f5012e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5012e == null) {
            this.f5012e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f5012e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C2742v c2742v = this.f5010d;
        if (c2742v != null) {
            c2742v.setContentDescription(charSequence);
            y.r(this.f5010d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f5010d)) {
                b(this.f5010d, true);
            }
        } else {
            C2742v c2742v = this.f5010d;
            if (c2742v != null && n(c2742v)) {
                removeView(this.f5010d);
                this.f5000S.remove(this.f5010d);
            }
        }
        C2742v c2742v2 = this.f5010d;
        if (c2742v2 != null) {
            c2742v2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5008c;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f5008c);
                this.f5000S.remove(this.f5008c);
            }
        } else {
            if (this.f5008c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f5008c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5008c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5026m;
                if (i != 0) {
                    this.f5008c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4996O;
                if (colorStateList != null) {
                    this.f5008c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f5008c)) {
                b(this.f5008c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5008c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4996O = colorStateList;
        AppCompatTextView appCompatTextView = this.f5008c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f5007b;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f5007b);
                this.f5000S.remove(this.f5007b);
            }
        } else {
            if (this.f5007b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f5007b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f5007b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5025l;
                if (i != 0) {
                    this.f5007b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4995N;
                if (colorStateList != null) {
                    this.f5007b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f5007b)) {
                b(this.f5007b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f5007b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f4994L = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4995N = colorStateList;
        AppCompatTextView appCompatTextView = this.f5007b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
