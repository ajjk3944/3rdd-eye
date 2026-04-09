package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class q0 extends r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37225f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f37226c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37227d;

    /* renamed from: e, reason: collision with root package name */
    public zj.l f37228e;

    public final void X(boolean z3) {
        long j = this.f37226c - (z3 ? 4294967296L : 1L);
        this.f37226c = j;
        if (j <= 0 && this.f37227d) {
            shutdown();
        }
    }

    public final void Y(e0 e0Var) {
        zj.l lVar = this.f37228e;
        if (lVar == null) {
            lVar = new zj.l();
            this.f37228e = lVar;
        }
        lVar.addLast(e0Var);
    }

    public abstract Thread Z();

    public final void a0(boolean z3) {
        this.f37226c = (z3 ? 4294967296L : 1L) + this.f37226c;
        if (z3) {
            return;
        }
        this.f37227d = true;
    }

    public abstract long b0();

    public final boolean c0() {
        zj.l lVar = this.f37228e;
        if (lVar == null) {
            return false;
        }
        e0 e0Var = (e0) (lVar.isEmpty() ? null : lVar.removeFirst());
        if (e0Var == null) {
            return false;
        }
        e0Var.run();
        return true;
    }

    public void d0(long j, n0 n0Var) {
        y.j.i0(j, n0Var);
    }

    public abstract void shutdown();
}
