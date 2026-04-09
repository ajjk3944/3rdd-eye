package Gd;

import Fd.s;
import Id.f;
import Id.h;
import Yg.m;
import Yg.y;
import android.content.Context;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.quicksettings.a;
import gg.AbstractC5912b;
import gg.i;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import md.C6796a;
import md.InterfaceC6797b;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import rj.InterfaceC7810x2;
import th.l;

/* loaded from: classes4.dex */
public final class b implements com.ui.wifiman.quicksettings.a, Id.f {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ l[] f7313g = {O.h(new F(b.class, "teleportAvailableService", "getTeleportAvailableService()Lcom/ui/wifiman/model/teleport/TeleportAvailableService;", 0)), O.h(new F(b.class, "tunnelAvailableService", "getTunnelAvailableService()Lcom/ui/wifiman/model/teleport/tunnel/TunnelAvailableService;", 0)), O.h(new F(b.class, "teleportConnector", "getTeleportConnector()Lcom/ui/wifiman/model/teleport/TeleportConnection;", 0)), O.h(new F(b.class, "settingsManager", "getSettingsManager()Lcom/ui/wifiman/model/settings/AppSettingsManager;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final m f7314a;

    /* renamed from: b, reason: collision with root package name */
    private final m f7315b;

    /* renamed from: c, reason: collision with root package name */
    private final m f7316c;

    /* renamed from: d, reason: collision with root package name */
    private final m f7317d;

    /* renamed from: e, reason: collision with root package name */
    private final i f7318e;

    /* renamed from: f, reason: collision with root package name */
    private final i f7319f;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7320a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6796a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.i());
        }
    }

    /* renamed from: Gd.b$b, reason: collision with other inner class name */
    static final class C0297b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0297b f7321a = new C0297b();

        C0297b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(TeleportConnection.a state) {
            AbstractC6492s.i(state, "state");
            return Boolean.valueOf(state instanceof TeleportConnection.a.b);
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean isTeleportOn) {
            AbstractC6492s.i(isTeleportOn, "isTeleportOn");
            if (AbstractC6492s.d(isTeleportOn, Boolean.TRUE)) {
                return b.this.j().disconnect();
            }
            if (AbstractC6492s.d(isTeleportOn, Boolean.FALSE)) {
                return b.this.j().connect();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<Id.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<InterfaceC6797b> {
    }

    static final class h implements n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.AbstractC1542a apply(y yVar) {
            AbstractC6492s.i(yVar, "<destruct>");
            TeleportConnection.a aVar = (TeleportConnection.a) yVar.a();
            s.a aVar2 = (s.a) yVar.c();
            h.a aVar3 = (h.a) yVar.d();
            s.a.AbstractC0251a.C0252a c0252a = aVar2 instanceof s.a.AbstractC0251a.C0252a ? (s.a.AbstractC0251a.C0252a) aVar2 : null;
            return (c0252a == null || !c0252a.a()) ? ((aVar3 instanceof h.a.c) || (aVar2 instanceof s.a.c)) ? new a.AbstractC1542a.d(b.this.l(aVar2, aVar3)) : b.this.m(aVar) : new a.AbstractC1542a.d(jc.d.f50235k);
        }
    }

    public b(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, s.class), null);
        l[] lVarArr = f7313g;
        this.f7314a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7315b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Id.h.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7316c = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE3, TeleportConnection.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7317d = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE4, InterfaceC6797b.class), null).a(this, lVarArr[3]);
        i iVarW = Ag.c.f753a.b(j().getState(), i().getState(), k().getState()).N0(new h()).e1().Y0(Gg.a.a(), false, 1).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7318e = iVarW;
        i iVarW2 = h().b().N0(a.f7320a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f7319f = iVarW2;
    }

    private final InterfaceC6797b h() {
        return (InterfaceC6797b) this.f7317d.getValue();
    }

    private final s i() {
        return (s) this.f7314a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TeleportConnection j() {
        return (TeleportConnection) this.f7316c.getValue();
    }

    private final Id.h k() {
        return (Id.h) this.f7315b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(s.a aVar, h.a aVar2) {
        return jc.d.f50235k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.AbstractC1542a m(TeleportConnection.a aVar) {
        if (aVar instanceof TeleportConnection.a.C1439a) {
            return a.AbstractC1542a.c.f44293a;
        }
        if (aVar instanceof TeleportConnection.a.b.C1440a) {
            return a.AbstractC1542a.C1543a.f44289a;
        }
        if ((aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1442a) || (aVar instanceof TeleportConnection.a.b.AbstractC1441b.C1443b) || (aVar instanceof TeleportConnection.a.b.AbstractC1441b.c) || (aVar instanceof TeleportConnection.a.b.AbstractC1441b.d) || (aVar instanceof TeleportConnection.a.b.AbstractC1441b.e)) {
            return a.AbstractC1542a.b.C1544a.f44291a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6796a n(boolean z10, C6796a it) {
        AbstractC6492s.i(it, "it");
        return C6796a.b(it, null, null, false, false, false, false, z10, 63, null);
    }

    @Override // Id.f
    public Id.c B(UnifiTeleportTunnel.Error error) {
        return f.a.a(this, error);
    }

    @Override // Id.f
    public Id.c S(UnifiConsoleConnectionError unifiConsoleConnectionError) {
        return f.a.d(this, unifiConsoleConnectionError);
    }

    @Override // com.ui.wifiman.quicksettings.a
    public AbstractC5912b a(Context ctx) {
        AbstractC6492s.i(ctx, "ctx");
        AbstractC5912b abstractC5912bT = j().getState().o0().A(C0297b.f7321a).t(new c());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    @Override // com.ui.wifiman.quicksettings.a
    public i b() {
        return this.f7319f;
    }

    @Override // com.ui.wifiman.quicksettings.a
    public AbstractC5912b c(final boolean z10) {
        return h().a(new InterfaceC6835l() { // from class: Gd.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return b.n(z10, (C6796a) obj);
            }
        });
    }

    @Override // com.ui.wifiman.quicksettings.a
    public i getState() {
        return this.f7318e;
    }

    @Override // Id.f
    public Id.c t(TeleportCloud.Error error) {
        return f.a.b(this, error);
    }
}
