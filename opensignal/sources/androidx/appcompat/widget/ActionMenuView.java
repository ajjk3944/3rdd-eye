package androidx.appcompat.widget;

import ab.g;
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
import i.g0;
import o.a0;
import o.k;
import o.l;
import o.m;
import o.o;
import o.x;
import p.f;
import p.i;
import p.j;
import p.m1;
import p.z2;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements l, a0 {
    public m L;
    public Context M;
    public int N;
    public boolean O;
    public b P;
    public g Q;
    public k R;
    public boolean S;
    public int T;
    public final int U;
    public final int V;
    public p.l W;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.U = (int) (56.0f * f10);
        this.V = (int) (f10 * 4.0f);
        this.M = context;
        this.N = 0;
    }

    public static p.k j() {
        p.k kVar = new p.k(-2, -2);
        kVar.f20083a = false;
        ((LinearLayout.LayoutParams) kVar).gravity = 16;
        return kVar;
    }

    public static p.k k(ViewGroup.LayoutParams layoutParams) {
        p.k kVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof p.k) {
            p.k kVar2 = (p.k) layoutParams;
            kVar = new p.k(kVar2);
            kVar.f20083a = kVar2.f20083a;
        } else {
            kVar = new p.k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) kVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) kVar).gravity = 16;
        }
        return kVar;
    }

    @Override // o.a0
    public final void b(m mVar) {
        this.L = mVar;
    }

    @Override // o.l
    public final boolean c(o oVar) {
        return this.L.q(oVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ m1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final m1 generateLayoutParams(AttributeSet attributeSet) {
        return new p.k(getContext(), attributeSet);
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
        if (this.L == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.L = mVar;
            mVar.f18617e = new g0(this);
            b bVar = new b(context);
            this.P = bVar;
            bVar.I = true;
            bVar.J = true;
            x dVar = this.Q;
            if (dVar == null) {
                dVar = new et.d();
            }
            bVar.f1047x = dVar;
            this.L.b(bVar, this.M);
            b bVar2 = this.P;
            bVar2.D = this;
            this.L = bVar2.f1045g;
        }
        return this.L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        b bVar = this.P;
        i iVar = bVar.F;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (bVar.H) {
            return bVar.G;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ m1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof j)) {
            zB = ((j) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof j)) ? zB : ((j) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.P;
        if (bVar != null) {
            bVar.b(false);
            if (this.P.j()) {
                this.P.g();
                this.P.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.P;
        if (bVar != null) {
            bVar.g();
            f fVar = bVar.Q;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f18681i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.S) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = z2.f20220a;
        boolean z12 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                p.k kVar = (p.k) childAt.getLayoutParams();
                if (kVar.f20083a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                p.k kVar2 = (p.k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.f20083a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            p.k kVar3 = (p.k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.f20083a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        m mVar;
        boolean z10 = this.S;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.S = z11;
        if (z10 != z11) {
            this.T = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.S && (mVar = this.L) != null && size != this.T) {
            this.T = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.S || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                p.k kVar = (p.k) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.U;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z12 = false;
        int i24 = 0;
        long j = 0;
        while (true) {
            i12 = this.V;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                p.k kVar2 = (p.k) childAt.getLayoutParams();
                kVar2.f20088f = false;
                kVar2.f20085c = 0;
                kVar2.f20084b = 0;
                kVar2.f20086d = false;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                kVar2.f20087e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = kVar2.f20083a ? 1 : i19;
                p.k kVar3 = (p.k) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i27 <= 0 || (z14 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                kVar3.f20086d = !kVar3.f20083a && z15;
                kVar3.f20084b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (kVar2.f20086d) {
                    i24++;
                }
                if (kVar2.f20083a) {
                    z12 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j |= 1 << i23;
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z16 = z12 && i22 == 2;
        int i32 = i30;
        boolean z17 = false;
        while (i24 > 0 && i32 > 0) {
            int i33 = Integer.MAX_VALUE;
            long j7 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                p.k kVar4 = (p.k) getChildAt(i35).getLayoutParams();
                boolean z18 = z16;
                if (kVar4.f20086d) {
                    int i37 = kVar4.f20084b;
                    if (i37 < i33) {
                        j7 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j7 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z16 = z18;
                iMax = i36;
            }
            i13 = iMax;
            boolean z19 = z16;
            j |= j7;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                p.k kVar5 = (p.k) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j10 = 1 << i39;
                if ((j7 & j10) != 0) {
                    if (z19 && kVar5.f20087e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar5.f20084b += r11;
                    kVar5.f20088f = r11;
                    i32--;
                } else if (kVar5.f20084b == i38) {
                    j |= j10;
                }
                i39++;
                z12 = z20;
            }
            z16 = z19;
            iMax = i13;
            z17 = true;
        }
        i13 = iMax;
        boolean z21 = !z12 && i22 == 1;
        if (i32 > 0 && j != 0 && (i32 < i22 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z21) {
                if ((j & 1) != 0 && !((p.k) getChildAt(0).getLayoutParams()).f20087e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j & (1 << i40)) != 0 && !((p.k) getChildAt(i40).getLayoutParams()).f20087e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    p.k kVar6 = (p.k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar6.f20085c = i41;
                        kVar6.f20088f = true;
                        if (i42 == 0 && !kVar6.f20087e) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = (-i41) / 2;
                        }
                        z22 = true;
                    } else if (kVar6.f20083a) {
                        kVar6.f20085c = i41;
                        kVar6.f20088f = true;
                        ((LinearLayout.LayoutParams) kVar6).rightMargin = (-i41) / 2;
                        z22 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                p.k kVar7 = (p.k) childAt4.getLayoutParams();
                if (kVar7.f20088f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar7.f20084b * i31) + kVar7.f20085c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.P.N = z10;
    }

    public void setOnMenuItemClickListener(p.l lVar) {
        this.W = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        b bVar = this.P;
        i iVar = bVar.F;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            bVar.H = true;
            bVar.G = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.O = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.N != i10) {
            this.N = i10;
            if (i10 == 0) {
                this.M = getContext();
            } else {
                this.M = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(b bVar) {
        this.P = bVar;
        bVar.D = this;
        this.L = bVar.f1045g;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.k(getContext(), attributeSet);
    }
}
