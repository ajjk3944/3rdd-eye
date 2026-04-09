package qg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;

/* renamed from: qg.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7490h extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.D f59043c;

    /* renamed from: qg.h$a */
    static final class a extends xg.j implements gg.B {

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference f59044e;

        /* renamed from: f, reason: collision with root package name */
        gg.D f59045f;

        a(Dj.b bVar, gg.D d10) {
            super(bVar);
            this.f59045f = d10;
            this.f59044e = new AtomicReference();
        }

        @Override // Dj.b
        public void a() {
            this.f66090b = EnumC8672g.CANCELLED;
            gg.D d10 = this.f59045f;
            this.f59045f = null;
            d10.a(this);
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f59044e, interfaceC6043c);
        }

        @Override // xg.j, Dj.c
        public void cancel() {
            super.cancel();
            EnumC6592b.dispose(this.f59044e);
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f66092d++;
            this.f66089a.h(obj);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f66089a.onError(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            d(obj);
        }
    }

    public C7490h(gg.i iVar, gg.D d10) {
        super(iVar);
        this.f59043c = d10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59043c));
    }
}
