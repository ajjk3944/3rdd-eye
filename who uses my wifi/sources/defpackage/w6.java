package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w6 extends l92 {
    public final v6 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public w6(v6 v6Var) {
        super((AbsSeekBar) v6Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = v6Var;
    }

    @Override // defpackage.l92
    public final void C(AttributeSet attributeSet, int i) {
        super.C(attributeSet, R.attr.seekBarStyle);
        v6 v6Var = this.j;
        Context context = v6Var.getContext();
        int[] iArr = hn0.g;
        xb4 xb4VarR = xb4.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        e61.k(v6Var, v6Var.getContext(), iArr, attributeSet, (TypedArray) xb4VarR.h, R.attr.seekBarStyle);
        Drawable drawableN = xb4VarR.n(0);
        if (drawableN != null) {
            v6Var.setThumb(drawableN);
        }
        Drawable drawableM = xb4VarR.m(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = drawableM;
        if (drawableM != null) {
            drawableM.setCallback(v6Var);
            tp.b(drawableM, v6Var.getLayoutDirection());
            if (drawableM.isStateful()) {
                drawableM.setState(v6Var.getDrawableState());
            }
            O();
        }
        v6Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = yp.c(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = xb4VarR.k(2);
            this.n = true;
        }
        xb4VarR.z();
        O();
    }

    public final void O() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.n) {
                    sp.h(drawableMutate, this.l);
                }
                if (this.o) {
                    sp.i(this.k, this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void P(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
