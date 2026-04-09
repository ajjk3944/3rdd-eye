package com.ui.wifiman.quicksettings;

import Yg.J;
import Yg.m;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.ui.wifiman.quicksettings.a;
import gg.AbstractC5912b;
import gg.i;
import hg.InterfaceC6043c;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.util.SnmpConfigurator;
import rj.InterfaceC7733m2;
import sj.AbstractC7986a;
import th.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ui/wifiman/quicksettings/TeleportTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "Lcom/ui/wifiman/quicksettings/a$a;", "", SnmpConfigurator.O_COMMUNITY, "(Lcom/ui/wifiman/quicksettings/a$a;)I", "LYg/J;", "onCreate", "onTileAdded", "onTileRemoved", "onDestroy", "onClick", "Lhg/c;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lhg/c;", "disposable", SnmpConfigurator.O_BIND_ADDRESS, "disposableState", "tileAddDisposableState", "d", "tileRemoveDisposableState", "Lcom/ui/wifiman/quicksettings/a;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lcom/ui/wifiman/quicksettings/a;", "teleportManager", "Lorg/kodein/di/DI;", "di", "app-quick-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeleportTileService extends TileService {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ l[] f44278f = {O.g(new D(TeleportTileService.class, "di", "<v#0>", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c disposable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c disposableState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c tileAddDisposableState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c tileRemoveDisposableState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private com.ui.wifiman.quicksettings.a teleportManager;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f44284a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("Tile service - Error when clicked on tile", it, null, 4, null);
            return AbstractC5912b.m();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<com.ui.wifiman.quicksettings.a> {
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.AbstractC1542a state) {
            Tile qsTile;
            AbstractC6492s.i(state, "state");
            Z7.b.h("TileService - new state of manager : " + state, null, 2, null);
            if (Build.VERSION.SDK_INT >= 29 && (qsTile = TeleportTileService.this.getQsTile()) != null) {
                qsTile.setSubtitle(TeleportTileService.this.getString(state.a()));
            }
            Tile qsTile2 = TeleportTileService.this.getQsTile();
            if (qsTile2 != null) {
                qsTile2.setState(TeleportTileService.this.c(state));
            }
        }
    }

    static final class d implements InterfaceC6469f {
        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.AbstractC1542a it) {
            AbstractC6492s.i(it, "it");
            Tile qsTile = TeleportTileService.this.getQsTile();
            if (qsTile != null) {
                qsTile.updateTile();
            }
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44287a = new e();

        e() {
        }

        public final void a(a.AbstractC1542a it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            a((a.AbstractC1542a) obj);
            return J.f24997a;
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f44288a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable e10) {
            AbstractC6492s.i(e10, "e");
            Z7.b.j("TileService - Error during observing state", e10, null, 4, null);
            return i.K0(J.f24997a);
        }
    }

    private static final DI b(m mVar) {
        return (DI) mVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c(a.AbstractC1542a abstractC1542a) {
        if (AbstractC6492s.d(abstractC1542a, a.AbstractC1542a.C1543a.f44289a) || AbstractC6492s.d(abstractC1542a, a.AbstractC1542a.b.C1544a.f44291a)) {
            return 2;
        }
        if (AbstractC6492s.d(abstractC1542a, a.AbstractC1542a.c.f44293a)) {
            return 1;
        }
        if (abstractC1542a instanceof a.AbstractC1542a.d) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        AbstractC5912b abstractC5912bA;
        AbstractC5912b abstractC5912bO;
        super.onClick();
        com.ui.wifiman.quicksettings.a aVar = this.teleportManager;
        this.disposable = (aVar == null || (abstractC5912bA = aVar.a(this)) == null || (abstractC5912bO = abstractC5912bA.O(a.f44284a)) == null) ? null : abstractC5912bO.S();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Z7.b.h("TileService - TileService Service onCreate", null, 2, null);
        InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(b(AbstractC7986a.d(this).a(null, f44278f[0]))).g();
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        com.ui.wifiman.quicksettings.a aVar = (com.ui.wifiman.quicksettings.a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, com.ui.wifiman.quicksettings.a.class), null);
        this.teleportManager = aVar;
        AbstractC6492s.f(aVar);
        this.disposableState = aVar.getState().f0(new c()).f0(new d()).N0(e.f44287a).f1(f.f44288a).A1();
        Z7.b.h("TileService - Tile Service Created", null, 2, null);
    }

    @Override // android.service.quicksettings.TileService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        InterfaceC6043c interfaceC6043c = this.disposable;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
        InterfaceC6043c interfaceC6043c2 = this.disposableState;
        if (interfaceC6043c2 != null) {
            interfaceC6043c2.dispose();
        }
        InterfaceC6043c interfaceC6043c3 = this.tileAddDisposableState;
        if (interfaceC6043c3 != null) {
            interfaceC6043c3.dispose();
        }
        InterfaceC6043c interfaceC6043c4 = this.tileRemoveDisposableState;
        if (interfaceC6043c4 != null) {
            interfaceC6043c4.dispose();
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
        AbstractC5912b abstractC5912bC;
        com.ui.wifiman.quicksettings.a aVar = this.teleportManager;
        this.tileAddDisposableState = (aVar == null || (abstractC5912bC = aVar.c(true)) == null) ? null : abstractC5912bC.S();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileRemoved() {
        AbstractC5912b abstractC5912bC;
        com.ui.wifiman.quicksettings.a aVar = this.teleportManager;
        this.tileRemoveDisposableState = (aVar == null || (abstractC5912bC = aVar.c(false)) == null) ? null : abstractC5912bC.S();
    }
}
