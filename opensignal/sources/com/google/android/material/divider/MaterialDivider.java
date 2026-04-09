package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ed.b;
import ed.d;
import ed.k;
import ed.l;
import ee.i;
import le.a;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: y, reason: collision with root package name */
    public static final int f5642y = k.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    public final i f5643a;

    /* renamed from: d, reason: collision with root package name */
    public int f5644d;

    /* renamed from: g, reason: collision with root package name */
    public int f5645g;

    /* renamed from: r, reason: collision with root package name */
    public int f5646r;

    /* renamed from: x, reason: collision with root package name */
    public int f5647x;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet) {
        int i10 = b.materialDividerStyle;
        int i11 = f5642y;
        super(a.a(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f5643a = new i();
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.MaterialDivider, i10, i11, new int[0]);
        this.f5644d = typedArrayD.getDimensionPixelSize(l.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(d.material_divider_thickness));
        this.f5646r = typedArrayD.getDimensionPixelOffset(l.MaterialDivider_dividerInsetStart, 0);
        this.f5647x = typedArrayD.getDimensionPixelOffset(l.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(xu.l.q(context2, typedArrayD, l.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayD.recycle();
    }

    public int getDividerColor() {
        return this.f5645g;
    }

    public int getDividerInsetEnd() {
        return this.f5647x;
    }

    public int getDividerInsetStart() {
        return this.f5646r;
    }

    public int getDividerThickness() {
        return this.f5644d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f5647x : this.f5646r;
        if (z10) {
            width = getWidth();
            i10 = this.f5646r;
        } else {
            width = getWidth();
            i10 = this.f5647x;
        }
        int i12 = width - i10;
        int bottom = getBottom() - getTop();
        i iVar = this.f5643a;
        iVar.setBounds(i11, 0, i12, bottom);
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f5644d;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f5645g != i10) {
            this.f5645g = i10;
            this.f5643a.q(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(getContext().getColor(i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f5647x = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f5646r = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f5644d != i10) {
            this.f5644d = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
