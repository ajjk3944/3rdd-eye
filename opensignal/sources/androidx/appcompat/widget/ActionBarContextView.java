package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.e0;
import h.f;
import h.j;
import h7.g;
import o.a0;
import o.m;
import p.z2;
import u3.i0;
import u3.l0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public boolean B;
    public boolean D;
    public CharSequence E;
    public CharSequence F;
    public View G;
    public View H;
    public View I;
    public LinearLayout J;
    public TextView K;
    public TextView L;
    public final int M;
    public final int N;
    public boolean O;
    public final int P;

    /* renamed from: a, reason: collision with root package name */
    public final g f939a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f940d;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f941g;

    /* renamed from: r, reason: collision with root package name */
    public b f942r;

    /* renamed from: x, reason: collision with root package name */
    public int f943x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f944y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i10 = h.a.actionModeStyle;
        super(context, attributeSet, i10);
        g gVar = new g();
        gVar.f10068c = this;
        gVar.f10067b = false;
        this.f939a = gVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(h.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f940d = context;
        } else {
            this.f940d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMode, i10, 0);
        int i11 = j.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i11) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i11) : ic.a.r(context, resourceId));
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_titleTextStyle, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_subtitleTextStyle, 0);
        this.f943x = typedArrayObtainStyledAttributes.getLayoutDimension(j.ActionMode_height, 0);
        this.P = typedArrayObtainStyledAttributes.getResourceId(j.ActionMode_closeItemLayout, h.g.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(n.a aVar) {
        View view = this.G;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.P, (ViewGroup) this, false);
            this.G = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.G);
        }
        View viewFindViewById = this.G.findViewById(f.action_mode_close_button);
        this.H = viewFindViewById;
        viewFindViewById.setOnClickListener(new e0(4, aVar));
        m mVarE = aVar.e();
        b bVar = this.f942r;
        if (bVar != null) {
            bVar.g();
            p.f fVar = bVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f18681i.dismiss();
            }
        }
        b bVar2 = new b(getContext());
        this.f942r = bVar2;
        bVar2.I = true;
        bVar2.J = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVarE.b(this.f942r, this.f940d);
        b bVar3 = this.f942r;
        a0 a0Var = bVar3.D;
        if (a0Var == null) {
            a0 a0Var2 = (a0) bVar3.f1046r.inflate(bVar3.f1048y, (ViewGroup) this, false);
            bVar3.D = a0Var2;
            a0Var2.b(bVar3.f1045g);
            bVar3.b(true);
        }
        a0 a0Var3 = bVar3.D;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(bVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f941g = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f941g, layoutParams);
    }

    public final void d() {
        if (this.J == null) {
            LayoutInflater.from(getContext()).inflate(h.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.J = linearLayout;
            this.K = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.L = (TextView) this.J.findViewById(f.action_bar_subtitle);
            int i10 = this.M;
            if (i10 != 0) {
                this.K.setTextAppearance(getContext(), i10);
            }
            int i11 = this.N;
            if (i11 != 0) {
                this.L.setTextAppearance(getContext(), i11);
            }
        }
        this.K.setText(this.E);
        this.L.setText(this.F);
        boolean zIsEmpty = TextUtils.isEmpty(this.E);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.F);
        this.L.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.J.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.J.getParent() == null) {
            addView(this.J);
        }
    }

    public final void e() {
        removeAllViews();
        this.I = null;
        this.f941g = null;
        this.f942r = null;
        View view = this.H;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f944y != null ? this.f939a.f10066a : getVisibility();
    }

    public int getContentHeight() {
        return this.f943x;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            l0 l0Var = this.f944y;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final l0 i(int i10, long j) {
        l0 l0Var = this.f944y;
        if (l0Var != null) {
            l0Var.b();
        }
        g gVar = this.f939a;
        if (i10 != 0) {
            l0 l0VarA = i0.a(this);
            l0VarA.a(0.0f);
            l0VarA.c(j);
            ((ActionBarContextView) gVar.f10068c).f944y = l0VarA;
            gVar.f10066a = i10;
            l0VarA.d(gVar);
            return l0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        l0 l0VarA2 = i0.a(this);
        l0VarA2.a(1.0f);
        l0VarA2.c(j);
        ((ActionBarContextView) gVar.f10068c).f944y = l0VarA2;
        gVar.f10066a = i10;
        l0VarA2.d(gVar);
        return l0VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, j.ActionBar, h.a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        b bVar = this.f942r;
        if (bVar != null) {
            Configuration configuration2 = bVar.f1044d.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            bVar.M = (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || (i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960)) ? 5 : (i10 >= 500 || (i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640)) ? 4 : i10 >= 360 ? 3 : 2;
            m mVar = bVar.f1045g;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f942r;
        if (bVar != null) {
            bVar.g();
            p.f fVar = this.f942r.Q;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f18681i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = z2.f20220a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.G;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            int i14 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z12 ? paddingRight - i14 : paddingRight + i14;
            int iG = g(i16, paddingTop, paddingTop2, this.G, z12) + i16;
            paddingRight = z12 ? iG - i15 : iG + i15;
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null && this.I == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.J, z12);
        }
        View view2 = this.I;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z12);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f941g;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f943x;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.G;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f941g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f941g, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null && this.I == null) {
            if (this.O) {
                this.J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.J.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.J.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.I;
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
            this.I.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f943x > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
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

    public void setContentHeight(int i10) {
        this.f943x = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        if (view != null && (linearLayout = this.J) != null) {
            removeView(linearLayout);
            this.J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.F = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        d();
        i0.o(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.O) {
            requestLayout();
        }
        this.O = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
