package o7;

import Yg.J;
import Yg.s;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.y;
import gg.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import o7.l;
import q7.C7431a;
import q7.InterfaceC7433c;
import r7.C7577a;
import s7.C7920g;
import u7.AbstractC8138a;
import u7.InterfaceC8139b;

/* loaded from: classes3.dex */
public final class l extends AbstractC7100f {

    /* renamed from: b, reason: collision with root package name */
    private final List f55533b;

    /* renamed from: c, reason: collision with root package name */
    private final y f55534c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f55535d;

    /* renamed from: e, reason: collision with root package name */
    private final y.c f55536e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.b f55537f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f55538g;

    /* renamed from: h, reason: collision with root package name */
    private final Fg.b f55539h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f55540i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f55541j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f55542k;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f55543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f55544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, y yVar) {
            super(0);
            this.f55543a = j10;
            this.f55544b = yVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7431a invoke() {
            return new C7431a(this.f55543a, this.f55544b, null, null, 12, null);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8138a f55545a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55546b;

        public b(AbstractC8138a server, int i10) {
            AbstractC6492s.i(server, "server");
            this.f55545a = server;
            this.f55546b = i10;
        }

        public final AbstractC8138a a() {
            return this.f55545a;
        }

        public final int b() {
            return this.f55546b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f55545a, bVar.f55545a) && this.f55546b == bVar.f55546b;
        }

        public int hashCode() {
            return (this.f55545a.hashCode() * 31) + Integer.hashCode(this.f55546b);
        }

        public String toString() {
            return "ServerHolder(server=" + this.f55545a + ", serverPriority=" + this.f55546b + ")";
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f55547a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7433c it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7433c f55548a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f55549b;

        d(InterfaceC7433c interfaceC7433c, b bVar) {
            this.f55548a = interfaceC7433c;
            this.f55549b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C7920g result) {
            AbstractC6492s.i(result, "result");
            return this.f55548a.a(result, ((Number) this.f55549b.a().a().invoke(result)).longValue(), new C7577a(this.f55549b.b(), result));
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable serverError) {
            AbstractC6492s.i(serverError, "serverError");
            l.this.r(serverError);
        }
    }

    static final class f implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f55552a;

            a(l lVar) {
                this.f55552a = lVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(InterfaceC7433c cache, gg.j it) {
                AbstractC6492s.i(cache, "$cache");
                AbstractC6492s.i(it, "it");
                it.h(cache);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(s sVar) {
                AbstractC6492s.i(sVar, "<name for destructuring parameter 0>");
                final InterfaceC7433c cache = (InterfaceC7433c) sVar.a();
                List servers = (List) sVar.c();
                gg.i iVarN = gg.i.N(new gg.k() { // from class: o7.m
                    @Override // gg.k
                    public final void a(gg.j jVar) {
                        l.f.a.c(cache, jVar);
                    }
                }, EnumC5911a.ERROR);
                l lVar = this.f55552a;
                AbstractC6492s.h(servers, "servers");
                AbstractC6492s.h(cache, "cache");
                return iVarN.U0(lVar.n(servers, cache));
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(J it) {
            AbstractC6492s.i(it, "it");
            return Ag.e.f756a.a(l.this.p(), l.this.l()).w(new a(l.this));
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            l.this.t(true);
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f55554a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC7433c it) {
            AbstractC6492s.i(it, "it");
            return it.c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(List list, y DISCOVERY_SCHEDULER, long j10, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            DISCOVERY_SCHEDULER = n.b();
            AbstractC6492s.h(DISCOVERY_SCHEDULER, "DISCOVERY_SCHEDULER");
        }
        y yVar = DISCOVERY_SCHEDULER;
        long j11 = (i10 & 4) != 0 ? 300L : j10;
        this(list, yVar, j11, (i10 & 8) != 0 ? new a(j11, yVar) : interfaceC6824a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z l() {
        z zVarI = z.i(new C() { // from class: o7.j
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                l.m(this.f55530a, interfaceC5910A);
            }
        });
        AbstractC6492s.h(zVarI, "create<List<ServerHolder…}\n            )\n        }");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l this$0, InterfaceC5910A it) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(it, "it");
        List<p> list = this$0.f55533b;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (p pVar : list) {
            InterfaceC8139b interfaceC8139bA = pVar.a();
            arrayList.add(new b(interfaceC8139bA.b(), pVar.b()));
        }
        it.onSuccess(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b n(List list, InterfaceC7433c interfaceC7433c) {
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
        for (b bVar : list2) {
            arrayList.add(bVar.a().b().t0(new d(interfaceC7433c, bVar)).z(new e()));
        }
        AbstractC5912b abstractC5912bH = AbstractC5912b.H(arrayList);
        AbstractC6492s.h(abstractC5912bH, "merge(\n            serve…         }\n            })");
        return abstractC5912bH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l this$0) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.t(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z p() {
        z zVarI = z.i(new C() { // from class: o7.h
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                l.q(this.f55527a, interfaceC5910A);
            }
        });
        AbstractC6492s.h(zVarI, "create<DiscoveryResultTt…CacheFactory())\n        }");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(l this$0, InterfaceC5910A it) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(it, "it");
        it.onSuccess(this$0.f55535d.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final Throwable th2) {
        this.f55536e.b(new Runnable() { // from class: o7.k
            @Override // java.lang.Runnable
            public final void run() {
                l.s(this.f55531a, th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l this$0, Throwable error) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(error, "$error");
        ArrayList arrayList = new ArrayList();
        Object objL2 = this$0.f55538g.l2();
        AbstractC6492s.f(objL2);
        arrayList.addAll((Collection) objL2);
        arrayList.add(error);
        this$0.f55538g.h(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final boolean z10) {
        this.f55536e.b(new Runnable() { // from class: o7.i
            @Override // java.lang.Runnable
            public final void run() {
                l.u(this.f55528a, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(l this$0, boolean z10) {
        AbstractC6492s.i(this$0, "this$0");
        this$0.f55537f.h(Boolean.valueOf(z10));
    }

    @Override // o7.AbstractC7100f
    public gg.i a() {
        return this.f55542k;
    }

    public l(List serverFactories, y scheduler, long j10, InterfaceC6824a resultCacheFactory) {
        AbstractC6492s.i(serverFactories, "serverFactories");
        AbstractC6492s.i(scheduler, "scheduler");
        AbstractC6492s.i(resultCacheFactory, "resultCacheFactory");
        this.f55533b = serverFactories;
        this.f55534c = scheduler;
        this.f55535d = resultCacheFactory;
        y.c cVarC = scheduler.c();
        AbstractC6492s.h(cVarC, "scheduler.createWorker()");
        this.f55536e = cVarC;
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(false)");
        this.f55537f = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(AbstractC3689v.l());
        AbstractC6492s.h(aVarK22, "createDefault(listOf<Throwable>())");
        this.f55538g = aVarK22;
        Fg.b bVarH2 = Fg.a.k2(J.f24997a).h2();
        AbstractC6492s.h(bVarH2, "createDefault<Unit>(Unit).toSerialized()");
        this.f55539h = bVarH2;
        gg.i iVarF1 = bVarH2.I1(new f()).g0(new g()).Z(new InterfaceC6464a() { // from class: o7.g
            @Override // kg.InterfaceC6464a
            public final void run() {
                l.o(this.f55526a);
            }
        }).o1(1).i2().F1(scheduler);
        AbstractC6492s.h(iVarF1, "resetProcessor\n         …  .subscribeOn(scheduler)");
        this.f55540i = iVarF1;
        gg.i iVarI1 = iVarF1.I1(c.f55547a);
        AbstractC6492s.h(iVarI1, "discoveryStream.switchMa…   it.devices()\n        }");
        this.f55541j = iVarI1;
        gg.i iVarI12 = iVarF1.I1(h.f55554a);
        AbstractC6492s.h(iVarI12, "discoveryStream.switchMa…it.lastDevice()\n        }");
        this.f55542k = iVarI12;
    }
}
