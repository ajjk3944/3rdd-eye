package ed;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends w {

    /* renamed from: c, reason: collision with root package name */
    public final t f23366c;

    public r(t tVar) {
        this.f23366c = tVar;
    }

    @Override // ed.w
    public final void a(Matrix matrix, dd.a aVar, int i4, Canvas canvas) {
        float f10;
        t tVar = this.f23366c;
        float f11 = tVar.f23375f;
        float f12 = tVar.g;
        RectF rectF = new RectF(tVar.f23371b, tVar.f23372c, tVar.f23373d, tVar.f23374e);
        Paint paint = aVar.f22183b;
        boolean z3 = f12 < 0.0f;
        Path path = aVar.g;
        int[] iArr = dd.a.f22180k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f22187f;
            iArr[2] = aVar.f22186e;
            iArr[3] = aVar.f22185d;
            f10 = 0.0f;
        } else {
            path.rewind();
            f10 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i4;
            rectF.inset(f13, f13);
            iArr[0] = 0;
            iArr[1] = aVar.f22185d;
            iArr[2] = aVar.f22186e;
            iArr[3] = aVar.f22187f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f10) {
            return;
        }
        float f14 = 1.0f - (i4 / fWidth);
        float[] fArr = dd.a.f22181l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f22188h);
        }
        canvas.drawArc(rectF, f11, f12, true, paint);
        canvas.restore();
    }
}
