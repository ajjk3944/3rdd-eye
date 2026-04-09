package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.collect.AbstractC5069o;
import com.google.common.collect.AbstractC5070p;
import java.util.Map;

/* loaded from: classes.dex */
public final class G6 {

    /* renamed from: o, reason: collision with root package name */
    static final AbstractC5069o f35885o = AbstractC5069o.M0("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5070p f35886a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5070p f35887b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.collect.r f35888c;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f35889d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35890e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35891f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35892g;

    /* renamed from: h, reason: collision with root package name */
    private final int f35893h;

    /* renamed from: i, reason: collision with root package name */
    private final int f35894i;

    /* renamed from: j, reason: collision with root package name */
    private final String f35895j;

    /* renamed from: k, reason: collision with root package name */
    private final String f35896k;

    /* renamed from: l, reason: collision with root package name */
    private final String f35897l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f35898m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f35899n;

    /* JADX WARN: Illegal instructions before constructor call */
    public G6(SharedPreferences sharedPreferences) {
        com.google.android.gms.internal.measurement.M3 m32 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        I6 i62 = I6.CONSENT;
        Map.Entry entryA = F6.a(m32, i62);
        com.google.android.gms.internal.measurement.M3 m33 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        I6 i63 = I6.FLEXIBLE_LEGITIMATE_INTEREST;
        this(sharedPreferences, 755, AbstractC5070p.v(entryA, F6.a(m33, i63), F6.a(com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, i62), F6.a(com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, i62), F6.a(com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, i63), F6.a(com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, i63), F6.a(com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, i63)), com.google.common.collect.r.q0("CH"));
    }

    static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    private static int b(com.google.android.gms.internal.measurement.M3 m32) {
        if (m32 == com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (m32 == com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (m32 == com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return m32 == com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private final com.google.android.gms.internal.measurement.L3 d(com.google.android.gms.internal.measurement.M3 m32) {
        return (com.google.android.gms.internal.measurement.L3) this.f35887b.getOrDefault(m32, com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED);
    }

    static String e(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    private final String f(com.google.android.gms.internal.measurement.M3 m32) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(this.f35896k) || this.f35896k.length() < m32.zza()) ? "0" : String.valueOf(this.f35896k.charAt(m32.zza() - 1));
        if (!TextUtils.isEmpty(this.f35897l) && this.f35897l.length() >= m32.zza()) {
            strValueOf = String.valueOf(this.f35897l.charAt(m32.zza() - 1));
        }
        return strValueOf2 + strValueOf;
    }

    private final boolean g(com.google.android.gms.internal.measurement.M3 m32) {
        int iB = b(m32);
        if (!this.f35898m) {
            if (iB > 0) {
                char[] cArr = this.f35889d;
                if (cArr[iB] != '2') {
                    cArr[iB] = '4';
                }
            }
            return false;
        }
        if (this.f35896k.length() < m32.zza()) {
            if (iB > 0) {
                char[] cArr2 = this.f35889d;
                if (cArr2[iB] != '2') {
                    cArr2[iB] = '0';
                }
            }
            return false;
        }
        boolean z10 = this.f35896k.charAt(m32.zza() - 1) == '1';
        if (iB > 0) {
            char[] cArr3 = this.f35889d;
            if (cArr3[iB] != '2') {
                cArr3[iB] = z10 ? '1' : '6';
            }
        }
        return z10;
    }

    private final boolean h(com.google.android.gms.internal.measurement.M3 m32) {
        int iB = b(m32);
        if (!this.f35899n) {
            if (iB > 0) {
                char[] cArr = this.f35889d;
                if (cArr[iB] != '2') {
                    cArr[iB] = '5';
                }
            }
            return false;
        }
        if (this.f35897l.length() < m32.zza()) {
            if (iB > 0) {
                char[] cArr2 = this.f35889d;
                if (cArr2[iB] != '2') {
                    cArr2[iB] = '0';
                }
            }
            return false;
        }
        boolean z10 = this.f35897l.charAt(m32.zza() - 1) == '1';
        if (iB > 0) {
            char[] cArr3 = this.f35889d;
            if (cArr3[iB] != '2') {
                cArr3[iB] = z10 ? '1' : '7';
            }
        }
        return z10;
    }

    private final boolean i(com.google.android.gms.internal.measurement.M3 m32) {
        int iB = b(m32);
        if (iB > 0 && (this.f35892g != 1 || this.f35891f != 1)) {
            this.f35889d[iB] = '2';
        }
        if (d(m32) == com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            if (iB > 0) {
                char[] cArr = this.f35889d;
                if (cArr[iB] != '2') {
                    cArr[iB] = '3';
                }
            }
            return false;
        }
        if (m32 == com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && this.f35894i == 1 && this.f35888c.contains(this.f35895j)) {
            if (iB > 0) {
                char[] cArr2 = this.f35889d;
                if (cArr2[iB] != '2') {
                    cArr2[iB] = '1';
                }
            }
            return true;
        }
        if (!this.f35886a.containsKey(m32)) {
            if (iB > 0) {
                char[] cArr3 = this.f35889d;
                if (cArr3[iB] != '2') {
                    cArr3[iB] = '0';
                }
            }
            return false;
        }
        I6 i62 = (I6) this.f35886a.get(m32);
        if (i62 == null) {
            if (iB > 0) {
                char[] cArr4 = this.f35889d;
                if (cArr4[iB] != '2') {
                    cArr4[iB] = '0';
                }
            }
            return false;
        }
        int iOrdinal = i62.ordinal();
        if (iOrdinal == 0) {
            if (d(m32) != com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                return g(m32);
            }
            if (iB > 0) {
                char[] cArr5 = this.f35889d;
                if (cArr5[iB] != '2') {
                    cArr5[iB] = '8';
                }
            }
            return false;
        }
        if (iOrdinal == 1) {
            if (d(m32) != com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                return h(m32);
            }
            if (iB > 0) {
                char[] cArr6 = this.f35889d;
                if (cArr6[iB] != '2') {
                    cArr6[iB] = '8';
                }
            }
            return false;
        }
        if (iOrdinal == 2) {
            return d(m32) == com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(m32) : g(m32);
        }
        if (iOrdinal == 3) {
            return d(m32) == com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(m32) : h(m32);
        }
        if (iB > 0) {
            char[] cArr7 = this.f35889d;
            if (cArr7[iB] != '2') {
                cArr7[iB] = '0';
            }
        }
        return false;
    }

    public final Map c() {
        AbstractC5070p abstractC5070p = this.f35887b;
        com.google.android.gms.internal.measurement.M3 m32 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.L3 l32 = (com.google.android.gms.internal.measurement.L3) abstractC5070p.get(m32);
        AbstractC5070p abstractC5070p2 = this.f35887b;
        com.google.android.gms.internal.measurement.M3 m33 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.L3 l33 = (com.google.android.gms.internal.measurement.L3) abstractC5070p2.get(m33);
        AbstractC5070p abstractC5070p3 = this.f35887b;
        com.google.android.gms.internal.measurement.M3 m34 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.L3 l34 = (com.google.android.gms.internal.measurement.L3) abstractC5070p3.get(m34);
        AbstractC5070p abstractC5070p4 = this.f35887b;
        com.google.android.gms.internal.measurement.M3 m35 = com.google.android.gms.internal.measurement.M3.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.L3 l35 = (com.google.android.gms.internal.measurement.L3) abstractC5070p4.get(m35);
        return AbstractC5070p.d().f("Version", "2").f("VendorConsent", this.f35898m ? "1" : "0").f("VendorLegitimateInterest", this.f35899n ? "1" : "0").f("gdprApplies", this.f35892g == 1 ? "1" : "0").f("EnableAdvertiserConsentMode", this.f35891f == 1 ? "1" : "0").f("PolicyVersion", String.valueOf(this.f35893h)).f("CmpSdkID", String.valueOf(this.f35890e)).f("PurposeOneTreatment", this.f35894i == 1 ? "1" : "0").f("PublisherCC", this.f35895j).f("PublisherRestrictions1", String.valueOf(l32 != null ? l32.zza() : com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(l33 != null ? l33.zza() : com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(l34 != null ? l34.zza() : com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(l35 != null ? l35.zza() : com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(AbstractC5070p.s("Purpose1", f(m32), "Purpose3", f(m33), "Purpose4", f(m34), "Purpose7", f(m35))).i(AbstractC5070p.t("AuthorizePurpose1", i(m32) ? "1" : "0", "AuthorizePurpose3", i(m33) ? "1" : "0", "AuthorizePurpose4", i(m34) ? "1" : "0", "AuthorizePurpose7", i(m35) ? "1" : "0", "PurposeDiagnostics", new String(this.f35889d))).c();
    }

    private G6(SharedPreferences sharedPreferences, int i10, AbstractC5070p abstractC5070p, com.google.common.collect.r rVar) {
        int i11;
        com.google.android.gms.internal.measurement.L3 l32;
        this.f35889d = new char[5];
        this.f35886a = abstractC5070p;
        this.f35888c = rVar;
        this.f35890e = a(sharedPreferences, "IABTCF_CmpSdkID");
        this.f35893h = a(sharedPreferences, "IABTCF_PolicyVersion");
        this.f35892g = a(sharedPreferences, "IABTCF_gdprApplies");
        this.f35894i = a(sharedPreferences, "IABTCF_PurposeOneTreatment");
        this.f35891f = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        this.f35895j = e(sharedPreferences, "IABTCF_PublisherCC");
        AbstractC5070p.a aVarD = AbstractC5070p.d();
        com.google.common.collect.S it = abstractC5070p.keySet().iterator();
        while (true) {
            i11 = 1;
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.M3 m32 = (com.google.android.gms.internal.measurement.M3) it.next();
            String strE = e(sharedPreferences, "IABTCF_PublisherRestrictions" + m32.zza());
            if (!TextUtils.isEmpty(strE) && strE.length() >= 755) {
                int iDigit = Character.digit(strE.charAt(754), 10);
                if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.L3.values().length) {
                    l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit == 0) {
                    l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit == 1) {
                    l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                } else if (iDigit != 2) {
                    l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                }
            } else {
                l32 = com.google.android.gms.internal.measurement.L3.PURPOSE_RESTRICTION_UNDEFINED;
            }
            aVarD.f(m32, l32);
        }
        this.f35887b = aVarD.c();
        this.f35896k = e(sharedPreferences, "IABTCF_PurposeConsents");
        String strE2 = e(sharedPreferences, "IABTCF_VendorConsents");
        if (!TextUtils.isEmpty(strE2) && strE2.length() >= 755) {
            this.f35898m = strE2.charAt(754) == '1';
        } else {
            this.f35898m = false;
        }
        this.f35897l = e(sharedPreferences, "IABTCF_PurposeLegitimateInterests");
        String strE3 = e(sharedPreferences, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strE3) && strE3.length() >= 755) {
            this.f35899n = strE3.charAt(754) == '1';
        } else {
            this.f35899n = false;
        }
        this.f35889d[0] = '2';
        while (true) {
            char[] cArr = this.f35889d;
            if (i11 <= cArr.length) {
                return;
            }
            cArr[i11] = '0';
            i11++;
        }
    }
}
