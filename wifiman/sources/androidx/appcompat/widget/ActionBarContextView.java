package androidx.appcompat.widget;

import F1.C2745e0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import h.AbstractC5927a;
import h.AbstractC5932f;
import h.AbstractC5933g;
import h.AbstractC5936j;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC3876a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f26982i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f26983j;

    /* renamed from: k, reason: collision with root package name */
    private View f26984k;

    /* renamed from: l, reason: collision with root package name */
    private View f26985l;

    /* renamed from: m, reason: collision with root package name */
    private View f26986m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f26987n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f26988o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f26989p;

    /* renamed from: q, reason: collision with root package name */
    private int f26990q;

    /* renamed from: r, reason: collision with root package name */
    private int f26991r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26992s;

    /* renamed from: t, reason: collision with root package name */
    private int f26993t;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f26994a;

        a(androidx.appcompat.view.b bVar) {
            this.f26994a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26994a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f26987n == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC5933g.f48054a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f26987n = linearLayout;
            this.f26988o = (TextView) linearLayout.findViewById(AbstractC5932f.f48032e);
            this.f26989p = (TextView) this.f26987n.findViewById(AbstractC5932f.f48031d);
            if (this.f26990q != 0) {
                this.f26988o.setTextAppearance(getContext(), this.f26990q);
            }
            if (this.f26991r != 0) {
                this.f26989p.setTextAppearance(getContext(), this.f26991r);
            }
        }
        this.f26988o.setText(this.f26982i);
        this.f26989p.setText(this.f26983j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f26982i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f26983j);
        this.f26989p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f26987n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f26987n.getParent() == null) {
            addView(this.f26987n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC3876a
    public /* bridge */ /* synthetic */ C2745e0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f26984k == null) {
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

    @Override // androidx.appcompat.widget.AbstractC3876a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC3876a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f26983j;
    }

    public CharSequence getTitle() {
        return this.f26982i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f26984k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f26993t, (ViewGroup) this, false);
            this.f26984k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f26984k);
        }
        View viewFindViewById = this.f26984k.findViewById(AbstractC5932f.f48036i);
        this.f26985l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C3878c c3878c = this.f27315d;
        if (c3878c != null) {
            c3878c.y();
        }
        C3878c c3878c2 = new C3878c(getContext());
        this.f27315d = c3878c2;
        c3878c2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f27315d, this.f27313b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f27315d.o(this);
        this.f27314c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f27314c, layoutParams);
    }

    public boolean j() {
        return this.f26992s;
    }

    public void k() {
        removeAllViews();
        this.f26986m = null;
        this.f27314c = null;
        this.f27315d = null;
        View view = this.f26985l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C3878c c3878c = this.f27315d;
        if (c3878c != null) {
            return c3878c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3878c c3878c = this.f27315d;
        if (c3878c != null) {
            c3878c.B();
            this.f27315d.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC3876a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = i0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f26984k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26984k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC3876a.d(paddingRight, i14, zB);
            paddingRight = AbstractC3876a.d(iD + e(this.f26984k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f26987n;
        if (linearLayout != null && this.f26986m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f26987n, iE, paddingTop, paddingTop2, zB);
        }
        int i16 = iE;
        View view2 = this.f26986m;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f27314c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f27316e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, PduHandle.NONE);
        View view = this.f26984k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26984k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f27314c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f27314c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f26987n;
        if (linearLayout != null && this.f26986m == null) {
            if (this.f26992s) {
                this.f26987n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f26987n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f26987n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f26986m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f26986m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f27316e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC3876a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC3876a
    public void setContentHeight(int i10) {
        this.f27316e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f26986m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f26986m = view;
        if (view != null && (linearLayout = this.f26987n) != null) {
            removeView(linearLayout);
            this.f26987n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f26983j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f26982i = charSequence;
        i();
        F1.W.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f26992s) {
            requestLayout();
        }
        this.f26992s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC3876a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5927a.f47944g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0 b0VarV = b0.v(context, attributeSet, AbstractC5936j.f48297y, i10, 0);
        setBackground(b0VarV.g(AbstractC5936j.f48301z));
        this.f26990q = b0VarV.n(AbstractC5936j.f48097D, 0);
        this.f26991r = b0VarV.n(AbstractC5936j.f48093C, 0);
        this.f27316e = b0VarV.m(AbstractC5936j.f48089B, 0);
        this.f26993t = b0VarV.n(AbstractC5936j.f48085A, AbstractC5933g.f48057d);
        b0VarV.x();
    }
}
