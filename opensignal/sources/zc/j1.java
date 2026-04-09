package zc;

/* loaded from: classes.dex */
public abstract class j1 extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public boolean f26980g;

    public j1(c1 c1Var) {
        super(c1Var);
        ((c1) this.f1504d).W++;
    }

    public abstract boolean t1();

    public final void u1() {
        if (!this.f26980g) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v1() {
        if (this.f26980g) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (t1()) {
            return;
        }
        ((c1) this.f1504d).Y.incrementAndGet();
        this.f26980g = true;
    }
}
