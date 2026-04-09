package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.O;

/* loaded from: classes.dex */
public class ActionMenuView extends O implements e.b, androidx.appcompat.view.menu.k {

    /* renamed from: A, reason: collision with root package name */
    e f27034A;

    /* renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f27035p;

    /* renamed from: q, reason: collision with root package name */
    private Context f27036q;

    /* renamed from: r, reason: collision with root package name */
    private int f27037r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27038s;

    /* renamed from: t, reason: collision with root package name */
    private C3878c f27039t;

    /* renamed from: u, reason: collision with root package name */
    private j.a f27040u;

    /* renamed from: v, reason: collision with root package name */
    e.a f27041v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27042w;

    /* renamed from: x, reason: collision with root package name */
    private int f27043x;

    /* renamed from: y, reason: collision with root package name */
    private int f27044y;

    /* renamed from: z, reason: collision with root package name */
    private int f27045z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends O.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27046a;

        /* renamed from: b, reason: collision with root package name */
        public int f27047b;

        /* renamed from: c, reason: collision with root package name */
        public int f27048c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27049d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27050e;

        /* renamed from: f, reason: collision with root package name */
        boolean f27051f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f27046a = cVar.f27046a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f27046a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f27034A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f27041v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.s()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f27046a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f27049d = r1
            r0.f27047b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.L(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f27044y;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int iMax = 0;
        int i22 = 0;
        boolean z13 = false;
        int i23 = 0;
        int iMax2 = 0;
        int i24 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i25 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i26 = i23 + 1;
                if (z14) {
                    int i27 = this.f27045z;
                    i16 = i26;
                    r14 = 0;
                    childAt.setPadding(i27, 0, i27, 0);
                } else {
                    i16 = i26;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f27051f = r14;
                cVar.f27048c = r14;
                cVar.f27047b = r14;
                cVar.f27049d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f27050e = z14 && ((ActionMenuItemView) childAt).s();
                int iL = L(childAt, i21, cVar.f27046a ? 1 : i19, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (cVar.f27049d) {
                    i24++;
                }
                if (cVar.f27046a) {
                    z13 = true;
                }
                i19 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j10 |= 1 << i22;
                    iMax = iMax;
                }
                i23 = i16;
            }
            i22++;
            size2 = i25;
        }
        int i28 = size2;
        boolean z15 = z13 && i23 == 2;
        boolean z16 = false;
        while (i24 > 0 && i19 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j11 = 0;
            while (i31 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                int i32 = iMax;
                if (cVar2.f27049d) {
                    int i33 = cVar2.f27047b;
                    if (i33 < i29) {
                        j11 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        i30++;
                        j11 |= 1 << i31;
                    }
                }
                i31++;
                iMax = i32;
                z16 = z17;
            }
            z10 = z16;
            i14 = iMax;
            j10 |= j11;
            if (i30 > i19) {
                i12 = mode;
                i13 = i17;
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount) {
                View childAt2 = getChildAt(i35);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i36 = i17;
                int i37 = mode;
                long j12 = 1 << i35;
                if ((j11 & j12) == 0) {
                    if (cVar3.f27047b == i34) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && cVar3.f27050e && i19 == 1) {
                        int i38 = this.f27045z;
                        z12 = z15;
                        childAt2.setPadding(i38 + i21, 0, i38, 0);
                    } else {
                        z12 = z15;
                    }
                    cVar3.f27047b++;
                    cVar3.f27051f = true;
                    i19--;
                }
                i35++;
                mode = i37;
                i17 = i36;
                z15 = z12;
            }
            iMax = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i17;
        z10 = z16;
        i14 = iMax;
        boolean z18 = !z13 && i23 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i23 - 1 && !z18 && iMax2 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (z18) {
                i15 = 0;
            } else {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f27050e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount - 1;
                if ((j10 & (1 << i39)) != 0 && !((c) getChildAt(i39).getLayoutParams()).f27050e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : i15;
            z11 = z10;
            for (int i41 = i15; i41 < childCount; i41++) {
                if ((j10 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f27048c = i40;
                        cVar4.f27051f = true;
                        if (i41 == 0 && !cVar4.f27050e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i40) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f27046a) {
                        cVar4.f27048c = i40;
                        cVar4.f27051f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i40) / 2;
                        z11 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i40 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i42 = i15; i42 < childCount; i42++) {
                View childAt4 = getChildAt(i42);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f27051f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f27047b * i21) + cVar5.f27048c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i28);
    }

    public void B() {
        C3878c c3878c = this.f27039t;
        if (c3878c != null) {
            c3878c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.O
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.O
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.O
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f27046a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean G(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean H() {
        C3878c c3878c = this.f27039t;
        return c3878c != null && c3878c.B();
    }

    public boolean I() {
        C3878c c3878c = this.f27039t;
        return c3878c != null && c3878c.D();
    }

    public boolean J() {
        C3878c c3878c = this.f27039t;
        return c3878c != null && c3878c.E();
    }

    public boolean K() {
        return this.f27038s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f27035p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f27040u = aVar;
        this.f27041v = aVar2;
    }

    public boolean P() {
        C3878c c3878c = this.f27039t;
        return c3878c != null && c3878c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f27035p.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f27035p = eVar;
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f27035p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f27035p = eVar;
            eVar.S(new d());
            C3878c c3878c = new C3878c(context);
            this.f27039t = c3878c;
            c3878c.J(true);
            C3878c c3878c2 = this.f27039t;
            j.a bVar = this.f27040u;
            if (bVar == null) {
                bVar = new b();
            }
            c3878c2.h(bVar);
            this.f27035p.c(this.f27039t, this.f27036q);
            this.f27039t.H(this);
        }
        return this.f27035p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f27039t.A();
    }

    public int getPopupTheme() {
        return this.f27037r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3878c c3878c = this.f27039t;
        if (c3878c != null) {
            c3878c.d(false);
            if (this.f27039t.E()) {
                this.f27039t.B();
                this.f27039t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.O, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f27042w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = i0.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f27046a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i18);
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
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f27046a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f27046a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.O, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f27042w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f27042w = z11;
        if (z10 != z11) {
            this.f27043x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f27042w && (eVar = this.f27035p) != null && size != this.f27043x) {
            this.f27043x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f27042w && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f27039t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f27034A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f27039t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f27038s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f27037r != i10) {
            this.f27037r = i10;
            if (i10 == 0) {
                this.f27036q = getContext();
            } else {
                this.f27036q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C3878c c3878c) {
        this.f27039t = c3878c;
        c3878c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f27044y = (int) (56.0f * f10);
        this.f27045z = (int) (f10 * 4.0f);
        this.f27036q = context;
        this.f27037r = 0;
    }
}
