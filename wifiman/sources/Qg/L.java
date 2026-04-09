package qg;

import gg.y;
import hg.InterfaceC6043c;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class L extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f58735b;

    /* renamed from: c, reason: collision with root package name */
    final long f58736c;

    /* renamed from: d, reason: collision with root package name */
    final long f58737d;

    /* renamed from: e, reason: collision with root package name */
    final long f58738e;

    /* renamed from: f, reason: collision with root package name */
    final long f58739f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f58740g;

    static final class a extends AtomicLong implements Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58741a;

        /* renamed from: b, reason: collision with root package name */
        final long f58742b;

        /* renamed from: c, reason: collision with root package name */
        long f58743c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference f58744d = new AtomicReference();

        a(Dj.b bVar, long j10, long j11) {
            this.f58741a = bVar;
            this.f58743c = j10;
            this.f58742b = j11;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f58744d, interfaceC6043c);
        }

        @Override // Dj.c
        public void cancel() {
            EnumC6592b.dispose(this.f58744d);
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f58744d.get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj != enumC6592b) {
                long j10 = get();
                if (j10 == 0) {
                    this.f58741a.onError(new MissingBackpressureException("Could not emit value " + this.f58743c + " due to lack of requests"));
                    EnumC6592b.dispose(this.f58744d);
                    return;
                }
                long j11 = this.f58743c;
                this.f58741a.h(Long.valueOf(j11));
                if (j11 == this.f58742b) {
                    if (this.f58744d.get() != enumC6592b) {
                        this.f58741a.a();
                    }
                    EnumC6592b.dispose(this.f58744d);
                } else {
                    this.f58743c = j11 + 1;
                    if (j10 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    public L(long j10, long j11, long j12, long j13, TimeUnit timeUnit, gg.y yVar) {
        this.f58738e = j12;
        this.f58739f = j13;
        this.f58740g = timeUnit;
        this.f58735b = yVar;
        this.f58736c = j10;
        this.f58737d = j11;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        a aVar = new a(bVar, this.f58736c, this.f58737d);
        bVar.j(aVar);
        gg.y yVar = this.f58735b;
        if (!(yVar instanceof wg.p)) {
            aVar.a(yVar.g(aVar, this.f58738e, this.f58739f, this.f58740g));
            return;
        }
        y.c cVarC = yVar.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f58738e, this.f58739f, this.f58740g);
    }
}
