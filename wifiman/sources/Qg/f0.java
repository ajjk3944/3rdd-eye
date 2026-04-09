package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.C8671f;
import yg.EnumC8669d;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class f0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58978c;

    static final class a extends c {
        a(Dj.b bVar, Fg.b bVar2, Dj.c cVar) {
            super(bVar, bVar2, cVar);
        }

        @Override // Dj.b
        public void a() {
            s(0);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58985k.cancel();
            this.f58983i.onError(th2);
        }
    }

    static final class b extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.a f58979a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f58980b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final AtomicLong f58981c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        c f58982d;

        b(Dj.a aVar) {
            this.f58979a = aVar;
        }

        @Override // Dj.b
        public void a() {
            this.f58982d.cancel();
            this.f58982d.f58983i.a();
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f58980b);
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f58980b.get() != EnumC8672g.CANCELLED) {
                    this.f58979a.b(this.f58982d);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f58980b, this.f58981c, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58982d.cancel();
            this.f58982d.f58983i.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f58980b, this.f58981c, j10);
        }
    }

    static abstract class c extends C8671f implements gg.l {

        /* renamed from: i, reason: collision with root package name */
        protected final Dj.b f58983i;

        /* renamed from: j, reason: collision with root package name */
        protected final Fg.b f58984j;

        /* renamed from: k, reason: collision with root package name */
        protected final Dj.c f58985k;

        /* renamed from: l, reason: collision with root package name */
        private long f58986l;

        c(Dj.b bVar, Fg.b bVar2, Dj.c cVar) {
            super(false);
            this.f58983i = bVar;
            this.f58984j = bVar2;
            this.f58985k = cVar;
        }

        @Override // yg.C8671f, Dj.c
        public final void cancel() {
            super.cancel();
            this.f58985k.cancel();
        }

        @Override // Dj.b
        public final void h(Object obj) {
            this.f58986l++;
            this.f58983i.h(obj);
        }

        @Override // gg.l
        public final void j(Dj.c cVar) {
            r(cVar);
        }

        protected final void s(Object obj) {
            r(EnumC8669d.INSTANCE);
            long j10 = this.f58986l;
            if (j10 != 0) {
                this.f58986l = 0L;
                p(j10);
            }
            this.f58985k.request(1L);
            this.f58984j.h(obj);
        }
    }

    public f0(gg.i iVar, kg.n nVar) {
        super(iVar);
        this.f58978c = nVar;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        Ig.a aVar = new Ig.a(bVar);
        Fg.b bVarH2 = Fg.e.k2(8).h2();
        try {
            Object objApply = this.f58978c.apply(bVarH2);
            Objects.requireNonNull(objApply, "handler returned a null Publisher");
            Dj.a aVar2 = (Dj.a) objApply;
            b bVar2 = new b(this.f58857b);
            a aVar3 = new a(aVar, bVarH2, bVar2);
            bVar2.f58982d = aVar3;
            bVar.j(aVar3);
            aVar2.b(bVar2);
            bVar2.h(0);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
