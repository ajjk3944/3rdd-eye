package com.ui.wifiman.model.teleport;

import Fd.D;
import I7.InterfaceC2985a;
import Kd.a;
import Yg.s;
import Yg.y;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.TeleportTunnelManager;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.cloud.sso.b;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.o;
import gg.q;
import gg.r;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kg.InterfaceC6465b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class j implements D {

    /* renamed from: a, reason: collision with root package name */
    private final TeleportSession f43371a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2985a f43372b;

    /* renamed from: c, reason: collision with root package name */
    private final Kd.d f43373c;

    /* renamed from: d, reason: collision with root package name */
    private final Kd.b f43374d;

    /* renamed from: e, reason: collision with root package name */
    private final Ld.f f43375e;

    /* renamed from: f, reason: collision with root package name */
    private final UiSSOAccountManager f43376f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43377g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43378h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43379i;

    static final class a implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43380a = new a();

        /* renamed from: com.ui.wifiman.model.teleport.j$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1462a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43381a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.INVITATION_LINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.API.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43381a = iArr;
            }
        }

        a() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(List records, List tunnels, Set ssoConsoleId) {
            AbstractC6492s.i(records, "records");
            AbstractC6492s.i(tunnels, "tunnels");
            AbstractC6492s.i(ssoConsoleId, "ssoConsoleId");
            List list = tunnels;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(TeleportTunnel.d.a(((UnifiTeleportTunnel) obj).getConfig().b()), obj);
            }
            List listC = AbstractC3689v.c();
            Iterator it = records.iterator();
            while (it.hasNext()) {
                Kd.a aVar = (Kd.a) it.next();
                int i10 = C1462a.f43381a[aVar.d().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (ssoConsoleId.contains(e.b.a(aVar.c().b())) || aVar.c().a()) {
                    }
                }
                UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) linkedHashMap.get(TeleportTunnel.d.a(aVar.g()));
                if (unifiTeleportTunnel != null) {
                    listC.add(new n(aVar, unifiTeleportTunnel));
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43382a = new b();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43383a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set apply(List it) {
                AbstractC6492s.i(it, "it");
                Set setB = d0.b();
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    setB.add(e.b.a(((com.ui.wifiman.model.ubiquiti.console.e) it2.next()).f()));
                }
                return d0.a(setB);
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            gg.i iVarA;
            gg.i iVarN0;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarA = bVarD.a()) == null || (iVarN0 = iVarA.N0(a.f43383a)) == null) ? gg.i.K0(d0.e()) : iVarN0;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43384a;

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f43385a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f43386b;

            public a(String str, String str2) {
                this.f43385a = str;
                this.f43386b = str2;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    Z7.b.e("No Tunnel found for console ID '" + this.f43385a + "'", null, null, 6, null);
                    String str = this.f43386b;
                    TeleportTunnel.d dVarA = str != null ? TeleportTunnel.d.a(str) : null;
                    if (dVarA != null) {
                        oVar.onSuccess(dVarA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        c(String str) {
            this.f43384a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            TeleportTunnel.d dVar = (TeleportTunnel.d) c6556a.a();
            gg.n nVarC = gg.n.c(new a(this.f43384a, dVar != null ? dVar.g() : null));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class d implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f43388a;

            a(String str) {
                this.f43388a = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(List tunnels) {
                Object next;
                AbstractC6492s.i(tunnels, "tunnels");
                String str = this.f43388a;
                Iterator it = tunnels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (TeleportTunnel.d.d(((UnifiTeleportTunnel) next).getConfig().b(), str)) {
                        break;
                    }
                }
                return new C6556a(next);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f43389a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f43390b;

            public static final class a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f43391a;

                public a(String str) {
                    this.f43391a = str;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.h("Tunnel '" + TeleportTunnel.d.f(this.f43391a) + "' was not found. Can't delete", null, 2, null);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            b(j jVar, String str) {
                this.f43389a = jVar;
                this.f43390b = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
                if (unifiTeleportTunnel != null) {
                    return this.f43389a.f43372b.a().e(unifiTeleportTunnel);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(this.f43390b));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        d() {
        }

        public final gg.f a(String tunnelId) {
            AbstractC6492s.i(tunnelId, "tunnelId");
            AbstractC5912b abstractC5912bT = j.this.f43372b.a().getAll().N0(new a(tunnelId)).o0().t(new b(j.this, tunnelId));
            Kd.d dVar = j.this.f43373c;
            AbstractC6492s.f(TeleportTunnel.d.a(tunnelId));
            return AbstractC5912b.I(abstractC5912bT, dVar.b(tunnelId));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((TeleportTunnel.d) obj).g());
        }
    }

    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43392a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a, List teleports) {
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(teleports, "teleports");
            e.b bVar = (e.b) c6556a.a();
            Object obj = null;
            String strN = bVar != null ? bVar.n() : null;
            String strB = strN != null ? TeleportTunnel.d.b(strN) : null;
            if (strB != null) {
                Iterator it = teleports.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (TeleportTunnel.d.d(((n) next).b().getConfig().b(), strB)) {
                        obj = next;
                        break;
                    }
                }
                obj = (n) obj;
            }
            return new C6556a(obj);
        }
    }

    static final class f implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e.b f43394b;

        f(TeleportCloud.e.b bVar) {
            this.f43394b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(TeleportCloud.f cloud) {
            AbstractC6492s.i(cloud, "cloud");
            return j.this.f43372b.b().d(new UnifiTeleportTunnel.a(TeleportTunnel.d.b(this.f43394b.a()), cloud.f(), null));
        }
    }

    static final class g implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e.b f43396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.b f43397c;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnifiTeleportTunnel f43398a;

            a(UnifiTeleportTunnel unifiTeleportTunnel) {
                this.f43398a = unifiTeleportTunnel;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n apply(Kd.a record) {
                AbstractC6492s.i(record, "record");
                UnifiTeleportTunnel unifiTeleportTunnel = this.f43398a;
                AbstractC6492s.f(unifiTeleportTunnel);
                return new n(record, unifiTeleportTunnel);
            }
        }

        g(TeleportCloud.e.b bVar, TeleportCloud.b bVar2) {
            this.f43396b = bVar;
            this.f43397c = bVar2;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(UnifiTeleportTunnel tunnel) {
            AbstractC6492s.i(tunnel, "tunnel");
            return j.this.f43374d.b(tunnel.getConfig().b(), this.f43396b, null, this.f43397c).A(new a(tunnel));
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43399a = new h();

        public static final class a implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ld.e f43400a;

            public a(Ld.e eVar) {
                this.f43400a = eVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    Ld.e eVar = this.f43400a;
                    if (eVar == null) {
                        throw TeleportConnection.Error.NoSSOAccount.f43199a;
                    }
                    interfaceC5910A.onSuccess(eVar);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            z zVarI = z.i(new a((Ld.e) c6556a.a()));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    static final class i implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43402b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43403a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(y yVar) {
                AbstractC6492s.i(yVar, "<destruct>");
                Object objA = yVar.a();
                AbstractC6492s.h(objA, "component1(...)");
                Object objC = yVar.c();
                AbstractC6492s.h(objC, "component2(...)");
                String str = (String) objC;
                Object objD = yVar.d();
                AbstractC6492s.h(objD, "component3(...)");
                return ((Td.a) objD).c(str, (String) objA);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f43404a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f43405b;

            b(j jVar, String str) {
                this.f43404a = jVar;
                this.f43405b = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(Vd.d auth) {
                AbstractC6492s.i(auth, "auth");
                return this.f43404a.f43372b.b().d(new UnifiTeleportTunnel.a(TeleportTunnel.d.b(this.f43405b), new TeleportCloud.e.a(auth.a(), auth.b()), null));
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f43406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ld.e f43407b;

            static final class a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final a f43408a = new a();

                a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.D apply(TeleportCloud.f it) {
                    AbstractC6492s.i(it, "it");
                    return it.c();
                }
            }

            static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f43409a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel f43410b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ld.e f43411c;

                b(j jVar, UnifiTeleportTunnel unifiTeleportTunnel, Ld.e eVar) {
                    this.f43409a = jVar;
                    this.f43410b = unifiTeleportTunnel;
                    this.f43411c = eVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.D apply(TeleportCloud.b it) {
                    AbstractC6492s.i(it, "it");
                    return this.f43409a.f43374d.b(this.f43410b.getConfig().b(), null, this.f43411c.a(), it);
                }
            }

            /* renamed from: com.ui.wifiman.model.teleport.j$i$c$c, reason: collision with other inner class name */
            static final class C1463c implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel f43412a;

                C1463c(UnifiTeleportTunnel unifiTeleportTunnel) {
                    this.f43412a = unifiTeleportTunnel;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n apply(Kd.a tunnelRecord) {
                    AbstractC6492s.i(tunnelRecord, "tunnelRecord");
                    UnifiTeleportTunnel unifiTeleportTunnel = this.f43412a;
                    AbstractC6492s.f(unifiTeleportTunnel);
                    return new n(tunnelRecord, unifiTeleportTunnel);
                }
            }

            c(j jVar, Ld.e eVar) {
                this.f43406a = jVar;
                this.f43407b = eVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(UnifiTeleportTunnel tunnel) {
                AbstractC6492s.i(tunnel, "tunnel");
                return this.f43406a.f43372b.d().b(tunnel.getConfig().a()).s(a.f43408a).s(new b(this.f43406a, tunnel, this.f43407b)).A(new C1463c(tunnel));
            }
        }

        i(String str) {
            this.f43402b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(Ld.e session) {
            AbstractC6492s.i(session, "session");
            Ag.e eVar = Ag.e.f756a;
            z clientId = j.this.f43371a.getClientId();
            z zVarF = j.this.f43371a.f();
            z zVarO0 = session.c().b(this.f43402b).o0();
            AbstractC6492s.h(zVarO0, "firstOrError(...)");
            return eVar.b(clientId, zVarF, zVarO0).s(a.f43403a).s(new b(j.this, this.f43402b)).s(new c(j.this, session));
        }
    }

    /* renamed from: com.ui.wifiman.model.teleport.j$j, reason: collision with other inner class name */
    static final class C1464j implements kg.n {

        /* renamed from: com.ui.wifiman.model.teleport.j$j$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f43414a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f43415b;

            a(j jVar, String str) {
                this.f43414a = jVar;
                this.f43415b = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(List tunnels) {
                Object next;
                AbstractC6492s.i(tunnels, "tunnels");
                TeleportTunnelManager teleportTunnelManagerA = this.f43414a.f43372b.a();
                String str = this.f43415b;
                Iterator it = tunnels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (str == null ? false : TeleportTunnel.d.d(((UnifiTeleportTunnel) next).getConfig().b(), str)) {
                        break;
                    }
                }
                return teleportTunnelManagerA.b((TeleportTunnel) next);
            }
        }

        C1464j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            TeleportTunnel.d dVar = (TeleportTunnel.d) c6556a.a();
            return j.this.f43372b.a().getAll().o0().t(new a(j.this, dVar != null ? dVar.g() : null));
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f43416a = new k();

        static final class a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43417a = new a();

            a() {
            }

            public final UUID a(com.ui.wifiman.model.ubiquiti.cloud.sso.b it) {
                AbstractC6492s.i(it, "it");
                return it.e();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b.a.a(a((com.ui.wifiman.model.ubiquiti.cloud.sso.b) obj));
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(List accounts) {
            AbstractC6492s.i(accounts, "accounts");
            return AbstractC8783m.b0(AbstractC8783m.N(AbstractC3689v.d0(accounts), a.f43417a));
        }
    }

    static final class l implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f43419a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f43420b;

            a(Set set, j jVar) {
                this.f43419a = set;
                this.f43420b = jVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(s sVar) {
                AbstractC5912b abstractC5912bQ;
                Object next;
                AbstractC6492s.i(sVar, "<destruct>");
                List list = (List) sVar.a();
                List list2 = (List) sVar.c();
                Set set = this.f43419a;
                ArrayList<Kd.a> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    Kd.a aVar = (Kd.a) next2;
                    if (aVar.f() != null) {
                        UUID uuidF = aVar.f();
                        if (!set.contains(uuidF != null ? b.a.a(uuidF) : null)) {
                            arrayList.add(next2);
                        }
                    }
                }
                ArrayList<UnifiTeleportTunnel> arrayList2 = new ArrayList();
                for (Kd.a aVar2 : arrayList) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (TeleportTunnel.d.d(((UnifiTeleportTunnel) next).getConfig().b(), aVar2.g())) {
                            break;
                        }
                    }
                    UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) next;
                    if (unifiTeleportTunnel != null) {
                        arrayList2.add(unifiTeleportTunnel);
                    }
                }
                j jVar = this.f43420b;
                ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
                for (UnifiTeleportTunnel unifiTeleportTunnel2 : arrayList2) {
                    arrayList3.add(AbstractC5912b.p(jVar.f43372b.a().e(unifiTeleportTunnel2), jVar.f43373c.b(unifiTeleportTunnel2.getConfig().b())));
                }
                ArrayList arrayList4 = arrayList3.isEmpty() ? null : arrayList3;
                return (arrayList4 == null || (abstractC5912bQ = AbstractC5912b.q(arrayList4)) == null) ? AbstractC5912b.m() : abstractC5912bQ;
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Set allSsoAccountIds) {
            AbstractC6492s.i(allSsoAccountIds, "allSsoAccountIds");
            return Ag.c.f753a.a(j.this.f43373c.getAll(), j.this.f43372b.a().getAll()).o0().t(new a(allSsoAccountIds, j.this));
        }
    }

    public j(TeleportSession teleportSession, InterfaceC2985a unifiTeleport, Kd.d tunnelRecordStorage, Kd.b recordFactory, Ld.f cloudSessionService, UiSSOAccountManager ssoAccountManager) {
        AbstractC6492s.i(teleportSession, "teleportSession");
        AbstractC6492s.i(unifiTeleport, "unifiTeleport");
        AbstractC6492s.i(tunnelRecordStorage, "tunnelRecordStorage");
        AbstractC6492s.i(recordFactory, "recordFactory");
        AbstractC6492s.i(cloudSessionService, "cloudSessionService");
        AbstractC6492s.i(ssoAccountManager, "ssoAccountManager");
        this.f43371a = teleportSession;
        this.f43372b = unifiTeleport;
        this.f43373c = tunnelRecordStorage;
        this.f43374d = recordFactory;
        this.f43375e = cloudSessionService;
        this.f43376f = ssoAccountManager;
        gg.i iVarW = cloudSessionService.a().I1(b.f43382a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f43377g = iVarW;
        gg.i iVarI2 = gg.i.u(tunnelRecordStorage.getAll(), unifiTeleport.a().getAll(), iVarW, a.f43380a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43378h = iVarI2;
        gg.i iVarI22 = gg.i.v(teleportSession.c(), getAll(), e.f43392a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43379i = iVarI22;
    }

    @Override // Fd.D
    public gg.i a() {
        return this.f43379i;
    }

    @Override // Fd.D
    public AbstractC5912b b(String str) {
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(this.f43371a.g(str), (str != null ? this.f43373c.c(str) : z.z(new C6556a(null))).t(new C1464j()));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    @Override // Fd.D
    public AbstractC5912b c() {
        AbstractC5912b abstractC5912bL1 = this.f43376f.a().N0(k.f43416a).W().L1(new l());
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        return abstractC5912bL1;
    }

    @Override // Fd.D
    public AbstractC5912b d(n teleport) {
        AbstractC6492s.i(teleport, "teleport");
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(this.f43372b.a().c(teleport.b()), this.f43373c.a(teleport.a()), b(teleport.a().c().b()));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    @Override // Fd.D
    public z e(String consoleId) {
        AbstractC6492s.i(consoleId, "consoleId");
        z zVarS = this.f43375e.a().x0(h.f43399a).o0().s(new i(consoleId));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    @Override // Fd.D
    public z f(TeleportCloud.e.b publicSecret, TeleportCloud.b siteState) {
        AbstractC6492s.i(publicSecret, "publicSecret");
        AbstractC6492s.i(siteState, "siteState");
        z zVarS = this.f43372b.d().b(publicSecret).s(new f(publicSecret)).s(new g(publicSecret, siteState));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    @Override // Fd.D
    public AbstractC5912b g(String id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bK = this.f43373c.c(id2).u(new c(id2)).k(new d());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        return abstractC5912bK;
    }

    @Override // Fd.D
    public gg.i getAll() {
        return this.f43378h;
    }
}
