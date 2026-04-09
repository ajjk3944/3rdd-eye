package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import j6.i;
import km.o;
import v.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f848f = {R.attr.colorBackground};
    public static final i g = new i(22);

    /* renamed from: a, reason: collision with root package name */
    public boolean f849a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f850b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f851c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f852d;

    /* renamed from: e, reason: collision with root package name */
    public final o f853e;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.liuzh.deviceinfo.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f851c = rect;
        this.f852d = new Rect();
        o oVar = new o();
        oVar.f28446b = this;
        this.f853e = oVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f35552a, com.liuzh.deviceinfo.R.attr.cardViewStyle, com.liuzh.deviceinfo.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f848f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.liuzh.deviceinfo.R.color.cardview_light_background) : getResources().getColor(com.liuzh.deviceinfo.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f849a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f850b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        w.a aVar = new w.a(colorStateListValueOf, dimension);
        oVar.f28445a = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        g.r(oVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((w.a) ((Drawable) this.f853e.f28445a)).f36386h;
    }

    public float getCardElevation() {
        return ((CardView) this.f853e.f28446b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f851c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f851c.left;
    }

    public int getContentPaddingRight() {
        return this.f851c.right;
    }

    public int getContentPaddingTop() {
        return this.f851c.top;
    }

    public float getMaxCardElevation() {
        return ((w.a) ((Drawable) this.f853e.f28445a)).f36384e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f850b;
    }

    public float getRadius() {
        return ((w.a) ((Drawable) this.f853e.f28445a)).f36380a;
    }

    public boolean getUseCompatPadding() {
        return this.f849a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
    }

    public void setCardBackgroundColor(int i4) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i4);
        w.a aVar = (w.a) ((Drawable) this.f853e.f28445a);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f36386h = colorStateListValueOf;
        aVar.f36381b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f36386h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f853e.f28446b).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        g.r(this.f853e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        super.setMinimumWidth(i4);
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.f850b) {
            this.f850b = z3;
            o oVar = this.f853e;
            g.r(oVar, ((w.a) ((Drawable) oVar.f28445a)).f36384e);
        }
    }

    public void setRadius(float f10) {
        w.a aVar = (w.a) ((Drawable) this.f853e.f28445a);
        if (f10 == aVar.f36380a) {
            return;
        }
        aVar.f36380a = f10;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f849a != z3) {
            this.f849a = z3;
            o oVar = this.f853e;
            g.r(oVar, ((w.a) ((Drawable) oVar.f28445a)).f36384e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        w.a aVar = (w.a) ((Drawable) this.f853e.f28445a);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f36386h = colorStateList;
        aVar.f36381b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f36386h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i4, int i10, int i11, int i12) {
    }
}
