package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6464a;
import lg.EnumC6592b;

/* renamed from: ug.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8171f extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f62979a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6464a f62980b;

    /* renamed from: ug.f$a */
    static final class a extends AtomicInteger implements gg.B, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62981a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6464a f62982b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f62983c;

        a(gg.B b10, InterfaceC6464a interfaceC6464a) {
            this.f62981a = b10;
            this.f62982b = interfaceC6464a;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f62982b.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62983c, interfaceC6043c)) {
                this.f62983c = interfaceC6043c;
                this.f62981a.c(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62983c.dispose();
            a();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62983c.isDisposed();
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f62981a.onError(th2);
            a();
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f62981a.onSuccess(obj);
            a();
        }
    }

    public C8171f(D d10, InterfaceC6464a interfaceC6464a) {
        this.f62979a = d10;
        this.f62980b = interfaceC6464a;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f62979a.a(new a(b10, this.f62980b));
    }
}
