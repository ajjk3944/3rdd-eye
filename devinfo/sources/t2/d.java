package t2;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    public static void b(Canvas canvas, int i4, BlendMode blendMode) {
        canvas.drawColor(i4, blendMode);
    }

    public static void c(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void d(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void e(Canvas canvas, RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public static void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void h(Canvas canvas, MeasuredText measuredText, int i4, int i10, int i11, int i12, float f10, float f11, boolean z3, Paint paint) {
        canvas.drawTextRun(measuredText, i4, i10, i11, i12, f10, f11, z3, paint);
    }

    public static void i(Canvas canvas) {
        canvas.enableZ();
    }

    public static final void j(Paint paint, CharSequence charSequence, int i4, int i10, Rect rect) {
        paint.getTextBounds(charSequence, i4, i10, rect);
    }
}
