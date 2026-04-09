package com.google.android.material.internal;

import B0.g;
import D0.a;
import L0.C0770a;
import L0.I;
import L0.S;
import M0.g;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import d4.d;
import java.util.WeakHashMap;
import o.a0;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f22980H = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final CheckedTextView f22981A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f22982B;

    /* renamed from: C, reason: collision with root package name */
    public h f22983C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f22984D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22985E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f22986F;

    /* renamed from: G, reason: collision with root package name */
    public final a f22987G;

    /* renamed from: w, reason: collision with root package name */
    public int f22988w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22989x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22990y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f22991z;

    public class a extends C0770a {
        public a() {
        }

        @Override // L0.C0770a
        public final void d(View view, g gVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
            AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f22990y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f22991z = true;
        a aVar = new a();
        this.f22987G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.design_menu_item_text);
        this.f22981A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        I.o(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f22982B == null) {
                this.f22982B = (FrameLayout) ((ViewStub) findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f22982B.removeAllViews();
            this.f22982B.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f22983C;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void i(h hVar) {
        StateListDrawable stateListDrawable;
        this.f22983C = hVar;
        int i = hVar.f14460a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f22980H, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f14464e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f14475q);
        a0.a(this, hVar.f14476r);
        h hVar2 = this.f22983C;
        CharSequence charSequence = hVar2.f14464e;
        CheckedTextView checkedTextView = this.f22981A;
        if (charSequence == null && hVar2.getIcon() == null && this.f22983C.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f22982B;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f22982B.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f22982B;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f22982B.setLayoutParams(aVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.f22983C;
        if (hVar != null && hVar.isCheckable() && this.f22983C.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22980H);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f22990y != z10) {
            this.f22990y = z10;
            this.f22987G.h(this.f22981A, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f22981A;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f22991z) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f22985E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.C0009a.h(drawable, this.f22984D);
            }
            int i = this.f22988w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f22989x) {
            if (this.f22986F == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
                Drawable drawableA = g.a.a(resources, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.navigation_empty_icon, theme);
                this.f22986F = drawableA;
                if (drawableA != null) {
                    int i10 = this.f22988w;
                    drawableA.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f22986F;
        }
        this.f22981A.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f22981A.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f22988w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f22984D = colorStateList;
        this.f22985E = colorStateList != null;
        h hVar = this.f22983C;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f22981A.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f22989x = z10;
    }

    public void setTextAppearance(int i) {
        this.f22981A.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f22981A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f22981A.setText(charSequence);
    }
}
