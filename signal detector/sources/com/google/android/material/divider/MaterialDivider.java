package com.google.android.material.divider;

import G3.j;
import O3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import com.bumptech.glide.c;
import d3.AbstractC2266a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: a, reason: collision with root package name */
    public final j f18343a;

    /* renamed from: b, reason: collision with root package name */
    public int f18344b;

    /* renamed from: c, reason: collision with root package name */
    public int f18345c;

    /* renamed from: d, reason: collision with root package name */
    public int f18346d;

    /* renamed from: e, reason: collision with root package name */
    public int f18347e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f18343a = new j();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19723A, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f18344b = typedArrayI.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f18346d = typedArrayI.getDimensionPixelOffset(2, 0);
        this.f18347e = typedArrayI.getDimensionPixelOffset(1, 0);
        setDividerColor(c.n(context2, typedArrayI, 0).getDefaultColor());
        typedArrayI.recycle();
    }

    public int getDividerColor() {
        return this.f18345c;
    }

    public int getDividerInsetEnd() {
        return this.f18347e;
    }

    public int getDividerInsetStart() {
        return this.f18346d;
    }

    public int getDividerThickness() {
        return this.f18344b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z6 = getLayoutDirection() == 1;
        int i3 = z6 ? this.f18347e : this.f18346d;
        if (z6) {
            width = getWidth();
            i = this.f18346d;
        } else {
            width = getWidth();
            i = this.f18347e;
        }
        int i6 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.f18343a;
        jVar.setBounds(i3, 0, i6, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i6 = this.f18344b;
            if (i6 > 0 && measuredHeight != i6) {
                measuredHeight = i6;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f18345c != i) {
            this.f18345c = i;
            this.f18343a.q(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f18347e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f18346d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f18344b != i) {
            this.f18344b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
