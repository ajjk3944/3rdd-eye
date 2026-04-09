package m0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6525a;
import l0.C6531g;
import l0.C6533i;
import l0.C6535k;
import m0.U0;
import m0.Y0;

/* renamed from: m0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6683T implements U0 {

    /* renamed from: b, reason: collision with root package name */
    private final Path f52849b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f52850c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f52851d;

    /* renamed from: e, reason: collision with root package name */
    private Matrix f52852e;

    public C6683T(Path path) {
        this.f52849b = path;
    }

    private final void w(C6533i c6533i) {
        if (Float.isNaN(c6533i.k()) || Float.isNaN(c6533i.n()) || Float.isNaN(c6533i.l()) || Float.isNaN(c6533i.e())) {
            AbstractC6688Y.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // m0.U0
    public void a() {
        this.f52849b.reset();
    }

    @Override // m0.U0
    public void b(float f10, float f11, float f12, float f13) {
        this.f52849b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // m0.U0
    public boolean c() {
        return this.f52849b.isConvex();
    }

    @Override // m0.U0
    public void close() {
        this.f52849b.close();
    }

    @Override // m0.U0
    public void e(float f10, float f11) {
        this.f52849b.rMoveTo(f10, f11);
    }

    @Override // m0.U0
    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f52849b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // m0.U0
    public C6533i getBounds() {
        if (this.f52850c == null) {
            this.f52850c = new RectF();
        }
        RectF rectF = this.f52850c;
        AbstractC6492s.f(rectF);
        this.f52849b.computeBounds(rectF, true);
        return new C6533i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // m0.U0
    public void h(int i10) {
        this.f52849b.setFillType(W0.d(i10, W0.f52862a.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // m0.U0
    public void i(C6533i c6533i, U0.b bVar) {
        w(c6533i);
        if (this.f52850c == null) {
            this.f52850c = new RectF();
        }
        RectF rectF = this.f52850c;
        AbstractC6492s.f(rectF);
        rectF.set(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e());
        Path path = this.f52849b;
        RectF rectF2 = this.f52850c;
        AbstractC6492s.f(rectF2);
        path.addRect(rectF2, AbstractC6688Y.e(bVar));
    }

    @Override // m0.U0
    public boolean isEmpty() {
        return this.f52849b.isEmpty();
    }

    @Override // m0.U0
    public void j(float f10, float f11, float f12, float f13) {
        this.f52849b.quadTo(f10, f11, f12, f13);
    }

    @Override // m0.U0
    public boolean k(U0 u02, U0 u03, int i10) {
        Y0.a aVar = Y0.f52866a;
        Path.Op op = Y0.f(i10, aVar.a()) ? Path.Op.DIFFERENCE : Y0.f(i10, aVar.b()) ? Path.Op.INTERSECT : Y0.f(i10, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : Y0.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f52849b;
        if (!(u02 instanceof C6683T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathV = ((C6683T) u02).v();
        if (u03 instanceof C6683T) {
            return path.op(pathV, ((C6683T) u03).v(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // m0.U0
    public int l() {
        return this.f52849b.getFillType() == Path.FillType.EVEN_ODD ? W0.f52862a.a() : W0.f52862a.b();
    }

    @Override // m0.U0
    public void m(U0 u02, long j10) {
        Path path = this.f52849b;
        if (!(u02 instanceof C6683T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((C6683T) u02).v(), C6531g.m(j10), C6531g.n(j10));
    }

    @Override // m0.U0
    public void n(float f10, float f11) {
        this.f52849b.moveTo(f10, f11);
    }

    @Override // m0.U0
    public void o(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f52849b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // m0.U0
    public void p(C6535k c6535k, U0.b bVar) {
        if (this.f52850c == null) {
            this.f52850c = new RectF();
        }
        RectF rectF = this.f52850c;
        AbstractC6492s.f(rectF);
        rectF.set(c6535k.e(), c6535k.g(), c6535k.f(), c6535k.a());
        if (this.f52851d == null) {
            this.f52851d = new float[8];
        }
        float[] fArr = this.f52851d;
        AbstractC6492s.f(fArr);
        fArr[0] = AbstractC6525a.d(c6535k.h());
        fArr[1] = AbstractC6525a.e(c6535k.h());
        fArr[2] = AbstractC6525a.d(c6535k.i());
        fArr[3] = AbstractC6525a.e(c6535k.i());
        fArr[4] = AbstractC6525a.d(c6535k.c());
        fArr[5] = AbstractC6525a.e(c6535k.c());
        fArr[6] = AbstractC6525a.d(c6535k.b());
        fArr[7] = AbstractC6525a.e(c6535k.b());
        Path path = this.f52849b;
        RectF rectF2 = this.f52850c;
        AbstractC6492s.f(rectF2);
        float[] fArr2 = this.f52851d;
        AbstractC6492s.f(fArr2);
        path.addRoundRect(rectF2, fArr2, AbstractC6688Y.e(bVar));
    }

    @Override // m0.U0
    public void q() {
        this.f52849b.rewind();
    }

    @Override // m0.U0
    public void r(long j10) {
        Matrix matrix = this.f52852e;
        if (matrix == null) {
            this.f52852e = new Matrix();
        } else {
            AbstractC6492s.f(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f52852e;
        AbstractC6492s.f(matrix2);
        matrix2.setTranslate(C6531g.m(j10), C6531g.n(j10));
        Path path = this.f52849b;
        Matrix matrix3 = this.f52852e;
        AbstractC6492s.f(matrix3);
        path.transform(matrix3);
    }

    @Override // m0.U0
    public void s(float f10, float f11) {
        this.f52849b.rLineTo(f10, f11);
    }

    @Override // m0.U0
    public void u(float f10, float f11) {
        this.f52849b.lineTo(f10, f11);
    }

    public final Path v() {
        return this.f52849b;
    }

    public /* synthetic */ C6683T(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
