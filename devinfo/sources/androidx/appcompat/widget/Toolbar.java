package androidx.appcompat.widget;

import a4.d;
import aa.j;
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
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.liuzh.deviceinfo.R;
import e4.n;
import e4.v0;
import i0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jm.a;
import n.h;
import nm.d0;
import o.m;
import o.o;
import o7.c;
import p.f1;
import p.g3;
import p.h3;
import p.i3;
import p.j3;
import p.k;
import p.k3;
import p.l3;
import p.m2;
import p.n3;
import p.o1;
import p.v;
import p.v3;
import p.w;
import pd.b;
import yb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final e G;
    public ArrayList H;
    public k3 I;
    public final d0 J;
    public n3 K;
    public k L;
    public i3 M;
    public d N;
    public c O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final o1 T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f818a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f819b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f820c;

    /* renamed from: d, reason: collision with root package name */
    public v f821d;

    /* renamed from: e, reason: collision with root package name */
    public w f822e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f823f;
    public final CharSequence g;

    /* renamed from: h, reason: collision with root package name */
    public v f824h;

    /* renamed from: i, reason: collision with root package name */
    public View f825i;
    public Context j;

    /* renamed from: k, reason: collision with root package name */
    public int f826k;

    /* renamed from: l, reason: collision with root package name */
    public int f827l;

    /* renamed from: m, reason: collision with root package name */
    public int f828m;

    /* renamed from: n, reason: collision with root package name */
    public final int f829n;

    /* renamed from: o, reason: collision with root package name */
    public final int f830o;

    /* renamed from: p, reason: collision with root package name */
    public int f831p;

    /* renamed from: q, reason: collision with root package name */
    public int f832q;

    /* renamed from: r, reason: collision with root package name */
    public int f833r;

    /* renamed from: s, reason: collision with root package name */
    public int f834s;

    /* renamed from: t, reason: collision with root package name */
    public m2 f835t;

    /* renamed from: u, reason: collision with root package name */
    public int f836u;

    /* renamed from: v, reason: collision with root package name */
    public int f837v;

    /* renamed from: w, reason: collision with root package name */
    public final int f838w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f839x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f840y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f841z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static j3 h() {
        j3 j3Var = new j3(-2, -2);
        j3Var.f30724b = 0;
        j3Var.f30723a = 8388627;
        return j3Var;
    }

    public static j3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof j3;
        if (z3) {
            j3 j3Var = (j3) layoutParams;
            j3 j3Var2 = new j3(j3Var);
            j3Var2.f30724b = 0;
            j3Var2.f30724b = j3Var.f30724b;
            return j3Var2;
        }
        if (z3) {
            j3 j3Var3 = new j3((j3) layoutParams);
            j3Var3.f30724b = 0;
            return j3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            j3 j3Var4 = new j3(layoutParams);
            j3Var4.f30724b = 0;
            return j3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        j3 j3Var5 = new j3(marginLayoutParams);
        j3Var5.f30724b = 0;
        ((ViewGroup.MarginLayoutParams) j3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) j3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) j3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) j3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return j3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                j3 j3Var = (j3) childAt.getLayoutParams();
                if (j3Var.f30724b == 0 && t(childAt)) {
                    int i11 = j3Var.f30723a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
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
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            j3 j3Var2 = (j3) childAt2.getLayoutParams();
            if (j3Var2.f30724b == 0 && t(childAt2)) {
                int i13 = j3Var2.f30723a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        j3 j3VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (j3) layoutParams;
        j3VarH.f30724b = 1;
        if (!z3 || this.f825i == null) {
            addView(view, j3VarH);
        } else {
            view.setLayoutParams(j3VarH);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f824h == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f824h = vVar;
            vVar.setImageDrawable(this.f823f);
            this.f824h.setContentDescription(this.g);
            j3 j3VarH = h();
            j3VarH.f30723a = (this.f829n & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8388611;
            j3VarH.f30724b = 2;
            this.f824h.setLayoutParams(j3VarH);
            this.f824h.setOnClickListener(new j(8, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof j3);
    }

    public final void d() {
        if (this.f835t == null) {
            m2 m2Var = new m2();
            m2Var.f30769a = 0;
            m2Var.f30770b = 0;
            m2Var.f30771c = LinearLayoutManager.INVALID_OFFSET;
            m2Var.f30772d = LinearLayoutManager.INVALID_OFFSET;
            m2Var.f30773e = 0;
            m2Var.f30774f = 0;
            m2Var.g = false;
            m2Var.f30775h = false;
            this.f835t = m2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f818a;
        if (actionMenuView.f745p == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new i3(this);
            }
            this.f818a.setExpandedActionViewsExclusive(true);
            mVar.b(this.M, this.j);
            v();
        }
    }

    public final void f() {
        if (this.f818a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f818a = actionMenuView;
            actionMenuView.setPopupTheme(this.f826k);
            this.f818a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f818a;
            d dVar = this.N;
            o.e eVar = new o.e(2, this);
            actionMenuView2.f750u = dVar;
            actionMenuView2.f751v = eVar;
            j3 j3VarH = h();
            j3VarH.f30723a = (this.f829n & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8388613;
            this.f818a.setLayoutParams(j3VarH);
            b(this.f818a, false);
        }
    }

    public final void g() {
        if (this.f821d == null) {
            this.f821d = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            j3 j3VarH = h();
            j3VarH.f30723a = (this.f829n & AppLovinMediationAdapter.ERROR_CHILD_USER) | 8388611;
            this.f821d.setLayoutParams(j3VarH);
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
        v vVar = this.f824h;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.f824h;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m2 m2Var = this.f835t;
        if (m2Var != null) {
            return m2Var.g ? m2Var.f30769a : m2Var.f30770b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f837v;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m2 m2Var = this.f835t;
        if (m2Var != null) {
            return m2Var.f30769a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        m2 m2Var = this.f835t;
        if (m2Var != null) {
            return m2Var.f30770b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        m2 m2Var = this.f835t;
        if (m2Var != null) {
            return m2Var.g ? m2Var.f30770b : m2Var.f30769a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f836u;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f818a;
        return (actionMenuView == null || (mVar = actionMenuView.f745p) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f837v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f836u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.f822e;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.f822e;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f818a.getMenu();
    }

    public View getNavButtonView() {
        return this.f821d;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.f821d;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.f821d;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public k getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f818a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.f826k;
    }

    public CharSequence getSubtitle() {
        return this.f840y;
    }

    public final TextView getSubtitleTextView() {
        return this.f820c;
    }

    public CharSequence getTitle() {
        return this.f839x;
    }

    public int getTitleMarginBottom() {
        return this.f834s;
    }

    public int getTitleMarginEnd() {
        return this.f832q;
    }

    public int getTitleMarginStart() {
        return this.f831p;
    }

    public int getTitleMarginTop() {
        return this.f833r;
    }

    public final TextView getTitleTextView() {
        return this.f819b;
    }

    public f1 getWrapper() {
        if (this.K == null) {
            this.K = new n3(this, true);
        }
        return this.K;
    }

    public final int j(int i4, View view) {
        j3 j3Var = (j3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i11 = j3Var.f30723a & AppLovinMediationAdapter.ERROR_CHILD_USER;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f838w & AppLovinMediationAdapter.ERROR_CHILD_USER;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) j3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) j3Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) j3Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.G.f37510c).iterator();
        while (it.hasNext()) {
            ((n) it.next()).c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final boolean o() {
        k kVar;
        ActionMenuView actionMenuView = this.f818a;
        return (actionMenuView == null || (kVar = actionMenuView.f749t) == null || !kVar.k()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
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
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
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
    public final void onMeasure(int i4, int i10) {
        byte b10;
        byte b11;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z3 = v3.f30896a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            b11 = true;
            b10 = 0;
        } else {
            b10 = 1;
            b11 = false;
        }
        if (t(this.f821d)) {
            s(this.f821d, i4, 0, i10, this.f830o);
            iK = k(this.f821d) + this.f821d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f821d) + this.f821d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f821d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f824h)) {
            s(this.f824h, i4, 0, i10, this.f830o);
            iK = k(this.f824h) + this.f824h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f824h) + this.f824h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f824h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b12 = b11;
        int[] iArr = this.F;
        iArr[b12 == true ? 1 : 0] = iMax4;
        if (t(this.f818a)) {
            s(this.f818a, i4, iMax3, i10, this.f830o);
            iK2 = k(this.f818a) + this.f818a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f818a) + this.f818a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f818a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b10] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f825i)) {
            iMax5 += r(this.f825i, i4, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f825i) + this.f825i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f825i.getMeasuredState());
        }
        if (t(this.f822e)) {
            iMax5 += r(this.f822e, i4, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f822e) + this.f822e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f822e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((j3) childAt.getLayoutParams()).f30724b == 0 && t(childAt)) {
                iMax5 += r(childAt, i4, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i13 = iMax5;
        int i14 = this.f833r + this.f834s;
        int i15 = this.f831p + this.f832q;
        if (t(this.f819b)) {
            r(this.f819b, i4, i13 + i15, i10, i14, iArr);
            int iK3 = k(this.f819b) + this.f819b.getMeasuredWidth();
            iL = l(this.f819b) + this.f819b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f819b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f820c)) {
            iMax2 = Math.max(iMax2, r(this.f820c, i4, i13 + i15, i10, i14 + iL, iArr));
            iL += l(this.f820c) + this.f820c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f820c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.P) {
            i11 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i11 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof l3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l3 l3Var = (l3) parcelable;
        super.onRestoreInstanceState(l3Var.f28876a);
        ActionMenuView actionMenuView = this.f818a;
        m mVar = actionMenuView != null ? actionMenuView.f745p : null;
        int i4 = l3Var.f30759c;
        if (i4 != 0 && this.M != null && mVar != null && (menuItemFindItem = mVar.findItem(i4)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (l3Var.f30760d) {
            o1 o1Var = this.T;
            removeCallbacks(o1Var);
            post(o1Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        m2 m2Var = this.f835t;
        boolean z3 = i4 == 1;
        if (z3 == m2Var.g) {
            return;
        }
        m2Var.g = z3;
        if (!m2Var.f30775h) {
            m2Var.f30769a = m2Var.f30773e;
            m2Var.f30770b = m2Var.f30774f;
            return;
        }
        if (z3) {
            int i10 = m2Var.f30772d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = m2Var.f30773e;
            }
            m2Var.f30769a = i10;
            int i11 = m2Var.f30771c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = m2Var.f30774f;
            }
            m2Var.f30770b = i11;
            return;
        }
        int i12 = m2Var.f30771c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = m2Var.f30773e;
        }
        m2Var.f30769a = i12;
        int i13 = m2Var.f30772d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = m2Var.f30774f;
        }
        m2Var.f30770b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        l3 l3Var = new l3(super.onSaveInstanceState());
        i3 i3Var = this.M;
        if (i3Var != null && (oVar = i3Var.f30717b) != null) {
            l3Var.f30759c = oVar.f30263a;
        }
        l3Var.f30760d = o();
        return l3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
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
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i4, int i10, int[] iArr) {
        j3 j3Var = (j3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) j3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i4;
        iArr[0] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) j3Var).rightMargin + iMax;
    }

    public final int q(View view, int i4, int i10, int[] iArr) {
        j3 j3Var = (j3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) j3Var).rightMargin - iArr[1];
        int iMax = i4 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iJ = j(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) j3Var).leftMargin);
    }

    public final int r(View view, int i4, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i4, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.S != z3) {
            this.S = z3;
            v();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(a.l(i4, getContext()));
    }

    public void setCollapsible(boolean z3) {
        this.P = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i4 != this.f837v) {
            this.f837v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i4 != this.f836u) {
            this.f836u = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(a.l(i4, getContext()));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(a.l(i4, getContext()));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f821d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(k3 k3Var) {
        this.I = k3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f818a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f826k != i4) {
            this.f826k = i4;
            if (i4 == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f834s = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f832q = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f831p = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f833r = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        k kVar;
        ActionMenuView actionMenuView = this.f818a;
        return (actionMenuView == null || (kVar = actionMenuView.f749t) == null || !kVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = h3.a(this);
            i3 i3Var = this.M;
            boolean z3 = (i3Var == null || i3Var.f30717b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.S) ? false : true;
            if (z3 && this.R == null) {
                if (this.Q == null) {
                    this.Q = h3.b(new g3(this, 0));
                }
                h3.c(onBackInvokedDispatcherA, this.Q);
                this.R = onBackInvokedDispatcherA;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            h3.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f838w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new e(new g3(this, 1));
        this.H = new ArrayList();
        int i10 = 2;
        this.J = new d0(i10, this);
        this.T = new o1(i10, this);
        Context context2 = getContext();
        int[] iArr = h.a.f24798y;
        f fVarJ = f.J(context2, attributeSet, iArr, R.attr.toolbarStyle);
        v0.n(this, context, iArr, attributeSet, (TypedArray) fVarJ.f25417c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        this.f827l = typedArray.getResourceId(28, 0);
        this.f828m = typedArray.getResourceId(19, 0);
        this.f838w = typedArray.getInteger(0, 8388627);
        this.f829n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f834s = dimensionPixelOffset;
        this.f833r = dimensionPixelOffset;
        this.f832q = dimensionPixelOffset;
        this.f831p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f831p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f832q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f833r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f834s = dimensionPixelOffset5;
        }
        this.f830o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, LinearLayoutManager.INVALID_OFFSET);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        m2 m2Var = this.f835t;
        m2Var.f30775h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            m2Var.f30773e = dimensionPixelSize;
            m2Var.f30769a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            m2Var.f30774f = dimensionPixelSize2;
            m2Var.f30770b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            m2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f836u = typedArray.getDimensionPixelOffset(10, LinearLayoutManager.INVALID_OFFSET);
        this.f837v = typedArray.getDimensionPixelOffset(6, LinearLayoutManager.INVALID_OFFSET);
        this.f823f = fVarJ.A(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableA = fVarJ.A(16);
        if (drawableA != null) {
            setNavigationIcon(drawableA);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableA2 = fVarJ.A(11);
        if (drawableA2 != null) {
            setLogo(drawableA2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(fVarJ.y(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(fVarJ.y(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        fVarJ.M();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        j3 j3Var = new j3(context, attributeSet);
        j3Var.f30723a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f24777b);
        j3Var.f30723a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        j3Var.f30724b = 0;
        return j3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.f824h;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f824h.setImageDrawable(drawable);
        } else {
            v vVar = this.f824h;
            if (vVar != null) {
                vVar.setImageDrawable(this.f823f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f822e == null) {
                this.f822e = new w(getContext());
            }
            if (!n(this.f822e)) {
                b(this.f822e, true);
            }
        } else {
            w wVar = this.f822e;
            if (wVar != null && n(wVar)) {
                removeView(this.f822e);
                this.E.remove(this.f822e);
            }
        }
        w wVar2 = this.f822e;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f822e == null) {
            this.f822e = new w(getContext());
        }
        w wVar = this.f822e;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        v vVar = this.f821d;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            b.s(this.f821d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f821d)) {
                b(this.f821d, true);
            }
        } else {
            v vVar = this.f821d;
            if (vVar != null && n(vVar)) {
                removeView(this.f821d);
                this.E.remove(this.f821d);
            }
        }
        v vVar2 = this.f821d;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f820c;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f820c);
                this.E.remove(this.f820c);
            }
        } else {
            if (this.f820c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f820c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f820c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f828m;
                if (i4 != 0) {
                    this.f820c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f820c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f820c)) {
                b(this.f820c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f820c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f840y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.f820c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f819b;
            if (appCompatTextView != null && n(appCompatTextView)) {
                removeView(this.f819b);
                this.E.remove(this.f819b);
            }
        } else {
            if (this.f819b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f819b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f819b.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f827l;
                if (i4 != 0) {
                    this.f819b.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f841z;
                if (colorStateList != null) {
                    this.f819b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f819b)) {
                b(this.f819b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f819b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f839x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f841z = colorStateList;
        AppCompatTextView appCompatTextView = this.f819b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
