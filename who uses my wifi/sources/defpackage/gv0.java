package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gv0 extends kv0 {
    public final iv0 c;
    public final float d;
    public final float e;

    public gv0(iv0 iv0Var, float f, float f2) {
        this.c = iv0Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.kv0
    public final void a(Matrix matrix, ru0 ru0Var, int i, Canvas canvas) {
        iv0 iv0Var = this.c;
        float f = iv0Var.c;
        float f2 = this.e;
        float f3 = iv0Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ru0Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = ru0Var.c;
        int[] iArr = ru0.i;
        iArr[0] = i2;
        iArr[1] = ru0Var.b;
        iArr[2] = ru0Var.a;
        Paint paint = (Paint) ru0Var.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ru0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        iv0 iv0Var = this.c;
        return (float) Math.toDegrees(Math.atan((iv0Var.c - this.e) / (iv0Var.b - this.d)));
    }
}
