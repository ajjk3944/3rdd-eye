package com.google.android.material.card;

import G3.j;
import G3.n;
import G3.o;
import G3.z;
import O3.a;
import a4.p;
import a4.t;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import d3.AbstractC2266a;
import m3.C2663c;
import m3.InterfaceC2661a;
import t.AbstractC2899a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialCardView extends AbstractC2899a implements Checkable, z {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f18206l = {R.attr.state_checkable};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f18207m = {R.attr.state_checked};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f18208n = {com.apm.insight.R.attr.state_dragged};

    /* renamed from: h, reason: collision with root package name */
    public final C2663c f18209h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18210j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18211k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.apm.insight.R.attr.materialCardViewStyle, com.apm.insight.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.f18210j = false;
        this.f18211k = false;
        this.i = true;
        TypedArray typedArrayI = AbstractC2993B.i(getContext(), attributeSet, AbstractC2266a.f19770y, com.apm.insight.R.attr.materialCardViewStyle, com.apm.insight.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C2663c c2663c = new C2663c(this, attributeSet);
        this.f18209h = c2663c;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = c2663c.f21957c;
        jVar.q(cardBackgroundColor);
        c2663c.f21956b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c2663c.l();
        MaterialCardView materialCardView = c2663c.f21955a;
        ColorStateList colorStateListN = c.n(materialCardView.getContext(), typedArrayI, 11);
        c2663c.f21967n = colorStateListN;
        if (colorStateListN == null) {
            c2663c.f21967n = ColorStateList.valueOf(-1);
        }
        c2663c.f21962h = typedArrayI.getDimensionPixelSize(12, 0);
        boolean z6 = typedArrayI.getBoolean(0, false);
        c2663c.f21972s = z6;
        materialCardView.setLongClickable(z6);
        c2663c.f21965l = c.n(materialCardView.getContext(), typedArrayI, 6);
        c2663c.g(c.r(materialCardView.getContext(), typedArrayI, 2));
        c2663c.f21960f = typedArrayI.getDimensionPixelSize(5, 0);
        c2663c.f21959e = typedArrayI.getDimensionPixelSize(4, 0);
        c2663c.f21961g = typedArrayI.getInteger(3, 8388661);
        ColorStateList colorStateListN2 = c.n(materialCardView.getContext(), typedArrayI, 7);
        c2663c.f21964k = colorStateListN2;
        if (colorStateListN2 == null) {
            c2663c.f21964k = ColorStateList.valueOf(e.m(com.apm.insight.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListN3 = c.n(materialCardView.getContext(), typedArrayI, 1);
        colorStateListN3 = colorStateListN3 == null ? ColorStateList.valueOf(0) : colorStateListN3;
        j jVar2 = c2663c.f21958d;
        jVar2.q(colorStateListN3);
        RippleDrawable rippleDrawable = c2663c.f21968o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c2663c.f21964k);
        }
        jVar.p(materialCardView.getCardElevation());
        float f2 = c2663c.f21962h;
        ColorStateList colorStateList = c2663c.f21967n;
        jVar2.f1597b.f1569k = f2;
        jVar2.invalidateSelf();
        jVar2.v(colorStateList);
        materialCardView.setBackgroundInternal(c2663c.d(jVar));
        Drawable drawableC = c2663c.j() ? c2663c.c() : jVar2;
        c2663c.i = drawableC;
        materialCardView.setForeground(c2663c.d(drawableC));
        typedArrayI.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f18209h.f21957c.getBounds());
        return rectF;
    }

    public final void b() {
        C2663c c2663c;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c2663c = this.f18209h).f21968o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        c2663c.f21968o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c2663c.f21968o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // t.AbstractC2899a
    public ColorStateList getCardBackgroundColor() {
        return this.f18209h.f21957c.f1597b.f1563d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f18209h.f21958d.f1597b.f1563d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f18209h.f21963j;
    }

    public int getCheckedIconGravity() {
        return this.f18209h.f21961g;
    }

    public int getCheckedIconMargin() {
        return this.f18209h.f21959e;
    }

    public int getCheckedIconSize() {
        return this.f18209h.f21960f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f18209h.f21965l;
    }

    @Override // t.AbstractC2899a
    public int getContentPaddingBottom() {
        return this.f18209h.f21956b.bottom;
    }

    @Override // t.AbstractC2899a
    public int getContentPaddingLeft() {
        return this.f18209h.f21956b.left;
    }

    @Override // t.AbstractC2899a
    public int getContentPaddingRight() {
        return this.f18209h.f21956b.right;
    }

    @Override // t.AbstractC2899a
    public int getContentPaddingTop() {
        return this.f18209h.f21956b.top;
    }

    public float getProgress() {
        return this.f18209h.f21957c.f1597b.f1568j;
    }

    @Override // t.AbstractC2899a
    public float getRadius() {
        return this.f18209h.f21957c.k();
    }

    public ColorStateList getRippleColor() {
        return this.f18209h.f21964k;
    }

    public o getShapeAppearanceModel() {
        return this.f18209h.f21966m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f18209h.f21967n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f18209h.f21967n;
    }

    public int getStrokeWidth() {
        return this.f18209h.f21962h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18210j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2663c c2663c = this.f18209h;
        c2663c.k();
        p.r(this, c2663c.f21957c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C2663c c2663c = this.f18209h;
        if (c2663c != null && c2663c.f21972s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18206l);
        }
        if (this.f18210j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18207m);
        }
        if (this.f18211k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18208n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f18210j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C2663c c2663c = this.f18209h;
        accessibilityNodeInfo.setCheckable(c2663c != null && c2663c.f21972s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f18210j);
    }

    @Override // t.AbstractC2899a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        this.f18209h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            C2663c c2663c = this.f18209h;
            if (!c2663c.f21971r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c2663c.f21971r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // t.AbstractC2899a
    public void setCardBackgroundColor(int i) {
        this.f18209h.f21957c.q(ColorStateList.valueOf(i));
    }

    @Override // t.AbstractC2899a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        C2663c c2663c = this.f18209h;
        c2663c.f21957c.p(c2663c.f21955a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.f18209h.f21958d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.q(colorStateList);
    }

    public void setCheckable(boolean z6) {
        this.f18209h.f21972s = z6;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (this.f18210j != z6) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f18209h.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C2663c c2663c = this.f18209h;
        if (c2663c.f21961g != i) {
            c2663c.f21961g = i;
            MaterialCardView materialCardView = c2663c.f21955a;
            c2663c.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f18209h.f21959e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f18209h.f21959e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f18209h.g(t.i(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f18209h.f21960f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f18209h.f21960f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2663c c2663c = this.f18209h;
        c2663c.f21965l = colorStateList;
        Drawable drawable = c2663c.f21963j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
        C2663c c2663c = this.f18209h;
        if (c2663c != null) {
            c2663c.k();
        }
    }

    public void setDragged(boolean z6) {
        if (this.f18211k != z6) {
            this.f18211k = z6;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // t.AbstractC2899a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f18209h.m();
    }

    @Override // t.AbstractC2899a
    public void setPreventCornerOverlap(boolean z6) {
        super.setPreventCornerOverlap(z6);
        C2663c c2663c = this.f18209h;
        c2663c.m();
        c2663c.l();
    }

    public void setProgress(float f2) {
        C2663c c2663c = this.f18209h;
        c2663c.f21957c.r(f2);
        j jVar = c2663c.f21958d;
        if (jVar != null) {
            jVar.r(f2);
        }
        j jVar2 = c2663c.f21970q;
        if (jVar2 != null) {
            jVar2.r(f2);
        }
    }

    @Override // t.AbstractC2899a
    public void setRadius(float f2) {
        super.setRadius(f2);
        C2663c c2663c = this.f18209h;
        n nVarG = c2663c.f21966m.g();
        nVarG.c(f2);
        c2663c.h(nVarG.a());
        c2663c.i.invalidateSelf();
        if (c2663c.i() || (c2663c.f21955a.getPreventCornerOverlap() && !c2663c.f21957c.n())) {
            c2663c.l();
        }
        if (c2663c.i()) {
            c2663c.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2663c c2663c = this.f18209h;
        c2663c.f21964k = colorStateList;
        RippleDrawable rippleDrawable = c2663c.f21968o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListB = G.c.b(getContext(), i);
        C2663c c2663c = this.f18209h;
        c2663c.f21964k = colorStateListB;
        RippleDrawable rippleDrawable = c2663c.f21968o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // G3.z
    public void setShapeAppearanceModel(o oVar) {
        setClipToOutline(oVar.f(getBoundsAsRectF()));
        this.f18209h.h(oVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C2663c c2663c = this.f18209h;
        if (i != c2663c.f21962h) {
            c2663c.f21962h = i;
            j jVar = c2663c.f21958d;
            ColorStateList colorStateList = c2663c.f21967n;
            jVar.f1597b.f1569k = i;
            jVar.invalidateSelf();
            jVar.v(colorStateList);
        }
        invalidate();
    }

    @Override // t.AbstractC2899a
    public void setUseCompatPadding(boolean z6) {
        super.setUseCompatPadding(z6);
        C2663c c2663c = this.f18209h;
        c2663c.m();
        c2663c.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C2663c c2663c = this.f18209h;
        if (c2663c != null && c2663c.f21972s && isEnabled()) {
            this.f18210j = !this.f18210j;
            refreshDrawableState();
            b();
            c2663c.f(this.f18210j, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C2663c c2663c = this.f18209h;
        if (c2663c.f21967n != colorStateList) {
            c2663c.f21967n = colorStateList;
            j jVar = c2663c.f21958d;
            jVar.f1597b.f1569k = c2663c.f21962h;
            jVar.invalidateSelf();
            jVar.v(colorStateList);
        }
        invalidate();
    }

    @Override // t.AbstractC2899a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f18209h.f21957c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(InterfaceC2661a interfaceC2661a) {
    }
}
