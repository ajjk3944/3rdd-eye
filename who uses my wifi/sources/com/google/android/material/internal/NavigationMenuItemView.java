package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import defpackage.aq0;
import defpackage.e61;
import defpackage.fq0;
import defpackage.ge0;
import defpackage.i21;
import defpackage.q60;
import defpackage.sb;
import defpackage.sd0;
import defpackage.zv;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends zv implements ge0 {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public sd0 G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final sb K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        sb sbVar = new sb(4, this);
        this.K = sbVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.phuongpn.whousemywifi.networkscanner.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.phuongpn.whousemywifi.networkscanner.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.design_menu_item_text);
        this.E = checkedTextView;
        e61.l(checkedTextView, sbVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // defpackage.ge0
    public final void c(sd0 sd0Var) {
        StateListDrawable stateListDrawable;
        this.G = sd0Var;
        int i = sd0Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(sd0Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.phuongpn.whousemywifi.networkscanner.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(sd0Var.isCheckable());
        setChecked(sd0Var.isChecked());
        setEnabled(sd0Var.isEnabled());
        setTitle(sd0Var.e);
        setIcon(sd0Var.getIcon());
        setActionView(sd0Var.getActionView());
        setContentDescription(sd0Var.q);
        i21.a(this, sd0Var.r);
        sd0 sd0Var2 = this.G;
        CharSequence charSequence = sd0Var2.e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && sd0Var2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                q60 q60Var = (q60) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) q60Var).width = -1;
                this.F.setLayoutParams(q60Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            q60 q60Var2 = (q60) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) q60Var2).width = -2;
            this.F.setLayoutParams(q60Var2);
        }
    }

    @Override // defpackage.ge0
    public sd0 getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        sd0 sd0Var = this.G;
        if (sd0Var != null && sd0Var.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C != z) {
            this.C = z;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
            }
            int i = this.A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = fq0.a;
                Drawable drawableA = aq0.a(resources, com.phuongpn.whousemywifi.networkscanner.R.drawable.navigation_empty_icon, theme);
                this.J = drawableA;
                if (drawableA != null) {
                    int i2 = this.A;
                    drawableA.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        sd0 sd0Var = this.G;
        if (sd0Var != null) {
            setIcon(sd0Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B = z;
    }

    public void setTextAppearance(int i) {
        this.E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
