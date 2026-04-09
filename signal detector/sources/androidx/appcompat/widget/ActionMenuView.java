package androidx.appcompat.widget;

import P.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.LinearLayoutManager;
import b4.C0344i;
import d4.h;
import n.InterfaceC2675i;
import n.InterfaceC2676j;
import n.MenuC2677k;
import n.m;
import n.v;
import n.y;
import o.C2713g;
import o.C2719j;
import o.C2723l;
import o.C2727n;
import o.C2739t0;
import o.InterfaceC2725m;
import o.InterfaceC2729o;
import o.q1;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements InterfaceC2676j, y {

    /* renamed from: D, reason: collision with root package name */
    public MenuC2677k f4844D;

    /* renamed from: E, reason: collision with root package name */
    public Context f4845E;

    /* renamed from: F, reason: collision with root package name */
    public int f4846F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4847G;

    /* renamed from: H, reason: collision with root package name */
    public C2723l f4848H;

    /* renamed from: I, reason: collision with root package name */
    public g f4849I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC2675i f4850J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4851K;

    /* renamed from: L, reason: collision with root package name */
    public int f4852L;
    public final int M;

    /* renamed from: N, reason: collision with root package name */
    public final int f4853N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC2729o f4854O;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.M = (int) (56.0f * f2);
        this.f4853N = (int) (f2 * 4.0f);
        this.f4845E = context;
        this.f4846F = 0;
    }

    public static C2727n j() {
        C2727n c2727n = new C2727n(-2, -2);
        c2727n.f22589a = false;
        ((LinearLayout.LayoutParams) c2727n).gravity = 16;
        return c2727n;
    }

    public static C2727n k(ViewGroup.LayoutParams layoutParams) {
        C2727n c2727n;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C2727n) {
            C2727n c2727n2 = (C2727n) layoutParams;
            c2727n = new C2727n(c2727n2);
            c2727n.f22589a = c2727n2.f22589a;
        } else {
            c2727n = new C2727n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2727n).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2727n).gravity = 16;
        }
        return c2727n;
    }

    @Override // n.y
    public final void b(MenuC2677k menuC2677k) {
        this.f4844D = menuC2677k;
    }

    @Override // n.InterfaceC2676j
    public final boolean c(m mVar) {
        return this.f4844D.q(mVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2727n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2739t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final C2739t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C2727n(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4844D == null) {
            Context context = getContext();
            MenuC2677k menuC2677k = new MenuC2677k(context);
            this.f4844D = menuC2677k;
            menuC2677k.f22080e = new h(10, this);
            C2723l c2723l = new C2723l(context);
            this.f4848H = c2723l;
            c2723l.f22564m = true;
            c2723l.f22565n = true;
            v c0344i = this.f4849I;
            if (c0344i == null) {
                c0344i = new C0344i(25);
            }
            c2723l.f22557e = c0344i;
            this.f4844D.b(c2723l, this.f4845E);
            C2723l c2723l2 = this.f4848H;
            c2723l2.f22560h = this;
            this.f4844D = c2723l2.f22555c;
        }
        return this.f4844D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2723l c2723l = this.f4848H;
        C2719j c2719j = c2723l.f22561j;
        if (c2719j != null) {
            return c2719j.getDrawable();
        }
        if (c2723l.f22563l) {
            return c2723l.f22562k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4846F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2739t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC2725m)) {
            zB = ((InterfaceC2725m) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC2725m)) ? zB : ((InterfaceC2725m) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2723l c2723l = this.f4848H;
        if (c2723l != null) {
            c2723l.b(false);
            if (this.f4848H.i()) {
                this.f4848H.g();
                this.f4848H.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2723l c2723l = this.f4848H;
        if (c2723l != null) {
            c2723l.g();
            C2713g c2713g = c2723l.f22549I;
            if (c2713g == null || !c2713g.b()) {
                return;
            }
            c2713g.i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f4851K) {
            super.onLayout(z6, i, i3, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z7 = q1.f22618a;
        boolean z8 = getLayoutDirection() == 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C2727n c2727n = (C2727n) childAt.getLayoutParams();
                if (c2727n.f22589a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z8) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c2727n).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2727n).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2727n).leftMargin) + ((LinearLayout.LayoutParams) c2727n).rightMargin;
                    l(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (z8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C2727n c2727n2 = (C2727n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2727n2.f22589a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c2727n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2727n2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C2727n c2727n3 = (C2727n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2727n3.f22589a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) c2727n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c2727n3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        int i7;
        ?? r11;
        int i8;
        int i9;
        MenuC2677k menuC2677k;
        boolean z6 = this.f4851K;
        boolean z7 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4851K = z7;
        if (z6 != z7) {
            this.f4852L = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4851K && (menuC2677k = this.f4844D) != null && size != this.f4852L) {
            this.f4852L = size;
            menuC2677k.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4851K || childCount <= 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C2727n c2727n = (C2727n) getChildAt(i10).getLayoutParams();
                ((LinearLayout.LayoutParams) c2727n).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2727n).leftMargin = 0;
            }
            super.onMeasure(i, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i11 = size2 - paddingRight;
        int i12 = this.M;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = (i14 / i13) + i12;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i16 = 0;
        int iMax2 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        long j6 = 0;
        while (true) {
            i6 = this.f4853N;
            if (i17 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i17);
            int i19 = size3;
            int i20 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i8 = i15;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C2727n c2727n2 = (C2727n) childAt.getLayoutParams();
                c2727n2.f22594f = false;
                c2727n2.f22591c = 0;
                c2727n2.f22590b = 0;
                c2727n2.f22592d = false;
                ((LinearLayout.LayoutParams) c2727n2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2727n2).rightMargin = 0;
                c2727n2.f22593e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = c2727n2.f22589a ? 1 : i13;
                C2727n c2727n3 = (C2727n) childAt.getLayoutParams();
                int i22 = i13;
                i8 = i15;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i20, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z11 = z10;
                if (i21 <= 0 || (z10 && i21 < 2)) {
                    i9 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i21, LinearLayoutManager.INVALID_OFFSET), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i9 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i9++;
                    }
                    if (z11 && i9 < 2) {
                        i9 = 2;
                    }
                }
                c2727n3.f22592d = !c2727n3.f22589a && z11;
                c2727n3.f22590b = i9;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i9);
                if (c2727n2.f22592d) {
                    i18++;
                }
                if (c2727n2.f22589a) {
                    z8 = true;
                }
                i13 = i22 - i9;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i9 == 1) {
                    j6 |= 1 << i17;
                }
            }
            i17++;
            size3 = i19;
            paddingBottom = i20;
            i15 = i8;
        }
        int i23 = size3;
        int i24 = i13;
        int i25 = i15;
        boolean z12 = z8 && i16 == 2;
        int i26 = i24;
        boolean z13 = false;
        while (i18 > 0 && i26 > 0) {
            int i27 = Integer.MAX_VALUE;
            long j7 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i29 < childCount2) {
                int i30 = iMax;
                C2727n c2727n4 = (C2727n) getChildAt(i29).getLayoutParams();
                boolean z14 = z12;
                if (c2727n4.f22592d) {
                    int i31 = c2727n4.f22590b;
                    if (i31 < i27) {
                        j7 = 1 << i29;
                        i27 = i31;
                        i28 = 1;
                    } else if (i31 == i27) {
                        j7 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z12 = z14;
                iMax = i30;
            }
            i7 = iMax;
            boolean z15 = z12;
            j6 |= j7;
            if (i28 > i26) {
                break;
            }
            int i32 = i27 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C2727n c2727n5 = (C2727n) childAt2.getLayoutParams();
                boolean z16 = z8;
                long j8 = 1 << i33;
                if ((j7 & j8) != 0) {
                    if (z15 && c2727n5.f22593e) {
                        r11 = 1;
                        r11 = 1;
                        if (i26 == 1) {
                            childAt2.setPadding(i6 + i25, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c2727n5.f22590b += r11;
                    c2727n5.f22594f = r11;
                    i26--;
                } else if (c2727n5.f22590b == i32) {
                    j6 |= j8;
                }
                i33++;
                z8 = z16;
            }
            z12 = z15;
            iMax = i7;
            z13 = true;
        }
        i7 = iMax;
        boolean z17 = !z8 && i16 == 1;
        if (i26 > 0 && j6 != 0 && (i26 < i16 - 1 || z17 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j6);
            if (!z17) {
                if ((j6 & 1) != 0 && !((C2727n) getChildAt(0).getLayoutParams()).f22593e) {
                    fBitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j6 & (1 << i34)) != 0 && !((C2727n) getChildAt(i34).getLayoutParams()).f22593e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i26 * i25) / fBitCount) : 0;
            boolean z18 = z13;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j6 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    C2727n c2727n6 = (C2727n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2727n6.f22591c = i35;
                        c2727n6.f22594f = true;
                        if (i36 == 0 && !c2727n6.f22593e) {
                            ((LinearLayout.LayoutParams) c2727n6).leftMargin = (-i35) / 2;
                        }
                        z18 = true;
                    } else if (c2727n6.f22589a) {
                        c2727n6.f22591c = i35;
                        c2727n6.f22594f = true;
                        ((LinearLayout.LayoutParams) c2727n6).rightMargin = (-i35) / 2;
                        z18 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) c2727n6).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c2727n6).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z13 = z18;
        }
        if (z13) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C2727n c2727n7 = (C2727n) childAt4.getLayoutParams();
                if (c2727n7.f22594f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2727n7.f22590b * i25) + c2727n7.f22591c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? i7 : i23);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f4848H.f22546F = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC2729o interfaceC2729o) {
        this.f4854O = interfaceC2729o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2723l c2723l = this.f4848H;
        C2719j c2719j = c2723l.f22561j;
        if (c2719j != null) {
            c2719j.setImageDrawable(drawable);
        } else {
            c2723l.f22563l = true;
            c2723l.f22562k = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f4847G = z6;
    }

    public void setPopupTheme(int i) {
        if (this.f4846F != i) {
            this.f4846F = i;
            if (i == 0) {
                this.f4845E = getContext();
            } else {
                this.f4845E = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2723l c2723l) {
        this.f4848H = c2723l;
        c2723l.f22560h = this;
        this.f4844D = c2723l.f22555c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2727n(getContext(), attributeSet);
    }
}
