package wt;

/* loaded from: classes.dex */
public abstract class k0 extends q {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f24628y = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f24629g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24630r;

    /* renamed from: x, reason: collision with root package name */
    public mq.k f24631x;

    @Override // wt.q
    public final q q0(int i10) {
        bu.a.a(1);
        return this;
    }

    public final void r0(boolean z10) {
        long j = this.f24629g - (z10 ? 4294967296L : 1L);
        this.f24629g = j;
        if (j <= 0 && this.f24630r) {
            shutdown();
        }
    }

    public final void s0(c0 c0Var) {
        mq.k kVar = this.f24631x;
        if (kVar == null) {
            kVar = new mq.k();
            this.f24631x = kVar;
        }
        kVar.addLast(c0Var);
    }

    public abstract void shutdown();

    public abstract Thread t0();

    public final void u0(boolean z10) {
        this.f24629g = (z10 ? 4294967296L : 1L) + this.f24629g;
        if (z10) {
            return;
        }
        this.f24630r = true;
    }

    public abstract long v0();

    public final boolean w0() {
        mq.k kVar = this.f24631x;
        if (kVar == null) {
            return false;
        }
        c0 c0Var = (c0) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (c0Var == null) {
            return false;
        }
        c0Var.run();
        return true;
    }

    public void x0(long j, h0 h0Var) {
        x.F.C0(j, h0Var);
    }
}
