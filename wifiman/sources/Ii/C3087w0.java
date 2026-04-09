package Ii;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mh.InterfaceC6835l;

/* renamed from: Ii.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3087w0 extends C0 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9360f = AtomicIntegerFieldUpdater.newUpdater(C3087w0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f9361e;

    public C3087w0(InterfaceC6835l interfaceC6835l) {
        this.f9361e = interfaceC6835l;
    }

    @Override // Ii.C0
    public boolean u() {
        return true;
    }

    @Override // Ii.C0
    public void v(Throwable th2) {
        if (f9360f.compareAndSet(this, 0, 1)) {
            this.f9361e.invoke(th2);
        }
    }
}
