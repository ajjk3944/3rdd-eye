package z5;

import d5.C2280h;

/* loaded from: classes3.dex */
public abstract class K extends AbstractC3042s {

    /* renamed from: c, reason: collision with root package name */
    public long f24496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24497d;

    /* renamed from: e, reason: collision with root package name */
    public C2280h f24498e;

    public final void k() {
        long j6 = this.f24496c - 4294967296L;
        this.f24496c = j6;
        if (j6 <= 0 && this.f24497d) {
            shutdown();
        }
    }

    public abstract Thread p();

    public final void q(boolean z6) {
        this.f24496c = (z6 ? 4294967296L : 1L) + this.f24496c;
        if (z6) {
            return;
        }
        this.f24497d = true;
    }

    public final boolean r() {
        C2280h c2280h = this.f24498e;
        if (c2280h == null) {
            return false;
        }
        C c6 = (C) (c2280h.isEmpty() ? null : c2280h.removeFirst());
        if (c6 == null) {
            return false;
        }
        c6.run();
        return true;
    }

    public void s(long j6, H h6) {
        RunnableC3047x.i.x(j6, h6);
    }

    public abstract void shutdown();
}
