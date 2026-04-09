package qg;

import hg.InterfaceC6043c;
import java.util.NoSuchElementException;
import ng.InterfaceC6941b;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class m0 extends gg.z implements InterfaceC6941b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f59138a;

    /* renamed from: b, reason: collision with root package name */
    final Object f59139b;

    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f59140a;

        /* renamed from: b, reason: collision with root package name */
        final Object f59141b;

        /* renamed from: c, reason: collision with root package name */
        Dj.c f59142c;

        /* renamed from: d, reason: collision with root package name */
        boolean f59143d;

        /* renamed from: e, reason: collision with root package name */
        Object f59144e;

        a(gg.B b10, Object obj) {
            this.f59140a = b10;
            this.f59141b = obj;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59143d) {
                return;
            }
            this.f59143d = true;
            this.f59142c = EnumC8672g.CANCELLED;
            Object obj = this.f59144e;
            this.f59144e = null;
            if (obj == null) {
                obj = this.f59141b;
            }
            if (obj != null) {
                this.f59140a.onSuccess(obj);
            } else {
                this.f59140a.onError(new NoSuchElementException());
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f59142c.cancel();
            this.f59142c = EnumC8672g.CANCELLED;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59143d) {
                return;
            }
            if (this.f59144e == null) {
                this.f59144e = obj;
                return;
            }
            this.f59143d = true;
            this.f59142c.cancel();
            this.f59142c = EnumC8672g.CANCELLED;
            this.f59140a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f59142c == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59142c, cVar)) {
                this.f59142c = cVar;
                this.f59140a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59143d) {
                Eg.a.v(th2);
                return;
            }
            this.f59143d = true;
            this.f59142c = EnumC8672g.CANCELLED;
            this.f59140a.onError(th2);
        }
    }

    public m0(gg.i iVar, Object obj) {
        this.f59138a = iVar;
        this.f59139b = obj;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f59138a.D1(new a(b10, this.f59139b));
    }

    @Override // ng.InterfaceC6941b
    public gg.i f() {
        return Eg.a.o(new l0(this.f59138a, this.f59139b, true));
    }
}
