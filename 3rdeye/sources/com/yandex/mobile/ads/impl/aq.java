package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aq {

    /* renamed from: d, reason: collision with root package name */
    public static final a f24788d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ aq[] f24789e;

    /* renamed from: b, reason: collision with root package name */
    private final String f24790b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24791c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        aq[] aqVarArr = {new aq(0, "CONSENT_STRING", "IABConsent_ConsentString", "IABTCF_TCString"), new aq(1, "GDPR", "IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"), new aq(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new aq(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new aq(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new aq(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        f24789e = aqVarArr;
        com.google.gson.internal.c.l(aqVarArr);
        f24788d = new a(0);
    }

    private aq(int i, String str, String str2, String str3) {
        this.f24790b = str2;
        this.f24791c = str3;
    }

    public static aq valueOf(String str) {
        return (aq) Enum.valueOf(aq.class, str);
    }

    public static aq[] values() {
        return (aq[]) f24789e.clone();
    }

    public final String a() {
        return this.f24790b;
    }

    public final String b() {
        return this.f24791c;
    }
}
