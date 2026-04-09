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
import androidx.cardview.widget.CardView;
import bk.f;
import ed.b;
import ed.k;
import ed.l;
import ee.g;
import ee.i;
import ee.v;
import le.a;
import nd.c;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, v {
    public static final int[] H = {R.attr.state_checkable};
    public static final int[] I = {R.attr.state_checked};
    public static final int[] J = {b.state_dragged};
    public static final int K = k.Widget_MaterialComponents_CardView;
    public final c D;
    public final boolean E;
    public boolean F;
    public boolean G;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        int i10 = b.materialCardViewStyle;
        int i11 = K;
        super(a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.F = false;
        this.G = false;
        this.E = true;
        TypedArray typedArrayD = xd.k.d(getContext(), attributeSet, l.MaterialCardView, i10, i11, new int[0]);
        c cVar = new c(this, attributeSet, i10);
        this.D = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        i iVar = cVar.f17498c;
        iVar.q(cardBackgroundColor);
        cVar.f17497b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f17496a;
        ColorStateList colorStateListQ = xu.l.q(materialCardView.getContext(), typedArrayD, l.MaterialCardView_strokeColor);
        cVar.f17507n = colorStateListQ;
        if (colorStateListQ == null) {
            cVar.f17507n = ColorStateList.valueOf(-1);
        }
        cVar.f17503h = typedArrayD.getDimensionPixelSize(l.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArrayD.getBoolean(l.MaterialCardView_android_checkable, false);
        cVar.f17512s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f17505l = xu.l.q(materialCardView.getContext(), typedArrayD, l.MaterialCardView_checkedIconTint);
        cVar.g(xu.l.t(materialCardView.getContext(), typedArrayD, l.MaterialCardView_checkedIcon));
        cVar.f17501f = typedArrayD.getDimensionPixelSize(l.MaterialCardView_checkedIconSize, 0);
        cVar.f17500e = typedArrayD.getDimensionPixelSize(l.MaterialCardView_checkedIconMargin, 0);
        cVar.f17502g = typedArrayD.getInteger(l.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListQ2 = xu.l.q(materialCardView.getContext(), typedArrayD, l.MaterialCardView_rippleColor);
        cVar.k = colorStateListQ2;
        if (colorStateListQ2 == null) {
            cVar.k = ColorStateList.valueOf(io.sentry.config.a.V(materialCardView, h.a.colorControlHighlight));
        }
        ColorStateList colorStateListQ3 = xu.l.q(materialCardView.getContext(), typedArrayD, l.MaterialCardView_cardForegroundColor);
        colorStateListQ3 = colorStateListQ3 == null ? ColorStateList.valueOf(0) : colorStateListQ3;
        i iVar2 = cVar.f17499d;
        iVar2.q(colorStateListQ3);
        RippleDrawable rippleDrawable = cVar.f17508o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.k);
        }
        iVar.p(materialCardView.getCardElevation());
        float f10 = cVar.f17503h;
        ColorStateList colorStateList = cVar.f17507n;
        iVar2.f8117d.k = f10;
        iVar2.invalidateSelf();
        g gVar = iVar2.f8117d;
        if (gVar.f8101e != colorStateList) {
            gVar.f8101e = colorStateList;
            iVar2.onStateChange(iVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(iVar));
        Drawable drawableC = cVar.j() ? cVar.c() : iVar2;
        cVar.f17504i = drawableC;
        materialCardView.setForeground(cVar.d(drawableC));
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.D.f17498c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.D).f17508o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        cVar.f17508o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        cVar.f17508o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.D.f17498c.f8117d.f8100d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.D.f17499d.f8117d.f8100d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.D.j;
    }

    public int getCheckedIconGravity() {
        return this.D.f17502g;
    }

    public int getCheckedIconMargin() {
        return this.D.f17500e;
    }

    public int getCheckedIconSize() {
        return this.D.f17501f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.D.f17505l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.D.f17497b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.D.f17497b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.D.f17497b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.D.f17497b.top;
    }

    public float getProgress() {
        return this.D.f17498c.f8117d.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.D.f17498c.k();
    }

    public ColorStateList getRippleColor() {
        return this.D.k;
    }

    public ee.l getShapeAppearanceModel() {
        return this.D.f17506m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.D.f17507n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.D.f17507n;
    }

    public int getStrokeWidth() {
        return this.D.f17503h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.D;
        cVar.k();
        se.b.U(this, cVar.f17498c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.D;
        if (cVar != null && cVar.f17512s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H);
        }
        if (this.F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        if (this.G) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.F);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.D;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f17512s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.F);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.D.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.E) {
            c cVar = this.D;
            if (!cVar.f17511r) {
                cVar.f17511r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.D.f17498c.q(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.D;
        cVar.f17498c.p(cVar.f17496a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        i iVar = this.D.f17499d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        iVar.q(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.D.f17512s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.F != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.D.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.D;
        if (cVar.f17502g != i10) {
            cVar.f17502g = i10;
            MaterialCardView materialCardView = cVar.f17496a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.D.f17500e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.D.f17500e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.D.g(ic.a.r(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.D.f17501f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.D.f17501f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.D;
        cVar.f17505l = colorStateList;
        Drawable drawable = cVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.D;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void setDragged(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.D.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.D;
        cVar.m();
        cVar.l();
    }

    public void setProgress(float f10) {
        c cVar = this.D;
        cVar.f17498c.r(f10);
        i iVar = cVar.f17499d;
        if (iVar != null) {
            iVar.r(f10);
        }
        i iVar2 = cVar.f17510q;
        if (iVar2 != null) {
            iVar2.r(f10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        c cVar = this.D;
        f fVarG = cVar.f17506m.g();
        fVarG.f2807e = new ee.a(f10);
        fVarG.f2808f = new ee.a(f10);
        fVarG.f2809g = new ee.a(f10);
        fVarG.f2810h = new ee.a(f10);
        cVar.h(fVarG.b());
        cVar.f17504i.invalidateSelf();
        if (cVar.i() || (cVar.f17496a.getPreventCornerOverlap() && !cVar.f17498c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.D;
        cVar.k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f17508o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) throws Resources.NotFoundException {
        ColorStateList colorStateListC = h3.c.c(getContext(), i10);
        c cVar = this.D;
        cVar.k = colorStateListC;
        RippleDrawable rippleDrawable = cVar.f17508o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListC);
        }
    }

    @Override // ee.v
    public void setShapeAppearanceModel(ee.l lVar) {
        setClipToOutline(lVar.f(getBoundsAsRectF()));
        this.D.h(lVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.D;
        if (i10 != cVar.f17503h) {
            cVar.f17503h = i10;
            i iVar = cVar.f17499d;
            ColorStateList colorStateList = cVar.f17507n;
            iVar.f8117d.k = i10;
            iVar.invalidateSelf();
            g gVar = iVar.f8117d;
            if (gVar.f8101e != colorStateList) {
                gVar.f8101e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.D;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.D;
        if (cVar != null && cVar.f17512s && isEnabled()) {
            this.F = !this.F;
            refreshDrawableState();
            b();
            cVar.f(this.F, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.D;
        if (cVar.f17507n != colorStateList) {
            cVar.f17507n = colorStateList;
            i iVar = cVar.f17499d;
            iVar.f8117d.k = cVar.f17503h;
            iVar.invalidateSelf();
            g gVar = iVar.f8117d;
            if (gVar.f8101e != colorStateList) {
                gVar.f8101e = colorStateList;
                iVar.onStateChange(iVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.D.f17498c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(nd.a aVar) {
    }
}
