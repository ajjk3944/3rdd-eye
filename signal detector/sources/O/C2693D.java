package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.apm.insight.R;
import g.AbstractC2327a;

/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2693D extends C2748y {

    /* renamed from: e, reason: collision with root package name */
    public final C2692C f22362e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f22363f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f22364g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22365h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22366j;

    public C2693D(C2692C c2692c) {
        super(c2692c);
        this.f22364g = null;
        this.f22365h = null;
        this.i = false;
        this.f22366j = false;
        this.f22362e = c2692c;
    }

    @Override // o.C2748y
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C2692C c2692c = this.f22362e;
        Context context = c2692c.getContext();
        int[] iArr = AbstractC2327a.f20120g;
        a1 a1VarI = a1.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        R.O.l(c2692c, c2692c.getContext(), iArr, attributeSet, (TypedArray) a1VarI.f22480c, R.attr.seekBarStyle);
        Drawable drawableE = a1VarI.e(0);
        if (drawableE != null) {
            c2692c.setThumb(drawableE);
        }
        Drawable drawableD = a1VarI.d(1);
        Drawable drawable = this.f22363f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f22363f = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(c2692c);
            drawableD.setLayoutDirection(c2692c.getLayoutDirection());
            if (drawableD.isStateful()) {
                drawableD.setState(c2692c.getDrawableState());
            }
            f();
        }
        c2692c.invalidate();
        if (typedArray.hasValue(3)) {
            this.f22365h = AbstractC2720j0.c(typedArray.getInt(3, -1), this.f22365h);
            this.f22366j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f22364g = a1VarI.c(2);
            this.i = true;
        }
        a1VarI.j();
        f();
    }

    public final void f() {
        Drawable drawable = this.f22363f;
        if (drawable != null) {
            if (this.i || this.f22366j) {
                Drawable drawableMutate = drawable.mutate();
                this.f22363f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.f22364g);
                }
                if (this.f22366j) {
                    this.f22363f.setTintMode(this.f22365h);
                }
                if (this.f22363f.isStateful()) {
                    this.f22363f.setState(this.f22362e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f22363f != null) {
            int max = this.f22362e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f22363f.getIntrinsicWidth();
                int intrinsicHeight = this.f22363f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f22363f.setBounds(-i, -i3, i, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f22363f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
