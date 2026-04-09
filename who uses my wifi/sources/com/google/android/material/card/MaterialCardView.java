package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.dc0;
import defpackage.f2;
import defpackage.fc0;
import defpackage.gn0;
import defpackage.i41;
import defpackage.l;
import defpackage.lc0;
import defpackage.nc0;
import defpackage.ob1;
import defpackage.od;
import defpackage.ou1;
import defpackage.rv0;
import defpackage.su0;
import defpackage.uk2;
import defpackage.um;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MaterialCardView extends od implements Checkable, rv0 {
    public static final int[] q = {R.attr.state_checkable};
    public static final int[] r = {R.attr.state_checked};
    public static final int[] s = {com.phuongpn.whousemywifi.networkscanner.R.attr.state_dragged};
    public final fc0 m;
    public final boolean n;
    public boolean o;
    public boolean p;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(um.z(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.materialCardViewStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.o = false;
        this.p = false;
        this.n = true;
        TypedArray typedArrayS = uk2.s(getContext(), attributeSet, gn0.w, com.phuongpn.whousemywifi.networkscanner.R.attr.materialCardViewStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_CardView, new int[0]);
        fc0 fc0Var = new fc0(this, attributeSet);
        this.m = fc0Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        nc0 nc0Var = fc0Var.c;
        nc0Var.q(cardBackgroundColor);
        fc0Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        fc0Var.l();
        MaterialCardView materialCardView = fc0Var.a;
        ColorStateList colorStateListE = ob1.e(materialCardView.getContext(), typedArrayS, 11);
        fc0Var.n = colorStateListE;
        if (colorStateListE == null) {
            fc0Var.n = ColorStateList.valueOf(-1);
        }
        fc0Var.h = typedArrayS.getDimensionPixelSize(12, 0);
        boolean z = typedArrayS.getBoolean(0, false);
        fc0Var.s = z;
        materialCardView.setLongClickable(z);
        fc0Var.l = ob1.e(materialCardView.getContext(), typedArrayS, 6);
        fc0Var.g(ob1.i(materialCardView.getContext(), typedArrayS, 2));
        fc0Var.f = typedArrayS.getDimensionPixelSize(5, 0);
        fc0Var.e = typedArrayS.getDimensionPixelSize(4, 0);
        fc0Var.g = typedArrayS.getInteger(3, 8388661);
        ColorStateList colorStateListE2 = ob1.e(materialCardView.getContext(), typedArrayS, 7);
        fc0Var.k = colorStateListE2;
        if (colorStateListE2 == null) {
            fc0Var.k = ColorStateList.valueOf(i41.i(materialCardView, com.phuongpn.whousemywifi.networkscanner.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListE3 = ob1.e(materialCardView.getContext(), typedArrayS, 1);
        colorStateListE3 = colorStateListE3 == null ? ColorStateList.valueOf(0) : colorStateListE3;
        nc0 nc0Var2 = fc0Var.d;
        nc0Var2.q(colorStateListE3);
        RippleDrawable rippleDrawable = fc0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(fc0Var.k);
        }
        nc0Var.p(materialCardView.getCardElevation());
        float f = fc0Var.h;
        ColorStateList colorStateList = fc0Var.n;
        nc0Var2.g.k = f;
        nc0Var2.invalidateSelf();
        lc0 lc0Var = nc0Var2.g;
        if (lc0Var.e != colorStateList) {
            lc0Var.e = colorStateList;
            nc0Var2.onStateChange(nc0Var2.getState());
        }
        materialCardView.setBackgroundInternal(fc0Var.d(nc0Var));
        Drawable drawableC = fc0Var.j() ? fc0Var.c() : nc0Var2;
        fc0Var.i = drawableC;
        materialCardView.setForeground(fc0Var.d(drawableC));
        typedArrayS.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.m.c.getBounds());
        return rectF;
    }

    public final void b() {
        fc0 fc0Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (fc0Var = this.m).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        fc0Var.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        fc0Var.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.od
    public ColorStateList getCardBackgroundColor() {
        return this.m.c.g.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.m.d.g.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.m.j;
    }

    public int getCheckedIconGravity() {
        return this.m.g;
    }

    public int getCheckedIconMargin() {
        return this.m.e;
    }

    public int getCheckedIconSize() {
        return this.m.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.m.l;
    }

    @Override // defpackage.od
    public int getContentPaddingBottom() {
        return this.m.b.bottom;
    }

    @Override // defpackage.od
    public int getContentPaddingLeft() {
        return this.m.b.left;
    }

    @Override // defpackage.od
    public int getContentPaddingRight() {
        return this.m.b.right;
    }

    @Override // defpackage.od
    public int getContentPaddingTop() {
        return this.m.b.top;
    }

    public float getProgress() {
        return this.m.c.g.j;
    }

    @Override // defpackage.od
    public float getRadius() {
        return this.m.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.m.k;
    }

    public su0 getShapeAppearanceModel() {
        return this.m.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.m.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.m.n;
    }

    public int getStrokeWidth() {
        return this.m.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fc0 fc0Var = this.m;
        fc0Var.k();
        ou1.w(this, fc0Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        fc0 fc0Var = this.m;
        if (fc0Var != null && fc0Var.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (this.p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.o);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        fc0 fc0Var = this.m;
        accessibilityNodeInfo.setCheckable(fc0Var != null && fc0Var.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.o);
    }

    @Override // defpackage.od, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.m.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.n) {
            fc0 fc0Var = this.m;
            if (!fc0Var.r) {
                fc0Var.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.od
    public void setCardBackgroundColor(int i) {
        this.m.c.q(ColorStateList.valueOf(i));
    }

    @Override // defpackage.od
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        fc0 fc0Var = this.m;
        fc0Var.c.p(fc0Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        nc0 nc0Var = this.m.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        nc0Var.q(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.m.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.o != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.m.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        fc0 fc0Var = this.m;
        if (fc0Var.g != i) {
            fc0Var.g = i;
            MaterialCardView materialCardView = fc0Var.a;
            fc0Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.m.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.m.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.m.g(ob1.h(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.m.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.m.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        fc0 fc0Var = this.m;
        fc0Var.l = colorStateList;
        Drawable drawable = fc0Var.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        fc0 fc0Var = this.m;
        if (fc0Var != null) {
            fc0Var.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // defpackage.od
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.m.m();
    }

    @Override // defpackage.od
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        fc0 fc0Var = this.m;
        fc0Var.m();
        fc0Var.l();
    }

    public void setProgress(float f) {
        fc0 fc0Var = this.m;
        fc0Var.c.r(f);
        nc0 nc0Var = fc0Var.d;
        if (nc0Var != null) {
            nc0Var.r(f);
        }
        nc0 nc0Var2 = fc0Var.q;
        if (nc0Var2 != null) {
            nc0Var2.r(f);
        }
    }

    @Override // defpackage.od
    public void setRadius(float f) {
        super.setRadius(f);
        fc0 fc0Var = this.m;
        f2 f2VarF = fc0Var.m.f();
        f2VarF.e = new l(f);
        f2VarF.f = new l(f);
        f2VarF.g = new l(f);
        f2VarF.h = new l(f);
        fc0Var.h(f2VarF.a());
        fc0Var.i.invalidateSelf();
        if (fc0Var.i() || (fc0Var.a.getPreventCornerOverlap() && !fc0Var.c.n())) {
            fc0Var.l();
        }
        if (fc0Var.i()) {
            fc0Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        fc0 fc0Var = this.m;
        fc0Var.k = colorStateList;
        RippleDrawable rippleDrawable = fc0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) throws Resources.NotFoundException {
        ColorStateList colorStateListD = ob1.d(getContext(), i);
        fc0 fc0Var = this.m;
        fc0Var.k = colorStateListD;
        RippleDrawable rippleDrawable = fc0Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListD);
        }
    }

    @Override // defpackage.rv0
    public void setShapeAppearanceModel(su0 su0Var) {
        setClipToOutline(su0Var.e(getBoundsAsRectF()));
        this.m.h(su0Var);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        fc0 fc0Var = this.m;
        if (i != fc0Var.h) {
            fc0Var.h = i;
            nc0 nc0Var = fc0Var.d;
            ColorStateList colorStateList = fc0Var.n;
            nc0Var.g.k = i;
            nc0Var.invalidateSelf();
            lc0 lc0Var = nc0Var.g;
            if (lc0Var.e != colorStateList) {
                lc0Var.e = colorStateList;
                nc0Var.onStateChange(nc0Var.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.od
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        fc0 fc0Var = this.m;
        fc0Var.m();
        fc0Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        fc0 fc0Var = this.m;
        if (fc0Var != null && fc0Var.s && isEnabled()) {
            this.o = !this.o;
            refreshDrawableState();
            b();
            fc0Var.f(this.o, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        fc0 fc0Var = this.m;
        if (fc0Var.n != colorStateList) {
            fc0Var.n = colorStateList;
            nc0 nc0Var = fc0Var.d;
            nc0Var.g.k = fc0Var.h;
            nc0Var.invalidateSelf();
            lc0 lc0Var = nc0Var.g;
            if (lc0Var.e != colorStateList) {
                lc0Var.e = colorStateList;
                nc0Var.onStateChange(nc0Var.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.od
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.m.c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(dc0 dc0Var) {
    }
}
