package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class lc0 extends Drawable.ConstantState {
    public su0 a;
    public dy0 b;
    public jr c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public Paint.Style r;

    public lc0(su0 su0Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = su0Var;
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        nc0 nc0Var = new nc0(this);
        nc0Var.k = true;
        nc0Var.l = true;
        return nc0Var;
    }

    public lc0(lc0 lc0Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = lc0Var.a;
        this.b = lc0Var.b;
        this.c = lc0Var.c;
        this.k = lc0Var.k;
        this.d = lc0Var.d;
        this.e = lc0Var.e;
        this.g = lc0Var.g;
        this.f = lc0Var.f;
        this.l = lc0Var.l;
        this.i = lc0Var.i;
        this.q = lc0Var.q;
        this.o = lc0Var.o;
        this.j = lc0Var.j;
        this.m = lc0Var.m;
        this.n = lc0Var.n;
        this.p = lc0Var.p;
        this.r = lc0Var.r;
        if (lc0Var.h != null) {
            this.h = new Rect(lc0Var.h);
        }
    }
}
