package com.ui.wifiman.model.teleport;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.ui.wifiman.model.teleport.TeleportConnection;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6466c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.O;
import m9.C6783c;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.util.SnmpConfigurator;
import rj.InterfaceC7733m2;
import sj.AbstractC7986a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J)\u0010\u001a\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ui/wifiman/model/teleport/TeleportConnectionForegroundService;", "Landroid/app/Service;", "<init>", "()V", "Lgg/b;", "i", "()Lgg/b;", "Landroid/app/Notification;", "notification", "j", "(Landroid/app/Notification;)Lgg/b;", "l", "LYg/J;", "k", "(Landroid/app/Notification;)V", "g", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "onDestroy", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/app/NotificationManager;", SnmpConfigurator.O_AUTH_PROTOCOL, "Landroid/app/NotificationManager;", "notificationManager", "Lcom/ui/wifiman/model/teleport/TeleportConnection;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/wifiman/model/teleport/TeleportConnection;", "teleportConnector", "Lcom/ui/wifiman/model/teleport/g;", SnmpConfigurator.O_COMMUNITY, "Lcom/ui/wifiman/model/teleport/g;", "teleportStatusNotification", "", "d", "Z", "inForeground", "Lhg/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lhg/c;", "disposable", "Lgg/y;", "f", "Lgg/y;", "notificationSingleThreadScheduler", "Lorg/kodein/di/DI;", "di", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeleportConnectionForegroundService extends Service {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private NotificationManager notificationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TeleportConnection teleportConnector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private com.ui.wifiman.model.teleport.g teleportStatusNotification;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean inForeground;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6043c disposable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y notificationSingleThreadScheduler = C6783c.f53633a.h("TeleportNotificationUpdate");

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ th.l[] f43212h = {O.g(new D(TeleportConnectionForegroundService.class, "di", "<v#0>", 0))};

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<NotificationManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<TeleportConnection> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<com.ui.wifiman.model.teleport.g> {
    }

    public static final class e implements InterfaceC5915e {
        public e() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                TeleportConnectionForegroundService.this.g();
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class f implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f43221b;

        public f(Notification notification) {
            this.f43221b = notification;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                if (!TeleportConnectionForegroundService.this.inForeground) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        TeleportConnectionForegroundService.this.startForeground(O7.c.TELEPORT.getId(), this.f43221b, 16);
                    } else {
                        TeleportConnectionForegroundService.this.startForeground(O7.c.TELEPORT.getId(), this.f43221b);
                    }
                    TeleportConnectionForegroundService.this.inForeground = true;
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class g implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43222a = new g();

        g() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(TeleportConnection.a prev, TeleportConnection.a latest) {
            AbstractC6492s.i(prev, "prev");
            AbstractC6492s.i(latest, "latest");
            return (prev instanceof TeleportConnection.a.b.C1440a) && (latest instanceof TeleportConnection.a.b.C1440a);
        }
    }

    static final class h implements kg.n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnectionForegroundService f43224a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Notification f43225b;

            public a(TeleportConnectionForegroundService teleportConnectionForegroundService, Notification notification) {
                this.f43224a = teleportConnectionForegroundService;
                this.f43225b = notification;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43224a.k(this.f43225b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnectionForegroundService f43226a;

            public b(TeleportConnectionForegroundService teleportConnectionForegroundService) {
                this.f43226a = teleportConnectionForegroundService;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43226a.inForeground = false;
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class c implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnectionForegroundService f43227a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Notification f43228b;

            public c(TeleportConnectionForegroundService teleportConnectionForegroundService, Notification notification) {
                this.f43227a = teleportConnectionForegroundService;
                this.f43228b = notification;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43227a.k(this.f43228b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class d implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnectionForegroundService f43229a;

            public d(TeleportConnectionForegroundService teleportConnectionForegroundService) {
                this.f43229a = teleportConnectionForegroundService;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43229a.g();
                    this.f43229a.stopSelf();
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class e implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportConnectionForegroundService f43230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TeleportConnection.a f43231b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Notification f43232c;

            public e(TeleportConnectionForegroundService teleportConnectionForegroundService, TeleportConnection.a aVar, Notification notification) {
                this.f43230a = teleportConnectionForegroundService;
                this.f43231b = aVar;
                this.f43232c = notification;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f43230a.inForeground = false;
                    if (((TeleportConnection.a.C1439a) this.f43231b).b() != null) {
                        this.f43230a.k(this.f43232c);
                    } else {
                        this.f43230a.g();
                    }
                    this.f43230a.stopSelf();
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(TeleportConnection.a state) {
            AbstractC5912b abstractC5912bR;
            AbstractC6492s.i(state, "state");
            com.ui.wifiman.model.teleport.g gVar = TeleportConnectionForegroundService.this.teleportStatusNotification;
            if (gVar == null) {
                AbstractC6492s.v("teleportStatusNotification");
                gVar = null;
            }
            Notification notificationB = gVar.b(state);
            AbstractC5912b abstractC5912bJ = TeleportConnectionForegroundService.this.j(notificationB);
            if (state instanceof TeleportConnection.a.b.AbstractC1441b) {
                abstractC5912bR = AbstractC5912b.r(new a(TeleportConnectionForegroundService.this, notificationB));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            } else if (state instanceof TeleportConnection.a.b.C1440a) {
                AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new b(TeleportConnectionForegroundService.this));
                AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
                AbstractC5912b abstractC5912bR3 = AbstractC5912b.r(new c(TeleportConnectionForegroundService.this, notificationB));
                AbstractC6492s.h(abstractC5912bR3, "crossinline action: () -…or(error)\n        }\n    }");
                AbstractC5912b abstractC5912bA0 = AbstractC5912b.a0(3000L, TimeUnit.MILLISECONDS);
                AbstractC5912b abstractC5912bR4 = AbstractC5912b.r(new d(TeleportConnectionForegroundService.this));
                AbstractC6492s.h(abstractC5912bR4, "crossinline action: () -…or(error)\n        }\n    }");
                abstractC5912bR = AbstractC5912b.p(abstractC5912bR2, abstractC5912bR3, abstractC5912bA0, abstractC5912bR4);
                AbstractC6492s.h(abstractC5912bR, "concatArray(...)");
            } else {
                if (!(state instanceof TeleportConnection.a.C1439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC5912bR = AbstractC5912b.r(new e(TeleportConnectionForegroundService.this, state, notificationB));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            }
            return AbstractC5912b.p(abstractC5912bJ, abstractC5912bR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        NotificationManager notificationManager = null;
        Z7.b.h("TeleportConnectionForegroundService - Clearing teleport notification", null, 2, null);
        NotificationManager notificationManager2 = this.notificationManager;
        if (notificationManager2 == null) {
            AbstractC6492s.v("notificationManager");
        } else {
            notificationManager = notificationManager2;
        }
        notificationManager.cancel(O7.c.TELEPORT.getId());
    }

    private static final DI h(Yg.m mVar) {
        return (DI) mVar.getValue();
    }

    private final AbstractC5912b i() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        com.ui.wifiman.model.teleport.g gVar = this.teleportStatusNotification;
        if (gVar == null) {
            AbstractC6492s.v("teleportStatusNotification");
            gVar = null;
        }
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(abstractC5912bR, gVar.a(), l());
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b j(Notification notification) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f(notification));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Notification notification) {
        NotificationManager notificationManager = null;
        Z7.b.h("TeleportConnectionForegroundService - Updating teleport notification", null, 2, null);
        NotificationManager notificationManager2 = this.notificationManager;
        if (notificationManager2 == null) {
            AbstractC6492s.v("notificationManager");
        } else {
            notificationManager = notificationManager2;
        }
        notificationManager.notify(O7.c.TELEPORT.getId(), notification);
    }

    private final AbstractC5912b l() {
        TeleportConnection teleportConnection = this.teleportConnector;
        if (teleportConnection == null) {
            AbstractC6492s.v("teleportConnector");
            teleportConnection = null;
        }
        AbstractC5912b abstractC5912bD = teleportConnection.getState().e1().Y0(this.notificationSingleThreadScheduler, false, 1).X(g.f43222a).D(new h());
        AbstractC6492s.h(abstractC5912bD, "concatMapCompletable(...)");
        return abstractC5912bD;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Yg.m mVarA = AbstractC7986a.d(this).a(null, f43212h[0]);
        InterfaceC7733m2 interfaceC7733m2G = org.kodein.di.d.f(h(mVarA)).g();
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.notificationManager = (NotificationManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, NotificationManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = org.kodein.di.d.f(h(mVarA)).g();
        org.kodein.type.i iVarE2 = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.teleportConnector = (TeleportConnection) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, TeleportConnection.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = org.kodein.di.d.f(h(mVarA)).g();
        org.kodein.type.i iVarE3 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.teleportStatusNotification = (com.ui.wifiman.model.teleport.g) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, com.ui.wifiman.model.teleport.g.class), null);
        this.disposable = i().S();
        Z7.b.h("TeleportConnectionForegroundService - created", null, 2, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopForeground(2);
        InterfaceC6043c interfaceC6043c = this.disposable;
        if (interfaceC6043c != null) {
            interfaceC6043c.dispose();
        }
        Z7.b.h("TeleportConnectionForegroundService - destroyed", null, 2, null);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Z7.b.h("TeleportConnectionForegroundService - onStartCommand", null, 2, null);
        return 1;
    }
}
