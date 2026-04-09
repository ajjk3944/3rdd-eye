package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f21862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f21863b;

    public v1(z1 z1Var, x1 x1Var) {
        this.f21862a = z1Var;
        this.f21863b = x1Var;
    }

    @Override // d0.f1
    public final float a(float f10) {
        float fAbs = Math.abs(f10);
        z1 z1Var = this.f21862a;
        if (fAbs != 0.0f && !((Boolean) z1Var.f21925h.invoke()).booleanValue()) {
            throw new c0.w0("The fling animation was cancelled", 1);
        }
        return z1Var.d(z1Var.g(this.f21863b.a(2, z1Var.e(z1Var.h(f10)))));
    }
}
