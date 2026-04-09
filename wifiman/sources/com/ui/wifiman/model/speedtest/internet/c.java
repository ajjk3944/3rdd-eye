package com.ui.wifiman.model.speedtest.internet;

import Ia.a;
import Ia.d;
import Ii.N;
import Ka.f;
import W7.c;
import Wc.b;
import Yb.a;
import Yg.J;
import Yg.v;
import Yg.z;
import Zc.e;
import Zg.AbstractC3689v;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.speedtest.internet.c;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import pc.InterfaceC7283a;
import td.InterfaceC8082d;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class c implements InternetSpeedtest.d {

    /* renamed from: q, reason: collision with root package name */
    public static final a f43022q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8082d f43023a;

    /* renamed from: b, reason: collision with root package name */
    private final Yb.b f43024b;

    /* renamed from: c, reason: collision with root package name */
    private final Zc.f f43025c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f43026d;

    /* renamed from: e, reason: collision with root package name */
    private final Fg.a f43027e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f43028f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43029g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43030h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43031i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f43032j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f43033k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f43034l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f43035m;

    /* renamed from: n, reason: collision with root package name */
    private final gg.i f43036n;

    /* renamed from: o, reason: collision with root package name */
    private final gg.i f43037o;

    /* renamed from: p, reason: collision with root package name */
    private final gg.i f43038p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f43039a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f43039a = error;
            }

            public final Throwable a() {
                return this.f43039a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f43039a, ((a) obj).f43039a);
            }

            public int hashCode() {
                return this.f43039a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f43039a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.speedtest.internet.c$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC1425b extends b {

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$b$b$a */
            public static final class a extends AbstractC1425b {

                /* renamed from: a, reason: collision with root package name */
                private final List f43040a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(List servers) {
                    super(null);
                    AbstractC6492s.i(servers, "servers");
                    this.f43040a = servers;
                }

                @Override // com.ui.wifiman.model.speedtest.internet.c.b.AbstractC1425b
                public List a() {
                    return this.f43040a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && AbstractC6492s.d(this.f43040a, ((a) obj).f43040a);
                }

                public int hashCode() {
                    return this.f43040a.hashCode();
                }

                public String toString() {
                    return "Finished(servers=" + this.f43040a + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$b$b$b, reason: collision with other inner class name */
            public static final class C1426b extends AbstractC1425b {

                /* renamed from: a, reason: collision with root package name */
                private final List f43041a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1426b(List servers) {
                    super(null);
                    AbstractC6492s.i(servers, "servers");
                    this.f43041a = servers;
                }

                @Override // com.ui.wifiman.model.speedtest.internet.c.b.AbstractC1425b
                public List a() {
                    return this.f43041a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1426b) && AbstractC6492s.d(this.f43041a, ((C1426b) obj).f43041a);
                }

                public int hashCode() {
                    return this.f43041a.hashCode();
                }

                public String toString() {
                    return "InProgress(servers=" + this.f43041a + ")";
                }
            }

            public /* synthetic */ AbstractC1425b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract List a();

            private AbstractC1425b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: com.ui.wifiman.model.speedtest.internet.c$c, reason: collision with other inner class name */
    static final class C1427c implements InterfaceC6465b {
        C1427c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Wc.b apply(C6556a c6556a, b serversFetch) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(serversFetch, "serversFetch");
            W7.c cVar = (W7.c) c6556a.a();
            if (!(serversFetch instanceof b.AbstractC1425b)) {
                if (serversFetch instanceof b.a) {
                    return new b.a.C0896a(((b.a) serversFetch).a());
                }
                throw new NoWhenBranchMatchedException();
            }
            b.AbstractC1425b abstractC1425b = (b.AbstractC1425b) serversFetch;
            List listA = abstractC1425b.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((Ia.e) obj).a().b() != null) {
                    arrayList.add(obj);
                }
            }
            c cVar2 = c.this;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(cVar2.q((Ia.e) it.next(), cVar));
            }
            if (abstractC1425b instanceof b.AbstractC1425b.a) {
                return new b.a.C0897b(arrayList2);
            }
            if (abstractC1425b instanceof b.AbstractC1425b.C1426b) {
                return new b.C0898b(arrayList2);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W7.c f43043a;

        d(W7.c cVar) {
            this.f43043a = cVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Ia.a aVar = (Ia.a) objA;
            W7.c cVar = this.f43043a;
            return Qi.i.c(aVar.d(new Ia.d(cVar != null ? new d.a(cVar.b().a(), cVar.b().b()) : null)), null, 1, null);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43044a = new e();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43045a;

            static {
                int[] iArr = new int[Ia.f.values().length];
                try {
                    iArr[Ia.f.IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Ia.f.SERVER_FETCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Ia.f.LATENCY_CHECK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Ia.f.FINISHED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f43045a = iArr;
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(Ia.g it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f43045a[it.b().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return new b.AbstractC1425b.C1426b(it.a());
            }
            if (i10 == 4) {
                return new b.AbstractC1425b.a(it.a());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43046a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return new b.a(it);
        }
    }

    public static final class g implements C {
        public g() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(c.this.f43023a.b(null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43048a = new h();

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f43049a;

            /* renamed from: b, reason: collision with root package name */
            int f43050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ia.a f43051c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ia.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43051c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f43051c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Ia.a aVar;
                Object objG = AbstractC5467b.g();
                int i10 = this.f43050b;
                if (i10 == 0) {
                    v.b(obj);
                    Ia.a aVar2 = this.f43051c;
                    this.f43049a = aVar2;
                    this.f43050b = 1;
                    Object objC = aVar2.c(this);
                    if (objC == objG) {
                        return objG;
                    }
                    aVar = aVar2;
                    obj = objC;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Ia.a) this.f43049a;
                    v.b(obj);
                }
                return z.a(aVar, obj);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Ia.a client) {
            AbstractC6492s.i(client, "client");
            return Qi.l.c(null, new a(client, null), 1, null).O(Gg.a.d()).E(Gg.a.a());
        }
    }

    static final class i implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43052a = new i();

        i() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Wc.b a(Wc.b apiServers, Wc.b ispServer, Wc.b manualServer) {
            Wc.b c0898b;
            Throwable exc;
            AbstractC6492s.i(apiServers, "apiServers");
            AbstractC6492s.i(ispServer, "ispServer");
            AbstractC6492s.i(manualServer, "manualServer");
            ArrayList arrayList = new ArrayList();
            InternetSpeedtest.b.a aVar = (InternetSpeedtest.b.a) ispServer.b();
            if (aVar != null) {
                arrayList.add(aVar);
            }
            List list = (List) apiServers.b();
            if (list != null) {
                arrayList.addAll(list);
            }
            if (manualServer.b() != null) {
                if (arrayList.isEmpty()) {
                    Object objB = manualServer.b();
                    AbstractC6492s.f(objB);
                    arrayList.add(0, objB);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String strD = ((InternetSpeedtest.b) it.next()).d();
                        InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) manualServer.b();
                        if (AbstractC6492s.d(strD, c1420b != null ? c1420b.d() : null)) {
                            break;
                        }
                    }
                    Object objB2 = manualServer.b();
                    AbstractC6492s.f(objB2);
                    arrayList.add(0, objB2);
                }
            }
            if ((apiServers instanceof b.C0898b) || (ispServer instanceof b.C0898b) || (manualServer instanceof b.C0898b)) {
                c0898b = new b.C0898b(arrayList);
            } else {
                if (!(apiServers instanceof b.a.C0897b) && !(ispServer instanceof b.a.C0897b) && !(manualServer instanceof b.a.C0897b)) {
                    b.a.C0896a c0896a = apiServers instanceof b.a.C0896a ? (b.a.C0896a) apiServers : null;
                    if (c0896a == null || (exc = c0896a.c()) == null) {
                        b.a.C0896a c0896a2 = ispServer instanceof b.a.C0896a ? (b.a.C0896a) ispServer : null;
                        if (c0896a2 != null) {
                            exc = c0896a2.c();
                        } else {
                            b.a.C0896a c0896a3 = manualServer instanceof b.a.C0896a ? (b.a.C0896a) manualServer : null;
                            Throwable thC = c0896a3 != null ? c0896a3.c() : null;
                            exc = thC == null ? new Exception("Failed to load speedtest servers") : thC;
                        }
                    }
                    return new b.a.C0896a(exc);
                }
                c0898b = new b.a.C0897b(arrayList);
            }
            return c0898b;
        }
    }

    static final class j implements kg.n {
        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b it) {
            AbstractC6492s.i(it, "it");
            UispController.c cVar = (UispController.c) it.b();
            return new C6556a(cVar != null ? c.this.t(cVar) : null);
        }
    }

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f43055a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InternetSpeedtest.b.a f43056b;

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$k$a$a, reason: collision with other inner class name */
            static final class C1428a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f43057a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f43058b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a.c f43059c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InternetSpeedtest.b.a f43060d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1428a(c cVar, a.c cVar2, InternetSpeedtest.b.a aVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f43058b = cVar;
                    this.f43059c = cVar2;
                    this.f43060d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1428a(this.f43058b, this.f43059c, this.f43060d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f43057a;
                    if (i10 == 0) {
                        v.b(obj);
                        f.a aVarD = this.f43058b.f43023a.d(this.f43059c.a());
                        String strD = this.f43060d.d();
                        this.f43057a = 1;
                        obj = aVarD.b(strD, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1428a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InternetSpeedtest.b.a f43061a;

                b(InternetSpeedtest.b.a aVar) {
                    this.f43061a = aVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Wc.b apply(La.e eval) {
                    AbstractC6492s.i(eval, "eval");
                    InternetSpeedtest.b.a aVar = this.f43061a;
                    Long lB = eval.b();
                    Integer numValueOf = lB != null ? Integer.valueOf((int) lB.longValue()) : null;
                    Long lA = eval.a();
                    return new b.a.C0897b(InternetSpeedtest.b.a.g(aVar, null, null, null, numValueOf, null, lA != null ? Integer.valueOf((int) lA.longValue()) : null, 23, null));
                }
            }

            a(c cVar, InternetSpeedtest.b.a aVar) {
                this.f43055a = cVar;
                this.f43056b = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Yg.s sVar) {
                AbstractC6492s.i(sVar, "<destruct>");
                return Qi.l.c(null, new C1428a(this.f43055a, (a.c) sVar.c(), this.f43056b, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).A(new b(this.f43056b));
            }
        }

        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wc.b c(Throwable it) {
            AbstractC6492s.i(it, "it");
            return new b.a.C0896a(it);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            InternetSpeedtest.b.a aVar = (InternetSpeedtest.b.a) c6556a.a();
            if (aVar != null) {
                gg.i iVarZ1 = c.this.s().s(new a(c.this, aVar)).G(new kg.n() { // from class: com.ui.wifiman.model.speedtest.internet.d
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return c.k.c((Throwable) obj);
                    }
                }).W().z1(new b.C0898b(aVar));
                AbstractC6492s.f(iVarZ1);
                return iVarZ1;
            }
            gg.i iVarK0 = gg.i.K0(new b.a.C0896a(new Exception("ISP Server unavailable")));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f43062a = new l();

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.h());
        }
    }

    static final class m implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final m f43063a = new m();

        m() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Boolean vpnConnected, C6556a location) {
            AbstractC6492s.i(vpnConnected, "vpnConnected");
            AbstractC6492s.i(location, "location");
            return !vpnConnected.booleanValue() ? location : new C6556a(null);
        }
    }

    static final class n implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f43065a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f43066b;

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$n$a$a, reason: collision with other inner class name */
            static final class C1429a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f43067a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f43068b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a.c f43069c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.N f43070d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1429a(c cVar, a.c cVar2, kotlin.jvm.internal.N n10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f43068b = cVar;
                    this.f43069c = cVar2;
                    this.f43070d = n10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1429a(this.f43068b, this.f43069c, this.f43070d, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f43067a;
                    if (i10 == 0) {
                        v.b(obj);
                        f.a aVarD = this.f43068b.f43023a.d(this.f43069c.a());
                        String strD = ((InternetSpeedtest.b.C1420b) this.f43070d.f51689a).d();
                        this.f43067a = 1;
                        obj = aVarD.b(strD, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v.b(obj);
                    }
                    return obj;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1429a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.N f43071a;

                b(kotlin.jvm.internal.N n10) {
                    this.f43071a = n10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Wc.b apply(La.e eval) {
                    AbstractC6492s.i(eval, "eval");
                    InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) this.f43071a.f51689a;
                    Long lB = eval.b();
                    return new b.a.C0897b(c1420b.f((3583 & 1) != 0 ? c1420b.f42949a : null, (3583 & 2) != 0 ? c1420b.f42950b : null, (3583 & 4) != 0 ? c1420b.f42951c : null, (3583 & 8) != 0 ? c1420b.f42952d : null, (3583 & 16) != 0 ? c1420b.f42953e : null, (3583 & 32) != 0 ? c1420b.f42954f : null, (3583 & 64) != 0 ? c1420b.f42955g : null, (3583 & 128) != 0 ? c1420b.f42956h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c1420b.f42957i : null, (3583 & 512) != 0 ? c1420b.f42958j : lB != null ? Integer.valueOf((int) lB.longValue()) : null, (3583 & 1024) != 0 ? c1420b.f42959k : null, (3583 & 2048) != 0 ? c1420b.f42960l : null));
                }
            }

            a(c cVar, kotlin.jvm.internal.N n10) {
                this.f43065a = cVar;
                this.f43066b = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Yg.s sVar) {
                AbstractC6492s.i(sVar, "<destruct>");
                return Qi.l.c(null, new C1429a(this.f43065a, (a.c) sVar.c(), this.f43066b, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).A(new b(this.f43066b));
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Wc.b c(Throwable it) {
            AbstractC6492s.i(it, "it");
            return new b.a.C0896a(it);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            C6556a c6556a = (C6556a) sVar.a();
            InternetSpeedtest.c cVar = (InternetSpeedtest.c) sVar.c();
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            InternetSpeedtest.c.C1421c c1421c = cVar instanceof InternetSpeedtest.c.C1421c ? (InternetSpeedtest.c.C1421c) cVar : null;
            InternetSpeedtest.b.C1420b c1420bA = c1421c != null ? c1421c.a() : null;
            n10.f51689a = c1420bA;
            if (c1420bA == null) {
                gg.i iVarK0 = gg.i.K0(new b.a.C0896a(new Exception("Manual Server unavailable")));
                AbstractC6492s.f(iVarK0);
                return iVarK0;
            }
            if (!(c6556a.b() == null) && ((InternetSpeedtest.b.C1420b) n10.f51689a).m() != null) {
                InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) n10.f51689a;
                Object objB = c6556a.b();
                AbstractC6492s.f(objB);
                W7.c cVarM = ((InternetSpeedtest.b.C1420b) n10.f51689a).m();
                AbstractC6492s.f(cVarM);
                n10.f51689a = c1420b.f((3583 & 1) != 0 ? c1420b.f42949a : null, (3583 & 2) != 0 ? c1420b.f42950b : null, (3583 & 4) != 0 ? c1420b.f42951c : null, (3583 & 8) != 0 ? c1420b.f42952d : null, (3583 & 16) != 0 ? c1420b.f42953e : null, (3583 & 32) != 0 ? c1420b.f42954f : null, (3583 & 64) != 0 ? c1420b.f42955g : null, (3583 & 128) != 0 ? c1420b.f42956h : null, (3583 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c1420b.f42957i : Float.valueOf(((W7.c) objB).a(cVarM)), (3583 & 512) != 0 ? c1420b.f42958j : null, (3583 & 1024) != 0 ? c1420b.f42959k : null, (3583 & 2048) != 0 ? c1420b.f42960l : null);
            }
            gg.i iVarZ1 = c.this.s().s(new a(c.this, n10)).G(new kg.n() { // from class: com.ui.wifiman.model.speedtest.internet.e
                @Override // kg.n
                public final Object apply(Object obj) {
                    return c.n.c((Throwable) obj);
                }
            }).W().z1(new b.C0898b(n10.f51689a));
            AbstractC6492s.f(iVarZ1);
            return iVarZ1;
        }
    }

    static final class o implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final o f43072a = new o();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43073a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.ISP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.AUTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.MANUAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43073a = iArr;
            }
        }

        o() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InternetSpeedtest.c apply(C6556a c6556a, Wc.b bVar) {
            W7.c cVar;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(bVar, "<destruct>");
            Yb.a aVar = (Yb.a) c6556a.a();
            InternetSpeedtest.b.a aVar2 = (InternetSpeedtest.b.a) bVar.a();
            a.b bVarK = aVar != null ? aVar.k() : null;
            int i10 = bVarK == null ? -1 : a.f43073a[bVarK.ordinal()];
            if (i10 == -1 || i10 == 1) {
                return aVar2 != null ? new InternetSpeedtest.c.b(aVar2) : InternetSpeedtest.c.a.f42961a;
            }
            if (i10 == 2) {
                return InternetSpeedtest.c.a.f42961a;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String strA = aVar.a();
            String strB = aVar.b();
            String strC = aVar.c();
            if (aVar.e() == null || aVar.f() == null) {
                cVar = null;
            } else {
                Double dE = aVar.e();
                AbstractC6492s.f(dE);
                double dDoubleValue = dE.doubleValue();
                Double dF = aVar.f();
                AbstractC6492s.f(dF);
                cVar = new W7.c(new c.a(dDoubleValue, dF.doubleValue()), null, 2, null);
            }
            String strG = aVar.g();
            String strH = aVar.h();
            Long lValueOf = aVar.i() != null ? Long.valueOf(r1.intValue()) : null;
            String strL = aVar.l();
            if (strL != null) {
                return new InternetSpeedtest.c.C1421c(new InternetSpeedtest.b.C1420b(strL, strA, strB, strC, cVar, strG, strH, lValueOf, null, null, null, null, 1024, null));
            }
            throw new IllegalStateException("url is required");
        }
    }

    static final class p implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43075a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Zc.e it) {
                AbstractC6492s.i(it, "it");
                return Boolean.valueOf(it.f() == e.b.CONNECTED);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f43076a;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ c f43077a;

                a(c cVar) {
                    this.f43077a = cVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(C6556a c6556a) {
                    AbstractC6492s.i(c6556a, "<destruct>");
                    return this.f43077a.r((W7.c) c6556a.a());
                }
            }

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$p$b$b, reason: collision with other inner class name */
            static final class C1430b implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.J f43078a;

                C1430b(kotlin.jvm.internal.J j10) {
                    this.f43078a = j10;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(b it) {
                    AbstractC6492s.i(it, "it");
                    this.f43078a.f51685a = it instanceof b.a;
                }
            }

            /* renamed from: com.ui.wifiman.model.speedtest.internet.c$p$b$c, reason: collision with other inner class name */
            static final class C1431c implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.J f43079a;

                /* renamed from: com.ui.wifiman.model.speedtest.internet.c$p$b$c$a */
                static final class a implements kg.n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.J f43080a;

                    a(kotlin.jvm.internal.J j10) {
                        this.f43080a = j10;
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(Object it) {
                        AbstractC6492s.i(it, "it");
                        return this.f43080a.f51685a ? gg.i.d2(5000L, TimeUnit.MILLISECONDS) : gg.i.j0();
                    }
                }

                C1431c(kotlin.jvm.internal.J j10) {
                    this.f43079a = j10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.p0(new a(this.f43079a));
                }
            }

            b(c cVar) {
                this.f43076a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Boolean connected) {
                AbstractC6492s.i(connected, "connected");
                if (!connected.booleanValue()) {
                    gg.i iVarK0 = gg.i.K0(new b.a(new RuntimeException("No Network Connection")));
                    AbstractC6492s.f(iVarK0);
                    return iVarK0;
                }
                kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                gg.i iVarN1 = this.f43076a.f43026d.o0().w(new a(this.f43076a)).f0(new C1430b(j10)).n1(new C1431c(j10));
                AbstractC6492s.f(iVarN1);
                return iVarN1;
            }
        }

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(J it) {
            AbstractC6492s.i(it, "it");
            return c.this.f43025c.getState().O(500L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).N0(a.f43075a).I1(new b(c.this)).z1(new b.AbstractC1425b.C1426b(AbstractC3689v.l()));
        }
    }

    static final class q implements kg.n {
        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InternetSpeedtest.c it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof InternetSpeedtest.c.a) {
                return c.this.f43035m;
            }
            if (it instanceof InternetSpeedtest.c.C1421c) {
                c cVar = c.this;
                return cVar.u(cVar.f43036n);
            }
            if (!(it instanceof InternetSpeedtest.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar2 = c.this;
            return cVar2.u(cVar2.f43037o);
        }
    }

    static final class r implements kg.n {
        r() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InternetSpeedtest.d.a apply(b status) {
            AbstractC6492s.i(status, "status");
            if (!(status instanceof b.AbstractC1425b)) {
                if (status instanceof b.a) {
                    return InternetSpeedtest.d.a.c.f42967a;
                }
                throw new NoWhenBranchMatchedException();
            }
            b.AbstractC1425b abstractC1425b = (b.AbstractC1425b) status;
            if (abstractC1425b.a().isEmpty()) {
                return InternetSpeedtest.d.a.C1422a.f42964a;
            }
            List listA = abstractC1425b.a();
            c cVar = c.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.q((Ia.e) it.next(), null));
            }
            InternetSpeedtest.b bVar = (InternetSpeedtest.b) AbstractC3689v.q0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            InterfaceC8780j interfaceC8780jV = AbstractC8783m.V(AbstractC8783m.B(AbstractC3689v.d0(abstractC1425b.a()), 1), 3);
            c cVar2 = c.this;
            Iterator it2 = interfaceC8780jV.iterator();
            while (it2.hasNext()) {
                arrayList2.add(cVar2.q((Ia.e) it2.next(), null));
            }
            return bVar.b() != null ? new InternetSpeedtest.d.a.b(bVar, arrayList2) : InternetSpeedtest.d.a.c.f42967a;
        }
    }

    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final s f43083a = new s();

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InternetSpeedtest.d.a apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            InternetSpeedtest.b.a aVar = (InternetSpeedtest.b.a) bVar.a();
            return (aVar != null ? aVar.b() : null) != null ? new InternetSpeedtest.d.a.b(aVar, AbstractC3689v.l()) : InternetSpeedtest.d.a.c.f42967a;
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f43084a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InternetSpeedtest.d.a apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            InternetSpeedtest.b.C1420b c1420b = (InternetSpeedtest.b.C1420b) bVar.a();
            return (c1420b != null ? c1420b.b() : null) != null ? new InternetSpeedtest.d.a.b(c1420b, AbstractC3689v.l()) : InternetSpeedtest.d.a.c.f42967a;
        }
    }

    static final class u implements kg.n {
        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InternetSpeedtest.d.a it) {
            AbstractC6492s.i(it, "it");
            if ((it instanceof InternetSpeedtest.d.a.C1422a) || (it instanceof InternetSpeedtest.d.a.b)) {
                gg.i iVarK0 = gg.i.K0(it);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (it instanceof InternetSpeedtest.d.a.c) {
                return c.this.f43035m;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public c(InterfaceC8082d uiSpeedApiFactory, Yb.b speedTestServerDb, InterfaceC7283a locationService, Zc.f networkConnectionManager, UispController uispController) {
        AbstractC6492s.i(uiSpeedApiFactory, "uiSpeedApiFactory");
        AbstractC6492s.i(speedTestServerDb, "speedTestServerDb");
        AbstractC6492s.i(locationService, "locationService");
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(uispController, "uispController");
        this.f43023a = uiSpeedApiFactory;
        this.f43024b = speedTestServerDb;
        this.f43025c = networkConnectionManager;
        gg.i iVarW = gg.i.v(networkConnectionManager.getState().N0(l.f43062a).W(), locationService.b(), m.f43063a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f43026d = iVarW;
        Fg.a aVarK2 = Fg.a.k2(J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f43027e = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43028f = iVarI2;
        gg.i iVarI22 = uispController.d().N0(new j()).I1(new k()).z1(new b.C0898b(null, 1, null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43029g = iVarI22;
        gg.i iVarI23 = gg.i.v(Yb.c.b(speedTestServerDb), iVarI22, o.f43072a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43030h = iVarI23;
        gg.i iVarI24 = Ag.c.f753a.a(iVarW, d()).I1(new n()).z1(new b.C0898b(null, 1, null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43031i = iVarI24;
        gg.i iVarI25 = iVarI2.I1(new p()).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f43032j = iVarI25;
        gg.i iVarI26 = gg.i.v(iVarW, iVarI25, new C1427c()).z1(new b.C0898b(null, 1, null)).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f43033k = iVarI26;
        gg.i iVarI27 = gg.i.u(iVarI26, iVarI22, iVarI24, i.f43052a).W().o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f43034l = iVarI27;
        gg.i iVarN0 = iVarI25.N0(new r());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f43035m = iVarN0;
        gg.i iVarN02 = iVarI24.N0(t.f43084a);
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f43036n = iVarN02;
        gg.i iVarN03 = iVarI22.N0(s.f43083a);
        AbstractC6492s.h(iVarN03, "map(...)");
        this.f43037o = iVarN03;
        gg.i iVarI28 = d().I1(new q()).W().o1(1).i2();
        AbstractC6492s.h(iVarI28, "refCount(...)");
        this.f43038p = iVarI28;
    }

    private final Yb.a p(InternetSpeedtest.c cVar) {
        c.a aVarB;
        c.a aVarB2;
        if (cVar instanceof InternetSpeedtest.c.a) {
            a.b bVar = a.b.AUTO;
            return new Yb.a(bVar.getDbId(), (String) null, (String) null, (String) null, (Double) null, (Double) null, (String) null, (String) null, (Integer) null, (String) null, System.currentTimeMillis(), bVar);
        }
        if (cVar instanceof InternetSpeedtest.c.b) {
            a.b bVar2 = a.b.ISP;
            InternetSpeedtest.c.b bVar3 = (InternetSpeedtest.c.b) cVar;
            return new Yb.a(bVar2.getDbId(), (String) null, (String) null, (String) null, (Double) null, (Double) null, bVar3.a().h(), (String) null, (Integer) null, bVar3.a().d(), System.currentTimeMillis(), bVar2);
        }
        if (!(cVar instanceof InternetSpeedtest.c.C1421c)) {
            throw new NoWhenBranchMatchedException();
        }
        InternetSpeedtest.c.C1421c c1421c = (InternetSpeedtest.c.C1421c) cVar;
        String strA = c1421c.a().a();
        String strD = c1421c.a().d();
        String strH = c1421c.a().h();
        String strI = c1421c.a().i();
        String strJ = c1421c.a().j();
        W7.c cVarM = c1421c.a().m();
        Double dValueOf = (cVarM == null || (aVarB2 = cVarM.b()) == null) ? null : Double.valueOf(aVarB2.a());
        W7.c cVarM2 = c1421c.a().m();
        Double dValueOf2 = (cVarM2 == null || (aVarB = cVarM2.b()) == null) ? null : Double.valueOf(aVarB.b());
        String strC = c1421c.a().c();
        String strN = c1421c.a().n();
        Long lO = c1421c.a().o();
        return new Yb.a(strA, strH, strI, strJ, dValueOf, dValueOf2, strC, strN, lO != null ? Integer.valueOf((int) lO.longValue()) : null, strD, System.currentTimeMillis(), a.b.MANUAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternetSpeedtest.b q(Ia.e eVar, W7.c cVar) {
        W7.c cVar2;
        if (eVar.b().d() == null || eVar.b().e() == null) {
            cVar2 = null;
        } else {
            Double d10 = eVar.b().d();
            AbstractC6492s.f(d10);
            double dDoubleValue = d10.doubleValue();
            Double dE = eVar.b().e();
            AbstractC6492s.f(dE);
            cVar2 = new W7.c(new c.a(dDoubleValue, dE.doubleValue()), null, 2, null);
        }
        String strA = eVar.b().a();
        String strB = eVar.b().b();
        String strC = eVar.b().c();
        String strF = eVar.b().f();
        String strG = eVar.b().g();
        Long lH = eVar.b().h();
        String strI = eVar.b().i();
        Float fValueOf = (cVar2 == null || cVar == null) ? null : Float.valueOf(cVar2.a(cVar));
        Long lB = eVar.a().b();
        return new InternetSpeedtest.b.C1420b(strI, strA, strB, strC, cVar2, strF, strG, lH, fValueOf, lB != null ? Integer.valueOf((int) lB.longValue()) : null, null, eVar.a().d(), 1024, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i r(W7.c cVar) {
        gg.i iVarF1 = s().w(new d(cVar)).N0(e.f43044a).g1(f.f43046a).F1(Gg.a.d());
        AbstractC6492s.h(iVarF1, "subscribeOn(...)");
        return iVarF1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z s() {
        gg.z zVarI = gg.z.i(new g());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarS = zVarI.s(h.f43048a);
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternetSpeedtest.b.a t(UispController.c cVar) {
        return new InternetSpeedtest.b.a(cVar.a(), cVar.b(), cVar.c(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i u(gg.i iVar) {
        gg.i iVarI1 = iVar.I1(new u());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        return iVarI1;
    }

    @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.d
    public AbstractC5912b a(InternetSpeedtest.c server) {
        AbstractC6492s.i(server, "server");
        return Yb.c.c(this.f43024b, p(server));
    }

    @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.d
    public gg.i b() {
        return this.f43034l;
    }

    @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.d
    public gg.i c() {
        return this.f43038p;
    }

    @Override // com.ui.wifiman.model.speedtest.internet.InternetSpeedtest.d
    public gg.i d() {
        return this.f43030h;
    }
}
