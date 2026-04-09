package androidx.appcompat.widget;

import a4.d;
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
import j6.i;
import je.u;
import o.a0;
import o.e;
import o.l;
import o.m;
import o.o;
import o.x;
import p.g;
import p.j;
import p.k;
import p.n;
import p.t1;
import p.u1;
import p.v3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ActionMenuView extends u1 implements l, a0 {
    public n A;

    /* renamed from: p, reason: collision with root package name */
    public m f745p;

    /* renamed from: q, reason: collision with root package name */
    public Context f746q;

    /* renamed from: r, reason: collision with root package name */
    public int f747r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f748s;

    /* renamed from: t, reason: collision with root package name */
    public k f749t;

    /* renamed from: u, reason: collision with root package name */
    public d f750u;

    /* renamed from: v, reason: collision with root package name */
    public o.k f751v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f752w;

    /* renamed from: x, reason: collision with root package name */
    public int f753x;

    /* renamed from: y, reason: collision with root package name */
    public final int f754y;

    /* renamed from: z, reason: collision with root package name */
    public final int f755z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f754y = (int) (56.0f * f10);
        this.f755z = (int) (f10 * 4.0f);
        this.f746q = context;
        this.f747r = 0;
    }

    public static p.m j() {
        p.m mVar = new p.m(-2, -2);
        mVar.f30761a = false;
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    public static p.m k(ViewGroup.LayoutParams layoutParams) {
        p.m mVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof p.m) {
            p.m mVar2 = (p.m) layoutParams;
            mVar = new p.m(mVar2);
            mVar.f30761a = mVar2.f30761a;
        } else {
            mVar = new p.m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) mVar).gravity = 16;
        }
        return mVar;
    }

    @Override // o.a0
    public final void b(m mVar) {
        this.f745p = mVar;
    }

    @Override // o.l
    public final boolean c(o oVar) {
        return this.f745p.q(oVar, null, 0);
    }

    @Override // p.u1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.u1
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ t1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // p.u1
    /* renamed from: g */
    public final t1 generateLayoutParams(AttributeSet attributeSet) {
        return new p.m(getContext(), attributeSet);
    }

    @Override // p.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // p.u1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f745p == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f745p = mVar;
            mVar.f30242e = new e(1, this);
            k kVar = new k(context);
            this.f749t = kVar;
            kVar.f30734l = true;
            kVar.f30735m = true;
            x iVar = this.f750u;
            if (iVar == null) {
                iVar = new i(9);
            }
            kVar.f30729e = iVar;
            this.f745p.b(kVar, this.f746q);
            k kVar2 = this.f749t;
            kVar2.f30731h = this;
            this.f745p = kVar2.f30727c;
        }
        return this.f745p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k kVar = this.f749t;
        j jVar = kVar.f30732i;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.f30733k) {
            return kVar.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f747r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p.u1
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i4) {
        boolean zB = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof p.l)) {
            zB = ((p.l) childAt).b();
        }
        return (i4 <= 0 || !(childAt2 instanceof p.l)) ? zB : ((p.l) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVar = this.f749t;
        if (kVar != null) {
            kVar.f();
            if (this.f749t.k()) {
                this.f749t.h();
                this.f749t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f749t;
        if (kVar != null) {
            kVar.h();
            g gVar = kVar.f30742t;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f30307i.dismiss();
        }
    }

    @Override // p.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f752w) {
            super.onLayout(z3, i4, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i4;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = v3.f30896a;
        boolean z11 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                p.m mVar = (p.m) childAt.getLayoutParams();
                if (mVar.f30761a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    l(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                p.m mVar2 = (p.m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f30761a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            p.m mVar3 = (p.m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f30761a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = u.l(measuredWidth4, ((LinearLayout.LayoutParams) mVar3).rightMargin, iMax, i26);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p.u1, android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        m mVar;
        boolean z3 = this.f752w;
        boolean z10 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f752w = z10;
        if (z3 != z10) {
            this.f753x = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f752w && (mVar = this.f745p) != null && size != this.f753x) {
            this.f753x = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f752w || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                p.m mVar2 = (p.m) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
            }
            super.onMeasure(i4, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i4);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f754y;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z11 = false;
        int i23 = 0;
        long j = 0;
        while (true) {
            i11 = this.f755z;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                p.m mVar3 = (p.m) childAt.getLayoutParams();
                mVar3.f30766f = false;
                mVar3.f30763c = 0;
                mVar3.f30762b = 0;
                mVar3.f30764d = false;
                ((LinearLayout.LayoutParams) mVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) mVar3).rightMargin = 0;
                mVar3.f30765e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = mVar3.f30761a ? 1 : i18;
                p.m mVar4 = (p.m) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i26 <= 0 || (z13 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, LinearLayoutManager.INVALID_OFFSET), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                mVar4.f30764d = !mVar4.f30761a && z14;
                mVar4.f30762b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (mVar3.f30764d) {
                    i23++;
                }
                if (mVar3.f30761a) {
                    z11 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z15 = z11 && i21 == 2;
        int i31 = i29;
        boolean z16 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j8 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = iMax;
                p.m mVar5 = (p.m) getChildAt(i34).getLayoutParams();
                boolean z17 = z15;
                if (mVar5.f30764d) {
                    int i36 = mVar5.f30762b;
                    if (i36 < i32) {
                        j8 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j8 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z15 = z17;
                iMax = i35;
            }
            i12 = iMax;
            boolean z18 = z15;
            j |= j8;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                p.m mVar6 = (p.m) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j9 = 1 << i38;
                if ((j8 & j9) != 0) {
                    if (z18 && mVar6.f30765e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    mVar6.f30762b += r11;
                    mVar6.f30766f = r11;
                    i31--;
                } else if (mVar6.f30762b == i37) {
                    j |= j9;
                }
                i38++;
                z11 = z19;
            }
            z15 = z18;
            iMax = i12;
            z16 = true;
        }
        i12 = iMax;
        boolean z20 = !z11 && i21 == 1;
        if (i31 > 0 && j != 0 && (i31 < i21 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z20) {
                if ((j & 1) != 0 && !((p.m) getChildAt(0).getLayoutParams()).f30765e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j & (1 << i39)) != 0 && !((p.m) getChildAt(i39).getLayoutParams()).f30765e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    p.m mVar7 = (p.m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar7.f30763c = i40;
                        mVar7.f30766f = true;
                        if (i41 == 0 && !mVar7.f30765e) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = (-i40) / 2;
                        }
                        z21 = true;
                    } else if (mVar7.f30761a) {
                        mVar7.f30763c = i40;
                        mVar7.f30766f = true;
                        ((LinearLayout.LayoutParams) mVar7).rightMargin = (-i40) / 2;
                        z21 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) mVar7).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                p.m mVar8 = (p.m) childAt4.getLayoutParams();
                if (mVar8.f30766f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar8.f30762b * i30) + mVar8.f30763c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f749t.f30739q = z3;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.A = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k kVar = this.f749t;
        j jVar = kVar.f30732i;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.f30733k = true;
            kVar.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f748s = z3;
    }

    public void setPopupTheme(int i4) {
        if (this.f747r != i4) {
            this.f747r = i4;
            if (i4 == 0) {
                this.f746q = getContext();
            } else {
                this.f746q = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(k kVar) {
        this.f749t = kVar;
        kVar.f30731h = this;
        this.f745p = kVar.f30727c;
    }

    @Override // p.u1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.m(getContext(), attributeSet);
    }
}
