package yg;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import zg.AbstractC8751d;

/* renamed from: yg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8671f extends AtomicInteger implements Dj.c {

    /* renamed from: a, reason: collision with root package name */
    Dj.c f66770a;

    /* renamed from: b, reason: collision with root package name */
    long f66771b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f66772c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f66773d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    final AtomicLong f66774e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    final boolean f66775f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f66776g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f66777h;

    public C8671f(boolean z10) {
        this.f66775f = z10;
    }

    final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        l();
    }

    public void cancel() {
        if (this.f66776g) {
            return;
        }
        this.f66776g = true;
        c();
    }

    final void l() {
        int iAddAndGet = 1;
        long jC = 0;
        Dj.c cVar = null;
        do {
            Dj.c cVar2 = (Dj.c) this.f66772c.get();
            if (cVar2 != null) {
                cVar2 = (Dj.c) this.f66772c.getAndSet(null);
            }
            long andSet = this.f66773d.get();
            if (andSet != 0) {
                andSet = this.f66773d.getAndSet(0L);
            }
            long andSet2 = this.f66774e.get();
            if (andSet2 != 0) {
                andSet2 = this.f66774e.getAndSet(0L);
            }
            Dj.c cVar3 = this.f66770a;
            if (this.f66776g) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f66770a = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long jC2 = this.f66771b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = AbstractC8751d.c(jC2, andSet);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet2;
                        if (jC2 < 0) {
                            EnumC8672g.reportMoreProduced(jC2);
                            jC2 = 0;
                        }
                    }
                    this.f66771b = jC2;
                }
                if (cVar2 != null) {
                    if (cVar3 != null && this.f66775f) {
                        cVar3.cancel();
                    }
                    this.f66770a = cVar2;
                    if (jC2 != 0) {
                        jC = AbstractC8751d.c(jC, jC2);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && andSet != 0) {
                    jC = AbstractC8751d.c(jC, andSet);
                    cVar = cVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            cVar.request(jC);
        }
    }

    public final boolean n() {
        return this.f66776g;
    }

    public final boolean o() {
        return this.f66777h;
    }

    public final void p(long j10) {
        if (this.f66777h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC8751d.a(this.f66774e, j10);
            c();
            return;
        }
        long j11 = this.f66771b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                EnumC8672g.reportMoreProduced(j12);
                j12 = 0;
            }
            this.f66771b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        l();
    }

    public final void r(Dj.c cVar) {
        if (this.f66776g) {
            cVar.cancel();
            return;
        }
        Objects.requireNonNull(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Dj.c cVar2 = (Dj.c) this.f66772c.getAndSet(cVar);
            if (cVar2 != null && this.f66775f) {
                cVar2.cancel();
            }
            c();
            return;
        }
        Dj.c cVar3 = this.f66770a;
        if (cVar3 != null && this.f66775f) {
            cVar3.cancel();
        }
        this.f66770a = cVar;
        long j10 = this.f66771b;
        if (decrementAndGet() != 0) {
            l();
        }
        if (j10 != 0) {
            cVar.request(j10);
        }
    }

    @Override // Dj.c
    public final void request(long j10) {
        if (!EnumC8672g.validate(j10) || this.f66777h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC8751d.a(this.f66773d, j10);
            c();
            return;
        }
        long j11 = this.f66771b;
        if (j11 != Long.MAX_VALUE) {
            long jC = AbstractC8751d.c(j11, j10);
            this.f66771b = jC;
            if (jC == Long.MAX_VALUE) {
                this.f66777h = true;
            }
        }
        Dj.c cVar = this.f66770a;
        if (decrementAndGet() != 0) {
            l();
        }
        if (cVar != null) {
            cVar.request(j10);
        }
    }
}
