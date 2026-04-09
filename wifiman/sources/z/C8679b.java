package z;

import F1.C2780w0;
import T.InterfaceC3551q0;
import T.t1;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8679b implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f66826b;

    /* renamed from: c, reason: collision with root package name */
    private final String f66827c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f66828d = t1.d(w1.f.f64335e, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f66829e = t1.d(Boolean.TRUE, null, 2, null);

    public C8679b(int i10, String str) {
        this.f66826b = i10;
        this.f66827c = str;
    }

    private final void g(boolean z10) {
        this.f66829e.setValue(Boolean.valueOf(z10));
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return e().f64338c;
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return e().f64339d;
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return e().f64337b;
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return e().f64336a;
    }

    public final w1.f e() {
        return (w1.f) this.f66828d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8679b) && this.f66826b == ((C8679b) obj).f66826b;
    }

    public final void f(w1.f fVar) {
        this.f66828d.setValue(fVar);
    }

    public final void h(C2780w0 c2780w0, int i10) {
        if (i10 == 0 || (i10 & this.f66826b) != 0) {
            f(c2780w0.f(this.f66826b));
            g(c2780w0.p(this.f66826b));
        }
    }

    public int hashCode() {
        return this.f66826b;
    }

    public String toString() {
        return this.f66827c + '(' + e().f64336a + ", " + e().f64337b + ", " + e().f64338c + ", " + e().f64339d + ')';
    }
}
