package wt;

import lf.t1;

/* loaded from: classes.dex */
public final class s0 extends w0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24657x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24658y;

    public /* synthetic */ s0(int i10, Object obj) {
        this.f24657x = i10;
        this.f24658y = obj;
    }

    @Override // wt.w0
    public final boolean k() {
        switch (this.f24657x) {
        }
        return false;
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        switch (this.f24657x) {
            case 0:
                ((ar.k) this.f24658y).a(th2);
                break;
            default:
                x0 x0Var = (x0) this.f24658y;
                Object obj = b1.f24604a.get(j());
                if (!(obj instanceof o)) {
                    x0Var.g(w.z(obj));
                    break;
                } else {
                    x0Var.g(t1.k(((o) obj).f24644a));
                    break;
                }
        }
    }
}
