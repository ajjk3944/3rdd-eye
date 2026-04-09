package com.ui.wifiman.model.ubiquiti.cloud.sso;

import Ii.AbstractC3061j;
import Ii.C3048c0;
import Ii.N;
import P9.n;
import Yg.J;
import Yg.s;
import Yg.v;
import com.ui.sso.api.UiAccountApi;
import com.ui.sso.auth.UiCookieAuthError;
import com.ui.sso.auth.a;
import com.ui.sso.auth.d;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fe.u;
import gg.AbstractC5912b;
import gg.D;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.util.UUID;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.InterfaceC6469f;
import kg.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import l9.C6556a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public final class a implements Nd.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1481a f43525f = new C1481a(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f43526a;

    /* renamed from: b, reason: collision with root package name */
    private final T7.d f43527b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f43528c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f43529d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f43530e;

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.a$a, reason: collision with other inner class name */
    public static final class C1481a {
        public /* synthetic */ C1481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1481a() {
        }
    }

    private static final class b implements Gb.d {

        /* renamed from: d, reason: collision with root package name */
        public static final C1482a f43531d = new C1482a(null);

        /* renamed from: a, reason: collision with root package name */
        private final UUID f43532a;

        /* renamed from: b, reason: collision with root package name */
        private final UiAccountApi f43533b;

        /* renamed from: c, reason: collision with root package name */
        private com.ui.sso.auth.a f43534c;

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.a$b$a, reason: collision with other inner class name */
        public static final class C1482a {
            public /* synthetic */ C1482a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1482a() {
            }
        }

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.a$b$b, reason: collision with other inner class name */
        static final class C1483b extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43535a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.ui.sso.auth.a f43537c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1483b(com.ui.sso.auth.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43537c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return b.this.new C1483b(this.f43537c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f43535a;
                if (i10 == 0) {
                    v.b(obj);
                    UiAccountApi uiAccountApi = b.this.f43533b;
                    UUID uuid = b.this.f43532a;
                    com.ui.sso.auth.a aVar = this.f43537c;
                    this.f43535a = 1;
                    if (uiAccountApi.g(uuid, aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1483b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class c extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43538a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a.EnumC1372a f43540c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a.EnumC1372a enumC1372a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43540c = enumC1372a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return b.this.new c(this.f43540c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f43538a;
                if (i10 == 0) {
                    v.b(obj);
                    UiAccountApi uiAccountApi = b.this.f43533b;
                    UUID uuid = b.this.f43532a;
                    a.EnumC1372a enumC1372a = this.f43540c;
                    this.f43538a = 1;
                    if (uiAccountApi.d(uuid, enumC1372a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public static final class d implements InterfaceC5915e {
            public d() {
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    b.this.a("sessionCookies", null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public /* synthetic */ b(UUID uuid, UiAccountApi uiAccountApi, com.ui.sso.auth.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, uiAccountApi, aVar);
        }

        @Override // Gb.d
        public void a(String key, String str) {
            com.ui.sso.auth.c cVarA;
            AbstractC6492s.i(key, "key");
            if (!AbstractC6492s.d(key, "sessionCookies")) {
                Z7.b.h("CookieSession -  Storage SET " + key + " IGNORED", null, 2, null);
                return;
            }
            Z7.b.h("CookieSession - Storage SET Cookie auth requested", null, 2, null);
            if (str == null || t.m0(str)) {
                g(null);
            } else {
                Z7.b.h("CookieSession - Storage storing cookie", null, 2, null);
                try {
                    cVarA = com.ui.sso.auth.c.f42174d.a(str);
                } catch (UiCookieAuthError.InvalidCookieFormat e10) {
                    Z7.b.e("CookieSession - Failed to parse incoming UBIC_AUTH cookie", e10, null, 4, null);
                    cVarA = null;
                }
                if (cVarA != null) {
                    g(cVarA);
                }
            }
            Z7.b.h("CookieSession - SET " + key + " -> hash:" + (str != null ? str.hashCode() : 0) + " Success", null, 2, null);
        }

        @Override // Gb.d
        public String b(String key) {
            com.ui.sso.auth.a aVar;
            String strA;
            d.b bVarC;
            com.ui.sso.auth.a aVar2;
            d.b bVarC2;
            d.b bVarC3;
            AbstractC6492s.i(key, "key");
            switch (key.hashCode()) {
                case -1570544871:
                    if (!key.equals("sessionCookies") || (aVar = this.f43534c) == null || (strA = aVar.a()) == null) {
                        return null;
                    }
                    return n.f18488a.e().getUbicAuthCookieName() + "=" + strA;
                case -1135653856:
                    if (!key.equals("pkceCodeVerifier")) {
                        return null;
                    }
                    com.ui.sso.auth.a aVar3 = this.f43534c;
                    com.ui.sso.auth.d dVar = aVar3 instanceof com.ui.sso.auth.d ? (com.ui.sso.auth.d) aVar3 : null;
                    if (dVar == null || (bVarC = dVar.c()) == null) {
                        return null;
                    }
                    return bVarC.a();
                case 210595069:
                    if (key.equals("uiAuthToken") && (aVar2 = this.f43534c) != null) {
                        return aVar2.a();
                    }
                    return null;
                case 780988929:
                    if (!key.equals("deviceName")) {
                        return null;
                    }
                    com.ui.sso.auth.a aVar4 = this.f43534c;
                    com.ui.sso.auth.d dVar2 = aVar4 instanceof com.ui.sso.auth.d ? (com.ui.sso.auth.d) aVar4 : null;
                    if (dVar2 == null || (bVarC2 = dVar2.c()) == null) {
                        return null;
                    }
                    return bVarC2.c();
                case 1109191185:
                    if (!key.equals("deviceId")) {
                        return null;
                    }
                    com.ui.sso.auth.a aVar5 = this.f43534c;
                    com.ui.sso.auth.d dVar3 = aVar5 instanceof com.ui.sso.auth.d ? (com.ui.sso.auth.d) aVar5 : null;
                    if (dVar3 == null || (bVarC3 = dVar3.c()) == null) {
                        return null;
                    }
                    return bVarC3.b();
                default:
                    return null;
            }
        }

        public final com.ui.sso.auth.a e() {
            return this.f43534c;
        }

        public final AbstractC5912b f() {
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d());
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }

        public final void g(com.ui.sso.auth.a aVar) {
            if (aVar != null) {
                try {
                    AbstractC3061j.b(null, new C1483b(aVar, null), 1, null);
                } catch (UiAccountApi.Error e10) {
                    Z7.b.e("CookieSession - Failed to update Auth Cookie", e10, null, 4, null);
                } catch (InterruptedException unused) {
                }
            } else {
                Z7.b.h("CookieSession - Storage invalidating token", null, 2, null);
                for (a.EnumC1372a enumC1372a : a.EnumC1372a.getEntries()) {
                    try {
                        AbstractC3061j.b(null, new c(enumC1372a, null), 1, null);
                    } catch (UiAccountApi.Error e11) {
                        Z7.b.e("CookieSession -  Failed to invalidate Auth Cookie type " + enumC1372a, e11, null, 4, null);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.f43534c = aVar;
        }

        private b(UUID accountId, UiAccountApi api, com.ui.sso.auth.a aVar) {
            AbstractC6492s.i(accountId, "accountId");
            AbstractC6492s.i(api, "api");
            this.f43532a = accountId;
            this.f43533b = api;
            this.f43534c = aVar;
        }
    }

    static final class c implements kg.n {

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.a$c$a, reason: collision with other inner class name */
        static final class C1484a implements p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f43543a;

            C1484a(a aVar) {
                this.f43543a = aVar;
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(UUID authChangedAccountId) {
                AbstractC6492s.i(authChangedAccountId, "authChangedAccountId");
                return AbstractC6492s.d(authChangedAccountId, this.f43543a.f());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43544a;

            b(UiAccountApi uiAccountApi) {
                this.f43544a = uiAccountApi;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiAccountApi apply(UUID it) {
                AbstractC6492s.i(it, "it");
                return this.f43544a;
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(UiAccountApi api) {
            AbstractC6492s.i(api, "api");
            return gg.i.K0(api).T0(Qi.i.c(api.f(), null, 1, null).m0(new C1484a(a.this)).N0(new b(api)));
        }
    }

    static final class d implements kg.n {

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.a$d$a, reason: collision with other inner class name */
        static final class C1485a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f43546a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43547b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f43548c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1485a(UiAccountApi uiAccountApi, a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f43547b = uiAccountApi;
                this.f43548c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1485a(this.f43547b, this.f43548c, interfaceC5380e);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
            
                if (r7 != null) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r6.f43546a
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    Yg.v.b(r7)
                    goto L5f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    Yg.v.b(r7)
                    goto L35
                L1f:
                    Yg.v.b(r7)
                    com.ui.sso.api.UiAccountApi r7 = r6.f43547b
                    com.ui.wifiman.model.ubiquiti.cloud.sso.a r1 = r6.f43548c
                    java.util.UUID r1 = r1.f()
                    com.ui.sso.auth.a$a r5 = com.ui.sso.auth.a.EnumC1372a.UBIC_PKCE
                    r6.f43546a = r3
                    java.lang.Object r7 = r7.e(r1, r5, r6)
                    if (r7 != r0) goto L35
                    return r0
                L35:
                    com.ui.sso.auth.a r7 = (com.ui.sso.auth.a) r7
                    if (r7 == 0) goto L4c
                    boolean r1 = r7 instanceof com.ui.sso.auth.d
                    if (r1 == 0) goto L47
                    r1 = r7
                    com.ui.sso.auth.d r1 = (com.ui.sso.auth.d) r1
                    boolean r1 = r1.d()
                    if (r1 != 0) goto L47
                    goto L48
                L47:
                    r7 = r4
                L48:
                    if (r7 == 0) goto L4c
                L4a:
                    r4 = r7
                    goto L71
                L4c:
                    com.ui.sso.api.UiAccountApi r7 = r6.f43547b
                    com.ui.wifiman.model.ubiquiti.cloud.sso.a r1 = r6.f43548c
                    java.util.UUID r1 = r1.f()
                    com.ui.sso.auth.a$a r3 = com.ui.sso.auth.a.EnumC1372a.UBIC
                    r6.f43546a = r2
                    java.lang.Object r7 = r7.e(r1, r3, r6)
                    if (r7 != r0) goto L5f
                    return r0
                L5f:
                    com.ui.sso.auth.a r7 = (com.ui.sso.auth.a) r7
                    if (r7 == 0) goto L71
                    boolean r0 = r7 instanceof com.ui.sso.auth.c
                    if (r0 == 0) goto L71
                    r0 = r7
                    com.ui.sso.auth.c r0 = (com.ui.sso.auth.c) r0
                    boolean r0 = r0.d()
                    if (r0 != 0) goto L71
                    goto L4a
                L71:
                    com.ui.sso.api.UiAccountApi r7 = r6.f43547b
                    Yg.s r7 = Yg.z.a(r7, r4)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.ubiquiti.cloud.sso.a.d.C1485a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1485a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f43549a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UiAccountApi f43550b;

            b(a aVar, UiAccountApi uiAccountApi) {
                this.f43549a = aVar;
                this.f43550b = uiAccountApi;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof UiAccountApi.Error)) {
                    return z.p(error);
                }
                Z7.b.j("CookieSession - Failed to get auth for acc " + this.f43549a.f(), error, null, 4, null);
                return z.z(Yg.z.a(this.f43550b, null));
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(UiAccountApi api) {
            AbstractC6492s.i(api, "api");
            return Qi.l.b(C3048c0.d(), new C1485a(api, a.this, null)).F(new b(a.this, api));
        }
    }

    static final class e implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43551a = new e();

        e() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(s sVar, s sVar2) {
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC6492s.i(sVar2, "<destruct>");
            return AbstractC6492s.d((com.ui.sso.auth.a) sVar.c(), (com.ui.sso.auth.a) sVar2.c());
        }
    }

    static final class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            com.ui.sso.auth.a aVar = (com.ui.sso.auth.a) sVar.c();
            return new b(a.this.f(), (UiAccountApi) objA, aVar, null);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43553a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(b storage) {
            AbstractC6492s.i(storage, "storage");
            return new C6556a(storage.e());
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43554a = new h();

        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a it) {
            String strA;
            AbstractC6492s.i(it, "it");
            com.ui.sso.auth.a aVar = (com.ui.sso.auth.a) it.b();
            Z7.b.h("CookieSession - auth cookie hash " + ((aVar == null || (strA = aVar.a()) == null) ? null : Integer.valueOf(strA.hashCode())), null, 2, null);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f43555a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(b storage) {
            AbstractC6492s.i(storage, "storage");
            return storage.f();
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43556a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            return Boolean.valueOf(((com.ui.sso.auth.a) c6556a.a()) != null);
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final k f43557a = new k();

        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Boolean it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("CookieSession - isAuthenticated: " + it, null, 2, null);
        }
    }

    public /* synthetic */ a(UUID uuid, Nd.c cVar, u uVar, T7.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, cVar, uVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s d(a aVar, s prev, s latest) {
        AbstractC6492s.i(prev, "prev");
        AbstractC6492s.i(latest, "latest");
        com.ui.sso.auth.a aVar2 = (com.ui.sso.auth.a) prev.j();
        return ((((com.ui.sso.auth.a) latest.j()) instanceof com.ui.sso.auth.c) && (aVar2 instanceof com.ui.sso.auth.c) && !aVar.e((com.ui.sso.auth.c) aVar2, 60000L)) ? prev : latest;
    }

    private final boolean e(com.ui.sso.auth.c cVar, long j10) {
        if (cVar.c() != null) {
            Long lC = cVar.c();
            AbstractC6492s.f(lC);
            if (lC.longValue() < this.f43527b.a() - j10) {
                return true;
            }
        }
        return false;
    }

    @Override // Nd.a
    public gg.i a() {
        return this.f43529d;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.c
    public gg.i b() {
        return this.f43530e;
    }

    public UUID f() {
        return this.f43526a;
    }

    public final gg.i g() {
        return this.f43528c;
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.sso.c
    public AbstractC5912b invalidate() {
        AbstractC5912b abstractC5912bT = this.f43528c.o0().t(i.f43555a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    private a(UUID accountId, Nd.c uiAccountApiService, u schedulers, T7.d systemTimeProvider) {
        AbstractC6492s.i(accountId, "accountId");
        AbstractC6492s.i(uiAccountApiService, "uiAccountApiService");
        AbstractC6492s.i(schedulers, "schedulers");
        AbstractC6492s.i(systemTimeProvider, "systemTimeProvider");
        this.f43526a = accountId;
        this.f43527b = systemTimeProvider;
        gg.i iVarI2 = uiAccountApiService.c().I1(new c()).e1().Y0(schedulers.a(), false, 1).N1(new d()).r1(new InterfaceC6465b() { // from class: Nd.b
            @Override // kg.InterfaceC6465b
            public final Object apply(Object obj, Object obj2) {
                return com.ui.wifiman.model.ubiquiti.cloud.sso.a.d(this.f16387a, (s) obj, (s) obj2);
            }
        }).X(e.f43551a).N0(new f()).F1(schedulers.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43528c = iVarI2;
        gg.i iVarI22 = iVarI2.N0(g.f43553a).W().e1().Y0(schedulers.a(), false, 1).f0(h.f43554a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f43529d = iVarI22;
        gg.i iVarI23 = a().N0(j.f43556a).W().f0(k.f43557a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f43530e = iVarI23;
    }
}
