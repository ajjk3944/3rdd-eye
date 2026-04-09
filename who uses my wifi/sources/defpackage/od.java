package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class od extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public static final fr l = new fr(15);
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final l92 j;

    public od(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        l92 l92Var = new l92(this);
        this.j = l92Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ym0.a, com.phuongpn.whousemywifi.networkscanner.R.attr.materialCardViewStyle, com.phuongpn.whousemywifi.networkscanner.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.phuongpn.whousemywifi.networkscanner.R.color.cardview_light_background) : getResources().getColor(com.phuongpn.whousemywifi.networkscanner.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.g = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        uq0 uq0Var = new uq0(colorStateListValueOf, dimension);
        l92Var.f = uq0Var;
        setBackgroundDrawable(uq0Var);
        setClipToOutline(true);
        setElevation(dimension2);
        l.m(l92Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((uq0) ((Drawable) this.j.f)).h;
    }

    public float getCardElevation() {
        return ((od) this.j.g).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h.left;
    }

    public int getContentPaddingRight() {
        return this.h.right;
    }

    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return ((uq0) ((Drawable) this.j.f)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((uq0) ((Drawable) this.j.f)).a;
    }

    public boolean getUseCompatPadding() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        uq0 uq0Var = (uq0) ((Drawable) this.j.f);
        if (colorStateListValueOf == null) {
            uq0Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        uq0Var.h = colorStateListValueOf;
        uq0Var.b.setColor(colorStateListValueOf.getColorForState(uq0Var.getState(), uq0Var.h.getDefaultColor()));
        uq0Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((od) this.j.g).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        l.m(this.j, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.g) {
            this.g = z;
            l92 l92Var = this.j;
            l.m(l92Var, ((uq0) ((Drawable) l92Var.f)).e);
        }
    }

    public void setRadius(float f) {
        uq0 uq0Var = (uq0) ((Drawable) this.j.f);
        if (f == uq0Var.a) {
            return;
        }
        uq0Var.a = f;
        uq0Var.b(null);
        uq0Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            l92 l92Var = this.j;
            l.m(l92Var, ((uq0) ((Drawable) l92Var.f)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        uq0 uq0Var = (uq0) ((Drawable) this.j.f);
        if (colorStateList == null) {
            uq0Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        uq0Var.h = colorStateList;
        uq0Var.b.setColor(colorStateList.getColorForState(uq0Var.getState(), uq0Var.h.getDefaultColor()));
        uq0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
