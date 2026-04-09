package ed;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends w {

    /* renamed from: c, reason: collision with root package name */
    public final u f23367c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23368d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23369e;

    public s(u uVar, float f10, float f11) {
        this.f23367c = uVar;
        this.f23368d = f10;
        this.f23369e = f11;
    }

    @Override // ed.w
    public final void a(Matrix matrix, dd.a aVar, int i4, Canvas canvas) {
        u uVar = this.f23367c;
        float f10 = uVar.f23377c;
        float f11 = this.f23369e;
        float f12 = uVar.f23376b;
        float f13 = this.f23368d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f23380a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int i10 = aVar.f22187f;
        int[] iArr = dd.a.f22179i;
        iArr[0] = i10;
        iArr[1] = aVar.f22186e;
        iArr[2] = aVar.f22185d;
        Paint paint = aVar.f22184c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, dd.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u uVar = this.f23367c;
        return (float) Math.toDegrees(Math.atan((uVar.f23377c - this.f23369e) / (uVar.f23376b - this.f23368d)));
    }
}
