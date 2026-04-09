package qg;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class W extends AbstractC7484b {

    static final class a extends AtomicLong implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58819a;

        /* renamed from: b, reason: collision with root package name */
        Dj.c f58820b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58821c;

        a(Dj.b bVar) {
            this.f58819a = bVar;
        }

        @Override // Dj.b
        public void a() {
            if (this.f58821c) {
                return;
            }
            this.f58821c = true;
            this.f58819a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f58820b.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f58821c) {
                return;
            }
            if (get() != 0) {
                this.f58819a.h(obj);
                AbstractC8751d.d(this, 1L);
            } else {
                this.f58820b.cancel();
                onError(MissingBackpressureException.a());
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58820b, cVar)) {
                this.f58820b = cVar;
                this.f58819a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f58821c) {
                Eg.a.v(th2);
            } else {
                this.f58821c = true;
                this.f58819a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }
    }

    public W(gg.i iVar) {
        super(iVar);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar));
    }
}
