package com.vungle.ads.internal.network;

import C.RunnableC0615b;
import E.u;
import N7.B8;
import R9.AbstractC1564a;
import com.vungle.ads.C4055m;
import com.vungle.ads.g0;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.l;
import d6.C4277a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.x;
import w9.k;

/* compiled from: TpatSender.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final a Companion = new a(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final int MAX_RETRIES = 5;
    private static final String TAG = "TpatSender";
    private final String creativeId;
    private final String eventId;
    private final String placementId;
    private final com.vungle.ads.internal.signals.b signalManager;
    private final C4277a tpatFilePreferences;
    private final g vungleApiClient;

    /* compiled from: TpatSender.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public e(g vungleApiClient, String str, String str2, String str3, Executor ioExecutor, l pathProvider, com.vungle.ads.internal.signals.b bVar) {
        kotlin.jvm.internal.l.f(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.l.f(ioExecutor, "ioExecutor");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.signalManager = bVar;
        this.tpatFilePreferences = C4277a.Companion.get(ioExecutor, pathProvider, C4277a.TPAT_FAILED_FILENAME);
    }

    private final HashMap<String, Integer> getStoredTpats() {
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        try {
            if (string == null) {
                return new HashMap<>();
            }
            AbstractC1564a.C0160a c0160a = AbstractC1564a.f11780d;
            T9.a aVar = c0160a.f11782b;
            int i = k.f47593c;
            k kVarA = k.a.a(x.b(String.class));
            k kVarA2 = k.a.a(x.b(Integer.TYPE));
            kotlin.jvm.internal.e eVarA = x.a(HashMap.class);
            List listAsList = Arrays.asList(kVarA, kVarA2);
            x.f43661a.getClass();
            return (HashMap) c0160a.a(u.L(aVar, new A(eVarA, listAsList, false)), string);
        } catch (Exception unused) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Failed to decode stored tpats: " + string);
            return new HashMap<>();
        }
    }

    private final void saveStoredTpats(HashMap<String, Integer> map) {
        try {
            C4277a c4277a = this.tpatFilePreferences;
            AbstractC1564a.C0160a c0160a = AbstractC1564a.f11780d;
            T9.a aVar = c0160a.f11782b;
            int i = k.f47593c;
            k kVarA = k.a.a(x.b(String.class));
            k kVarA2 = k.a.a(x.b(Integer.TYPE));
            kotlin.jvm.internal.e eVarA = x.a(HashMap.class);
            List listAsList = Arrays.asList(kVarA, kVarA2);
            x.f43661a.getClass();
            c4277a.put(FAILED_TPATS, c0160a.b(u.L(aVar, new A(eVarA, listAsList, false)), map)).apply();
        } catch (Exception unused) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendTpat$lambda-2, reason: not valid java name */
    public static final void m83sendTpat$lambda2(e this$0, String url, String urlWithSessionId) throws Throwable {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(url, "$url");
        kotlin.jvm.internal.l.f(urlWithSessionId, "$urlWithSessionId");
        HashMap<String, Integer> storedTpats = this$0.getStoredTpats();
        Integer num = storedTpats.get(url);
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        c.b bVarPingTPAT = this$0.vungleApiClient.pingTPAT(urlWithSessionId);
        if (bVarPingTPAT == null) {
            if (iIntValue != 0) {
                storedTpats.remove(url);
                this$0.saveStoredTpats(storedTpats);
                return;
            }
            return;
        }
        if (!bVarPingTPAT.getErrorIsTerminal()) {
            if (iIntValue >= 5) {
                storedTpats.remove(url);
                this$0.saveStoredTpats(storedTpats);
                new g0(urlWithSessionId).logErrorNoReturnValue$vungle_ads_release();
            } else {
                storedTpats.put(url, Integer.valueOf(iIntValue + 1));
                this$0.saveStoredTpats(storedTpats);
            }
        }
        com.vungle.ads.internal.util.k.Companion.e(TAG, "TPAT failed with " + bVarPingTPAT.getDescription() + ", url:" + urlWithSessionId);
        if (bVarPingTPAT.getReason() == 29) {
            C4055m.INSTANCE.logMetric$vungle_ads_release(Sdk$SDKMetric.b.NOTIFICATION_REDIRECT, (58 & 2) != 0 ? 0L : 0L, (58 & 4) != 0 ? null : this$0.placementId, (58 & 8) != 0 ? null : null, (58 & 16) != 0 ? null : null, (58 & 32) != 0 ? null : urlWithSessionId);
            return;
        }
        C4055m c4055m = C4055m.INSTANCE;
        Sdk$SDKError.b bVar = Sdk$SDKError.b.TPAT_ERROR;
        StringBuilder sbK = B8.k("Fail to send ", urlWithSessionId, ", error: ");
        sbK.append(bVarPingTPAT.getDescription());
        c4055m.logError$vungle_ads_release(bVar, sbK.toString(), this$0.placementId, this$0.creativeId, this$0.eventId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendWinNotification$lambda-0, reason: not valid java name */
    public static final void m84sendWinNotification$lambda0(e this$0, String url) throws Throwable {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(url, "$url");
        c.b bVarPingTPAT = this$0.vungleApiClient.pingTPAT(url);
        if (bVarPingTPAT != null) {
            C4055m c4055m = C4055m.INSTANCE;
            Sdk$SDKError.b bVar = Sdk$SDKError.b.AD_WIN_NOTIFICATION_ERROR;
            StringBuilder sbK = B8.k("Fail to send ", url, ", error: ");
            sbK.append(bVarPingTPAT.getDescription());
            c4055m.logError$vungle_ads_release(bVar, sbK.toString(), this$0.placementId, this$0.creativeId, this$0.eventId);
        }
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final com.vungle.ads.internal.signals.b getSignalManager() {
        return this.signalManager;
    }

    public final g getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String url) {
        String uuid;
        kotlin.jvm.internal.l.f(url, "url");
        com.vungle.ads.internal.signals.b bVar = this.signalManager;
        if (bVar == null || (uuid = bVar.getUuid()) == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(com.vungle.ads.internal.g.SESSION_ID);
        kotlin.jvm.internal.l.e(strQuote, "quote(Constants.SESSION_ID)");
        Pattern patternCompile = Pattern.compile(strQuote);
        kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(url).replaceAll(uuid);
        kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final void resendStoredTpats$vungle_ads_release(Executor executor) {
        kotlin.jvm.internal.l.f(executor, "executor");
        Iterator<Map.Entry<String, Integer>> it = getStoredTpats().entrySet().iterator();
        while (it.hasNext()) {
            sendTpat(it.next().getKey(), executor);
        }
    }

    public final void sendTpat(String url, Executor executor) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(executor, "executor");
        executor.execute(new N.d(this, url, injectSessionIdToUrl(url), 9));
    }

    public final void sendTpats(Iterable<String> urls, Executor executor) {
        kotlin.jvm.internal.l.f(urls, "urls");
        kotlin.jvm.internal.l.f(executor, "executor");
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            sendTpat(it.next(), executor);
        }
    }

    public final void sendWinNotification(String urlString, Executor executor) {
        kotlin.jvm.internal.l.f(urlString, "urlString");
        kotlin.jvm.internal.l.f(executor, "executor");
        executor.execute(new RunnableC0615b(18, this, injectSessionIdToUrl(urlString)));
    }

    public /* synthetic */ e(g gVar, String str, String str2, String str3, Executor executor, l lVar, com.vungle.ads.internal.signals.b bVar, int i, kotlin.jvm.internal.g gVar2) {
        this(gVar, str, str2, str3, executor, lVar, (i & 64) != 0 ? null : bVar);
    }
}
