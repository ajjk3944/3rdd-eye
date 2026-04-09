package f4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: f4.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5532l {

    /* renamed from: a, reason: collision with root package name */
    private final C5533m[] f47070a = new C5533m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f47071b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f47072c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f47073d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f47074e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f47075f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C5533m f47076g = new C5533m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f47077h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f47078i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f47079j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f47080k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f47081l = true;

    /* renamed from: f4.l$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final C5532l f47082a = new C5532l();
    }

    /* renamed from: f4.l$b */
    public interface b {
        void a(C5533m c5533m, Matrix matrix, int i10);

        void b(C5533m c5533m, Matrix matrix, int i10);
    }

    /* renamed from: f4.l$c */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C5531k f47083a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f47084b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f47085c;

        /* renamed from: d, reason: collision with root package name */
        public final b f47086d;

        /* renamed from: e, reason: collision with root package name */
        public final float f47087e;

        c(C5531k c5531k, float f10, RectF rectF, b bVar, Path path) {
            this.f47086d = bVar;
            this.f47083a = c5531k;
            this.f47087e = f10;
            this.f47085c = rectF;
            this.f47084b = path;
        }
    }

    public C5532l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f47070a[i10] = new C5533m();
            this.f47071b[i10] = new Matrix();
            this.f47072c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f47077h[0] = this.f47070a[i10].k();
        this.f47077h[1] = this.f47070a[i10].l();
        this.f47071b[i10].mapPoints(this.f47077h);
        if (i10 == 0) {
            Path path = cVar.f47084b;
            float[] fArr = this.f47077h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f47084b;
            float[] fArr2 = this.f47077h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f47070a[i10].d(this.f47071b[i10], cVar.f47084b);
        b bVar = cVar.f47086d;
        if (bVar != null) {
            bVar.a(this.f47070a[i10], this.f47071b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f47077h[0] = this.f47070a[i10].i();
        this.f47077h[1] = this.f47070a[i10].j();
        this.f47071b[i10].mapPoints(this.f47077h);
        this.f47078i[0] = this.f47070a[i11].k();
        this.f47078i[1] = this.f47070a[i11].l();
        this.f47071b[i11].mapPoints(this.f47078i);
        float f10 = this.f47077h[0];
        float[] fArr = this.f47078i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f47085c, i10);
        this.f47076g.n(0.0f, 0.0f);
        C5526f c5526fJ = j(i10, cVar.f47083a);
        c5526fJ.b(fMax, fI, cVar.f47087e, this.f47076g);
        this.f47079j.reset();
        this.f47076g.d(this.f47072c[i10], this.f47079j);
        if (this.f47081l && (c5526fJ.a() || l(this.f47079j, i10) || l(this.f47079j, i11))) {
            Path path = this.f47079j;
            path.op(path, this.f47075f, Path.Op.DIFFERENCE);
            this.f47077h[0] = this.f47076g.k();
            this.f47077h[1] = this.f47076g.l();
            this.f47072c[i10].mapPoints(this.f47077h);
            Path path2 = this.f47074e;
            float[] fArr2 = this.f47077h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f47076g.d(this.f47072c[i10], this.f47074e);
        } else {
            this.f47076g.d(this.f47072c[i10], cVar.f47084b);
        }
        b bVar = cVar.f47086d;
        if (bVar != null) {
            bVar.b(this.f47076g, this.f47072c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
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

    private InterfaceC5523c g(int i10, C5531k c5531k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c5531k.t() : c5531k.r() : c5531k.j() : c5531k.l();
    }

    private AbstractC5524d h(int i10, C5531k c5531k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c5531k.s() : c5531k.q() : c5531k.i() : c5531k.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f47077h;
        C5533m c5533m = this.f47070a[i10];
        fArr[0] = c5533m.f47090c;
        fArr[1] = c5533m.f47091d;
        this.f47071b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f47077h[0]) : Math.abs(rectF.centerY() - this.f47077h[1]);
    }

    private C5526f j(int i10, C5531k c5531k) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c5531k.o() : c5531k.p() : c5531k.n() : c5531k.h();
    }

    public static C5532l k() {
        return a.f47082a;
    }

    private boolean l(Path path, int i10) {
        this.f47080k.reset();
        this.f47070a[i10].d(this.f47071b[i10], this.f47080k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f47080k.computeBounds(rectF, true);
        path.op(this.f47080k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f47083a).b(this.f47070a[i10], 90.0f, cVar.f47087e, cVar.f47085c, g(i10, cVar.f47083a));
        float fA = a(i10);
        this.f47071b[i10].reset();
        f(i10, cVar.f47085c, this.f47073d);
        Matrix matrix = this.f47071b[i10];
        PointF pointF = this.f47073d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f47071b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f47077h[0] = this.f47070a[i10].i();
        this.f47077h[1] = this.f47070a[i10].j();
        this.f47071b[i10].mapPoints(this.f47077h);
        float fA = a(i10);
        this.f47072c[i10].reset();
        Matrix matrix = this.f47072c[i10];
        float[] fArr = this.f47077h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f47072c[i10].preRotate(fA);
    }

    public void d(C5531k c5531k, float f10, RectF rectF, Path path) {
        e(c5531k, f10, rectF, null, path);
    }

    public void e(C5531k c5531k, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f47074e.rewind();
        this.f47075f.rewind();
        this.f47075f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c5531k, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f47074e.close();
        if (this.f47074e.isEmpty()) {
            return;
        }
        path.op(this.f47074e, Path.Op.UNION);
    }
}
