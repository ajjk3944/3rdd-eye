package qg;

import gg.EnumC5911a;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6468e;
import lg.C6591a;
import lg.C6595e;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;
import zg.C8750c;

/* renamed from: qg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7491i extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.k f59047b;

    /* renamed from: c, reason: collision with root package name */
    final EnumC5911a f59048c;

    /* renamed from: qg.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59049a;

        static {
            int[] iArr = new int[EnumC5911a.values().length];
            f59049a = iArr;
            try {
                iArr[EnumC5911a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59049a[EnumC5911a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59049a[EnumC5911a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59049a[EnumC5911a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: qg.i$b */
    static abstract class b extends AtomicLong implements gg.j, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59050a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f59051b = new C6595e();

        b(Dj.b bVar) {
            this.f59050a = bVar;
        }

        @Override // gg.h
        public void a() {
            j();
        }

        @Override // gg.j
        public final boolean c(Throwable th2) {
            if (th2 == null) {
                th2 = AbstractC8755h.b("tryOnError called with a null Throwable.");
            }
            return o(th2);
        }

        @Override // Dj.c
        public final void cancel() {
            this.f59051b.dispose();
            n();
        }

        @Override // gg.j
        public final void d(InterfaceC6468e interfaceC6468e) {
            g(new C6591a(interfaceC6468e));
        }

        @Override // gg.j
        public final void g(InterfaceC6043c interfaceC6043c) {
            this.f59051b.c(interfaceC6043c);
        }

        @Override // gg.j
        public final boolean isCancelled() {
            return this.f59051b.isDisposed();
        }

        protected void j() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f59050a.a();
            } finally {
                this.f59051b.dispose();
            }
        }

        protected boolean l(Throwable th2) {
            if (isCancelled()) {
                return false;
            }
            try {
                this.f59050a.onError(th2);
                this.f59051b.dispose();
                return true;
            } catch (Throwable th3) {
                this.f59051b.dispose();
                throw th3;
            }
        }

        void m() {
        }

        void n() {
        }

        public boolean o(Throwable th2) {
            return l(th2);
        }

        @Override // gg.h
        public final void onError(Throwable th2) {
            if (th2 == null) {
                th2 = AbstractC8755h.b("onError called with a null Throwable.");
            }
            if (o(th2)) {
                return;
            }
            Eg.a.v(th2);
        }

        @Override // Dj.c
        public final void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
                m();
            }
        }

        @Override // gg.j
        public final gg.j serialize() {
            return new C2073i(this);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* renamed from: qg.i$c */
    static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        final Dg.i f59052c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f59053d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f59054e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f59055f;

        c(Dj.b bVar, int i10) {
            super(bVar);
            this.f59052c = new Dg.i(i10);
            this.f59055f = new AtomicInteger();
        }

        @Override // qg.C7491i.b, gg.h
        public void a() {
            this.f59054e = true;
            p();
        }

        @Override // gg.h
        public void h(Object obj) {
            if (this.f59054e || isCancelled()) {
                return;
            }
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
            } else {
                this.f59052c.offer(obj);
                p();
            }
        }

        @Override // qg.C7491i.b
        void m() {
            p();
        }

        @Override // qg.C7491i.b
        void n() {
            if (this.f59055f.getAndIncrement() == 0) {
                this.f59052c.clear();
            }
        }

        @Override // qg.C7491i.b
        public boolean o(Throwable th2) {
            if (this.f59054e || isCancelled()) {
                return false;
            }
            this.f59053d = th2;
            this.f59054e = true;
            p();
            return true;
        }

        void p() {
            if (this.f59055f.getAndIncrement() != 0) {
                return;
            }
            Dj.b bVar = this.f59050a;
            Dg.i iVar = this.f59052c;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (isCancelled()) {
                        iVar.clear();
                        return;
                    }
                    boolean z10 = this.f59054e;
                    Object objPoll = iVar.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f59053d;
                        if (th2 != null) {
                            l(th2);
                            return;
                        } else {
                            j();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.h(objPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (isCancelled()) {
                        iVar.clear();
                        return;
                    }
                    boolean z12 = this.f59054e;
                    boolean zIsEmpty = iVar.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.f59053d;
                        if (th3 != null) {
                            l(th3);
                            return;
                        } else {
                            j();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    AbstractC8751d.d(this, j11);
                }
                iAddAndGet = this.f59055f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    /* renamed from: qg.i$d */
    static final class d extends h {
        d(Dj.b bVar) {
            super(bVar);
        }

        @Override // qg.C7491i.h
        void p() {
        }
    }

    /* renamed from: qg.i$e */
    static final class e extends h {
        e(Dj.b bVar) {
            super(bVar);
        }

        @Override // qg.C7491i.h
        void p() {
            onError(new MissingBackpressureException("create: Could not emit value due to lack of requests"));
        }
    }

    /* renamed from: qg.i$f */
    static final class f extends b {

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f59056c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f59057d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f59058e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f59059f;

        f(Dj.b bVar) {
            super(bVar);
            this.f59056c = new AtomicReference();
            this.f59059f = new AtomicInteger();
        }

        @Override // qg.C7491i.b, gg.h
        public void a() {
            this.f59058e = true;
            p();
        }

        @Override // gg.h
        public void h(Object obj) {
            if (this.f59058e || isCancelled()) {
                return;
            }
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
            } else {
                this.f59056c.set(obj);
                p();
            }
        }

        @Override // qg.C7491i.b
        void m() {
            p();
        }

        @Override // qg.C7491i.b
        void n() {
            if (this.f59059f.getAndIncrement() == 0) {
                this.f59056c.lazySet(null);
            }
        }

        @Override // qg.C7491i.b
        public boolean o(Throwable th2) {
            if (this.f59058e || isCancelled()) {
                return false;
            }
            this.f59057d = th2;
            this.f59058e = true;
            p();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            if (isCancelled() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        
            r5 = r17.f59058e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            if (r2.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        
            r1 = r17.f59057d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
        
            l(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        
            j();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            zg.AbstractC8751d.d(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            r4 = r17.f59059f.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void p() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f59059f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lb
                return
            Lb:
                Dj.b r1 = r0.f59050a
                java.util.concurrent.atomic.AtomicReference r2 = r0.f59056c
                r3 = 1
                r4 = r3
            L11:
                long r5 = r17.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L4f
                boolean r14 = r17.isCancelled()
                if (r14 == 0) goto L28
                r2.lazySet(r13)
                return
            L28:
                boolean r14 = r0.f59058e
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L33
                r16 = r3
                goto L35
            L33:
                r16 = r12
            L35:
                if (r14 == 0) goto L45
                if (r16 == 0) goto L45
                java.lang.Throwable r1 = r0.f59057d
                if (r1 == 0) goto L41
                r0.l(r1)
                goto L44
            L41:
                r17.j()
            L44:
                return
            L45:
                if (r16 == 0) goto L48
                goto L4f
            L48:
                r1.h(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L4f:
                if (r11 != 0) goto L74
                boolean r5 = r17.isCancelled()
                if (r5 == 0) goto L5b
                r2.lazySet(r13)
                return
            L5b:
                boolean r5 = r0.f59058e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L64
                r12 = r3
            L64:
                if (r5 == 0) goto L74
                if (r12 == 0) goto L74
                java.lang.Throwable r1 = r0.f59057d
                if (r1 == 0) goto L70
                r0.l(r1)
                goto L73
            L70:
                r17.j()
            L73:
                return
            L74:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7b
                zg.AbstractC8751d.d(r0, r9)
            L7b:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f59059f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C7491i.f.p():void");
        }
    }

    /* renamed from: qg.i$g */
    static final class g extends b {
        g(Dj.b bVar) {
            super(bVar);
        }

        @Override // gg.h
        public void h(Object obj) {
            long j10;
            if (isCancelled()) {
                return;
            }
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
                return;
            }
            this.f59050a.h(obj);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    /* renamed from: qg.i$h */
    static abstract class h extends b {
        h(Dj.b bVar) {
            super(bVar);
        }

        @Override // gg.h
        public final void h(Object obj) {
            if (isCancelled()) {
                return;
            }
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
            } else if (get() == 0) {
                p();
            } else {
                this.f59050a.h(obj);
                AbstractC8751d.d(this, 1L);
            }
        }

        abstract void p();
    }

    /* renamed from: qg.i$i, reason: collision with other inner class name */
    static final class C2073i extends AtomicInteger implements gg.j {

        /* renamed from: a, reason: collision with root package name */
        final b f59060a;

        /* renamed from: b, reason: collision with root package name */
        final C8750c f59061b = new C8750c();

        /* renamed from: c, reason: collision with root package name */
        final Dg.f f59062c = new Dg.i(16);

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f59063d;

        C2073i(b bVar) {
            this.f59060a = bVar;
        }

        @Override // gg.h
        public void a() {
            if (this.f59060a.isCancelled() || this.f59063d) {
                return;
            }
            this.f59063d = true;
            j();
        }

        @Override // gg.j
        public boolean c(Throwable th2) {
            if (!this.f59060a.isCancelled() && !this.f59063d) {
                if (th2 == null) {
                    th2 = AbstractC8755h.b("onError called with a null Throwable.");
                }
                if (this.f59061b.d(th2)) {
                    this.f59063d = true;
                    j();
                    return true;
                }
            }
            return false;
        }

        @Override // gg.j
        public void d(InterfaceC6468e interfaceC6468e) {
            this.f59060a.d(interfaceC6468e);
        }

        @Override // gg.j
        public void g(InterfaceC6043c interfaceC6043c) {
            this.f59060a.g(interfaceC6043c);
        }

        @Override // gg.h
        public void h(Object obj) {
            if (this.f59060a.isCancelled() || this.f59063d) {
                return;
            }
            if (obj == null) {
                onError(AbstractC8755h.b("onNext called with a null value."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f59060a.h(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Dg.f fVar = this.f59062c;
                synchronized (fVar) {
                    fVar.offer(obj);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            l();
        }

        @Override // gg.j
        public boolean isCancelled() {
            return this.f59060a.isCancelled();
        }

        void j() {
            if (getAndIncrement() == 0) {
                l();
            }
        }

        void l() {
            b bVar = this.f59060a;
            Dg.f fVar = this.f59062c;
            C8750c c8750c = this.f59061b;
            int iAddAndGet = 1;
            while (!bVar.isCancelled()) {
                if (c8750c.get() != null) {
                    fVar.clear();
                    c8750c.m(bVar);
                    return;
                }
                boolean z10 = this.f59063d;
                Object objPoll = fVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    bVar.a();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    bVar.h(objPoll);
                }
            }
            fVar.clear();
        }

        @Override // gg.h
        public void onError(Throwable th2) {
            if (c(th2)) {
                return;
            }
            Eg.a.v(th2);
        }

        @Override // gg.j
        public gg.j serialize() {
            return this;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f59060a.toString();
        }
    }

    public C7491i(gg.k kVar, EnumC5911a enumC5911a) {
        this.f59047b = kVar;
        this.f59048c = enumC5911a;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        int i10 = a.f59049a[this.f59048c.ordinal()];
        b cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new c(bVar, gg.i.i()) : new f(bVar) : new d(bVar) : new e(bVar) : new g(bVar);
        bVar.j(cVar);
        try {
            this.f59047b.a(cVar);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            cVar.onError(th2);
        }
    }
}
