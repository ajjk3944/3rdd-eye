package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f1230i = {R.attr.colorBackground};

    /* renamed from: j, reason: collision with root package name */
    private static final e f1231j;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1232b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1233c;

    /* renamed from: d, reason: collision with root package name */
    int f1234d;

    /* renamed from: e, reason: collision with root package name */
    int f1235e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f1236f;

    /* renamed from: g, reason: collision with root package name */
    final Rect f1237g;

    /* renamed from: h, reason: collision with root package name */
    private final d f1238h;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f1239a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public View a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.d
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public void c(int i2, int i3, int i4, int i5) {
            CardView.this.f1237g.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1236f;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public Drawable d() {
            return this.f1239a;
        }

        @Override // androidx.cardview.widget.d
        public void e(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f1234d) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f1235e) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.d
        public void f(Drawable drawable) {
            this.f1239a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean g() {
            return CardView.this.getPreventCornerOverlap();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1231j = i2 >= 21 ? new b() : i2 >= 17 ? new androidx.cardview.widget.a() : new c();
        f1231j.l();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.f2700a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        Resources resources;
        int i3;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f1236f = rect;
        this.f1237g = new Rect();
        a aVar = new a();
        this.f1238h = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.e.f2707a, i2, j.d.f2706a);
        int i4 = j.e.f2710d;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i4);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1230i);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = j.b.f2702b;
            } else {
                resources = getResources();
                i3 = j.b.f2701a;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(j.e.f2711e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(j.e.f2712f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(j.e.f2713g, 0.0f);
        this.f1232b = typedArrayObtainStyledAttributes.getBoolean(j.e.f2715i, false);
        this.f1233c = typedArrayObtainStyledAttributes.getBoolean(j.e.f2714h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2716j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2718l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2720n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2719m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2717k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1234d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2708b, 0);
        this.f1235e = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.e.f2709c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1231j.m(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1231j.i(this.f1238h);
    }

    public float getCardElevation() {
        return f1231j.f(this.f1238h);
    }

    public int getContentPaddingBottom() {
        return this.f1236f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1236f.left;
    }

    public int getContentPaddingRight() {
        return this.f1236f.right;
    }

    public int getContentPaddingTop() {
        return this.f1236f.top;
    }

    public float getMaxCardElevation() {
        return f1231j.a(this.f1238h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1233c;
    }

    public float getRadius() {
        return f1231j.b(this.f1238h);
    }

    public boolean getUseCompatPadding() {
        return this.f1232b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!(f1231j instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.g(this.f1238h)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.e(this.f1238h)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f1231j.d(this.f1238h, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1231j.d(this.f1238h, colorStateList);
    }

    public void setCardElevation(float f2) {
        f1231j.j(this.f1238h, f2);
    }

    public void setMaxCardElevation(float f2) {
        f1231j.k(this.f1238h, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f1235e = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f1234d = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f1233c) {
            this.f1233c = z2;
            f1231j.c(this.f1238h);
        }
    }

    public void setRadius(float f2) {
        f1231j.n(this.f1238h, f2);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f1232b != z2) {
            this.f1232b = z2;
            f1231j.h(this.f1238h);
        }
    }
}
