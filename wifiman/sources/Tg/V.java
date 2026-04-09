package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import lg.C6595e;

/* loaded from: classes4.dex */
public final class V extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62229b;

    static final class a extends AtomicInteger implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62230a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f62231b;

        /* renamed from: c, reason: collision with root package name */
        final gg.v f62232c;

        /* renamed from: d, reason: collision with root package name */
        long f62233d;

        a(gg.x xVar, long j10, C6595e c6595e, gg.v vVar) {
            this.f62230a = xVar;
            this.f62231b = c6595e;
            this.f62232c = vVar;
            this.f62233d = j10;
        }

        @Override // gg.x
        public void a() {
            long j10 = this.f62233d;
            if (j10 != Long.MAX_VALUE) {
                this.f62233d = j10 - 1;
            }
            if (j10 != 0) {
                d();
            } else {
                this.f62230a.a();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62231b.a(interfaceC6043c);
        }

        void d() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f62231b.isDisposed()) {
                    this.f62232c.d(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62230a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62230a.onError(th2);
        }
    }

    public V(gg.s sVar, long j10) {
        super(sVar);
        this.f62229b = j10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        C6595e c6595e = new C6595e();
        xVar.c(c6595e);
        long j10 = this.f62229b;
        new a(xVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, c6595e, this.f62287a).d();
    }
}
