package og;

import gg.B;
import gg.InterfaceC5914d;
import gg.p;
import hg.InterfaceC6043c;
import java.util.concurrent.CountDownLatch;
import zg.AbstractC8752e;
import zg.AbstractC8755h;

/* renamed from: og.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7134d extends CountDownLatch implements B, InterfaceC5914d, p {

    /* renamed from: a, reason: collision with root package name */
    Object f55684a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f55685b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC6043c f55686c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f55687d;

    public C7134d() {
        super(1);
    }

    @Override // gg.InterfaceC5914d
    public void a() {
        countDown();
    }

    public Object b() throws InterruptedException {
        if (getCount() != 0) {
            try {
                AbstractC8752e.a();
                await();
            } catch (InterruptedException e10) {
                d();
                throw AbstractC8755h.h(e10);
            }
        }
        Throwable th2 = this.f55685b;
        if (th2 == null) {
            return this.f55684a;
        }
        throw AbstractC8755h.h(th2);
    }

    @Override // gg.B
    public void c(InterfaceC6043c interfaceC6043c) {
        this.f55686c = interfaceC6043c;
        if (this.f55687d) {
            interfaceC6043c.dispose();
        }
    }

    void d() {
        this.f55687d = true;
        InterfaceC6043c interfaceC6043c = this.f55686c;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
    }

    @Override // gg.B
    public void onError(Throwable th2) {
        this.f55685b = th2;
        countDown();
    }

    @Override // gg.B
    public void onSuccess(Object obj) {
        this.f55684a = obj;
        countDown();
    }
}
