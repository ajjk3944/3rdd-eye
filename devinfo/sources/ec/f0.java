package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f0 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f22705c;

    public f0(o1 o1Var) {
        super(o1Var);
        ((o1) this.f218b).A++;
    }

    public final void C() {
        if (!this.f22705c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void D() {
        if (this.f22705c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (E()) {
            return;
        }
        ((o1) this.f218b).C.incrementAndGet();
        this.f22705c = true;
    }

    public abstract boolean E();
}
