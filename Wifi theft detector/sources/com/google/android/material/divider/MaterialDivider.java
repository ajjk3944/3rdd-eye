package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.google.android.material.internal.a0;
import com.google.android.material.shape.MaterialShapeDrawable;
import d5.c;
import j4.b;
import j4.d;
import j4.k;
import j4.l;
import l5.a;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int f10490f = k.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialShapeDrawable f10491a;

    /* renamed from: b, reason: collision with root package name */
    public int f10492b;

    /* renamed from: c, reason: collision with root package name */
    public int f10493c;

    /* renamed from: d, reason: collision with root package name */
    public int f10494d;

    /* renamed from: e, reason: collision with root package name */
    public int f10495e;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f10493c;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f10495e;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f10494d;
    }

    public int getDividerThickness() {
        return this.f10492b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f10495e : this.f10494d;
        if (z10) {
            width = getWidth();
            i10 = this.f10494d;
        } else {
            width = getWidth();
            i10 = this.f10495e;
        }
        this.f10491a.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f10491a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f10492b;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i10) {
        if (this.f10493c != i10) {
            this.f10493c = i10;
            this.f10491a.i0(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f10495e = i10;
    }

    public void setDividerInsetEndResource(@DimenRes int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f10494d = i10;
    }

    public void setDividerInsetStartResource(@DimenRes int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        if (this.f10492b != i10) {
            this.f10492b = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, b.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10490f;
        super(a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f10491a = new MaterialShapeDrawable();
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.MaterialDivider, i10, i11, new int[0]);
        this.f10492b = typedArrayI.getDimensionPixelSize(l.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(d.material_divider_thickness));
        this.f10494d = typedArrayI.getDimensionPixelOffset(l.MaterialDivider_dividerInsetStart, 0);
        this.f10495e = typedArrayI.getDimensionPixelOffset(l.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(c.a(context2, typedArrayI, l.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayI.recycle();
    }
}
