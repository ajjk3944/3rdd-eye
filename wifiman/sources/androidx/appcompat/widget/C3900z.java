package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.AbstractC5936j;
import x1.AbstractC8416a;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3900z extends C3895u {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f27466d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f27467e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f27468f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f27469g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27470h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27471i;

    C3900z(SeekBar seekBar) {
        super(seekBar);
        this.f27468f = null;
        this.f27469g = null;
        this.f27470h = false;
        this.f27471i = false;
        this.f27466d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f27467e;
        if (drawable != null) {
            if (this.f27470h || this.f27471i) {
                Drawable drawableR = AbstractC8416a.r(drawable.mutate());
                this.f27467e = drawableR;
                if (this.f27470h) {
                    AbstractC8416a.o(drawableR, this.f27468f);
                }
                if (this.f27471i) {
                    AbstractC8416a.p(this.f27467e, this.f27469g);
                }
                if (this.f27467e.isStateful()) {
                    this.f27467e.setState(this.f27466d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C3895u
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f27466d.getContext();
        int[] iArr = AbstractC5936j.f48161T;
        b0 b0VarV = b0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f27466d;
        F1.W.k0(seekBar, seekBar.getContext(), iArr, attributeSet, b0VarV.r(), i10, 0);
        Drawable drawableH = b0VarV.h(AbstractC5936j.f48165U);
        if (drawableH != null) {
            this.f27466d.setThumb(drawableH);
        }
        j(b0VarV.g(AbstractC5936j.f48169V));
        int i11 = AbstractC5936j.f48177X;
        if (b0VarV.s(i11)) {
            this.f27469g = K.d(b0VarV.k(i11, -1), this.f27469g);
            this.f27471i = true;
        }
        int i12 = AbstractC5936j.f48173W;
        if (b0VarV.s(i12)) {
            this.f27468f = b0VarV.c(i12);
            this.f27470h = true;
        }
        b0VarV.x();
        f();
    }

    void g(Canvas canvas) {
        if (this.f27467e != null) {
            int max = this.f27466d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f27467e.getIntrinsicWidth();
                int intrinsicHeight = this.f27467e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f27467e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f27466d.getWidth() - this.f27466d.getPaddingLeft()) - this.f27466d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f27466d.getPaddingLeft(), this.f27466d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f27467e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f27467e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f27466d.getDrawableState())) {
            this.f27466d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f27467e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f27467e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f27467e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f27466d);
            AbstractC8416a.m(drawable, this.f27466d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f27466d.getDrawableState());
            }
            f();
        }
        this.f27466d.invalidate();
    }
}
