package og;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class i extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {
    @Override // gg.InterfaceC5914d
    public void a() {
        lazySet(EnumC6592b.DISPOSED);
    }

    @Override // gg.InterfaceC5914d
    public void c(InterfaceC6043c interfaceC6043c) {
        EnumC6592b.setOnce(this, interfaceC6043c);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        EnumC6592b.dispose(this);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return get() == EnumC6592b.DISPOSED;
    }

    @Override // gg.InterfaceC5914d
    public void onError(Throwable th2) {
        lazySet(EnumC6592b.DISPOSED);
        Eg.a.v(new OnErrorNotImplementedException(th2));
    }
}
