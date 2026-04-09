package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.network.f;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r9.q;
import y8.s;
import z9.a;

/* loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String FAILED_TPATS = "FAILED_TPATS";

    @NotNull
    private static final String TAG = "TpatSender";

    @NotNull
    private final Executor jobExecutor;

    @Nullable
    private final SignalManager signalManager;

    @NotNull
    private final t7.b tpatFilePreferences;

    @NotNull
    private final Object tpatLock;

    @NotNull
    private final VungleApiClient vungleApiClient;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public h(@NotNull VungleApiClient vungleApiClient, @NotNull Executor ioExecutor, @NotNull Executor jobExecutor, @NotNull q pathProvider, @Nullable SignalManager signalManager) {
        p.e(vungleApiClient, "vungleApiClient");
        p.e(ioExecutor, "ioExecutor");
        p.e(jobExecutor, "jobExecutor");
        p.e(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = t7.b.Companion.get(ioExecutor, pathProvider, t7.b.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, c> getStoredTpats() {
        Object objB;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                a.C0511a c0511a = z9.a.f25415d;
                aa.c cVarA = c0511a.a();
                q.a aVar = r9.q.f24180c;
                kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(cVarA, t.d(t.o(Map.class, aVar.a(t.m(String.class)), aVar.a(t.m(c.class)))));
                p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objB = Result.b((Map) c0511a.b(bVarB, string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to decode stored tpats: " + thE);
            }
            if (Result.e(objB) != null) {
                objB = new LinkedHashMap();
            }
            Map<String, c> map = (Map) objB;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String str) {
        return p.a(str, com.vungle.ads.internal.b.CHECKPOINT_0) || p.a(str, com.vungle.ads.internal.b.CLICK_URL) || p.a(str, "impression") || p.a(str, com.vungle.ads.internal.b.LOAD_AD);
    }

    private final void logTpatError(f fVar, String str, q7.f fVar2, Sdk$SDKError.Reason reason) {
        String str2 = "tpat key: " + fVar.getTpatKey() + ", error: " + fVar2.getDescription() + ", errorIsTerminal: " + fVar2.getErrorIsTerminal() + " url: " + str;
        com.vungle.ads.internal.util.p.Companion.e(TAG, str2);
        new TpatError(reason, str2).setLogEntry$vungle_ads_release(fVar.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final q7.f performPriorityRetry(f fVar, String str) {
        String str2;
        q7.f fVarPingTPAT;
        Boolean priorityRetry = fVar.getPriorityRetry();
        int i10 = 0;
        boolean z10 = ConfigManager.INSTANCE.retryPriorityTPATs() && (priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(fVar.getTpatKey()));
        while (true) {
            str2 = str;
            fVarPingTPAT = this.vungleApiClient.pingTPAT(str2, fVar.getHeaders(), fVar.getBody(), fVar.getMethod(), fVar.getLogEntry());
            if (!z10 || fVarPingTPAT == null || !fVarPingTPAT.isRetryCode() || (i10 = i10 + 1) >= fVar.getPriorityRetryCount()) {
                break;
            }
            str = str2;
        }
        if (fVarPingTPAT != null) {
            logTpatError(fVar, str2, fVarPingTPAT, i10 >= fVar.getPriorityRetryCount() ? Sdk$SDKError.Reason.TPAT_RETRY_FAILED : Sdk$SDKError.Reason.TPAT_ERROR);
        }
        return fVarPingTPAT;
    }

    private final void saveStoredTpats(Map<String, c> map) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            t7.b bVar = this.tpatFilePreferences;
            a.C0511a c0511a = z9.a.f25415d;
            aa.c cVarA = c0511a.a();
            q.a aVar = r9.q.f24180c;
            kotlinx.serialization.b bVarB = kotlinx.serialization.f.b(cVarA, t.d(t.o(Map.class, aVar.a(t.m(String.class)), aVar.a(t.m(c.class)))));
            p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            bVar.put(FAILED_TPATS, c0511a.c(bVarB, map)).apply();
            objB = Result.b(s.f25199a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.e(objB) != null) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    public static /* synthetic */ void sendTpat$default(h hVar, f fVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        hVar.sendTpat(fVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m327sendTpat$lambda1(h this$0, f request, String urlWithSessionId, boolean z10) {
        c cVar;
        p.e(this$0, "this$0");
        p.e(request, "$request");
        p.e(urlWithSessionId, "$urlWithSessionId");
        q7.f fVarPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (fVarPerformPriorityRetry == null || !fVarPerformPriorityRetry.getErrorIsTerminal()) {
                if (fVarPerformPriorityRetry != null || z10) {
                    synchronized (this$0.tpatLock) {
                        try {
                            Map<String, c> storedTpats = this$0.getStoredTpats();
                            c cVar2 = storedTpats.get(request.getUrl());
                            int retryAttempt = cVar2 != null ? cVar2.getRetryAttempt() : 0;
                            if (fVarPerformPriorityRetry == null && retryAttempt > 0) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                            } else if (fVarPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                                this$0.logTpatError(request, urlWithSessionId, fVarPerformPriorityRetry, Sdk$SDKError.Reason.TPAT_RETRY_FAILED);
                            } else if (fVarPerformPriorityRetry != null) {
                                c cVar3 = storedTpats.get(request.getUrl());
                                if (cVar3 == null || (cVar = c.copy$default(cVar3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    cVar = new c(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), cVar);
                                this$0.saveStoredTpats(storedTpats);
                            }
                            s sVar = s.f25199a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    @Nullable
    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    @NotNull
    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    @VisibleForTesting
    @NotNull
    public final String injectSessionIdToUrl(@NotNull String url) {
        p.e(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(com.vungle.ads.internal.b.SESSION_ID);
        p.d(strQuote, "quote(Constants.SESSION_ID)");
        return new Regex(strQuote).b(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, c> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            c value = entry.getValue();
            sendTpat(new f.a(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(@NotNull final f request, final boolean z10) {
        p.e(request, "request");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.g
            @Override // java.lang.Runnable
            public final void run() {
                h.m327sendTpat$lambda1(this.f20193a, request, strInjectSessionIdToUrl, z10);
            }
        });
    }

    public /* synthetic */ h(VungleApiClient vungleApiClient, Executor executor, Executor executor2, com.vungle.ads.internal.util.q qVar, SignalManager signalManager, int i10, kotlin.jvm.internal.i iVar) {
        this(vungleApiClient, executor, executor2, qVar, (i10 & 16) != 0 ? null : signalManager);
    }
}
