package hg;

import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class g implements InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f48748a = new AtomicReference();

    public boolean a(InterfaceC6043c interfaceC6043c) {
        return EnumC6592b.set(this.f48748a, interfaceC6043c);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        EnumC6592b.dispose(this.f48748a);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return EnumC6592b.isDisposed((InterfaceC6043c) this.f48748a.get());
    }
}
