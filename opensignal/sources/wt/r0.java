package wt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class r0 extends w0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24654y = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: x, reason: collision with root package name */
    public final bq.g f24655x;

    public r0(bq.g gVar) {
        this.f24655x = gVar;
    }

    @Override // wt.w0
    public final boolean k() {
        return true;
    }

    @Override // wt.w0
    public final void l(Throwable th2) {
        if (f24654y.compareAndSet(this, 0, 1)) {
            this.f24655x.a(th2);
        }
    }
}
