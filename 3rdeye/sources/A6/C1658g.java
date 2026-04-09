package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.Q;
import Q9.Y;
import Q9.x0;
import a6.C1661j;
import c9.C2077A;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ConfigPayload.kt */
@M9.h
/* renamed from: a6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1658g {
    public static final c Companion = new c(null);
    private final b cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final d configSettings;
    private final Boolean disableAdId;
    private final e endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isCacheableAssetsRequired;
    private final Boolean isReportIncentivizedEnabled;
    private final h logMetricsSettings;
    private final List<C1661j> placements;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final i userPrivacy;
    private final j viewAbility;
    private final Boolean waitForConnectivityForTPAT;

    /* compiled from: ConfigPayload.kt */
    /* renamed from: a6.g$a */
    public static final class a implements H<C1658g> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload", aVar, 18);
            c1547o0.k("reuse_assets", true);
            c1547o0.k("config", true);
            c1547o0.k("endpoints", true);
            c1547o0.k("log_metrics", true);
            c1547o0.k("placements", true);
            c1547o0.k("user", true);
            c1547o0.k("viewability", true);
            c1547o0.k("config_extension", true);
            c1547o0.k("disable_ad_id", true);
            c1547o0.k("ri_enabled", true);
            c1547o0.k("session_timeout", true);
            c1547o0.k("wait_for_connectivity_for_tpat", true);
            c1547o0.k("sdk_session_timeout", true);
            c1547o0.k("cacheable_assets_required", true);
            c1547o0.k("signals_disabled", true);
            c1547o0.k("fpd_enabled", true);
            c1547o0.k("rta_debugging", true);
            c1547o0.k("config_last_validated_ts", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            M9.b<?> bVarB = N9.a.b(b.a.INSTANCE);
            M9.b<?> bVarB2 = N9.a.b(d.a.INSTANCE);
            M9.b<?> bVarB3 = N9.a.b(e.a.INSTANCE);
            M9.b<?> bVarB4 = N9.a.b(h.a.INSTANCE);
            M9.b<?> bVarB5 = N9.a.b(new C1526e(C1661j.a.INSTANCE));
            M9.b<?> bVarB6 = N9.a.b(i.a.INSTANCE);
            M9.b<?> bVarB7 = N9.a.b(j.a.INSTANCE);
            M9.b<?> bVarB8 = N9.a.b(C0.f11399a);
            C1532h c1532h = C1532h.f11487a;
            M9.b<?> bVarB9 = N9.a.b(c1532h);
            M9.b<?> bVarB10 = N9.a.b(c1532h);
            Q q10 = Q.f11448a;
            return new M9.b[]{bVarB, bVarB2, bVarB3, bVarB4, bVarB5, bVarB6, bVarB7, bVarB8, bVarB9, bVarB10, N9.a.b(q10), N9.a.b(c1532h), N9.a.b(q10), N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(Y.f11465a)};
        }

        /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        @Override // M9.b
        public C1658g deserialize(P9.d decoder) {
            j jVar;
            int i;
            Object obj;
            j jVar2;
            b bVarG;
            j jVar3;
            i iVarG;
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            Object objG5 = null;
            Object objG6 = null;
            i iVar = null;
            j jVarG = null;
            Object objG7 = null;
            Object objG8 = null;
            Object objG9 = null;
            Object objG10 = null;
            Object objG11 = null;
            b bVar = null;
            Object objG12 = null;
            Object objG13 = null;
            Object objG14 = null;
            Object objG15 = null;
            int i10 = 0;
            boolean z10 = true;
            while (z10) {
                i iVar2 = iVar;
                int iX = bVarD.x(descriptor2);
                switch (iX) {
                    case -1:
                        obj = objG2;
                        jVar2 = jVarG;
                        bVarG = bVar;
                        z10 = false;
                        iVar = iVar2;
                        jVarG = jVar2;
                        bVar = bVarG;
                        objG2 = obj;
                    case 0:
                        obj = objG2;
                        jVar2 = jVarG;
                        i10 |= 1;
                        objG12 = objG12;
                        bVarG = bVarD.G(descriptor2, 0, b.a.INSTANCE, bVar);
                        iVar = iVar2;
                        jVarG = jVar2;
                        bVar = bVarG;
                        objG2 = obj;
                    case 1:
                        obj = objG2;
                        jVar3 = jVarG;
                        objG12 = bVarD.G(descriptor2, 1, d.a.INSTANCE, objG12);
                        i10 |= 2;
                        objG13 = objG13;
                        iVarG = iVar2;
                        jVarG = jVar3;
                        iVar = iVarG;
                        objG2 = obj;
                    case 2:
                        obj = objG2;
                        jVar3 = jVarG;
                        objG13 = bVarD.G(descriptor2, 2, e.a.INSTANCE, objG13);
                        i10 |= 4;
                        iVarG = iVar2;
                        jVarG = jVar3;
                        iVar = iVarG;
                        objG2 = obj;
                    case 3:
                        obj = objG2;
                        jVar3 = jVarG;
                        objG14 = bVarD.G(descriptor2, 3, h.a.INSTANCE, objG14);
                        i10 |= 8;
                        iVarG = iVar2;
                        jVarG = jVar3;
                        iVar = iVarG;
                        objG2 = obj;
                    case 4:
                        obj = objG2;
                        jVar3 = jVarG;
                        objG15 = bVarD.G(descriptor2, 4, new C1526e(C1661j.a.INSTANCE), objG15);
                        i10 |= 16;
                        iVarG = iVar2;
                        jVarG = jVar3;
                        iVar = iVarG;
                        objG2 = obj;
                    case 5:
                        obj = objG2;
                        jVar3 = jVarG;
                        i10 |= 32;
                        iVarG = bVarD.G(descriptor2, 5, i.a.INSTANCE, iVar2);
                        jVarG = jVar3;
                        iVar = iVarG;
                        objG2 = obj;
                    case 6:
                        obj = objG2;
                        i10 |= 64;
                        iVar = iVar2;
                        jVarG = bVarD.G(descriptor2, 6, j.a.INSTANCE, jVarG);
                        objG2 = obj;
                    case 7:
                        jVar = jVarG;
                        objG7 = bVarD.G(descriptor2, 7, C0.f11399a, objG7);
                        i10 |= 128;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 8:
                        jVar = jVarG;
                        objG8 = bVarD.G(descriptor2, 8, C1532h.f11487a, objG8);
                        i10 |= 256;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 9:
                        jVar = jVarG;
                        objG9 = bVarD.G(descriptor2, 9, C1532h.f11487a, objG9);
                        i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 10:
                        jVar = jVarG;
                        objG10 = bVarD.G(descriptor2, 10, Q.f11448a, objG10);
                        i10 |= 1024;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 11:
                        jVar = jVarG;
                        objG11 = bVarD.G(descriptor2, 11, C1532h.f11487a, objG11);
                        i10 |= 2048;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 12:
                        jVar = jVarG;
                        objG3 = bVarD.G(descriptor2, 12, Q.f11448a, objG3);
                        i10 |= 4096;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 13:
                        jVar = jVarG;
                        objG2 = bVarD.G(descriptor2, 13, C1532h.f11487a, objG2);
                        i10 |= 8192;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 14:
                        jVar = jVarG;
                        objG = bVarD.G(descriptor2, 14, C1532h.f11487a, objG);
                        i10 |= 16384;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 15:
                        jVar = jVarG;
                        objG4 = bVarD.G(descriptor2, 15, C1532h.f11487a, objG4);
                        i = Constants.QUEUE_ELEMENT_MAX_SIZE;
                        i10 |= i;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 16:
                        jVar = jVarG;
                        objG5 = bVarD.G(descriptor2, 16, C1532h.f11487a, objG5);
                        i = 65536;
                        i10 |= i;
                        iVar = iVar2;
                        jVarG = jVar;
                    case 17:
                        jVar = jVarG;
                        objG6 = bVarD.G(descriptor2, 17, Y.f11465a, objG6);
                        i = 131072;
                        i10 |= i;
                        iVar = iVar2;
                        jVarG = jVar;
                    default:
                        throw new n(iX);
                }
            }
            Object obj2 = objG2;
            b bVar2 = bVar;
            bVarD.b(descriptor2);
            return new C1658g(i10, bVar2, (d) objG12, (e) objG13, (h) objG14, (List) objG15, iVar, jVarG, (String) objG7, (Boolean) objG8, (Boolean) objG9, (Integer) objG10, (Boolean) objG11, (Integer) objG3, (Boolean) obj2, (Boolean) objG, (Boolean) objG4, (Boolean) objG5, (Long) objG6, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1658g value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1658g.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$b */
    public static final class b {
        public static final C0222b Companion = new C0222b(null);
        private final Integer diskPercentage;
        private final Long diskSize;
        private final Boolean enabled;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$b$a */
        public static final class a implements H<b> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.CleverCache", aVar, 3);
                c1547o0.k("enabled", true);
                c1547o0.k("disk_size", true);
                c1547o0.k("disk_percentage", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C1532h.f11487a), N9.a.b(Y.f11465a), N9.a.b(Q.f11448a)};
            }

            @Override // M9.b
            public b deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C1532h.f11487a, objG);
                        i |= 1;
                    } else if (iX == 1) {
                        objG2 = bVarD.G(descriptor2, 1, Y.f11465a, objG2);
                        i |= 2;
                    } else {
                        if (iX != 2) {
                            throw new n(iX);
                        }
                        objG3 = bVarD.G(descriptor2, 2, Q.f11448a, objG3);
                        i |= 4;
                    }
                }
                bVarD.b(descriptor2);
                return new b(i, (Boolean) objG, (Long) objG2, (Integer) objG3, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, b value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                b.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$b$b, reason: collision with other inner class name */
        public static final class C0222b {
            public /* synthetic */ C0222b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<b> serializer() {
                return a.INSTANCE;
            }

            private C0222b() {
            }
        }

        public b() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ b copy$default(b bVar, Boolean bool, Long l5, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = bVar.enabled;
            }
            if ((i & 2) != 0) {
                l5 = bVar.diskSize;
            }
            if ((i & 4) != 0) {
                num = bVar.diskPercentage;
            }
            return bVar.copy(bool, l5, num);
        }

        public static final void write$Self(b self, P9.c output, O9.e serialDesc) {
            Integer num;
            Long l5;
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || !kotlin.jvm.internal.l.b(self.enabled, Boolean.FALSE)) {
                output.w(serialDesc, 0, C1532h.f11487a, self.enabled);
            }
            if (output.F(serialDesc, 1) || (l5 = self.diskSize) == null || l5.longValue() != 1000) {
                output.w(serialDesc, 1, Y.f11465a, self.diskSize);
            }
            if (output.F(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.w(serialDesc, 2, Q.f11448a, self.diskPercentage);
            }
        }

        public final Boolean component1() {
            return this.enabled;
        }

        public final Long component2() {
            return this.diskSize;
        }

        public final Integer component3() {
            return this.diskPercentage;
        }

        public final b copy(Boolean bool, Long l5, Integer num) {
            return new b(bool, l5, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.enabled, bVar.enabled) && kotlin.jvm.internal.l.b(this.diskSize, bVar.diskSize) && kotlin.jvm.internal.l.b(this.diskPercentage, bVar.diskPercentage);
        }

        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        public final Long getDiskSize() {
            return this.diskSize;
        }

        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l5 = this.diskSize;
            int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        public /* synthetic */ b(int i, Boolean bool, Long l5, Integer num, x0 x0Var) {
            this.enabled = (i & 1) == 0 ? Boolean.FALSE : bool;
            if ((i & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l5;
            }
            if ((i & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public b(Boolean bool, Long l5, Integer num) {
            this.enabled = bool;
            this.diskSize = l5;
            this.diskPercentage = num;
        }

        public /* synthetic */ b(Boolean bool, Long l5, Integer num, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 1000L : l5, (i & 4) != 0 ? 3 : num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    /* renamed from: a6.g$c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1658g> serializer() {
            return a.INSTANCE;
        }

        private c() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$d */
    public static final class d {
        public static final b Companion = new b(null);
        private final Long refreshTime;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$d$a */
        public static final class a implements H<d> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", aVar, 1);
                c1547o0.k("refresh_interval", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(Y.f11465a)};
            }

            @Override // M9.b
            public d deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        objG = bVarD.G(descriptor2, 0, Y.f11465a, objG);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new d(i, (Long) objG, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, d value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                d.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$d$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<d> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public d() {
            this((Long) null, 1, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ d copy$default(d dVar, Long l5, int i, Object obj) {
            if ((i & 1) != 0) {
                l5 = dVar.refreshTime;
            }
            return dVar.copy(l5);
        }

        public static final void write$Self(d self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (!output.F(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.w(serialDesc, 0, Y.f11465a, self.refreshTime);
        }

        public final Long component1() {
            return this.refreshTime;
        }

        public final d copy(Long l5) {
            return new d(l5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.refreshTime, ((d) obj).refreshTime);
        }

        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l5 = this.refreshTime;
            if (l5 == null) {
                return 0;
            }
            return l5.hashCode();
        }

        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        public /* synthetic */ d(int i, Long l5, x0 x0Var) {
            if ((i & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l5;
            }
        }

        public d(Long l5) {
            this.refreshTime = l5;
        }

        public /* synthetic */ d(Long l5, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : l5);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$e */
    public static final class e {
        public static final b Companion = new b(null);
        private final String adsEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String mraidEndpoint;
        private final String riEndpoint;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$e$a */
        public static final class a implements H<e> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.Endpoints", aVar, 5);
                c1547o0.k("ads", true);
                c1547o0.k("ri", true);
                c1547o0.k("error_logs", true);
                c1547o0.k("metrics", true);
                c1547o0.k("mraid_js", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02)};
            }

            @Override // M9.b
            public e deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                        i |= 1;
                    } else if (iX == 1) {
                        objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                        i |= 2;
                    } else if (iX == 2) {
                        objG3 = bVarD.G(descriptor2, 2, C0.f11399a, objG3);
                        i |= 4;
                    } else if (iX == 3) {
                        objG4 = bVarD.G(descriptor2, 3, C0.f11399a, objG4);
                        i |= 8;
                    } else {
                        if (iX != 4) {
                            throw new n(iX);
                        }
                        objG5 = bVarD.G(descriptor2, 4, C0.f11399a, objG5);
                        i |= 16;
                    }
                }
                bVarD.b(descriptor2);
                return new e(i, (String) objG, (String) objG2, (String) objG3, (String) objG4, (String) objG5, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, e value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                e.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$e$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<e> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public e() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ e copy$default(e eVar, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.adsEndpoint;
            }
            if ((i & 2) != 0) {
                str2 = eVar.riEndpoint;
            }
            if ((i & 4) != 0) {
                str3 = eVar.errorLogsEndpoint;
            }
            if ((i & 8) != 0) {
                str4 = eVar.metricsEndpoint;
            }
            if ((i & 16) != 0) {
                str5 = eVar.mraidEndpoint;
            }
            String str6 = str5;
            String str7 = str3;
            return eVar.copy(str, str2, str7, str4, str6);
        }

        public static final void write$Self(e self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.adsEndpoint != null) {
                output.w(serialDesc, 0, C0.f11399a, self.adsEndpoint);
            }
            if (output.F(serialDesc, 1) || self.riEndpoint != null) {
                output.w(serialDesc, 1, C0.f11399a, self.riEndpoint);
            }
            if (output.F(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.w(serialDesc, 2, C0.f11399a, self.errorLogsEndpoint);
            }
            if (output.F(serialDesc, 3) || self.metricsEndpoint != null) {
                output.w(serialDesc, 3, C0.f11399a, self.metricsEndpoint);
            }
            if (!output.F(serialDesc, 4) && self.mraidEndpoint == null) {
                return;
            }
            output.w(serialDesc, 4, C0.f11399a, self.mraidEndpoint);
        }

        public final String component1() {
            return this.adsEndpoint;
        }

        public final String component2() {
            return this.riEndpoint;
        }

        public final String component3() {
            return this.errorLogsEndpoint;
        }

        public final String component4() {
            return this.metricsEndpoint;
        }

        public final String component5() {
            return this.mraidEndpoint;
        }

        public final e copy(String str, String str2, String str3, String str4, String str5) {
            return new e(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.l.b(this.adsEndpoint, eVar.adsEndpoint) && kotlin.jvm.internal.l.b(this.riEndpoint, eVar.riEndpoint) && kotlin.jvm.internal.l.b(this.errorLogsEndpoint, eVar.errorLogsEndpoint) && kotlin.jvm.internal.l.b(this.metricsEndpoint, eVar.metricsEndpoint) && kotlin.jvm.internal.l.b(this.mraidEndpoint, eVar.mraidEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getMraidEndpoint() {
            return this.mraidEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mraidEndpoint;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Endpoints(adsEndpoint=");
            sb.append(this.adsEndpoint);
            sb.append(", riEndpoint=");
            sb.append(this.riEndpoint);
            sb.append(", errorLogsEndpoint=");
            sb.append(this.errorLogsEndpoint);
            sb.append(", metricsEndpoint=");
            sb.append(this.metricsEndpoint);
            sb.append(", mraidEndpoint=");
            return B8.j(sb, this.mraidEndpoint, ')');
        }

        public /* synthetic */ e(int i, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
            if ((i & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
            if ((i & 16) == 0) {
                this.mraidEndpoint = null;
            } else {
                this.mraidEndpoint = str5;
            }
        }

        public e(String str, String str2, String str3, String str4, String str5) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
            this.mraidEndpoint = str5;
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMraidEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$f */
    public static final class f {
        public static final b Companion = new b(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final Boolean isCountryDataProtected;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$f$a */
        public static final class a implements H<f> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", aVar, 6);
                c1547o0.k("is_country_data_protected", true);
                c1547o0.k("consent_title", true);
                c1547o0.k("consent_message", true);
                c1547o0.k("consent_message_version", true);
                c1547o0.k("button_accept", true);
                c1547o0.k("button_deny", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                M9.b<?> bVarB = N9.a.b(C1532h.f11487a);
                C0 c02 = C0.f11399a;
                return new M9.b[]{bVarB, N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02)};
            }

            @Override // M9.b
            public f deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                Object objG6 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            objG = bVarD.G(descriptor2, 0, C1532h.f11487a, objG);
                            i |= 1;
                            break;
                        case 1:
                            objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                            i |= 2;
                            break;
                        case 2:
                            objG3 = bVarD.G(descriptor2, 2, C0.f11399a, objG3);
                            i |= 4;
                            break;
                        case 3:
                            objG4 = bVarD.G(descriptor2, 3, C0.f11399a, objG4);
                            i |= 8;
                            break;
                        case 4:
                            objG5 = bVarD.G(descriptor2, 4, C0.f11399a, objG5);
                            i |= 16;
                            break;
                        case 5:
                            objG6 = bVarD.G(descriptor2, 5, C0.f11399a, objG6);
                            i |= 32;
                            break;
                        default:
                            throw new n(iX);
                    }
                }
                bVarD.b(descriptor2);
                return new f(i, (Boolean) objG, (String) objG2, (String) objG3, (String) objG4, (String) objG5, (String) objG6, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, f value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                f.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$f$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<f> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public f() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ f copy$default(f fVar, Boolean bool, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = fVar.isCountryDataProtected;
            }
            if ((i & 2) != 0) {
                str = fVar.consentTitle;
            }
            if ((i & 4) != 0) {
                str2 = fVar.consentMessage;
            }
            if ((i & 8) != 0) {
                str3 = fVar.consentMessageVersion;
            }
            if ((i & 16) != 0) {
                str4 = fVar.buttonAccept;
            }
            if ((i & 32) != 0) {
                str5 = fVar.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return fVar.copy(bool, str, str2, str3, str6, str7);
        }

        public static final void write$Self(f self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.w(serialDesc, 0, C1532h.f11487a, self.isCountryDataProtected);
            }
            if (output.F(serialDesc, 1) || self.consentTitle != null) {
                output.w(serialDesc, 1, C0.f11399a, self.consentTitle);
            }
            if (output.F(serialDesc, 2) || self.consentMessage != null) {
                output.w(serialDesc, 2, C0.f11399a, self.consentMessage);
            }
            if (output.F(serialDesc, 3) || self.consentMessageVersion != null) {
                output.w(serialDesc, 3, C0.f11399a, self.consentMessageVersion);
            }
            if (output.F(serialDesc, 4) || self.buttonAccept != null) {
                output.w(serialDesc, 4, C0.f11399a, self.buttonAccept);
            }
            if (!output.F(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.w(serialDesc, 5, C0.f11399a, self.buttonDeny);
        }

        public final Boolean component1() {
            return this.isCountryDataProtected;
        }

        public final String component2() {
            return this.consentTitle;
        }

        public final String component3() {
            return this.consentMessage;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final String component5() {
            return this.buttonAccept;
        }

        public final String component6() {
            return this.buttonDeny;
        }

        public final f copy(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            return new f(bool, str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.l.b(this.isCountryDataProtected, fVar.isCountryDataProtected) && kotlin.jvm.internal.l.b(this.consentTitle, fVar.consentTitle) && kotlin.jvm.internal.l.b(this.consentMessage, fVar.consentMessage) && kotlin.jvm.internal.l.b(this.consentMessageVersion, fVar.consentMessageVersion) && kotlin.jvm.internal.l.b(this.buttonAccept, fVar.buttonAccept) && kotlin.jvm.internal.l.b(this.buttonDeny, fVar.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GDPRSettings(isCountryDataProtected=");
            sb.append(this.isCountryDataProtected);
            sb.append(", consentTitle=");
            sb.append(this.consentTitle);
            sb.append(", consentMessage=");
            sb.append(this.consentMessage);
            sb.append(", consentMessageVersion=");
            sb.append(this.consentMessageVersion);
            sb.append(", buttonAccept=");
            sb.append(this.buttonAccept);
            sb.append(", buttonDeny=");
            return B8.j(sb, this.buttonDeny, ')');
        }

        public /* synthetic */ f(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, x0 x0Var) {
            if ((i & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public f(Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ f(Boolean bool, String str, String str2, String str3, String str4, String str5, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$g, reason: collision with other inner class name */
    public static final class C0223g {
        public static final b Companion = new b(null);
        private final Integer tcfStatus;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$g$a */
        public static final class a implements H<C0223g> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.IABSettings", aVar, 1);
                c1547o0.k("tcf_status", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(Q.f11448a)};
            }

            @Override // M9.b
            public C0223g deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        objG = bVarD.G(descriptor2, 0, Q.f11448a, objG);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new C0223g(i, (Integer) objG, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, C0223g value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                C0223g.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$g$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<C0223g> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$g$c */
        public enum c {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);

            public static final a Companion = new a(null);
            private static final Map<Integer, c> rawValueMap;
            private final int rawValue;

            /* compiled from: ConfigPayload.kt */
            /* renamed from: a6.g$g$c$a */
            public static final class a {
                public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                    this();
                }

                public final c fromRawValue(Integer num) {
                    return (c) c.rawValueMap.get(num);
                }

                private a() {
                }
            }

            static {
                c[] cVarArrValues = values();
                int iL = C2077A.l(cVarArrValues.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iL < 16 ? 16 : iL);
                for (c cVar : cVarArrValues) {
                    linkedHashMap.put(Integer.valueOf(cVar.rawValue), cVar);
                }
                rawValueMap = linkedHashMap;
            }

            c(int i) {
                this.rawValue = i;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        public C0223g() {
            this((Integer) null, 1, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ C0223g copy$default(C0223g c0223g, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = c0223g.tcfStatus;
            }
            return c0223g.copy(num);
        }

        public static final void write$Self(C0223g self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (!output.F(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.w(serialDesc, 0, Q.f11448a, self.tcfStatus);
        }

        public final Integer component1() {
            return this.tcfStatus;
        }

        public final C0223g copy(Integer num) {
            return new C0223g(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0223g) && kotlin.jvm.internal.l.b(this.tcfStatus, ((C0223g) obj).tcfStatus);
        }

        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        public /* synthetic */ C0223g(int i, Integer num, x0 x0Var) {
            if ((i & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public C0223g(Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ C0223g(Integer num, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$h */
    public static final class h {
        public static final b Companion = new b(null);
        private final Integer errorLogLevel;
        private final Boolean metricsEnabled;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$h$a */
        public static final class a implements H<h> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", aVar, 2);
                c1547o0.k("error_log_level", true);
                c1547o0.k("metrics_is_enabled", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(Q.f11448a), N9.a.b(C1532h.f11487a)};
            }

            @Override // M9.b
            public h deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, Q.f11448a, objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, C1532h.f11487a, objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new h(i, (Integer) objG, (Boolean) objG2, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, h value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                h.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$h$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<h> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public h() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ h copy$default(h hVar, Integer num, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                num = hVar.errorLogLevel;
            }
            if ((i & 2) != 0) {
                bool = hVar.metricsEnabled;
            }
            return hVar.copy(num, bool);
        }

        public static final void write$Self(h self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.errorLogLevel != null) {
                output.w(serialDesc, 0, Q.f11448a, self.errorLogLevel);
            }
            if (!output.F(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.w(serialDesc, 1, C1532h.f11487a, self.metricsEnabled);
        }

        public final Integer component1() {
            return this.errorLogLevel;
        }

        public final Boolean component2() {
            return this.metricsEnabled;
        }

        public final h copy(Integer num, Boolean bool) {
            return new h(num, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.l.b(this.errorLogLevel, hVar.errorLogLevel) && kotlin.jvm.internal.l.b(this.metricsEnabled, hVar.metricsEnabled);
        }

        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        public /* synthetic */ h(int i, Integer num, Boolean bool, x0 x0Var) {
            if ((i & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public h(Integer num, Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ h(Integer num, Boolean bool, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$i */
    public static final class i {
        public static final b Companion = new b(null);
        private final f gdpr;
        private final C0223g iab;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$i$a */
        public static final class a implements H<i> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", aVar, 2);
                c1547o0.k("gdpr", true);
                c1547o0.k("iab", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(f.a.INSTANCE), N9.a.b(C0223g.a.INSTANCE)};
            }

            @Override // M9.b
            public i deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, f.a.INSTANCE, objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, C0223g.a.INSTANCE, objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new i(i, (f) objG, (C0223g) objG2, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, i value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                i.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$i$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<i> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public i() {
            this((f) null, (C0223g) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ i copy$default(i iVar, f fVar, C0223g c0223g, int i, Object obj) {
            if ((i & 1) != 0) {
                fVar = iVar.gdpr;
            }
            if ((i & 2) != 0) {
                c0223g = iVar.iab;
            }
            return iVar.copy(fVar, c0223g);
        }

        public static final void write$Self(i self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.gdpr != null) {
                output.w(serialDesc, 0, f.a.INSTANCE, self.gdpr);
            }
            if (!output.F(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.w(serialDesc, 1, C0223g.a.INSTANCE, self.iab);
        }

        public final f component1() {
            return this.gdpr;
        }

        public final C0223g component2() {
            return this.iab;
        }

        public final i copy(f fVar, C0223g c0223g) {
            return new i(fVar, c0223g);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.l.b(this.gdpr, iVar.gdpr) && kotlin.jvm.internal.l.b(this.iab, iVar.iab);
        }

        public final f getGdpr() {
            return this.gdpr;
        }

        public final C0223g getIab() {
            return this.iab;
        }

        public int hashCode() {
            f fVar = this.gdpr;
            int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            C0223g c0223g = this.iab;
            return iHashCode + (c0223g != null ? c0223g.hashCode() : 0);
        }

        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ i(int i, f fVar, C0223g c0223g, x0 x0Var) {
            if ((i & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = fVar;
            }
            if ((i & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = c0223g;
            }
        }

        public i(f fVar, C0223g c0223g) {
            this.gdpr = fVar;
            this.iab = c0223g;
        }

        public /* synthetic */ i(f fVar, C0223g c0223g, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : fVar, (i & 2) != 0 ? null : c0223g);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }
    }

    /* compiled from: ConfigPayload.kt */
    @M9.h
    /* renamed from: a6.g$j */
    public static final class j {
        public static final b Companion = new b(null);
        private final Boolean om;

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$j$a */
        public static final class a implements H<j> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.ConfigPayload.ViewAbilitySettings", aVar, 1);
                c1547o0.k("om", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C1532h.f11487a)};
            }

            @Override // M9.b
            public j deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        objG = bVarD.G(descriptor2, 0, C1532h.f11487a, objG);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new j(i, (Boolean) objG, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, j value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                j.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: ConfigPayload.kt */
        /* renamed from: a6.g$j$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<j> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public j() {
            this((Boolean) null, 1, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ j copy$default(j jVar, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = jVar.om;
            }
            return jVar.copy(bool);
        }

        public static final void write$Self(j self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (!output.F(serialDesc, 0) && self.om == null) {
                return;
            }
            output.w(serialDesc, 0, C1532h.f11487a, self.om);
        }

        public final Boolean component1() {
            return this.om;
        }

        public final j copy(Boolean bool) {
            return new j(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && kotlin.jvm.internal.l.b(this.om, ((j) obj).om);
        }

        public final Boolean getOm() {
            return this.om;
        }

        public int hashCode() {
            Boolean bool = this.om;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "ViewAbilitySettings(om=" + this.om + ')';
        }

        public /* synthetic */ j(int i, Boolean bool, x0 x0Var) {
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = bool;
            }
        }

        public j(Boolean bool) {
            this.om = bool;
        }

        public /* synthetic */ j(Boolean bool, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : bool);
        }

        public static /* synthetic */ void getOm$annotations() {
        }
    }

    public C1658g() {
        this((b) null, (d) null, (e) null, (h) null, (List) null, (i) null, (j) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, 262143, (kotlin.jvm.internal.g) null);
    }

    public static /* synthetic */ C1658g copy$default(C1658g c1658g, b bVar, d dVar, e eVar, h hVar, List list, i iVar, j jVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l5, int i10, Object obj) {
        Long l10;
        Boolean bool8;
        b bVar2 = (i10 & 1) != 0 ? c1658g.cleverCache : bVar;
        d dVar2 = (i10 & 2) != 0 ? c1658g.configSettings : dVar;
        e eVar2 = (i10 & 4) != 0 ? c1658g.endpoints : eVar;
        h hVar2 = (i10 & 8) != 0 ? c1658g.logMetricsSettings : hVar;
        List list2 = (i10 & 16) != 0 ? c1658g.placements : list;
        i iVar2 = (i10 & 32) != 0 ? c1658g.userPrivacy : iVar;
        j jVar2 = (i10 & 64) != 0 ? c1658g.viewAbility : jVar;
        String str2 = (i10 & 128) != 0 ? c1658g.configExtension : str;
        Boolean bool9 = (i10 & 256) != 0 ? c1658g.disableAdId : bool;
        Boolean bool10 = (i10 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? c1658g.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i10 & 1024) != 0 ? c1658g.sessionTimeout : num;
        Boolean bool11 = (i10 & 2048) != 0 ? c1658g.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i10 & 4096) != 0 ? c1658g.signalSessionTimeout : num2;
        Boolean bool12 = (i10 & 8192) != 0 ? c1658g.isCacheableAssetsRequired : bool4;
        b bVar3 = bVar2;
        Boolean bool13 = (i10 & 16384) != 0 ? c1658g.signalsDisabled : bool5;
        Boolean bool14 = (i10 & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? c1658g.fpdEnabled : bool6;
        Boolean bool15 = (i10 & 65536) != 0 ? c1658g.rtaDebugging : bool7;
        if ((i10 & 131072) != 0) {
            bool8 = bool15;
            l10 = c1658g.configLastValidatedTimestamp;
        } else {
            l10 = l5;
            bool8 = bool15;
        }
        return c1658g.copy(bVar3, dVar2, eVar2, hVar2, list2, iVar2, jVar2, str2, bool9, bool10, num3, bool11, num4, bool12, bool13, bool14, bool8, l10);
    }

    public static final void write$Self(C1658g self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.cleverCache != null) {
            output.w(serialDesc, 0, b.a.INSTANCE, self.cleverCache);
        }
        if (output.F(serialDesc, 1) || self.configSettings != null) {
            output.w(serialDesc, 1, d.a.INSTANCE, self.configSettings);
        }
        if (output.F(serialDesc, 2) || self.endpoints != null) {
            output.w(serialDesc, 2, e.a.INSTANCE, self.endpoints);
        }
        if (output.F(serialDesc, 3) || self.logMetricsSettings != null) {
            output.w(serialDesc, 3, h.a.INSTANCE, self.logMetricsSettings);
        }
        if (output.F(serialDesc, 4) || self.placements != null) {
            output.w(serialDesc, 4, new C1526e(C1661j.a.INSTANCE), self.placements);
        }
        if (output.F(serialDesc, 5) || self.userPrivacy != null) {
            output.w(serialDesc, 5, i.a.INSTANCE, self.userPrivacy);
        }
        if (output.F(serialDesc, 6) || self.viewAbility != null) {
            output.w(serialDesc, 6, j.a.INSTANCE, self.viewAbility);
        }
        if (output.F(serialDesc, 7) || self.configExtension != null) {
            output.w(serialDesc, 7, C0.f11399a, self.configExtension);
        }
        if (output.F(serialDesc, 8) || !kotlin.jvm.internal.l.b(self.disableAdId, Boolean.TRUE)) {
            output.w(serialDesc, 8, C1532h.f11487a, self.disableAdId);
        }
        if (output.F(serialDesc, 9) || self.isReportIncentivizedEnabled != null) {
            output.w(serialDesc, 9, C1532h.f11487a, self.isReportIncentivizedEnabled);
        }
        if (output.F(serialDesc, 10) || self.sessionTimeout != null) {
            output.w(serialDesc, 10, Q.f11448a, self.sessionTimeout);
        }
        if (output.F(serialDesc, 11) || self.waitForConnectivityForTPAT != null) {
            output.w(serialDesc, 11, C1532h.f11487a, self.waitForConnectivityForTPAT);
        }
        if (output.F(serialDesc, 12) || self.signalSessionTimeout != null) {
            output.w(serialDesc, 12, Q.f11448a, self.signalSessionTimeout);
        }
        if (output.F(serialDesc, 13) || self.isCacheableAssetsRequired != null) {
            output.w(serialDesc, 13, C1532h.f11487a, self.isCacheableAssetsRequired);
        }
        if (output.F(serialDesc, 14) || self.signalsDisabled != null) {
            output.w(serialDesc, 14, C1532h.f11487a, self.signalsDisabled);
        }
        if (output.F(serialDesc, 15) || self.fpdEnabled != null) {
            output.w(serialDesc, 15, C1532h.f11487a, self.fpdEnabled);
        }
        if (output.F(serialDesc, 16) || self.rtaDebugging != null) {
            output.w(serialDesc, 16, C1532h.f11487a, self.rtaDebugging);
        }
        if (!output.F(serialDesc, 17) && self.configLastValidatedTimestamp == null) {
            return;
        }
        output.w(serialDesc, 17, Y.f11465a, self.configLastValidatedTimestamp);
    }

    public final b component1() {
        return this.cleverCache;
    }

    public final Boolean component10() {
        return this.isReportIncentivizedEnabled;
    }

    public final Integer component11() {
        return this.sessionTimeout;
    }

    public final Boolean component12() {
        return this.waitForConnectivityForTPAT;
    }

    public final Integer component13() {
        return this.signalSessionTimeout;
    }

    public final Boolean component14() {
        return this.isCacheableAssetsRequired;
    }

    public final Boolean component15() {
        return this.signalsDisabled;
    }

    public final Boolean component16() {
        return this.fpdEnabled;
    }

    public final Boolean component17() {
        return this.rtaDebugging;
    }

    public final Long component18() {
        return this.configLastValidatedTimestamp;
    }

    public final d component2() {
        return this.configSettings;
    }

    public final e component3() {
        return this.endpoints;
    }

    public final h component4() {
        return this.logMetricsSettings;
    }

    public final List<C1661j> component5() {
        return this.placements;
    }

    public final i component6() {
        return this.userPrivacy;
    }

    public final j component7() {
        return this.viewAbility;
    }

    public final String component8() {
        return this.configExtension;
    }

    public final Boolean component9() {
        return this.disableAdId;
    }

    public final C1658g copy(b bVar, d dVar, e eVar, h hVar, List<C1661j> list, i iVar, j jVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l5) {
        return new C1658g(bVar, dVar, eVar, hVar, list, iVar, jVar, str, bool, bool2, num, bool3, num2, bool4, bool5, bool6, bool7, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1658g)) {
            return false;
        }
        C1658g c1658g = (C1658g) obj;
        return kotlin.jvm.internal.l.b(this.cleverCache, c1658g.cleverCache) && kotlin.jvm.internal.l.b(this.configSettings, c1658g.configSettings) && kotlin.jvm.internal.l.b(this.endpoints, c1658g.endpoints) && kotlin.jvm.internal.l.b(this.logMetricsSettings, c1658g.logMetricsSettings) && kotlin.jvm.internal.l.b(this.placements, c1658g.placements) && kotlin.jvm.internal.l.b(this.userPrivacy, c1658g.userPrivacy) && kotlin.jvm.internal.l.b(this.viewAbility, c1658g.viewAbility) && kotlin.jvm.internal.l.b(this.configExtension, c1658g.configExtension) && kotlin.jvm.internal.l.b(this.disableAdId, c1658g.disableAdId) && kotlin.jvm.internal.l.b(this.isReportIncentivizedEnabled, c1658g.isReportIncentivizedEnabled) && kotlin.jvm.internal.l.b(this.sessionTimeout, c1658g.sessionTimeout) && kotlin.jvm.internal.l.b(this.waitForConnectivityForTPAT, c1658g.waitForConnectivityForTPAT) && kotlin.jvm.internal.l.b(this.signalSessionTimeout, c1658g.signalSessionTimeout) && kotlin.jvm.internal.l.b(this.isCacheableAssetsRequired, c1658g.isCacheableAssetsRequired) && kotlin.jvm.internal.l.b(this.signalsDisabled, c1658g.signalsDisabled) && kotlin.jvm.internal.l.b(this.fpdEnabled, c1658g.fpdEnabled) && kotlin.jvm.internal.l.b(this.rtaDebugging, c1658g.rtaDebugging) && kotlin.jvm.internal.l.b(this.configLastValidatedTimestamp, c1658g.configLastValidatedTimestamp);
    }

    public final b getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final d getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final e getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final h getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<C1661j> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final i getUserPrivacy() {
        return this.userPrivacy;
    }

    public final j getViewAbility() {
        return this.viewAbility;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        b bVar = this.cleverCache;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        d dVar = this.configSettings;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.endpoints;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        h hVar = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<C1661j> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.viewAbility;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.isCacheableAssetsRequired;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.signalsDisabled;
        int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.fpdEnabled;
        int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.rtaDebugging;
        int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Long l5 = this.configLastValidatedTimestamp;
        return iHashCode17 + (l5 != null ? l5.hashCode() : 0);
    }

    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setConfigLastValidatedTimestamp(Long l5) {
        this.configLastValidatedTimestamp = l5;
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", viewAbility=" + this.viewAbility + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
    }

    public /* synthetic */ C1658g(int i10, b bVar, d dVar, e eVar, h hVar, List list, i iVar, j jVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l5, x0 x0Var) {
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = bVar;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = dVar;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = eVar;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = hVar;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = iVar;
        }
        if ((i10 & 64) == 0) {
            this.viewAbility = null;
        } else {
            this.viewAbility = jVar;
        }
        if ((i10 & 128) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 256) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i10 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 1024) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 2048) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 4096) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 8192) == 0) {
            this.isCacheableAssetsRequired = null;
        } else {
            this.isCacheableAssetsRequired = bool4;
        }
        if ((i10 & 16384) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool5;
        }
        if ((32768 & i10) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool6;
        }
        if ((65536 & i10) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool7;
        }
        if ((i10 & 131072) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l5;
        }
    }

    public C1658g(b bVar, d dVar, e eVar, h hVar, List<C1661j> list, i iVar, j jVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l5) {
        this.cleverCache = bVar;
        this.configSettings = dVar;
        this.endpoints = eVar;
        this.logMetricsSettings = hVar;
        this.placements = list;
        this.userPrivacy = iVar;
        this.viewAbility = jVar;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.isCacheableAssetsRequired = bool4;
        this.signalsDisabled = bool5;
        this.fpdEnabled = bool6;
        this.rtaDebugging = bool7;
        this.configLastValidatedTimestamp = l5;
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getViewAbility$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isCacheableAssetsRequired$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public /* synthetic */ C1658g(b bVar, d dVar, e eVar, h hVar, List list, i iVar, j jVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l5, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : bVar, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : eVar, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : iVar, (i10 & 64) != 0 ? null : jVar, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? Boolean.TRUE : bool, (i10 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bool2, (i10 & 1024) != 0 ? null : num, (i10 & 2048) != 0 ? null : bool3, (i10 & 4096) != 0 ? null : num2, (i10 & 8192) != 0 ? null : bool4, (i10 & 16384) != 0 ? null : bool5, (i10 & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? null : bool6, (i10 & 65536) != 0 ? null : bool7, (i10 & 131072) != 0 ? null : l5);
    }
}
