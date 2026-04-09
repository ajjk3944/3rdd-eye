package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends z {

    /* renamed from: e, reason: collision with root package name */
    public final d0 f30684e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f30685f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f30686h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30687i;
    public boolean j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.g = null;
        this.f30686h = null;
        this.f30687i = false;
        this.j = false;
        this.f30684e = d0Var;
    }

    @Override // p.z
    public final void b(AttributeSet attributeSet, int i4) {
        super.b(attributeSet, R.attr.seekBarStyle);
        d0 d0Var = this.f30684e;
        Context context = d0Var.getContext();
        int[] iArr = h.a.g;
        i0.f fVarJ = i0.f.J(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        e4.v0.n(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) fVarJ.f25417c, R.attr.seekBarStyle);
        Drawable drawableB = fVarJ.B(0);
        if (drawableB != null) {
            d0Var.setThumb(drawableB);
        }
        Drawable drawableA = fVarJ.A(1);
        Drawable drawable = this.f30685f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f30685f = drawableA;
        if (drawableA != null) {
            drawableA.setCallback(d0Var);
            drawableA.setLayoutDirection(d0Var.getLayoutDirection());
            if (drawableA.isStateful()) {
                drawableA.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f30686h = i1.c(typedArray.getInt(3, -1), this.f30686h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = fVarJ.y(2);
            this.f30687i = true;
        }
        fVarJ.M();
        f();
    }

    public final void f() {
        Drawable drawable = this.f30685f;
        if (drawable != null) {
            if (this.f30687i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f30685f = drawableMutate;
                if (this.f30687i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f30685f.setTintMode(this.f30686h);
                }
                if (this.f30685f.isStateful()) {
                    this.f30685f.setState(this.f30684e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f30685f != null) {
            int max = this.f30684e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f30685f.getIntrinsicWidth();
                int intrinsicHeight = this.f30685f.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f30685f.setBounds(-i4, -i10, i4, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f30685f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
