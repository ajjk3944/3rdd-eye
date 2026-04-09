package q2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import i2.InterfaceC4433F;
import i2.z;
import j2.C5167a;
import l2.q;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: D, reason: collision with root package name */
    public final RectF f45400D;

    /* renamed from: E, reason: collision with root package name */
    public final C5167a f45401E;

    /* renamed from: F, reason: collision with root package name */
    public final float[] f45402F;

    /* renamed from: G, reason: collision with root package name */
    public final Path f45403G;

    /* renamed from: H, reason: collision with root package name */
    public final e f45404H;

    /* renamed from: I, reason: collision with root package name */
    public q f45405I;

    /* renamed from: J, reason: collision with root package name */
    public q f45406J;

    public h(z zVar, e eVar) {
        super(zVar, eVar);
        this.f45400D = new RectF();
        C5167a c5167a = new C5167a();
        this.f45401E = c5167a;
        this.f45402F = new float[8];
        this.f45403G = new Path();
        this.f45404H = eVar;
        c5167a.setAlpha(0);
        c5167a.setStyle(Paint.Style.FILL);
        c5167a.setColor(eVar.f45384l);
    }

    @Override // q2.b, n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        super.c(colorFilter, fVar);
        if (colorFilter == InterfaceC4433F.f38294F) {
            this.f45405I = new q(fVar, null);
        } else if (colorFilter == 1) {
            this.f45406J = new q(fVar, null);
        }
    }

    @Override // q2.b, k2.InterfaceC5214e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        RectF rectF2 = this.f45400D;
        e eVar = this.f45404H;
        rectF2.set(0.0f, 0.0f, eVar.f45382j, eVar.f45383k);
        this.f45344n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // q2.b
    public final void k(Canvas canvas, Matrix matrix, int i) {
        e eVar = this.f45404H;
        int iAlpha = Color.alpha(eVar.f45384l);
        if (iAlpha == 0) {
            return;
        }
        q qVar = this.f45406J;
        Integer num = qVar == null ? null : (Integer) qVar.f();
        C5167a c5167a = this.f45401E;
        if (num != null) {
            c5167a.setColor(num.intValue());
        } else {
            c5167a.setColor(eVar.f45384l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f45353w.f43742j == null ? 100 : r2.f().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        c5167a.setAlpha(iIntValue);
        q qVar2 = this.f45405I;
        if (qVar2 != null) {
            c5167a.setColorFilter((ColorFilter) qVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f45402F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = eVar.f45382j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = eVar.f45383k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.f45403G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c5167a);
        }
    }
}
