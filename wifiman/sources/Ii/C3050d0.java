package Ii;

import java.util.concurrent.Future;

/* renamed from: Ii.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3050d0 implements InterfaceC3052e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Future f9306a;

    public C3050d0(Future future) {
        this.f9306a = future;
    }

    @Override // Ii.InterfaceC3052e0
    public void dispose() {
        this.f9306a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f9306a + ']';
    }
}
