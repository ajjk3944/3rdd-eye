package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.r;
import s9.u;
import y8.h;

/* loaded from: classes3.dex */
public final class AndroidPlatform implements d {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String PREF_KEY_SDK_INSTALL_TIME = "sit";

    @NotNull
    private static final String TAG = "AndroidPlatform";

    @Nullable
    private q7.b advertisingInfo;

    @Nullable
    private String appSetId;

    @Nullable
    private Integer appSetIdScope;

    @NotNull
    private final AudioManager audioManager;

    @NotNull
    private final Context context;

    @Nullable
    private String gpVersion;
    private final boolean isSideLoaded;

    @NotNull
    private final PowerManager powerManager;

    @Nullable
    private Long sdkInstallationTime;

    @NotNull
    private final VungleThreadPoolExecutor uaExecutor;

    @Nullable
    private String userAgent;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(@NotNull Context context) {
            p.e(context, "context");
            Object systemService = context.getSystemService("phone");
            p.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }

        private a() {
        }
    }

    public AndroidPlatform(@NotNull Context context, @NotNull VungleThreadPoolExecutor uaExecutor, @NotNull PowerManager powerManager, @NotNull AudioManager audioManager) {
        p.e(context, "context");
        p.e(uaExecutor, "uaExecutor");
        p.e(powerManager, "powerManager");
        p.e(audioManager, "audioManager");
        this.context = context;
        this.uaExecutor = uaExecutor;
        this.powerManager = powerManager;
        this.audioManager = audioManager;
        updateAppSetID();
    }

    private final q7.b getAmazonAdvertisingInfo() {
        q7.b bVar = new q7.b();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z10 = false;
            }
            bVar.setLimitAdTracking(z10);
            bVar.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
            return bVar;
        } catch (Settings.SettingNotFoundException e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Error getting Amazon advertising info: Setting not found.", e10);
            return bVar;
        } catch (Exception e11) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Error getting Amazon advertising info", e11);
            return bVar;
        }
    }

    private final q7.b getGoogleAdvertisingInfo() {
        q7.b bVar = new q7.b();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            p.d(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            bVar.setAdvertisingId(advertisingIdInfo.getId());
            bVar.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
            return bVar;
        } catch (GooglePlayServicesNotAvailableException e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
            return bVar;
        } catch (Exception e11) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Error getting Google advertising info: " + e11.getLocalizedMessage());
            return bVar;
        } catch (NoClassDefFoundError e12) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Play services Not available: " + e12.getLocalizedMessage());
            bVar.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
            return bVar;
        }
    }

    /* renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final t7.b m328getSDKInstallationTime$lambda4(h hVar) {
        return (t7.b) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m329getUserAgentLazy$lambda0(AndroidPlatform this$0, r0.b consumer) {
        p.e(this$0, "this$0");
        p.e(consumer, "$consumer");
        e.INSTANCE.getUserAgent(this$0.context, consumer);
    }

    private final float sanitizeVolume(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10) || f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                p.d(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                p.d(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.b
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AndroidPlatform.m330updateAppSetID$lambda8(this.f20200a, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e10) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Error getting AppSetID: " + e10.getLocalizedMessage());
            } catch (NoClassDefFoundError e11) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAppSetID$lambda-8, reason: not valid java name */
    public static final void m330updateAppSetID$lambda8(AndroidPlatform this$0, AppSetIdInfo appSetIdInfo) {
        p.e(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    @NotNull
    public q7.b getAdvertisingInfo() {
        String advertisingId;
        q7.b bVar = this.advertisingInfo;
        if (bVar != null && (advertisingId = bVar.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return bVar;
        }
        q7.b amazonAdvertisingInfo = r.x(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.d
    @Nullable
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.d
    @Nullable
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.d
    public long getBuildTime() {
        return Build.TIME;
    }

    @Override // com.vungle.ads.internal.platform.d
    @NotNull
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        p.d(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.d
    @Nullable
    public String getGPVersion() {
        String str = this.gpVersion;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.gpVersion = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public long getLastBootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.d
    public long getOSInstallationTime() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            if (thE instanceof PackageManager.NameNotFoundException) {
                com.vungle.ads.internal.util.p.Companion.e(TAG, "Error getting OS installation time: " + ((PackageManager.NameNotFoundException) thE).getLocalizedMessage());
            }
            objB = -1L;
        }
        return ((Number) objB).longValue();
    }

    @Override // com.vungle.ads.internal.platform.d
    public long getSDKInstallationTime() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        h hVarA = kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$getSDKInstallationTime$$inlined$inject$1
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
        Long l10 = this.sdkInstallationTime;
        if (l10 != null) {
            return l10.longValue();
        }
        long jCurrentTimeMillis = m328getSDKInstallationTime$lambda4(hVarA).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            m328getSDKInstallationTime$lambda4(hVarA).put(PREF_KEY_SDK_INSTALL_TIME, jCurrentTimeMillis).apply();
        }
        this.sdkInstallationTime = Long.valueOf(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    @Override // com.vungle.ads.internal.platform.d
    @Nullable
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.d
    public void getUserAgentLazy(@NotNull final r0.b consumer) {
        p.e(consumer, "consumer");
        this.uaExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPlatform.m329getUserAgentLazy$lambda0(this.f20198a, consumer);
            }
        });
    }

    @Override // com.vungle.ads.internal.platform.d
    public float getVolumeLevel() {
        try {
            return sanitizeVolume(this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isProblematicMaliDevice() {
        String str = Build.HARDWARE;
        boolean z10 = str != null && u.N(str, "mali", true);
        int i10 = Build.VERSION.SDK_INT;
        return z10 && (29 <= i10 && i10 < 34);
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSdCardPresent() {
        try {
            return p.a(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "Acquiring external storage state failed", e10);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.d
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

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(@Nullable String str) {
        this.userAgent = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AndroidPlatform(Context context, VungleThreadPoolExecutor vungleThreadPoolExecutor, PowerManager powerManager, AudioManager audioManager, int i10, i iVar) {
        if ((i10 & 4) != 0) {
            Object systemService = context.getSystemService("power");
            p.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            powerManager = (PowerManager) systemService;
        }
        if ((i10 & 8) != 0) {
            Object systemService2 = context.getSystemService("audio");
            p.c(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            audioManager = (AudioManager) systemService2;
        }
        this(context, vungleThreadPoolExecutor, powerManager, audioManager);
    }
}
