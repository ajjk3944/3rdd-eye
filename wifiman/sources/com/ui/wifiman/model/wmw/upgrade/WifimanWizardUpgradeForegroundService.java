package com.ui.wifiman.model.wmw.upgrade;

import Gg.a;
import Yg.m;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.ui.wifiman.model.wmw.g;
import com.ui.wifiman.model.wmw.upgrade.WifimanWizardUpgradeForegroundService;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.io.Serializable;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.util.SnmpConfigurator;
import rj.InterfaceC7733m2;
import se.h;
import sj.AbstractC7986a;
import th.l;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ui/wifiman/model/wmw/upgrade/WifimanWizardUpgradeForegroundService;", "Landroid/app/Service;", "<init>", "()V", "Lcom/ui/wifiman/model/wmw/g$b;", "firmware", "LYg/J;", "g", "(Lcom/ui/wifiman/model/wmw/g$b;)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "onCreate", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lhg/c;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lhg/c;", "upgradeDisposable", "Lse/h;", SnmpConfigurator.O_BIND_ADDRESS, "Lse/h;", "upgradeProcessor", "Lcom/ui/wifiman/model/wmw/g;", SnmpConfigurator.O_COMMUNITY, "Lcom/ui/wifiman/model/wmw/g;", "upgradeManager", "Lse/g;", "d", "Lse/g;", "notificationService", "Lorg/kodein/di/DI;", "di", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WifimanWizardUpgradeForegroundService extends Service {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c upgradeDisposable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private h upgradeProcessor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private com.ui.wifiman.model.wmw.g upgradeManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private se.g notificationService;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ l[] f44268f = {O.g(new D(WifimanWizardUpgradeForegroundService.class, "di", "<v#0>", 0))};

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.ui.wifiman.model.wmw.upgrade.WifimanWizardUpgradeForegroundService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g.b b(Intent intent) {
            Serializable serializableExtra = intent.getSerializableExtra("firmware");
            if (serializableExtra instanceof g.b) {
                return (g.b) serializableExtra;
            }
            return null;
        }

        public final int c() {
            return O7.c.WIFIMAN_WIZARD_FW_UPGRADE.getId();
        }

        public final Intent d(Context context, g.b firmware) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(firmware, "firmware");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WifimanWizardUpgradeForegroundService.class);
            intent.setAction("com.ubnt.usurvey.wmw.fw.start");
            intent.putExtra("firmware", firmware);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<com.ui.wifiman.model.wmw.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<se.g> {
    }

    static final class e implements n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WifimanWizardUpgradeForegroundService f44274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.c f44275b;

            public a(WifimanWizardUpgradeForegroundService wifimanWizardUpgradeForegroundService, g.c cVar) {
                this.f44274a = wifimanWizardUpgradeForegroundService;
                this.f44275b = cVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    se.g gVar = this.f44274a.notificationService;
                    if (gVar == null) {
                        AbstractC6492s.v("notificationService");
                        gVar = null;
                    }
                    AbstractC6492s.f(this.f44275b);
                    gVar.c(this.f44275b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(g.c state) {
            AbstractC6492s.i(state, "state");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(WifimanWizardUpgradeForegroundService.this, state));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f44276a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW Upgrade Service - FW Upgrade Service Process subscribed", null, 2, null);
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f44277a = new g();

        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            throw new IllegalStateException("Unexpected error in upgrade stream.", error);
        }
    }

    private final void e() {
        if (this.upgradeDisposable != null) {
            this.upgradeDisposable = null;
            Z7.b.h("WMW Upgrade Service - disposeUpgradeProcess", null, 2, null);
            InterfaceC6043c interfaceC6043c = this.upgradeDisposable;
            if (interfaceC6043c != null) {
                interfaceC6043c.dispose();
            }
            stopForeground(1);
            stopSelf();
        }
    }

    private static final DI f(m mVar) {
        return (DI) mVar.getValue();
    }

    private final void g(g.b firmware) {
        se.g gVar = null;
        if (this.upgradeDisposable != null) {
            Z7.b.j("WMW - Upgrade already started", null, null, 6, null);
            return;
        }
        h hVar = this.upgradeProcessor;
        if (hVar == null) {
            AbstractC6492s.v("upgradeProcessor");
            hVar = null;
        }
        this.upgradeDisposable = hVar.b(firmware).D(new e()).B(f.f44276a).x(new InterfaceC6464a() { // from class: se.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                WifimanWizardUpgradeForegroundService.h();
            }
        }).w(new InterfaceC6464a() { // from class: se.e
            @Override // kg.InterfaceC6464a
            public final void run() {
                WifimanWizardUpgradeForegroundService.i(this.f61471a);
            }
        }).W(a.a()).U(new InterfaceC6464a() { // from class: se.f
            @Override // kg.InterfaceC6464a
            public final void run() {
                WifimanWizardUpgradeForegroundService.j();
            }
        }, g.f44277a);
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = INSTANCE.c();
            se.g gVar2 = this.notificationService;
            if (gVar2 == null) {
                AbstractC6492s.v("notificationService");
            } else {
                gVar = gVar2;
            }
            startForeground(iC, gVar.d(), 16);
            return;
        }
        int iC2 = INSTANCE.c();
        se.g gVar3 = this.notificationService;
        if (gVar3 == null) {
            AbstractC6492s.v("notificationService");
        } else {
            gVar = gVar3;
        }
        startForeground(iC2, gVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h() {
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service Process Completed", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WifimanWizardUpgradeForegroundService wifimanWizardUpgradeForegroundService) {
        wifimanWizardUpgradeForegroundService.e();
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service Process Finished", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service onCreate", null, 2, null);
        m mVarA = AbstractC7986a.d(this).a(null, f44268f[0]);
        InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(f(mVarA)).g();
        i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.upgradeProcessor = (h) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, h.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = org.kodein.di.d.f(f(mVarA)).g();
        i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.upgradeManager = (com.ui.wifiman.model.wmw.g) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, com.ui.wifiman.model.wmw.g.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = org.kodein.di.d.f(f(mVarA)).g();
        i iVarE3 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        se.g gVar = (se.g) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, se.g.class), null);
        this.notificationService = gVar;
        if (gVar == null) {
            AbstractC6492s.v("notificationService");
            gVar = null;
        }
        gVar.a();
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service Created", null, 2, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service onDestroy", null, 2, null);
        super.onDestroy();
        InterfaceC6043c interfaceC6043c = this.upgradeDisposable;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
        se.g gVar = this.notificationService;
        if (gVar == null) {
            AbstractC6492s.v("notificationService");
            gVar = null;
        }
        gVar.b();
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service Destroyed", null, 2, null);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Z7.b.h("WMW Upgrade Service - FW Upgrade Service - onStartCommand action " + (intent != null ? intent.getAction() : null), null, 2, null);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1521325249) {
                if (iHashCode == 782209413 && action.equals("com.ubnt.usurvey.wmw.fw.stop")) {
                    e();
                    return 2;
                }
            } else if (action.equals("com.ubnt.usurvey.wmw.fw.start")) {
                g.b bVarB = INSTANCE.b(intent);
                if (bVarB != null) {
                    g(bVarB);
                } else {
                    Z7.b.e("Firmware Upgrade service started with NULL firmware params. Can't continue with FW upgrade", null, null, 6, null);
                }
                return 2;
            }
        }
        throw new IllegalStateException("UpgradeForegroundService started with unknown action " + (intent != null ? intent.getAction() : null));
    }
}
