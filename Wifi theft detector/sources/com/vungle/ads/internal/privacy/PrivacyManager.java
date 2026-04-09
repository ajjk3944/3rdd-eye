package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.c;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t7.b;

/* loaded from: classes3.dex */
public final class PrivacyManager {

    @Nullable
    private static PrivacyConsent ccpaConsent;

    @Nullable
    private static b filePreferences;

    @Nullable
    private static String gdprConsent;

    @Nullable
    private static String gdprConsentMessageVersion;

    @Nullable
    private static String gdprConsentSource;

    @Nullable
    private static Long gdprConsentTimestamp;

    @Nullable
    private static SharedPreferences sharedPreferences;

    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();

    @NotNull
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();

    @NotNull
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();

    @NotNull
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager$DeviceIdAllowed;", "", "(Ljava/lang/String;I)V", "ALLOW_ID", "DISABLE_ID", "FALLBACK", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceIdAllowed {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceIdAllowed.values().length];
            iArr[DeviceIdAllowed.DISABLE_ID.ordinal()] = 1;
            iArr[DeviceIdAllowed.FALLBACK.ordinal()] = 2;
            iArr[DeviceIdAllowed.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.IABSettings.TcfStatus.values().length];
            iArr2[ConfigPayload.IABSettings.TcfStatus.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.IABSettings.TcfStatus.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.IABSettings.TcfStatus.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        b bVarPut;
        b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("ccpa_status", privacyConsent.getValue())) == null) {
            return;
        }
        bVarPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        b bVarPut;
        b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("is_coppa", z10)) == null) {
            return;
        }
        bVarPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j10) {
        b bVarPut;
        b bVarPut2;
        b bVarPut3;
        b bVarPut4;
        b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("gdpr_status", str)) == null || (bVarPut2 = bVarPut.put("gdpr_source", str2)) == null || (bVarPut3 = bVarPut2.put("gdpr_message_version", str3)) == null || (bVarPut4 = bVarPut3.put("gdpr_timestamp", j10)) == null) {
            return;
        }
        bVarPut4.apply();
    }

    @NotNull
    public final DeviceIdAllowed allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!p.a(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? DeviceIdAllowed.FALLBACK : DeviceIdAllowed.ALLOW_ID;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : a.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return DeviceIdAllowed.DISABLE_ID;
            }
            if (i10 == 2) {
                return DeviceIdAllowed.ALLOW_ID;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return DeviceIdAllowed.FALLBACK;
    }

    @NotNull
    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    @NotNull
    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    @NotNull
    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @NotNull
    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : p.a(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : p.a(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    @Nullable
    public final Boolean getGdprAppliesFromPreferences() {
        Object objB;
        Object objB2;
        Integer numValueOf;
        String string;
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objB = Result.b(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(c.a(th));
        }
        if (Result.e(objB) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", "-1")) == null) {
                    numValueOf = null;
                } else {
                    p.d(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objB2 = Result.b(numValueOf);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objB2 = Result.b(c.a(th2));
            }
            objB = objB2;
        }
        if (Result.g(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    @NotNull
    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
        return string == null ? "" : string;
    }

    @Nullable
    public final String getPreviousTcfToken() {
        b bVar = filePreferences;
        if (bVar != null) {
            return bVar.getString("previous_tcf_token", "");
        }
        return null;
    }

    @Nullable
    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(@NotNull Context context) {
        Throwable th;
        try {
            try {
                p.e(context, "context");
                AtomicBoolean atomicBoolean = initialized;
                try {
                    if (atomicBoolean.get()) {
                        com.vungle.ads.internal.util.p.Companion.w("PrivacyManager", "PrivacyManager already initialized");
                        return;
                    }
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    b bVar = (b) ServiceLocator.Companion.getInstance(context).getService(b.class);
                    filePreferences = bVar;
                    AtomicReference<Boolean> atomicReference = disableAdId;
                    Boolean bool = atomicReference.get();
                    if (bool != null) {
                        saveDisableAdId(bool.booleanValue());
                    } else {
                        Boolean bool2 = bVar.getBoolean("disable_ad_id");
                        if (bool2 != null) {
                            atomicReference.set(bool2);
                        }
                    }
                    String str = gdprConsent;
                    if (str != null) {
                        String str2 = gdprConsentSource;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = gdprConsentMessageVersion;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Long l10 = gdprConsentTimestamp;
                        saveGdprConsent(str, str2, str3, l10 != null ? l10.longValue() : 0L);
                    } else {
                        String string = bVar.getString("gdpr_status");
                        PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
                        if (p.a(string, privacyConsent.getValue())) {
                            string = privacyConsent.getValue();
                        } else {
                            PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                            if (p.a(string, privacyConsent2.getValue())) {
                                string = privacyConsent2.getValue();
                            }
                        }
                        gdprConsent = string;
                        gdprConsentSource = bVar.getString("gdpr_source");
                        gdprConsentMessageVersion = bVar.getString("gdpr_message_version");
                        gdprConsentTimestamp = Long.valueOf(bVar.getLong("gdpr_timestamp", 0L));
                    }
                    PrivacyConsent privacyConsent3 = ccpaConsent;
                    if (privacyConsent3 != null) {
                        saveCcpaConsent(privacyConsent3);
                    } else {
                        String string2 = bVar.getString("ccpa_status");
                        PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
                        if (!p.a(privacyConsent4.getValue(), string2)) {
                            privacyConsent4 = PrivacyConsent.OPT_IN;
                        }
                        ccpaConsent = privacyConsent4;
                    }
                    AtomicReference<Boolean> atomicReference2 = coppaStatus;
                    Boolean bool3 = atomicReference2.get();
                    if (bool3 != null) {
                        saveCoppaConsent(bool3.booleanValue());
                    } else {
                        Boolean bool4 = bVar.getBoolean("is_coppa");
                        if (bool4 != null) {
                            atomicReference2.set(bool4);
                        }
                    }
                    atomicBoolean.set(true);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean z10) {
        b bVarPut;
        b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("disable_ad_id", z10)) == null) {
            return;
        }
        bVarPut.apply();
    }

    public final void setPreviousTcfToken(@Nullable String str) {
        b bVar;
        b bVarPut;
        if (str == null || str.length() == 0 || (bVar = filePreferences) == null || (bVarPut = bVar.put("previous_tcf_token", str)) == null) {
            return;
        }
        bVarPut.apply();
    }

    public final void setSharedPreferences(@Nullable SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (p.a(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i10 = a.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
            if (disableAdId$vungle_ads_release != null && !disableAdId$vungle_ads_release.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        if (!p.a(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : a.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        p.e(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(@NotNull String consent, @NotNull String source, @Nullable String str) {
        p.e(consent, "consent");
        p.e(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, jCurrentTimeMillis);
    }
}
