package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.liuzh.deviceinfo.R;
import ed.j;
import md.a;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* renamed from: a, reason: collision with root package name */
    public final j f20511a;

    /* renamed from: b, reason: collision with root package name */
    public int f20512b;

    /* renamed from: c, reason: collision with root package name */
    public int f20513c;

    /* renamed from: d, reason: collision with root package name */
    public int f20514d;

    /* renamed from: e, reason: collision with root package name */
    public int f20515e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f20511a = new j();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.f25961v, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f20512b = typedArrayG.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f20514d = typedArrayG.getDimensionPixelOffset(2, 0);
        this.f20515e = typedArrayG.getDimensionPixelOffset(1, 0);
        setDividerColor(jm.a.j(context2, typedArrayG, 0).getDefaultColor());
        typedArrayG.recycle();
    }

    public int getDividerColor() {
        return this.f20513c;
    }

    public int getDividerInsetEnd() {
        return this.f20515e;
    }

    public int getDividerInsetStart() {
        return this.f20514d;
    }

    public int getDividerThickness() {
        return this.f20512b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i4;
        super.onDraw(canvas);
        boolean z3 = getLayoutDirection() == 1;
        int i10 = z3 ? this.f20515e : this.f20514d;
        if (z3) {
            width = getWidth();
            i4 = this.f20514d;
        } else {
            width = getWidth();
            i4 = this.f20515e;
        }
        int i11 = width - i4;
        int bottom = getBottom() - getTop();
        j jVar = this.f20511a;
        jVar.setBounds(i10, 0, i11, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int mode = View.MeasureSpec.getMode(i10);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i11 = this.f20512b;
            if (i11 > 0 && measuredHeight != i11) {
                measuredHeight = i11;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i4) {
        if (this.f20513c != i4) {
            this.f20513c = i4;
            this.f20511a.o(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(int i4) {
        setDividerColor(getContext().getColor(i4));
    }

    public void setDividerInsetEnd(int i4) {
        this.f20515e = i4;
    }

    public void setDividerInsetEndResource(int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(int i4) {
        this.f20514d = i4;
    }

    public void setDividerInsetStartResource(int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(int i4) {
        if (this.f20512b != i4) {
            this.f20512b = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }
}
