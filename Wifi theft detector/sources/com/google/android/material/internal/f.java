package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f10699a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f10700b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f10701c;

    /* renamed from: d, reason: collision with root package name */
    public float f10702d;

    public static class b extends Drawable {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public f(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new b();
        this.f10699a = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new b();
        this.f10700b = drawableMutate2;
        int iF = drawable != null ? k0.a.f(drawable) : 3;
        int iF2 = drawable2 != null ? k0.a.f(drawable2) : 3;
        k0.a.m(drawableMutate, iF);
        k0.a.m(drawableMutate2, iF2);
        drawableMutate2.setAlpha(0);
        this.f10701c = new float[2];
    }

    public void a(float f10) {
        if (this.f10702d != f10) {
            this.f10702d = f10;
            h.a(f10, this.f10701c);
            this.f10699a.setAlpha((int) (this.f10701c[0] * 255.0f));
            this.f10700b.setAlpha((int) (this.f10701c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f10699a.draw(canvas);
        this.f10700b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f10699a.getIntrinsicHeight(), this.f10700b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f10699a.getIntrinsicWidth(), this.f10700b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f10699a.getMinimumHeight(), this.f10700b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f10699a.getMinimumWidth(), this.f10700b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f10699a.isStateful() || this.f10700b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f10702d <= 0.5f) {
            this.f10699a.setAlpha(i10);
            this.f10700b.setAlpha(0);
        } else {
            this.f10699a.setAlpha(0);
            this.f10700b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f10699a.setBounds(i10, i11, i12, i13);
        this.f10700b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10699a.setColorFilter(colorFilter);
        this.f10700b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f10699a.setState(iArr) || this.f10700b.setState(iArr);
    }
}
