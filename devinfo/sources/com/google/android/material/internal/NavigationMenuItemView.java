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
import com.google.android.material.datepicker.j;
import e4.v0;
import o.o;
import o.z;
import p.t1;
import pd.b;
import u3.k;
import zc.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends e implements z {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public o B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final j F;

    /* renamed from: v, reason: collision with root package name */
    public int f20537v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20538w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20539x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20540y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f20541z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20540y = true;
        j jVar = new j(5, this);
        this.F = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.liuzh.deviceinfo.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.liuzh.deviceinfo.R.id.design_menu_item_text);
        this.f20541z = checkedTextView;
        v0.o(checkedTextView, jVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(com.liuzh.deviceinfo.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // o.z
    public final void a(o oVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.B = oVar;
        int i4 = oVar.f30263a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.liuzh.deviceinfo.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f30267e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f30277q);
        b.s(this, oVar.f30278r);
        o oVar2 = this.B;
        CharSequence charSequence = oVar2.f30267e;
        CheckedTextView checkedTextView = this.f20541z;
        if (charSequence == null && oVar2.getIcon() == null && this.B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                t1 t1Var = (t1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) t1Var).width = -1;
                this.A.setLayoutParams(t1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            t1 t1Var2 = (t1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) t1Var2).width = -2;
            this.A.setLayoutParams(t1Var2);
        }
    }

    @Override // o.z
    public o getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        o oVar = this.B;
        if (oVar != null && oVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f20539x != z3) {
            this.f20539x = z3;
            this.F.h(this.f20541z, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f20541z;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f20540y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i4 = this.f20537v;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f20538w) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = k.f35091a;
                Drawable drawable2 = resources.getDrawable(com.liuzh.deviceinfo.R.drawable.navigation_empty_icon, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f20537v;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.E;
        }
        this.f20541z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.f20541z.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f20537v = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.C = colorStateList;
        this.D = colorStateList != null;
        o oVar = this.B;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f20541z.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f20538w = z3;
    }

    public void setTextAppearance(int i4) {
        this.f20541z.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f20541z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f20541z.setText(charSequence);
    }
}
