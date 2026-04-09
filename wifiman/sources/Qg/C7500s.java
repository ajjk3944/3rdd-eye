package qg;

import hg.InterfaceC6043c;
import java.util.NoSuchElementException;
import ng.InterfaceC6941b;
import yg.EnumC8672g;

/* renamed from: qg.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7500s extends gg.z implements InterfaceC6941b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f59240a;

    /* renamed from: b, reason: collision with root package name */
    final long f59241b;

    /* renamed from: c, reason: collision with root package name */
    final Object f59242c;

    /* renamed from: qg.s$a */
    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f59243a;

        /* renamed from: b, reason: collision with root package name */
        final long f59244b;

        /* renamed from: c, reason: collision with root package name */
        final Object f59245c;

        /* renamed from: d, reason: collision with root package name */
        Dj.c f59246d;

        /* renamed from: e, reason: collision with root package name */
        long f59247e;

        /* renamed from: f, reason: collision with root package name */
        boolean f59248f;

        a(gg.B b10, long j10, Object obj) {
            this.f59243a = b10;
            this.f59244b = j10;
            this.f59245c = obj;
        }

        @Override // Dj.b
        public void a() {
            this.f59246d = EnumC8672g.CANCELLED;
            if (this.f59248f) {
                return;
            }
            this.f59248f = true;
            Object obj = this.f59245c;
            if (obj != null) {
                this.f59243a.onSuccess(obj);
            } else {
                this.f59243a.onError(new NoSuchElementException());
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f59246d.cancel();
            this.f59246d = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59248f) {
                return;
            }
            long j10 = this.f59247e;
            if (j10 != this.f59244b) {
                this.f59247e = j10 + 1;
                return;
            }
            this.f59248f = true;
            this.f59246d.cancel();
            this.f59246d = EnumC8672g.CANCELLED;
            this.f59243a.onSuccess(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f59246d == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59246d, cVar)) {
                this.f59246d = cVar;
                this.f59243a.c(this);
                cVar.request(this.f59244b + 1);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59248f) {
                Eg.a.v(th2);
                return;
            }
            this.f59248f = true;
            this.f59246d = EnumC8672g.CANCELLED;
            this.f59243a.onError(th2);
        }
    }

    public C7500s(gg.i iVar, long j10, Object obj) {
        this.f59240a = iVar;
        this.f59241b = j10;
        this.f59242c = obj;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f59240a.D1(new a(b10, this.f59241b, this.f59242c));
    }

    @Override // ng.InterfaceC6941b
    public gg.i f() {
        return Eg.a.o(new C7499q(this.f59240a, this.f59241b, this.f59242c, true));
    }
}
