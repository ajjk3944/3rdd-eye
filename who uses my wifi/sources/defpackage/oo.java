package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oo extends aq {
    public static final no D = new no(0);
    public TimeInterpolator A;
    public TimeInterpolator B;
    public TimeInterpolator C;
    public final m60 s;
    public final ox0 t;
    public final nx0 u;
    public final cq v;
    public float w;
    public boolean x;
    public final ValueAnimator y;
    public ValueAnimator z;

    public oo(Context context, v60 v60Var, m60 m60Var) {
        super(context, v60Var);
        this.x = false;
        this.s = m60Var;
        cq cqVar = new cq();
        this.v = cqVar;
        cqVar.g = true;
        ox0 ox0Var = new ox0();
        this.t = ox0Var;
        ox0Var.a(1.0f);
        ox0Var.b(50.0f);
        nx0 nx0Var = new nx0(this, D);
        this.u = nx0Var;
        nx0Var.k = ox0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.y = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new e5(this, v60Var, 1));
        if (v60Var.c(true) && v60Var.m != 0) {
            valueAnimator.start();
        }
        if (this.n != 1.0f) {
            this.n = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.q)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.i;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.j;
            this.s.c(canvas, bounds, fB, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float fC = c();
            cq cqVar = this.v;
            cqVar.f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.o;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            v60 v60Var = this.g;
            cqVar.c = v60Var.e[0];
            int iG = v60Var.i;
            if (iG > 0) {
                if (this.s == null) {
                    iG = (int) ((bd2.g(cqVar.b, 0.0f, 0.01f) * iG) / 0.01f);
                }
                this.s.g(canvas, paint, cqVar.b, 1.0f, v60Var.f, this.p, iG);
            } else {
                this.s.g(canvas, paint, 0.0f, 1.0f, v60Var.f, this.p, 0);
            }
            int i = this.p;
            m60 m60Var = this.s;
            m60Var.getClass();
            int iB = i41.b(cqVar.c, i);
            m60Var.m = cqVar.g;
            float f = cqVar.a;
            float f2 = cqVar.b;
            int i2 = cqVar.d;
            m60Var.e(canvas, paint, f, f2, iB, i2, i2, cqVar.e, cqVar.f, true);
            int i3 = v60Var.e[0];
            int i4 = this.p;
            m60 m60Var2 = this.s;
            m60Var2.getClass();
            int iB2 = i41.b(i3, i4);
            m60Var2.m = false;
            v60 v60Var2 = m60Var2.a;
            if (v60Var2.r > 0 && iB2 != 0) {
                paint.setStyle(style);
                paint.setColor(iB2);
                Integer num = v60Var2.s;
                dq dqVar = new dq(new float[]{(m60Var2.f / 2.0f) - (num != null ? (v60Var2.r / 2.0f) + num.floatValue() : m60Var2.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
                float f3 = v60Var2.r;
                m60Var2.f(canvas, paint, dqVar, f3, f3, (m60Var2.h * f3) / m60Var2.g, null, 0.0f, 0.0f, 0.0f, false);
            }
            canvas.restore();
        }
    }

    @Override // defpackage.aq
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        s4 s4Var = this.h;
        ContentResolver contentResolver = this.f.getContentResolver();
        s4Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.x = true;
            return zE;
        }
        this.x = false;
        this.t.b(50.0f / f);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.s.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.s.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.u.d();
        this.v.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        float f2 = (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
        boolean z = this.x;
        cq cqVar = this.v;
        nx0 nx0Var = this.u;
        if (!z) {
            nx0Var.b = cqVar.b * 10000.0f;
            nx0Var.c = true;
            nx0Var.a(f);
            return true;
        }
        nx0Var.d();
        cqVar.b = f / 10000.0f;
        invalidateSelf();
        cqVar.e = f2;
        invalidateSelf();
        return true;
    }
}
