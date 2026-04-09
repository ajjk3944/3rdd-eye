package com.google.android.material.internal;

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
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.e1;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import org.xbill.DNS.KEYRecord;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends j implements i.a {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public androidx.appcompat.view.menu.f B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final androidx.core.view.a F;

    /* renamed from: v, reason: collision with root package name */
    public int f10603v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10604w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10605x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10606y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f10607z;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, s0.x xVar) {
            super.g(view, xVar);
            xVar.k0(NavigationMenuItemView.this.f10605x);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(j4.f.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public final StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(c.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void B(androidx.appcompat.view.menu.f fVar, boolean z10) {
        this.f10606y = z10;
        c(fVar, 0);
    }

    public void C() {
        FrameLayout frameLayout = this.A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f10607z.setCompoundDrawables(null, null, null, null);
    }

    public final boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void c(androidx.appcompat.view.menu.f fVar, int i10) {
        this.B = fVar;
        if (fVar.getItemId() > 0) {
            setId(fVar.getItemId());
        }
        setVisibility(fVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(fVar.isCheckable());
        setChecked(fVar.isChecked());
        setEnabled(fVar.isEnabled());
        setTitle(fVar.getTitle());
        setIcon(fVar.getIcon());
        setActionView(fVar.getActionView());
        setContentDescription(fVar.getContentDescription());
        e1.a(this, fVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public androidx.appcompat.view.menu.f getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.f fVar = this.B;
        if (fVar != null && fVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f10605x != z10) {
            this.f10605x = z10;
            this.F.l(this.f10607z, KEYRecord.Flags.FLAG4);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f10607z.setChecked(z10);
        CheckedTextView checkedTextView = this.f10607z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f10606y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = k0.a.r(drawable).mutate();
                drawable.setTintList(this.C);
            }
            int i10 = this.f10603v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f10604w) {
            if (this.E == null) {
                Drawable drawableE = androidx.core.content.res.a.e(getResources(), j4.e.navigation_empty_icon, getContext().getTheme());
                this.E = drawableE;
                if (drawableE != null) {
                    int i11 = this.f10603v;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.E;
        }
        this.f10607z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f10607z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@Dimension int i10) {
        this.f10603v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        androidx.appcompat.view.menu.f fVar = this.B;
        if (fVar != null) {
            setIcon(fVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f10607z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f10604w = z10;
    }

    public void setTextAppearance(int i10) {
        TextViewCompat.m(this.f10607z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10607z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10607z.setText(charSequence);
    }

    public final void z() {
        if (D()) {
            this.f10607z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f10607z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10606y = true;
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(j4.h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(j4.d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(j4.f.design_menu_item_text);
        this.f10607z = checkedTextView;
        ViewCompat.j0(checkedTextView, aVar);
    }
}
