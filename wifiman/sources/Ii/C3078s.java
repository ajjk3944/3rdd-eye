package Ii;

import dh.InterfaceC5380e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ii.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3078s extends C {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9354c = AtomicIntegerFieldUpdater.newUpdater(C3078s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C3078s(InterfaceC5380e interfaceC5380e, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + interfaceC5380e + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f9354c.compareAndSet(this, 0, 1);
    }
}
