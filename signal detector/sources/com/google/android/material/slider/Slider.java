package com.google.android.material.slider;

import G.c;
import G3.C0147a;
import G3.C0152f;
import G3.j;
import G3.n;
import G3.o;
import I3.e;
import I3.f;
import a.AbstractC0241a;
import a4.p;
import a4.t;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.Iterator;

/* loaded from: classes.dex */
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
        return this.f1903A0;
    }

    public int getFocusedThumbIndex() {
        return this.f1904B0;
    }

    public int getHaloRadius() {
        return this.f1942V;
    }

    public ColorStateList getHaloTintList() {
        return this.f1922K0;
    }

    public int getLabelBehavior() {
        return this.f1932Q;
    }

    public float getStepSize() {
        return this.f1906C0;
    }

    public float getThumbElevation() {
        return this.f1947Y0.f1597b.f1572n;
    }

    public int getThumbHeight() {
        return this.f1940U;
    }

    @Override // I3.e
    public int getThumbRadius() {
        return this.f1938T / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f1947Y0.f1597b.f1564e;
    }

    public float getThumbStrokeWidth() {
        return this.f1947Y0.f1597b.f1569k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1947Y0.f1597b.f1563d;
    }

    public int getThumbTrackGapSize() {
        return this.f1944W;
    }

    public int getThumbWidth() {
        return this.f1938T;
    }

    public int getTickActiveRadius() {
        return this.f1912F0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f1924L0;
    }

    public int getTickInactiveRadius() {
        return this.f1914G0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f1925M0;
    }

    public ColorStateList getTickTintList() {
        if (this.f1925M0.equals(this.f1924L0)) {
            return this.f1924L0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f1910E0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f1927N0;
    }

    @Override // I3.e
    public int getTrackCornerSize() {
        int i = this.f1958d0;
        return i == -1 ? this.f1934R / 2 : i;
    }

    public int getTrackHeight() {
        return this.f1934R;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.f1976k0;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.f1972i0;
    }

    public Drawable getTrackIconActiveStart() {
        return this.f1967g0;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.f1984p0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.f1982n0;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.f1978l0;
    }

    public int getTrackIconSize() {
        return this.f1985q0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f1929O0;
    }

    public int getTrackInsideCornerSize() {
        return this.f1961e0;
    }

    public int getTrackSidePadding() {
        return this.f1936S;
    }

    public int getTrackStopIndicatorSize() {
        return this.f1955c0;
    }

    public ColorStateList getTrackTintList() {
        if (this.f1929O0.equals(this.f1927N0)) {
            return this.f1927N0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f1916H0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f1991x0;
    }

    public float getValueTo() {
        return this.f1992y0;
    }

    @Override // I3.e
    public void setCentered(boolean z6) {
        if (this.f1964f0 == z6) {
            return;
        }
        this.f1964f0 = z6;
        if (z6) {
            setValues(Float.valueOf((this.f1991x0 + this.f1992y0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f1991x0));
        }
        L(true);
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // I3.e, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z6) {
        super.setEnabled(z6);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f1993z0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f1904B0 = i;
        this.f1969h.w(i);
        postInvalidate();
    }

    @Override // I3.e
    public void setHaloRadius(int i) {
        if (i == this.f1942V) {
            return;
        }
        this.f1942V = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f1942V);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // I3.e
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1922K0)) {
            return;
        }
        this.f1922K0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iM = m(colorStateList);
        Paint paint = this.f1957d;
        paint.setColor(iM);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // I3.e
    public void setLabelBehavior(int i) {
        if (this.f1932Q != i) {
            this.f1932Q = i;
            L(true);
        }
    }

    @Override // I3.e
    public void setOrientation(int i) {
        if (this.f1926N == i) {
            return;
        }
        this.f1926N = i;
        L(true);
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.f1906C0 != f2) {
                this.f1906C0 = f2;
                this.f1920J0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f2 + ") must be 0, or a factor of the valueFrom(" + this.f1991x0 + ")-valueTo(" + this.f1992y0 + ") range");
    }

    @Override // I3.e
    public void setThumbElevation(float f2) {
        this.f1947Y0.p(f2);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // I3.e
    public void setThumbHeight(int i) {
        if (i == this.f1940U) {
            return;
        }
        this.f1940U = i;
        this.f1947Y0.setBounds(0, 0, this.f1938T, i);
        Drawable drawable = this.f1948Z0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f1951a1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        L(false);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i3 = i * 2;
        setThumbWidth(i3);
        setThumbHeight(i3);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // I3.e
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f1947Y0.v(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(c.b(getContext(), i));
        }
    }

    @Override // I3.e
    public void setThumbStrokeWidth(float f2) {
        j jVar = this.f1947Y0;
        jVar.f1597b.f1569k = f2;
        jVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        j jVar = this.f1947Y0;
        if (colorStateList.equals(jVar.f1597b.f1563d)) {
            return;
        }
        jVar.q(colorStateList);
        invalidate();
    }

    @Override // I3.e
    public void setThumbTrackGapSize(int i) {
        if (this.f1944W == i) {
            return;
        }
        this.f1944W = i;
        invalidate();
    }

    @Override // I3.e
    public void setThumbWidth(int i) {
        if (i == this.f1938T) {
            return;
        }
        this.f1938T = i;
        C0152f c0152f = new C0152f(0);
        C0152f c0152f2 = new C0152f(0);
        C0152f c0152f3 = new C0152f(0);
        C0152f c0152f4 = new C0152f(0);
        float f2 = this.f1938T / 2.0f;
        AbstractC0241a abstractC0241aD = p.d(0);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        n.b(abstractC0241aD);
        C0147a c0147a = new C0147a(f2);
        C0147a c0147a2 = new C0147a(f2);
        C0147a c0147a3 = new C0147a(f2);
        C0147a c0147a4 = new C0147a(f2);
        o oVar = new o();
        oVar.f1624a = abstractC0241aD;
        oVar.f1625b = abstractC0241aD;
        oVar.f1626c = abstractC0241aD;
        oVar.f1627d = abstractC0241aD;
        oVar.f1628e = c0147a;
        oVar.f1629f = c0147a2;
        oVar.f1630g = c0147a3;
        oVar.f1631h = c0147a4;
        oVar.i = c0152f;
        oVar.f1632j = c0152f2;
        oVar.f1633k = c0152f3;
        oVar.f1634l = c0152f4;
        j jVar = this.f1947Y0;
        jVar.setShapeAppearanceModel(oVar);
        jVar.setBounds(0, 0, this.f1938T, this.f1940U);
        Drawable drawable = this.f1948Z0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f1951a1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        L(false);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // I3.e
    public void setTickActiveRadius(int i) {
        if (this.f1912F0 != i) {
            this.f1912F0 = i;
            this.f1963f.setStrokeWidth(i * 2);
            L(false);
        }
    }

    @Override // I3.e
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1924L0)) {
            return;
        }
        this.f1924L0 = colorStateList;
        this.f1963f.setColor(m(colorStateList));
        invalidate();
    }

    @Override // I3.e
    public void setTickInactiveRadius(int i) {
        if (this.f1914G0 != i) {
            this.f1914G0 = i;
            this.f1960e.setStrokeWidth(i * 2);
            L(false);
        }
    }

    @Override // I3.e
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1925M0)) {
            return;
        }
        this.f1925M0 = colorStateList;
        this.f1960e.setColor(m(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.f1910E0 != i) {
            this.f1910E0 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z6) {
        setTickVisibilityMode(z6 ? 0 : 2);
    }

    @Override // I3.e
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1927N0)) {
            return;
        }
        this.f1927N0 = colorStateList;
        this.f1952b.setColor(m(colorStateList));
        invalidate();
    }

    @Override // I3.e
    public void setTrackCornerSize(int i) {
        if (this.f1958d0 == i) {
            return;
        }
        this.f1958d0 = i;
        invalidate();
    }

    @Override // I3.e
    public void setTrackHeight(int i) {
        if (this.f1934R != i) {
            this.f1934R = i;
            this.f1949a.setStrokeWidth(i);
            this.f1952b.setStrokeWidth(this.f1934R);
            L(false);
        }
    }

    @Override // I3.e
    public void setTrackIconActiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f1976k0) {
            return;
        }
        this.f1976k0 = colorStateList;
        I();
        H();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconActiveEnd(Drawable drawable) {
        if (drawable == this.f1972i0) {
            return;
        }
        this.f1972i0 = drawable;
        this.f1974j0 = false;
        H();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconActiveStart(Drawable drawable) {
        if (drawable == this.f1967g0) {
            return;
        }
        this.f1967g0 = drawable;
        this.f1970h0 = false;
        I();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconInactiveColor(ColorStateList colorStateList) {
        if (colorStateList == this.f1984p0) {
            return;
        }
        this.f1984p0 = colorStateList;
        K();
        J();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconInactiveEnd(Drawable drawable) {
        if (drawable == this.f1982n0) {
            return;
        }
        this.f1982n0 = drawable;
        this.f1983o0 = false;
        J();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconInactiveStart(Drawable drawable) {
        if (drawable == this.f1978l0) {
            return;
        }
        this.f1978l0 = drawable;
        this.f1980m0 = false;
        K();
        invalidate();
    }

    @Override // I3.e
    public void setTrackIconSize(int i) {
        if (this.f1985q0 == i) {
            return;
        }
        this.f1985q0 = i;
        invalidate();
    }

    @Override // I3.e
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f1929O0)) {
            return;
        }
        this.f1929O0 = colorStateList;
        this.f1949a.setColor(m(colorStateList));
        invalidate();
    }

    @Override // I3.e
    public void setTrackInsideCornerSize(int i) {
        if (this.f1961e0 == i) {
            return;
        }
        this.f1961e0 = i;
        invalidate();
    }

    @Override // I3.e
    public void setTrackStopIndicatorSize(int i) {
        if (this.f1955c0 == i) {
            return;
        }
        this.f1955c0 = i;
        this.f1966g.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f2) {
        setValues(Float.valueOf(f2));
    }

    public void setValueFrom(float f2) {
        this.f1991x0 = f2;
        this.f1920J0 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.f1992y0 = f2;
        this.f1920J0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.f1948Z0 = drawableNewDrawable;
        this.f1951a1.clear();
        postInvalidate();
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? t.i(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? t.i(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? t.i(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? t.i(getContext(), i) : null);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(f fVar) {
    }
}
