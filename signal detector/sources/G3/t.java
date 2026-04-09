package G3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: c, reason: collision with root package name */
    public final v f1650c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1651d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1652e;

    public t(v vVar, float f2, float f5) {
        this.f1650c = vVar;
        this.f1651d = f2;
        this.f1652e = f5;
    }

    @Override // G3.x
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        v vVar = this.f1650c;
        float f2 = vVar.f1661c;
        float f5 = this.f1652e;
        float f6 = vVar.f1660b;
        float f7 = this.f1651d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f5, f6 - f7), 0.0f);
        Matrix matrix2 = this.f1664a;
        matrix2.set(matrix);
        matrix2.preTranslate(f7, f5);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i3 = aVar.f1450f;
        int[] iArr = F3.a.i;
        iArr[0] = i3;
        iArr[1] = aVar.f1449e;
        iArr[2] = aVar.f1448d;
        Paint paint = aVar.f1447c;
        float f8 = rectF.left;
        paint.setShader(new LinearGradient(f8, rectF.top, f8, rectF.bottom, iArr, F3.a.f1442j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.f1650c;
        return (float) Math.toDegrees(Math.atan((vVar.f1661c - this.f1652e) / (vVar.f1660b - this.f1651d)));
    }
}
