package o5;

import a5.InterfaceC3765a;
import a5.InterfaceC3766b;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7082c implements InterfaceC3765a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3765a f55380a = new C7082c();

    /* renamed from: o5.c$a */
    private static final class a implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final a f55381a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55382b = Z4.b.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55383c = Z4.b.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55384d = Z4.b.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f55385e = Z4.b.d("deviceManufacturer");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f55386f = Z4.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f55387g = Z4.b.d("appProcessDetails");

        private a() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C7080a c7080a, Z4.d dVar) {
            dVar.b(f55382b, c7080a.e());
            dVar.b(f55383c, c7080a.f());
            dVar.b(f55384d, c7080a.a());
            dVar.b(f55385e, c7080a.d());
            dVar.b(f55386f, c7080a.c());
            dVar.b(f55387g, c7080a.b());
        }
    }

    /* renamed from: o5.c$b */
    private static final class b implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f55388a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55389b = Z4.b.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55390c = Z4.b.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55391d = Z4.b.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f55392e = Z4.b.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f55393f = Z4.b.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f55394g = Z4.b.d("androidAppInfo");

        private b() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C7081b c7081b, Z4.d dVar) {
            dVar.b(f55389b, c7081b.b());
            dVar.b(f55390c, c7081b.c());
            dVar.b(f55391d, c7081b.f());
            dVar.b(f55392e, c7081b.e());
            dVar.b(f55393f, c7081b.d());
            dVar.b(f55394g, c7081b.a());
        }
    }

    /* renamed from: o5.c$c, reason: collision with other inner class name */
    private static final class C1999c implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C1999c f55395a = new C1999c();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55396b = Z4.b.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55397c = Z4.b.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55398d = Z4.b.d("sessionSamplingRate");

        private C1999c() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C7084e c7084e, Z4.d dVar) {
            dVar.b(f55396b, c7084e.b());
            dVar.b(f55397c, c7084e.a());
            dVar.e(f55398d, c7084e.c());
        }
    }

    /* renamed from: o5.c$d */
    private static final class d implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final d f55399a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55400b = Z4.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55401c = Z4.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55402d = Z4.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f55403e = Z4.b.d("defaultProcess");

        private d() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Z4.d dVar) {
            dVar.b(f55400b, uVar.c());
            dVar.d(f55401c, uVar.b());
            dVar.d(f55402d, uVar.a());
            dVar.f(f55403e, uVar.d());
        }
    }

    /* renamed from: o5.c$e */
    private static final class e implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final e f55404a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55405b = Z4.b.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55406c = Z4.b.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55407d = Z4.b.d("applicationInfo");

        private e() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(z zVar, Z4.d dVar) {
            dVar.b(f55405b, zVar.b());
            dVar.b(f55406c, zVar.c());
            dVar.b(f55407d, zVar.a());
        }
    }

    /* renamed from: o5.c$f */
    private static final class f implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final f f55408a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f55409b = Z4.b.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f55410c = Z4.b.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f55411d = Z4.b.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f55412e = Z4.b.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f55413f = Z4.b.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f55414g = Z4.b.d("firebaseInstallationId");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f55415h = Z4.b.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C7078C c7078c, Z4.d dVar) {
            dVar.b(f55409b, c7078c.f());
            dVar.b(f55410c, c7078c.e());
            dVar.d(f55411d, c7078c.g());
            dVar.c(f55412e, c7078c.b());
            dVar.b(f55413f, c7078c.a());
            dVar.b(f55414g, c7078c.d());
            dVar.b(f55415h, c7078c.c());
        }
    }

    private C7082c() {
    }

    @Override // a5.InterfaceC3765a
    public void a(InterfaceC3766b interfaceC3766b) {
        interfaceC3766b.a(z.class, e.f55404a);
        interfaceC3766b.a(C7078C.class, f.f55408a);
        interfaceC3766b.a(C7084e.class, C1999c.f55395a);
        interfaceC3766b.a(C7081b.class, b.f55388a);
        interfaceC3766b.a(C7080a.class, a.f55381a);
        interfaceC3766b.a(u.class, d.f55399a);
    }
}
