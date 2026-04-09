package C;

import dh.InterfaceC5380e;
import java.util.concurrent.CancellationException;
import l0.C6531g;
import sh.AbstractC7978m;
import x0.InterfaceC8412a;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2516a implements InterfaceC8412a {

    /* renamed from: a, reason: collision with root package name */
    private final C f1933a;

    /* renamed from: b, reason: collision with root package name */
    private final w.q f1934b;

    public C2516a(C c10, w.q qVar) {
        this.f1933a = c10;
        this.f1934b = qVar;
    }

    private final float b(long j10) {
        return this.f1934b == w.q.Horizontal ? C6531g.m(j10) : C6531g.n(j10);
    }

    @Override // x0.InterfaceC8412a
    public long L1(long j10, long j11, int i10) {
        if (!x0.e.d(i10, x0.e.f65322a.a()) || b(j11) == 0.0f) {
            return C6531g.f52335b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // x0.InterfaceC8412a
    public long V0(long j10, int i10) {
        if (!x0.e.d(i10, x0.e.f65322a.b()) || Math.abs(this.f1933a.w()) <= 1.0E-6d) {
            return C6531g.f52335b.c();
        }
        float fW = this.f1933a.w() * this.f1933a.G();
        float fI = ((this.f1933a.C().i() + this.f1933a.C().j()) * (-Math.signum(this.f1933a.w()))) + fW;
        if (this.f1933a.w() > 0.0f) {
            fI = fW;
            fW = fI;
        }
        w.q qVar = this.f1934b;
        w.q qVar2 = w.q.Horizontal;
        float fN = -this.f1933a.f(-AbstractC7978m.j(qVar == qVar2 ? C6531g.m(j10) : C6531g.n(j10), fW, fI));
        float fM = this.f1934b == qVar2 ? fN : C6531g.m(j10);
        if (this.f1934b != w.q.Vertical) {
            fN = C6531g.n(j10);
        }
        return C6531g.f(j10, fM, fN);
    }

    public final long a(long j10, w.q qVar) {
        return qVar == w.q.Vertical ? Y0.y.e(j10, 0.0f, 0.0f, 2, null) : Y0.y.e(j10, 0.0f, 0.0f, 1, null);
    }

    @Override // x0.InterfaceC8412a
    public Object g1(long j10, long j11, InterfaceC5380e interfaceC5380e) {
        return Y0.y.b(a(j11, this.f1934b));
    }
}
