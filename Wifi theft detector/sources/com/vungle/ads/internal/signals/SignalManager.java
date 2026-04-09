package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.util.a;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import kotlinx.serialization.f;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.h;
import y8.s;
import z9.c;
import z9.k;

/* loaded from: classes3.dex */
public final class SignalManager {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;

    @NotNull
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 2;

    @NotNull
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;

    @NotNull
    private final Context context;

    @NotNull
    private com.vungle.ads.internal.signals.a currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;

    @NotNull
    private final h filePreferences$delegate;

    @NotNull
    private final z9.a json;

    @NotNull
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;

    @NotNull
    private UnclosedAdDetector unclosedAdDetector;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends a.b {
        public b() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() {
            p.Companion.d(SignalManager.TAG, "SignalManager#onBackground()");
            SignalManager.this.setEnterBackgroundTime(System.currentTimeMillis());
            SignalManager signalManager = SignalManager.this;
            signalManager.setSessionDuration(signalManager.getSessionDuration() + (SignalManager.this.getEnterBackgroundTime() - SignalManager.this.getEnterForegroundTime()));
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
            p.Companion.d(SignalManager.TAG, "SignalManager#onForeground()");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - SignalManager.this.getEnterBackgroundTime() > ConfigManager.INSTANCE.getSignalsSessionTimeout()) {
                SignalManager.this.createNewSessionData();
            }
            SignalManager.this.setEnterForegroundTime(jCurrentTimeMillis);
            SignalManager.this.setEnterBackgroundTime(0L);
        }
    }

    public SignalManager(@NotNull final Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        this.context = context;
        this.json = k.b(null, new l() { // from class: com.vungle.ads.internal.signals.SignalManager$json$1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((c) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull c Json) {
                kotlin.jvm.internal.p.e(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
        this.filePreferences$delegate = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t7.b] */
            @Override // l9.a
            @NotNull
            public final t7.b invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(t7.b.class);
            }
        });
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(this.sessionCount);
        UnclosedAdDetector unclosedAdDetector = new UnclosedAdDetector(context, this.currentSession.getSessionId(), m350_init_$lambda0(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.executor.a invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.a.class);
            }
        })), m351_init_$lambda1(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.q, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final q invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(q.class);
            }
        })));
        this.unclosedAdDetector = unclosedAdDetector;
        this.currentSession.setUnclosedAd(unclosedAdDetector.retrieveUnclosedAd());
        p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.signals.SignalManager.1
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("unclosedad: ");
                z9.a aVar = SignalManager.this.json;
                List<q7.k> unclosedAd = SignalManager.this.getCurrentSession$vungle_ads_release().getUnclosedAd();
                kotlinx.serialization.b bVarB = f.b(aVar.a(), t.n(List.class, r9.q.f24180c.a(t.m(q7.k.class))));
                kotlin.jvm.internal.p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                sb.append(aVar.c(bVarB, unclosedAd));
                return sb.toString();
            }
        });
        try {
            com.vungle.ads.internal.signals.a aVar = this.currentSession;
            com.vungle.ads.internal.platform.c cVar = com.vungle.ads.internal.platform.c.INSTANCE;
            aVar.setDevice(1 ^ (cVar.isEmulator() ? 1 : 0));
            this.currentSession.setVPNConnected(cVar.isVpnConnected(context) ? 1 : 0);
            this.currentSession.setOverlayGranted(cVar.hasSystemAlertWindowPermission(context) ? 1 : 0);
            this.currentSession.setSensorCount(cVar.getSensorCount(context));
            this.currentSession.setHttpProxyEnabled(cVar.isProxyEnabled(context) ? 1 : 0);
        } catch (Exception e10) {
            p.Companion.e(TAG, "Failed to collect device signals: " + e10.getLocalizedMessage());
        }
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m350_init_$lambda0(h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final q m351_init_$lambda1(h hVar) {
        return (q) hVar.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }

    private final void registerNotifications() {
        com.vungle.ads.internal.util.a.Companion.addLifecycleListener(new b());
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.sessionSeriesCreatedTime;
        long j11 = jCurrentTimeMillis - j10;
        if (j10 < 0 || j11 >= TWENTY_FOUR_HOURS_MILLIS) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, jCurrentTimeMillis);
            this.sessionSeriesCreatedTime = jCurrentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((this.sessionDuration + System.currentTimeMillis()) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(this.sessionCount);
    }

    @Nullable
    public final String generateSignals() {
        updateSessionDuration();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("2:");
            z9.a aVar = this.json;
            com.vungle.ads.internal.signals.a aVar2 = this.currentSession;
            kotlinx.serialization.b bVarB = f.b(aVar.a(), t.m(com.vungle.ads.internal.signals.a.class));
            kotlin.jvm.internal.p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb.append(aVar.c(bVarB, aVar2));
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final com.vungle.ads.internal.signals.a getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    @NotNull
    public final t7.b getFilePreferences() {
        return (t7.b) this.filePreferences$delegate.getValue();
    }

    @NotNull
    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    @NotNull
    public final synchronized com.vungle.ads.internal.signals.b getSignaledAd(@NotNull String placementId) {
        long jCurrentTimeMillis;
        Long l10;
        try {
            kotlin.jvm.internal.p.e(placementId, "placementId");
            jCurrentTimeMillis = System.currentTimeMillis();
            l10 = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
            this.mapOfLastLoadTimes.put(placementId, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new com.vungle.ads.internal.signals.b(l10, jCurrentTimeMillis);
    }

    @NotNull
    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        com.vungle.ads.internal.signals.a aVar = this.currentSession;
        aVar.setSessionDepthCounter(aVar.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(@NotNull q7.k unclosedAd) {
        kotlin.jvm.internal.p.e(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(@Nullable Context context, @NotNull com.vungle.ads.internal.signals.b signaledAd) {
        kotlin.jvm.internal.p.e(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(@NotNull q7.k unclosedAd) {
        kotlin.jvm.internal.p.e(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final int screenOrientation(@Nullable Context context) {
        Configuration configuration;
        if (context == null) {
            context = this.context;
        }
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? 0 : -1;
    }

    public final void setCurrentSession$vungle_ads_release(@NotNull com.vungle.ads.internal.signals.a aVar) {
        kotlin.jvm.internal.p.e(aVar, "<set-?>");
        this.currentSession = aVar;
    }

    public final void setEnterBackgroundTime(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setEnterForegroundTime(long j10) {
        this.enterForegroundTime = j10;
    }

    public final void setMapOfLastLoadTimes(@NotNull ConcurrentHashMap<String, Long> concurrentHashMap) {
        kotlin.jvm.internal.p.e(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i10) {
        this.sessionCount = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSessionSeriesCreatedTime(long j10) {
        this.sessionSeriesCreatedTime = j10;
    }

    public final void updateTemplateSignals(@Nullable String str) {
        if (str == null || str.length() == 0 || this.currentSession.getSignaledAd().isEmpty()) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }
}
