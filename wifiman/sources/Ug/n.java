package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class n extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final D f63014b;

    /* renamed from: c, reason: collision with root package name */
    final kg.n f63015c;

    static final class a extends AtomicLong implements gg.B, gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f63016a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f63017b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f63018c = new AtomicReference();

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6043c f63019d;

        a(Dj.b bVar, kg.n nVar) {
            this.f63016a = bVar;
            this.f63017b = nVar;
        }

        @Override // Dj.b
        public void a() {
            this.f63016a.a();
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f63019d = interfaceC6043c;
            this.f63016a.j(this);
        }

        @Override // Dj.c
        public void cancel() {
            this.f63019d.dispose();
            EnumC8672g.cancel(this.f63018c);
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f63016a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f63018c, this, cVar);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f63016a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f63017b.apply(obj);
                Objects.requireNonNull(objApply, "the mapper returned a null Publisher");
                Dj.a aVar = (Dj.a) objApply;
                if (this.f63018c.get() != EnumC8672g.CANCELLED) {
                    aVar.b(this);
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f63016a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f63018c, this, j10);
        }
    }

    public n(D d10, kg.n nVar) {
        this.f63014b = d10;
        this.f63015c = nVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f63014b.a(new a(bVar, this.f63015c));
    }
}
