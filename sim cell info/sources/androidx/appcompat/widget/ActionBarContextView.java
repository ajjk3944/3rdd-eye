package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f697j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f698k;

    /* renamed from: l, reason: collision with root package name */
    private View f699l;

    /* renamed from: m, reason: collision with root package name */
    private View f700m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f701n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f702o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f703p;

    /* renamed from: q, reason: collision with root package name */
    private int f704q;

    /* renamed from: r, reason: collision with root package name */
    private int f705r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f706s;

    /* renamed from: t, reason: collision with root package name */
    private int f707t;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f708b;

        a(f.b bVar) {
            this.f708b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f708b.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.f9j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0 w0VarT = w0.t(context, attributeSet, a.j.f174y, i2, 0);
        a0.s.R(this, w0VarT.f(a.j.f175z));
        this.f704q = w0VarT.m(a.j.D, 0);
        this.f705r = w0VarT.m(a.j.C, 0);
        this.f864f = w0VarT.l(a.j.B, 0);
        this.f707t = w0VarT.m(a.j.A, a.g.f101d);
        w0VarT.u();
    }

    private void i() {
        if (this.f701n == null) {
            LayoutInflater.from(getContext()).inflate(a.g.f98a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f701n = linearLayout;
            this.f702o = (TextView) linearLayout.findViewById(a.f.f76e);
            this.f703p = (TextView) this.f701n.findViewById(a.f.f75d);
            if (this.f704q != 0) {
                this.f702o.setTextAppearance(getContext(), this.f704q);
            }
            if (this.f705r != 0) {
                this.f703p.setTextAppearance(getContext(), this.f705r);
            }
        }
        this.f702o.setText(this.f697j);
        this.f703p.setText(this.f698k);
        boolean z2 = !TextUtils.isEmpty(this.f697j);
        boolean z3 = !TextUtils.isEmpty(this.f698k);
        int i2 = 0;
        this.f703p.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f701n;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f701n.getParent() == null) {
            addView(this.f701n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ a0.w f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.f699l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f698k;
    }

    public CharSequence getTitle() {
        return this.f697j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(f.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f699l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f707t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f699l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f699l
            goto L15
        L22:
            android.view.View r0 = r3.f699l
            int r1 = a.f.f80i
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f863e
            if (r0 == 0) goto L3f
            r0.x()
        L3f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f863e = r0
            r1 = 1
            r0.I(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f863e
            android.content.Context r2 = r3.f861c
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f863e
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f862d = r4
            r1 = 0
            a0.s.R(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f862d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(f.b):void");
    }

    public boolean j() {
        return this.f706s;
    }

    public void k() {
        removeAllViews();
        this.f700m = null;
        this.f862d = null;
    }

    public boolean l() {
        c cVar = this.f863e;
        if (cVar != null) {
            return cVar.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f863e;
        if (cVar != null) {
            cVar.A();
            this.f863e.B();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f697j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zB = c1.b(this);
        int paddingRight = zB ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f699l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f699l.getLayoutParams();
            int i6 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i6, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f699l, iD, paddingTop, paddingTop2, zB), i7, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f701n;
        if (linearLayout != null && this.f700m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f701n, iE, paddingTop, paddingTop2, zB);
        }
        int i8 = iE;
        View view2 = this.f700m;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f862d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f864f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f699l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f699l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f862d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f862d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f701n;
        if (linearLayout != null && this.f700m == null) {
            if (this.f706s) {
                this.f701n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f701n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f701n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f700m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f700m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f864f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f864f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f700m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f700m = view;
        if (view != null && (linearLayout = this.f701n) != null) {
            removeView(linearLayout);
            this.f701n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f698k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f697j = charSequence;
        i();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f706s) {
            requestLayout();
        }
        this.f706s = z2;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
