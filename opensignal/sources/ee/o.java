package ee;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f8137c;

    public o(q qVar) {
        this.f8137c = qVar;
    }

    @Override // ee.t
    public final void a(Matrix matrix, de.a aVar, int i10, Canvas canvas) {
        float f10;
        q qVar = this.f8137c;
        float f11 = qVar.f8146f;
        float f12 = qVar.f8147g;
        RectF rectF = new RectF(qVar.f8142b, qVar.f8143c, qVar.f8144d, qVar.f8145e);
        Paint paint = aVar.f7329b;
        boolean z10 = f12 < 0.0f;
        Path path = aVar.f7334g;
        int[] iArr = de.a.k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f7333f;
            iArr[2] = aVar.f7332e;
            iArr[3] = aVar.f7331d;
            f10 = 0.0f;
        } else {
            path.rewind();
            f10 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            iArr[0] = 0;
            iArr[1] = aVar.f7331d;
            iArr[2] = aVar.f7332e;
            iArr[3] = aVar.f7333f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f10) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = de.a.f7327l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f7335h);
        }
        canvas.drawArc(rectF, f11, f12, true, paint);
        canvas.restore();
    }
}
