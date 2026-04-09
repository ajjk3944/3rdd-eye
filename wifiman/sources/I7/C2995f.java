package I7;

import android.content.Context;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.TeleportTunnelManager;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.UnifiTeleportTunnelManager;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.stun.GoTeleportStun;
import com.ubnt.teleport.unifi.stun.TeleportStun;
import com.wireguard.android.backend.GoBackend;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.OkHttpClient;

/* renamed from: I7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2995f implements InterfaceC2985a {

    /* renamed from: b, reason: collision with root package name */
    private final com.wireguard.android.backend.a f8894b;

    /* renamed from: c, reason: collision with root package name */
    private final TeleportStun f8895c;

    /* renamed from: d, reason: collision with root package name */
    private final TeleportCloud.c f8896d;

    /* renamed from: e, reason: collision with root package name */
    private final UnifiTeleportTunnelManager f8897e;

    /* renamed from: f, reason: collision with root package name */
    private final TeleportTunnelManager f8898f;

    /* renamed from: g, reason: collision with root package name */
    private final TeleportTunnel.c f8899g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6043c f8900h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f8901i;

    /* renamed from: I7.f$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8902a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f invoke(C6556a c6556a) {
            AbstractC5912b abstractC5912bB;
            UnifiTeleportTunnel unifiTeleportTunnel = (UnifiTeleportTunnel) c6556a.a();
            return (unifiTeleportTunnel == null || (abstractC5912bB = unifiTeleportTunnel.b(C2997g.f8908a.a())) == null) ? AbstractC5912b.m() : abstractC5912bB;
        }
    }

    /* renamed from: I7.f$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8903a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tunnel restore complete!";
        }
    }

    /* renamed from: I7.f$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8904a;

        /* renamed from: I7.f$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8905a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Tunnel restore error";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f8904a = interfaceC6835l;
        }

        public final void a(Throwable it) throws Throwable {
            if (!(it instanceof TeleportTunnel.Error)) {
                AbstractC6492s.h(it, "it");
                throw it;
            }
            N7.a.c(a.f8905a, it);
            InterfaceC6835l interfaceC6835l = this.f8904a;
            AbstractC6492s.h(it, "it");
            interfaceC6835l.invoke(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: I7.f$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8906a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tunnel restore already in process";
        }
    }

    public C2995f(Context applicationContext, Class vpnServiceClass, J7.G cloudParamsDelegate, TeleportTunnelManager.Storage tunnelStorage, OkHttpClient sharedOkhttpClient) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(vpnServiceClass, "vpnServiceClass");
        AbstractC6492s.i(cloudParamsDelegate, "cloudParamsDelegate");
        AbstractC6492s.i(tunnelStorage, "tunnelStorage");
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        GoBackend goBackend = new GoBackend(applicationContext, vpnServiceClass);
        this.f8894b = goBackend;
        GoTeleportStun goTeleportStun = new GoTeleportStun();
        this.f8895c = goTeleportStun;
        this.f8896d = new J7.v(null, cloudParamsDelegate, sharedOkhttpClient, 1, null);
        UnifiTeleportTunnelManager unifiTeleportTunnelManager = new UnifiTeleportTunnelManager(goTeleportStun, goBackend, d(), tunnelStorage);
        this.f8897e = unifiTeleportTunnelManager;
        this.f8898f = unifiTeleportTunnelManager;
        this.f8899g = unifiTeleportTunnelManager;
        gg.z zVarO0 = a().a().o0();
        final a aVar = a.f8902a;
        AbstractC5912b abstractC5912bW = zVarO0.t(new kg.n() { // from class: I7.c
            @Override // kg.n
            public final Object apply(Object obj) {
                return C2995f.i(aVar, obj);
            }
        }).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "tunnelManager.main\n     …scribeOn(Schedulers.io())");
        this.f8901i = abstractC5912bW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.f i(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.f) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C2995f this$0, InterfaceC6835l onTunnelRestoreError) {
        AbstractC6492s.i(this$0, "this$0");
        AbstractC6492s.i(onTunnelRestoreError, "$onTunnelRestoreError");
        if (this$0.f8900h != null) {
            N7.a.b(d.f8906a);
            return;
        }
        AbstractC5912b abstractC5912b = this$0.f8901i;
        InterfaceC6464a interfaceC6464a = new InterfaceC6464a() { // from class: I7.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                C2995f.k();
            }
        };
        final c cVar = new c(onTunnelRestoreError);
        this$0.f8900h = abstractC5912b.U(interfaceC6464a, new InterfaceC6469f() { // from class: I7.e
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                C2995f.l(cVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k() {
        N7.a.b(b.f8903a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // I7.InterfaceC2985a
    public TeleportTunnelManager a() {
        return this.f8898f;
    }

    @Override // I7.InterfaceC2985a
    public TeleportTunnel.c b() {
        return this.f8899g;
    }

    @Override // H7.a
    public void c(final InterfaceC6835l onTunnelRestoreError) {
        AbstractC6492s.i(onTunnelRestoreError, "onTunnelRestoreError");
        GoBackend.p(new GoBackend.b() { // from class: I7.b
            @Override // com.wireguard.android.backend.GoBackend.b
            public final void a() {
                C2995f.j(this.f8886a, onTunnelRestoreError);
            }
        });
    }

    @Override // I7.InterfaceC2985a
    public TeleportCloud.c d() {
        return this.f8896d;
    }
}
