package com.ui.wifiman.model.teleport;

import Fd.D;
import I7.InterfaceC2985a;
import Kd.a;
import Wc.b;
import Yg.J;
import Yg.s;
import Zc.e;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.l;
import com.ui.wifiman.model.teleport.n;
import com.ui.wifiman.model.ubiquiti.console.e;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.r;
import gg.z;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import l9.C6556a;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class l implements com.ui.wifiman.model.teleport.k {

    /* renamed from: m, reason: collision with root package name */
    public static final a f43421m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2985a f43422a;

    /* renamed from: b, reason: collision with root package name */
    private final Kd.d f43423b;

    /* renamed from: c, reason: collision with root package name */
    private final Kd.b f43424c;

    /* renamed from: d, reason: collision with root package name */
    private final Zc.f f43425d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f43426e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f43427f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43428g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43429h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43430i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f43431j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f43432k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f43433l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        private final String f43434a = "Network Not Available";

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f43434a;
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final String f43435a;

            public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public String a() {
                return this.f43435a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && TeleportTunnel.d.d(this.f43435a, ((a) obj).f43435a);
            }

            public int hashCode() {
                return TeleportTunnel.d.e(this.f43435a);
            }

            public String toString() {
                return "Start(tunnelId=" + TeleportTunnel.d.f(this.f43435a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a(String tunnelId) {
                super(null);
                AbstractC6492s.i(tunnelId, "tunnelId");
                this.f43435a = tunnelId;
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final String f43436a;

            public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public String a() {
                return this.f43436a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && TeleportTunnel.d.d(this.f43436a, ((b) obj).f43436a);
            }

            public int hashCode() {
                return TeleportTunnel.d.e(this.f43436a);
            }

            public String toString() {
                return "Stop(tunnelId=" + TeleportTunnel.d.f(this.f43436a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private b(String tunnelId) {
                super(null);
                AbstractC6492s.i(tunnelId, "tunnelId");
                this.f43436a = tunnelId;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f43437a;

        /* renamed from: b, reason: collision with root package name */
        private final Wc.b f43438b;

        public /* synthetic */ d(String str, Wc.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bVar);
        }

        public final Wc.b a() {
            return this.f43438b;
        }

        public final String b() {
            return this.f43437a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return TeleportTunnel.d.d(this.f43437a, dVar.f43437a) && AbstractC6492s.d(this.f43438b, dVar.f43438b);
        }

        public int hashCode() {
            return (TeleportTunnel.d.e(this.f43437a) * 31) + this.f43438b.hashCode();
        }

        public String toString() {
            return "TunnelSyncResult(id=" + TeleportTunnel.d.f(this.f43437a) + ", fetch=" + this.f43438b + ")";
        }

        private d(String id2, Wc.b fetch) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(fetch, "fetch");
            this.f43437a = id2;
            this.f43438b = fetch;
        }
    }

    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43439a = new e();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43440a;

            static {
                int[] iArr = new int[TeleportCloud.b.EnumC1254b.values().length];
                try {
                    iArr[TeleportCloud.b.EnumC1254b.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TeleportCloud.b.EnumC1254b.UNSTABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TeleportCloud.b.EnumC1254b.DISCONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43440a = iArr;
            }
        }

        e() {
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List apply(java.util.List r8, java.util.concurrent.ConcurrentHashMap r9) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.teleport.l.e.apply(java.util.List, java.util.concurrent.ConcurrentHashMap):java.util.List");
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43441a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.f() == e.b.CONNECTED);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43442a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            Kd.a aVarA;
            a.C0428a c0428aC;
            AbstractC6492s.i(c6556a, "<destruct>");
            com.ui.wifiman.model.teleport.n nVar = (com.ui.wifiman.model.teleport.n) c6556a.a();
            String strB = (nVar == null || (aVarA = nVar.a()) == null || (c0428aC = aVarA.c()) == null) ? null : c0428aC.b();
            return new C6556a(strB != null ? e.b.a(strB) : null);
        }
    }

    static final class h implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43443a = new h();

        h() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, List tunnels) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(tunnels, "tunnels");
            e.b bVar = (e.b) c6556a.a();
            Object obj = null;
            String strN = bVar != null ? bVar.n() : null;
            String strB = strN != null ? TeleportTunnel.d.b(strN) : null;
            if (strB != null) {
                Iterator it = tunnels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (TeleportTunnel.d.d(((n.a) next).b().g(), strB)) {
                        obj = next;
                        break;
                    }
                }
                obj = (n.a) obj;
            }
            return new C6556a(obj);
        }
    }

    static final class i implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UnifiTeleportTunnel f43445b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.f f43446a;

            /* renamed from: com.ui.wifiman.model.teleport.l$i$a$a, reason: collision with other inner class name */
            static final class C1465a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1465a f43447a = new C1465a();

                C1465a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.R(60000L, TimeUnit.MILLISECONDS);
                }
            }

            static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final b f43448a = new b();

                /* renamed from: com.ui.wifiman.model.teleport.l$i$a$b$a, reason: collision with other inner class name */
                static final class C1466a implements kg.n {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ L f43449a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ long f43450b;

                    /* renamed from: com.ui.wifiman.model.teleport.l$i$a$b$a$a, reason: collision with other inner class name */
                    static final class C1467a implements kg.n {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C1467a f43451a = new C1467a();

                        C1467a() {
                        }

                        @Override // kg.n
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Dj.a apply(Long it) {
                            AbstractC6492s.i(it, "it");
                            return gg.i.d2(it.longValue(), TimeUnit.MILLISECONDS);
                        }
                    }

                    /* renamed from: com.ui.wifiman.model.teleport.l$i$a$b$a$b, reason: collision with other inner class name */
                    public static final class C1468b implements C {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ L f43452a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ long f43453b;

                        public C1468b(L l10, long j10) {
                            this.f43452a = l10;
                            this.f43453b = j10;
                        }

                        @Override // gg.C
                        public final void a(InterfaceC5910A interfaceC5910A) {
                            try {
                                L l10 = this.f43452a;
                                int i10 = l10.f51687a + 1;
                                l10.f51687a = i10;
                                interfaceC5910A.onSuccess(Long.valueOf(this.f43453b * i10));
                            } catch (Throwable th2) {
                                interfaceC5910A.onError(th2);
                            }
                        }
                    }

                    C1466a(L l10, long j10) {
                        this.f43449a = l10;
                        this.f43450b = j10;
                    }

                    @Override // kg.n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Dj.a apply(Object it) {
                        AbstractC6492s.i(it, "it");
                        z zVarI = z.i(new C1468b(this.f43449a, this.f43450b));
                        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
                        return zVarI.w(C1467a.f43451a);
                    }
                }

                b() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.p0(new C1466a(new L(), 2000L));
                }
            }

            a(TeleportCloud.f fVar) {
                this.f43446a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Wc.b c(Wc.b previous, Wc.b current) {
                AbstractC6492s.i(previous, "previous");
                AbstractC6492s.i(current, "current");
                return (!(previous instanceof b.a) || (current instanceof b.a)) ? current : previous;
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Boolean connAvailable) {
                AbstractC6492s.i(connAvailable, "connAvailable");
                if (!connAvailable.booleanValue()) {
                    gg.i iVarK0 = gg.i.K0(new b.a.C0896a(new b()));
                    AbstractC6492s.f(iVarK0);
                    return iVarK0;
                }
                gg.i iVarK = this.f43446a.c().K(C1465a.f43447a);
                AbstractC6492s.h(iVarK, "repeatWhen(...)");
                gg.i iVarR1 = AbstractC5817h.e(iVarK, null, 1, null).n1(b.f43448a).r1(new InterfaceC6465b() { // from class: com.ui.wifiman.model.teleport.m
                    @Override // kg.InterfaceC6465b
                    public final Object apply(Object obj, Object obj2) {
                        return l.i.a.c((Wc.b) obj, (Wc.b) obj2);
                    }
                });
                AbstractC6492s.f(iVarR1);
                return iVarR1;
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel f43454a;

            b(UnifiTeleportTunnel unifiTeleportTunnel) {
                this.f43454a = unifiTeleportTunnel;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d apply(Wc.b fetchResult) {
                AbstractC6492s.i(fetchResult, "fetchResult");
                return new d(this.f43454a.getConfig().b(), fetchResult, null);
            }
        }

        i(UnifiTeleportTunnel unifiTeleportTunnel) {
            this.f43445b = unifiTeleportTunnel;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(TeleportCloud.f it) {
            AbstractC6492s.i(it, "it");
            return l.this.f43429h.I1(new a(it)).N0(new b(this.f43445b));
        }
    }

    public static final class j implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new LinkedHashSet());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class k implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new ConcurrentHashMap());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: com.ui.wifiman.model.teleport.l$l, reason: collision with other inner class name */
    static final class C1469l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1469l f43455a = new C1469l();

        C1469l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(List it) {
            AbstractC6492s.i(it, "it");
            Set setB = d0.b();
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                setB.add(TeleportTunnel.d.a(((com.ui.wifiman.model.teleport.n) it2.next()).a().g()));
            }
            return d0.a(setB);
        }
    }

    static final class m implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f43457a;

            /* renamed from: com.ui.wifiman.model.teleport.l$m$a$a, reason: collision with other inner class name */
            public static final class C1470a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f43458a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c.a f43459b;

                public C1470a(List list, c.a aVar) {
                    this.f43458a = list;
                    this.f43459b = aVar;
                }

                @Override // gg.q
                public final void a(gg.o oVar) {
                    Object next;
                    try {
                        AbstractC6492s.f(this.f43458a);
                        Iterator it = this.f43458a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (TeleportTunnel.d.d(((UnifiTeleportTunnel) next).getConfig().b(), this.f43459b.a())) {
                                    break;
                                }
                            }
                        }
                        UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) next;
                        if (unifiTeleportTunnel != null) {
                            oVar.onSuccess(unifiTeleportTunnel);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            a(c.a aVar) {
                this.f43457a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r apply(List tunnels) {
                AbstractC6492s.i(tunnels, "tunnels");
                gg.n nVarC = gg.n.c(new C1470a(tunnels, this.f43457a));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f43460a;

            b(l lVar) {
                this.f43460a = lVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(UnifiTeleportTunnel tunnel) {
                AbstractC6492s.i(tunnel, "tunnel");
                return this.f43460a.i(tunnel);
            }
        }

        static final class c implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f43461a;

            c(c.a aVar) {
                this.f43461a = aVar;
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(c.b stopEvent) {
                AbstractC6492s.i(stopEvent, "stopEvent");
                return TeleportTunnel.d.d(stopEvent.a(), this.f43461a.a());
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(c.a startEvent) {
            AbstractC6492s.i(startEvent, "startEvent");
            gg.i iVarW = l.this.f43422a.a().getAll().v0(new a(startEvent)).o0().w(new b(l.this));
            gg.i iVarZ0 = l.this.f43427f.Z0(c.b.class);
            AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
            return iVarW.Q1(iVarZ0.m0(new c(startEvent)));
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f43462a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(TeleportTunnel.d.a(((com.ui.wifiman.model.teleport.n) obj).a().g()), obj);
            }
            return linkedHashMap;
        }
    }

    static final class o implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map f43464a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f43465b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f43466c;

            a(Map map, d dVar, l lVar) {
                this.f43464a = map;
                this.f43465b = dVar;
                this.f43466c = lVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(a.C0428a console) {
                Kd.a aVarA;
                AbstractC6492s.i(console, "console");
                com.ui.wifiman.model.teleport.n nVar = (com.ui.wifiman.model.teleport.n) this.f43464a.get(TeleportTunnel.d.a(this.f43465b.b()));
                return !AbstractC6492s.d((nVar == null || (aVarA = nVar.a()) == null) ? null : aVarA.c(), console) ? this.f43466c.f43423b.d(this.f43465b.b(), console) : AbstractC5912b.m();
            }
        }

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Map map = (Map) sVar.a();
            d dVar = (d) sVar.c();
            Wc.b bVarA = dVar.a();
            if ((bVarA instanceof b.c) || (bVarA instanceof b.C0898b) || (bVarA instanceof b.a.C0896a)) {
                return AbstractC5912b.m();
            }
            if (bVarA instanceof b.a.C0897b) {
                return l.this.f43424c.a(dVar.b(), (TeleportCloud.b) ((b.a.C0897b) dVar.a()).b()).t(new a(map, dVar, l.this));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class p implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f43468a;

            /* renamed from: com.ui.wifiman.model.teleport.l$p$a$a, reason: collision with other inner class name */
            static final class C1471a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Set f43469a;

                C1471a(Set set) {
                    this.f43469a = set;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(c event) {
                    AbstractC6492s.i(event, "event");
                    Set set = this.f43469a;
                    AbstractC6492s.f(set);
                    Set set2 = this.f43469a;
                    synchronized (set) {
                        try {
                            if (event instanceof c.a) {
                                set2.add(TeleportTunnel.d.a(((c.a) event).a()));
                            } else {
                                if (!(event instanceof c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                set2.remove(TeleportTunnel.d.a(((c.b) event).a()));
                            }
                            J j10 = J.f24997a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }

            a(Set set) {
                this.f43468a = set;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Set idsToSync) {
                DefaultConstructorMarker defaultConstructorMarker;
                List listA;
                AbstractC6492s.i(idsToSync, "idsToSync");
                Set set = this.f43468a;
                AbstractC6492s.f(set);
                Set set2 = this.f43468a;
                synchronized (set) {
                    try {
                        HashSet hashSet = new HashSet();
                        List listC = AbstractC3689v.c();
                        Iterator it = idsToSync.iterator();
                        while (true) {
                            defaultConstructorMarker = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            String strG = ((TeleportTunnel.d) it.next()).g();
                            hashSet.add(TeleportTunnel.d.a(strG));
                            if (!set2.contains(TeleportTunnel.d.a(strG))) {
                                listC.add(new c.a(strG, defaultConstructorMarker));
                            }
                        }
                        AbstractC6492s.f(set2);
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            String strG2 = ((TeleportTunnel.d) it2.next()).g();
                            if (!hashSet.contains(TeleportTunnel.d.a(strG2))) {
                                listC.add(new c.b(strG2, defaultConstructorMarker));
                            }
                        }
                        listA = AbstractC3689v.a(listC);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Ag.b.b(listA).f0(new C1471a(this.f43468a));
            }
        }

        p() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Set startedIds) {
            AbstractC6492s.i(startedIds, "startedIds");
            return l.this.f43426e.B(new a(startedIds));
        }
    }

    static final class q implements kg.n {

        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43471a = new a();

            a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConcurrentHashMap apply(ConcurrentHashMap map, d fetch) {
                AbstractC6492s.i(map, "map");
                AbstractC6492s.i(fetch, "fetch");
                map.put(TeleportTunnel.d.a(fetch.b()), fetch);
                return map;
            }
        }

        q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(ConcurrentHashMap resultMap) {
            AbstractC6492s.i(resultMap, "resultMap");
            return l.this.f43430i.q1(resultMap, a.f43471a);
        }
    }

    public l(D teleportManager, InterfaceC2985a unifiTeleport, Kd.d tunnelRecordStorage, Kd.b tunnelRecordFactory, Zc.f networkConnection) {
        AbstractC6492s.i(teleportManager, "teleportManager");
        AbstractC6492s.i(unifiTeleport, "unifiTeleport");
        AbstractC6492s.i(tunnelRecordStorage, "tunnelRecordStorage");
        AbstractC6492s.i(tunnelRecordFactory, "tunnelRecordFactory");
        AbstractC6492s.i(networkConnection, "networkConnection");
        this.f43422a = unifiTeleport;
        this.f43423b = tunnelRecordStorage;
        this.f43424c = tunnelRecordFactory;
        this.f43425d = networkConnection;
        gg.i iVarI2 = teleportManager.getAll().N0(C1469l.f43455a).e1().W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43426e = iVarI2;
        z zVarI = z.i(new j());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI22 = zVarI.w(new p()).h1().i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43427f = iVarI22;
        z zVarI2 = z.i(new k());
        AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI23 = zVarI2.w(new q()).U1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).z1(new ConcurrentHashMap()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43428g = iVarI23;
        gg.i iVarI24 = networkConnection.getState().N0(f.f43441a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f43429h = iVarI24;
        gg.i iVarZ0 = iVarI22.Z0(c.a.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarI25 = iVarZ0.p0(new m()).h1().i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f43430i = iVarI25;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarN0 = teleportManager.getAll().N0(n.f43462a);
        AbstractC6492s.h(iVarN0, "map(...)");
        AbstractC5912b abstractC5912bL1 = cVar.a(iVarN0, iVarI25).L1(new o());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f43431j = abstractC5912bL1;
        gg.i iVarI26 = gg.i.v(teleportManager.getAll(), iVarI23, e.f43439a).e1().X0(Gg.a.a()).U0(abstractC5912bL1).W().o1(1).i2();
        AbstractC6492s.h(iVarI26, "refCount(...)");
        this.f43432k = iVarI26;
        gg.i iVarI27 = gg.i.v(teleportManager.a().N0(g.f43442a).W(), getAll(), h.f43443a).o1(1).i2();
        AbstractC6492s.h(iVarI27, "refCount(...)");
        this.f43433l = iVarI27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i i(UnifiTeleportTunnel unifiTeleportTunnel) {
        gg.i iVarW = this.f43422a.d().b(unifiTeleportTunnel.getConfig().a()).w(new i(unifiTeleportTunnel));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    @Override // com.ui.wifiman.model.teleport.k
    public gg.i getAll() {
        return this.f43432k;
    }
}
