package p;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatSeekBar f20215e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f20216f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f20217g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f20218h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20219i;
    public boolean j;

    public z(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f20217g = null;
        this.f20218h = null;
        this.f20219i = false;
        this.j = false;
        this.f20215e = appCompatSeekBar;
    }

    @Override // p.w
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        AppCompatSeekBar appCompatSeekBar = this.f20215e;
        io.sentry.k kVarH0 = io.sentry.k.h0(appCompatSeekBar.getContext(), attributeSet, h.j.AppCompatSeekBar, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        u3.i0.m(appCompatSeekBar, appCompatSeekBar.getContext(), h.j.AppCompatSeekBar, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        Drawable drawableV = kVarH0.V(h.j.AppCompatSeekBar_android_thumb);
        if (drawableV != null) {
            appCompatSeekBar.setThumb(drawableV);
        }
        Drawable drawableU = kVarH0.U(h.j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f20216f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f20216f = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(appCompatSeekBar);
            drawableU.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableU.isStateful()) {
                drawableU.setState(appCompatSeekBar.getDrawableState());
            }
            f();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(h.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f20218h = c1.c(typedArray.getInt(h.j.AppCompatSeekBar_tickMarkTintMode, -1), this.f20218h);
            this.j = true;
        }
        if (typedArray.hasValue(h.j.AppCompatSeekBar_tickMarkTint)) {
            this.f20217g = kVarH0.T(h.j.AppCompatSeekBar_tickMarkTint);
            this.f20219i = true;
        }
        kVarH0.l0();
        f();
    }

    public final void f() {
        Drawable drawable = this.f20216f;
        if (drawable != null) {
            if (this.f20219i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f20216f = drawableMutate;
                if (this.f20219i) {
                    drawableMutate.setTintList(this.f20217g);
                }
                if (this.j) {
                    this.f20216f.setTintMode(this.f20218h);
                }
                if (this.f20216f.isStateful()) {
                    this.f20216f.setState(this.f20215e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f20216f != null) {
            int max = this.f20215e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f20216f.getIntrinsicWidth();
                int intrinsicHeight = this.f20216f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f20216f.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f20216f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
