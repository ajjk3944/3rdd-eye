package A9;

import c9.C2087h;

/* compiled from: EventLoop.common.kt */
/* renamed from: A9.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0566a0 extends A {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f220f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f221c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f222d;

    /* renamed from: e, reason: collision with root package name */
    public C2087h<S<?>> f223e;

    @Override // A9.A
    public final A Q0(int i) {
        I.n(1);
        return this;
    }

    public final void R0(boolean z10) {
        long j4 = this.f221c - (z10 ? 4294967296L : 1L);
        this.f221c = j4;
        if (j4 <= 0 && this.f222d) {
            shutdown();
        }
    }

    public final void S0(S<?> s10) {
        C2087h<S<?>> c2087h = this.f223e;
        if (c2087h == null) {
            c2087h = new C2087h<>();
            this.f223e = c2087h;
        }
        c2087h.e(s10);
    }

    public final void T0(boolean z10) {
        this.f221c = (z10 ? 4294967296L : 1L) + this.f221c;
        if (z10) {
            return;
        }
        this.f222d = true;
    }

    public long U0() {
        return !V0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean V0() {
        C2087h<S<?>> c2087h = this.f223e;
        if (c2087h == null) {
            return false;
        }
        S<?> sN = c2087h.isEmpty() ? null : c2087h.n();
        if (sN == null) {
            return false;
        }
        sN.run();
        return true;
    }

    public void shutdown() {
    }
}
