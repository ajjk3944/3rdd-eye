package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734l implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1733k f15660a;

    public C1734l(AbstractC1733k abstractC1733k) {
        C1746y.a(abstractC1733k, "output");
        this.f15660a = abstractC1733k;
        abstractC1733k.f15652a = this;
    }

    public final void a(int i, boolean z10) throws IOException {
        this.f15660a.p(i, z10);
    }

    public final void b(int i, AbstractC1730h abstractC1730h) throws IOException {
        this.f15660a.r(i, abstractC1730h);
    }

    public final void c(int i, double d10) throws IOException {
        AbstractC1733k abstractC1733k = this.f15660a;
        abstractC1733k.getClass();
        abstractC1733k.v(i, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i, int i10) throws IOException {
        this.f15660a.x(i, i10);
    }

    public final void e(int i, int i10) throws IOException {
        this.f15660a.t(i, i10);
    }

    public final void f(int i, long j4) throws IOException {
        this.f15660a.v(i, j4);
    }

    public final void g(int i, float f10) throws IOException {
        AbstractC1733k abstractC1733k = this.f15660a;
        abstractC1733k.getClass();
        abstractC1733k.t(i, Float.floatToRawIntBits(f10));
    }

    public final void h(int i, Object obj, f0 f0Var) throws IOException {
        AbstractC1733k abstractC1733k = this.f15660a;
        abstractC1733k.F(i, 3);
        f0Var.e((P) obj, abstractC1733k.f15652a);
        abstractC1733k.F(i, 4);
    }

    public final void i(int i, int i10) throws IOException {
        this.f15660a.x(i, i10);
    }

    public final void j(int i, long j4) throws IOException {
        this.f15660a.I(i, j4);
    }

    public final void k(int i, Object obj, f0 f0Var) throws IOException {
        this.f15660a.z(i, (P) obj, f0Var);
    }

    public final void l(int i, Object obj) throws IOException {
        boolean z10 = obj instanceof AbstractC1730h;
        AbstractC1733k abstractC1733k = this.f15660a;
        if (z10) {
            abstractC1733k.C(i, (AbstractC1730h) obj);
        } else {
            abstractC1733k.B(i, (P) obj);
        }
    }

    public final void m(int i, int i10) throws IOException {
        this.f15660a.t(i, i10);
    }

    public final void n(int i, long j4) throws IOException {
        this.f15660a.v(i, j4);
    }

    public final void o(int i, int i10) throws IOException {
        this.f15660a.G(i, (i10 >> 31) ^ (i10 << 1));
    }

    public final void p(int i, long j4) throws IOException {
        this.f15660a.I(i, (j4 >> 63) ^ (j4 << 1));
    }

    public final void q(int i, int i10) throws IOException {
        this.f15660a.G(i, i10);
    }

    public final void r(int i, long j4) throws IOException {
        this.f15660a.I(i, j4);
    }
}
