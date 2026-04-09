package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class c1 extends CoroutineDispatcher {

    /* renamed from: b, reason: collision with root package name */
    public long f22237b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22238c;

    /* renamed from: d, reason: collision with root package name */
    public z8.j f22239d;

    public static /* synthetic */ void c0(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.b0(z10);
    }

    public static /* synthetic */ void h0(c1 c1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c1Var.g0(z10);
    }

    public final void b0(boolean z10) {
        long jD0 = this.f22237b - d0(z10);
        this.f22237b = jD0;
        if (jD0 <= 0 && this.f22238c) {
            shutdown();
        }
    }

    public final long d0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void e0(t0 t0Var) {
        z8.j jVar = this.f22239d;
        if (jVar == null) {
            jVar = new z8.j();
            this.f22239d = jVar;
        }
        jVar.addLast(t0Var);
    }

    public long f0() {
        z8.j jVar = this.f22239d;
        return (jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void g0(boolean z10) {
        this.f22237b += d0(z10);
        if (z10) {
            return;
        }
        this.f22238c = true;
    }

    public final boolean i0() {
        return this.f22237b >= d0(true);
    }

    public final boolean j0() {
        z8.j jVar = this.f22239d;
        if (jVar != null) {
            return jVar.isEmpty();
        }
        return true;
    }

    public abstract long k0();

    public final boolean l0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        t0 t0Var;
        z8.j jVar = this.f22239d;
        if (jVar == null || (t0Var = (t0) jVar.x()) == null) {
            return false;
        }
        t0Var.run();
        return true;
    }

    public boolean m0() {
        return false;
    }

    public abstract void shutdown();
}
