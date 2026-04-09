package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class v1 extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public boolean f23099c;

    public v1(o1 o1Var) {
        super(o1Var);
        ((o1) this.f218b).A++;
    }

    public abstract boolean C();

    public final void D() {
        if (!this.f23099c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void E() {
        if (this.f23099c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (C()) {
            return;
        }
        ((o1) this.f218b).C.incrementAndGet();
        this.f23099c = true;
    }
}
