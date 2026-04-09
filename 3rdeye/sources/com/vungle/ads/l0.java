package com.vungle.ads;

import e6.C4321c;
import e6.EnumC4320b;

/* compiled from: VunglePrivacySettings.kt */
/* loaded from: classes2.dex */
public final class l0 {
    public static final l0 INSTANCE = new l0();

    private l0() {
    }

    public static final String getCCPAStatus() {
        return C4321c.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return C4321c.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return C4321c.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return C4321c.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return C4321c.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return C4321c.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z10) {
        C4321c.INSTANCE.updateCcpaConsent(z10 ? EnumC4320b.OPT_IN : EnumC4320b.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z10) {
        C4321c.INSTANCE.updateCoppaConsent(z10);
    }

    public static final void setGDPRStatus(boolean z10, String str) {
        C4321c.INSTANCE.updateGdprConsent(z10 ? EnumC4320b.OPT_IN.getValue() : EnumC4320b.OPT_OUT.getValue(), "publisher", str);
    }
}
