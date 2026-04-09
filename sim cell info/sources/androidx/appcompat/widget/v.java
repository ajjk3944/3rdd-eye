package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1136d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1137e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1138f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1139g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1140h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1141i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f1138f = null;
        this.f1139g = null;
        this.f1140h = false;
        this.f1141i = false;
        this.f1136d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1137e;
        if (drawable != null) {
            if (this.f1140h || this.f1141i) {
                Drawable drawableP = u.a.p(drawable.mutate());
                this.f1137e = drawableP;
                if (this.f1140h) {
                    u.a.n(drawableP, this.f1138f);
                }
                if (this.f1141i) {
                    u.a.o(this.f1137e, this.f1139g);
                }
                if (this.f1137e.isStateful()) {
                    this.f1137e.setState(this.f1136d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    void c(AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.c(attributeSet, i2);
        w0 w0VarT = w0.t(this.f1136d.getContext(), attributeSet, a.j.V, i2, 0);
        Drawable drawableG = w0VarT.g(a.j.W);
        if (drawableG != null) {
            this.f1136d.setThumb(drawableG);
        }
        j(w0VarT.f(a.j.X));
        int i3 = a.j.Z;
        if (w0VarT.q(i3)) {
            this.f1139g = e0.d(w0VarT.j(i3, -1), this.f1139g);
            this.f1141i = true;
        }
        int i4 = a.j.Y;
        if (w0VarT.q(i4)) {
            this.f1138f = w0VarT.c(i4);
            this.f1140h = true;
        }
        w0VarT.u();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1137e != null) {
            int max = this.f1136d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1137e.getIntrinsicWidth();
                int intrinsicHeight = this.f1137e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1137e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1136d.getWidth() - this.f1136d.getPaddingLeft()) - this.f1136d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1136d.getPaddingLeft(), this.f1136d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1137e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1137e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1136d.getDrawableState())) {
            this.f1136d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1137e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1137e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1137e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1136d);
            u.a.l(drawable, a0.s.t(this.f1136d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1136d.getDrawableState());
            }
            f();
        }
        this.f1136d.invalidate();
    }
}
