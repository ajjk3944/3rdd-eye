package com.unity3d.services.core.network.core;

import c9.c;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.ui.AdActivity;
import d9.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.o;
import l9.l;
import l9.p;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.q;
import s9.u;
import y8.s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lorg/chromium/net/CronetEngine;", "engine", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "<init>", "(Lorg/chromium/net/CronetEngine;Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "getPriority", "(I)I", "Lcom/unity3d/services/core/network/model/HttpRequest;", AdActivity.REQUEST_KEY_EXTRA, "", "buildUrl", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Ljava/lang/String;", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "getContentSize", "(Lorg/chromium/net/UrlResponseInfo;)J", "Ly8/s;", "shutdown", "()V", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeBlocking", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lcom/unity3d/services/core/network/model/HttpResponse;", "execute", "(Lcom/unity3d/services/core/network/model/HttpRequest;Lc9/c;)Ljava/lang/Object;", "Lorg/chromium/net/CronetEngine;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCronetClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CronetClient.kt\ncom/unity3d/services/core/network/core/CronetClient\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n314#2,9:139\n323#2,2:152\n215#3:148\n216#3:151\n1855#4,2:149\n*S KotlinDebug\n*F\n+ 1 CronetClient.kt\ncom/unity3d/services/core/network/core/CronetClient\n*L\n35#1:139,9\n35#1:152,2\n89#1:148\n89#1:151\n90#1:149,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CronetClient implements HttpClient {

    @NotNull
    private static final String MSG_CONNECTION_FAILED = "Network request failed";

    @NotNull
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";

    @NotNull
    private static final String NETWORK_CLIENT_CRONET = "cronet";

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final CronetEngine engine;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/j0;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lkotlinx/coroutines/j0;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, c cVar) {
            super(2, cVar);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            return CronetClient.this.new AnonymousClass1(this.$request, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return obj;
            }
            kotlin.c.b(obj);
            CronetClient cronetClient = CronetClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = cronetClient.execute(httpRequest, this);
            return objExecute == objF ? objF : objExecute;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull j0 j0Var, @Nullable c cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(s.f25199a);
        }
    }

    public CronetClient(@NotNull CronetEngine engine, @NotNull ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.p.e(engine, "engine");
        kotlin.jvm.internal.p.e(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest request) {
        return u.v0(u.Y0(request.getBaseURL(), '/') + '/' + u.Y0(request.getPath(), '/'), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo info) {
        String str;
        Long lQ;
        List<String> list = info.getAllHeaders().get("Content-Length");
        if (list == null || (str = list.get(0)) == null || (lQ = q.q(str)) == null) {
            return -1L;
        }
        return lQ.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int priority) {
        if (priority == 0) {
            return 4;
        }
        if (priority != 1) {
            return priority != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, @NotNull c cVar) {
        byte[] bytes;
        final kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        final ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(@Nullable UrlRequest request, @Nullable UrlResponseInfo info) {
                super.onCanceled(request, info);
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                o oVar = pVar;
                Result.Companion companion = Result.INSTANCE;
                oVar.resumeWith(Result.b(kotlin.c.a(networkTimeoutException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(@Nullable UrlRequest request, @Nullable UrlResponseInfo info, @Nullable CronetException error) {
                super.onFailed(request, info, error);
                NetworkException networkException = error instanceof NetworkException ? (NetworkException) error : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException("Network request failed", null, info != null ? Integer.valueOf(info.getHttpStatusCode()) : null, info != null ? info.getUrl() : null, info != null ? info.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                o oVar = pVar;
                Result.Companion companion = Result.INSTANCE;
                oVar.resumeWith(Result.b(kotlin.c.a(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull byte[] bodyBytes) {
                kotlin.jvm.internal.p.e(request, "request");
                kotlin.jvm.internal.p.e(info, "info");
                kotlin.jvm.internal.p.e(bodyBytes, "bodyBytes");
                o oVar = pVar;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                String url = info.getUrl();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                long contentSize = this.getContentSize(info);
                kotlin.jvm.internal.p.d(allHeaders, "allHeaders");
                kotlin.jvm.internal.p.d(url, "url");
                kotlin.jvm.internal.p.d(negotiatedProtocol, "negotiatedProtocol");
                oVar.resumeWith(Result.b(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
            }
        };
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, j1.a(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(s9.c.f24341b);
                kotlin.jvm.internal.p.d(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), j1.a(this.dispatchers.getIo()));
        }
        final UrlRequest req = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        pVar.e(new l() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return s.f25199a;
            }

            public final void invoke(@Nullable Throwable th) {
                req.cancel();
            }
        });
        kotlin.jvm.internal.p.d(req, "req");
        unityAdsUrlRequestCallback.startTimer(req);
        req.start();
        Object objW = pVar.w();
        if (objW == a.f()) {
            e.c(cVar);
        }
        return objW;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        kotlin.jvm.internal.p.e(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
