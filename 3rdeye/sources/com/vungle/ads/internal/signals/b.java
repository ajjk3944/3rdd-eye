package com.vungle.ads.internal.signals;

import E.u;
import R9.AbstractC1564a;
import R9.C1568e;
import R9.t;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import b9.C1992A;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.i;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.b;
import com.vungle.ads.internal.util.k;
import d6.C4277a;
import f6.C4336a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;
import p9.l;

/* compiled from: SignalManager.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final a Companion = new a(null);
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 1;
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final Context context;
    private com.vungle.ads.internal.signals.a currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    private final InterfaceC2000g filePreferences$delegate;
    private final AbstractC1564a json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private C4336a unclosedAdDetector;

    /* compiled from: SignalManager.kt */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: SignalManager.kt */
    /* renamed from: com.vungle.ads.internal.signals.b$b, reason: collision with other inner class name */
    public static final class C0392b extends m implements l<C1568e, C1992A> {
        public static final C0392b INSTANCE = new C0392b();

        public C0392b() {
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
        }
    }

    /* compiled from: SignalManager.kt */
    public static final class c extends b.c {
        public c() {
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onPause() {
            super.onPause();
            b.this.setEnterBackgroundTime(System.currentTimeMillis());
            b bVar = b.this;
            bVar.setSessionDuration((b.this.getEnterBackgroundTime() - b.this.getEnterForegroundTime()) + bVar.getSessionDuration());
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onResume() {
            super.onResume();
            if (b.this.getEnterBackgroundTime() == 0) {
                k.Companion.d(b.TAG, "SignalManager#onResume skipped");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - b.this.getEnterBackgroundTime() > com.vungle.ads.internal.f.INSTANCE.getSignalsSessionTimeout()) {
                b.this.createNewSessionData();
            }
            b.this.setEnterForegroundTime(jCurrentTimeMillis);
            b.this.setEnterBackgroundTime(0L);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class d extends m implements InterfaceC5480a<C4277a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d6.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C4277a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(C4277a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class e extends m implements InterfaceC5480a<com.vungle.ads.internal.executor.a> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.executor.a invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    public static final class f extends m implements InterfaceC5480a<com.vungle.ads.internal.util.l> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.l, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final com.vungle.ads.internal.util.l invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.util.l.class);
        }
    }

    public b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
        this.json = t.a(C0392b.INSTANCE);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        i iVar = i.SYNCHRONIZED;
        this.filePreferences$delegate = C2001h.a(iVar, new d(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(this.sessionCount);
        C4336a c4336a = new C4336a(context, this.currentSession.getSessionId(), m98_init_$lambda0(C2001h.a(iVar, new e(context))), m99_init_$lambda1(C2001h.a(iVar, new f(context))));
        this.unclosedAdDetector = c4336a;
        this.currentSession.setUnclosedAd(c4336a.retrieveUnclosedAd());
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m98_init_$lambda0(InterfaceC2000g<? extends com.vungle.ads.internal.executor.a> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.util.l m99_init_$lambda1(InterfaceC2000g<com.vungle.ads.internal.util.l> interfaceC2000g) {
        return interfaceC2000g.getValue();
    }

    private final void registerNotifications() {
        com.vungle.ads.internal.util.b.Companion.addLifecycleListener(new c());
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = this.sessionSeriesCreatedTime;
        long j10 = jCurrentTimeMillis - j4;
        if (j4 < 0 || j10 >= TWENTY_FOUR_HOURS_MILLIS) {
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
        this.currentSession.setSessionDuration((System.currentTimeMillis() + this.sessionDuration) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new com.vungle.ads.internal.signals.a(this.sessionCount);
    }

    public final String generateSignals() {
        updateSessionDuration();
        try {
            AbstractC1564a abstractC1564a = this.json;
            return "1:".concat(abstractC1564a.b(u.L(abstractC1564a.f11782b, x.b(com.vungle.ads.internal.signals.a.class)), this.currentSession));
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.signals.a getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final C4277a getFilePreferences() {
        return (C4277a) this.filePreferences$delegate.getValue();
    }

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

    public final synchronized com.vungle.ads.internal.signals.c getSignaledAd(String placementId) {
        long jCurrentTimeMillis;
        Long l5;
        try {
            kotlin.jvm.internal.l.f(placementId, "placementId");
            jCurrentTimeMillis = System.currentTimeMillis();
            l5 = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
            this.mapOfLastLoadTimes.put(placementId, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new com.vungle.ads.internal.signals.c(l5, jCurrentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        com.vungle.ads.internal.signals.a aVar = this.currentSession;
        aVar.setSessionDepthCounter(aVar.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(a6.m unclosedAd) {
        kotlin.jvm.internal.l.f(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.f.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(Context context, com.vungle.ads.internal.signals.c signaledAd) {
        kotlin.jvm.internal.l.f(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(a6.m unclosedAd) {
        kotlin.jvm.internal.l.f(unclosedAd, "unclosedAd");
        if (com.vungle.ads.internal.f.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final int screenOrientation(Context context) {
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

    public final void setCurrentSession$vungle_ads_release(com.vungle.ads.internal.signals.a aVar) {
        kotlin.jvm.internal.l.f(aVar, "<set-?>");
        this.currentSession = aVar;
    }

    public final void setEnterBackgroundTime(long j4) {
        this.enterBackgroundTime = j4;
    }

    public final void setEnterForegroundTime(long j4) {
        this.enterForegroundTime = j4;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        kotlin.jvm.internal.l.f(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i) {
        this.sessionCount = i;
    }

    public final void setSessionDuration(long j4) {
        this.sessionDuration = j4;
    }

    public final void setSessionSeriesCreatedTime(long j4) {
        this.sessionSeriesCreatedTime = j4;
    }

    public final void updateTemplateSignals(String str) {
        if (str == null || str.length() == 0 || this.currentSession.getSignaledAd().isEmpty()) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }

    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }
}
