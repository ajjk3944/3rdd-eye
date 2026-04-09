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
public final class K extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f58728b;

    /* renamed from: c, reason: collision with root package name */
    final long f58729c;

    /* renamed from: d, reason: collision with root package name */
    final long f58730d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f58731e;

    static final class a extends AtomicLong implements Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58732a;

        /* renamed from: b, reason: collision with root package name */
        long f58733b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f58734c = new AtomicReference();

        a(Dj.b bVar) {
            this.f58732a = bVar;
        }

        public void a(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f58734c, interfaceC6043c);
        }

        @Override // Dj.c
        public void cancel() {
            EnumC6592b.dispose(this.f58734c);
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58734c.get() != EnumC6592b.DISPOSED) {
                if (get() != 0) {
                    Dj.b bVar = this.f58732a;
                    long j10 = this.f58733b;
                    this.f58733b = j10 + 1;
                    bVar.h(Long.valueOf(j10));
                    AbstractC8751d.d(this, 1L);
                    return;
                }
                this.f58732a.onError(new MissingBackpressureException("Could not emit value " + this.f58733b + " due to lack of requests"));
                EnumC6592b.dispose(this.f58734c);
            }
        }
    }

    public K(long j10, long j11, TimeUnit timeUnit, gg.y yVar) {
        this.f58729c = j10;
        this.f58730d = j11;
        this.f58731e = timeUnit;
        this.f58728b = yVar;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        gg.y yVar = this.f58728b;
        if (!(yVar instanceof wg.p)) {
            aVar.a(yVar.g(aVar, this.f58729c, this.f58730d, this.f58731e));
            return;
        }
        y.c cVarC = yVar.c();
        aVar.a(cVarC);
        cVarC.d(aVar, this.f58729c, this.f58730d, this.f58731e);
    }
}
