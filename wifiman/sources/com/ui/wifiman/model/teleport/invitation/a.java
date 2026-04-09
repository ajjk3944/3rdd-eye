package com.ui.wifiman.model.teleport.invitation;

import Fd.D;
import I7.InterfaceC2985a;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.r;
import gg.z;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class a implements TeleportInvitationProcessor {

    /* renamed from: g, reason: collision with root package name */
    public static final C1455a f43339g = new C1455a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TeleportCloud.e.b f43340a;

    /* renamed from: b, reason: collision with root package name */
    private final D f43341b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f43342c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f43343d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f43344e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f43345f;

    /* renamed from: com.ui.wifiman.model.teleport.invitation.a$a, reason: collision with other inner class name */
    public static final class C1455a {
        public /* synthetic */ C1455a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1455a() {
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List tunnels) {
            Object next;
            AbstractC6492s.i(tunnels, "tunnels");
            a aVar = a.this;
            Iterator it = tunnels.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((UnifiTeleportTunnel) next).getConfig().b(), aVar.f().a())) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43347a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
            return unifiTeleportTunnel != null ? AbstractC5912b.D(new TeleportInvitationProcessor.Error.TokenAlreadyAdded(unifiTeleportTunnel)) : AbstractC5912b.m();
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43348a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(TeleportInvitationProcessor.a siteState) {
            AbstractC6492s.i(siteState, "siteState");
            if (siteState instanceof TeleportInvitationProcessor.a.c) {
                return gg.n.o(((TeleportInvitationProcessor.a.c) siteState).a());
            }
            if (siteState instanceof TeleportInvitationProcessor.a.b) {
                return gg.n.h();
            }
            if (siteState instanceof TeleportInvitationProcessor.a.C1453a) {
                return gg.n.i(((TeleportInvitationProcessor.a.C1453a) siteState).a());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class e implements n {

        /* renamed from: com.ui.wifiman.model.teleport.invitation.a$e$a, reason: collision with other inner class name */
        static final class C1456a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f43350a;

            /* renamed from: com.ui.wifiman.model.teleport.invitation.a$e$a$a, reason: collision with other inner class name */
            public static final class C1457a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f43351a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.model.teleport.n f43352b;

                public C1457a(a aVar, com.ui.wifiman.model.teleport.n nVar) {
                    this.f43351a = aVar;
                    this.f43352b = nVar;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f43351a.f43342c.h(new TeleportInvitationProcessor.b.d(this.f43352b.a().c().b(), null));
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            C1456a(a aVar) {
                this.f43350a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(com.ui.wifiman.model.teleport.n teleport) {
                AbstractC6492s.i(teleport, "teleport");
                AbstractC5912b abstractC5912bD = this.f43350a.f43341b.d(teleport);
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1457a(this.f43350a, teleport));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return AbstractC5912b.p(abstractC5912bD, abstractC5912bR);
            }
        }

        static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f43353a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof UnifiConsoleConnectionError ? AbstractC5912b.D(new TeleportInvitationProcessor.Error.TunnelCreationFailed(new TeleportConnection.Error.ConsoleConnection((UnifiConsoleConnectionError) error))) : error instanceof TeleportCloud.Error ? AbstractC5912b.D(new TeleportInvitationProcessor.Error.CloudError((TeleportCloud.Error) error)) : error instanceof TeleportConnection.Error ? AbstractC5912b.D(new TeleportInvitationProcessor.Error.TunnelCreationFailed((TeleportConnection.Error) error)) : AbstractC5912b.D(error);
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportCloud.b endpointSite) {
            AbstractC6492s.i(endpointSite, "endpointSite");
            return a.this.f43341b.f(a.this.f(), endpointSite).t(new C1456a(a.this)).O(b.f43353a);
        }
    }

    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            a.this.f43342c.h(TeleportInvitationProcessor.b.c.f43334a);
        }
    }

    static final class g implements n {

        /* renamed from: com.ui.wifiman.model.teleport.invitation.a$g$a, reason: collision with other inner class name */
        public static final class C1458a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f43356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Throwable f43357b;

            public C1458a(a aVar, Throwable th2) {
                this.f43356a = aVar;
                this.f43357b = th2;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43356a.f43342c.h(new TeleportInvitationProcessor.b.a((TeleportInvitationProcessor.Error) this.f43357b));
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!(error instanceof TeleportInvitationProcessor.Error)) {
                return AbstractC5912b.D(error);
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1458a(a.this, error));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class h implements n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(TeleportCloud cloud) {
            AbstractC6492s.i(cloud, "cloud");
            return cloud.b(a.this.f());
        }
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43359a = new i();

        /* renamed from: com.ui.wifiman.model.teleport.invitation.a$i$a, reason: collision with other inner class name */
        static final class C1459a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1459a f43360a = new C1459a();

            C1459a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof TeleportCloud.Error)) {
                    return gg.i.k0(error);
                }
                TeleportCloud.Error error2 = (TeleportCloud.Error) error;
                if ((error2 instanceof TeleportCloud.Error.InvalidResponse) || (error2 instanceof TeleportCloud.Error.CommunicationError.ResponseTimeout) || (error2 instanceof TeleportCloud.Error.CommunicationError)) {
                    return gg.i.d2(1000L, TimeUnit.MILLISECONDS);
                }
                if (error2 instanceof TeleportCloud.Error.ApiError) {
                    return ((TeleportCloud.Error.ApiError) error).getHttpCode() == 404 ? gg.i.k0(new TeleportInvitationProcessor.Error.TokenProbablyUsed()) : gg.i.k0(error);
                }
                if (error2 instanceof TeleportCloud.Error.CloudError) {
                    return gg.i.k0(error);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(C1459a.f43360a);
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43361a = new j();

        /* renamed from: com.ui.wifiman.model.teleport.invitation.a$j$a, reason: collision with other inner class name */
        public /* synthetic */ class C1460a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43362a;

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
                f43362a = iArr;
            }
        }

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportInvitationProcessor.a apply(TeleportCloud.b it) {
            AbstractC6492s.i(it, "it");
            TeleportCloud.b.EnumC1254b enumC1254bE = it.e();
            int i10 = enumC1254bE == null ? -1 : C1460a.f43362a[enumC1254bE.ordinal()];
            return (i10 == 1 || i10 == 2) ? new TeleportInvitationProcessor.a.c(it) : new TeleportInvitationProcessor.a.C1453a(new TeleportInvitationProcessor.Error.NetworkUnreachableError(it.h()));
        }
    }

    static final class k implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f43363a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportInvitationProcessor.Error ? z.z(new TeleportInvitationProcessor.a.C1453a((TeleportInvitationProcessor.Error) error)) : error instanceof TeleportCloud.Error ? z.z(new TeleportInvitationProcessor.a.C1453a(new TeleportInvitationProcessor.Error.CloudError((TeleportCloud.Error) error))) : z.p(error);
        }
    }

    public a(TeleportCloud.e.b secret, InterfaceC2985a teleport, D teleportManager) {
        AbstractC6492s.i(secret, "secret");
        AbstractC6492s.i(teleport, "teleport");
        AbstractC6492s.i(teleportManager, "teleportManager");
        this.f43340a = secret;
        this.f43341b = teleportManager;
        Fg.a aVarK2 = Fg.a.k2(TeleportInvitationProcessor.b.C1454b.f43333a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f43342c = aVarK2;
        AbstractC5912b abstractC5912bT = teleport.a().getAll().o0().A(new b()).t(c.f43347a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        this.f43343d = abstractC5912bT;
        gg.i iVarI2 = abstractC5912bT.k(teleport.d().a()).s(new h()).L(i.f43359a).S(10000L, TimeUnit.MILLISECONDS, z.p(new TeleportCloud.Error.CommunicationError.ResponseTimeout("Timeout after 10000 ms"))).A(j.f43361a).F(k.f43363a).W().z1(TeleportInvitationProcessor.a.b.f43330a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43344e = iVarI2;
        gg.i iVarY0 = aVarK2.e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        this.f43345f = iVarY0;
    }

    @Override // com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bW = b().v0(d.f43348a).t0(new e()).B(new f()).O(new g()).W(Gg.a.a());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor
    public gg.i b() {
        return this.f43344e;
    }

    @Override // com.ui.wifiman.model.teleport.invitation.TeleportInvitationProcessor
    public gg.i c() {
        return this.f43345f;
    }

    public TeleportCloud.e.b f() {
        return this.f43340a;
    }
}
