package com.google.android.material.internal;

import I.l;
import J3.e;
import R.O;
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
import d5.y;
import n.m;
import n.x;
import o.C2739t0;
import x3.AbstractC2999d;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC2999d implements x {

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f18388U = {R.attr.state_checked};

    /* renamed from: J, reason: collision with root package name */
    public int f18389J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f18390K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f18391L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public final CheckedTextView f18392N;

    /* renamed from: O, reason: collision with root package name */
    public FrameLayout f18393O;

    /* renamed from: P, reason: collision with root package name */
    public m f18394P;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f18395Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f18396R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f18397S;

    /* renamed from: T, reason: collision with root package name */
    public final e f18398T;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = true;
        e eVar = new e(5, this);
        this.f18398T = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.apm.insight.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.apm.insight.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.apm.insight.R.id.design_menu_item_text);
        this.f18392N = checkedTextView;
        O.m(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f18393O == null) {
                this.f18393O = (FrameLayout) ((ViewStub) findViewById(com.apm.insight.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f18393O.removeAllViews();
            this.f18393O.addView(view);
        }
    }

    @Override // n.x
    public final void a(m mVar) {
        StateListDrawable stateListDrawable;
        this.f18394P = mVar;
        int i = mVar.f22106a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(mVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.apm.insight.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f18388U, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setTitle(mVar.f22110e);
        setIcon(mVar.getIcon());
        setActionView(mVar.getActionView());
        setContentDescription(mVar.f22094E);
        y.r(this, mVar.f22095F);
        m mVar2 = this.f18394P;
        CharSequence charSequence = mVar2.f22110e;
        CheckedTextView checkedTextView = this.f18392N;
        if (charSequence == null && mVar2.getIcon() == null && this.f18394P.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f18393O;
            if (frameLayout != null) {
                C2739t0 c2739t0 = (C2739t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c2739t0).width = -1;
                this.f18393O.setLayoutParams(c2739t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f18393O;
        if (frameLayout2 != null) {
            C2739t0 c2739t02 = (C2739t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c2739t02).width = -2;
            this.f18393O.setLayoutParams(c2739t02);
        }
    }

    @Override // n.x
    public m getItemData() {
        return this.f18394P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        m mVar = this.f18394P;
        if (mVar != null && mVar.isCheckable() && this.f18394P.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18388U);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f18391L != z6) {
            this.f18391L = z6;
            this.f18398T.h(this.f18392N, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f18392N;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.M) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f18396R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f18395Q);
            }
            int i = this.f18389J;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f18390K) {
            if (this.f18397S == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f1870a;
                Drawable drawable2 = resources.getDrawable(com.apm.insight.R.drawable.navigation_empty_icon, theme);
                this.f18397S = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f18389J;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f18397S;
        }
        this.f18392N.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f18392N.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f18389J = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f18395Q = colorStateList;
        this.f18396R = colorStateList != null;
        m mVar = this.f18394P;
        if (mVar != null) {
            setIcon(mVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f18392N.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f18390K = z6;
    }

    public void setTextAppearance(int i) {
        this.f18392N.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f18392N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18392N.setText(charSequence);
    }
}
