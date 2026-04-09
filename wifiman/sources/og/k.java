package og;

import gg.B;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class k implements B {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f55702a;

    /* renamed from: b, reason: collision with root package name */
    final B f55703b;

    public k(AtomicReference atomicReference, B b10) {
        this.f55702a = atomicReference;
        this.f55703b = b10;
    }

    @Override // gg.B
    public void c(InterfaceC6043c interfaceC6043c) {
        EnumC6592b.replace(this.f55702a, interfaceC6043c);
    }

    @Override // gg.B
    public void onError(Throwable th2) {
        this.f55703b.onError(th2);
    }

    @Override // gg.B
    public void onSuccess(Object obj) {
        this.f55703b.onSuccess(obj);
    }
}
