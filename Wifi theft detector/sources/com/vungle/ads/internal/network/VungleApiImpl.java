package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.JsonConverter;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import l9.l;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.d;
import y8.s;
import z8.z;
import z9.k;

/* loaded from: classes3.dex */
public final class VungleApiImpl implements VungleApi {

    @NotNull
    private static final String VUNGLE_VERSION = "7.1.0";

    @NotNull
    private final r7.b emptyResponseConverter;

    @NotNull
    private final Call.Factory okHttpClient;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final z9.a json = k.b(null, new l() { // from class: com.vungle.ads.internal.network.VungleApiImpl$Companion$json$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((z9.c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull z9.c Json) {
            p.e(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            iArr[HttpMethod.GET.ordinal()] = 1;
            iArr[HttpMethod.POST.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VungleApiImpl(@NotNull Call.Factory okHttpClient) {
        p.e(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new r7.b();
    }

    private final Request.Builder defaultBuilder(String str, String str2, String str3, Map<String, String> map) {
        Request.Builder builderAddHeader = new Request.Builder().url(str2).addHeader(Command.HTTP_HEADER_USER_AGENT, str).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json");
        if (map != null) {
            builderAddHeader.headers(Headers.INSTANCE.of(map));
        }
        if (str3 != null) {
            builderAddHeader.addHeader("X-Vungle-Placement-Ref-Id", str3);
        }
        j jVar = j.INSTANCE;
        String appVersion = jVar.getAppVersion();
        if (appVersion != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        String appId = jVar.getAppId();
        if (appId != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        return builderAddHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request.Builder defaultBuilder$default(VungleApiImpl vungleApiImpl, String str, String str2, String str3, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return vungleApiImpl.defaultBuilder(str, str2, str3, map);
    }

    private final Request.Builder defaultProtoBufBuilder(String str, HttpUrl httpUrl) {
        Request.Builder builderAddHeader = new Request.Builder().url(httpUrl).addHeader(Command.HTTP_HEADER_USER_AGENT, str).addHeader("Vungle-Version", VUNGLE_VERSION).addHeader(CommonGatewayClient.HEADER_CONTENT_TYPE, CommonGatewayClient.HEADER_PROTOBUF);
        j jVar = j.INSTANCE;
        String appId = jVar.getAppId();
        if (appId != null) {
            builderAddHeader.addHeader("X-Vungle-App-Id", appId);
        }
        String appVersion = jVar.getAppVersion();
        if (appVersion != null) {
            builderAddHeader.addHeader("X-VUNGLE-APP-VERSION", appVersion);
        }
        return builderAddHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public com.vungle.ads.internal.network.a ads(@NotNull String ua, @NotNull String path, @NotNull q7.d body) {
        String strC;
        d.i request;
        List<String> placements;
        p.e(ua, "ua");
        p.e(path, "path");
        p.e(body, "body");
        try {
            z9.a aVar = json;
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(q7.d.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            strC = aVar.c(bVarB, body);
            request = body.getRequest();
        } catch (Exception unused) {
        }
        try {
            return new d(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, (request == null || (placements = request.getPlacements()) == null) ? null : (String) z.I(placements), null, 8, null).post(RequestBody.INSTANCE.create(strC, (MediaType) null)).build()), new JsonConverter(t.m(q7.a.class)));
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public com.vungle.ads.internal.network.a config(@NotNull String ua, @NotNull String path, @NotNull q7.d body) {
        z9.a aVar;
        kotlinx.serialization.b bVarB;
        p.e(ua, "ua");
        p.e(path, "path");
        p.e(body, "body");
        try {
            aVar = json;
            bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(q7.d.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        } catch (Exception unused) {
        }
        try {
            return new d(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, null, null, 12, null).post(RequestBody.INSTANCE.create(aVar.c(bVarB, body), (MediaType) null)).build()), new JsonConverter(t.m(ConfigPayload.class)));
        } catch (Exception unused2) {
            return null;
        }
    }

    @VisibleForTesting
    @NotNull
    public final Call.Factory getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public com.vungle.ads.internal.network.a pingTPAT(@NotNull String ua, @NotNull String url, @NotNull HttpMethod requestType, @Nullable Map<String, String> map, @Nullable RequestBody requestBody) {
        Request requestBuild;
        p.e(ua, "ua");
        p.e(url, "url");
        p.e(requestType, "requestType");
        Request.Builder builderDefaultBuilder$default = defaultBuilder$default(this, ua, url, null, map, 4, null);
        int i10 = b.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1) {
            requestBuild = builderDefaultBuilder$default.get().build();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestBody == null) {
                requestBody = RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 6, (Object) null);
            }
            requestBuild = builderDefaultBuilder$default.post(requestBody).build();
        }
        return new d(this.okHttpClient.newCall(requestBuild), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @Nullable
    public com.vungle.ads.internal.network.a ri(@NotNull String ua, @NotNull String path, @NotNull q7.d body) {
        z9.a aVar;
        kotlinx.serialization.b bVarB;
        p.e(ua, "ua");
        p.e(path, "path");
        p.e(body, "body");
        try {
            aVar = json;
            bVarB = kotlinx.serialization.f.b(aVar.a(), t.m(q7.d.class));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        } catch (Exception unused) {
        }
        try {
            return new d(this.okHttpClient.newCall(defaultBuilder$default(this, ua, path, null, null, 12, null).post(RequestBody.INSTANCE.create(aVar.c(bVarB, body), (MediaType) null)).build()), this.emptyResponseConverter);
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public com.vungle.ads.internal.network.a sendAdMarkup(@NotNull String path, @NotNull RequestBody requestBody) {
        p.e(path, "path");
        p.e(requestBody, "requestBody");
        return new d(this.okHttpClient.newCall(defaultBuilder$default(this, "debug", HttpUrl.INSTANCE.get(path).newBuilder().build().getUrl(), null, null, 12, null).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public com.vungle.ads.internal.network.a sendErrors(@NotNull String ua, @NotNull String path, @NotNull RequestBody requestBody) {
        p.e(ua, "ua");
        p.e(path, "path");
        p.e(requestBody, "requestBody");
        return new d(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, HttpUrl.INSTANCE.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    @NotNull
    public com.vungle.ads.internal.network.a sendMetrics(@NotNull String ua, @NotNull String path, @NotNull RequestBody requestBody) {
        p.e(ua, "ua");
        p.e(path, "path");
        p.e(requestBody, "requestBody");
        return new d(this.okHttpClient.newCall(defaultProtoBufBuilder(ua, HttpUrl.INSTANCE.get(path).newBuilder().build()).post(requestBody).build()), this.emptyResponseConverter);
    }
}
