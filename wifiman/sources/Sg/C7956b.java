package sg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;

/* renamed from: sg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7956b extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.f f61500b;

    /* renamed from: c, reason: collision with root package name */
    final Dj.a f61501c;

    /* renamed from: sg.b$a */
    static final class a extends AtomicReference implements gg.l, InterfaceC5914d, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f61502a;

        /* renamed from: b, reason: collision with root package name */
        Dj.a f61503b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC6043c f61504c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f61505d = new AtomicLong();

        a(Dj.b bVar, Dj.a aVar) {
            this.f61502a = bVar;
            this.f61503b = aVar;
        }

        @Override // Dj.b
        public void a() {
            Dj.a aVar = this.f61503b;
            if (aVar == null) {
                this.f61502a.a();
            } else {
                this.f61503b = null;
                aVar.b(this);
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f61504c, interfaceC6043c)) {
                this.f61504c = interfaceC6043c;
                this.f61502a.j(this);
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f61504c.dispose();
            EnumC8672g.cancel(this);
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f61502a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this, this.f61505d, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f61502a.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this, this.f61505d, j10);
        }
    }

    public C7956b(gg.f fVar, Dj.a aVar) {
        this.f61500b = fVar;
        this.f61501c = aVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f61500b.e(new a(bVar, this.f61501c));
    }
}
