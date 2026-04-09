package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import lg.C6595e;

/* loaded from: classes4.dex */
public final class Q extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62194b;

    static final class a implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62195a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62196b;

        /* renamed from: c, reason: collision with root package name */
        final C6595e f62197c = new C6595e();

        /* renamed from: d, reason: collision with root package name */
        boolean f62198d;

        /* renamed from: e, reason: collision with root package name */
        boolean f62199e;

        a(gg.x xVar, kg.n nVar) {
            this.f62195a = xVar;
            this.f62196b = nVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62199e) {
                return;
            }
            this.f62199e = true;
            this.f62198d = true;
            this.f62195a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f62197c.a(interfaceC6043c);
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62199e) {
                return;
            }
            this.f62195a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62198d) {
                if (this.f62199e) {
                    Eg.a.v(th2);
                    return;
                } else {
                    this.f62195a.onError(th2);
                    return;
                }
            }
            this.f62198d = true;
            try {
                gg.v vVar = (gg.v) this.f62196b.apply(th2);
                if (vVar != null) {
                    vVar.d(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f62195a.onError(nullPointerException);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f62195a.onError(new CompositeException(th2, th3));
            }
        }
    }

    public Q(gg.v vVar, kg.n nVar) {
        super(vVar);
        this.f62194b = nVar;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar, this.f62194b);
        xVar.c(aVar.f62197c);
        this.f62287a.d(aVar);
    }
}
