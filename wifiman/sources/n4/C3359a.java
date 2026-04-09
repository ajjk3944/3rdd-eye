package N4;

import N4.F;
import a5.InterfaceC3765a;
import a5.InterfaceC3766b;
import f.AbstractC5487d;
import org.snmp4j.util.SnmpConfigurator;

/* renamed from: N4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3359a implements InterfaceC3765a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3765a f14921a = new C3359a();

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    private static final class C0582a implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0582a f14922a = new C0582a();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14923b = Z4.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14924c = Z4.b.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14925d = Z4.b.d("buildId");

        private C0582a() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0564a abstractC0564a, Z4.d dVar) {
            dVar.b(f14923b, abstractC0564a.b());
            dVar.b(f14924c, abstractC0564a.d());
            dVar.b(f14925d, abstractC0564a.c());
        }
    }

    /* renamed from: N4.a$b */
    private static final class b implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f14926a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14927b = Z4.b.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14928c = Z4.b.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14929d = Z4.b.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14930e = Z4.b.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14931f = Z4.b.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14932g = Z4.b.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14933h = Z4.b.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final Z4.b f14934i = Z4.b.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final Z4.b f14935j = Z4.b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, Z4.d dVar) {
            dVar.d(f14927b, aVar.d());
            dVar.b(f14928c, aVar.e());
            dVar.d(f14929d, aVar.g());
            dVar.d(f14930e, aVar.c());
            dVar.c(f14931f, aVar.f());
            dVar.c(f14932g, aVar.h());
            dVar.c(f14933h, aVar.i());
            dVar.b(f14934i, aVar.j());
            dVar.b(f14935j, aVar.b());
        }
    }

    /* renamed from: N4.a$c */
    private static final class c implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final c f14936a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14937b = Z4.b.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14938c = Z4.b.d("value");

        private c() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, Z4.d dVar) {
            dVar.b(f14937b, cVar.b());
            dVar.b(f14938c, cVar.c());
        }
    }

    /* renamed from: N4.a$d */
    private static final class d implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final d f14939a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14940b = Z4.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14941c = Z4.b.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14942d = Z4.b.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14943e = Z4.b.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14944f = Z4.b.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14945g = Z4.b.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14946h = Z4.b.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final Z4.b f14947i = Z4.b.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final Z4.b f14948j = Z4.b.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final Z4.b f14949k = Z4.b.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final Z4.b f14950l = Z4.b.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final Z4.b f14951m = Z4.b.d("appExitInfo");

        private d() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f10, Z4.d dVar) {
            dVar.b(f14940b, f10.m());
            dVar.b(f14941c, f10.i());
            dVar.d(f14942d, f10.l());
            dVar.b(f14943e, f10.j());
            dVar.b(f14944f, f10.h());
            dVar.b(f14945g, f10.g());
            dVar.b(f14946h, f10.d());
            dVar.b(f14947i, f10.e());
            dVar.b(f14948j, f10.f());
            dVar.b(f14949k, f10.n());
            dVar.b(f14950l, f10.k());
            dVar.b(f14951m, f10.c());
        }
    }

    /* renamed from: N4.a$e */
    private static final class e implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final e f14952a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14953b = Z4.b.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14954c = Z4.b.d("orgId");

        private e() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, Z4.d dVar2) {
            dVar2.b(f14953b, dVar.b());
            dVar2.b(f14954c, dVar.c());
        }
    }

    /* renamed from: N4.a$f */
    private static final class f implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final f f14955a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14956b = Z4.b.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14957c = Z4.b.d("contents");

        private f() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, Z4.d dVar) {
            dVar.b(f14956b, bVar.c());
            dVar.b(f14957c, bVar.b());
        }
    }

    /* renamed from: N4.a$g */
    private static final class g implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final g f14958a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14959b = Z4.b.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14960c = Z4.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14961d = Z4.b.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14962e = Z4.b.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14963f = Z4.b.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14964g = Z4.b.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14965h = Z4.b.d("developmentPlatformVersion");

        private g() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, Z4.d dVar) {
            dVar.b(f14959b, aVar.e());
            dVar.b(f14960c, aVar.h());
            dVar.b(f14961d, aVar.d());
            Z4.b bVar = f14962e;
            aVar.g();
            dVar.b(bVar, null);
            dVar.b(f14963f, aVar.f());
            dVar.b(f14964g, aVar.b());
            dVar.b(f14965h, aVar.c());
        }
    }

    /* renamed from: N4.a$h */
    private static final class h implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final h f14966a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14967b = Z4.b.d("clsId");

        private h() {
        }

        @Override // Z4.c
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            AbstractC5487d.a(obj);
            b(null, (Z4.d) obj2);
        }

        public void b(F.e.a.b bVar, Z4.d dVar) {
            throw null;
        }
    }

    /* renamed from: N4.a$i */
    private static final class i implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final i f14968a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14969b = Z4.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14970c = Z4.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14971d = Z4.b.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14972e = Z4.b.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14973f = Z4.b.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14974g = Z4.b.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14975h = Z4.b.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final Z4.b f14976i = Z4.b.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final Z4.b f14977j = Z4.b.d("modelClass");

        private i() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, Z4.d dVar) {
            dVar.d(f14969b, cVar.b());
            dVar.b(f14970c, cVar.f());
            dVar.d(f14971d, cVar.c());
            dVar.c(f14972e, cVar.h());
            dVar.c(f14973f, cVar.d());
            dVar.f(f14974g, cVar.j());
            dVar.d(f14975h, cVar.i());
            dVar.b(f14976i, cVar.e());
            dVar.b(f14977j, cVar.g());
        }
    }

    /* renamed from: N4.a$j */
    private static final class j implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final j f14978a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14979b = Z4.b.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14980c = Z4.b.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14981d = Z4.b.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14982e = Z4.b.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14983f = Z4.b.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14984g = Z4.b.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14985h = Z4.b.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final Z4.b f14986i = Z4.b.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final Z4.b f14987j = Z4.b.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final Z4.b f14988k = Z4.b.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final Z4.b f14989l = Z4.b.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final Z4.b f14990m = Z4.b.d("generatorType");

        private j() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, Z4.d dVar) {
            dVar.b(f14979b, eVar.g());
            dVar.b(f14980c, eVar.j());
            dVar.b(f14981d, eVar.c());
            dVar.c(f14982e, eVar.l());
            dVar.b(f14983f, eVar.e());
            dVar.f(f14984g, eVar.n());
            dVar.b(f14985h, eVar.b());
            dVar.b(f14986i, eVar.m());
            dVar.b(f14987j, eVar.k());
            dVar.b(f14988k, eVar.d());
            dVar.b(f14989l, eVar.f());
            dVar.d(f14990m, eVar.h());
        }
    }

    /* renamed from: N4.a$k */
    private static final class k implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final k f14991a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f14992b = Z4.b.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f14993c = Z4.b.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f14994d = Z4.b.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f14995e = Z4.b.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f14996f = Z4.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f14997g = Z4.b.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final Z4.b f14998h = Z4.b.d("uiOrientation");

        private k() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, Z4.d dVar) {
            dVar.b(f14992b, aVar.f());
            dVar.b(f14993c, aVar.e());
            dVar.b(f14994d, aVar.g());
            dVar.b(f14995e, aVar.c());
            dVar.b(f14996f, aVar.d());
            dVar.b(f14997g, aVar.b());
            dVar.d(f14998h, aVar.h());
        }
    }

    /* renamed from: N4.a$l */
    private static final class l implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final l f14999a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15000b = Z4.b.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15001c = Z4.b.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15002d = Z4.b.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15003e = Z4.b.d("uuid");

        private l() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0568a abstractC0568a, Z4.d dVar) {
            dVar.c(f15000b, abstractC0568a.b());
            dVar.c(f15001c, abstractC0568a.d());
            dVar.b(f15002d, abstractC0568a.c());
            dVar.b(f15003e, abstractC0568a.f());
        }
    }

    /* renamed from: N4.a$m */
    private static final class m implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final m f15004a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15005b = Z4.b.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15006c = Z4.b.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15007d = Z4.b.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15008e = Z4.b.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f15009f = Z4.b.d("binaries");

        private m() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, Z4.d dVar) {
            dVar.b(f15005b, bVar.f());
            dVar.b(f15006c, bVar.d());
            dVar.b(f15007d, bVar.b());
            dVar.b(f15008e, bVar.e());
            dVar.b(f15009f, bVar.c());
        }
    }

    /* renamed from: N4.a$n */
    private static final class n implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final n f15010a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15011b = Z4.b.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15012c = Z4.b.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15013d = Z4.b.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15014e = Z4.b.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f15015f = Z4.b.d("overflowCount");

        private n() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, Z4.d dVar) {
            dVar.b(f15011b, cVar.f());
            dVar.b(f15012c, cVar.e());
            dVar.b(f15013d, cVar.c());
            dVar.b(f15014e, cVar.b());
            dVar.d(f15015f, cVar.d());
        }
    }

    /* renamed from: N4.a$o */
    private static final class o implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final o f15016a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15017b = Z4.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15018c = Z4.b.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15019d = Z4.b.d(SnmpConfigurator.O_ADDRESS);

        private o() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0572d abstractC0572d, Z4.d dVar) {
            dVar.b(f15017b, abstractC0572d.d());
            dVar.b(f15018c, abstractC0572d.c());
            dVar.c(f15019d, abstractC0572d.b());
        }
    }

    /* renamed from: N4.a$p */
    private static final class p implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final p f15020a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15021b = Z4.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15022c = Z4.b.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15023d = Z4.b.d("frames");

        private p() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0574e abstractC0574e, Z4.d dVar) {
            dVar.b(f15021b, abstractC0574e.d());
            dVar.d(f15022c, abstractC0574e.c());
            dVar.b(f15023d, abstractC0574e.b());
        }
    }

    /* renamed from: N4.a$q */
    private static final class q implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final q f15024a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15025b = Z4.b.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15026c = Z4.b.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15027d = Z4.b.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15028e = Z4.b.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f15029f = Z4.b.d("importance");

        private q() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0574e.AbstractC0576b abstractC0576b, Z4.d dVar) {
            dVar.c(f15025b, abstractC0576b.e());
            dVar.b(f15026c, abstractC0576b.f());
            dVar.b(f15027d, abstractC0576b.b());
            dVar.c(f15028e, abstractC0576b.d());
            dVar.d(f15029f, abstractC0576b.c());
        }
    }

    /* renamed from: N4.a$r */
    private static final class r implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final r f15030a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15031b = Z4.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15032c = Z4.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15033d = Z4.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15034e = Z4.b.d("defaultProcess");

        private r() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, Z4.d dVar) {
            dVar.b(f15031b, cVar.d());
            dVar.d(f15032c, cVar.c());
            dVar.d(f15033d, cVar.b());
            dVar.f(f15034e, cVar.e());
        }
    }

    /* renamed from: N4.a$s */
    private static final class s implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final s f15035a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15036b = Z4.b.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15037c = Z4.b.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15038d = Z4.b.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15039e = Z4.b.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f15040f = Z4.b.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f15041g = Z4.b.d("diskUsed");

        private s() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, Z4.d dVar) {
            dVar.b(f15036b, cVar.b());
            dVar.d(f15037c, cVar.c());
            dVar.f(f15038d, cVar.g());
            dVar.d(f15039e, cVar.e());
            dVar.c(f15040f, cVar.f());
            dVar.c(f15041g, cVar.d());
        }
    }

    /* renamed from: N4.a$t */
    private static final class t implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final t f15042a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15043b = Z4.b.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15044c = Z4.b.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15045d = Z4.b.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15046e = Z4.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final Z4.b f15047f = Z4.b.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final Z4.b f15048g = Z4.b.d("rollouts");

        private t() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, Z4.d dVar2) {
            dVar2.c(f15043b, dVar.f());
            dVar2.b(f15044c, dVar.g());
            dVar2.b(f15045d, dVar.b());
            dVar2.b(f15046e, dVar.c());
            dVar2.b(f15047f, dVar.d());
            dVar2.b(f15048g, dVar.e());
        }
    }

    /* renamed from: N4.a$u */
    private static final class u implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final u f15049a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15050b = Z4.b.d("content");

        private u() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0579d abstractC0579d, Z4.d dVar) {
            dVar.b(f15050b, abstractC0579d.b());
        }
    }

    /* renamed from: N4.a$v */
    private static final class v implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final v f15051a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15052b = Z4.b.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15053c = Z4.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15054d = Z4.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15055e = Z4.b.d("templateVersion");

        private v() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0580e abstractC0580e, Z4.d dVar) {
            dVar.b(f15052b, abstractC0580e.d());
            dVar.b(f15053c, abstractC0580e.b());
            dVar.b(f15054d, abstractC0580e.c());
            dVar.c(f15055e, abstractC0580e.e());
        }
    }

    /* renamed from: N4.a$w */
    private static final class w implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final w f15056a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15057b = Z4.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15058c = Z4.b.d("variantId");

        private w() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0580e.b bVar, Z4.d dVar) {
            dVar.b(f15057b, bVar.b());
            dVar.b(f15058c, bVar.c());
        }
    }

    /* renamed from: N4.a$x */
    private static final class x implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final x f15059a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15060b = Z4.b.d("assignments");

        private x() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, Z4.d dVar) {
            dVar.b(f15060b, fVar.b());
        }
    }

    /* renamed from: N4.a$y */
    private static final class y implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final y f15061a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15062b = Z4.b.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final Z4.b f15063c = Z4.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Z4.b f15064d = Z4.b.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Z4.b f15065e = Z4.b.d("jailbroken");

        private y() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0581e abstractC0581e, Z4.d dVar) {
            dVar.d(f15062b, abstractC0581e.c());
            dVar.b(f15063c, abstractC0581e.d());
            dVar.b(f15064d, abstractC0581e.b());
            dVar.f(f15065e, abstractC0581e.e());
        }
    }

    /* renamed from: N4.a$z */
    private static final class z implements Z4.c {

        /* renamed from: a, reason: collision with root package name */
        static final z f15066a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final Z4.b f15067b = Z4.b.d("identifier");

        private z() {
        }

        @Override // Z4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, Z4.d dVar) {
            dVar.b(f15067b, fVar.b());
        }
    }

    private C3359a() {
    }

    @Override // a5.InterfaceC3765a
    public void a(InterfaceC3766b interfaceC3766b) {
        d dVar = d.f14939a;
        interfaceC3766b.a(F.class, dVar);
        interfaceC3766b.a(C3360b.class, dVar);
        j jVar = j.f14978a;
        interfaceC3766b.a(F.e.class, jVar);
        interfaceC3766b.a(N4.h.class, jVar);
        g gVar = g.f14958a;
        interfaceC3766b.a(F.e.a.class, gVar);
        interfaceC3766b.a(N4.i.class, gVar);
        h hVar = h.f14966a;
        interfaceC3766b.a(F.e.a.b.class, hVar);
        interfaceC3766b.a(N4.j.class, hVar);
        z zVar = z.f15066a;
        interfaceC3766b.a(F.e.f.class, zVar);
        interfaceC3766b.a(A.class, zVar);
        y yVar = y.f15061a;
        interfaceC3766b.a(F.e.AbstractC0581e.class, yVar);
        interfaceC3766b.a(N4.z.class, yVar);
        i iVar = i.f14968a;
        interfaceC3766b.a(F.e.c.class, iVar);
        interfaceC3766b.a(N4.k.class, iVar);
        t tVar = t.f15042a;
        interfaceC3766b.a(F.e.d.class, tVar);
        interfaceC3766b.a(N4.l.class, tVar);
        k kVar = k.f14991a;
        interfaceC3766b.a(F.e.d.a.class, kVar);
        interfaceC3766b.a(N4.m.class, kVar);
        m mVar = m.f15004a;
        interfaceC3766b.a(F.e.d.a.b.class, mVar);
        interfaceC3766b.a(N4.n.class, mVar);
        p pVar = p.f15020a;
        interfaceC3766b.a(F.e.d.a.b.AbstractC0574e.class, pVar);
        interfaceC3766b.a(N4.r.class, pVar);
        q qVar = q.f15024a;
        interfaceC3766b.a(F.e.d.a.b.AbstractC0574e.AbstractC0576b.class, qVar);
        interfaceC3766b.a(N4.s.class, qVar);
        n nVar = n.f15010a;
        interfaceC3766b.a(F.e.d.a.b.c.class, nVar);
        interfaceC3766b.a(N4.p.class, nVar);
        b bVar = b.f14926a;
        interfaceC3766b.a(F.a.class, bVar);
        interfaceC3766b.a(C3361c.class, bVar);
        C0582a c0582a = C0582a.f14922a;
        interfaceC3766b.a(F.a.AbstractC0564a.class, c0582a);
        interfaceC3766b.a(C3362d.class, c0582a);
        o oVar = o.f15016a;
        interfaceC3766b.a(F.e.d.a.b.AbstractC0572d.class, oVar);
        interfaceC3766b.a(N4.q.class, oVar);
        l lVar = l.f14999a;
        interfaceC3766b.a(F.e.d.a.b.AbstractC0568a.class, lVar);
        interfaceC3766b.a(N4.o.class, lVar);
        c cVar = c.f14936a;
        interfaceC3766b.a(F.c.class, cVar);
        interfaceC3766b.a(C3363e.class, cVar);
        r rVar = r.f15030a;
        interfaceC3766b.a(F.e.d.a.c.class, rVar);
        interfaceC3766b.a(N4.t.class, rVar);
        s sVar = s.f15035a;
        interfaceC3766b.a(F.e.d.c.class, sVar);
        interfaceC3766b.a(N4.u.class, sVar);
        u uVar = u.f15049a;
        interfaceC3766b.a(F.e.d.AbstractC0579d.class, uVar);
        interfaceC3766b.a(N4.v.class, uVar);
        x xVar = x.f15059a;
        interfaceC3766b.a(F.e.d.f.class, xVar);
        interfaceC3766b.a(N4.y.class, xVar);
        v vVar = v.f15051a;
        interfaceC3766b.a(F.e.d.AbstractC0580e.class, vVar);
        interfaceC3766b.a(N4.w.class, vVar);
        w wVar = w.f15056a;
        interfaceC3766b.a(F.e.d.AbstractC0580e.b.class, wVar);
        interfaceC3766b.a(N4.x.class, wVar);
        e eVar = e.f14952a;
        interfaceC3766b.a(F.d.class, eVar);
        interfaceC3766b.a(C3364f.class, eVar);
        f fVar = f.f14955a;
        interfaceC3766b.a(F.d.b.class, fVar);
        interfaceC3766b.a(C3365g.class, fVar);
    }
}
