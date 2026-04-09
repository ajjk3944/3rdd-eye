package androidx.appcompat.widget;

import ab.g;
import al.f;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import b4.e;
import com.google.android.exoplayer2.ui.e0;
import com.google.android.gms.internal.measurement.y3;
import h.j;
import h7.h0;
import io.sentry.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n.h;
import o.m;
import o.o;
import o4.d0;
import p.c2;
import p.k2;
import p.l2;
import p.m2;
import p.n2;
import p.o2;
import p.p2;
import p.q0;
import p.r2;
import p.t;
import p.z0;
import p.z2;
import u3.i0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final CharSequence B;
    public t D;
    public View E;
    public Context F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public c2 P;
    public int Q;
    public int R;
    public final int S;
    public CharSequence T;
    public CharSequence U;
    public ColorStateList V;
    public ColorStateList W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1011a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1012a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1013b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f1014c0;

    /* renamed from: d, reason: collision with root package name */
    public q0 f1015d;

    /* renamed from: d0, reason: collision with root package name */
    public final ArrayList f1016d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int[] f1017e0;

    /* renamed from: f0, reason: collision with root package name */
    public final qm.c f1018f0;

    /* renamed from: g, reason: collision with root package name */
    public q0 f1019g;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f1020g0;

    /* renamed from: h0, reason: collision with root package name */
    public p2 f1021h0;

    /* renamed from: i0, reason: collision with root package name */
    public final f f1022i0;

    /* renamed from: j0, reason: collision with root package name */
    public r2 f1023j0;

    /* renamed from: k0, reason: collision with root package name */
    public b f1024k0;

    /* renamed from: l0, reason: collision with root package name */
    public n2 f1025l0;

    /* renamed from: m0, reason: collision with root package name */
    public g f1026m0;

    /* renamed from: n0, reason: collision with root package name */
    public h0 f1027n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1028o0;

    /* renamed from: p0, reason: collision with root package name */
    public OnBackInvokedCallback f1029p0;

    /* renamed from: q0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1030q0;

    /* renamed from: r, reason: collision with root package name */
    public t f1031r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f1032r0;

    /* renamed from: s0, reason: collision with root package name */
    public final e f1033s0;

    /* renamed from: x, reason: collision with root package name */
    public AppCompatImageView f1034x;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f1035y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* renamed from: g, reason: collision with root package name */
        public int f1036g;

        /* renamed from: r, reason: collision with root package name */
        public boolean f1037r;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1036g = parcel.readInt();
            this.f1037r = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1036g);
            parcel.writeInt(this.f1037r ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.toolbarStyle);
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
        return new h(getContext());
    }

    public static o2 h() {
        o2 o2Var = new o2(-2, -2);
        o2Var.f20129b = 0;
        o2Var.f20128a = 8388627;
        return o2Var;
    }

    public static o2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof o2;
        if (z10) {
            o2 o2Var = (o2) layoutParams;
            o2 o2Var2 = new o2(o2Var);
            o2Var2.f20129b = 0;
            o2Var2.f20129b = o2Var.f20129b;
            return o2Var2;
        }
        if (z10) {
            o2 o2Var3 = new o2((o2) layoutParams);
            o2Var3.f20129b = 0;
            return o2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            o2 o2Var4 = new o2(layoutParams);
            o2Var4.f20129b = 0;
            return o2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        o2 o2Var5 = new o2(marginLayoutParams);
        o2Var5.f20129b = 0;
        ((ViewGroup.MarginLayoutParams) o2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) o2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return o2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                o2 o2Var = (o2) childAt.getLayoutParams();
                if (o2Var.f20129b == 0 && t(childAt)) {
                    int i12 = o2Var.f20128a;
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
            o2 o2Var2 = (o2) childAt2.getLayoutParams();
            if (o2Var2.f20129b == 0 && t(childAt2)) {
                int i14 = o2Var2.f20128a;
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

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o2 o2VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (o2) layoutParams;
        o2VarH.f20129b = 1;
        if (!z10 || this.E == null) {
            addView(view, o2VarH);
        } else {
            view.setLayoutParams(o2VarH);
            this.f1016d0.add(view);
        }
    }

    public final void c() {
        if (this.D == null) {
            t tVar = new t(getContext(), null, h.a.toolbarNavigationButtonStyle);
            this.D = tVar;
            tVar.setImageDrawable(this.f1035y);
            this.D.setContentDescription(this.B);
            o2 o2VarH = h();
            o2VarH.f20128a = (this.J & 112) | 8388611;
            o2VarH.f20129b = 2;
            this.D.setLayoutParams(o2VarH);
            this.D.setOnClickListener(new e0(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o2);
    }

    public final void d() {
        if (this.P == null) {
            c2 c2Var = new c2();
            c2Var.f20037a = 0;
            c2Var.f20038b = 0;
            c2Var.f20039c = Integer.MIN_VALUE;
            c2Var.f20040d = Integer.MIN_VALUE;
            c2Var.f20041e = 0;
            c2Var.f20042f = 0;
            c2Var.f20043g = false;
            c2Var.f20044h = false;
            this.P = c2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1011a;
        if (actionMenuView.L == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f1025l0 == null) {
                this.f1025l0 = new n2(this);
            }
            this.f1011a.setExpandedActionViewsExclusive(true);
            mVar.b(this.f1025l0, this.F);
            v();
        }
    }

    public final void f() {
        if (this.f1011a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1011a = actionMenuView;
            actionMenuView.setPopupTheme(this.G);
            this.f1011a.setOnMenuItemClickListener(this.f1022i0);
            ActionMenuView actionMenuView2 = this.f1011a;
            g gVar = this.f1026m0;
            l2 l2Var = new l2(0, this);
            actionMenuView2.Q = gVar;
            actionMenuView2.R = l2Var;
            o2 o2VarH = h();
            o2VarH.f20128a = (this.J & 112) | 8388613;
            this.f1011a.setLayoutParams(o2VarH);
            b(this.f1011a, false);
        }
    }

    public final void g() {
        if (this.f1031r == null) {
            this.f1031r = new t(getContext(), null, h.a.toolbarNavigationButtonStyle);
            o2 o2VarH = h();
            o2VarH.f20128a = (this.J & 112) | 8388611;
            this.f1031r.setLayoutParams(o2VarH);
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
        t tVar = this.D;
        if (tVar != null) {
            return tVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        t tVar = this.D;
        if (tVar != null) {
            return tVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        c2 c2Var = this.P;
        if (c2Var != null) {
            return c2Var.f20043g ? c2Var.f20037a : c2Var.f20038b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.R;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        c2 c2Var = this.P;
        if (c2Var != null) {
            return c2Var.f20037a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        c2 c2Var = this.P;
        if (c2Var != null) {
            return c2Var.f20038b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        c2 c2Var = this.P;
        if (c2Var != null) {
            return c2Var.f20043g ? c2Var.f20038b : c2Var.f20037a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.Q;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f1011a;
        return (actionMenuView == null || (mVar = actionMenuView.L) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.R, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.Q, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1034x;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1034x;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1011a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1031r;
    }

    public CharSequence getNavigationContentDescription() {
        t tVar = this.f1031r;
        if (tVar != null) {
            return tVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        t tVar = this.f1031r;
        if (tVar != null) {
            return tVar.getDrawable();
        }
        return null;
    }

    public b getOuterActionMenuPresenter() {
        return this.f1024k0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1011a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.F;
    }

    public int getPopupTheme() {
        return this.G;
    }

    public CharSequence getSubtitle() {
        return this.U;
    }

    public final TextView getSubtitleTextView() {
        return this.f1019g;
    }

    public CharSequence getTitle() {
        return this.T;
    }

    public int getTitleMarginBottom() {
        return this.O;
    }

    public int getTitleMarginEnd() {
        return this.M;
    }

    public int getTitleMarginStart() {
        return this.L;
    }

    public int getTitleMarginTop() {
        return this.N;
    }

    public final TextView getTitleTextView() {
        return this.f1015d;
    }

    public z0 getWrapper() {
        if (this.f1023j0 == null) {
            this.f1023j0 = new r2(this, true);
        }
        return this.f1023j0;
    }

    public final int j(View view, int i10) {
        o2 o2Var = (o2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = o2Var.f20128a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.S & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) o2Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) o2Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f1020g0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1018f0.f20918d).iterator();
        while (it2.hasNext()) {
            ((d0) it2.next()).f18787a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1020g0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f1016d0.contains(view);
    }

    public final boolean o() {
        b bVar;
        ActionMenuView actionMenuView = this.f1011a;
        return (actionMenuView == null || (bVar = actionMenuView.P) == null || !bVar.j()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1033s0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1013b0 = false;
        }
        if (!this.f1013b0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1013b0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1013b0 = false;
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
    public final void onMeasure(int i10, int i11) {
        byte b2;
        byte b10;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z10 = z2.f20220a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            b10 = true;
            b2 = 0;
        } else {
            b2 = 1;
            b10 = false;
        }
        if (t(this.f1031r)) {
            s(this.f1031r, i10, 0, i11, this.K);
            iK = k(this.f1031r) + this.f1031r.getMeasuredWidth();
            iMax = Math.max(0, l(this.f1031r) + this.f1031r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1031r.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.D)) {
            s(this.D, i10, 0, i11, this.K);
            iK = k(this.D) + this.D.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.D) + this.D.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b11 = b10;
        int[] iArr = this.f1017e0;
        iArr[b11 == true ? 1 : 0] = iMax4;
        if (t(this.f1011a)) {
            s(this.f1011a, i10, iMax3, i11, this.K);
            iK2 = k(this.f1011a) + this.f1011a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1011a) + this.f1011a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1011a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b2] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.E)) {
            iMax5 += r(this.E, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        }
        if (t(this.f1034x)) {
            iMax5 += r(this.f1034x, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f1034x) + this.f1034x.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1034x.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((o2) childAt.getLayoutParams()).f20129b == 0 && t(childAt)) {
                iMax5 += r(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.N + this.O;
        int i16 = this.L + this.M;
        if (t(this.f1015d)) {
            r(this.f1015d, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.f1015d) + this.f1015d.getMeasuredWidth();
            iL = l(this.f1015d) + this.f1015d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1015d.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f1019g)) {
            iMax2 = Math.max(iMax2, r(this.f1019g, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.f1019g) + this.f1019g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1019g.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f1028o0) {
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
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        ActionMenuView actionMenuView = this.f1011a;
        m mVar = actionMenuView != null ? actionMenuView.L : null;
        int i10 = savedState.f1036g;
        if (i10 != 0 && this.f1025l0 != null && mVar != null && (menuItemFindItem = mVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1037r) {
            e eVar = this.f1033s0;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        c2 c2Var = this.P;
        boolean z10 = i10 == 1;
        if (z10 == c2Var.f20043g) {
            return;
        }
        c2Var.f20043g = z10;
        if (!c2Var.f20044h) {
            c2Var.f20037a = c2Var.f20041e;
            c2Var.f20038b = c2Var.f20042f;
            return;
        }
        if (z10) {
            int i11 = c2Var.f20040d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = c2Var.f20041e;
            }
            c2Var.f20037a = i11;
            int i12 = c2Var.f20039c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = c2Var.f20042f;
            }
            c2Var.f20038b = i12;
            return;
        }
        int i13 = c2Var.f20039c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = c2Var.f20041e;
        }
        c2Var.f20037a = i13;
        int i14 = c2Var.f20040d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = c2Var.f20042f;
        }
        c2Var.f20038b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        n2 n2Var = this.f1025l0;
        if (n2Var != null && (oVar = n2Var.f20121d) != null) {
            savedState.f1036g = oVar.f18638a;
        }
        savedState.f1037r = o();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1012a0 = false;
        }
        if (!this.f1012a0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1012a0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1012a0 = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        o2 o2Var = (o2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) o2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o2Var).rightMargin + iMax;
    }

    public final int q(View view, int i10, int i11, int[] iArr) {
        o2 o2Var = (o2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) o2Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) o2Var).leftMargin);
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
        if (this.f1032r0 != z10) {
            this.f1032r0 = z10;
            v();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(ic.a.r(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1028o0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.R) {
            this.R = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.Q) {
            this.Q = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(ic.a.r(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(ic.a.r(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1031r.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(p2 p2Var) {
        this.f1021h0 = p2Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1011a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.G != i10) {
            this.G = i10;
            if (i10 == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), i10);
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
        this.O = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.M = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.L = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.N = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        b bVar;
        ActionMenuView actionMenuView = this.f1011a;
        return (actionMenuView == null || (bVar = actionMenuView.P) == null || !bVar.n()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = m2.a(this);
            n2 n2Var = this.f1025l0;
            boolean z10 = (n2Var == null || n2Var.f20121d == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f1032r0) ? false : true;
            if (z10 && this.f1030q0 == null) {
                if (this.f1029p0 == null) {
                    this.f1029p0 = m2.b(new k2(this, 0));
                }
                m2.c(onBackInvokedDispatcherA, this.f1029p0);
                this.f1030q0 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f1030q0) == null) {
                return;
            }
            m2.d(onBackInvokedDispatcher, this.f1029p0);
            this.f1030q0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.S = 8388627;
        this.f1014c0 = new ArrayList();
        this.f1016d0 = new ArrayList();
        this.f1017e0 = new int[2];
        this.f1018f0 = new qm.c(new k2(this, 1));
        this.f1020g0 = new ArrayList();
        this.f1022i0 = new f(this);
        this.f1033s0 = new e(29, this);
        k kVarH0 = k.h0(getContext(), attributeSet, j.Toolbar, i10);
        i0.m(this, context, j.Toolbar, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        int i11 = j.Toolbar_titleTextAppearance;
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        this.H = typedArray.getResourceId(i11, 0);
        this.I = typedArray.getResourceId(j.Toolbar_subtitleTextAppearance, 0);
        this.S = typedArray.getInteger(j.Toolbar_android_gravity, 8388627);
        this.J = typedArray.getInteger(j.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(j.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(j.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(j.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.N = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        this.L = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(j.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.L = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(j.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.M = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(j.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.N = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(j.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.O = dimensionPixelOffset5;
        }
        this.K = typedArray.getDimensionPixelSize(j.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(j.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(j.Toolbar_contentInsetRight, 0);
        d();
        c2 c2Var = this.P;
        c2Var.f20044h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c2Var.f20041e = dimensionPixelSize;
            c2Var.f20037a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c2Var.f20042f = dimensionPixelSize2;
            c2Var.f20038b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.Q = typedArray.getDimensionPixelOffset(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.R = typedArray.getDimensionPixelOffset(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1035y = kVarH0.U(j.Toolbar_collapseIcon);
        this.B = typedArray.getText(j.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(j.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.F = getContext();
        setPopupTheme(typedArray.getResourceId(j.Toolbar_popupTheme, 0));
        Drawable drawableU = kVarH0.U(j.Toolbar_navigationIcon);
        if (drawableU != null) {
            setNavigationIcon(drawableU);
        }
        CharSequence text3 = typedArray.getText(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableU2 = kVarH0.U(j.Toolbar_logo);
        if (drawableU2 != null) {
            setLogo(drawableU2);
        }
        CharSequence text4 = typedArray.getText(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(j.Toolbar_titleTextColor)) {
            setTitleTextColor(kVarH0.T(j.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(kVarH0.T(j.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(j.Toolbar_menu)) {
            getMenuInflater().inflate(typedArray.getResourceId(j.Toolbar_menu, 0), getMenu());
        }
        kVarH0.l0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        o2 o2Var = new o2(context, attributeSet);
        o2Var.f20128a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
        o2Var.f20128a = typedArrayObtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        o2Var.f20129b = 0;
        return o2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        t tVar = this.D;
        if (tVar != null) {
            tVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.D.setImageDrawable(drawable);
        } else {
            t tVar = this.D;
            if (tVar != null) {
                tVar.setImageDrawable(this.f1035y);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1034x == null) {
                this.f1034x = new AppCompatImageView(getContext(), null);
            }
            if (!n(this.f1034x)) {
                b(this.f1034x, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1034x;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.f1034x);
                this.f1016d0.remove(this.f1034x);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1034x;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1034x == null) {
            this.f1034x = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1034x;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        t tVar = this.f1031r;
        if (tVar != null) {
            tVar.setContentDescription(charSequence);
            y3.N(this.f1031r, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f1031r)) {
                b(this.f1031r, true);
            }
        } else {
            t tVar = this.f1031r;
            if (tVar != null && n(tVar)) {
                removeView(this.f1031r);
                this.f1016d0.remove(this.f1031r);
            }
        }
        t tVar2 = this.f1031r;
        if (tVar2 != null) {
            tVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            q0 q0Var = this.f1019g;
            if (q0Var != null && n(q0Var)) {
                removeView(this.f1019g);
                this.f1016d0.remove(this.f1019g);
            }
        } else {
            if (this.f1019g == null) {
                Context context = getContext();
                q0 q0Var2 = new q0(context, null);
                this.f1019g = q0Var2;
                q0Var2.setSingleLine();
                this.f1019g.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.I;
                if (i10 != 0) {
                    this.f1019g.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.f1019g.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1019g)) {
                b(this.f1019g, true);
            }
        }
        q0 q0Var3 = this.f1019g;
        if (q0Var3 != null) {
            q0Var3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        q0 q0Var = this.f1019g;
        if (q0Var != null) {
            q0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            q0 q0Var = this.f1015d;
            if (q0Var != null && n(q0Var)) {
                removeView(this.f1015d);
                this.f1016d0.remove(this.f1015d);
            }
        } else {
            if (this.f1015d == null) {
                Context context = getContext();
                q0 q0Var2 = new q0(context, null);
                this.f1015d = q0Var2;
                q0Var2.setSingleLine();
                this.f1015d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.H;
                if (i10 != 0) {
                    this.f1015d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.V;
                if (colorStateList != null) {
                    this.f1015d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1015d)) {
                b(this.f1015d, true);
            }
        }
        q0 q0Var3 = this.f1015d;
        if (q0Var3 != null) {
            q0Var3.setText(charSequence);
        }
        this.T = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        q0 q0Var = this.f1015d;
        if (q0Var != null) {
            q0Var.setTextColor(colorStateList);
        }
    }
}
