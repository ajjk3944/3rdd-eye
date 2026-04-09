package ug;

import gg.D;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class w extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D f63047a;

    /* renamed from: b, reason: collision with root package name */
    final long f63048b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f63049c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f63050d;

    /* renamed from: e, reason: collision with root package name */
    final D f63051e;

    static final class a extends AtomicReference implements gg.B, Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f63052a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f63053b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final C2234a f63054c;

        /* renamed from: d, reason: collision with root package name */
        D f63055d;

        /* renamed from: e, reason: collision with root package name */
        final long f63056e;

        /* renamed from: f, reason: collision with root package name */
        final TimeUnit f63057f;

        /* renamed from: ug.w$a$a, reason: collision with other inner class name */
        static final class C2234a extends AtomicReference implements gg.B {

            /* renamed from: a, reason: collision with root package name */
            final gg.B f63058a;

            C2234a(gg.B b10) {
                this.f63058a = b10;
            }

            @Override // gg.B
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.B
            public void onError(Throwable th2) {
                this.f63058a.onError(th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                this.f63058a.onSuccess(obj);
            }
        }

        a(gg.B b10, D d10, long j10, TimeUnit timeUnit) {
            this.f63052a = b10;
            this.f63055d = d10;
            this.f63056e = j10;
            this.f63057f = timeUnit;
            if (d10 != null) {
                this.f63054c = new C2234a(b10);
            } else {
                this.f63054c = null;
            }
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
            EnumC6592b.dispose(this.f63053b);
            C2234a c2234a = this.f63054c;
            if (c2234a != null) {
                EnumC6592b.dispose(c2234a);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (interfaceC6043c == enumC6592b || !compareAndSet(interfaceC6043c, enumC6592b)) {
                Eg.a.v(th2);
            } else {
                EnumC6592b.dispose(this.f63053b);
                this.f63052a.onError(th2);
            }
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (interfaceC6043c == enumC6592b || !compareAndSet(interfaceC6043c, enumC6592b)) {
                return;
            }
            EnumC6592b.dispose(this.f63053b);
            this.f63052a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (EnumC6592b.dispose(this)) {
                D d10 = this.f63055d;
                if (d10 == null) {
                    this.f63052a.onError(new TimeoutException(AbstractC8755h.g(this.f63056e, this.f63057f)));
                } else {
                    this.f63055d = null;
                    d10.a(this.f63054c);
                }
            }
        }
    }

    public w(D d10, long j10, TimeUnit timeUnit, gg.y yVar, D d11) {
        this.f63047a = d10;
        this.f63048b = j10;
        this.f63049c = timeUnit;
        this.f63050d = yVar;
        this.f63051e = d11;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        a aVar = new a(b10, this.f63051e, this.f63048b, this.f63049c);
        b10.c(aVar);
        EnumC6592b.replace(aVar.f63053b, this.f63050d.f(aVar, this.f63048b, this.f63049c));
        this.f63047a.a(aVar);
    }
}
