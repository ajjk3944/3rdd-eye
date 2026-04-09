package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5914d;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6468e;
import lg.C6591a;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class e extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC5915e f57943a;

    static final class a extends AtomicReference implements InterfaceC5913c, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57944a;

        a(InterfaceC5914d interfaceC5914d) {
            this.f57944a = interfaceC5914d;
        }

        @Override // gg.InterfaceC5913c
        public void a() {
            InterfaceC6043c interfaceC6043c;
            Object obj = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj == enumC6592b || (interfaceC6043c = (InterfaceC6043c) getAndSet(enumC6592b)) == enumC6592b) {
                return;
            }
            try {
                this.f57944a.a();
            } finally {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            }
        }

        @Override // gg.InterfaceC5913c
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
                this.f57944a.onError(th2);
            } finally {
                if (interfaceC6043c != null) {
                    interfaceC6043c.dispose();
                }
            }
        }

        @Override // gg.InterfaceC5913c
        public void d(InterfaceC6468e interfaceC6468e) {
            g(new C6591a(interfaceC6468e));
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        public void g(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.set(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.InterfaceC5913c
        public void onError(Throwable th2) {
            if (c(th2)) {
                return;
            }
            Eg.a.v(th2);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public e(InterfaceC5915e interfaceC5915e) {
        this.f57943a = interfaceC5915e;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d);
        interfaceC5914d.c(aVar);
        try {
            this.f57943a.a(aVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            aVar.onError(th2);
        }
    }
}
