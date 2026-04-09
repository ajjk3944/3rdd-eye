package Od;

import Mj.x;
import Od.a;
import Od.c;
import Wc.b;
import Zc.e;
import com.squareup.moshi.JsonDataException;
import com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus;
import fd.InterfaceC5808b;
import fe.AbstractC5817h;
import gg.C;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.i;
import gg.s;
import gg.v;
import gg.z;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final class c implements a.InterfaceC0616a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f17784d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final z f17785a;

    /* renamed from: b, reason: collision with root package name */
    private final i f17786b;

    /* renamed from: c, reason: collision with root package name */
    private final i f17787c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements Od.a {

        /* renamed from: a, reason: collision with root package name */
        private final a.b f17788a;

        /* renamed from: b, reason: collision with root package name */
        private final a.b f17789b;

        /* renamed from: c, reason: collision with root package name */
        private final a.b f17790c;

        /* renamed from: d, reason: collision with root package name */
        private final a.b f17791d;

        public b(a.b bVar, a.b bVar2, a.b bVar3, a.b bVar4) {
            this.f17788a = bVar;
            this.f17789b = bVar2;
            this.f17790c = bVar3;
            this.f17791d = bVar4;
        }

        @Override // Od.a
        public a.b a() {
            return this.f17789b;
        }

        @Override // Od.a
        public a.b b() {
            return this.f17790c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f17788a, bVar.f17788a) && AbstractC6492s.d(this.f17789b, bVar.f17789b) && AbstractC6492s.d(this.f17790c, bVar.f17790c) && AbstractC6492s.d(this.f17791d, bVar.f17791d);
        }

        public int hashCode() {
            a.b bVar = this.f17788a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            a.b bVar2 = this.f17789b;
            int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            a.b bVar3 = this.f17790c;
            int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
            a.b bVar4 = this.f17791d;
            return iHashCode3 + (bVar4 != null ? bVar4.hashCode() : 0);
        }

        public String toString() {
            return "UbiquitiCloudStatusImpl(unifiConsoles=" + this.f17788a + ", unifiRemoteAccess=" + this.f17789b + ", teleport=" + this.f17790c + ", speedtest=" + this.f17791d + ")";
        }
    }

    /* renamed from: Od.c$c, reason: collision with other inner class name */
    static final class C0623c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0623c f17792a = new C0623c();

        /* renamed from: Od.c$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17793a;

            static {
                int[] iArr = new int[e.b.values().length];
                try {
                    iArr[e.b.DISCONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.b.AUTHENTICATING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.b.OBTAINING_IP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.b.CONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f17793a = iArr;
            }
        }

        C0623c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f17793a[it.f().ordinal()];
            boolean z10 = true;
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                z10 = false;
            } else if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5808b f17794a;

        public d(InterfaceC5808b interfaceC5808b) {
            this.f17794a = interfaceC5808b;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess((Pd.d) new x.b().c("https://status.ui.com").g(this.f17794a.a()).a(Nj.g.e()).b(Pj.a.f()).e().b(Pd.d.class));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class e implements n {

        static final class a implements p {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17796a = new a();

            a() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean networkConnectionAvailable) {
                AbstractC6492s.i(networkConnectionAvailable, "networkConnectionAvailable");
                return networkConnectionAvailable.booleanValue();
            }
        }

        static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pd.d f17797a;

            b(Pd.d dVar) {
                this.f17797a = dVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Boolean it) {
                AbstractC6492s.i(it, "it");
                return this.f17797a.a().O(Gg.a.d()).E(Gg.a.a());
            }
        }

        /* renamed from: Od.c$e$c, reason: collision with other inner class name */
        static final class C0624c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final C0624c f17798a = new C0624c();

            C0624c() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("UbiquitiCloudStatus - Fetch Subscribed", null, 2, null);
            }
        }

        static final class d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final d f17799a = new d();

            d() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(ApiUbiquitiCloudStatus it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("UbiquitiCloudStatus - Fetch Success", null, 2, null);
            }
        }

        /* renamed from: Od.c$e$e, reason: collision with other inner class name */
        static final class C0625e implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final C0625e f17800a = new C0625e();

            C0625e() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("UbiquitiCloudStatus - Fetch Failed", it, null, 4, null);
            }
        }

        static final class f implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f17801a;

            f(c cVar) {
                this.f17801a = cVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Od.a apply(ApiUbiquitiCloudStatus it) {
                ApiUbiquitiCloudStatus.Component.a aVarB;
                ApiUbiquitiCloudStatus.Component.a aVarB2;
                ApiUbiquitiCloudStatus.Component.a aVarB3;
                ApiUbiquitiCloudStatus.Component.a aVarB4;
                AbstractC6492s.i(it, "it");
                ApiUbiquitiCloudStatus.Component component = (ApiUbiquitiCloudStatus.Component) it.e().get(ApiUbiquitiCloudStatus.Component.b.TELEPORT_NCA_API);
                a.b bVarF = null;
                a.b bVarF2 = (component == null || (aVarB4 = component.b()) == null) ? null : this.f17801a.f(aVarB4);
                ApiUbiquitiCloudStatus.Component component2 = (ApiUbiquitiCloudStatus.Component) it.e().get(ApiUbiquitiCloudStatus.Component.b.SPEEDTEST);
                a.b bVarF3 = (component2 == null || (aVarB3 = component2.b()) == null) ? null : this.f17801a.f(aVarB3);
                ApiUbiquitiCloudStatus.Component component3 = (ApiUbiquitiCloudStatus.Component) it.e().get(ApiUbiquitiCloudStatus.Component.b.UNIFI_CLOUD_CONSOLE);
                a.b bVarF4 = (component3 == null || (aVarB2 = component3.b()) == null) ? null : this.f17801a.f(aVarB2);
                ApiUbiquitiCloudStatus.Component component4 = (ApiUbiquitiCloudStatus.Component) it.e().get(ApiUbiquitiCloudStatus.Component.b.UNIFI_REMOTE_ACCESS);
                if (component4 != null && (aVarB = component4.b()) != null) {
                    bVarF = this.f17801a.f(aVarB);
                }
                return new b(bVarF4, bVarF, bVarF2, bVarF3);
            }
        }

        static final class g implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f17802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f17803b;

            g(N n10, c cVar) {
                this.f17802a = n10;
                this.f17803b = cVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Wc.b fetch) {
                AbstractC6492s.i(fetch, "fetch");
                this.f17802a.f51689a = this.f17803b.h(fetch);
            }
        }

        static final class h implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f17804a;

            static final class a implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ N f17805a;

                a(N n10) {
                    this.f17805a = n10;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final v apply(Object it) {
                    AbstractC6492s.i(it, "it");
                    Object obj = this.f17805a.f51689a;
                    if (obj != null) {
                        return (s) obj;
                    }
                    AbstractC6492s.v("resubscriptionOperator");
                    return null;
                }
            }

            h(N n10) {
                this.f17804a = n10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v apply(s it) {
                AbstractC6492s.i(it, "it");
                return it.Q(new a(this.f17804a));
            }
        }

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z c(Throwable error) {
            AbstractC6492s.i(error, "error");
            z zVarZ = ((error instanceof JsonDataException) || (error instanceof IOException) || (error instanceof HttpException)) ? z.z(new b.a.C0896a(error)) : z.p(error);
            AbstractC6492s.f(zVarZ);
            return zVarZ;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Pd.d dVar) {
            N n10 = new N();
            z zVarA = c.this.f17786b.m0(a.f17796a).o0().s(new b(dVar)).n(C0624c.f17798a).o(d.f17799a).m(C0625e.f17800a).A(new f(c.this));
            AbstractC6492s.h(zVarA, "map(...)");
            return AbstractC5817h.d(zVarA, new InterfaceC6835l() { // from class: Od.d
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return c.e.c((Throwable) obj);
                }
            }).F(new g(n10, c.this)).v0(new h(n10)).d1(EnumC5911a.LATEST);
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f17806a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Wc.b it) {
            String strValueOf;
            AbstractC6492s.i(it, "it");
            if ((it instanceof b.c) || (it instanceof b.C0898b)) {
                strValueOf = "In Progress";
            } else if (it instanceof b.a.C0897b) {
                strValueOf = String.valueOf(((b.a.C0897b) it).b());
            } else {
                if (!(it instanceof b.a.C0896a)) {
                    throw new NoWhenBranchMatchedException();
                }
                strValueOf = "Error";
            }
            Z7.b.h("UbiquitiCloudStatus - " + strValueOf, null, 2, null);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Wc.b f17807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f17808b;

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17809a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean apply(Long it) {
                AbstractC6492s.i(it, "it");
                return Boolean.TRUE;
            }
        }

        static final class b implements p {

            /* renamed from: a, reason: collision with root package name */
            public static final b f17810a = new b();

            b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(Boolean it) {
                AbstractC6492s.i(it, "it");
                return it.booleanValue();
            }
        }

        g(Wc.b bVar, c cVar) {
            this.f17807a = bVar;
            this.f17808b = cVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(Boolean networkAvailable) {
            s sVarC1;
            AbstractC6492s.i(networkAvailable, "networkAvailable");
            if (!networkAvailable.booleanValue()) {
                return this.f17808b.f17786b.m0(b.f17810a).O1(1L).f2().o0(Gg.a.d());
            }
            Wc.b bVar = this.f17807a;
            if (bVar instanceof b.a.C0896a) {
                sVarC1 = s.c1(5000L, TimeUnit.MILLISECONDS, Gg.a.d());
            } else {
                if (!(bVar instanceof b.c) && !(bVar instanceof b.C0898b) && !(bVar instanceof b.a.C0897b)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVarC1 = s.c1(30000L, TimeUnit.MILLISECONDS, Gg.a.d());
            }
            return sVarC1.i0(a.f17809a);
        }
    }

    public c(Zc.f networkConnection, InterfaceC5808b sharedOkhttpClientHolder) {
        AbstractC6492s.i(networkConnection, "networkConnection");
        AbstractC6492s.i(sharedOkhttpClientHolder, "sharedOkhttpClientHolder");
        z zVarI = z.i(new d(sharedOkhttpClientHolder));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f17785a = zVarE;
        i iVarN0 = networkConnection.getState().N0(C0623c.f17792a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f17786b = iVarN0;
        i iVarI2 = zVarE.w(new e()).e1().Y0(Gg.a.a(), false, 1).W().r1(new InterfaceC6465b() { // from class: Od.b
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return c.g((Wc.b) obj, (Wc.b) obj2);
            }
        }).f0(f.f17806a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f17787c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b f(ApiUbiquitiCloudStatus.Component.a aVar) {
        if (aVar instanceof ApiUbiquitiCloudStatus.Component.a.b.C1492b) {
            return a.b.AbstractC0617a.C0619b.f17781a;
        }
        if (aVar instanceof ApiUbiquitiCloudStatus.Component.a.b.C1491a) {
            return a.b.AbstractC0617a.C0618a.f17780a;
        }
        if (aVar instanceof ApiUbiquitiCloudStatus.Component.a.c.b) {
            return a.b.AbstractC0620b.C0622b.f17783a;
        }
        if (aVar instanceof ApiUbiquitiCloudStatus.Component.a.c.C1493a) {
            return a.b.AbstractC0620b.C0621a.f17782a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wc.b g(Wc.b previous, Wc.b current) {
        AbstractC6492s.i(previous, "previous");
        AbstractC6492s.i(current, "current");
        return ((current instanceof b.C0898b) && (previous instanceof b.a)) ? previous : current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s h(Wc.b bVar) {
        s sVarV = this.f17786b.o0().v(new g(bVar, this));
        AbstractC6492s.h(sVarV, "flatMapObservable(...)");
        return sVarV;
    }

    @Override // Od.a.InterfaceC0616a
    public i a() {
        return this.f17787c;
    }
}
