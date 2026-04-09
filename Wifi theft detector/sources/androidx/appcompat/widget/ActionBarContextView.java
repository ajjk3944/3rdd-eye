package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f815i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f816j;

    /* renamed from: k, reason: collision with root package name */
    public View f817k;

    /* renamed from: l, reason: collision with root package name */
    public View f818l;

    /* renamed from: m, reason: collision with root package name */
    public View f819m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f820n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f821o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f822p;

    /* renamed from: q, reason: collision with root package name */
    public int f823q;

    /* renamed from: r, reason: collision with root package name */
    public int f824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f825s;

    /* renamed from: t, reason: collision with root package name */
    public int f826t;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h.b f827a;

        public a(h.b bVar) {
            this.f827a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f827a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.g1 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f817k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
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
        return this.f816j;
    }

    public CharSequence getTitle() {
        return this.f815i;
    }

    public void h(h.b bVar) {
        View view = this.f817k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f826t, (ViewGroup) this, false);
            this.f817k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f817k);
        }
        View viewFindViewById = this.f817k.findViewById(c.f.action_mode_close_button);
        this.f818l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f1088d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1088d = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        dVar.c(this.f1088d, this.f1086b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1088d.q(this);
        this.f1087c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1087c, layoutParams);
    }

    public final void i() {
        if (this.f820n == null) {
            LayoutInflater.from(getContext()).inflate(c.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f820n = linearLayout;
            this.f821o = (TextView) linearLayout.findViewById(c.f.action_bar_title);
            this.f822p = (TextView) this.f820n.findViewById(c.f.action_bar_subtitle);
            if (this.f823q != 0) {
                this.f821o.setTextAppearance(getContext(), this.f823q);
            }
            if (this.f824r != 0) {
                this.f822p.setTextAppearance(getContext(), this.f824r);
            }
        }
        this.f821o.setText(this.f815i);
        this.f822p.setText(this.f816j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f815i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f816j);
        this.f822p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f820n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f820n.getParent() == null) {
            addView(this.f820n);
        }
    }

    public boolean j() {
        return this.f825s;
    }

    public void k() {
        removeAllViews();
        this.f819m = null;
        this.f1087c = null;
        this.f1088d = null;
        View view = this.f818l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f1088d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1088d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f1088d.E();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = k1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f817k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f817k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f817k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f820n;
        if (linearLayout != null && this.f819m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f820n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f819m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1087c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1089e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f817k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f817k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1087c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1087c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f820n;
        if (linearLayout != null && this.f819m == null) {
            if (this.f825s) {
                this.f820n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f820n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f820n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f819m;
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
            this.f819m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1089e > 0) {
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

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1089e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f819m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f819m = view;
        if (view != null && (linearLayout = this.f820n) != null) {
            removeView(linearLayout);
            this.f820n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f816j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f815i = charSequence;
        i();
        ViewCompat.l0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f825s) {
            requestLayout();
        }
        this.f825s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        z0 z0VarV = z0.v(context, attributeSet, c.j.ActionMode, i10, 0);
        setBackground(z0VarV.g(c.j.ActionMode_background));
        this.f823q = z0VarV.n(c.j.ActionMode_titleTextStyle, 0);
        this.f824r = z0VarV.n(c.j.ActionMode_subtitleTextStyle, 0);
        this.f1089e = z0VarV.m(c.j.ActionMode_height, 0);
        this.f826t = z0VarV.n(c.j.ActionMode_closeItemLayout, c.g.abc_action_mode_close_item_material);
        z0VarV.x();
    }
}
