package zc;

/* loaded from: classes.dex */
public abstract class w extends s {

    /* renamed from: g, reason: collision with root package name */
    public boolean f27249g;

    public w(c1 c1Var) {
        super(c1Var);
        ((c1) this.f1504d).W++;
    }

    public final void t1() {
        if (!this.f27249g) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u1() {
        if (this.f27249g) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (v1()) {
            return;
        }
        ((c1) this.f1504d).Y.incrementAndGet();
        this.f27249g = true;
    }

    public abstract boolean v1();
}
