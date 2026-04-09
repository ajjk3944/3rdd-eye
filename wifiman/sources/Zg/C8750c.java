package zg;

import gg.InterfaceC5914d;
import gg.x;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8750c extends AtomicReference {
    public boolean a() {
        return get() == AbstractC8755h.f67282a;
    }

    public Throwable c() {
        return AbstractC8755h.e(this);
    }

    public boolean d(Throwable th2) {
        return AbstractC8755h.a(this, th2);
    }

    public boolean g(Throwable th2) {
        if (d(th2)) {
            return true;
        }
        Eg.a.v(th2);
        return false;
    }

    public void h() {
        Throwable thC = c();
        if (thC == null || thC == AbstractC8755h.f67282a) {
            return;
        }
        Eg.a.v(thC);
    }

    public void j(Dj.b bVar) {
        Throwable thC = c();
        if (thC == null) {
            bVar.a();
        } else if (thC != AbstractC8755h.f67282a) {
            bVar.onError(thC);
        }
    }

    public void l(InterfaceC5914d interfaceC5914d) {
        Throwable thC = c();
        if (thC == null) {
            interfaceC5914d.a();
        } else if (thC != AbstractC8755h.f67282a) {
            interfaceC5914d.onError(thC);
        }
    }

    public void m(gg.h hVar) {
        Throwable thC = c();
        if (thC == null) {
            hVar.a();
        } else if (thC != AbstractC8755h.f67282a) {
            hVar.onError(thC);
        }
    }

    public void n(x xVar) {
        Throwable thC = c();
        if (thC == null) {
            xVar.a();
        } else if (thC != AbstractC8755h.f67282a) {
            xVar.onError(thC);
        }
    }
}
