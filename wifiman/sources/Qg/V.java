package qg;

import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6469f;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class V extends AbstractC7484b implements InterfaceC6469f {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f58814c;

    static final class a extends AtomicLong implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58815a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC6469f f58816b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f58817c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58818d;

        a(Dj.b bVar, InterfaceC6469f interfaceC6469f) {
            this.f58815a = bVar;
            this.f58816b = interfaceC6469f;
        }

        @Override // Dj.b
        public void a() {
            if (this.f58818d) {
                return;
            }
            this.f58818d = true;
            this.f58815a.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f58817c.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f58818d) {
                return;
            }
            if (get() != 0) {
                this.f58815a.h(obj);
                AbstractC8751d.d(this, 1L);
                return;
            }
            try {
                this.f58816b.accept(obj);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58817c, cVar)) {
                this.f58817c = cVar;
                this.f58815a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f58818d) {
                Eg.a.v(th2);
            } else {
                this.f58818d = true;
                this.f58815a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this, j10);
            }
        }
    }

    public V(gg.i iVar) {
        super(iVar);
        this.f58814c = this;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58814c));
    }

    @Override // kg.InterfaceC6469f
    public void accept(Object obj) {
    }

    public V(gg.i iVar, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f58814c = interfaceC6469f;
    }
}
