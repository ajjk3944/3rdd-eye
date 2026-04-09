package com.unity3d.ads.network.client;

import c9.c;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.vungle.ads.internal.ui.AdActivity;
import d9.e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.o;
import l9.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/network/client/OkHttp3Client;", "Lcom/unity3d/ads/network/HttpClient;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "", "connectTimeout", "readTimeout", "Lokhttp3/Response;", "makeRequest", "(Lokhttp3/Request;JJLc9/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/network/model/HttpRequest;", "Lcom/unity3d/ads/network/model/HttpResponse;", "execute", "(Lcom/unity3d/ads/network/model/HttpRequest;Lc9/c;)Ljava/lang/Object;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lokhttp3/OkHttpClient;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttp3Client.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/ads/network/client/OkHttp3Client\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,65:1\n314#2,11:66\n*S KotlinDebug\n*F\n+ 1 OkHttp3Client.kt\ncom/unity3d/ads/network/client/OkHttp3Client\n*L\n48#1:66,11\n*E\n"})
/* loaded from: classes3.dex */
public final class OkHttp3Client implements HttpClient {

    @NotNull
    private final OkHttpClient client;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lcom/unity3d/ads/network/model/HttpResponse;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lcom/unity3d/ads/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.network.client.OkHttp3Client$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, c cVar) {
            super(2, cVar);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return new AnonymousClass2(this.$request, this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Request okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = okHttp3Client.makeRequest(okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            Response response = (Response) obj;
            int iCode = response.code();
            Map<String, List<String>> multimap = response.headers().toMultimap();
            String url = response.request().url().getUrl();
            ResponseBody responseBodyBody = response.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = "";
            }
            kotlin.jvm.internal.p.d(multimap, "toMultimap()");
            kotlin.jvm.internal.p.d(url, "toString()");
            return new HttpResponse(strString, iCode, multimap, url);
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public OkHttp3Client(@NotNull ISDKDispatchers dispatchers, @NotNull OkHttpClient client) {
        kotlin.jvm.internal.p.e(dispatchers, "dispatchers");
        kotlin.jvm.internal.p.e(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(Request request, long j10, long j11, c cVar) {
        final kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        OkHttpClient.Builder builderNewBuilder = this.client.newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builderNewBuilder.connectTimeout(j10, timeUnit).readTimeout(j11, timeUnit).build().newCall(request).enqueue(new Callback() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e10) {
                kotlin.jvm.internal.p.e(call, "call");
                kotlin.jvm.internal.p.e(e10, "e");
                o oVar = pVar;
                Result.Companion companion = Result.INSTANCE;
                oVar.resumeWith(Result.b(kotlin.c.a(e10)));
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                kotlin.jvm.internal.p.e(call, "call");
                kotlin.jvm.internal.p.e(response, "response");
                pVar.resumeWith(Result.b(response));
            }
        });
        Object objW = pVar.w();
        if (objW == a.f()) {
            e.c(cVar);
        }
        return objW;
    }

    @Override // com.unity3d.ads.network.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, @NotNull c cVar) {
        return i.g(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, this, null), cVar);
    }
}
