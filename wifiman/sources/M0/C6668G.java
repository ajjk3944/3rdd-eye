package m0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6531g;
import l0.C6533i;

/* renamed from: m0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6668G implements InterfaceC6717n0 {

    /* renamed from: a, reason: collision with root package name */
    private Canvas f52805a = AbstractC6670H.f52811a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f52806b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f52807c;

    public final Region.Op A(int i10) {
        return AbstractC6731u0.d(i10, AbstractC6731u0.f52948a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final Canvas a() {
        return this.f52805a;
    }

    @Override // m0.InterfaceC6717n0
    public void b(float f10, float f11, float f12, float f13, int i10) {
        this.f52805a.clipRect(f10, f11, f12, f13, A(i10));
    }

    @Override // m0.InterfaceC6717n0
    public void c(float f10, float f11) {
        this.f52805a.translate(f10, f11);
    }

    @Override // m0.InterfaceC6717n0
    public void d(U0 u02, int i10) {
        Canvas canvas = this.f52805a;
        if (!(u02 instanceof C6683T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C6683T) u02).v(), A(i10));
    }

    @Override // m0.InterfaceC6717n0
    public void e(float f10, float f11) {
        this.f52805a.scale(f10, f11);
    }

    @Override // m0.InterfaceC6717n0
    public void f(float f10) {
        this.f52805a.rotate(f10);
    }

    @Override // m0.InterfaceC6717n0
    public void g(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, S0 s02) {
        this.f52805a.drawArc(f10, f11, f12, f13, f14, f15, z10, s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void h(long j10, long j11, S0 s02) {
        this.f52805a.drawLine(C6531g.m(j10), C6531g.n(j10), C6531g.m(j11), C6531g.n(j11), s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void j() {
        this.f52805a.save();
    }

    @Override // m0.InterfaceC6717n0
    public void k() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C6723q0.f52942a.a(this.f52805a, false);
    }

    @Override // m0.InterfaceC6717n0
    public void l(C6533i c6533i, S0 s02) {
        this.f52805a.saveLayer(c6533i.k(), c6533i.n(), c6533i.l(), c6533i.e(), s02.x(), 31);
    }

    @Override // m0.InterfaceC6717n0
    public void m(U0 u02, S0 s02) {
        Canvas canvas = this.f52805a;
        if (!(u02 instanceof C6683T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C6683T) u02).v(), s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void n(float[] fArr) {
        if (P0.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC6680P.a(matrix, fArr);
        this.f52805a.concat(matrix);
    }

    @Override // m0.InterfaceC6717n0
    public void q(J0 j02, long j10, S0 s02) {
        this.f52805a.drawBitmap(AbstractC6679O.b(j02), C6531g.m(j10), C6531g.n(j10), s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void r() {
        this.f52805a.restore();
    }

    @Override // m0.InterfaceC6717n0
    public void s(J0 j02, long j10, long j11, long j12, long j13, S0 s02) {
        if (this.f52806b == null) {
            this.f52806b = new Rect();
            this.f52807c = new Rect();
        }
        Canvas canvas = this.f52805a;
        Bitmap bitmapB = AbstractC6679O.b(j02);
        Rect rect = this.f52806b;
        AbstractC6492s.f(rect);
        rect.left = Y0.n.h(j10);
        rect.top = Y0.n.i(j10);
        rect.right = Y0.n.h(j10) + Y0.r.g(j11);
        rect.bottom = Y0.n.i(j10) + Y0.r.f(j11);
        Yg.J j14 = Yg.J.f24997a;
        Rect rect2 = this.f52807c;
        AbstractC6492s.f(rect2);
        rect2.left = Y0.n.h(j12);
        rect2.top = Y0.n.i(j12);
        rect2.right = Y0.n.h(j12) + Y0.r.g(j13);
        rect2.bottom = Y0.n.i(j12) + Y0.r.f(j13);
        canvas.drawBitmap(bitmapB, rect, rect2, s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void u(float f10, float f11, float f12, float f13, float f14, float f15, S0 s02) {
        this.f52805a.drawRoundRect(f10, f11, f12, f13, f14, f15, s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void w(long j10, float f10, S0 s02) {
        this.f52805a.drawCircle(C6531g.m(j10), C6531g.n(j10), f10, s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void x(float f10, float f11, float f12, float f13, S0 s02) {
        this.f52805a.drawRect(f10, f11, f12, f13, s02.x());
    }

    @Override // m0.InterfaceC6717n0
    public void y() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C6723q0.f52942a.a(this.f52805a, true);
    }

    public final void z(Canvas canvas) {
        this.f52805a = canvas;
    }
}
