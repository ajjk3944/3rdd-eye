package p1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f30949a = d.f30952a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f30950b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f30951c;

    @Override // p1.q
    public final void a(float f10, float f11) {
        this.f30949a.scale(f10, f11);
    }

    @Override // p1.q
    public final void b(g gVar, long j, long j8, long j9, l7.d dVar) {
        if (this.f30950b == null) {
            this.f30950b = new Rect();
            this.f30951c = new Rect();
        }
        Canvas canvas = this.f30949a;
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = gVar.f30963a;
        Rect rect = this.f30950b;
        nk.k.b(rect);
        int i4 = (int) (j >> 32);
        rect.left = i4;
        int i10 = (int) (j & 4294967295L);
        rect.top = i10;
        rect.right = i4 + ((int) (j8 >> 32));
        rect.bottom = i10 + ((int) (j8 & 4294967295L));
        Rect rect2 = this.f30951c;
        nk.k.b(rect2);
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j9 >> 32));
        rect2.bottom = i12 + ((int) (4294967295L & j9));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) dVar.f28604b);
    }

    @Override // p1.q
    public final void c() {
        this.f30949a.save();
    }

    @Override // p1.q
    public final void d() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z.j(this.f30949a, false);
    }

    @Override // p1.q
    public final void e(float[] fArr) {
        if (z.o(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        this.f30949a.concat(matrix);
    }

    @Override // p1.q
    public final void f(float f10, long j, l7.d dVar) {
        this.f30949a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f10, (Paint) dVar.f28604b);
    }

    @Override // p1.q
    public final void g(j jVar) {
        Canvas canvas = this.f30949a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(jVar.f30986a, Region.Op.INTERSECT);
    }

    @Override // p1.q
    public final void h(o1.c cVar) {
        i(cVar.f30366a, cVar.f30367b, cVar.f30368c, cVar.f30369d, 1);
    }

    @Override // p1.q
    public final void i(float f10, float f11, float f12, float f13, int i4) {
        this.f30949a.clipRect(f10, f11, f12, f13, i4 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p1.q
    public final void j(float f10, float f11) {
        this.f30949a.translate(f10, f11);
    }

    @Override // p1.q
    public final void k() {
        this.f30949a.restore();
    }

    @Override // p1.q
    public final void l(float f10, float f11, float f12, float f13, float f14, float f15, l7.d dVar) {
        this.f30949a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) dVar.f28604b);
    }

    @Override // p1.q
    public final void m(float f10, float f11, float f12, float f13, l7.d dVar) {
        this.f30949a.drawRect(f10, f11, f12, f13, (Paint) dVar.f28604b);
    }

    @Override // p1.q
    public final void n() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z.j(this.f30949a, true);
    }

    @Override // p1.q
    public final void o(j jVar, l7.d dVar) {
        Canvas canvas = this.f30949a;
        if (!(jVar instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(jVar.f30986a, (Paint) dVar.f28604b);
    }

    @Override // p1.q
    public final void p(o1.c cVar, l7.d dVar) {
        this.f30949a.saveLayer(cVar.f30366a, cVar.f30367b, cVar.f30368c, cVar.f30369d, (Paint) dVar.f28604b, 31);
    }
}
