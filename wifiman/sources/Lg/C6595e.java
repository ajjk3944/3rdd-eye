package lg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6595e extends AtomicReference implements InterfaceC6043c {
    public C6595e() {
    }

    public boolean a(InterfaceC6043c interfaceC6043c) {
        return EnumC6592b.replace(this, interfaceC6043c);
    }

    public boolean c(InterfaceC6043c interfaceC6043c) {
        return EnumC6592b.set(this, interfaceC6043c);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        EnumC6592b.dispose(this);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return EnumC6592b.isDisposed((InterfaceC6043c) get());
    }

    public C6595e(InterfaceC6043c interfaceC6043c) {
        lazySet(interfaceC6043c);
    }
}
