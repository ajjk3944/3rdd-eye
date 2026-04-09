package com.vungle.ads.internal.network;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import U9.D;
import U9.InterfaceC1608e;
import U9.t;
import U9.z;
import a6.C1653b;
import a6.C1657f;
import a6.C1658g;
import b6.C1854b;
import b6.C1855c;
import b9.C1992A;
import c9.C2097r;
import com.vungle.ads.C4055m;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.l;

/* compiled from: VungleApiImpl.kt */
/* loaded from: classes2.dex */
public final class h implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private String appId;
    private final C1854b emptyResponseConverter;
    private final InterfaceC1608e.a okHttpClient;
    public static final b Companion = new b(null);
    private static final AbstractC1564a json = t.a(a.INSTANCE);

    /* compiled from: VungleApiImpl.kt */
    public static final class a extends m implements l<C1568e, C1992A> {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public /* bridge */ /* synthetic */ C1992A invoke(C1568e c1568e) {
            invoke2(c1568e);
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1568e Json) {
            kotlin.jvm.internal.l.f(Json, "$this$Json");
            Json.f11793c = true;
            Json.f11791a = true;
            Json.f11792b = false;
            Json.f11794d = true;
        }
    }

    /* compiled from: VungleApiImpl.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private b() {
        }
    }

    public h(InterfaceC1608e.a okHttpClient) {
        kotlin.jvm.internal.l.f(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new C1854b();
    }

    private final z.a defaultBuilder(String str, String str2, String str3) {
        z.a aVar = new z.a();
        aVar.f(str2);
        aVar.a("User-Agent", str);
        aVar.a("Vungle-Version", VUNGLE_VERSION);
        aVar.a("Content-Type", "application/json");
        String str4 = this.appId;
        if (str4 != null) {
            aVar.a("X-Vungle-App-Id", str4);
        }
        if (str3 != null) {
            aVar.a("X-Vungle-Placement-Ref-Id", str3);
        }
        return aVar;
    }

    public static /* synthetic */ z.a defaultBuilder$default(h hVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return hVar.defaultBuilder(str, str2, str3);
    }

    private final z.a defaultProtoBufBuilder(String str, String str2) {
        z.a aVar = new z.a();
        aVar.f(str2);
        aVar.a("User-Agent", str);
        aVar.a("Vungle-Version", VUNGLE_VERSION);
        aVar.a("Content-Type", "application/x-protobuf");
        String str3 = this.appId;
        if (str3 != null) {
            aVar.a("X-Vungle-App-Id", str3);
        }
        return aVar;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<C1653b> ads(String ua2, String path, C1657f body) {
        List<String> placements;
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(body, "body");
        try {
            AbstractC1564a abstractC1564a = json;
            String strB = abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(C1657f.class)), body);
            C1657f.i request = body.getRequest();
            z.a aVarDefaultBuilder = defaultBuilder(ua2, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) C2097r.q0(placements));
            D.Companion.getClass();
            aVarDefaultBuilder.d("POST", D.a.b(strB, null));
            return new c(this.okHttpClient.a(aVarDefaultBuilder.b()), new C1855c(x.b(C1653b.class)));
        } catch (Exception unused) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 101, "Error with url: ".concat(path), (String) null, (String) null, (String) null, 28, (Object) null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<C1658g> config(String ua2, String path, C1657f body) {
        String strB;
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(body, "body");
        try {
            AbstractC1564a abstractC1564a = json;
            strB = abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(C1657f.class)), body);
        } catch (Exception unused) {
        }
        try {
            z.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, path, null, 4, null);
            D.Companion.getClass();
            aVarDefaultBuilder$default.d("POST", D.a.b(strB, null));
            return new c(this.okHttpClient.a(aVarDefaultBuilder$default.b()), new C1855c(x.b(C1658g.class)));
        } catch (Exception unused2) {
            return null;
        }
    }

    public final InterfaceC1608e.a getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<Void> pingTPAT(String ua2, String url) {
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(url, "url");
        t.a aVar = new t.a();
        aVar.c(null, url);
        z.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, aVar.a().f().a().i, null, 4, null);
        aVarDefaultBuilder$default.d("GET", null);
        return new c(this.okHttpClient.a(aVarDefaultBuilder$default.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<Void> ri(String ua2, String path, C1657f body) {
        String str;
        String strB;
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(body, "body");
        try {
            AbstractC1564a abstractC1564a = json;
            strB = abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(C1657f.class)), body);
            str = path;
        } catch (Exception unused) {
            str = path;
        }
        try {
            z.a aVarDefaultBuilder$default = defaultBuilder$default(this, ua2, str, null, 4, null);
            D.Companion.getClass();
            aVarDefaultBuilder$default.d("POST", D.a.b(strB, null));
            return new c(this.okHttpClient.a(aVarDefaultBuilder$default.b()), this.emptyResponseConverter);
        } catch (Exception unused2) {
            C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 101, "Error with url: ".concat(str), (String) null, (String) null, (String) null, 28, (Object) null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<Void> sendAdMarkup(String url, D requestBody) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(requestBody, "requestBody");
        t.a aVar = new t.a();
        aVar.c(null, url);
        z.a aVarDefaultBuilder$default = defaultBuilder$default(this, "debug", aVar.a().f().a().i, null, 4, null);
        aVarDefaultBuilder$default.d("POST", requestBody);
        return new c(this.okHttpClient.a(aVarDefaultBuilder$default.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<Void> sendErrors(String ua2, String path, D requestBody) {
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(requestBody, "requestBody");
        t.a aVar = new t.a();
        aVar.c(null, path);
        z.a aVarDefaultProtoBufBuilder = defaultProtoBufBuilder(ua2, aVar.a().f().a().i);
        aVarDefaultProtoBufBuilder.d("POST", requestBody);
        return new c(this.okHttpClient.a(aVarDefaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public com.vungle.ads.internal.network.a<Void> sendMetrics(String ua2, String path, D requestBody) {
        kotlin.jvm.internal.l.f(ua2, "ua");
        kotlin.jvm.internal.l.f(path, "path");
        kotlin.jvm.internal.l.f(requestBody, "requestBody");
        t.a aVar = new t.a();
        aVar.c(null, path);
        z.a aVarDefaultProtoBufBuilder = defaultProtoBufBuilder(ua2, aVar.a().f().a().i);
        aVarDefaultProtoBufBuilder.d("POST", requestBody);
        return new c(this.okHttpClient.a(aVarDefaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public void setAppId(String appId) {
        kotlin.jvm.internal.l.f(appId, "appId");
        this.appId = appId;
    }
}
