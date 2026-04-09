package qg;

import java.util.concurrent.atomic.AtomicLong;
import yg.EnumC8669d;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class s0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59249c;

    static final class a extends AtomicLong implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59250a;

        /* renamed from: b, reason: collision with root package name */
        long f59251b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59252c;

        a(Dj.b bVar, long j10) {
            this.f59250a = bVar;
            this.f59251b = j10;
            lazySet(j10);
        }

        @Override // Dj.b
        public void a() {
            if (this.f59251b > 0) {
                this.f59251b = 0L;
                this.f59250a.a();
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f59252c.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = this.f59251b;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.f59251b = j11;
                this.f59250a.h(obj);
                if (j11 == 0) {
                    this.f59252c.cancel();
                    this.f59250a.a();
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59252c, cVar)) {
                if (this.f59251b == 0) {
                    cVar.cancel();
                    EnumC8669d.complete(this.f59250a);
                } else {
                    this.f59252c = cVar;
                    this.f59250a.j(this);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59251b <= 0) {
                Eg.a.v(th2);
            } else {
                this.f59251b = 0L;
                this.f59250a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            long j11;
            long jMin;
            if (EnumC8672g.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    } else {
                        jMin = Math.min(j11, j10);
                    }
                } while (!compareAndSet(j11, j11 - jMin));
                this.f59252c.request(jMin);
            }
        }
    }

    public s0(gg.i iVar, long j10) {
        super(iVar);
        this.f59249c = j10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59249c));
    }
}
