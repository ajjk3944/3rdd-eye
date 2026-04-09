package A9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* renamed from: A9.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0590m0 extends AbstractC0598q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f259g = AtomicIntegerFieldUpdater.newUpdater(C0590m0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0588l0 f260f;

    public C0590m0(InterfaceC0588l0 interfaceC0588l0) {
        this.f260f = interfaceC0588l0;
    }

    @Override // A9.InterfaceC0588l0
    public final void a(Throwable th) {
        if (f259g.compareAndSet(this, 0, 1)) {
            this.f260f.a(th);
        }
    }
}
