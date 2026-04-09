package com.google.android.material.imageview;

import G3.j;
import G3.o;
import G3.p;
import G3.q;
import G3.z;
import O3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import com.bumptech.glide.c;
import d3.AbstractC2266a;
import w3.C2974a;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements z {

    /* renamed from: C, reason: collision with root package name */
    public final int f18364C;

    /* renamed from: D, reason: collision with root package name */
    public final int f18365D;

    /* renamed from: E, reason: collision with root package name */
    public final int f18366E;

    /* renamed from: F, reason: collision with root package name */
    public final int f18367F;

    /* renamed from: G, reason: collision with root package name */
    public final int f18368G;

    /* renamed from: H, reason: collision with root package name */
    public final int f18369H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18370I;

    /* renamed from: d, reason: collision with root package name */
    public final q f18371d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f18372e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f18373f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f18374g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f18375h;
    public final Path i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f18376j;

    /* renamed from: k, reason: collision with root package name */
    public j f18377k;

    /* renamed from: l, reason: collision with root package name */
    public o f18378l;

    /* renamed from: m, reason: collision with root package name */
    public float f18379m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f18380n;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f18371d = p.f1635a;
        this.i = new Path();
        this.f18370I = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f18375h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f18372e = new RectF();
        this.f18373f = new RectF();
        this.f18380n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2266a.f19736O, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f18376j = c.n(context2, typedArrayObtainStyledAttributes, 9);
        this.f18379m = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18364C = dimensionPixelSize;
        this.f18365D = dimensionPixelSize;
        this.f18366E = dimensionPixelSize;
        this.f18367F = dimensionPixelSize;
        this.f18364C = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f18365D = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f18366E = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f18367F = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f18368G = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, LinearLayoutManager.INVALID_OFFSET);
        this.f18369H = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, LinearLayoutManager.INVALID_OFFSET);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f18374g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f18378l = o.c(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new C2974a(this));
    }

    public final boolean a() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i3) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i3 - getPaddingBottom();
        RectF rectF = this.f18372e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        o oVar = this.f18378l;
        q qVar = this.f18371d;
        Path path = this.i;
        qVar.a(oVar, null, 1.0f, rectF, null, path);
        Path path2 = this.f18380n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f18373f;
        rectF2.set(0.0f, 0.0f, i, i3);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f18367F;
    }

    public final int getContentPaddingEnd() {
        int i = this.f18369H;
        return i != Integer.MIN_VALUE ? i : a() ? this.f18364C : this.f18366E;
    }

    public int getContentPaddingLeft() {
        int i;
        int i3;
        if (this.f18368G != Integer.MIN_VALUE || this.f18369H != Integer.MIN_VALUE) {
            if (a() && (i3 = this.f18369H) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!a() && (i = this.f18368G) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f18364C;
    }

    public int getContentPaddingRight() {
        int i;
        int i3;
        if (this.f18368G != Integer.MIN_VALUE || this.f18369H != Integer.MIN_VALUE) {
            if (a() && (i3 = this.f18368G) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!a() && (i = this.f18369H) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f18366E;
    }

    public final int getContentPaddingStart() {
        int i = this.f18368G;
        return i != Integer.MIN_VALUE ? i : a() ? this.f18366E : this.f18364C;
    }

    public int getContentPaddingTop() {
        return this.f18365D;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public o getShapeAppearanceModel() {
        return this.f18378l;
    }

    public ColorStateList getStrokeColor() {
        return this.f18376j;
    }

    public float getStrokeWidth() {
        return this.f18379m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f18380n, this.f18375h);
        if (this.f18376j == null) {
            return;
        }
        float f2 = this.f18379m;
        Paint paint = this.f18374g;
        paint.setStrokeWidth(f2);
        int colorForState = this.f18376j.getColorForState(getDrawableState(), this.f18376j.getDefaultColor());
        if (this.f18379m <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (!this.f18370I && isLayoutDirectionResolved()) {
            this.f18370I = true;
            if (!isPaddingRelative() && this.f18368G == Integer.MIN_VALUE && this.f18369H == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        d(i, i3);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i3, int i6, int i7) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i3, getContentPaddingRight() + i6, getContentPaddingBottom() + i7);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i3, getContentPaddingEnd() + i6, getContentPaddingBottom() + i7);
    }

    @Override // G3.z
    public void setShapeAppearanceModel(o oVar) {
        this.f18378l = oVar;
        j jVar = this.f18377k;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f18376j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(G.c.b(getContext(), i));
    }

    public void setStrokeWidth(float f2) {
        if (this.f18379m != f2) {
            this.f18379m = f2;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }
}
