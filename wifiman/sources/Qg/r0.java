package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class r0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59219c;

    /* renamed from: d, reason: collision with root package name */
    final int f59220d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f59221e;

    static final class a extends AtomicReference implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final b f59222a;

        /* renamed from: b, reason: collision with root package name */
        final long f59223b;

        /* renamed from: c, reason: collision with root package name */
        final int f59224c;

        /* renamed from: d, reason: collision with root package name */
        volatile Dg.g f59225d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f59226e;

        /* renamed from: f, reason: collision with root package name */
        int f59227f;

        a(b bVar, long j10, int i10) {
            this.f59222a = bVar;
            this.f59223b = j10;
            this.f59224c = i10;
        }

        @Override // Dj.b
        public void a() {
            b bVar = this.f59222a;
            if (this.f59223b == bVar.f59239k) {
                this.f59226e = true;
                bVar.d();
            }
        }

        public void c() {
            EnumC8672g.cancel(this);
        }

        public void d(long j10) {
            if (this.f59227f != 1) {
                ((Dj.c) get()).request(j10);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            b bVar = this.f59222a;
            if (this.f59223b == bVar.f59239k) {
                if (this.f59227f != 0 || this.f59225d.offer(obj)) {
                    bVar.d();
                } else {
                    onError(new QueueOverflowException());
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this, cVar)) {
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f59227f = iRequestFusion;
                        this.f59225d = dVar;
                        this.f59226e = true;
                        this.f59222a.d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f59227f = iRequestFusion;
                        this.f59225d = dVar;
                        cVar.request(this.f59224c);
                        return;
                    }
                }
                this.f59225d = new Dg.h(this.f59224c);
                cVar.request(this.f59224c);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            b bVar = this.f59222a;
            if (this.f59223b != bVar.f59239k || !bVar.f59234f.d(th2)) {
                Eg.a.v(th2);
                return;
            }
            if (!bVar.f59232d) {
                bVar.f59236h.cancel();
                bVar.f59233e = true;
            }
            this.f59226e = true;
            bVar.d();
        }
    }

    static final class b extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: l, reason: collision with root package name */
        static final a f59228l;

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59229a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f59230b;

        /* renamed from: c, reason: collision with root package name */
        final int f59231c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f59232d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f59233e;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f59235g;

        /* renamed from: h, reason: collision with root package name */
        Dj.c f59236h;

        /* renamed from: k, reason: collision with root package name */
        volatile long f59239k;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference f59237i = new AtomicReference();

        /* renamed from: j, reason: collision with root package name */
        final AtomicLong f59238j = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final C8750c f59234f = new C8750c();

        static {
            a aVar = new a(null, -1L, 1);
            f59228l = aVar;
            aVar.c();
        }

        b(Dj.b bVar, kg.n nVar, int i10, boolean z10) {
            this.f59229a = bVar;
            this.f59230b = nVar;
            this.f59231c = i10;
            this.f59232d = z10;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59233e) {
                return;
            }
            this.f59233e = true;
            d();
        }

        void c() {
            AtomicReference atomicReference = this.f59237i;
            a aVar = f59228l;
            a aVar2 = (a) atomicReference.getAndSet(aVar);
            if (aVar2 == aVar || aVar2 == null) {
                return;
            }
            aVar2.c();
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f59235g) {
                return;
            }
            this.f59235g = true;
            this.f59236h.cancel();
            c();
            this.f59234f.h();
        }

        void d() {
            boolean z10;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Dj.b bVar = this.f59229a;
            int iAddAndGet = 1;
            while (!this.f59235g) {
                if (this.f59233e) {
                    if (this.f59232d) {
                        if (this.f59237i.get() == null) {
                            this.f59234f.j(bVar);
                            return;
                        }
                    } else if (((Throwable) this.f59234f.get()) != null) {
                        c();
                        this.f59234f.j(bVar);
                        return;
                    } else if (this.f59237i.get() == null) {
                        bVar.a();
                        return;
                    }
                }
                a aVar = (a) this.f59237i.get();
                Dg.g gVar = aVar != null ? aVar.f59225d : null;
                if (gVar != null) {
                    long j10 = this.f59238j.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (!this.f59235g) {
                            boolean z11 = aVar.f59226e;
                            try {
                                objPoll = gVar.poll();
                            } catch (Throwable th2) {
                                AbstractC6152a.b(th2);
                                aVar.c();
                                this.f59234f.g(th2);
                                objPoll = null;
                                z11 = true;
                            }
                            boolean z12 = objPoll == null;
                            if (aVar == this.f59237i.get()) {
                                if (z11) {
                                    if (this.f59232d) {
                                        if (z12) {
                                            r.Y.a(this.f59237i, aVar, null);
                                        }
                                    } else if (((Throwable) this.f59234f.get()) != null) {
                                        this.f59234f.j(bVar);
                                        return;
                                    } else if (z12) {
                                        r.Y.a(this.f59237i, aVar, null);
                                    }
                                }
                                if (z12) {
                                    break;
                                }
                                bVar.h(objPoll);
                                j11++;
                            }
                            z10 = true;
                            break;
                        }
                        return;
                    }
                    z10 = false;
                    if (j11 == j10 && aVar.f59226e) {
                        if (this.f59232d) {
                            if (gVar.isEmpty()) {
                                r.Y.a(this.f59237i, aVar, null);
                            }
                        } else if (((Throwable) this.f59234f.get()) != null) {
                            c();
                            this.f59234f.j(bVar);
                            return;
                        } else if (gVar.isEmpty()) {
                            r.Y.a(this.f59237i, aVar, null);
                        }
                    }
                    if (j11 != 0 && !this.f59235g) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f59238j.addAndGet(-j11);
                        }
                        aVar.d(j11);
                    }
                    if (z10) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            a aVar;
            if (this.f59233e) {
                return;
            }
            long j10 = this.f59239k + 1;
            this.f59239k = j10;
            a aVar2 = (a) this.f59237i.get();
            if (aVar2 != null) {
                aVar2.c();
            }
            try {
                Object objApply = this.f59230b.apply(obj);
                Objects.requireNonNull(objApply, "The publisher returned is null");
                Dj.a aVar3 = (Dj.a) objApply;
                a aVar4 = new a(this, j10, this.f59231c);
                do {
                    aVar = (a) this.f59237i.get();
                    if (aVar == f59228l) {
                        return;
                    }
                } while (!r.Y.a(this.f59237i, aVar, aVar4));
                aVar3.b(aVar4);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59236h.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59236h, cVar)) {
                this.f59236h = cVar;
                this.f59229a.j(this);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59233e || !this.f59234f.d(th2)) {
                Eg.a.v(th2);
                return;
            }
            if (!this.f59232d) {
                c();
            }
            this.f59233e = true;
            d();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f59238j, j10);
                if (this.f59239k == 0) {
                    this.f59236h.request(Long.MAX_VALUE);
                } else {
                    d();
                }
            }
        }
    }

    public r0(gg.i iVar, kg.n nVar, int i10, boolean z10) {
        super(iVar);
        this.f59219c = nVar;
        this.f59220d = i10;
        this.f59221e = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (i0.b(this.f58857b, bVar, this.f59219c)) {
            return;
        }
        this.f58857b.D1(new b(bVar, this.f59219c, this.f59220d, this.f59221e));
    }
}
