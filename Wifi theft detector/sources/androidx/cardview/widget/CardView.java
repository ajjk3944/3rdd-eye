package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import p.d;
import q.b;
import q.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f1465h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    public static final c f1466i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1467a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1468b;

    /* renamed from: c, reason: collision with root package name */
    public int f1469c;

    /* renamed from: d, reason: collision with root package name */
    public int f1470d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1471e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1472f;

    /* renamed from: g, reason: collision with root package name */
    public final b f1473g;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f1474a;

        public a() {
        }

        @Override // q.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1472f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1471e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // q.b
        public void b(Drawable drawable) {
            this.f1474a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // q.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // q.b
        public Drawable d() {
            return this.f1474a;
        }

        @Override // q.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // q.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        q.a aVar = new q.a();
        f1466i = aVar;
        aVar.m();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f1471e.set(i10, i11, i12, i13);
        f1466i.f(this.f1473g);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f1466i.l(this.f1473g);
    }

    public float getCardElevation() {
        return f1466i.c(this.f1473g);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f1471e.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f1471e.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f1471e.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f1471e.top;
    }

    public float getMaxCardElevation() {
        return f1466i.k(this.f1473g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1468b;
    }

    public float getRadius() {
        return f1466i.i(this.f1473g);
    }

    public boolean getUseCompatPadding() {
        return this.f1467a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (f1466i instanceof q.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.h(this.f1473g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.d(this.f1473g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@ColorInt int i10) {
        f1466i.n(this.f1473g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1466i.e(this.f1473g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1466i.o(this.f1473g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1470d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1469c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1468b) {
            this.f1468b = z10;
            f1466i.j(this.f1473g);
        }
    }

    public void setRadius(float f10) {
        f1466i.b(this.f1473g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1467a != z10) {
            this.f1467a = z10;
            f1466i.a(this.f1473g);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p.a.cardViewStyle);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f1466i.n(this.f1473g, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f1471e = rect;
        this.f1472f = new Rect();
        a aVar = new a();
        this.f1473g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.CardView, i10, p.c.CardView);
        int i11 = d.CardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1465h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(p.b.cardview_light_background);
            } else {
                color = getResources().getColor(p.b.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(d.CardView_cardMaxElevation, 0.0f);
        this.f1467a = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardUseCompatPadding, false);
        this.f1468b = typedArrayObtainStyledAttributes.getBoolean(d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_contentPaddingBottom, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1469c = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minWidth, 0);
        this.f1470d = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1466i.g(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
