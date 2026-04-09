package Ii;

import java.util.concurrent.Future;

/* renamed from: Ii.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3065l implements InterfaceC3067m {

    /* renamed from: a, reason: collision with root package name */
    private final Future f9341a;

    public C3065l(Future future) {
        this.f9341a = future;
    }

    @Override // Ii.InterfaceC3067m
    public void a(Throwable th2) {
        this.f9341a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f9341a + ']';
    }
}
