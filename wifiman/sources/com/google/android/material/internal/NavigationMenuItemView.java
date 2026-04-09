package com.google.android.material.internal;

import F1.C2736a;
import F1.W;
import G1.t;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.g0;
import h.AbstractC5927a;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* renamed from: G, reason: collision with root package name */
    private static final int[] f37484G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private FrameLayout f37485A;

    /* renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f37486B;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f37487C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f37488D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f37489E;

    /* renamed from: F, reason: collision with root package name */
    private final C2736a f37490F;

    /* renamed from: v, reason: collision with root package name */
    private int f37491v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f37492w;

    /* renamed from: x, reason: collision with root package name */
    boolean f37493x;

    /* renamed from: y, reason: collision with root package name */
    boolean f37494y;

    /* renamed from: z, reason: collision with root package name */
    private final CheckedTextView f37495z;

    class a extends C2736a {
        a() {
        }

        @Override // F1.C2736a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.e0(NavigationMenuItemView.this.f37493x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f37495z.setVisibility(8);
            FrameLayout frameLayout = this.f37485A;
            if (frameLayout != null) {
                O.a aVar = (O.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f37485A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f37495z.setVisibility(0);
        FrameLayout frameLayout2 = this.f37485A;
        if (frameLayout2 != null) {
            O.a aVar2 = (O.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f37485A.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC5927a.f47957t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f37484G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f37486B.getTitle() == null && this.f37486B.getIcon() == null && this.f37486B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f37485A == null) {
                this.f37485A = (FrameLayout) ((ViewStub) findViewById(O3.e.f17075e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f37485A.removeAllViews();
            this.f37485A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f37486B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            W.q0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        g0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f37486B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f37486B;
        if (gVar != null && gVar.isCheckable() && this.f37486B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f37484G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f37493x != z10) {
            this.f37493x = z10;
            this.f37490F.l(this.f37495z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f37495z.setChecked(z10);
        CheckedTextView checkedTextView = this.f37495z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f37494y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f37488D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC8416a.r(drawable).mutate();
                AbstractC8416a.o(drawable, this.f37487C);
            }
            int i10 = this.f37491v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f37492w) {
            if (this.f37489E == null) {
                Drawable drawableE = v1.h.e(getResources(), O3.d.f17054j, getContext().getTheme());
                this.f37489E = drawableE;
                if (drawableE != null) {
                    int i11 = this.f37491v;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f37489E;
        }
        androidx.core.widget.h.i(this.f37495z, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f37495z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f37491v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f37487C = colorStateList;
        this.f37488D = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f37486B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f37495z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f37492w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.h.o(this.f37495z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f37495z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f37495z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37494y = true;
        a aVar = new a();
        this.f37490F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(O3.g.f17098a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(O3.c.f17020b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(O3.e.f17076f);
        this.f37495z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        W.m0(checkedTextView, aVar);
    }
}
