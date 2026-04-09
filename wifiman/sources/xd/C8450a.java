package xd;

import Cd.n;
import P7.c;
import Yg.z;
import b8.EnumC4076c;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.result.b;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import pd.s;
import qd.C7454d;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8450a {

    /* renamed from: a, reason: collision with root package name */
    private final P7.a f65561a;

    /* renamed from: xd.a$a, reason: collision with other inner class name */
    public static final class C2315a extends AbstractC8451b {
    }

    /* renamed from: xd.a$b */
    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f65562a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8450a f65563b;

        public b(Speedtest.d dVar, C8450a c8450a) {
            this.f65562a = dVar;
            this.f65563b = c8450a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            AbstractC5912b abstractC5912bD;
            try {
                Speedtest.f fVarF = this.f65562a.f();
                Speedtest.f.a.c cVar = fVarF instanceof Speedtest.f.a.c ? (Speedtest.f.a.c) fVarF : null;
                if (cVar == null) {
                    throw new IllegalStateException("speedtest must be completed(have result) to be able to report it");
                }
                com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) cVar.c();
                Speedtest.d dVar = this.f65562a;
                if (dVar instanceof C7454d) {
                    abstractC5912bD = this.f65563b.h(bVar);
                } else if (dVar instanceof com.ui.wifiman.model.speedtest.internet.f) {
                    abstractC5912bD = this.f65563b.i(bVar);
                } else if (dVar instanceof n) {
                    abstractC5912bD = this.f65563b.j(bVar);
                } else if (dVar instanceof com.ui.wifiman.model.speedtest.advanced.b) {
                    abstractC5912bD = this.f65563b.g(bVar, (com.ui.wifiman.model.speedtest.advanced.b) dVar);
                } else {
                    abstractC5912bD = AbstractC5912b.D(new IllegalStateException("unknown speedtest state type"));
                    AbstractC6492s.h(abstractC5912bD, "error(...)");
                }
                interfaceC5910A.onSuccess(abstractC5912bD);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: xd.a$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f65564a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC5912b it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: xd.a$d */
    public static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f65565a;

        public d(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f65565a = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object obj;
            Object next;
            try {
                Iterator it = this.f65565a.g().iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((b.c) next).g() == s.LOCAL) {
                            break;
                        }
                    }
                }
                if (next == null) {
                    throw new IllegalStateException("local measurement must be available to report");
                }
                b.c cVar = (b.c) next;
                Iterator it2 = this.f65565a.g().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((b.c) next2).g() == s.CONSOLE) {
                        obj = next2;
                        break;
                    }
                }
                if (obj == null) {
                    throw new IllegalStateException("console measurement must be available to report");
                }
                interfaceC5910A.onSuccess(z.a(cVar, (b.c) obj));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: xd.a$e */
    static final class e implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f65567b;

        e(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f65567b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            b.c cVar = (b.c) sVar.a();
            b.c cVar2 = (b.c) sVar.c();
            return C8450a.this.f65561a.d(new c.k(cVar2.a(), cVar2.h(), cVar.a(), cVar.h(), cVar2.f(), this.f65567b.d()));
        }
    }

    public C8450a(P7.a analytics) {
        AbstractC6492s.i(analytics, "analytics");
        this.f65561a = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b g(com.ui.wifiman.model.speedtest.result.b bVar, com.ui.wifiman.model.speedtest.advanced.b bVar2) {
        gg.z zVarI = gg.z.i(new d(bVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new e(bVar));
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b h(com.ui.wifiman.model.speedtest.result.b bVar) {
        Object next;
        P7.a aVar = this.f65561a;
        Iterator it = bVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b.c) next).g() == s.APP_TO_APP) {
                break;
            }
        }
        if (next == null) {
            throw new IllegalStateException("app2app measurement must be available to report");
        }
        b.c cVar = (b.c) next;
        return aVar.d(new c.n(cVar.c().a(), cVar.a(), cVar.h(), cVar.f(), bVar.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b i(com.ui.wifiman.model.speedtest.result.b bVar) {
        Object next;
        P7.a aVar = this.f65561a;
        Iterator it = bVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b.c) next).g() == s.INTERNET) {
                break;
            }
        }
        if (next == null) {
            throw new IllegalStateException("internet measurement must be available to report");
        }
        b.c cVar = (b.c) next;
        String strA = cVar.c().a();
        Long lA = cVar.a();
        Long lH = cVar.h();
        Integer numF = cVar.f();
        EnumC4076c enumC4076cD = bVar.d();
        b.AbstractC1432b abstractC1432bC = cVar.c();
        AbstractC6492s.g(abstractC1432bC, "null cannot be cast to non-null type com.ui.wifiman.model.speedtest.result.SpeedtestResult.Endpoint.InternetServer");
        return aVar.d(new c.l(strA, ((b.AbstractC1432b.AbstractC1433b) abstractC1432bC).d(), lA, lH, numF, enumC4076cD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b j(com.ui.wifiman.model.speedtest.result.b bVar) {
        Object next;
        P7.a aVar = this.f65561a;
        Iterator it = bVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b.c) next).g() == s.LOCAL) {
                break;
            }
        }
        if (next == null) {
            throw new IllegalStateException("local measurement must be available to report");
        }
        b.c cVar = (b.c) next;
        return aVar.d(new c.m(cVar.c().a(), cVar.a(), cVar.h(), cVar.f(), bVar.d()));
    }

    public gg.z f(Speedtest.d state, C8452c c8452c) {
        AbstractC6492s.i(state, "state");
        gg.z zVarI = gg.z.i(new b(state, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarH0 = zVarI.t(c.f65564a).h0(new C2315a());
        AbstractC6492s.h(zVarH0, "toSingleDefault(...)");
        return zVarH0;
    }
}
