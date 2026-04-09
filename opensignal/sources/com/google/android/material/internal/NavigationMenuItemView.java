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
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.datepicker.k;
import ed.d;
import ed.e;
import ed.f;
import ed.h;
import o.o;
import o.z;
import p.m1;
import u3.i0;
import xd.c;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends c implements z {

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f5662f0 = {R.attr.state_checked};
    public int R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public final CheckedTextView V;
    public FrameLayout W;

    /* renamed from: a0, reason: collision with root package name */
    public o f5663a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f5664b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5665c0;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f5666d0;

    /* renamed from: e0, reason: collision with root package name */
    public final k f5667e0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = true;
        k kVar = new k(5, this);
        this.f5667e0 = kVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.V = checkedTextView;
        i0.n(checkedTextView, kVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.W == null) {
                this.W = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.W.removeAllViews();
            this.W.addView(view);
        }
    }

    @Override // o.z
    public final void a(o oVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f5663a0 = oVar;
        int i10 = oVar.f18638a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(h.a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f5662f0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f18642e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f18652q);
        y3.N(this, oVar.f18653r);
        o oVar2 = this.f5663a0;
        CharSequence charSequence = oVar2.f18642e;
        CheckedTextView checkedTextView = this.V;
        if (charSequence == null && oVar2.getIcon() == null && this.f5663a0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                m1 m1Var = (m1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) m1Var).width = -1;
                this.W.setLayoutParams(m1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.W;
        if (frameLayout2 != null) {
            m1 m1Var2 = (m1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) m1Var2).width = -2;
            this.W.setLayoutParams(m1Var2);
        }
    }

    @Override // o.z
    public o getItemData() {
        return this.f5663a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        o oVar = this.f5663a0;
        if (oVar != null && oVar.isCheckable() && this.f5663a0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5662f0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.T != z10) {
            this.T = z10;
            this.f5667e0.h(this.V, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.V;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.U) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f5665c0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f5664b0);
            }
            int i10 = this.R;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.S) {
            if (this.f5666d0 == null) {
                Resources resources = getResources();
                int i11 = e.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = j3.k.f13193a;
                Drawable drawable2 = resources.getDrawable(i11, theme);
                this.f5666d0 = drawable2;
                if (drawable2 != null) {
                    int i12 = this.R;
                    drawable2.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.f5666d0;
        }
        this.V.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.V.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.R = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f5664b0 = colorStateList;
        this.f5665c0 = colorStateList != null;
        o oVar = this.f5663a0;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.V.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.S = z10;
    }

    public void setTextAppearance(int i10) {
        this.V.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.V.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.V.setText(charSequence);
    }
}
