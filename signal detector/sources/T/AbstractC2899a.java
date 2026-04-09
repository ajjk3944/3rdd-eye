package t;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import h0.C2351a;
import p1.e;
import s.AbstractC2879a;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2899a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f23503f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final e f23504g = new e(10);

    /* renamed from: a, reason: collision with root package name */
    public boolean f23505a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23506b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f23507c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23508d;

    /* renamed from: e, reason: collision with root package name */
    public final C2351a f23509e;

    public AbstractC2899a(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.apm.insight.R.attr.materialCardViewStyle);
        Rect rect = new Rect();
        this.f23507c = rect;
        this.f23508d = new Rect();
        C2351a c2351a = new C2351a(29, this);
        this.f23509e = c2351a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2879a.f23400a, com.apm.insight.R.attr.materialCardViewStyle, com.apm.insight.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f23503f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.apm.insight.R.color.cardview_light_background) : getResources().getColor(com.apm.insight.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f23505a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f23506b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C2900b c2900b = new C2900b(colorStateListValueOf, dimension);
        c2351a.f20441b = c2900b;
        setBackgroundDrawable(c2900b);
        setClipToOutline(true);
        setElevation(dimension2);
        f23504g.f(c2351a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C2900b) ((Drawable) this.f23509e.f20441b)).f23517h;
    }

    public float getCardElevation() {
        return ((AbstractC2899a) this.f23509e.f20442c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f23507c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f23507c.left;
    }

    public int getContentPaddingRight() {
        return this.f23507c.right;
    }

    public int getContentPaddingTop() {
        return this.f23507c.top;
    }

    public float getMaxCardElevation() {
        return ((C2900b) ((Drawable) this.f23509e.f20441b)).f23514e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f23506b;
    }

    public float getRadius() {
        return ((C2900b) ((Drawable) this.f23509e.f20441b)).f23510a;
    }

    public boolean getUseCompatPadding() {
        return this.f23505a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C2900b c2900b = (C2900b) ((Drawable) this.f23509e.f20441b);
        if (colorStateListValueOf == null) {
            c2900b.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c2900b.f23517h = colorStateListValueOf;
        c2900b.f23511b.setColor(colorStateListValueOf.getColorForState(c2900b.getState(), c2900b.f23517h.getDefaultColor()));
        c2900b.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((AbstractC2899a) this.f23509e.f20442c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f23504g.f(this.f23509e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f23506b) {
            this.f23506b = z6;
            C2351a c2351a = this.f23509e;
            f23504g.f(c2351a, ((C2900b) ((Drawable) c2351a.f20441b)).f23514e);
        }
    }

    public void setRadius(float f2) {
        C2900b c2900b = (C2900b) ((Drawable) this.f23509e.f20441b);
        if (f2 == c2900b.f23510a) {
            return;
        }
        c2900b.f23510a = f2;
        c2900b.b(null);
        c2900b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f23505a != z6) {
            this.f23505a = z6;
            C2351a c2351a = this.f23509e;
            f23504g.f(c2351a, ((C2900b) ((Drawable) c2351a.f20441b)).f23514e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C2900b c2900b = (C2900b) ((Drawable) this.f23509e.f20441b);
        if (colorStateList == null) {
            c2900b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c2900b.f23517h = colorStateList;
        c2900b.f23511b.setColor(colorStateList.getColorForState(c2900b.getState(), c2900b.f23517h.getDefaultColor()));
        c2900b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i3, int i6, int i7) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i3, int i6, int i7) {
    }
}
