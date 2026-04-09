package ug;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class o extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final Callable f63020a;

    public o(Callable callable) {
        this.f63020a = callable;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        InterfaceC6043c interfaceC6043cR = InterfaceC6043c.r();
        b10.c(interfaceC6043cR);
        if (interfaceC6043cR.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f63020a.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            if (interfaceC6043cR.isDisposed()) {
                return;
            }
            b10.onSuccess(objCall);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (interfaceC6043cR.isDisposed()) {
                Eg.a.v(th2);
            } else {
                b10.onError(th2);
            }
        }
    }
}
