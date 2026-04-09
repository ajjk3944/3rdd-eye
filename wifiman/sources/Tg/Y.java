package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import lg.C6595e;

/* loaded from: classes4.dex */
public final class Y extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.p f62270b;

    /* renamed from: c, reason: collision with root package name */
    final long f62271c;

    static final class a extends AtomicInteger implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62272a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f62273b;

        /* renamed from: c, reason: collision with root package name */
        final gg.v f62274c;

        /* renamed from: d, reason: collision with root package name */
        final kg.p f62275d;

        /* renamed from: e, reason: collision with root package name */
        long f62276e;

        a(gg.x xVar, long j10, kg.p pVar, C6595e c6595e, gg.v vVar) {
            this.f62272a = xVar;
            this.f62273b = c6595e;
            this.f62274c = vVar;
            this.f62275d = pVar;
            this.f62276e = j10;
        }

        @Override // gg.x
        public void a() {
            this.f62272a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62273b.a(interfaceC6043c);
        }

        void d() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f62273b.isDisposed()) {
                    this.f62274c.d(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62272a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            long j10 = this.f62276e;
            if (j10 != Long.MAX_VALUE) {
                this.f62276e = j10 - 1;
            }
            if (j10 == 0) {
                this.f62272a.onError(th2);
                return;
            }
            try {
                if (this.f62275d.test(th2)) {
                    d();
                } else {
                    this.f62272a.onError(th2);
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f62272a.onError(new CompositeException(th2, th3));
            }
        }
    }

    public Y(gg.s sVar, long j10, kg.p pVar) {
        super(sVar);
        this.f62270b = pVar;
        this.f62271c = j10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        C6595e c6595e = new C6595e();
        xVar.c(c6595e);
        new a(xVar, this.f62271c, this.f62270b, c6595e, this.f62287a).d();
    }
}
