package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g5.g;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.shape.c[] f11007a = new com.google.android.material.shape.c[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f11008b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f11009c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f11010d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f11011e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f11012f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.shape.c f11013g = new com.google.android.material.shape.c();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f11014h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f11015i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f11016j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f11017k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f11018l = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11019a = new b();
    }

    /* renamed from: com.google.android.material.shape.b$b, reason: collision with other inner class name */
    public interface InterfaceC0211b {
        void a(com.google.android.material.shape.c cVar, Matrix matrix, int i10);

        void b(com.google.android.material.shape.c cVar, Matrix matrix, int i10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.material.shape.a f11020a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f11021b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f11022c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0211b f11023d;

        /* renamed from: e, reason: collision with root package name */
        public final float f11024e;

        public c(com.google.android.material.shape.a aVar, float f10, RectF rectF, InterfaceC0211b interfaceC0211b, Path path) {
            this.f11023d = interfaceC0211b;
            this.f11020a = aVar;
            this.f11024e = f10;
            this.f11022c = rectF;
            this.f11021b = path;
        }
    }

    public b() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f11007a[i10] = new com.google.android.material.shape.c();
            this.f11008b[i10] = new Matrix();
            this.f11009c[i10] = new Matrix();
        }
    }

    public static b l() {
        return a.f11019a;
    }

    public final float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    public final void b(c cVar, int i10) {
        this.f11014h[0] = this.f11007a[i10].k();
        this.f11014h[1] = this.f11007a[i10].l();
        this.f11008b[i10].mapPoints(this.f11014h);
        if (i10 == 0) {
            Path path = cVar.f11021b;
            float[] fArr = this.f11014h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f11021b;
            float[] fArr2 = this.f11014h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f11007a[i10].d(this.f11008b[i10], cVar.f11021b);
        InterfaceC0211b interfaceC0211b = cVar.f11023d;
        if (interfaceC0211b != null) {
            interfaceC0211b.a(this.f11007a[i10], this.f11008b[i10], i10);
        }
    }

    public final void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f11014h[0] = this.f11007a[i10].i();
        this.f11014h[1] = this.f11007a[i10].j();
        this.f11008b[i10].mapPoints(this.f11014h);
        this.f11015i[0] = this.f11007a[i11].k();
        this.f11015i[1] = this.f11007a[i11].l();
        this.f11008b[i11].mapPoints(this.f11015i);
        float f10 = this.f11014h[0];
        float[] fArr = this.f11015i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fJ = j(cVar.f11022c, i10);
        this.f11013g.n(0.0f, 0.0f);
        g gVarK = k(i10, cVar.f11020a);
        gVarK.b(fMax, fJ, cVar.f11024e, this.f11013g);
        this.f11016j.reset();
        this.f11013g.d(this.f11009c[i10], this.f11016j);
        if (this.f11018l && (gVarK.a() || m(this.f11016j, i10) || m(this.f11016j, i11))) {
            Path path = this.f11016j;
            path.op(path, this.f11012f, Path.Op.DIFFERENCE);
            this.f11014h[0] = this.f11013g.k();
            this.f11014h[1] = this.f11013g.l();
            this.f11009c[i10].mapPoints(this.f11014h);
            Path path2 = this.f11011e;
            float[] fArr2 = this.f11014h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f11013g.d(this.f11009c[i10], this.f11011e);
        } else {
            this.f11013g.d(this.f11009c[i10], cVar.f11021b);
        }
        InterfaceC0211b interfaceC0211b = cVar.f11023d;
        if (interfaceC0211b != null) {
            interfaceC0211b.b(this.f11013g, this.f11009c[i10], i10);
        }
    }

    public void d(com.google.android.material.shape.a aVar, float f10, RectF rectF, Path path) {
        e(aVar, f10, rectF, null, path);
    }

    public void e(com.google.android.material.shape.a aVar, float f10, RectF rectF, InterfaceC0211b interfaceC0211b, Path path) {
        f(aVar, null, f10, rectF, interfaceC0211b, path);
    }

    public void f(com.google.android.material.shape.a aVar, float[] fArr, float f10, RectF rectF, InterfaceC0211b interfaceC0211b, Path path) {
        path.rewind();
        this.f11011e.rewind();
        this.f11012f.rewind();
        this.f11012f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(aVar, f10, rectF, interfaceC0211b, path);
        for (int i10 = 0; i10 < 4; i10++) {
            n(cVar, i10, fArr);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f11011e.close();
        if (this.f11011e.isEmpty()) {
            return;
        }
        path.op(this.f11011e, Path.Op.UNION);
    }

    public final void g(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public g5.d h(int i10, com.google.android.material.shape.a aVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? aVar.t() : aVar.r() : aVar.j() : aVar.l();
    }

    public final g5.e i(int i10, com.google.android.material.shape.a aVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? aVar.s() : aVar.q() : aVar.i() : aVar.k();
    }

    public final float j(RectF rectF, int i10) {
        float[] fArr = this.f11014h;
        com.google.android.material.shape.c cVar = this.f11007a[i10];
        fArr[0] = cVar.f11027c;
        fArr[1] = cVar.f11028d;
        this.f11008b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f11014h[0]) : Math.abs(rectF.centerY() - this.f11014h[1]);
    }

    public final g k(int i10, com.google.android.material.shape.a aVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? aVar.o() : aVar.p() : aVar.n() : aVar.h();
    }

    public final boolean m(Path path, int i10) {
        this.f11017k.reset();
        this.f11007a[i10].d(this.f11008b[i10], this.f11017k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f11017k.computeBounds(rectF, true);
        path.op(this.f11017k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void n(c cVar, int i10, float[] fArr) {
        i(i10, cVar.f11020a).b(this.f11007a[i10], 90.0f, cVar.f11024e, cVar.f11022c, fArr == null ? h(i10, cVar.f11020a) : new g5.c(fArr[i10]));
        float fA = a(i10);
        this.f11008b[i10].reset();
        g(i10, cVar.f11022c, this.f11010d);
        Matrix matrix = this.f11008b[i10];
        PointF pointF = this.f11010d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f11008b[i10].preRotate(fA);
    }

    public final void o(int i10) {
        this.f11014h[0] = this.f11007a[i10].i();
        this.f11014h[1] = this.f11007a[i10].j();
        this.f11008b[i10].mapPoints(this.f11014h);
        float fA = a(i10);
        this.f11009c[i10].reset();
        Matrix matrix = this.f11009c[i10];
        float[] fArr = this.f11014h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f11009c[i10].preRotate(fA);
    }
}
