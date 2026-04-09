package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6465b;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class k0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6465b f59104c;

    /* renamed from: d, reason: collision with root package name */
    final kg.q f59105d;

    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59106a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6465b f59107b;

        /* renamed from: c, reason: collision with root package name */
        final Dg.f f59108c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f59109d;

        /* renamed from: e, reason: collision with root package name */
        final int f59110e;

        /* renamed from: f, reason: collision with root package name */
        final int f59111f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f59112g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f59113h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f59114i;

        /* renamed from: j, reason: collision with root package name */
        Dj.c f59115j;

        /* renamed from: k, reason: collision with root package name */
        Object f59116k;

        /* renamed from: l, reason: collision with root package name */
        int f59117l;

        a(Dj.b bVar, InterfaceC6465b interfaceC6465b, Object obj, int i10) {
            this.f59106a = bVar;
            this.f59107b = interfaceC6465b;
            this.f59116k = obj;
            this.f59110e = i10;
            this.f59111f = i10 - (i10 >> 2);
            Dg.h hVar = new Dg.h(i10);
            this.f59108c = hVar;
            hVar.offer(obj);
            this.f59109d = new AtomicLong();
        }

        @Override // Dj.b
        public void a() {
            if (this.f59113h) {
                return;
            }
            this.f59113h = true;
            c();
        }

        void c() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            Dj.b bVar = this.f59106a;
            Dg.f fVar = this.f59108c;
            int i10 = this.f59111f;
            int i11 = this.f59117l;
            int iAddAndGet = 1;
            do {
                long j10 = this.f59109d.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f59112g) {
                        fVar.clear();
                        return;
                    }
                    boolean z10 = this.f59113h;
                    if (z10 && (th2 = this.f59114i) != null) {
                        fVar.clear();
                        bVar.onError(th2);
                        return;
                    }
                    Object objPoll = fVar.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        bVar.a();
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    bVar.h(objPoll);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.f59115j.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.f59113h) {
                    Throwable th3 = this.f59114i;
                    if (th3 != null) {
                        fVar.clear();
                        bVar.onError(th3);
                        return;
                    } else if (fVar.isEmpty()) {
                        bVar.a();
                        return;
                    }
                }
                if (j11 != 0) {
                    AbstractC8751d.d(this.f59109d, j11);
                }
                this.f59117l = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // Dj.c
        public void cancel() {
            this.f59112g = true;
            this.f59115j.cancel();
            if (getAndIncrement() == 0) {
                this.f59108c.clear();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59113h) {
                return;
            }
            try {
                Object objApply = this.f59107b.apply(this.f59116k, obj);
                Objects.requireNonNull(objApply, "The accumulator returned a null value");
                this.f59116k = objApply;
                this.f59108c.offer(objApply);
                c();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59115j.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59115j, cVar)) {
                this.f59115j = cVar;
                this.f59106a.j(this);
                cVar.request(this.f59110e - 1);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59113h) {
                Eg.a.v(th2);
                return;
            }
            this.f59114i = th2;
            this.f59113h = true;
            c();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f59109d, j10);
                c();
            }
        }
    }

    public k0(gg.i iVar, kg.q qVar, InterfaceC6465b interfaceC6465b) {
        super(iVar);
        this.f59104c = interfaceC6465b;
        this.f59105d = qVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        try {
            Object obj = this.f59105d.get();
            Objects.requireNonNull(obj, "The seed supplied is null");
            this.f58857b.D1(new a(bVar, this.f59104c, obj, gg.i.i()));
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC8669d.error(th2, bVar);
        }
    }
}
