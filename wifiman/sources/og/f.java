package og;

import gg.B;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class f extends AtomicReference implements B, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6469f f55690a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f55691b;

    public f(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2) {
        this.f55690a = interfaceC6469f;
        this.f55691b = interfaceC6469f2;
    }

    @Override // gg.B
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

    @Override // gg.B
    public void onError(Throwable th2) {
        lazySet(EnumC6592b.DISPOSED);
        try {
            this.f55691b.accept(th2);
        } catch (Throwable th3) {
            AbstractC6152a.b(th3);
            Eg.a.v(new CompositeException(th2, th3));
        }
    }

    @Override // gg.B
    public void onSuccess(Object obj) {
        lazySet(EnumC6592b.DISPOSED);
        try {
            this.f55690a.accept(obj);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
        }
    }
}
