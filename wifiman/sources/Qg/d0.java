package qg;

import java.util.concurrent.atomic.AtomicInteger;
import yg.C8671f;

/* loaded from: classes4.dex */
public final class d0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f58933c;

    static final class a extends AtomicInteger implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58934a;

        /* renamed from: b, reason: collision with root package name */
        final C8671f f58935b;

        /* renamed from: c, reason: collision with root package name */
        final Dj.a f58936c;

        /* renamed from: d, reason: collision with root package name */
        long f58937d;

        /* renamed from: e, reason: collision with root package name */
        long f58938e;

        a(Dj.b bVar, long j10, C8671f c8671f, Dj.a aVar) {
            this.f58934a = bVar;
            this.f58935b = c8671f;
            this.f58936c = aVar;
            this.f58937d = j10;
        }

        @Override // Dj.b
        public void a() {
            long j10 = this.f58937d;
            if (j10 != Long.MAX_VALUE) {
                this.f58937d = j10 - 1;
            }
            if (j10 != 0) {
                c();
            } else {
                this.f58934a.a();
            }
        }

        void c() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f58935b.n()) {
                    long j10 = this.f58938e;
                    if (j10 != 0) {
                        this.f58938e = 0L;
                        this.f58935b.p(j10);
                    }
                    this.f58936c.b(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58938e++;
            this.f58934a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            this.f58935b.r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58934a.onError(th2);
        }
    }

    public d0(gg.i iVar, long j10) {
        super(iVar);
        this.f58933c = j10;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        C8671f c8671f = new C8671f(false);
        bVar.j(c8671f);
        long j10 = this.f58933c;
        new a(bVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, c8671f, this.f58857b).c();
    }
}
