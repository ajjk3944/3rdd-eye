package com.ui.wmw;

import Mf.n;
import Mf.s;
import Of.a;
import com.ui.wmw.api.v1.ApiV1Settings;
import com.ui.wmw.api.v1.b;
import com.ui.wmw.g;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f45498a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f45499b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf.e f45500c;

    /* renamed from: d, reason: collision with root package name */
    private final n f45501d;

    /* renamed from: e, reason: collision with root package name */
    private final s f45502e;

    /* renamed from: f, reason: collision with root package name */
    private final a.InterfaceC0626a f45503f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f45504g;

    /* renamed from: h, reason: collision with root package name */
    private final com.ui.wmw.wifi.b f45505h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f45506i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f45507j;

    static final class a implements kg.n {

        /* renamed from: com.ui.wmw.k$a$a, reason: collision with other inner class name */
        static final class C1677a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f45509a;

            /* renamed from: com.ui.wmw.k$a$a$a, reason: collision with other inner class name */
            public static final class C1678a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ k f45510a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ApiV1Settings f45511b;

                public C1678a(k kVar, ApiV1Settings apiV1Settings) {
                    this.f45510a = kVar;
                    this.f45511b = apiV1Settings;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f45510a.h().v(this.f45511b);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            C1677a(k kVar) {
                this.f45509a = kVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(ApiV1Settings it) {
                AbstractC6492s.i(it, "it");
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1678a(this.f45509a, it));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f45512a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wmw.api.v1.b f45513b;

            public b(k kVar, com.ui.wmw.api.v1.b bVar) {
                this.f45512a = kVar;
                this.f45513b = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f45512a.h().w(((b.d) this.f45513b).a());
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class c implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f45514a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wmw.api.v1.b f45515b;

            public c(k kVar, com.ui.wmw.api.v1.b bVar) {
                this.f45514a = kVar;
                this.f45515b = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f45514a.h().u(((b.C1673b) this.f45515b).a());
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        public static final class d implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f45516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wmw.api.v1.b f45517b;

            public d(k kVar, com.ui.wmw.api.v1.b bVar) {
                this.f45516a = kVar;
                this.f45517b = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f45516a.h().t(((b.a) this.f45517b).a());
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wmw.api.v1.b event) {
            AbstractC6492s.i(event, "event");
            if (event instanceof b.d) {
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(k.this, event));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
            if (event instanceof b.C1673b) {
                AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new c(k.this, event));
                AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR2;
            }
            if (event instanceof b.a) {
                AbstractC5912b abstractC5912bR3 = AbstractC5912b.r(new d(k.this, event));
                AbstractC6492s.h(abstractC5912bR3, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR3;
            }
            if (event instanceof b.c) {
                return k.this.f45499b.c().t(new C1677a(k.this));
            }
            if (event instanceof b.e) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ k(String str, com.ui.wmw.api.v1.a aVar, Kf.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, eVar);
    }

    @Override // com.ui.wmw.g
    public gg.i a() {
        return this.f45504g;
    }

    @Override // com.ui.wmw.g
    public a.InterfaceC0626a c() {
        return this.f45503f;
    }

    @Override // com.ui.wmw.g
    public String e() {
        return this.f45498a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (g.a.b(kVar.e(), e()) && AbstractC6492s.d(kVar.f45500c, this.f45500c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ui.wmw.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n b() {
        return this.f45501d;
    }

    public final Kf.e h() {
        return this.f45500c;
    }

    public final AbstractC5912b i() {
        return this.f45507j;
    }

    @Override // com.ui.wmw.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.ui.wmw.wifi.b d() {
        return this.f45505h;
    }

    private k(String id2, com.ui.wmw.api.v1.a api, Kf.e sessionState) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(sessionState, "sessionState");
        this.f45498a = id2;
        this.f45499b = api;
        this.f45500c = sessionState;
        this.f45501d = new n(api, sessionState);
        n nVarB = b();
        this.f45502e = nVarB;
        this.f45503f = new Of.e(api, sessionState);
        this.f45504g = new Pf.d(api, sessionState, nVarB).f();
        this.f45505h = new com.ui.wmw.wifi.b(api, sessionState, nVarB);
        AbstractC5912b abstractC5912bU = api.b().U(new a());
        AbstractC6492s.h(abstractC5912bU, "flatMapCompletable(...)");
        this.f45506i = abstractC5912bU;
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(abstractC5912bU, a().E0());
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        this.f45507j = abstractC5912bI;
    }
}
