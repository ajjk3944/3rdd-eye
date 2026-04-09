package tg;

import ig.AbstractC6152a;
import java.util.concurrent.Callable;
import zg.AbstractC8755h;

/* renamed from: tg.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8087B extends gg.s implements kg.q {

    /* renamed from: a, reason: collision with root package name */
    final Callable f62117a;

    public C8087B(Callable callable) {
        this.f62117a = callable;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        og.g gVar = new og.g(xVar);
        xVar.c(gVar);
        if (gVar.isDisposed()) {
            return;
        }
        try {
            gVar.g(AbstractC8755h.c(this.f62117a.call(), "Callable returned a null value."));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (gVar.isDisposed()) {
                Eg.a.v(th2);
            } else {
                xVar.onError(th2);
            }
        }
    }

    @Override // kg.q
    public Object get() {
        return AbstractC8755h.c(this.f62117a.call(), "The Callable returned a null value.");
    }
}
