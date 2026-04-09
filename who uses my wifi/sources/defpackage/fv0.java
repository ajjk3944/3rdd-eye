package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fv0 extends kv0 {
    public final hv0 c;

    public fv0(hv0 hv0Var) {
        this.c = hv0Var;
    }

    @Override // defpackage.kv0
    public final void a(Matrix matrix, ru0 ru0Var, int i, Canvas canvas) {
        float f;
        hv0 hv0Var = this.c;
        float f2 = hv0Var.f;
        float f3 = hv0Var.g;
        RectF rectF = new RectF(hv0Var.b, hv0Var.c, hv0Var.d, hv0Var.e);
        Paint paint = (Paint) ru0Var.e;
        boolean z = f3 < 0.0f;
        Path path = (Path) ru0Var.h;
        int[] iArr = ru0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ru0Var.c;
            iArr[2] = ru0Var.b;
            iArr[3] = ru0Var.a;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = ru0Var.a;
            iArr[2] = ru0Var.b;
            iArr[3] = ru0Var.c;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = ru0.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) ru0Var.g);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
