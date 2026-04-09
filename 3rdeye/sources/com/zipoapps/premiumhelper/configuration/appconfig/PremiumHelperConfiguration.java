package com.zipoapps.premiumhelper.configuration.appconfig;

import android.app.Activity;
import android.os.Bundle;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.util.PHMessagingService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l8.a;
import org.json.JSONObject;
import z8.e;

/* compiled from: PremiumHelperConfiguration.kt */
/* loaded from: classes3.dex */
public final class PremiumHelperConfiguration {
    public static final a Companion = new a();
    public static final String INTENT_FILTER_INTRO = "com.premiumhelper.INTRO_ACTIVITY";
    public static final String INTENT_FILTER_MAIN = "com.premiumhelper.MAIN_ACTIVITY";
    public static final String INTENT_FILTER_WARM_SPLASH = "com.premiumhelper.WARM_SPLASH_ACTIVITY";
    private final boolean adManagerTestAds;
    private final Map<String, String> configMap;
    private final Bundle debugData;
    private final Class<? extends Activity> introActivityClass;
    private final boolean isDebugMode;
    private final Class<? extends Activity> mainActivityClass;
    private final PHMessagingService.a pushMessageListener;
    private final e rateBarDialogStyle;
    private final int[] relaunchOneTimeActivityLayout;
    private final int[] relaunchPremiumActivityLayout;
    private final int[] startLikeProActivityLayout;
    private final Class<? extends Activity> warmSplashActivityClass;

    /* compiled from: PremiumHelperConfiguration.kt */
    public static final class a {
    }

    /* compiled from: PremiumHelperConfiguration.kt */
    public static final class b implements l8.a {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        @Override // l8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> T a(l8.a r3, java.lang.String r4, T r5) {
            /*
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.l.f(r3, r0)
                java.lang.String r3 = "key"
                kotlin.jvm.internal.l.f(r4, r3)
                boolean r3 = r5 instanceof java.lang.String
                com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration.this
                if (r3 == 0) goto L19
                java.util.Map r3 = r0.getConfigMap()
                java.lang.Object r3 = r3.get(r4)
                goto L6f
            L19:
                boolean r3 = r5 instanceof java.lang.Boolean
                r1 = 0
                if (r3 == 0) goto L31
                java.util.Map r3 = r0.getConfigMap()
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L2f
                java.lang.Boolean r3 = y9.q.v0(r3)
                goto L6f
            L2f:
                r3 = r1
                goto L6f
            L31:
                boolean r3 = r5 instanceof java.lang.Long
                if (r3 == 0) goto L46
                java.util.Map r3 = r0.getConfigMap()
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L2f
                java.lang.Long r3 = y9.m.R(r3)
                goto L6f
            L46:
                boolean r3 = r5 instanceof java.lang.Integer
                if (r3 == 0) goto L5b
                java.util.Map r3 = r0.getConfigMap()
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L2f
                java.lang.Integer r3 = y9.m.Q(r3)
                goto L6f
            L5b:
                boolean r3 = r5 instanceof java.lang.Double
                if (r3 == 0) goto L73
                java.util.Map r3 = r0.getConfigMap()
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L2f
                java.lang.Double r3 = y9.m.O(r3)
            L6f:
                if (r3 != 0) goto L72
                return r5
            L72:
                return r3
            L73:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Unsupported type"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration.b.a(l8.a, java.lang.String, java.lang.Object):java.lang.Object");
        }

        @Override // l8.a
        public final boolean b(String key) {
            l.f(key, "key");
            return PremiumHelperConfiguration.this.getConfigMap().containsKey(key);
        }

        @Override // l8.a
        public final boolean c(String str, boolean z10) {
            return a.C0491a.a(this, str, z10);
        }

        @Override // l8.a
        public final String d() {
            return "App Default";
        }

        @Override // l8.a
        public final Map<String, String> e() {
            return PremiumHelperConfiguration.this.getConfigMap();
        }
    }

    public /* synthetic */ PremiumHelperConfiguration(Class cls, Class cls2, Class cls3, PHMessagingService.a aVar, int[] iArr, int[] iArr2, int[] iArr3, boolean z10, boolean z11, e eVar, Bundle bundle, Map map, g gVar) {
        this(cls, cls2, cls3, aVar, iArr, iArr2, iArr3, z10, z11, eVar, bundle, map);
    }

