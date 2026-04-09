package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.internal.play_billing.m1;
import ed.j;
import ed.o;
import gd.e;
import gd.f;
import ii.a;
import java.util.Iterator;
import wd.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class Slider extends e {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f24664n0;
    }

    public int getFocusedThumbIndex() {
        return this.f24666o0;
    }

    public int getHaloRadius() {
        return this.H;
    }

    public ColorStateList getHaloTintList() {
        return this.f24684x0;
    }

    public int getLabelBehavior() {
        return this.C;
    }

    public float getStepSize() {
        return this.f24668p0;
    }

    public float getThumbElevation() {
        return this.L0.f23316b.f23309n;
    }

    public int getThumbHeight() {
        return this.G;
    }

    @Override // gd.e
    public int getThumbRadius() {
        return this.F / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.L0.f23316b.f23302e;
    }

    public float getThumbStrokeWidth() {
        return this.L0.f23316b.f23306k;
    }

    public ColorStateList getThumbTintList() {
        return this.L0.f23316b.f23301d;
    }

    public int getThumbTrackGapSize() {
        return this.I;
    }

    public int getThumbWidth() {
        return this.F;
    }

    public int getTickActiveRadius() {
        return this.f24674s0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f24686y0;
    }

    public int getTickInactiveRadius() {
        return this.f24676t0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f24688z0;
    }

    public ColorStateList getTickTintList() {
        if (this.f24688z0.equals(this.f24686y0)) {
            return this.f24686y0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f24672r0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.A0;
    }

    @Override // gd.e
    public int getTrackCornerSize() {
        int i4 = this.M;
        return i4 == -1 ? this.D / 2 : i4;
    }

    public int getTrackHeight() {
        return this.D;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.T;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.R;
    }

    public Drawable getTrackIconActiveStart() {
        return this.P;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f24642b0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.W;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.U;
    }

    public int getTrackIconSize() {
        return this.f24644c0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.B0;
    }

    public int getTrackInsideCornerSize() {
        return this.N;
    }

    public int getTrackSidePadding() {
        return this.E;
    }

    public int getTrackStopIndicatorSize() {
        return this.L;
    }

    public ColorStateList getTrackTintList() {
        if (this.B0.equals(this.A0)) {
            return this.A0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f24678u0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f24658k0;
    }

    public float getValueTo() {
        return this.f24660l0;
    }

    @Override // gd.e
    public void setCentered(boolean z3) {
        if (this.O == z3) {
            return;
        }
        this.O = z3;
        if (z3) {
            setValues(Float.valueOf((this.f24658k0 + this.f24660l0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f24658k0));
        }
        N(true);
    }

    public void setCustomThumbDrawable(int i4) {
        setCustomThumbDrawable(getResources().getDrawable(i4));
    }

    @Override // gd.e, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    public void setFocusedThumbIndex(int i4) {
        if (i4 < 0 || i4 >= this.f24662m0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f24666o0 = i4;
        this.f24652h.w(i4);
        postInvalidate();
    }

    @Override // gd.e
    public void setHaloRadius(int i4) {
        if (i4 == this.H) {
            return;
        }
        this.H = i4;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.H);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i4) {
        setHaloRadius(getResources().getDimensionPixelSize(i4));
    }

    @Override // gd.e
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f24684x0)) {
            return;
        }
        this.f24684x0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iO = o(colorStateList);
        Paint paint = this.f24645d;
        paint.setColor(iO);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // gd.e
    public void setLabelBehavior(int i4) {
        if (this.C != i4) {
            this.C = i4;
            N(true);
        }
    }

    public void setLabelFormatter(f fVar) {
        this.f24655i0 = fVar;
    }

    @Override // gd.e
    public void setOrientation(int i4) {
        if (this.f24687z == i4) {
            return;
        }
        this.f24687z = i4;
        N(true);
    }

    public void setStepSize(float f10) {
        if (f10 >= 0.0f) {
            if (this.f24668p0 != f10) {
                this.f24668p0 = f10;
                this.f24682w0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f10 + ") must be 0, or a factor of the valueFrom(" + this.f24658k0 + ")-valueTo(" + this.f24660l0 + ") range");
    }

    @Override // gd.e
    public void setThumbElevation(float f10) {
        this.L0.n(f10);
    }

    public void setThumbElevationResource(int i4) {
        setThumbElevation(getResources().getDimension(i4));
    }

    @Override // gd.e
    public void setThumbHeight(int i4) {
        if (i4 == this.G) {
            return;
        }
        this.G = i4;
        this.L0.setBounds(0, 0, this.F, i4);
        Drawable drawable = this.M0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator it = this.N0.iterator();
        while (it.hasNext()) {
            b((Drawable) it.next());
        }
        N(false);
    }

    public void setThumbHeightResource(int i4) {
        setThumbHeight(getResources().getDimensionPixelSize(i4));
    }

    public void setThumbRadius(int i4) {
        int i10 = i4 * 2;
        setThumbWidth(i10);
        setThumbHeight(i10);
    }

    public void setThumbRadiusResource(int i4) {
        setThumbRadius(getResources().getDimensionPixelSize(i4));
    }

    @Override // gd.e
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.L0.r(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i4) {
        if (i4 != 0) {
            setThumbStrokeColor(b.r(i4, getContext()));
        }
    }

    @Override // gd.e
    public void setThumbStrokeWidth(float f10) {
        j jVar = this.L0;
        jVar.f23316b.f23306k = f10;
        jVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i4) {
        if (i4 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i4));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        j jVar = this.L0;
        if (colorStateList.equals(jVar.f23316b.f23301d)) {
            return;
        }
        jVar.o(colorStateList);
        invalidate();
    }

    @Override // gd.e
    public void setThumbTrackGapSize(int i4) {
        if (this.I == i4) {
            return;
        }
        this.I = i4;
        invalidate();
    }

    @Override // gd.e
    public void setThumbWidth(int i4) {
        if (i4 == this.F) {
            return;
        }
        this.F = i4;
        ed.f fVar = new ed.f(0);
        ed.f fVar2 = new ed.f(0);
        ed.f fVar3 = new ed.f(0);
        ed.f fVar4 = new ed.f(0);
        float f10 = this.F / 2.0f;
        m1 m1VarI = a.i(0);
        ed.a aVar = new ed.a(f10);
        ed.a aVar2 = new ed.a(f10);
        ed.a aVar3 = new ed.a(f10);
        ed.a aVar4 = new ed.a(f10);
        o oVar = new o();
        oVar.f23353a = m1VarI;
        oVar.f23354b = m1VarI;
        oVar.f23355c = m1VarI;
        oVar.f23356d = m1VarI;
        oVar.f23357e = aVar;
        oVar.f23358f = aVar2;
        oVar.g = aVar3;
        oVar.f23359h = aVar4;
        oVar.f23360i = fVar;
        oVar.j = fVar2;
        oVar.f23361k = fVar3;
        oVar.f23362l = fVar4;
        j jVar = this.L0;
        jVar.setShapeAppearanceModel(oVar);
        jVar.setBounds(0, 0, this.F, this.G);
        Drawable drawable = this.M0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator it = this.N0.iterator();
        while (it.hasNext()) {
            b((Drawable) it.next());
        }
        N(false);
    }

    public void setThumbWidthResource(int i4) {
        setThumbWidth(getResources().getDimensionPixelSize(i4));
    }

    @Override // gd.e
    public void setTickActiveRadius(int i4) {
        if (this.f24674s0 != i4) {
            this.f24674s0 = i4;
            this.f24649f.setStrokeWidth(i4 * 2);
            N(false);
        }
    }

    @Override // gd.e
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f24686y0)) {
            return;
        }
        this.f24686y0 = colorStateList;
        this.f24649f.setColor(o(colorStateList));
        invalidate();
    }

    @Override // gd.e
    public void setTickInactiveRadius(int i4) {
        if (this.f24676t0 != i4) {
            this.f24676t0 = i4;
            this.f24647e.setStrokeWidth(i4 * 2);
            N(false);
        }
    }

    @Override // gd.e
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f24688z0)) {
            return;
        }
        this.f24688z0 = colorStateList;
        this.f24647e.setColor(o(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i4) {
        if (this.f24672r0 != i4) {
            this.f24672r0 = i4;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z3) {
        setTickVisibilityMode(z3 ? 0 : 2);
    }

    @Override // gd.e
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.A0)) {
            return;
        }
        this.A0 = colorStateList;
        this.f24641b.setColor(o(colorStateList));
        invalidate();
    }

    @Override // gd.e
    public void setTrackCornerSize(int i4) {
        if (this.M == i4) {
            return;
        }
        this.M = i4;
        invalidate();
    }

    @Override // gd.e
    public void setTrackHeight(int i4) {
        if (this.D != i4) {
            this.D = i4;
            this.f24639a.setStrokeWidth(i4);
            this.f24641b.setStrokeWidth(this.D);
            N(false);
        }
    }

    @Override // gd.e
    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.T) {
            return;
        }
        this.T = colorStateList;
        K();
        J();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.R) {
            return;
        }
        this.R = drawable;
        this.S = false;
        J();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        this.Q = false;
        K();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f24642b0) {
            return;
        }
        this.f24642b0 = colorStateList;
        M();
        L();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.W) {
            return;
        }
        this.W = drawable;
        this.f24640a0 = false;
        L();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.U) {
            return;
        }
        this.U = drawable;
        this.V = false;
        M();
        invalidate();
    }

    @Override // gd.e
    public void setTrackIconSize(int i4) {
        if (this.f24644c0 == i4) {
            return;
        }
        this.f24644c0 = i4;
        invalidate();
    }

    @Override // gd.e
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.B0)) {
            return;
        }
        this.B0 = colorStateList;
        this.f24639a.setColor(o(colorStateList));
        invalidate();
    }

    @Override // gd.e
    public void setTrackInsideCornerSize(int i4) {
        if (this.N == i4) {
            return;
        }
        this.N = i4;
        invalidate();
    }

    @Override // gd.e
    public void setTrackStopIndicatorSize(int i4) {
        if (this.L == i4) {
            return;
        }
        this.L = i4;
        this.g.setStrokeWidth(i4);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f10) {
        setValues(Float.valueOf(f10));
    }

    public void setValueFrom(float f10) {
        this.f24658k0 = f10;
        this.f24682w0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f24660l0 = f10;
        this.f24682w0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        b(drawableNewDrawable);
        this.M0 = drawableNewDrawable;
        this.N0.clear();
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i4) {
        setTrackIconActiveEnd(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    public void setTrackIconActiveStart(int i4) {
        setTrackIconActiveStart(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    public void setTrackIconInactiveEnd(int i4) {
        setTrackIconInactiveEnd(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    public void setTrackIconInactiveStart(int i4) {
        setTrackIconInactiveStart(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }
}
