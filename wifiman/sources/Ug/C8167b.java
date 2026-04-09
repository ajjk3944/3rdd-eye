package ug;

import gg.C;
import gg.InterfaceC5910A;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6468e;
import lg.C6591a;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* renamed from: ug.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8167b extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final C f62967a;

    /* renamed from: ug.b$a */
    static final class a extends AtomicReference implements InterfaceC5910A, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62968a;

        a(gg.B b10) {
            this.f62968a = b10;
        }

        @Override // gg.InterfaceC5910A
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
                this.f62968a.onError(th2);
            } finally {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            }
        }

        @Override // gg.InterfaceC5910A
        public void d(InterfaceC6468e interfaceC6468e) {
            g(new C6591a(interfaceC6468e));
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.InterfaceC5910A
        public void g(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.set(this, interfaceC6043c);
        }

        @Override // gg.InterfaceC5910A, hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.InterfaceC5910A
        public void onError(Throwable th2) {
            if (c(th2)) {
                return;
            }
            Eg.a.v(th2);
        }

        @Override // gg.InterfaceC5910A
        public void onSuccess(Object obj) {
            InterfaceC6043c interfaceC6043c;
            Object obj2 = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj2 == enumC6592b || (interfaceC6043c = (InterfaceC6043c) getAndSet(enumC6592b)) == enumC6592b) {
                return;
            }
            try {
                if (obj == null) {
                    this.f62968a.onError(AbstractC8755h.b("onSuccess called with a null value."));
                } else {
                    this.f62968a.onSuccess(obj);
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

    public C8167b(C c10) {
        this.f62967a = c10;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        a aVar = new a(b10);
        b10.c(aVar);
        try {
            this.f62967a.a(aVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            aVar.onError(th2);
        }
    }
}
