package e6;

import a6.C1658g;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import b9.j;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.f;
import com.vungle.ads.internal.util.k;
import d6.C4277a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;

/* compiled from: PrivacyManager.kt */
/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4321c {
    private static EnumC4320b ccpaConsent;
    private static C4277a filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final C4321c INSTANCE = new C4321c();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: PrivacyManager.kt */
    /* renamed from: e6.c$a */
    public enum a {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* compiled from: PrivacyManager.kt */
    /* renamed from: e6.c$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.DISABLE_ID.ordinal()] = 1;
            iArr[a.FALLBACK.ordinal()] = 2;
            iArr[a.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C1658g.C0223g.c.values().length];
            iArr2[C1658g.C0223g.c.DISABLE_ID.ordinal()] = 1;
            iArr2[C1658g.C0223g.c.ALLOW_ID.ordinal()] = 2;
            iArr2[C1658g.C0223g.c.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private C4321c() {
    }

    private final void saveCcpaConsent(EnumC4320b enumC4320b) {
        C4277a c4277aPut;
        C4277a c4277a = filePreferences;
        if (c4277a == null || (c4277aPut = c4277a.put("ccpa_status", enumC4320b.getValue())) == null) {
            return;
        }
        c4277aPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        C4277a c4277aPut;
        C4277a c4277a = filePreferences;
        if (c4277a == null || (c4277aPut = c4277a.put("is_coppa", z10)) == null) {
            return;
        }
        c4277aPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j4) {
        C4277a c4277aPut;
        C4277a c4277aPut2;
        C4277a c4277aPut3;
        C4277a c4277aPut4;
        C4277a c4277a = filePreferences;
        if (c4277a == null || (c4277aPut = c4277a.put("gdpr_status", str)) == null || (c4277aPut2 = c4277aPut.put("gdpr_source", str2)) == null || (c4277aPut3 = c4277aPut2.put("gdpr_message_version", str3)) == null || (c4277aPut4 = c4277aPut3.put("gdpr_timestamp", j4)) == null) {
            return;
        }
        c4277aPut4.apply();
    }

    public final a allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!l.b(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? a.FALLBACK : a.ALLOW_ID;
        }
        C1658g.C0223g.c tcfStatus = f.INSTANCE.getTcfStatus();
        int i = tcfStatus == null ? -1 : b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return a.DISABLE_ID;
            }
            if (i == 2) {
                return a.ALLOW_ID;
            }
            if (i != 3) {
                throw new j();
            }
        }
        return a.FALLBACK;
    }

    public final String getCcpaStatus() {
        String value;
        EnumC4320b enumC4320b = ccpaConsent;
        return (enumC4320b == null || (value = enumC4320b.getValue()) == null) ? EnumC4320b.OPT_IN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l5 = gdprConsentTimestamp;
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    public final EnumC4319a getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        return atomicReference.get() == null ? EnumC4319a.COPPA_NOTSET : l.b(atomicReference.get(), Boolean.TRUE) ? EnumC4319a.COPPA_ENABLED : l.b(atomicReference.get(), Boolean.FALSE) ? EnumC4319a.COPPA_DISABLED : EnumC4319a.COPPA_NOTSET;
    }

    public final Boolean getGdprAppliesFromPreferences() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        Integer numValueOf = sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString("IABTCF_TCString", "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        C4277a c4277a = filePreferences;
        if (c4277a != null) {
            return c4277a.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(Context context) throws Throwable {
        Throwable th;
        try {
            try {
                l.f(context, "context");
                AtomicBoolean atomicBoolean = initialized;
                try {
                    if (atomicBoolean.get()) {
                        k.Companion.w("PrivacyManager", "PrivacyManager already initialized");
                        return;
                    }
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    C4277a c4277a = (C4277a) ServiceLocator.Companion.getInstance(context).getService(C4277a.class);
                    filePreferences = c4277a;
                    AtomicReference<Boolean> atomicReference = disableAdId;
                    Boolean bool = atomicReference.get();
                    if (bool != null) {
                        saveDisableAdId(bool.booleanValue());
                    } else {
                        Boolean bool2 = c4277a.getBoolean("disable_ad_id");
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
                        Long l5 = gdprConsentTimestamp;
                        saveGdprConsent(str, str2, str3, l5 != null ? l5.longValue() : 0L);
                    } else {
                        String string = c4277a.getString("gdpr_status");
                        EnumC4320b enumC4320b = EnumC4320b.OPT_IN;
                        if (l.b(string, enumC4320b.getValue())) {
                            string = enumC4320b.getValue();
                        } else {
                            EnumC4320b enumC4320b2 = EnumC4320b.OPT_OUT;
                            if (l.b(string, enumC4320b2.getValue())) {
                                string = enumC4320b2.getValue();
                            }
                        }
                        gdprConsent = string;
                        gdprConsentSource = c4277a.getString("gdpr_source");
                        gdprConsentMessageVersion = c4277a.getString("gdpr_message_version");
                        gdprConsentTimestamp = Long.valueOf(c4277a.getLong("gdpr_timestamp", 0L));
                    }
                    EnumC4320b enumC4320b3 = ccpaConsent;
                    if (enumC4320b3 != null) {
                        saveCcpaConsent(enumC4320b3);
                    } else {
                        String string2 = c4277a.getString("ccpa_status");
                        EnumC4320b enumC4320b4 = EnumC4320b.OPT_OUT;
                        if (!l.b(enumC4320b4.getValue(), string2)) {
                            enumC4320b4 = EnumC4320b.OPT_IN;
                        }
                        ccpaConsent = enumC4320b4;
                    }
                    AtomicReference<Boolean> atomicReference2 = coppaStatus;
                    Boolean bool3 = atomicReference2.get();
                    if (bool3 != null) {
                        saveCoppaConsent(bool3.booleanValue());
                    } else {
                        Boolean bool4 = c4277a.getBoolean("is_coppa");
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

    public final void saveDisableAdId(boolean z10) {
        C4277a c4277aPut;
        C4277a c4277a = filePreferences;
        if (c4277a == null || (c4277aPut = c4277a.put("disable_ad_id", z10)) == null) {
            return;
        }
        c4277aPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        C4277a c4277a;
        C4277a c4277aPut;
        if (str == null || str.length() == 0 || (c4277a = filePreferences) == null || (c4277aPut = c4277a.put("previous_tcf_token", str)) == null) {
            return;
        }
        c4277aPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (l.b(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i = b.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new j();
            }
            Boolean bool = disableAdId.get();
            if (bool != null && !bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        if (!l.b(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        C1658g.C0223g.c tcfStatus = f.INSTANCE.getTcfStatus();
        int i = tcfStatus == null ? -1 : b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return true;
            }
            if (i != 3) {
                throw new j();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(EnumC4320b consent) {
        l.f(consent, "consent");
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

    public final void updateGdprConsent(String consent, String source, String str) {
        l.f(consent, "consent");
        l.f(source, "source");
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
