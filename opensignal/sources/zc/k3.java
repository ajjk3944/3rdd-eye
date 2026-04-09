package zc;

/* loaded from: classes.dex */
public abstract class k3 extends j3 {

    /* renamed from: r, reason: collision with root package name */
    public boolean f26984r;

    public k3(p3 p3Var) {
        super(p3Var);
        this.f26981g.N++;
    }

    public final void t1() {
        if (!this.f26984r) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u1() {
        if (this.f26984r) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v1();
        this.f26981g.O++;
        this.f26984r = true;
    }

    public abstract void v1();
}
