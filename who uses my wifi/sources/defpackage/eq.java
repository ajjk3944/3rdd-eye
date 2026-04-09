package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class eq {
    public final v60 a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public eq(v60 v60Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = v60Var;
        this.e = new Matrix();
    }

    public static float d(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract int a();

    public abstract void b();

    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.a.d();
        m60 m60Var = (m60) this;
        if (m60Var.f != rect.width()) {
            m60Var.f = rect.width();
            m60Var.b();
        }
        float fA = m60Var.a();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fA) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        v60 v60Var = m60Var.a;
        if (v60Var.q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = m60Var.f / 2.0f;
        float f3 = fA / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        m60Var.g = v60Var.a * f;
        m60Var.h = Math.min(r1 / 2, v60Var.a()) * f;
        m60Var.j = v60Var.l * f;
        m60Var.i = Math.min(v60Var.a / 2.0f, v60Var.b()) * f;
        if (z || z2) {
            if ((z && v60Var.g == 2) || (z2 && v60Var.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && v60Var.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * v60Var.a) / 2.0f);
            }
        }
        if (z2 && v60Var.h == 3) {
            m60Var.n = f;
        } else {
            m60Var.n = 1.0f;
        }
    }
}
