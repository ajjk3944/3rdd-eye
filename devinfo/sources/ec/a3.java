package ec;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f22545b;

    public a3(b3 b3Var, int i4) {
        this.f22544a = i4;
        switch (i4) {
            case 1:
                Objects.requireNonNull(b3Var);
                this.f22545b = b3Var;
                break;
            default:
                Objects.requireNonNull(b3Var);
                this.f22545b = b3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22544a) {
            case 0:
                b3 b3Var = this.f22545b;
                b3Var.f22589f = b3Var.f22592k;
                break;
            default:
                this.f22545b.f22592k = null;
                break;
        }
    }
}
