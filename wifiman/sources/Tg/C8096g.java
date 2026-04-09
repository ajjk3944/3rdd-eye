package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6468e;
import lg.C6591a;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* renamed from: tg.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8096g extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.u f62369a;

    /* renamed from: tg.g$a */
    static final class a extends AtomicReference implements gg.t, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62370a;

        a(gg.x xVar) {
            this.f62370a = xVar;
        }

        @Override // gg.h
        public void a() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f62370a.a();
            } finally {
                dispose();
            }
        }

        @Override // gg.t
        public boolean c(Throwable th2) {
            if (th2 == null) {
                th2 = AbstractC8755h.b("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f62370a.onError(th2);
                dispose();
                return true;
            } catch (Throwable th3) {
                dispose();
                throw th3;
            }
        }

        @Override // gg.t
        public void d(InterfaceC6468e interfaceC6468e) {
            g(new C6591a(interfaceC6468e));
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.t
        public void g(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.set(this, interfaceC6043c);
        }

        @Override // gg.h
        public void h(Object obj) {
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f62370a.h(obj);
            }
        }

        @Override // gg.t, hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.h
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

    public C8096g(gg.u uVar) {
        this.f62369a = uVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        a aVar = new a(xVar);
        xVar.c(aVar);
        try {
            this.f62369a.a(aVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            aVar.onError(th2);
        }
    }
}
