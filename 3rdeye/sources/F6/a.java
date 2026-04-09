package F6;

import K6.C0713c;
import N7.C1126cb;
import N7.C1185ga;
import N7.S9;
import N7.Xa;
import O6.C1477c;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final C1126cb f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final Xa f1658c;

    /* renamed from: d, reason: collision with root package name */
    public final Canvas f1659d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.d f1660e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1661f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1662g;

    public a(DisplayMetrics displayMetrics, C1126cb c1126cb, Xa xa, Canvas canvas, A7.d resolver) {
        l.f(resolver, "resolver");
        this.f1656a = displayMetrics;
        this.f1657b = c1126cb;
        this.f1658c = xa;
        this.f1659d = canvas;
        this.f1660e = resolver;
        Paint paint = new Paint();
        this.f1661f = paint;
        if (c1126cb == null) {
            this.f1662g = null;
            return;
        }
        A7.b<Long> bVar = c1126cb.f8023a;
        float fB = C0713c.B(bVar != null ? bVar.a(resolver) : null, displayMetrics);
        this.f1662g = new float[]{fB, fB, fB, fB, fB, fB, fB, fB};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        C1185ga c1185ga = c1126cb.f8024b;
        paint.setStrokeWidth(C1477c.a(c1185ga, resolver, displayMetrics));
        if (c1185ga != null) {
            paint.setColor(c1185ga.f8299a.a(resolver).intValue());
        }
    }

    public final void a(float[] fArr, float f10, float f11, float f12, float f13) {
        RectF rectF = new RectF();
        rectF.set(f10, f11, f12, f13);
        Xa xa = this.f1658c;
        Object objA = xa != null ? xa.a() : null;
        boolean z10 = objA instanceof S9;
        Canvas canvas = this.f1659d;
        A7.d dVar = this.f1660e;
        if (z10) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((S9) objA).f6211a.a(dVar).intValue());
            Path path = new Path();
            path.reset();
            if (fArr == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            path.close();
            canvas.drawPath(path, paint);
        }
        C1126cb c1126cb = this.f1657b;
        if ((c1126cb != null ? c1126cb.f8024b : null) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        C1185ga c1185ga = c1126cb.f8024b;
        l.c(c1185ga);
        float fA = C1477c.a(c1185ga, dVar, this.f1656a) / 2.0f;
        rectF2.set(Math.max(0.0f, f10 + fA), Math.max(0.0f, f11 + fA), Math.max(0.0f, f12 - fA), Math.max(0.0f, f13 - fA));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = Math.max(0.0f, fArr[i] - fA);
            }
        }
        Path path2 = new Path();
        path2.reset();
        if (fArr2 == null) {
            path2.addRect(rectF2, Path.Direction.CW);
        } else {
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        }
        path2.close();
        canvas.drawPath(path2, this.f1661f);
    }
}
