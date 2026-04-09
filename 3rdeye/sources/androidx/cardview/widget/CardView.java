package androidx.cardview.widget;

import A9.I;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import k0.C5206a;
import l0.C5264b;
import l0.InterfaceC5263a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f15186g = {R.attr.colorBackground};

    /* renamed from: h, reason: collision with root package name */
    public static final I f15187h = new I();

    /* renamed from: b, reason: collision with root package name */
    public boolean f15188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15189c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f15190d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f15191e;

    /* renamed from: f, reason: collision with root package name */
    public final a f15192f;

    public class a implements InterfaceC5263a {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f15193a;

        public a() {
        }

        public final void a(int i, int i10, int i11, int i12) {
            CardView cardView = CardView.this;
            cardView.f15191e.set(i, i10, i11, i12);
            Rect rect = cardView.f15190d;
            CardView.super.setPadding(i + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f15190d = rect;
        this.f15191e = new Rect();
        a aVar = new a();
        this.f15192f = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5206a.f43148a, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.cardViewStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f15186g);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.cardview_light_background) : getResources().getColor(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f15188b = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f15189c = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        I i = f15187h;
        C5264b c5264b = new C5264b(colorStateListValueOf, dimension);
        aVar.f15193a = c5264b;
        setBackgroundDrawable(c5264b);
        setClipToOutline(true);
        setElevation(dimension2);
        i.B(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C5264b) this.f15192f.f15193a).f43671h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f15190d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f15190d.left;
    }

    public int getContentPaddingRight() {
        return this.f15190d.right;
    }

    public int getContentPaddingTop() {
        return this.f15190d.top;
    }

    public float getMaxCardElevation() {
        return ((C5264b) this.f15192f.f15193a).f43668e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f15189c;
    }

    public float getRadius() {
        return ((C5264b) this.f15192f.f15193a).f43664a;
    }

    public boolean getUseCompatPadding() {
        return this.f15188b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C5264b c5264bV = I.v(this.f15192f);
        if (colorStateList == null) {
            c5264bV.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c5264bV.f43671h = colorStateList;
        c5264bV.f43665b.setColor(colorStateList.getColorForState(c5264bV.getState(), c5264bV.f43671h.getDefaultColor()));
        c5264bV.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f15187h.B(this.f15192f, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f15189c) {
            this.f15189c = z10;
            I i = f15187h;
            a aVar = this.f15192f;
            i.B(aVar, ((C5264b) aVar.f15193a).f43668e);
        }
    }

    public void setRadius(float f10) {
        C5264b c5264b = (C5264b) this.f15192f.f15193a;
        if (f10 == c5264b.f43664a) {
            return;
        }
        c5264b.f43664a = f10;
        c5264b.b(null);
        c5264b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f15188b != z10) {
            this.f15188b = z10;
            I i = f15187h;
            a aVar = this.f15192f;
            i.B(aVar, ((C5264b) aVar.f15193a).f43668e);
        }
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C5264b c5264bV = I.v(this.f15192f);
        if (colorStateListValueOf == null) {
            c5264bV.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c5264bV.f43671h = colorStateListValueOf;
        c5264bV.f43665b.setColor(colorStateListValueOf.getColorForState(c5264bV.getState(), c5264bV.f43671h.getDefaultColor()));
        c5264bV.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
    }
}
