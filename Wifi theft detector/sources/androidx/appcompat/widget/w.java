package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class w extends r {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f1370d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1371e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f1372f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1373g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1374h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1375i;

    public w(SeekBar seekBar) {
        super(seekBar);
        this.f1372f = null;
        this.f1373g = null;
        this.f1374h = false;
        this.f1375i = false;
        this.f1370d = seekBar;
    }

    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1370d.getContext();
        int[] iArr = c.j.AppCompatSeekBar;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1370d;
        ViewCompat.h0(seekBar, seekBar.getContext(), iArr, attributeSet, z0VarV.r(), i10, 0);
        Drawable drawableH = z0VarV.h(c.j.AppCompatSeekBar_android_thumb);
        if (drawableH != null) {
            this.f1370d.setThumb(drawableH);
        }
        j(z0VarV.g(c.j.AppCompatSeekBar_tickMark));
        int i11 = c.j.AppCompatSeekBar_tickMarkTintMode;
        if (z0VarV.s(i11)) {
            this.f1373g = j0.e(z0VarV.k(i11, -1), this.f1373g);
            this.f1375i = true;
        }
        int i12 = c.j.AppCompatSeekBar_tickMarkTint;
        if (z0VarV.s(i12)) {
            this.f1372f = z0VarV.c(i12);
            this.f1374h = true;
        }
        z0VarV.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1371e;
        if (drawable != null) {
            if (this.f1374h || this.f1375i) {
                Drawable drawableR = k0.a.r(drawable.mutate());
                this.f1371e = drawableR;
                if (this.f1374h) {
                    k0.a.o(drawableR, this.f1372f);
                }
                if (this.f1375i) {
                    k0.a.p(this.f1371e, this.f1373g);
                }
                if (this.f1371e.isStateful()) {
                    this.f1371e.setState(this.f1370d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f1371e != null) {
            int max = this.f1370d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1371e.getIntrinsicWidth();
                int intrinsicHeight = this.f1371e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1371e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1370d.getWidth() - this.f1370d.getPaddingLeft()) - this.f1370d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1370d.getPaddingLeft(), this.f1370d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1371e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1371e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1370d.getDrawableState())) {
            this.f1370d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f1371e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1371e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1371e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1370d);
            k0.a.m(drawable, this.f1370d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f1370d.getDrawableState());
            }
            f();
        }
        this.f1370d.invalidate();
    }
}
