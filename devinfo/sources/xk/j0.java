package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37200e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f37201f;

    public /* synthetic */ j0(int i4, Object obj) {
        this.f37200e = i4;
        this.f37201f = obj;
    }

    @Override // xk.b1
    public final boolean k() {
        switch (this.f37200e) {
        }
        return false;
    }

    @Override // xk.b1
    public final void l(Throwable th2) {
        switch (this.f37200e) {
            case 0:
                ((i0) this.f37201f).a();
                break;
            case 1:
                ((mk.c) this.f37201f).invoke(th2);
                break;
            default:
                c1 c1Var = (c1) this.f37201f;
                Object obj = f1.f37187a.get(j());
                if (!(obj instanceof p)) {
                    c1Var.resumeWith(x.C(obj));
                    break;
                } else {
                    c1Var.resumeWith(ci.b.h(((p) obj).f37219a));
                    break;
                }
        }
    }
}
