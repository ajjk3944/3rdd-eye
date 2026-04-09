package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b4 extends x3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f22595d;

    public b4(g4 g4Var) {
        super(g4Var);
        this.f23175c.f22746r++;
    }

    public final void C() {
        if (!this.f22595d) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void D() {
        if (this.f22595d) {
            throw new IllegalStateException("Can't initialize twice");
        }
        E();
        this.f23175c.f22747s++;
        this.f22595d = true;
    }

    public abstract void E();
}
