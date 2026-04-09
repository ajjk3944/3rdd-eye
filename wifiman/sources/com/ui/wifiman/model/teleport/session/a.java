package com.ui.wifiman.model.teleport.session;

import Yg.s;
import ac.C3784a;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import com.ubnt.teleport.TeleportTunnel;
import com.ui.wifiman.db.RoomPersistentInstance;
import com.ui.wifiman.model.teleport.session.TeleportSession;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import lc.C6570a;
import lc.C6572c;
import mc.InterfaceC6794a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class a implements TeleportSession {

    /* renamed from: k, reason: collision with root package name */
    public static final C1475a f43485k = new C1475a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f43486a;

    /* renamed from: b, reason: collision with root package name */
    private final lc.e f43487b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6794a f43488c;

    /* renamed from: d, reason: collision with root package name */
    private final b f43489d;

    /* renamed from: e, reason: collision with root package name */
    private final z f43490e;

    /* renamed from: f, reason: collision with root package name */
    private final z f43491f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f43492g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f43493h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f43494i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f43495j;

    /* renamed from: com.ui.wifiman.model.teleport.session.a$a, reason: collision with other inner class name */
    public static final class C1475a {
        public /* synthetic */ C1475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1475a() {
        }
    }

    public static final class b extends RoomPersistentInstance {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ac.c dao) {
            super(dao);
            AbstractC6492s.i(dao, "dao");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C3784a e(C3784a persistent) {
            AbstractC6492s.i(persistent, "persistent");
            return persistent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public C3784a f() {
            return new C3784a(0, false, null, null, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ui.wifiman.db.RoomPersistentInstance
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C3784a g(C3784a instance) {
            AbstractC6492s.i(instance, "instance");
            return instance;
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43496a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C3784a it) {
            AbstractC6492s.i(it, "it");
            String strC = it.c();
            String strD = strC != null ? e.b.d(strC) : null;
            return new C6556a(strD != null ? e.b.a(strD) : null);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43497a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C3784a it) {
            AbstractC6492s.i(it, "it");
            String strF = it.f();
            String strB = strF != null ? TeleportTunnel.d.b(strF) : null;
            return new C6556a(strB != null ? TeleportTunnel.d.a(strB) : null);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43498a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TeleportSession.a apply(Boolean vpnApproved) {
            AbstractC6492s.i(vpnApproved, "vpnApproved");
            return new TeleportSession.a(vpnApproved.booleanValue());
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43499a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(TeleportSession.a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Teleport permission state " + it, null, 2, null);
        }
    }

    public static final class g implements InterfaceC5915e {
        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.j("VPN profile already configured", null, null, 6, null);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43500a = new h();

        /* renamed from: com.ui.wifiman.model.teleport.session.a$h$a, reason: collision with other inner class name */
        public static final class C1476a implements InterfaceC5915e {
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.h("VPN Profile creation CANCELLED", null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class b implements InterfaceC5915e {
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.h("VPN Profile creation COMPLETE", null, 2, null);
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
        public final gg.f apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            long jLongValue = ((Number) sVar.a()).longValue();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            if (((C6572c) objC).c() != 0) {
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b());
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
            if (System.currentTimeMillis() - jLongValue < 500) {
                Z7.b.h("VPN Profile creation cancelled probably by system, because other VPN running", null, 2, null);
                return AbstractC5912b.D(TeleportSession.Error.VPNProfileCreationCancelledBySystem.f43482a);
            }
            AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new C1476a());
            AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR2;
        }
    }

    public static final class i implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class j implements C {
        public j() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                String name = a.this.f43488c.getName();
                if (name == null) {
                    name = a.this.f43488c.b();
                }
                interfaceC5910A.onSuccess(name);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class k implements C {
        public k() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(VpnService.prepare(a.this.f43486a) == null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class l implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final l f43503a = new l();

        /* renamed from: com.ui.wifiman.model.teleport.session.a$l$a, reason: collision with other inner class name */
        static final class C1477a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C1477a f43504a = new C1477a();

            C1477a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Object it) {
                AbstractC6492s.i(it, "it");
                return gg.i.d2(1000L, TimeUnit.MILLISECONDS);
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(C1477a.f43504a);
        }
    }

    public a(Context applicationContext, lc.e activityResultService, InterfaceC6794a androidDeviceInfo, ac.c teleportSessionDao) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(activityResultService, "activityResultService");
        AbstractC6492s.i(androidDeviceInfo, "androidDeviceInfo");
        AbstractC6492s.i(teleportSessionDao, "teleportSessionDao");
        this.f43486a = applicationContext;
        this.f43487b = activityResultService;
        this.f43488c = androidDeviceInfo;
        b bVar = new b(teleportSessionDao);
        this.f43489d = bVar;
        this.f43490e = androidDeviceInfo.getId();
        z zVarI = z.i(new j());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        this.f43491f = zVarI;
        z zVarI2 = z.i(new k());
        AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarF1 = zVarI2.K(l.f43503a).W().F1(Gg.a.d());
        AbstractC6492s.h(iVarF1, "subscribeOn(...)");
        this.f43492g = iVarF1;
        gg.i iVarI2 = iVarF1.N0(e.f43498a).W().f0(f.f43499a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43493h = iVarI2;
        gg.i iVarI22 = bVar.b().N0(c.f43496a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43494i = iVarI22;
        gg.i iVarI23 = bVar.b().N0(d.f43497a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43495j = iVarI23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3784a l(String str, C3784a it) {
        AbstractC6492s.i(it, "it");
        if (str == null) {
            str = null;
        }
        return C3784a.b(it, 0, false, str, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3784a m(String str, C3784a it) {
        AbstractC6492s.i(it, "it");
        if (str == null) {
            str = null;
        }
        return C3784a.b(it, 0, false, null, str, 7, null);
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public gg.i a() {
        return this.f43495j;
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public AbstractC5912b b() {
        Intent intentPrepare = VpnService.prepare(this.f43486a);
        if (intentPrepare != null) {
            Ag.e eVar = Ag.e.f756a;
            z zVarI = z.i(new i());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            AbstractC5912b abstractC5912bT = eVar.a(zVarI, this.f43487b.a(new C6570a(lc.f.a(O7.a.VPN_PROFILE_CREATION), intentPrepare, null))).t(h.f43500a);
            if (abstractC5912bT != null) {
                return abstractC5912bT;
            }
        }
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new g());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public gg.i c() {
        return this.f43494i;
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public gg.i d() {
        return this.f43493h;
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public AbstractC5912b e(final String str) {
        AbstractC5912b abstractC5912bW = this.f43489d.a(new InterfaceC6835l() { // from class: Hd.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.teleport.session.a.m(str, (C3784a) obj);
            }
        }).L(Gg.a.a()).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // J7.G
    public z f() {
        return this.f43491f;
    }

    @Override // com.ui.wifiman.model.teleport.session.TeleportSession
    public AbstractC5912b g(final String str) {
        AbstractC5912b abstractC5912bW = this.f43489d.a(new InterfaceC6835l() { // from class: Hd.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.teleport.session.a.l(str, (C3784a) obj);
            }
        }).L(Gg.a.a()).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // J7.G
    public z getClientId() {
        return this.f43490e;
    }
}
