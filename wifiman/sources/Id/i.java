package Id;

import Fd.C;
import Id.a;
import Id.f;
import Id.h;
import Od.a;
import Yg.m;
import Zc.e;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;

/* loaded from: classes4.dex */
public final class i implements h, f {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ l[] f9092f = {O.h(new F(i.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), O.h(new F(i.class, "teleportConnector", "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.h(new F(i.class, "teleportConsoles", "getTeleportConsoles()Lcom/ui/wifiman/model/teleport/TeleportConsoleService;", 0)), O.h(new F(i.class, "cloudStatusService", "getCloudStatusService()Lcom/ui/wifiman/model/ubiquiti/cloud/status/UbiquitiCloudStatus$Service;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final m f9093a;

    /* renamed from: b, reason: collision with root package name */
    private final m f9094b;

    /* renamed from: c, reason: collision with root package name */
    private final m f9095c;

    /* renamed from: d, reason: collision with root package name */
    private final m f9096d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f9097e;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<a.InterfaceC0616a> {
    }

    static final class e implements kg.h {
        e() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h.a a(Zc.e networkConnection, TeleportConnection.a tunnelState, C6556a c6556a, Wc.b bVar) {
            AbstractC6492s.i(networkConnection, "networkConnection");
            AbstractC6492s.i(tunnelState, "tunnelState");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(bVar, "<destruct>");
            com.ui.wifiman.model.teleport.h hVar = (com.ui.wifiman.model.teleport.h) c6556a.a();
            Od.a aVar = (Od.a) bVar.a();
            if ((tunnelState instanceof TeleportConnection.a.b.AbstractC1441b) || (tunnelState instanceof TeleportConnection.a.b.C1440a)) {
                return h.a.C0376a.f9088a;
            }
            if (!(tunnelState instanceof TeleportConnection.a.C1439a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (hVar == null) {
                return h.a.d.f9091a;
            }
            Id.a aVarA = Id.b.a(hVar, networkConnection.f() == e.b.CONNECTED, aVar);
            if (aVarA instanceof a.b) {
                return h.a.d.f9091a;
            }
            if (aVarA instanceof a.c) {
                return new h.a.c((a.c) aVarA);
            }
            if (!(aVarA instanceof a.C0370a)) {
                throw new NoWhenBranchMatchedException();
            }
            TeleportConnection.Error errorB = ((TeleportConnection.a.C1439a) tunnelState).b();
            return errorB != null ? new h.a.b(i.this.e(errorB)) : h.a.C0376a.f9088a;
        }
    }

    public i(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, Zc.f.class), null);
        l[] lVarArr = f9092f;
        this.f9093a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f9094b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, TeleportConnection.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f9095c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, C.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f9096d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, a.InterfaceC0616a.class), null).a(this, lVarArr[3]);
        gg.i iVarI2 = gg.i.t(b().getState(), c().getState(), d().a(), a().a(), new e()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f9097e = iVarI2;
    }

    private final a.InterfaceC0616a a() {
        return (a.InterfaceC0616a) this.f9096d.getValue();
    }

    private final Zc.f b() {
        return (Zc.f) this.f9093a.getValue();
    }

    private final TeleportConnection c() {
        return (TeleportConnection) this.f9094b.getValue();
    }

    private final C d() {
        return (C) this.f9095c.getValue();
    }

    @Override // Id.f
    public Id.c B(UnifiTeleportTunnel.Error error) {
        return f.a.a(this, error);
    }

    @Override // Id.f
    public Id.c S(UnifiConsoleConnectionError unifiConsoleConnectionError) {
        return f.a.d(this, unifiConsoleConnectionError);
    }

    public Id.c e(TeleportConnection.Error error) {
        return f.a.c(this, error);
    }

    @Override // Id.h
    public gg.i getState() {
        return this.f9097e;
    }

    @Override // Id.f
    public Id.c t(TeleportCloud.Error error) {
        return f.a.b(this, error);
    }
}
