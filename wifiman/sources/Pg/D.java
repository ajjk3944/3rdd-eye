package pg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;

/* loaded from: classes4.dex */
public final class D extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57915a;

    /* renamed from: b, reason: collision with root package name */
    final kg.q f57916b;

    /* renamed from: c, reason: collision with root package name */
    final Object f57917c;

    final class a implements InterfaceC5914d {

        /* renamed from: a, reason: collision with root package name */
        private final gg.B f57918a;

        a(gg.B b10) {
            this.f57918a = b10;
        }

        @Override // gg.InterfaceC5914d
        public void a() {
            Object obj;
            D d10 = D.this;
            kg.q qVar = d10.f57916b;
            if (qVar != null) {
                try {
                    obj = qVar.get();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f57918a.onError(th2);
                    return;
                }
            } else {
                obj = d10.f57917c;
            }
            if (obj == null) {
                this.f57918a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f57918a.onSuccess(obj);
            }
        }

        @Override // gg.InterfaceC5914d
        public void c(InterfaceC6043c interfaceC6043c) {
            this.f57918a.c(interfaceC6043c);
        }

        @Override // gg.InterfaceC5914d
        public void onError(Throwable th2) {
            this.f57918a.onError(th2);
        }
    }

    public D(gg.f fVar, kg.q qVar, Object obj) {
        this.f57915a = fVar;
        this.f57917c = obj;
        this.f57916b = qVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        this.f57915a.e(new a(b10));
    }
}
