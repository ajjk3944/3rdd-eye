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
import cg.e;
import q3.a;
import s.b;
import s.c;
import s.d;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1056a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1057d;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1058g;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f1059r;

    /* renamed from: x, reason: collision with root package name */
    public final a f1060x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1055y = {R.attr.colorBackground};
    public static final e B = new e();

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.a.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((t.a) ((Drawable) this.f1060x.f20679d)).f22371h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1060x.f20680g).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1058g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1058g.left;
    }

    public int getContentPaddingRight() {
        return this.f1058g.right;
    }

    public int getContentPaddingTop() {
        return this.f1058g.top;
    }

    public float getMaxCardElevation() {
        return ((t.a) ((Drawable) this.f1060x.f20679d)).f22368e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1057d;
    }

    public float getRadius() {
        return ((t.a) ((Drawable) this.f1060x.f20679d)).f22364a;
    }

    public boolean getUseCompatPadding() {
        return this.f1056a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        t.a aVar = (t.a) ((Drawable) this.f1060x.f20679d);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f22371h = colorStateListValueOf;
        aVar.f22365b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f22371h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f1060x.f20680g).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        B.u(this.f1060x, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1057d) {
            this.f1057d = z10;
            a aVar = this.f1060x;
            B.u(aVar, ((t.a) ((Drawable) aVar.f20679d)).f22368e);
        }
    }

    public void setRadius(float f10) {
        t.a aVar = (t.a) ((Drawable) this.f1060x.f20679d);
        if (f10 == aVar.f22364a) {
            return;
        }
        aVar.f22364a = f10;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1056a != z10) {
            this.f1056a = z10;
            a aVar = this.f1060x;
            B.u(aVar, ((t.a) ((Drawable) aVar.f20679d)).f22368e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1058g = rect;
        this.f1059r = new Rect();
        a aVar = new a(7, this);
        this.f1060x = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.CardView, i10, c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(d.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(d.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1055y);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(b.cardview_light_background) : getResources().getColor(b.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardMaxElevation, 0.0f);
        this.f1056a = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardUseCompatPadding, false);
        this.f1057d = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        t.a aVar2 = new t.a(colorStateListValueOf, dimension);
        aVar.f20679d = aVar2;
        setBackgroundDrawable(aVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        B.u(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        t.a aVar = (t.a) ((Drawable) this.f1060x.f20679d);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f22371h = colorStateList;
        aVar.f22365b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f22371h.getDefaultColor()));
        aVar.invalidateSelf();
    }
}
