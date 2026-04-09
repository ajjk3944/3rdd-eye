package i0;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f25431b;

    public /* synthetic */ k(u0 u0Var, int i4) {
        this.f25430a = i4;
        this.f25431b = u0Var;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f25430a) {
            case 0:
                return new g((mk.c) this.f25431b.getValue());
            default:
                return (j) ((mk.a) this.f25431b.getValue()).invoke();
        }
    }
}
