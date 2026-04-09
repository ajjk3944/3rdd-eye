package yd;

import Cd.j;
import Rc.a;
import Tc.a;
import Vd.c;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.result.b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jd.InterfaceC6293b;
import je.u;
import kd.C6455e;
import kd.InterfaceC6454d;
import ke.AbstractC6456a;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import qd.C7454d;
import wd.InterfaceC8330f;
import yd.C8653b;
import zi.AbstractC8783m;

/* renamed from: yd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8653b implements InterfaceC8652a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wifiman.model.speedtest.result.e f66679a;

    /* renamed from: b, reason: collision with root package name */
    private final Zc.f f66680b;

    /* renamed from: c, reason: collision with root package name */
    private final u f66681c;

    /* renamed from: d, reason: collision with root package name */
    private final Cc.n f66682d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6293b f66683e;

    /* renamed from: f, reason: collision with root package name */
    private final Dc.e f66684f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6586g f66685g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f66686h;

    /* renamed from: yd.b$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cd.n f66687a;

        a(Cd.n nVar) {
            this.f66687a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.AbstractC1432b.c apply(Map results) {
            Object next;
            a.C0794a c0794aL;
            AbstractC6492s.i(results, "results");
            Collection collectionValues = results.values();
            Cd.n nVar = this.f66687a;
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((Dc.j) next).y(), nVar.o().a().toString())) {
                    break;
                }
            }
            Dc.j jVar = (Dc.j) next;
            String string = this.f66687a.o().a().toString();
            AbstractC6492s.h(string, "toString(...)");
            return new b.AbstractC1432b.c(string, jVar != null ? jVar.getName() : null, (jVar == null || (c0794aL = jVar.L()) == null) ? null : c0794aL.j(), jVar != null ? jVar.f() : null, jVar != null ? jVar.b() : null, jVar != null ? jVar.N() : null);
        }
    }

    /* renamed from: yd.b$b, reason: collision with other inner class name */
    static final class C2365b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f66688a;

        C2365b(C7454d c7454d) {
            this.f66688a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.AbstractC1432b.a apply(Map results) {
            Object next;
            String strC;
            a.C0703a c0703aK;
            a.C0794a c0794aL;
            AbstractC6492s.i(results, "results");
            Collection collectionValues = results.values();
            C7454d c7454d = this.f66688a;
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((Dc.j) next).y(), c7454d.o().a().toString())) {
                    break;
                }
            }
            Dc.j jVar = (Dc.j) next;
            String string = this.f66688a.o().a().toString();
            AbstractC6492s.h(string, "toString(...)");
            if (jVar == null || (strC = jVar.getName()) == null) {
                strC = this.f66688a.o().c();
            }
            return new b.AbstractC1432b.a(string, strC, (jVar == null || (c0794aL = jVar.L()) == null) ? null : c0794aL.j(), jVar != null ? jVar.f() : null, jVar != null ? jVar.b() : null, jVar != null ? jVar.N() : null, (jVar == null || (c0703aK = jVar.K()) == null) ? null : c0703aK.k());
        }
    }

    /* renamed from: yd.b$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f66689a;

        c(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f66689a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Map results) {
            Object next;
            a.C0794a c0794aL;
            AbstractC6492s.i(results, "results");
            Iterator it = results.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Dc.j) next).C() != null) {
                    break;
                }
            }
            Dc.j jVar = (Dc.j) next;
            String strA0 = this.f66689a.u().b().a0();
            AbstractC6492s.h(strA0, "toNormalizedString(...)");
            return new C6556a(new b.AbstractC1432b.c(strA0, jVar != null ? jVar.getName() : null, (jVar == null || (c0794aL = jVar.L()) == null) ? null : c0794aL.j(), jVar != null ? jVar.f() : null, jVar != null ? jVar.b() : null, jVar != null ? jVar.N() : null));
        }
    }

    /* renamed from: yd.b$d */
    public static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f66690a;

        public d(Speedtest.d dVar) {
            this.f66690a = dVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(this.f66690a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: yd.b$e */
    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Speedtest.d it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof C7454d) {
                return C8653b.this.s((C7454d) it);
            }
            if (it instanceof com.ui.wifiman.model.speedtest.internet.f) {
                return C8653b.this.r((com.ui.wifiman.model.speedtest.internet.f) it);
            }
            if (it instanceof Cd.n) {
                return C8653b.this.p((Cd.n) it);
            }
            if (it instanceof com.ui.wifiman.model.speedtest.advanced.b) {
                return C8653b.this.q((com.ui.wifiman.model.speedtest.advanced.b) it);
            }
            z zVarP = z.p(new IllegalStateException("unknown speedtest state type"));
            AbstractC6492s.h(zVarP, "error(...)");
            return zVarP;
        }
    }

    /* renamed from: yd.b$f */
    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f66692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8653b f66693b;

        f(com.ui.wifiman.model.speedtest.internet.f fVar, C8653b c8653b) {
            this.f66692a = fVar;
            this.f66693b = c8653b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.AbstractC1432b.AbstractC1433b apply(C6556a c6556a) {
            URL urlA;
            List listL;
            URL urlA2;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6455e c6455e = (C6455e) c6556a.a();
            InternetSpeedtest.b bVarA = com.ui.wifiman.model.speedtest.internet.g.a(this.f66692a);
            if (bVarA == null) {
                throw new IllegalStateException("main server must already be available when reporting result");
            }
            String string = null;
            if (!(bVarA instanceof InternetSpeedtest.b.C1420b)) {
                if (!(bVarA instanceof InternetSpeedtest.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InternetSpeedtest.b.a aVar = (InternetSpeedtest.b.a) bVarA;
                String strC = aVar.c();
                String strD = aVar.d();
                if (strD == null) {
                    throw new IllegalStateException("url must be not null here since test could never start");
                }
                String strB = c6455e != null ? c6455e.b() : null;
                if (c6455e != null && (urlA = c6455e.a()) != null) {
                    string = urlA.toString();
                }
                return new b.AbstractC1432b.AbstractC1433b.a(strC, strD, strB, string);
            }
            b.AbstractC1432b.AbstractC1433b.C1434b.Provider providerI = this.f66693b.i((InternetSpeedtest.b.C1420b) bVarA);
            List<InternetSpeedtest.b> listB = com.ui.wifiman.model.speedtest.internet.g.b(this.f66692a);
            if (listB != null) {
                C8653b c8653b = this.f66693b;
                listL = new ArrayList();
                for (InternetSpeedtest.b bVar : listB) {
                    InternetSpeedtest.b.C1420b c1420b = bVar instanceof InternetSpeedtest.b.C1420b ? (InternetSpeedtest.b.C1420b) bVar : null;
                    b.AbstractC1432b.AbstractC1433b.C1434b.Provider providerI2 = c1420b != null ? c8653b.i(c1420b) : null;
                    if (providerI2 != null) {
                        listL.add(providerI2);
                    }
                }
            } else {
                listL = AbstractC3689v.l();
            }
            String strB2 = c6455e != null ? c6455e.b() : null;
            if (c6455e != null && (urlA2 = c6455e.a()) != null) {
                string = urlA2.toString();
            }
            return new b.AbstractC1432b.AbstractC1433b.C1434b(providerI, listL, strB2, string);
        }
    }

    /* renamed from: yd.b$g */
    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f66694a;

        g(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f66694a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.AbstractC1432b apply(C6556a c6556a) {
            URL urlA;
            AbstractC6492s.i(c6556a, "<destruct>");
            C6455e c6455e = (C6455e) c6556a.a();
            c.a aVarW = this.f66694a.w();
            if (aVarW == null) {
                throw new IllegalStateException("main server must already be available when reporting result");
            }
            b.AbstractC1432b.AbstractC1433b.C1434b.Provider provider = new b.AbstractC1432b.AbstractC1433b.C1434b.Provider(aVarW.c(), aVarW.d(), aVarW.b(), aVarW.a(), "");
            List listL = AbstractC3689v.l();
            String string = null;
            String strB = c6455e != null ? c6455e.b() : null;
            if (c6455e != null && (urlA = c6455e.a()) != null) {
                string = urlA.toString();
            }
            return new b.AbstractC1432b.AbstractC1433b.C1434b(provider, listL, strB, string);
        }
    }

    /* renamed from: yd.b$h */
    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f66695a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it.b());
        }
    }

    /* renamed from: yd.b$i */
    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.internet.f f66696a;

        i(com.ui.wifiman.model.speedtest.internet.f fVar) {
            this.f66696a = fVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b.AbstractC1432b.AbstractC1433b internetEndpoint) {
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayListB;
            ArrayList arrayListB2;
            AbstractC6492s.i(internetEndpoint, "internetEndpoint");
            pd.s sVar = pd.s.INTERNET;
            Integer numD = com.ui.wifiman.model.speedtest.internet.g.d(this.f66696a);
            Integer numC = com.ui.wifiman.model.speedtest.internet.g.c(this.f66696a);
            if (this.f66696a.a() instanceof Speedtest.f.a.b) {
                lValueOf = null;
            } else {
                Object objB = this.f66696a.a().b();
                if (objB == null) {
                    throw new IllegalStateException("download must be ended at this point");
                }
                lValueOf = Long.valueOf(((Speedtest.a) objB).a());
            }
            if (this.f66696a.i() instanceof Speedtest.f.a.b) {
                lValueOf2 = null;
            } else {
                Object objB2 = this.f66696a.i().b();
                if (objB2 == null) {
                    throw new IllegalStateException("upload must be ended at this point");
                }
                lValueOf2 = Long.valueOf(((Speedtest.a) objB2).a());
            }
            if (this.f66696a.a() instanceof Speedtest.f.a.b) {
                arrayListB = null;
            } else {
                Object objB3 = this.f66696a.a().b();
                Speedtest.a.C1416a c1416a = objB3 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB3 : null;
                if (c1416a == null) {
                    throw new IllegalStateException("download must be finished at this point");
                }
                arrayListB = c1416a.b();
            }
            if (this.f66696a.i() instanceof Speedtest.f.a.b) {
                arrayListB2 = null;
            } else {
                Object objB4 = this.f66696a.i().b();
                Speedtest.a.C1416a c1416a2 = objB4 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB4 : null;
                if (c1416a2 == null) {
                    throw new IllegalStateException("upload must be finished at this point");
                }
                arrayListB2 = c1416a2.b();
            }
            return AbstractC3689v.e(new b.c(null, sVar, internetEndpoint, numD, numC, lValueOf, arrayListB, lValueOf2, arrayListB2, 1, null));
        }
    }

    /* renamed from: yd.b$j */
    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cd.n f66697a;

        j(Cd.n nVar) {
            this.f66697a = nVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b.AbstractC1432b.c endpoint) {
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayListB;
            ArrayList arrayListB2;
            AbstractC6492s.i(endpoint, "endpoint");
            pd.s sVar = pd.s.LOCAL;
            Integer numD = com.ui.wifiman.model.speedtest.internet.g.d(this.f66697a);
            Integer numC = com.ui.wifiman.model.speedtest.internet.g.c(this.f66697a);
            if (this.f66697a.a() instanceof Speedtest.f.a.b) {
                lValueOf = null;
            } else {
                Object objB = this.f66697a.a().b();
                if (objB == null) {
                    throw new IllegalStateException("download must be ended at this point");
                }
                lValueOf = Long.valueOf(((Speedtest.a) objB).a());
            }
            if (this.f66697a.i() instanceof Speedtest.f.a.b) {
                lValueOf2 = null;
            } else {
                Object objB2 = this.f66697a.i().b();
                if (objB2 == null) {
                    throw new IllegalStateException("upload must be ended at this point");
                }
                lValueOf2 = Long.valueOf(((Speedtest.a) objB2).a());
            }
            if (this.f66697a.a() instanceof Speedtest.f.a.b) {
                arrayListB = null;
            } else {
                Object objB3 = this.f66697a.a().b();
                Speedtest.a.C1416a c1416a = objB3 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB3 : null;
                if (c1416a == null) {
                    throw new IllegalStateException("download must be finished at this point");
                }
                arrayListB = c1416a.b();
            }
            if (this.f66697a.i() instanceof Speedtest.f.a.b) {
                arrayListB2 = null;
            } else {
                Object objB4 = this.f66697a.i().b();
                Speedtest.a.C1416a c1416a2 = objB4 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB4 : null;
                if (c1416a2 == null) {
                    throw new IllegalStateException("upload must be finished at this point");
                }
                arrayListB2 = c1416a2.b();
            }
            return AbstractC3689v.e(new b.c(null, sVar, endpoint, numD, numC, lValueOf, arrayListB, lValueOf2, arrayListB2, 1, null));
        }
    }

    /* renamed from: yd.b$k */
    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7454d f66698a;

        k(C7454d c7454d) {
            this.f66698a = c7454d;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b.AbstractC1432b.a endpoint) {
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayListB;
            ArrayList arrayListB2;
            AbstractC6492s.i(endpoint, "endpoint");
            pd.s sVar = pd.s.APP_TO_APP;
            Integer numD = com.ui.wifiman.model.speedtest.internet.g.d(this.f66698a);
            Integer numC = com.ui.wifiman.model.speedtest.internet.g.c(this.f66698a);
            if (this.f66698a.a() instanceof Speedtest.f.a.b) {
                lValueOf = null;
            } else {
                Object objB = this.f66698a.a().b();
                if (objB == null) {
                    throw new IllegalStateException("download must be ended at this point");
                }
                lValueOf = Long.valueOf(((Speedtest.a) objB).a());
            }
            if (this.f66698a.i() instanceof Speedtest.f.a.b) {
                lValueOf2 = null;
            } else {
                Object objB2 = this.f66698a.i().b();
                if (objB2 == null) {
                    throw new IllegalStateException("upload must be ended at this point");
                }
                lValueOf2 = Long.valueOf(((Speedtest.a) objB2).a());
            }
            if (this.f66698a.a() instanceof Speedtest.f.a.b) {
                arrayListB = null;
            } else {
                Object objB3 = this.f66698a.a().b();
                Speedtest.a.C1416a c1416a = objB3 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB3 : null;
                if (c1416a == null) {
                    throw new IllegalStateException("download must be finished at this point");
                }
                arrayListB = c1416a.b();
            }
            if (this.f66698a.i() instanceof Speedtest.f.a.b) {
                arrayListB2 = null;
            } else {
                Object objB4 = this.f66698a.i().b();
                Speedtest.a.C1416a c1416a2 = objB4 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB4 : null;
                if (c1416a2 == null) {
                    throw new IllegalStateException("upload must be finished at this point");
                }
                arrayListB2 = c1416a2.b();
            }
            return AbstractC3689v.e(new b.c(null, sVar, endpoint, numD, numC, lValueOf, arrayListB, lValueOf2, arrayListB2, 1, null));
        }
    }

    /* renamed from: yd.b$l */
    static final class l implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f66699a;

        l(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f66699a = bVar;
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b.AbstractC1432b internetEndpoint, C6556a c6556a) {
            Long lValueOf;
            Long lValueOf2;
            ArrayList arrayListB;
            ArrayList arrayListB2;
            Long lValueOf3;
            Long lValueOf4;
            AbstractC6492s.i(internetEndpoint, "internetEndpoint");
            AbstractC6492s.i(c6556a, "<destruct>");
            b.AbstractC1432b.c cVar = (b.AbstractC1432b.c) c6556a.a();
            ArrayList arrayList = new ArrayList();
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f66699a;
            pd.s sVar = pd.s.LOCAL;
            j.d dVar = (j.d) bVar.t().b();
            Integer numValueOf = dVar != null ? Integer.valueOf(dVar.b()) : null;
            j.d dVar2 = (j.d) bVar.t().b();
            Integer numA = dVar2 != null ? dVar2.a() : null;
            if (cVar == null) {
                throw new IllegalStateException("failed to obtain gateway endpoint");
            }
            if (bVar.a() instanceof Speedtest.f.a.b) {
                lValueOf = null;
            } else {
                Object objB = bVar.a().b();
                if (objB == null) {
                    throw new IllegalStateException("download must be ended at this point");
                }
                lValueOf = Long.valueOf(((Speedtest.a) objB).a());
            }
            if (bVar.i() instanceof Speedtest.f.a.b) {
                lValueOf2 = null;
            } else {
                Object objB2 = bVar.i().b();
                if (objB2 == null) {
                    throw new IllegalStateException("upload must be ended at this point");
                }
                lValueOf2 = Long.valueOf(((Speedtest.a) objB2).a());
            }
            if (bVar.a() instanceof Speedtest.f.a.b) {
                arrayListB = null;
            } else {
                Object objB3 = bVar.a().b();
                Speedtest.a.C1416a c1416a = objB3 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB3 : null;
                if (c1416a == null) {
                    throw new IllegalStateException("download must be finished at this point");
                }
                arrayListB = c1416a.b();
            }
            if (bVar.i() instanceof Speedtest.f.a.b) {
                arrayListB2 = null;
            } else {
                Object objB4 = bVar.i().b();
                Speedtest.a.C1416a c1416a2 = objB4 instanceof Speedtest.a.C1416a ? (Speedtest.a.C1416a) objB4 : null;
                if (c1416a2 == null) {
                    throw new IllegalStateException("upload must be finished at this point");
                }
                arrayListB2 = c1416a2.b();
            }
            arrayList.add(new b.c(null, sVar, cVar, numValueOf, numA, lValueOf, arrayListB, lValueOf2, arrayListB2, 1, null));
            pd.s sVar2 = pd.s.CONSOLE;
            Integer num = (Integer) bVar.o().b();
            Integer num2 = (Integer) bVar.n().b();
            if (bVar.l() instanceof Speedtest.f.a.b) {
                lValueOf3 = null;
            } else {
                Object objB5 = bVar.l().b();
                if (objB5 == null) {
                    throw new IllegalStateException("console download must be ended at this point");
                }
                lValueOf3 = Long.valueOf(((Speedtest.a) objB5).a());
            }
            if (bVar.p() instanceof Speedtest.f.a.b) {
                lValueOf4 = null;
            } else {
                Object objB6 = bVar.p().b();
                if (objB6 == null) {
                    throw new IllegalStateException("console upload must be ended at this point");
                }
                lValueOf4 = Long.valueOf(((Speedtest.a) objB6).a());
            }
            arrayList.add(new b.c(null, sVar2, internetEndpoint, num, num2, lValueOf3, null, lValueOf4, null, 1, null));
            return arrayList;
        }
    }

    /* renamed from: yd.b$m */
    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f66700a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Cc.j it) {
            AbstractC6492s.i(it, "it");
            Dc.j jVarJ = it.j();
            return new C6556a(jVarJ != null ? jVarJ.N() : null);
        }
    }

    /* renamed from: yd.b$n */
    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f66701a = new n();

        /* renamed from: yd.b$n$a */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((C6588i) obj2).f().a(), ((C6588i) obj).f().a());
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(C6588i it) {
            AbstractC6492s.i(it, "it");
            return it.m() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List signals) {
            AbstractC6492s.i(signals, "signals");
            return new C6556a(AbstractC8783m.G(AbstractC8783m.T(AbstractC8783m.C(AbstractC3689v.d0(signals), new InterfaceC6835l() { // from class: yd.c
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C8653b.n.c((C6588i) obj));
                }
            }), new a())));
        }
    }

    /* renamed from: yd.b$o */
    static final class o implements kg.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W7.b f66702a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f66703b;

        o(W7.b bVar, Speedtest.d dVar) {
            this.f66702a = bVar;
            this.f66703b = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
        @Override // kg.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.ui.wifiman.model.speedtest.result.b a(java.util.List r26, Zc.e r27, je.AbstractC6317r r28, l9.C6556a r29, l9.C6556a r30, l9.C6556a r31) {
            /*
                Method dump skipped, instructions count: 345
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yd.C8653b.o.a(java.util.List, Zc.e, je.r, l9.a, l9.a, l9.a):com.ui.wifiman.model.speedtest.result.b");
        }
    }

    /* renamed from: yd.b$p */
    static final class p implements kg.n {
        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(com.ui.wifiman.model.speedtest.result.b result) {
            AbstractC6492s.i(result, "result");
            return C8653b.this.f66679a.a(result);
        }
    }

    /* renamed from: yd.b$q */
    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final q f66705a = new q();

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(com.ui.wifiman.model.speedtest.result.b it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.c(it);
        }
    }

    /* renamed from: yd.b$r */
    public static final class r implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Speedtest.d f66706a;

        public r(Speedtest.d dVar) {
            this.f66706a = dVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object objV;
            try {
                Speedtest.f fVarF = this.f66706a.f();
                Speedtest.f.a.c cVar = fVarF instanceof Speedtest.f.a.c ? (Speedtest.f.a.c) fVarF : null;
                if (cVar == null) {
                    throw new IllegalStateException("result must be already prepared");
                }
                com.ui.wifiman.model.speedtest.result.b bVar = (com.ui.wifiman.model.speedtest.result.b) cVar.c();
                Speedtest.d dVar = this.f66706a;
                if (dVar instanceof com.ui.wifiman.model.speedtest.internet.f) {
                    objV = ((com.ui.wifiman.model.speedtest.internet.f) dVar).n();
                } else if (dVar instanceof C7454d) {
                    objV = ((C7454d) dVar).p();
                } else if (dVar instanceof Cd.n) {
                    objV = ((Cd.n) dVar).p();
                } else {
                    if (!(dVar instanceof com.ui.wifiman.model.speedtest.advanced.b)) {
                        throw new IllegalStateException("unknown speedtest type");
                    }
                    objV = ((com.ui.wifiman.model.speedtest.advanced.b) dVar).v();
                }
                Speedtest.f.a.c cVar2 = objV instanceof Speedtest.f.a.c ? (Speedtest.f.a.c) objV : null;
                if (cVar2 == null) {
                    throw new IllegalStateException("result not yet reported");
                }
                InterfaceC8330f.b bVar2 = (InterfaceC8330f.b) cVar2.c();
                interfaceC5910A.onSuccess(bVar.a((249 & 1) != 0 ? bVar.f43101a : 0L, (249 & 2) != 0 ? bVar.f43102b : bVar2.a(), (249 & 4) != 0 ? bVar.f43103c : bVar2.b(), (249 & 8) != 0 ? bVar.f43104d : null, (249 & 16) != 0 ? bVar.f43105e : 0L, (249 & 32) != 0 ? bVar.f43106f : null, (249 & 64) != 0 ? bVar.f43107g : null, (249 & 128) != 0 ? bVar.f43108h : null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: yd.b$s */
    static final class s implements kg.n {
        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(com.ui.wifiman.model.speedtest.result.b updatedResult) {
            AbstractC6492s.i(updatedResult, "updatedResult");
            return C8653b.this.f66679a.h(updatedResult).k(z.z(updatedResult));
        }
    }

    /* renamed from: yd.b$t */
    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f66708a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(com.ui.wifiman.model.speedtest.result.b it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.c(it);
        }
    }

    public C8653b(com.ui.wifiman.model.speedtest.result.e resultManager, Zc.f networkConnection, u wifiConnectionService, Cc.n deviceManager, InterfaceC6293b topology, Dc.e networkDiscovery, InterfaceC6586g wifiScannerService, InterfaceC6454d publicIpService) {
        AbstractC6492s.i(resultManager, "resultManager");
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        AbstractC6492s.i(deviceManager, "deviceManager");
        AbstractC6492s.i(topology, "topology");
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(wifiScannerService, "wifiScannerService");
        AbstractC6492s.i(publicIpService, "publicIpService");
        this.f66679a = resultManager;
        this.f66680b = networkConnection;
        this.f66681c = wifiConnectionService;
        this.f66682d = deviceManager;
        this.f66683e = topology;
        this.f66684f = networkDiscovery;
        this.f66685g = wifiScannerService;
        gg.i iVarN0 = publicIpService.a().N0(h.f66695a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f66686h = iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b.AbstractC1432b.AbstractC1433b.C1434b.Provider i(InternetSpeedtest.b.C1420b c1420b) {
        return new b.AbstractC1432b.AbstractC1433b.C1434b.Provider(c1420b.c(), c1420b.n(), c1420b.i(), c1420b.h(), c1420b.d());
    }

    private final z j(Cd.n nVar) {
        z zVarA = this.f66684f.b().o0().A(new a(nVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z k(C7454d c7454d) {
        z zVarA = this.f66684f.b().o0().A(new C2365b(c7454d));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z l(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        z zVarA = this.f66684f.b().o0().A(new c(bVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z m(Speedtest.d dVar) {
        z zVarI = z.i(new d(dVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarS = zVarI.s(new e());
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    private final z n(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        z zVarA = this.f66686h.o0().A(new g(bVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z o(com.ui.wifiman.model.speedtest.internet.f fVar) {
        z zVarA = this.f66686h.o0().A(new f(fVar, this));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z p(Cd.n nVar) {
        z zVarA = j(nVar).A(new j(nVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z q(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        z zVarE0 = z.e0(n(bVar), l(bVar), new l(bVar));
        AbstractC6492s.h(zVarE0, "zip(...)");
        return zVarE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z r(com.ui.wifiman.model.speedtest.internet.f fVar) {
        z zVarA = o(fVar).A(new i(fVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z s(C7454d c7454d) {
        z zVarA = k(c7454d).A(new k(c7454d));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // yd.InterfaceC8652a
    public gg.i a(Speedtest.d state) {
        AbstractC6492s.i(state, "state");
        z zVarI = z.i(new r(state));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarZ1 = zVarI.s(new s()).A(t.f66708a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    @Override // yd.InterfaceC8652a
    public gg.i b(Speedtest.d state, W7.b bVar) {
        AbstractC6492s.i(state, "state");
        gg.i iVarZ1 = z.b0(m(state), this.f66680b.getState().o0(), this.f66681c.a().o0(), this.f66682d.b().N0(m.f66700a).W().o0(), this.f66683e.c().o0(), this.f66685g.b().N0(n.f66701a).o0(), new o(bVar, state)).s(new p()).A(q.f66705a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }
}
