package G3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class s extends x {

    /* renamed from: c, reason: collision with root package name */
    public final u f1649c;

    public s(u uVar) {
        this.f1649c = uVar;
    }

    @Override // G3.x
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        float f2;
        u uVar = this.f1649c;
        float f5 = uVar.f1658f;
        float f6 = uVar.f1659g;
        RectF rectF = new RectF(uVar.f1654b, uVar.f1655c, uVar.f1656d, uVar.f1657e);
        Paint paint = aVar.f1446b;
        boolean z6 = f6 < 0.0f;
        Path path = aVar.f1451g;
        int[] iArr = F3.a.f1443k;
        if (z6) {
            iArr[0] = 0;
            iArr[1] = aVar.f1450f;
            iArr[2] = aVar.f1449e;
            iArr[3] = aVar.f1448d;
            f2 = 0.0f;
        } else {
            path.rewind();
            f2 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f6);
            path.close();
            float f7 = -i;
            rectF.inset(f7, f7);
            iArr[0] = 0;
            iArr[1] = aVar.f1448d;
            iArr[2] = aVar.f1449e;
            iArr[3] = aVar.f1450f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f2) {
            return;
        }
        float f8 = 1.0f - (i / fWidth);
        float[] fArr = F3.a.f1444l;
        fArr[1] = f8;
        fArr[2] = ((1.0f - f8) / 2.0f) + f8;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1452h);
        }
        canvas.drawArc(rectF, f5, f6, true, paint);
        canvas.restore();
    }
}
