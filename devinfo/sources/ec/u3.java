package ec;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.r4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ud.h f23092a;

    static {
        ud.b bVar = ud.d.f35298b;
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
        com.google.android.gms.internal.play_billing.m1.g(objArr, 24);
        f23092a = ud.d.g(objArr, 24);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(q4 q4Var, ud.m mVar, ud.m mVar2, ud.o oVar, char[] cArr, int i4, int i10, int i11, String str, String str2, String str3, boolean z3, boolean z10) {
        t3 t3Var;
        char c9;
        int iC = c(q4Var);
        if (iC > 0 && (i10 != 1 || i4 != 1)) {
            cArr[iC] = '2';
        }
        if (g(q4Var, mVar2) == r4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c9 = '3';
        } else {
            if (q4Var == q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && oVar.f35326d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (mVar.containsKey(q4Var) && (t3Var = (t3) mVar.get(q4Var)) != null) {
                int iOrdinal = t3Var.ordinal();
                r4 r4Var = r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    r4 r4Var2 = r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(q4Var, mVar2) == r4Var ? f(q4Var, cArr, str3, z10) : e(q4Var, cArr, str2, z3);
                        }
                        if (iOrdinal == 3) {
                            return g(q4Var, mVar2) == r4Var2 ? e(q4Var, cArr, str2, z3) : f(q4Var, cArr, str3, z10);
                        }
                        c9 = '0';
                    } else if (g(q4Var, mVar2) != r4Var2) {
                        return f(q4Var, cArr, str3, z10);
                    }
                } else if (g(q4Var, mVar2) != r4Var) {
                    return e(q4Var, cArr, str2, z3);
                }
                c9 = '8';
            } else {
                c9 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c9;
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
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < q4Var.b()) ? "0" : String.valueOf(str.charAt(q4Var.b() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= q4Var.b()) {
            strValueOf = String.valueOf(str2.charAt(q4Var.b() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(q4 q4Var, char[] cArr, String str, boolean z3) {
        char c9;
        int iC = c(q4Var);
        if (!z3) {
            c9 = '4';
        } else {
            if (str.length() >= q4Var.b()) {
                char cCharAt = str.charAt(q4Var.b() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c9 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c9;
        }
        return false;
    }

    public static final boolean f(q4 q4Var, char[] cArr, String str, boolean z3) {
        char c9;
        int iC = c(q4Var);
        if (!z3) {
            c9 = '5';
        } else {
            if (str.length() >= q4Var.b()) {
                char cCharAt = str.charAt(q4Var.b() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c9 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c9;
        }
        return false;
    }

    public static final r4 g(q4 q4Var, ud.m mVar) {
        Object obj = mVar.get(q4Var);
        if (obj == null) {
            obj = r4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (r4) obj;
    }
}
