package qg;

import gg.y;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicLong;
import yg.AbstractC8666a;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class T extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.y f58779c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f58780d;

    /* renamed from: e, reason: collision with root package name */
    final int f58781e;

    static abstract class a extends AbstractC8666a implements gg.l, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final y.c f58782a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f58783b;

        /* renamed from: c, reason: collision with root package name */
        final int f58784c;

        /* renamed from: d, reason: collision with root package name */
        final int f58785d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f58786e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        Dj.c f58787f;

        /* renamed from: g, reason: collision with root package name */
        Dg.g f58788g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f58789h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f58790i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f58791j;

        /* renamed from: k, reason: collision with root package name */
        int f58792k;

        /* renamed from: l, reason: collision with root package name */
        long f58793l;

        /* renamed from: m, reason: collision with root package name */
        boolean f58794m;

        a(y.c cVar, boolean z10, int i10) {
            this.f58782a = cVar;
            this.f58783b = z10;
            this.f58784c = i10;
            this.f58785d = i10 - (i10 >> 2);
        }

        @Override // Dj.b
        public final void a() {
            if (this.f58790i) {
                return;
            }
            this.f58790i = true;
            o();
        }

        @Override // Dj.c
        public final void cancel() {
            if (this.f58789h) {
                return;
            }
            this.f58789h = true;
            this.f58787f.cancel();
            this.f58782a.dispose();
            if (this.f58794m || getAndIncrement() != 0) {
                return;
            }
            this.f58788g.clear();
        }

        @Override // Dg.g
        public final void clear() {
            this.f58788g.clear();
        }

        final boolean d(boolean z10, boolean z11, Dj.b bVar) {
            if (this.f58789h) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f58783b) {
                if (!z11) {
                    return false;
                }
                this.f58789h = true;
                Throwable th2 = this.f58791j;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.a();
                }
                this.f58782a.dispose();
                return true;
            }
            Throwable th3 = this.f58791j;
            if (th3 != null) {
                this.f58789h = true;
                clear();
                bVar.onError(th3);
                this.f58782a.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f58789h = true;
            bVar.a();
            this.f58782a.dispose();
            return true;
        }

        abstract void g();

        @Override // Dj.b
        public final void h(Object obj) {
            if (this.f58790i) {
                return;
            }
            if (this.f58792k == 2) {
                o();
                return;
            }
            if (!this.f58788g.offer(obj)) {
                this.f58787f.cancel();
                this.f58791j = new QueueOverflowException();
                this.f58790i = true;
            }
            o();
        }

        @Override // Dg.g
        public final boolean isEmpty() {
            return this.f58788g.isEmpty();
        }

        abstract void l();

        abstract void n();

        final void o() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f58782a.b(this);
        }

        @Override // Dj.b
        public final void onError(Throwable th2) {
            if (this.f58790i) {
                Eg.a.v(th2);
                return;
            }
            this.f58791j = th2;
            this.f58790i = true;
            o();
        }

        @Override // Dj.c
        public final void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f58786e, j10);
                o();
            }
        }

        @Override // Dg.c
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f58794m = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f58794m) {
                l();
            } else if (this.f58792k == 1) {
                n();
            } else {
                g();
            }
        }
    }

    static final class b extends a {

        /* renamed from: n, reason: collision with root package name */
        final Dg.a f58795n;

        /* renamed from: o, reason: collision with root package name */
        long f58796o;

        b(Dg.a aVar, y.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f58795n = aVar;
        }

        @Override // qg.T.a
        void g() {
            Dg.a aVar = this.f58795n;
            Dg.g gVar = this.f58788g;
            long j10 = this.f58793l;
            long j11 = this.f58796o;
            int iAddAndGet = 1;
            do {
                long j12 = this.f58786e.get();
                while (j10 != j12) {
                    boolean z10 = this.f58790i;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z11 = objPoll == null;
                        if (d(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.m(objPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f58785d) {
                            this.f58787f.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f58789h = true;
                        this.f58787f.cancel();
                        gVar.clear();
                        aVar.onError(th2);
                        this.f58782a.dispose();
                        return;
                    }
                }
                if (j10 == j12 && d(this.f58790i, gVar.isEmpty(), aVar)) {
                    return;
                }
                this.f58793l = j10;
                this.f58796o = j11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58787f, cVar)) {
                this.f58787f = cVar;
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f58792k = 1;
                        this.f58788g = dVar;
                        this.f58790i = true;
                        this.f58795n.j(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f58792k = 2;
                        this.f58788g = dVar;
                        this.f58795n.j(this);
                        cVar.request(this.f58784c);
                        return;
                    }
                }
                this.f58788g = new Dg.h(this.f58784c);
                this.f58795n.j(this);
                cVar.request(this.f58784c);
            }
        }

        @Override // qg.T.a
        void l() {
            int iAddAndGet = 1;
            while (!this.f58789h) {
                boolean z10 = this.f58790i;
                this.f58795n.h(null);
                if (z10) {
                    this.f58789h = true;
                    Throwable th2 = this.f58791j;
                    if (th2 != null) {
                        this.f58795n.onError(th2);
                    } else {
                        this.f58795n.a();
                    }
                    this.f58782a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // qg.T.a
        void n() {
            Dg.a aVar = this.f58795n;
            Dg.g gVar = this.f58788g;
            long j10 = this.f58793l;
            int iAddAndGet = 1;
            do {
                long j11 = this.f58786e.get();
                while (j10 != j11) {
                    try {
                        Object objPoll = gVar.poll();
                        if (this.f58789h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f58789h = true;
                            aVar.a();
                            this.f58782a.dispose();
                            return;
                        } else if (aVar.m(objPoll)) {
                            j10++;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f58789h = true;
                        this.f58787f.cancel();
                        aVar.onError(th2);
                        this.f58782a.dispose();
                        return;
                    }
                }
                if (this.f58789h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f58789h = true;
                    aVar.a();
                    this.f58782a.dispose();
                    return;
                }
                this.f58793l = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f58788g.poll();
            if (objPoll != null && this.f58792k != 1) {
                long j10 = this.f58796o + 1;
                if (j10 == this.f58785d) {
                    this.f58796o = 0L;
                    this.f58787f.request(j10);
                } else {
                    this.f58796o = j10;
                }
            }
            return objPoll;
        }
    }

    static final class c extends a {

        /* renamed from: n, reason: collision with root package name */
        final Dj.b f58797n;

        c(Dj.b bVar, y.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f58797n = bVar;
        }

        @Override // qg.T.a
        void g() {
            Dj.b bVar = this.f58797n;
            Dg.g gVar = this.f58788g;
            long j10 = this.f58793l;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f58786e.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f58790i;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z11 = objPoll == null;
                        if (d(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.h(objPoll);
                        j10++;
                        if (j10 == this.f58785d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f58786e.addAndGet(-j10);
                            }
                            this.f58787f.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f58789h = true;
                        this.f58787f.cancel();
                        gVar.clear();
                        bVar.onError(th2);
                        this.f58782a.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && d(this.f58790i, gVar.isEmpty(), bVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f58793l = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58787f, cVar)) {
                this.f58787f = cVar;
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f58792k = 1;
                        this.f58788g = dVar;
                        this.f58790i = true;
                        this.f58797n.j(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f58792k = 2;
                        this.f58788g = dVar;
                        this.f58797n.j(this);
                        cVar.request(this.f58784c);
                        return;
                    }
                }
                this.f58788g = new Dg.h(this.f58784c);
                this.f58797n.j(this);
                cVar.request(this.f58784c);
            }
        }

        @Override // qg.T.a
        void l() {
            int iAddAndGet = 1;
            while (!this.f58789h) {
                boolean z10 = this.f58790i;
                this.f58797n.h(null);
                if (z10) {
                    this.f58789h = true;
                    Throwable th2 = this.f58791j;
                    if (th2 != null) {
                        this.f58797n.onError(th2);
                    } else {
                        this.f58797n.a();
                    }
                    this.f58782a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // qg.T.a
        void n() {
            Dj.b bVar = this.f58797n;
            Dg.g gVar = this.f58788g;
            long j10 = this.f58793l;
            int iAddAndGet = 1;
            do {
                long j11 = this.f58786e.get();
                while (j10 != j11) {
                    try {
                        Object objPoll = gVar.poll();
                        if (this.f58789h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f58789h = true;
                            bVar.a();
                            this.f58782a.dispose();
                            return;
                        }
                        bVar.h(objPoll);
                        j10++;
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        this.f58789h = true;
                        this.f58787f.cancel();
                        bVar.onError(th2);
                        this.f58782a.dispose();
                        return;
                    }
                }
                if (this.f58789h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f58789h = true;
                    bVar.a();
                    this.f58782a.dispose();
                    return;
                }
                this.f58793l = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f58788g.poll();
            if (objPoll != null && this.f58792k != 1) {
                long j10 = this.f58793l + 1;
                if (j10 == this.f58785d) {
                    this.f58793l = 0L;
                    this.f58787f.request(j10);
                } else {
                    this.f58793l = j10;
                }
            }
            return objPoll;
        }
    }

    public T(gg.i iVar, gg.y yVar, boolean z10, int i10) {
        super(iVar);
        this.f58779c = yVar;
        this.f58780d = z10;
        this.f58781e = i10;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        y.c cVarC = this.f58779c.c();
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new b((Dg.a) bVar, cVarC, this.f58780d, this.f58781e));
        } else {
            this.f58857b.D1(new c(bVar, cVarC, this.f58780d, this.f58781e));
        }
    }
}
