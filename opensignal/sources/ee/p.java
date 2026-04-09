package ee;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f8138c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8139d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8140e;

    public p(r rVar, float f10, float f11) {
        this.f8138c = rVar;
        this.f8139d = f10;
        this.f8140e = f11;
    }

    @Override // ee.t
    public final void a(Matrix matrix, de.a aVar, int i10, Canvas canvas) {
        r rVar = this.f8138c;
        float f10 = rVar.f8149c;
        float f11 = this.f8140e;
        float f12 = rVar.f8148b;
        float f13 = this.f8139d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f8152a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = aVar.f7333f;
        int[] iArr = de.a.f7326i;
        iArr[0] = i11;
        iArr[1] = aVar.f7332e;
        iArr[2] = aVar.f7331d;
        Paint paint = aVar.f7330c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, de.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f8138c;
        return (float) Math.toDegrees(Math.atan((rVar.f8149c - this.f8140e) / (rVar.f8148b - this.f8139d)));
    }
}
