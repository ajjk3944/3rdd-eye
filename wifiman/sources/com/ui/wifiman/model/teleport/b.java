package com.ui.wifiman.model.teleport;

import Fd.C;
import Fd.D;
import I7.InterfaceC2985a;
import P7.c;
import Yg.J;
import Yg.z;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.b;
import com.ui.wifiman.model.teleport.n;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.N;
import l9.C6556a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class b implements TeleportConnection {

    /* renamed from: m, reason: collision with root package name */
    public static final a f43237m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2985a f43238a;

    /* renamed from: b, reason: collision with root package name */
    private final D f43239b;

    /* renamed from: c, reason: collision with root package name */
    private final C f43240c;

    /* renamed from: d, reason: collision with root package name */
    private final TeleportSession f43241d;

    /* renamed from: e, reason: collision with root package name */
    private final P7.a f43242e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.c f43243f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f43244g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43245h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f43246i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f43247j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f43248k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC5912b f43249l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.teleport.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC1445b {

        /* renamed from: com.ui.wifiman.model.teleport.b$b$a */
        public static final class a extends AbstractC1445b {

            /* renamed from: a, reason: collision with root package name */
            private final TeleportConnection.Error f43250a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TeleportConnection.Error error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f43250a = error;
            }

            public final TeleportConnection.Error a() {
                return this.f43250a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f43250a, ((a) obj).f43250a);
            }

            public int hashCode() {
                return this.f43250a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f43250a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.b$b$b, reason: collision with other inner class name */
        public static final class C1446b extends AbstractC1445b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1446b f43251a = new C1446b();

            private C1446b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1446b);
            }

            public int hashCode() {
                return 2018471265;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.b$b$c */
        public static final class c extends AbstractC1445b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f43252a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -826143788;
            }

            public String toString() {
                return "Started";
            }
        }

        public /* synthetic */ AbstractC1445b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1445b() {
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(TeleportConnection.a tunnelState) {
            AbstractC6492s.i(tunnelState, "tunnelState");
            return z.a(Float.valueOf(tunnelState.a()), Long.valueOf(b.this.v(tunnelState)));
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f43254a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f43255b;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f43256a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f43257b;

            a(K k10, float f10) {
                this.f43256a = k10;
                this.f43257b = f10;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Long it) {
                AbstractC6492s.i(it, "it");
                this.f43256a.f51686a += this.f43257b;
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.b$d$b, reason: collision with other inner class name */
        static final class C1447b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f43258a;

            C1447b(K k10) {
                this.f43258a = k10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float apply(Long it) {
                AbstractC6492s.i(it, "it");
                return Float.valueOf(this.f43258a.f51686a);
            }
        }

        d(N n10, long j10) {
            this.f43254a = n10;
            this.f43255b = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            float fFloatValue = ((Number) sVar.a()).floatValue();
            long jLongValue = ((Number) sVar.c()).longValue();
            K k10 = new K();
            Float f10 = (Float) this.f43254a.f51689a;
            float fFloatValue2 = f10 != null ? f10.floatValue() : fFloatValue;
            k10.f51686a = fFloatValue2;
            if (fFloatValue2 >= fFloatValue) {
                return fFloatValue2 > fFloatValue ? gg.i.K0(Float.valueOf(fFloatValue)) : gg.i.K0(Float.valueOf(fFloatValue));
            }
            long jMax = Math.max(1L, jLongValue / this.f43255b);
            return gg.i.I0(0L, jMax, 0L, this.f43255b, TimeUnit.MILLISECONDS).f0(new a(k10, (fFloatValue - k10.f51686a) / jMax)).N0(new C1447b(k10)).M(gg.z.z(Float.valueOf(fFloatValue)));
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f43259a;

        e(N n10) {
            this.f43259a = n10;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Float latestProgress) {
            AbstractC6492s.i(latestProgress, "latestProgress");
            this.f43259a.f51689a = latestProgress;
        }
    }

    static final class f implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43261a = new a();

            /* renamed from: com.ui.wifiman.model.teleport.b$f$a$a, reason: collision with other inner class name */
            static final class C1448a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UnifiTeleportTunnel f43262a;

                C1448a(UnifiTeleportTunnel unifiTeleportTunnel) {
                    this.f43262a = unifiTeleportTunnel;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.h("TeleportConnection - Cancelling Tunnel[" + this.f43262a.getConfig().b() + "] connection", null, 2, null);
                }
            }

            /* renamed from: com.ui.wifiman.model.teleport.b$f$a$b, reason: collision with other inner class name */
            public static final class C1449b implements InterfaceC5915e {
                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Z7.b.h("TeleportConnection - There is no tunnel to cancel", null, 2, null);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(UnifiTeleportTunnel unifiTeleportTunnel) {
                Z7.b.h("TeleportConnection - Cancelled Tunnel[" + unifiTeleportTunnel.getConfig().b() + "] connection", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(C6556a c6556a) {
                AbstractC5912b abstractC5912bW;
                AbstractC6492s.i(c6556a, "<destruct>");
                final UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
                if (unifiTeleportTunnel != null && (abstractC5912bW = unifiTeleportTunnel.close().B(new C1448a(unifiTeleportTunnel)).w(new InterfaceC6464a() { // from class: com.ui.wifiman.model.teleport.c
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        b.f.a.c(unifiTeleportTunnel);
                    }
                })) != null) {
                    return abstractC5912bW;
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1449b());
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(J j10) {
            return b.this.w().a().a().o0().t(a.f43261a);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43263a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(TeleportSession.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43264a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean vpnProfileCreated) {
            AbstractC6492s.i(vpnProfileCreated, "vpnProfileCreated");
            return vpnProfileCreated.booleanValue() ? AbstractC5912b.m() : AbstractC5912b.D(TeleportConnection.Error.NoVpnProfile.f43200a);
        }
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43265a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("TeleportConnection - Connect SUBSCRIBED", null, 2, null);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43266a = new j();

        public static final class a implements gg.C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.teleport.h f43267a;

            public a(com.ui.wifiman.model.teleport.h hVar) {
                this.f43267a = hVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    com.ui.wifiman.model.teleport.h hVar = this.f43267a;
                    if (hVar == null) {
                        throw TeleportConnection.Error.NoMainConsole.f43198a;
                    }
                    interfaceC5910A.onSuccess(hVar);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.z zVarI = gg.z.i(new a((com.ui.wifiman.model.teleport.h) c6556a.a()));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    static final class k implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.teleport.h f43269a;

            a(com.ui.wifiman.model.teleport.h hVar) {
                this.f43269a = hVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(List it) {
                Object next;
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.teleport.h hVar = this.f43269a;
                Iterator it2 = it.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    String strG = ((com.ui.wifiman.model.teleport.n) next).a().g();
                    String strZ = hVar.z();
                    if (strZ == null ? false : TeleportTunnel.d.d(strG, strZ)) {
                        break;
                    }
                }
                return new C6556a(next);
            }
        }

        /* renamed from: com.ui.wifiman.model.teleport.b$k$b, reason: collision with other inner class name */
        static final class C1450b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f43270a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.teleport.h f43271b;

            /* renamed from: com.ui.wifiman.model.teleport.b$k$b$a */
            static final class a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final a f43272a = new a();

                a() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(com.ui.wifiman.model.teleport.n it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.h("TeleportConnection - Tunnel [" + it.a().g() + "] created", null, 2, null);
                }
            }

            C1450b(b bVar, com.ui.wifiman.model.teleport.h hVar) {
                this.f43270a = bVar;
                this.f43271b = hVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC5912b d(b bVar, final com.ui.wifiman.model.teleport.n newTeleport) {
                AbstractC6492s.i(newTeleport, "newTeleport");
                AbstractC5912b abstractC5912bX = bVar.f43239b.d(newTeleport).x(new InterfaceC6464a() { // from class: com.ui.wifiman.model.teleport.d
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        b.k.C1450b.e(newTeleport);
                    }
                });
                AbstractC6492s.h(abstractC5912bX, "doOnComplete(...)");
                return abstractC5912bX;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(com.ui.wifiman.model.teleport.n nVar) {
                Z7.b.h("TeleportConnection - Tunnel [" + nVar.a().g() + "] stored", null, 2, null);
            }

            @Override // kg.n
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final gg.D apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                com.ui.wifiman.model.teleport.n nVar = (com.ui.wifiman.model.teleport.n) c6556a.a();
                if (nVar == null) {
                    Z7.b.h("TeleportConnection - No tunnel found. Creating new one.", null, 2, null);
                    gg.z zVarO = this.f43270a.f43239b.e(this.f43271b.j()).o(a.f43272a);
                    AbstractC6492s.h(zVarO, "doOnSuccess(...)");
                    final b bVar = this.f43270a;
                    return n9.c.d(zVarO, new InterfaceC6835l() { // from class: com.ui.wifiman.model.teleport.e
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return b.k.C1450b.d(bVar, (n) obj);
                        }
                    });
                }
                Z7.b.h("TeleportConnection - Using tunnel " + TeleportTunnel.d.f(nVar.a().g()), null, 2, null);
                gg.z zVarZ = gg.z.z(nVar);
                AbstractC6492s.f(zVarZ);
                return zVarZ;
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(com.ui.wifiman.model.teleport.h console) {
            gg.z zVarZ;
            AbstractC6492s.i(console, "console");
            Z7.b.h("TeleportConnection - Connect requested for console " + console.l() + "[" + console.j() + "]", null, 2, null);
            n.b bVarY = console.y();
            if ((bVarY instanceof n.b.C1474b) || (bVarY instanceof n.b.a.C1473b)) {
                zVarZ = gg.z.z(new C6556a(null));
            } else {
                if (!(bVarY instanceof n.b.a.d) && !(bVarY instanceof n.b.a.c) && !(bVarY instanceof n.b.a.C1472a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zVarZ = b.this.f43239b.getAll().o0().A(new a(console));
            }
            return zVarZ.s(new C1450b(b.this, console));
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f43273a = new l();

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.teleport.n f43274a;

            a(com.ui.wifiman.model.teleport.n nVar) {
                this.f43274a = nVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("TeleportConnection - Opening tunnel [" + this.f43274a.a().g() + "] Subscribed", null, 2, null);
            }
        }

        l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(com.ui.wifiman.model.teleport.n nVar) {
            Z7.b.h("TeleportConnection - Opening tunnel [" + nVar.a().g() + "] Finished", null, 2, null);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(final com.ui.wifiman.model.teleport.n tunnel) {
            AbstractC6492s.i(tunnel, "tunnel");
            return UnifiTeleportTunnel.c.b(tunnel.b(), 1280, null, 2, null).B(new a(tunnel)).w(new InterfaceC6464a() { // from class: com.ui.wifiman.model.teleport.f
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.l.c(tunnel);
                }
            });
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f43275a = new m();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f43276a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(UnifiTeleportTunnel.d tunnelState) {
                AbstractC6492s.i(tunnelState, "tunnelState");
                return new C6556a(tunnelState);
            }
        }

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i state;
            gg.i iVarN0;
            AbstractC6492s.i(c6556a, "<destruct>");
            UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
            return (unifiTeleportTunnel == null || (state = unifiTeleportTunnel.getState()) == null || (iVarN0 = state.N0(a.f43276a)) == null) ? gg.i.K0(new C6556a(null)) : iVarN0;
        }
    }

    static final class n implements InterfaceC6465b {
        n() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportConnection.a apply(C6556a c6556a, AbstractC1445b userInitiatedConnectionState) {
            TeleportConnection.a aVarN;
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(userInitiatedConnectionState, "userInitiatedConnectionState");
            UnifiTeleportTunnel.d dVar = (UnifiTeleportTunnel.d) c6556a.a();
            if (dVar instanceof UnifiTeleportTunnel.d.c.a) {
                return b.this.n(dVar);
            }
            boolean z10 = userInitiatedConnectionState instanceof AbstractC1445b.a;
            if (z10) {
                return b.this.o(userInitiatedConnectionState);
            }
            if ((dVar instanceof UnifiTeleportTunnel.d.a) || (dVar instanceof UnifiTeleportTunnel.d.b)) {
                return b.this.n(dVar);
            }
            if (!(dVar instanceof UnifiTeleportTunnel.d.c) && dVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (userInitiatedConnectionState instanceof AbstractC1445b.C1446b) {
                UnifiTeleportTunnel.d.c cVar = (UnifiTeleportTunnel.d.c) dVar;
                return (cVar == null || (aVarN = b.this.n(cVar)) == null) ? b.this.o(userInitiatedConnectionState) : aVarN;
            }
            if ((userInitiatedConnectionState instanceof AbstractC1445b.c) || z10) {
                return b.this.o(userInitiatedConnectionState);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final o f43278a = new o();

        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(TeleportConnection.a state) {
            AbstractC6492s.i(state, "state");
            if (state instanceof TeleportConnection.a.b) {
                return;
            }
            if (!(state instanceof TeleportConnection.a.C1439a)) {
                throw new NoWhenBranchMatchedException();
            }
            TeleportConnection.a.C1439a c1439a = (TeleportConnection.a.C1439a) state;
            if (c1439a.b() != null) {
                Z7.b.e("Teleport connection failed", c1439a.b(), null, 4, null);
            }
        }
    }

    static final class p implements kg.p {
        p() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(TeleportConnection.a it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof TeleportConnection.a.b.C1440a) {
                b.this.f43242e.b(c.p.C0637c.f18186c);
                return true;
            }
            if ((it instanceof TeleportConnection.a.b.AbstractC1441b) || (it instanceof TeleportConnection.a.C1439a)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class q implements InterfaceC6469f {
        q() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            b.this.z(error);
            if ((error instanceof TeleportConnection.Error.NoVpnProfile) || (error instanceof TeleportConnection.Error.NoMainConsole) || (error instanceof TeleportConnection.Error.NoSSOAccount) || (error instanceof TeleportConnection.Error.CancelledByUser)) {
                b.this.f43244g.h(AbstractC1445b.C1446b.f43251a);
                return;
            }
            if (error instanceof TeleportConnection.Error.ConsoleConnection) {
                b.this.f43244g.h(new AbstractC1445b.a((TeleportConnection.Error) error));
                return;
            }
            if (error instanceof TeleportConnection.Error.Cloud) {
                b.this.f43244g.h(new AbstractC1445b.a((TeleportConnection.Error) error));
            } else if (error instanceof TeleportConnection.Error.Tunnel) {
                b.this.f43244g.h(new AbstractC1445b.a((TeleportConnection.Error) error));
            } else {
                Z7.b.j("TeleportConnection - unexpected error occurred", error, null, 4, null);
            }
        }
    }

    static final class r implements InterfaceC6469f {
        r() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            b.this.f43244g.h(AbstractC1445b.c.f43252a);
        }
    }

    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final s f43282a = new s();

        s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportConnection.Error.CancelledByUser)) {
                return AbstractC5912b.D(error);
            }
            Z7.b.h("TeleportConnection - Connection interrupted by user", null, 2, null);
            return AbstractC5912b.m();
        }
    }

    public static final class t implements InterfaceC5915e {
        public t() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                b.this.f43243f.h(J.f24997a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class u implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final u f43284a = new u();

        u() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("TeleportConnection - Disconnect SUBSCRIBED", null, 2, null);
        }
    }

    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final v f43285a = new v();

        v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportConnection.Error.CancelledByUser ? AbstractC5912b.m() : AbstractC5912b.D(error);
        }
    }

    static final class w implements kg.n {
        w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            TeleportConnection.Error errorX = b.this.x(error);
            if (errorX != null) {
                error = errorX;
            }
            return AbstractC5912b.D(error);
        }
    }

    static final class x implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final x f43287a = new x();

        x() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportConnection.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            TeleportConnection.a aVar = (TeleportConnection.a) sVar.a();
            float fFloatValue = ((Number) sVar.c()).floatValue();
            if (aVar.a() == fFloatValue || (aVar instanceof TeleportConnection.a.C1439a) || (aVar instanceof TeleportConnection.a.b.C1440a)) {
                return aVar;
            }
            if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.c) {
                return ((TeleportConnection.a.b.AbstractC1441b.c) aVar).b(fFloatValue);
            }
            if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1442a) {
                return ((TeleportConnection.a.b.AbstractC1441b.C1442a) aVar).b(fFloatValue);
            }
            if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1443b) {
                return ((TeleportConnection.a.b.AbstractC1441b.C1443b) aVar).b(fFloatValue);
            }
            if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.e) {
                return ((TeleportConnection.a.b.AbstractC1441b.e) aVar).b(fFloatValue);
            }
            if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.d) {
                return ((TeleportConnection.a.b.AbstractC1441b.d) aVar).b(fFloatValue);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public b(InterfaceC2985a teleport, D teleportManager, C consoleService, TeleportSession teleportSession, P7.a analytics) {
        AbstractC6492s.i(teleport, "teleport");
        AbstractC6492s.i(teleportManager, "teleportManager");
        AbstractC6492s.i(consoleService, "consoleService");
        AbstractC6492s.i(teleportSession, "teleportSession");
        AbstractC6492s.i(analytics, "analytics");
        this.f43238a = teleport;
        this.f43239b = teleportManager;
        this.f43240c = consoleService;
        this.f43241d = teleportSession;
        this.f43242e = analytics;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f43243f = cVarJ2;
        Fg.a aVarK2 = Fg.a.k2(AbstractC1445b.C1446b.f43251a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f43244g = aVarK2;
        gg.i iVarI2 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43245h = iVarI2;
        AbstractC5912b abstractC5912bG = cVarJ2.o0().E(Gg.a.a()).t(new f()).g(AbstractC5912b.D(TeleportConnection.Error.CancelledByUser.f43195a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        this.f43246i = abstractC5912bG;
        gg.i iVarI22 = gg.i.v(teleport.a().a().I1(m.f43275a), iVarI2, new n()).W().f0(o.f43278a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43247j = iVarI22;
        gg.i iVarI23 = Ag.c.f753a.a(iVarI22, p(iVarI22, 100L)).r1(new InterfaceC6465b() { // from class: Fd.y
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return com.ui.wifiman.model.teleport.b.A((Yg.s) obj, (Yg.s) obj2);
            }
        }).N0(x.f43287a).W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43248k = iVarI23;
        AbstractC5912b abstractC5912bX = AbstractC5912b.p(q(), s()).K(abstractC5912bG).X(iVarI22.m0(new p()).o0().y());
        AbstractC6492s.h(abstractC5912bX, "takeUntil(...)");
        AbstractC5912b abstractC5912bE0 = y(abstractC5912bX).z(new q()).B(new r()).x(new InterfaceC6464a() { // from class: Fd.z
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.teleport.b.t(this.f6481a);
            }
        }).O(s.f43282a).c0().F1(Gg.a.a()).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f43249l = abstractC5912bE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s A(Yg.s sVar, Yg.s sVar2) {
        AbstractC6492s.i(sVar, "<destruct>");
        AbstractC6492s.i(sVar2, "<destruct>");
        TeleportConnection.a aVar = (TeleportConnection.a) sVar.a();
        TeleportConnection.a aVar2 = (TeleportConnection.a) sVar2.a();
        float fFloatValue = ((Number) sVar2.c()).floatValue();
        return (aVar2.a() < 1.0f || fFloatValue >= 1.0f) ? z.a(aVar2, Float.valueOf(fFloatValue)) : z.a(aVar, Float.valueOf(fFloatValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection.a n(UnifiTeleportTunnel.d dVar) {
        if (dVar instanceof UnifiTeleportTunnel.d.c.a) {
            return new TeleportConnection.a.C1439a(x(((UnifiTeleportTunnel.d.c.a) dVar).a()));
        }
        if ((dVar instanceof UnifiTeleportTunnel.d.c.C1248c) || (dVar instanceof UnifiTeleportTunnel.d.c.b)) {
            return new TeleportConnection.a.C1439a(null);
        }
        if (dVar instanceof UnifiTeleportTunnel.d.b.c) {
            return new TeleportConnection.a.b.AbstractC1441b.C1442a(0.0f, 1, null);
        }
        if (dVar instanceof UnifiTeleportTunnel.d.b.C1247d) {
            return new TeleportConnection.a.b.AbstractC1441b.C1443b(0.0f, 1, null);
        }
        if ((dVar instanceof UnifiTeleportTunnel.d.b.e) || (dVar instanceof UnifiTeleportTunnel.d.b.C1246b)) {
            return new TeleportConnection.a.b.AbstractC1441b.e(0.0f, 1, null);
        }
        if (dVar instanceof UnifiTeleportTunnel.d.b.a) {
            return new TeleportConnection.a.b.AbstractC1441b.d(0.0f, 1, null);
        }
        if (dVar instanceof UnifiTeleportTunnel.d.a) {
            return new TeleportConnection.a.b.C1440a(((UnifiTeleportTunnel.d.a) dVar).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection.a o(AbstractC1445b abstractC1445b) {
        if (abstractC1445b instanceof AbstractC1445b.a) {
            return new TeleportConnection.a.C1439a(((AbstractC1445b.a) abstractC1445b).a());
        }
        if (abstractC1445b instanceof AbstractC1445b.c) {
            return new TeleportConnection.a.b.AbstractC1441b.c(0.0f, 1, null);
        }
        if (abstractC1445b instanceof AbstractC1445b.C1446b) {
            return new TeleportConnection.a.C1439a(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final gg.i p(gg.i iVar, long j10) {
        N n10 = new N();
        gg.i iVarW = iVar.N0(new c()).W().I1(new d(n10, j10)).f0(new e(n10)).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    private final AbstractC5912b q() {
        AbstractC5912b abstractC5912bT = this.f43241d.d().N0(g.f43263a).o0().t(h.f43264a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        Z7.b.h("TeleportConnection - Connect FINISHED", null, 2, null);
    }

    private final AbstractC5912b s() {
        AbstractC5912b abstractC5912bT = this.f43240c.a().o0().s(j.f43266a).s(new k()).t(l.f43273a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(b bVar) {
        bVar.f43244g.h(AbstractC1445b.C1446b.f43251a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u() {
        Z7.b.h("TeleportConnection - Disconnect FINISHED", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long v(TeleportConnection.a aVar) {
        if (aVar instanceof TeleportConnection.a.C1439a) {
            return 0L;
        }
        if (!(aVar instanceof TeleportConnection.a.b.AbstractC1441b.c)) {
            if (!(aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1442a)) {
                if (aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1443b) {
                    return 12000L;
                }
                if (!(aVar instanceof TeleportConnection.a.b.AbstractC1441b.e)) {
                    if (!(aVar instanceof TeleportConnection.a.b.AbstractC1441b.d) && !(aVar instanceof TeleportConnection.a.b.C1440a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return 1000L;
        }
        return 3000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection.Error x(Throwable th2) {
        if (th2 instanceof TeleportCloud.Error) {
            return new TeleportConnection.Error.Cloud((TeleportCloud.Error) th2);
        }
        if (th2 instanceof UnifiTeleportTunnel.Error.InterruptedByUser) {
            return TeleportConnection.Error.CancelledByUser.f43195a;
        }
        if (th2 instanceof UnifiTeleportTunnel.Error) {
            return new TeleportConnection.Error.Tunnel((UnifiTeleportTunnel.Error) th2);
        }
        if (th2 instanceof UnifiConsoleConnectionError) {
            return new TeleportConnection.Error.ConsoleConnection((UnifiConsoleConnectionError) th2);
        }
        return null;
    }

    private final AbstractC5912b y(AbstractC5912b abstractC5912b) {
        AbstractC5912b abstractC5912bO = abstractC5912b.O(new w());
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Throwable th2) {
        if (th2 instanceof TeleportConnection.Error.CancelledByUser) {
            return;
        }
        this.f43242e.b(new c.p.a(th2));
    }

    @Override // com.ui.wifiman.model.teleport.TeleportConnection
    public AbstractC5912b connect() {
        AbstractC5912b abstractC5912bL = this.f43242e.d(c.p.b.f18184c).g(this.f43249l).B(i.f43265a).w(new InterfaceC6464a() { // from class: Fd.x
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.teleport.b.r();
            }
        }).l();
        AbstractC6492s.h(abstractC5912bL, "cache(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.teleport.TeleportConnection
    public AbstractC5912b disconnect() {
        AbstractC5912b abstractC5912bY = y(this.f43246i);
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new t());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bO = abstractC5912bY.K(abstractC5912bR).B(u.f43284a).w(new InterfaceC6464a() { // from class: Fd.w
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.teleport.b.u();
            }
        }).O(v.f43285a);
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    @Override // com.ui.wifiman.model.teleport.TeleportConnection
    public gg.i getState() {
        return this.f43248k;
    }

    protected final InterfaceC2985a w() {
        return this.f43238a;
    }
}
