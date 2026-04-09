package com.ubnt.usurvey.ui.signal.floorplan;

import Yg.J;
import android.content.Context;
import com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager;
import com.ubnt.usurvey.ui.signal.floorplan.a;
import com.ui.wifiman.model.signalmapper.floorplan.WifimanFloorplanSessionGpxSerializer;
import gc.EnumC5895b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import h7.C5954a;
import je.u;
import k9.AbstractC6410e;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.InterfaceC6835l;
import od.C7119a;
import od.InterfaceC7120b;

/* loaded from: classes3.dex */
public final class a implements WifimanFloorplanViewControllerManager {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40833a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7120b f40834b;

    /* renamed from: c, reason: collision with root package name */
    private final WifimanFloorplanSessionGpxSerializer f40835c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ubnt.mlkit.product.a f40836d;

    /* renamed from: e, reason: collision with root package name */
    private final u f40837e;

    /* renamed from: com.ubnt.usurvey.ui.signal.floorplan.a$a, reason: collision with other inner class name */
    static final class C1259a implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f40838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f40839b;

        C1259a(long j10, a aVar) {
            this.f40838a = j10;
            this.f40839b = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(C6556a c6556a) {
            z zVarN;
            AbstractC6492s.i(c6556a, "<destruct>");
            String str = (String) c6556a.a();
            if (str != null && (zVarN = this.f40839b.n(str)) != null) {
                return zVarN;
            }
            return z.p(new WifimanFloorplanViewControllerManager.Error.RecordNotFound("Floorplan record " + this.f40838a + " not found"));
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f40840a;

        b(long j10) {
            this.f40840a = j10;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.e("FloorplanControllerMgr - failed to load floorplan " + this.f40840a, it, null, 4, null);
        }
    }

    public static final class c implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40842b;

        public c(String str) {
            this.f40842b = str;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess((com.ui.wifiman.model.signalmapper.floorplan.b) a.this.f40835c.a(this.f40842b));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements n {

        /* renamed from: com.ubnt.usurvey.ui.signal.floorplan.a$d$a, reason: collision with other inner class name */
        public static final class C1260a implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f40844a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.signalmapper.floorplan.b f40845b;

            public C1260a(a aVar, com.ui.wifiman.model.signalmapper.floorplan.b bVar) {
                this.f40844a = aVar;
                this.f40845b = bVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    Context applicationContext = this.f40844a.f40833a.getApplicationContext();
                    AbstractC6492s.h(applicationContext, "getApplicationContext(...)");
                    C5954a c5954a = new C5954a(applicationContext, new C5954a.b(0, 0, 0, false, 7, null));
                    AbstractC6492s.f(this.f40845b);
                    A8.z zVar = new A8.z(c5954a, this.f40845b, this.f40844a.f40836d);
                    zVar.R(od.g.f55636c.a());
                    zVar.u0(EnumC5895b.SIGNAL);
                    interfaceC5910A.onSuccess(zVar);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(long j10) {
            Z7.b.h("FloorplanControllerMgr - Controller init took " + j10 + " millis", null, 2, null);
            return J.f24997a;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(com.ui.wifiman.model.signalmapper.floorplan.b floorplanSession) {
            AbstractC6492s.i(floorplanSession, "floorplanSession");
            z zVarI = z.i(new C1260a(a.this, floorplanSession));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return AbstractC6410e.f(zVarI, new InterfaceC6835l() { // from class: com.ubnt.usurvey.ui.signal.floorplan.b
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return a.d.c(((Long) obj).longValue());
                }
            });
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40846a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (error instanceof WifimanFloorplanSessionGpxSerializer.Error) {
                error = new WifimanFloorplanViewControllerManager.Error.RecordDeserializationFailed("Failed to deserialize gpx", error);
            }
            return z.p(error);
        }
    }

    public static final class f implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A8.z f40848b;

        public f(A8.z zVar) {
            this.f40848b = zVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(a.this.f40835c.b(this.f40848b.m0()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class g implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f40850b;

        g(String str) {
            this.f40850b = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String gpx) {
            AbstractC6492s.i(gpx, "gpx");
            return a.this.f40834b.d(this.f40850b, null, System.currentTimeMillis(), gpx);
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40851a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long apply(C7119a it) {
            AbstractC6492s.i(it, "it");
            return Long.valueOf(it.a());
        }
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f40852a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (error instanceof WifimanFloorplanSessionGpxSerializer.Error) {
                error = new WifimanFloorplanViewControllerManager.Error.RecordSerializationFailed("Failed to serialize gpx", error);
            }
            return z.p(error);
        }
    }

    static final class j implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final j f40853a = new j();

        j() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.e("FloorplanControllerMgr - failed to store floorplan", it, null, 4, null);
        }
    }

    public a(Context context, InterfaceC7120b floorplanRecordManager, WifimanFloorplanSessionGpxSerializer floorplanGpxSerializer, com.ubnt.mlkit.product.a arObjectProductMatcher, u wifiConnectionService) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(floorplanRecordManager, "floorplanRecordManager");
        AbstractC6492s.i(floorplanGpxSerializer, "floorplanGpxSerializer");
        AbstractC6492s.i(arObjectProductMatcher, "arObjectProductMatcher");
        AbstractC6492s.i(wifiConnectionService, "wifiConnectionService");
        this.f40833a = context;
        this.f40834b = floorplanRecordManager;
        this.f40835c = floorplanGpxSerializer;
        this.f40836d = arObjectProductMatcher;
        this.f40837e = wifiConnectionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(long j10, long j11) {
        Z7.b.h("FloorplanControllerMgr - Load [" + j10 + "] took " + j11 + " millis", null, 2, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z n(String str) {
        z zVarI = z.i(new c(str));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarF = AbstractC6410e.f(zVarI, new InterfaceC6835l() { // from class: A8.D
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ubnt.usurvey.ui.signal.floorplan.a.o(((Long) obj).longValue());
            }
        }).s(new d()).F(e.f40846a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(long j10) {
        Z7.b.h("FloorplanControllerMgr - GPX deserialization took " + j10 + " millis", null, 2, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(long j10) {
        Z7.b.h("FloorplanControllerMgr - GPX serialization took " + j10 + " millis", null, 2, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(long j10) {
        Z7.b.h("FloorplanControllerMgr - Store took " + j10 + " millis", null, 2, null);
        return J.f24997a;
    }

    @Override // com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager
    public A8.z a() {
        Context applicationContext = this.f40833a.getApplicationContext();
        AbstractC6492s.h(applicationContext, "getApplicationContext(...)");
        A8.z zVar = new A8.z(new C5954a(applicationContext, new C5954a.b(0, 0, 0, false, 15, null)));
        zVar.R(od.g.f55636c.a());
        zVar.u0(EnumC5895b.SIGNAL);
        return zVar;
    }

    @Override // com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager
    public z b(A8.z controller, String str) {
        AbstractC6492s.i(controller, "controller");
        z zVarI = z.i(new f(controller));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarS = AbstractC6410e.f(zVarI, new InterfaceC6835l() { // from class: A8.B
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ubnt.usurvey.ui.signal.floorplan.a.p(((Long) obj).longValue());
            }
        }).s(new g(str));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        z zVarM = AbstractC6410e.f(zVarS, new InterfaceC6835l() { // from class: A8.C
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ubnt.usurvey.ui.signal.floorplan.a.q(((Long) obj).longValue());
            }
        }).A(h.f40851a).F(i.f40852a).m(j.f40853a);
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }

    @Override // com.ubnt.usurvey.ui.signal.floorplan.WifimanFloorplanViewControllerManager
    public z c(final long j10) {
        z zVarS = this.f40834b.f(j10).o0().s(new C1259a(j10, this));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        z zVarM = AbstractC6410e.f(zVarS, new InterfaceC6835l() { // from class: A8.A
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ubnt.usurvey.ui.signal.floorplan.a.m(j10, ((Long) obj).longValue());
            }
        }).m(new b(j10));
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }
}
