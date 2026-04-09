package og;

import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;

/* loaded from: classes4.dex */
public final class j extends AtomicReference implements x, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6469f f55698a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f55699b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6464a f55700c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6469f f55701d;

    public j(InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6469f interfaceC6469f3) {
        this.f55698a = interfaceC6469f;
        this.f55699b = interfaceC6469f2;
        this.f55700c = interfaceC6464a;
        this.f55701d = interfaceC6469f3;
    }

    @Override // gg.x
    public void a() {
        if (isDisposed()) {
            return;
        }
        lazySet(EnumC6592b.DISPOSED);
        try {
            this.f55700c.run();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
        }
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        if (EnumC6592b.setOnce(this, interfaceC6043c)) {
            try {
                this.f55701d.accept(this);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                interfaceC6043c.dispose();
                onError(th2);
            }
        }
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        EnumC6592b.dispose(this);
    }

    @Override // gg.x
    public void h(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f55698a.accept(obj);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            ((InterfaceC6043c) get()).dispose();
            onError(th2);
        }
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return get() == EnumC6592b.DISPOSED;
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        if (isDisposed()) {
            Eg.a.v(th2);
            return;
        }
        lazySet(EnumC6592b.DISPOSED);
        try {
            this.f55699b.accept(th2);
        } catch (Throwable th3) {
            AbstractC6152a.b(th3);
            Eg.a.v(new CompositeException(th2, th3));
        }
    }
}
