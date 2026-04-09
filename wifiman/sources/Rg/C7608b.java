package rg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* renamed from: rg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7608b extends gg.n {

    /* renamed from: a, reason: collision with root package name */
    final gg.q f60508a;

    /* renamed from: rg.b$a */
    static final class a extends AtomicReference implements gg.o, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.p f60509a;

        a(gg.p pVar) {
            this.f60509a = pVar;
        }

        @Override // gg.o
        public void a() {
            InterfaceC6043c interfaceC6043c;
            Object obj = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj == enumC6592b || (interfaceC6043c = (InterfaceC6043c) getAndSet(enumC6592b)) == enumC6592b) {
                return;
            }
            try {
                this.f60509a.a();
            } finally {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            }
        }

        public boolean c(Throwable th2) {
            InterfaceC6043c interfaceC6043c;
            if (th2 == null) {
                th2 = AbstractC8755h.b("onError called with a null Throwable.");
            }
            Object obj = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj == enumC6592b || (interfaceC6043c = (InterfaceC6043c) getAndSet(enumC6592b)) == enumC6592b) {
                return false;
            }
            try {
                this.f60509a.onError(th2);
            } finally {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.o
        public void onError(Throwable th2) {
            if (c(th2)) {
                return;
            }
            Eg.a.v(th2);
        }

        @Override // gg.o
        public void onSuccess(Object obj) {
            InterfaceC6043c interfaceC6043c;
            Object obj2 = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj2 == enumC6592b || (interfaceC6043c = (InterfaceC6043c) getAndSet(enumC6592b)) == enumC6592b) {
                return;
            }
            try {
                if (obj == null) {
                    this.f60509a.onError(AbstractC8755h.b("onSuccess called with a null value."));
                } else {
                    this.f60509a.onSuccess(obj);
                }
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            } catch (Throwable th2) {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C7608b(gg.q qVar) {
        this.f60508a = qVar;
    }

    @Override // gg.n
    protected void v(gg.p pVar) {
        a aVar = new a(pVar);
        pVar.c(aVar);
        try {
            this.f60508a.a(aVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            aVar.onError(th2);
        }
    }
}
