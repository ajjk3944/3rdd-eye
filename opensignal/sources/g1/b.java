package g1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f9198a = c.f9203a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f9199b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f9200c;

    @Override // g1.p
    public final void a(float f10, float f11) {
        this.f9198a.scale(f10, f11);
    }

    @Override // g1.p
    public final void b(f1.c cVar, yb.k kVar) {
        this.f9198a.saveLayer(cVar.f8404a, cVar.f8405b, cVar.f8406c, cVar.f8407d, (Paint) kVar.f26241b, 31);
    }

    @Override // g1.p
    public final void c(float f10, long j, yb.k kVar) {
        this.f9198a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f10, (Paint) kVar.f26241b);
    }

    @Override // g1.p
    public final void d(i iVar, yb.k kVar) {
        Canvas canvas = this.f9198a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(iVar.f9238a, (Paint) kVar.f26241b);
    }

    @Override // g1.p
    public final void e(g gVar, long j, long j7, long j10, yb.k kVar) {
        if (this.f9199b == null) {
            this.f9199b = new Rect();
            this.f9200c = new Rect();
        }
        Canvas canvas = this.f9198a;
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = gVar.f9217a;
        Rect rect = this.f9199b;
        br.l.b(rect);
        int i10 = (int) (j >> 32);
        rect.left = i10;
        int i11 = (int) (j & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j7 >> 32));
        rect.bottom = i11 + ((int) (j7 & 4294967295L));
        Rect rect2 = this.f9200c;
        br.l.b(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j10 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j10));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) kVar.f26241b);
    }

    @Override // g1.p
    public final void f(float f10, float f11, float f12, float f13, yb.k kVar) {
        this.f9198a.drawRect(f10, f11, f12, f13, (Paint) kVar.f26241b);
    }

    @Override // g1.p
    public final void g() {
        this.f9198a.save();
    }

    @Override // g1.p
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f0.h(this.f9198a, false);
    }

    @Override // g1.p
    public final void i(i iVar) {
        Canvas canvas = this.f9198a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(iVar.f9238a, Region.Op.INTERSECT);
    }

    @Override // g1.p
    public final void j(float f10, float f11, float f12, float f13, float f14, float f15, yb.k kVar) {
        this.f9198a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) kVar.f26241b);
    }

    @Override // g1.p
    public final void k(float[] fArr) {
        if (f0.j(fArr)) {
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
        this.f9198a.concat(matrix);
    }

    @Override // g1.p
    public final void l(float f10, float f11, float f12, float f13, int i10) {
        this.f9198a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // g1.p
    public final void m(float f10, float f11) {
        this.f9198a.translate(f10, f11);
    }

    @Override // g1.p
    public final void n() {
        this.f9198a.restore();
    }

    @Override // g1.p
    public final void p() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f0.h(this.f9198a, true);
    }
}
