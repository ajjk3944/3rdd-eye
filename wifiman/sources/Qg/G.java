package qg;

import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import yg.EnumC8669d;
import zg.AbstractC8751d;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class G extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final kg.q f58709b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6465b f58710c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6469f f58711d;

    static final class a extends AtomicLong implements gg.h, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58712a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6465b f58713b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC6469f f58714c;

        /* renamed from: d, reason: collision with root package name */
        Object f58715d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f58716e;

        /* renamed from: f, reason: collision with root package name */
        boolean f58717f;

        /* renamed from: g, reason: collision with root package name */
        boolean f58718g;

        a(Dj.b bVar, InterfaceC6465b interfaceC6465b, InterfaceC6469f interfaceC6469f, Object obj) {
            this.f58712a = bVar;
            this.f58713b = interfaceC6465b;
            this.f58714c = interfaceC6469f;
            this.f58715d = obj;
        }

        private void j(Object obj) {
            try {
                this.f58714c.accept(obj);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
        }

        @Override // gg.h
        public void a() {
            if (this.f58717f) {
                return;
            }
            this.f58717f = true;
            this.f58712a.a();
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f58716e) {
                return;
            }
            this.f58716e = true;
            if (AbstractC8751d.a(this, 1L) == 0) {
                Object obj = this.f58715d;
                this.f58715d = null;
                j(obj);
            }
        }

        @Override // gg.h
        public void h(Object obj) {
            if (this.f58717f) {
                return;
            }
            if (this.f58718g) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
            } else {
                this.f58718g = true;
                this.f58712a.h(obj);
            }
        }

        @Override // gg.h
        public void onError(Throwable th2) {
            if (this.f58717f) {
                Eg.a.v(th2);
                return;
            }
            if (th2 == null) {
                th2 = AbstractC8755h.b("onError called with a null Throwable.");
            }
            this.f58717f = true;
            this.f58712a.onError(th2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        
            r9.f58715d = r0;
            r10 = addAndGet(-r4);
         */
        @Override // Dj.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void request(long r10) {
            /*
                r9 = this;
                boolean r0 = yg.EnumC8672g.validate(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = zg.AbstractC8751d.a(r9, r10)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L12
                return
            L12:
                java.lang.Object r0 = r9.f58715d
                kg.b r1 = r9.f58713b
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4d
                boolean r6 = r9.f58716e
                r7 = 0
                if (r6 == 0) goto L26
                r9.f58715d = r7
                r9.j(r0)
                return
            L26:
                r6 = 0
                r9.f58718g = r6
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
                boolean r8 = r9.f58717f
                if (r8 == 0) goto L3a
                r9.f58716e = r6
                r9.f58715d = r7
                r9.j(r0)
                return
            L3a:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3e:
                r10 = move-exception
                ig.AbstractC6152a.b(r10)
                r9.f58716e = r6
                r9.f58715d = r7
                r9.onError(r10)
                r9.j(r0)
                return
            L4d:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.f58715d = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.G.a.request(long):void");
        }
    }

    public G(kg.q qVar, InterfaceC6465b interfaceC6465b, InterfaceC6469f interfaceC6469f) {
        this.f58709b = qVar;
        this.f58710c = interfaceC6465b;
        this.f58711d = interfaceC6469f;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        try {
            bVar.j(new a(bVar, this.f58710c, this.f58711d, this.f58709b.get()));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