    public final boolean getAdManagerTestAds() {
        return this.adManagerTestAds;
    }

    public final Map<String, String> getConfigMap() {
        return this.configMap;
    }

    public final Bundle getDebugData() {
        return this.debugData;
    }

    public final Class<? extends Activity> getIntroActivityClass() {
        return this.introActivityClass;
    }

    public final Class<? extends Activity> getMainActivityClass() {
        return this.mainActivityClass;
    }

    public final PHMessagingService.a getPushMessageListener() {
        return null;
    }

    public final e getRateBarDialogStyle() {
        return this.rateBarDialogStyle;
    }

    public final int[] getRelaunchOneTimeActivityLayout() {
        return this.relaunchOneTimeActivityLayout;
    }

    public final int[] getRelaunchPremiumActivityLayout() {
        return this.relaunchPremiumActivityLayout;
    }

    public final int[] getStartLikeProActivityLayout() {
        return this.startLikeProActivityLayout;
    }

    public final Class<? extends Activity> getWarmSplashActivityClass() {
        return this.warmSplashActivityClass;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final l8.a repository() {
        return new b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MainActivity : ".concat(this.mainActivityClass.getName()));
        sb.append('\n');
        sb.append("WarmSplashActivity : " + this.warmSplashActivityClass);
        sb.append('\n');
        sb.append("PushMessageListener : ".concat("not set"));
        sb.append('\n');
        sb.append("startLikeProActivityLayout : " + this.startLikeProActivityLayout);
        sb.append('\n');
        sb.append("relaunchPremiumActivityLayout : " + this.relaunchPremiumActivityLayout);
        sb.append('\n');
        sb.append("relaunchOneTimeActivityLayout : " + this.relaunchOneTimeActivityLayout);
        sb.append('\n');
        sb.append("isDebugMode : " + this.isDebugMode);
        sb.append('\n');
        sb.append("adManagerTestAds : " + this.adManagerTestAds);
        sb.append("\nconfigMap : \n");
        sb.append(new JSONObject(new Gson().g(this.configMap)).toString(4));
        sb.append('\n');
        return sb.toString();
    }

    private PremiumHelperConfiguration(Class<? extends Activity> cls, Class<? extends Activity> cls2, Class<? extends Activity> cls3, PHMessagingService.a aVar, int[] iArr, int[] iArr2, int[] iArr3, boolean z10, boolean z11, e eVar, Bundle bundle, Map<String, String> map) {
        this.mainActivityClass = cls;
        this.introActivityClass = cls2;
        this.warmSplashActivityClass = cls3;
        this.startLikeProActivityLayout = iArr;
        this.relaunchPremiumActivityLayout = iArr2;
        this.relaunchOneTimeActivityLayout = iArr3;
        this.isDebugMode = z10;
        this.adManagerTestAds = z11;
        this.rateBarDialogStyle = eVar;
        this.debugData = bundle;
        this.configMap = map;
    }

    public /* synthetic */ PremiumHelperConfiguration(Class cls, Class cls2, Class cls3, PHMessagingService.a aVar, int[] iArr, int[] iArr2, int[] iArr3, boolean z10, boolean z11, e eVar, Bundle bundle, Map map, int i, g gVar) {
        this(cls, cls2, cls3, aVar, iArr, iArr2, iArr3, z10, z11, eVar, bundle, (i & 2048) != 0 ? new HashMap() : map);
    }
}
