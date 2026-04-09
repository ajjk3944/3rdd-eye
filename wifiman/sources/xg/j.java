package xg;

import gg.l;
import java.util.concurrent.atomic.AtomicLong;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public abstract class j extends AtomicLong implements l, Dj.c {

    /* renamed from: a, reason: collision with root package name */
    protected final Dj.b f66089a;

    /* renamed from: b, reason: collision with root package name */
    protected Dj.c f66090b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f66091c;

    /* renamed from: d, reason: collision with root package name */
    protected long f66092d;

    public j(Dj.b bVar) {
        this.f66089a = bVar;
    }

    public void cancel() {
        this.f66090b.cancel();
    }

    protected final void d(Object obj) {
        long j10 = this.f66092d;
        if (j10 != 0) {
            AbstractC8751d.d(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                g(obj);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f66089a.h(obj);
                this.f66089a.a();
                return;
            } else {
                this.f66091c = obj;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f66091c = null;
                }
            }
        }
    }

    protected void g(Object obj) {
    }

    @Override // gg.l
    public void j(Dj.c cVar) {
        if (EnumC8672g.validate(this.f66090b, cVar)) {
            this.f66090b = cVar;
            this.f66089a.j(this);
        }
    }

    @Override // Dj.c
    public final void request(long j10) {
        long j11;
        if (EnumC8672g.validate(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f66089a.h(this.f66091c);
                        this.f66089a.a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, AbstractC8751d.c(j11, j10)));
            this.f66090b.request(j10);
        }
    }
}
