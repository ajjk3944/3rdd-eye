package jb;

import Eb.SsoUser;
import cb.EnumC4235a;
import gg.D;
import gg.z;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import lb.UnifiCloudAccess;
import okhttp3.logging.HttpLoggingInterceptor;
import wb.InterfaceC8291a;

/* loaded from: classes3.dex */
public final class b implements InterfaceC6263a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4235a f50182a;

    /* renamed from: b, reason: collision with root package name */
    private final Ab.a f50183b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50184c;

    /* renamed from: d, reason: collision with root package name */
    private final String f50185d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.f f50186e;

    /* renamed from: f, reason: collision with root package name */
    private final i f50187f;

    /* renamed from: g, reason: collision with root package name */
    private final HttpLoggingInterceptor.Level f50188g;

    /* renamed from: h, reason: collision with root package name */
    private final Cb.a f50189h;

    /* renamed from: i, reason: collision with root package name */
    private jb.g f50190i;

    /* renamed from: j, reason: collision with root package name */
    private final z f50191j;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(jb.g client) {
            AbstractC6492s.i(client, "client");
            return b.this.f50183b.o().h0(client);
        }
    }

    /* renamed from: jb.b$b, reason: collision with other inner class name */
    static final class C1868b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1868b f50193a = new C1868b();

        C1868b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(jb.g client) {
            AbstractC6492s.i(client, "client");
            return client.f().h0(client);
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(SsoUser it) {
            AbstractC6492s.i(it, "it");
            return b.this.f50187f.e();
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jb.g apply(UnifiCloudAccess unifiCloudAccess) {
            AbstractC6492s.i(unifiCloudAccess, "unifiCloudAccess");
            EnumC4235a enumC4235a = b.this.f50182a;
            String str = b.this.f50184c;
            String str2 = b.this.f50185d;
            Gb.f fVar = b.this.f50186e;
            b.h(b.this);
            return new jb.g(enumC4235a, unifiCloudAccess, str, str2, fVar, null, b.this.f50189h, b.this.f50188g);
        }
    }

    static final class e implements InterfaceC6469f {
        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(jb.g it) {
            AbstractC6492s.i(it, "it");
            b.this.f50190i = it;
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50197a;

        f(boolean z10) {
            this.f50197a = z10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(jb.g it) {
            AbstractC6492s.i(it, "it");
            return it.k(this.f50197a);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f50198a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(jb.g it) {
            AbstractC6492s.i(it, "it");
            return it.m();
        }
    }

    public b(EnumC4235a environment, Ab.a ssoClient, String clientAppName, String clientAppVersion, Gb.f storage, i cloudConfigProvider, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level httpLogLevel, Cb.a trustedDeviceHelper) {
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(ssoClient, "ssoClient");
        AbstractC6492s.i(clientAppName, "clientAppName");
        AbstractC6492s.i(clientAppVersion, "clientAppVersion");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(cloudConfigProvider, "cloudConfigProvider");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        this.f50182a = environment;
        this.f50183b = ssoClient;
        this.f50184c = clientAppName;
        this.f50185d = clientAppVersion;
        this.f50186e = storage;
        this.f50187f = cloudConfigProvider;
        this.f50188g = httpLogLevel;
        this.f50189h = trustedDeviceHelper;
        z zVarS = m().s(new a()).s(C1868b.f50193a);
        AbstractC6492s.h(zVarS, "flatMap(...)");
        this.f50191j = vb.d.a(zVarS);
    }

    public static final /* synthetic */ InterfaceC8291a h(b bVar) {
        bVar.getClass();
        return null;
    }

    private final z m() {
        z zVarO = this.f50183b.g().s(new c()).A(new d()).o(new e());
        AbstractC6492s.h(zVarO, "doOnSuccess(...)");
        return zVarO;
    }

    private final z n() {
        return this.f50191j;
    }

    @Override // jb.InterfaceC6263a
    public z a() {
        z zVarS = n().s(g.f50198a);
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    @Override // jb.InterfaceC6263a
    public z b(boolean z10) {
        z zVarS = n().s(new f(z10));
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }
}
