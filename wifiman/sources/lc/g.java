package lc;

import android.content.Intent;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import gg.z;
import kg.InterfaceC6469f;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import lc.InterfaceC6573d;

/* loaded from: classes4.dex */
public final class g implements e, InterfaceC6573d {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.c f52529a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f52530b;

    /* renamed from: c, reason: collision with root package name */
    private final i f52531c;

    /* renamed from: d, reason: collision with root package name */
    private final i f52532d;

    public static final class a implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6570a f52534b;

        public a(C6570a c6570a) {
            this.f52534b = c6570a;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                g.this.f52529a.h(g.this.h(this.f52534b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6570a f52535a;

        b(C6570a c6570a) {
            this.f52535a = c6570a;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(C6572c it) {
            AbstractC6492s.i(it, "it");
            return AbstractC6571b.b(this.f52535a.a(), it.b());
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f52536a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6573d.a aVar) {
            Z7.b.h("Start Activity For result request " + aVar.b() + " fired", null, 2, null);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f52537a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6572c c6572c) {
            Z7.b.h("Start Activity For result Result " + AbstractC6571b.d(c6572c.b()) + " received", null, 2, null);
        }
    }

    public g() {
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f52529a = cVarJ2;
        Fg.a aVarJ2 = Fg.a.j2();
        AbstractC6492s.h(aVarJ2, "create(...)");
        this.f52530b = aVarJ2;
        i iVarI2 = cVarJ2.e1().X0(Gg.a.a()).f0(c.f52536a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f52531c = iVarI2;
        i iVarI22 = aVarJ2.e1().X0(Gg.a.a()).f0(d.f52537a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f52532d = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6573d.a h(C6570a c6570a) {
        return new InterfaceC6573d.a(c6570a.a(), c6570a.b());
    }

    @Override // lc.e
    public z a(C6570a request) {
        AbstractC6492s.i(request, "request");
        z zVarO0 = b().U0(g(request)).m0(new b(request)).o0();
        AbstractC6492s.h(zVarO0, "firstOrError(...)");
        return zVarO0;
    }

    @Override // lc.e
    public i b() {
        return this.f52532d;
    }

    @Override // lc.InterfaceC6573d
    public void c(int i10, int i11, Intent intent) {
        this.f52530b.h(new C6572c(AbstractC6571b.a(i10), i11, intent, null));
    }

    @Override // lc.InterfaceC6573d
    public i d() {
        return this.f52531c;
    }

    public AbstractC5912b g(C6570a request) {
        AbstractC6492s.i(request, "request");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(request));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
