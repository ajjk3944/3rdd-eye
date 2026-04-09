package com.vungle.ads.internal.platform;

import a6.C1654c;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.tasks.Task;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.k;
import java.io.IOException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import y9.n;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    public static final C0386a Companion = new C0386a(null);
    private static final String TAG = "AndroidPlatform";
    private C1654c advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final i uaExecutor;
    private String userAgent;

    /* compiled from: AndroidPlatform.kt */
    /* renamed from: com.vungle.ads.internal.platform.a$a, reason: collision with other inner class name */
    public static final class C0386a {
        public /* synthetic */ C0386a(g gVar) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            l.f(context, "context");
            Object systemService = context.getSystemService("phone");
            l.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }

        private C0386a() {
        }
    }

    public a(Context context, i uaExecutor) {
        l.f(context, "context");
        l.f(uaExecutor, "uaExecutor");
        this.context = context;
        this.uaExecutor = uaExecutor;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
        Object systemService2 = context.getSystemService("audio");
        l.d(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService2;
    }

    private final C1654c getAmazonAdvertisingInfo() {
        C1654c c1654c = new C1654c();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z10 = false;
            }
            c1654c.setLimitAdTracking(z10);
            c1654c.setAdvertisingId(Settings.Secure.getString(contentResolver, Constants.AMAZON_ADVERTISING_ID));
            return c1654c;
        } catch (Settings.SettingNotFoundException e4) {
            k.Companion.w(TAG, "Error getting Amazon advertising info", e4);
            return c1654c;
        }
    }

    private final C1654c getGoogleAdvertisingInfo() throws GooglePlayServicesRepairableException, IllegalStateException, IOException {
        C1654c c1654c = new C1654c();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            l.e(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            c1654c.setAdvertisingId(advertisingIdInfo.getId());
            c1654c.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
            return c1654c;
        } catch (GooglePlayServicesNotAvailableException e4) {
            k.Companion.e(TAG, "Play services Not available: " + e4.getLocalizedMessage());
            return c1654c;
        } catch (NoClassDefFoundError e10) {
            k.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
            c1654c.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), Constants.AMAZON_ADVERTISING_ID));
            return c1654c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m86getUserAgentLazy$lambda0(a this$0, K0.b consumer) {
        l.f(this$0, "this$0");
        l.f(consumer, "$consumer");
        new c(this$0.context).getUserAgent(consumer);
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                l.e(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                l.e(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new B8.b(this, 8));
            } catch (NoClassDefFoundError e4) {
                k.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e4.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAppSetID$lambda-2, reason: not valid java name */
    public static final void m87updateAppSetID$lambda2(a this$0, AppSetIdInfo appSetIdInfo) {
        l.f(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.b
    public C1654c getAdvertisingInfo() {
        String advertisingId;
        C1654c c1654c = this.advertisingInfo;
        if (c1654c != null && (advertisingId = c1654c.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return c1654c;
        }
        C1654c amazonAdvertisingInfo = n.U(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.b
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.b
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.b
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        l.e(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.b
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.b
    public void getUserAgentLazy(K0.b<String> consumer) {
        l.f(consumer, "consumer");
        this.uaExecutor.execute(new B.a(18, this, consumer));
    }

    @Override // com.vungle.ads.internal.platform.b
    public float getVolumeLevel() {
        try {
            return this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isAtLeastMinimumSDK() {
        return true;
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isSdCardPresent() {
        try {
            return l.b(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e4) {
            k.Companion.e(TAG, "Acquiring external storage state failed", e4);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isSilentModeEnabled() {
        try {
            if (this.audioManager.getRingerMode() != 0) {
                if (this.audioManager.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.b
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
