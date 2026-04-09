package zc;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.r4;

/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final oe.u0 f26962a;

    static {
        oe.f0 f0Var = oe.h0.f19336d;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        oe.s.a(24, objArr);
        f26962a = oe.h0.k(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(q4 q4Var, oe.z0 z0Var, oe.z0 z0Var2, oe.g1 g1Var, char[] cArr, int i10, int i11, int i12, String str, String str2, String str3, boolean z10, boolean z11) {
        g3 g3Var;
        char c4;
        int iC = c(q4Var);
        if (iC > 0 && (i11 != 1 || i10 != 1)) {
            cArr[iC] = '2';
        }
        if (g(q4Var, z0Var2) == r4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c4 = '3';
        } else {
            if (q4Var == q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i12 == 1 && g1Var.f19335r.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (z0Var.containsKey(q4Var) && (g3Var = (g3) z0Var.get(q4Var)) != null) {
                int iOrdinal = g3Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(q4Var, z0Var2) == r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? f(q4Var, cArr, str3, z11) : e(q4Var, cArr, str2, z10);
                        }
                        if (iOrdinal == 3) {
                            return g(q4Var, z0Var2) == r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? e(q4Var, cArr, str2, z10) : f(q4Var, cArr, str3, z11);
                        }
                        c4 = '0';
                    } else if (g(q4Var, z0Var2) != r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(q4Var, cArr, str3, z11);
                    }
                } else if (g(q4Var, z0Var2) != r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(q4Var, cArr, str2, z10);
                }
                c4 = '8';
            } else {
                c4 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c4;
        return false;
    }

    public static final int c(q4 q4Var) {
        if (q4Var == q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (q4Var == q4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (q4Var == q4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return q4Var == q4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(q4 q4Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < q4Var.zza()) ? "0" : String.valueOf(str.charAt(q4Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= q4Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(q4Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(q4 q4Var, char[] cArr, String str, boolean z10) {
        char c4;
        int iC = c(q4Var);
        if (!z10) {
            c4 = '4';
        } else {
            if (str.length() >= q4Var.zza()) {
                char cCharAt = str.charAt(q4Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c4 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c4;
        }
        return false;
    }

    public static final boolean f(q4 q4Var, char[] cArr, String str, boolean z10) {
        char c4;
        int iC = c(q4Var);
        if (!z10) {
            c4 = '5';
        } else {
            if (str.length() >= q4Var.zza()) {
                char cCharAt = str.charAt(q4Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c4 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c4;
        }
        return false;
    }

    public static final r4 g(q4 q4Var, oe.z0 z0Var) {
        Object obj = r4.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = z0Var.get(q4Var);
        if (obj2 != null) {
            obj = obj2;
        }
        return (r4) obj;
    }
}
