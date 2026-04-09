package og;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;

/* renamed from: og.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7135e extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6469f f55688a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6464a f55689b;

    public C7135e(InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a) {
        this.f55688a = interfaceC6469f;
        this.f55689b = interfaceC6464a;
    }

    @Override // gg.InterfaceC5914d
    public void a() {
        try {
            this.f55689b.run();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
        }
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
        try {
            this.f55688a.accept(th2);
        } catch (Throwable th3) {
            AbstractC6152a.b(th3);
            Eg.a.v(th3);
        }
        lazySet(EnumC6592b.DISPOSED);
    }
}
