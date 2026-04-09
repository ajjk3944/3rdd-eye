package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C8671f;
import yg.EnumC8672g;
import zg.AbstractC8756i;
import zg.C8750c;
import zg.EnumC8754g;

/* renamed from: qg.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7489g extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58987c;

    /* renamed from: d, reason: collision with root package name */
    final int f58988d;

    /* renamed from: e, reason: collision with root package name */
    final EnumC8754g f58989e;

    /* renamed from: qg.g$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58990a;

        static {
            int[] iArr = new int[EnumC8754g.values().length];
            f58990a = iArr;
            try {
                iArr[EnumC8754g.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58990a[EnumC8754g.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: qg.g$b */
    static abstract class b extends AtomicInteger implements gg.l, f, Dj.c {

        /* renamed from: b, reason: collision with root package name */
        final kg.n f58992b;

        /* renamed from: c, reason: collision with root package name */
        final int f58993c;

        /* renamed from: d, reason: collision with root package name */
        final int f58994d;

        /* renamed from: e, reason: collision with root package name */
        Dj.c f58995e;

        /* renamed from: f, reason: collision with root package name */
        int f58996f;

        /* renamed from: g, reason: collision with root package name */
        Dg.g f58997g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f58998h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f58999i;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f59001k;

        /* renamed from: l, reason: collision with root package name */
        int f59002l;

        /* renamed from: a, reason: collision with root package name */
        final e f58991a = new e(this);

        /* renamed from: j, reason: collision with root package name */
        final C8750c f59000j = new C8750c();

        b(kg.n nVar, int i10) {
            this.f58992b = nVar;
            this.f58993c = i10;
            this.f58994d = i10 - (i10 >> 2);
        }

        @Override // Dj.b
        public final void a() {
            this.f58998h = true;
            l();
        }

        @Override // qg.C7489g.f
        public final void d() {
            this.f59001k = false;
            l();
        }

        @Override // Dj.b
        public final void h(Object obj) {
            if (this.f59002l == 2 || this.f58997g.offer(obj)) {
                l();
            } else {
                this.f58995e.cancel();
                onError(new QueueOverflowException());
            }
        }

        @Override // gg.l
        public final void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58995e, cVar)) {
                this.f58995e = cVar;
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f59002l = iRequestFusion;
                        this.f58997g = dVar;
                        this.f58998h = true;
                        n();
                        l();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f59002l = iRequestFusion;
                        this.f58997g = dVar;
                        n();
                        cVar.request(this.f58993c);
                        return;
                    }
                }
                this.f58997g = new Dg.h(this.f58993c);
                n();
                cVar.request(this.f58993c);
            }
        }

        abstract void l();

        abstract void n();
    }

    /* renamed from: qg.g$c */
    static final class c extends b {

        /* renamed from: m, reason: collision with root package name */
        final Dj.b f59003m;

        /* renamed from: n, reason: collision with root package name */
        final boolean f59004n;

        c(Dj.b bVar, kg.n nVar, int i10, boolean z10) {
            super(nVar, i10);
            this.f59003m = bVar;
            this.f59004n = z10;
        }

        @Override // qg.C7489g.f
        public void c(Object obj) {
            this.f59003m.h(obj);
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f58999i) {
                return;
            }
            this.f58999i = true;
            this.f58991a.cancel();
            this.f58995e.cancel();
            this.f59000j.h();
        }

        @Override // qg.C7489g.f
        public void g(Throwable th2) {
            if (this.f59000j.g(th2)) {
                if (!this.f59004n) {
                    this.f58995e.cancel();
                    this.f58998h = true;
                }
                this.f59001k = false;
                l();
            }
        }

        @Override // qg.C7489g.b
        void l() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f58999i) {
                    if (!this.f59001k) {
                        boolean z10 = this.f58998h;
                        if (z10 && !this.f59004n && ((Throwable) this.f59000j.get()) != null) {
                            this.f59000j.j(this.f59003m);
                            return;
                        }
                        try {
                            Object objPoll = this.f58997g.poll();
                            boolean z11 = objPoll == null;
                            if (z10 && z11) {
                                this.f59000j.j(this.f59003m);
                                return;
                            }
                            if (!z11) {
                                try {
                                    Object objApply = this.f58992b.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                    Dj.a aVar = (Dj.a) objApply;
                                    if (this.f59002l != 1) {
                                        int i10 = this.f58996f + 1;
                                        if (i10 == this.f58994d) {
                                            this.f58996f = 0;
                                            this.f58995e.request(i10);
                                        } else {
                                            this.f58996f = i10;
                                        }
                                    }
                                    if (aVar instanceof kg.q) {
                                        try {
                                            obj = ((kg.q) aVar).get();
                                        } catch (Throwable th2) {
                                            AbstractC6152a.b(th2);
                                            this.f59000j.g(th2);
                                            if (!this.f59004n) {
                                                this.f58995e.cancel();
                                                this.f59000j.j(this.f59003m);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f58991a.o()) {
                                            this.f59003m.h(obj);
                                        } else {
                                            this.f59001k = true;
                                            this.f58991a.r(new C2072g(obj, this.f58991a));
                                        }
                                    } else {
                                        this.f59001k = true;
                                        aVar.b(this.f58991a);
                                    }
                                } catch (Throwable th3) {
                                    AbstractC6152a.b(th3);
                                    this.f58995e.cancel();
                                    this.f59000j.g(th3);
                                    this.f59000j.j(this.f59003m);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            AbstractC6152a.b(th4);
                            this.f58995e.cancel();
                            this.f59000j.g(th4);
                            this.f59000j.j(this.f59003m);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // qg.C7489g.b
        void n() {
            this.f59003m.j(this);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59000j.g(th2)) {
                this.f58998h = true;
                l();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f58991a.request(j10);
        }
    }

    /* renamed from: qg.g$d */
    static final class d extends b {

        /* renamed from: m, reason: collision with root package name */
        final Dj.b f59005m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicInteger f59006n;

        d(Dj.b bVar, kg.n nVar, int i10) {
            super(nVar, i10);
            this.f59005m = bVar;
            this.f59006n = new AtomicInteger();
        }

        @Override // qg.C7489g.f
        public void c(Object obj) {
            AbstractC8756i.f(this.f59005m, obj, this, this.f59000j);
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f58999i) {
                return;
            }
            this.f58999i = true;
            this.f58991a.cancel();
            this.f58995e.cancel();
            this.f59000j.h();
        }

        @Override // qg.C7489g.f
        public void g(Throwable th2) {
            this.f58995e.cancel();
            AbstractC8756i.c(this.f59005m, th2, this, this.f59000j);
        }

        @Override // qg.C7489g.b
        void l() {
            if (this.f59006n.getAndIncrement() == 0) {
                while (!this.f58999i) {
                    if (!this.f59001k) {
                        boolean z10 = this.f58998h;
                        try {
                            Object objPoll = this.f58997g.poll();
                            boolean z11 = objPoll == null;
                            if (z10 && z11) {
                                this.f59005m.a();
                                return;
                            }
                            if (!z11) {
                                try {
                                    Object objApply = this.f58992b.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                    Dj.a aVar = (Dj.a) objApply;
                                    if (this.f59002l != 1) {
                                        int i10 = this.f58996f + 1;
                                        if (i10 == this.f58994d) {
                                            this.f58996f = 0;
                                            this.f58995e.request(i10);
                                        } else {
                                            this.f58996f = i10;
                                        }
                                    }
                                    if (aVar instanceof kg.q) {
                                        try {
                                            Object obj = ((kg.q) aVar).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f58991a.o()) {
                                                this.f59001k = true;
                                                this.f58991a.r(new C2072g(obj, this.f58991a));
                                            } else if (!AbstractC8756i.f(this.f59005m, obj, this, this.f59000j)) {
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            AbstractC6152a.b(th2);
                                            this.f58995e.cancel();
                                            this.f59000j.g(th2);
                                            this.f59000j.j(this.f59005m);
                                            return;
                                        }
                                    } else {
                                        this.f59001k = true;
                                        aVar.b(this.f58991a);
                                    }
                                } catch (Throwable th3) {
                                    AbstractC6152a.b(th3);
                                    this.f58995e.cancel();
                                    this.f59000j.g(th3);
                                    this.f59000j.j(this.f59005m);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            AbstractC6152a.b(th4);
                            this.f58995e.cancel();
                            this.f59000j.g(th4);
                            this.f59000j.j(this.f59005m);
                            return;
                        }
                    }
                    if (this.f59006n.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // qg.C7489g.b
        void n() {
            this.f59005m.j(this);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58991a.cancel();
            AbstractC8756i.c(this.f59005m, th2, this, this.f59000j);
        }

        @Override // Dj.c
        public void request(long j10) {
            this.f58991a.request(j10);
        }
    }

    /* renamed from: qg.g$e */
    static final class e extends C8671f implements gg.l {

        /* renamed from: i, reason: collision with root package name */
        final f f59007i;

        /* renamed from: j, reason: collision with root package name */
        long f59008j;

        e(f fVar) {
            super(false);
            this.f59007i = fVar;
        }

        @Override // Dj.b
        public void a() {
            long j10 = this.f59008j;
            if (j10 != 0) {
                this.f59008j = 0L;
                p(j10);
            }
            this.f59007i.d();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59008j++;
            this.f59007i.c(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            long j10 = this.f59008j;
            if (j10 != 0) {
                this.f59008j = 0L;
                p(j10);
            }
            this.f59007i.g(th2);
        }
    }

    /* renamed from: qg.g$f */
    interface f {
        void c(Object obj);

        void d();

        void g(Throwable th2);
    }

    /* renamed from: qg.g$g, reason: collision with other inner class name */
    static final class C2072g extends AtomicBoolean implements Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59009a;

        /* renamed from: b, reason: collision with root package name */
        final Object f59010b;

        C2072g(Object obj, Dj.b bVar) {
            this.f59010b = obj;
            this.f59009a = bVar;
        }

        @Override // Dj.c
        public void cancel() {
        }

        @Override // Dj.c
        public void request(long j10) {
            if (j10 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            Dj.b bVar = this.f59009a;
            bVar.h(this.f59010b);
            bVar.a();
        }
    }

    public C7489g(gg.i iVar, kg.n nVar, int i10, EnumC8754g enumC8754g) {
        super(iVar);
        this.f58987c = nVar;
        this.f58988d = i10;
        this.f58989e = enumC8754g;
    }

    public static Dj.b h2(Dj.b bVar, kg.n nVar, int i10, EnumC8754g enumC8754g) {
        int i11 = a.f58990a[enumC8754g.ordinal()];
        return i11 != 1 ? i11 != 2 ? new d(bVar, nVar, i10) : new c(bVar, nVar, i10, true) : new c(bVar, nVar, i10, false);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (i0.b(this.f58857b, bVar, this.f58987c)) {
            return;
        }
        this.f58857b.b(h2(bVar, this.f58987c, this.f58988d, this.f58989e));
    }
}
