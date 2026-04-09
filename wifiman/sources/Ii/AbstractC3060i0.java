package Ii;

import Ni.AbstractC3409k;
import Zg.C3681m;

/* renamed from: Ii.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3060i0 extends J {

    /* renamed from: c, reason: collision with root package name */
    private long f9329c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9330d;

    /* renamed from: e, reason: collision with root package name */
    private C3681m f9331e;

    public static /* synthetic */ void q0(AbstractC3060i0 abstractC3060i0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC3060i0.p0(z10);
    }

    private final long r0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void v0(AbstractC3060i0 abstractC3060i0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC3060i0.u0(z10);
    }

    public boolean A0() {
        return false;
    }

    @Override // Ii.J
    public final J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return AbstractC3409k.b(this, str);
    }

    public final void p0(boolean z10) {
        long jR0 = this.f9329c - r0(z10);
        this.f9329c = jR0;
        if (jR0 <= 0 && this.f9330d) {
            shutdown();
        }
    }

    public final void s0(AbstractC3044a0 abstractC3044a0) {
        C3681m c3681m = this.f9331e;
        if (c3681m == null) {
            c3681m = new C3681m();
            this.f9331e = c3681m;
        }
        c3681m.addLast(abstractC3044a0);
    }

    public abstract void shutdown();

    protected long t0() {
        C3681m c3681m = this.f9331e;
        return (c3681m == null || c3681m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void u0(boolean z10) {
        this.f9329c += r0(z10);
        if (z10) {
            return;
        }
        this.f9330d = true;
    }

    public final boolean w0() {
        return this.f9329c >= r0(true);
    }

    public final boolean x0() {
        C3681m c3681m = this.f9331e;
        if (c3681m != null) {
            return c3681m.isEmpty();
        }
        return true;
    }

    public abstract long y0();

    public final boolean z0() {
        AbstractC3044a0 abstractC3044a0;
        C3681m c3681m = this.f9331e;
        if (c3681m == null || (abstractC3044a0 = (AbstractC3044a0) c3681m.N0()) == null) {
            return false;
        }
        abstractC3044a0.run();
        return true;
    }
}
