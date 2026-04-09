package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.a0;
import g5.h;
import g5.k;
import j4.b;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, k {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f10124n = {R.attr.state_checkable};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f10125o = {R.attr.state_checked};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f10126p = {b.state_dragged};

    /* renamed from: q, reason: collision with root package name */
    public static final int f10127q = j4.k.Widget_MaterialComponents_CardView;

    /* renamed from: j, reason: collision with root package name */
    public final q4.b f10128j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10129k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10130l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10131m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f10128j.j().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f10128j.k();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f10128j.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f10128j.m();
    }

    public int getCheckedIconGravity() {
        return this.f10128j.n();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f10128j.o();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f10128j.p();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f10128j.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f10128j.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f10128j.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f10128j.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f10128j.A().top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f10128j.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f10128j.s();
    }

    public ColorStateList getRippleColor() {
        return this.f10128j.v();
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.f10128j.w();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.f10128j.x();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f10128j.y();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f10128j.z();
    }

    public final void h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f10128j.i();
        }
    }

    public boolean i() {
        q4.b bVar = this.f10128j;
        return bVar != null && bVar.D();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10130l;
    }

    public boolean j() {
        return this.f10131m;
    }

    public void k(int i10, int i11, int i12, int i13) {
        super.f(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10128j.d0();
        h.f(this, this.f10128j.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10124n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10125o);
        }
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10126p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f10128j.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f10129k) {
            if (!this.f10128j.C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f10128j.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i10) {
        this.f10128j.J(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f10128j.f0();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.f10128j.K(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f10128j.L(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f10130l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f10128j.O(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f10128j.n() != i10) {
            this.f10128j.P(i10);
        }
    }

    public void setCheckedIconMargin(@Dimension int i10) {
        this.f10128j.Q(i10);
    }

    public void setCheckedIconMarginResource(@DimenRes int i10) {
        if (i10 != -1) {
            this.f10128j.Q(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        this.f10128j.O(d.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(@Dimension int i10) {
        this.f10128j.R(i10);
    }

    public void setCheckedIconSizeResource(@DimenRes int i10) {
        if (i10 != 0) {
            this.f10128j.R(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.f10128j.S(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        q4.b bVar = this.f10128j;
        if (bVar != null) {
            bVar.d0();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f10131m != z10) {
            this.f10131m = z10;
            refreshDrawableState();
            h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f10128j.h0();
    }

    public void setOnCheckedChangeListener(@Nullable a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f10128j.h0();
        this.f10128j.e0();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f10128j.U(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f10128j.T(f10);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.f10128j.V(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i10) {
        this.f10128j.V(d.a.a(getContext(), i10));
    }

    @Override // g5.k
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        setClipToOutline(aVar.v(getBoundsAsRectF()));
        this.f10128j.W(aVar);
    }

    public void setStrokeColor(@ColorInt int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(@Dimension int i10) {
        this.f10128j.Y(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f10128j.h0();
        this.f10128j.e0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (i() && isEnabled()) {
            this.f10130l = !this.f10130l;
            refreshDrawableState();
            h();
            this.f10128j.N(this.f10130l, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f10128j.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f10128j.X(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10127q;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10130l = false;
        this.f10131m = false;
        this.f10129k = true;
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, l.MaterialCardView, i10, i11, new int[0]);
        q4.b bVar = new q4.b(this, attributeSet, i10, i11);
        this.f10128j = bVar;
        bVar.J(super.getCardBackgroundColor());
        bVar.Z(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.G(typedArrayI);
        typedArrayI.recycle();
    }
}
