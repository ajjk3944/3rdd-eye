package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C4839e4;
import com.google.common.collect.AbstractC5069o;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class D6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35843a;

    D6(Map map) {
        HashMap map2 = new HashMap();
        this.f35843a = map2;
        map2.putAll(map);
    }

    private final int f() {
        try {
            String str = (String) this.f35843a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int g() {
        try {
            String str = (String) this.f35843a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final Bundle h() {
        int iG;
        if ("1".equals(this.f35843a.get("GoogleConsent")) && (iG = g()) >= 0) {
            String str = (String) this.f35843a.get("PurposeConsents");
            if (TextUtils.isEmpty(str)) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            String str2 = "denied";
            if (str.length() > 0) {
                bundle.putString(C4839e4.a.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
            }
            if (str.length() > 3) {
                bundle.putString(C4839e4.a.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
            }
            if (str.length() > 6 && iG >= 4) {
                String str3 = C4839e4.a.AD_USER_DATA.zze;
                if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                    str2 = "granted";
                }
                bundle.putString(str3, str2);
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    public final Bundle a() {
        C4936q2 c4936q2 = N.f36096l1;
        if (!((Boolean) c4936q2.a(null)).booleanValue() ? "1".equals(this.f35843a.get("GoogleConsent")) && "1".equals(this.f35843a.get("gdprApplies")) && "1".equals(this.f35843a.get("EnableAdvertiserConsentMode")) : "1".equals(this.f35843a.get("gdprApplies")) && "1".equals(this.f35843a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        if (((Boolean) c4936q2.a(null)).booleanValue() && this.f35843a.get("Version") != null) {
            if (g() < 0) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            String str = "denied";
            bundle.putString(C4839e4.a.AD_STORAGE.zze, Objects.equals(this.f35843a.get("AuthorizePurpose1"), "1") ? "granted" : "denied");
            bundle.putString(C4839e4.a.AD_PERSONALIZATION.zze, (Objects.equals(this.f35843a.get("AuthorizePurpose3"), "1") && Objects.equals(this.f35843a.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
            if (g() >= 4) {
                String str2 = C4839e4.a.AD_USER_DATA.zze;
                if (Objects.equals(this.f35843a.get("AuthorizePurpose1"), "1") && Objects.equals(this.f35843a.get("AuthorizePurpose7"), "1")) {
                    str = "granted";
                }
                bundle.putString(str2, str);
            }
            return bundle;
        }
        return h();
    }

    public final String b(D6 d62) {
        String str = (d62.f35843a.isEmpty() || ((String) d62.f35843a.get("Version")) != null) ? "0" : "1";
        Bundle bundleA = a();
        Bundle bundleA2 = d62.a();
        return str + ((bundleA.size() == bundleA2.size() && Objects.equals(bundleA.getString("ad_storage"), bundleA2.getString("ad_storage")) && Objects.equals(bundleA.getString("ad_personalization"), bundleA2.getString("ad_personalization")) && Objects.equals(bundleA.getString("ad_user_data"), bundleA2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String c() {
        String str = (String) this.f35843a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int iF = f();
        if (iF < 0 || iF > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((iF >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iF & 63));
        }
        int iG = g();
        if (iG < 0 || iG > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iG));
        }
        AbstractC7901p.a(true);
        int i10 = "1".equals(this.f35843a.get("gdprApplies")) ? 2 : 0;
        int i11 = i10 | 4;
        if ("1".equals(this.f35843a.get("EnableAdvertiserConsentMode"))) {
            i11 = i10 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb2.toString();
    }

    final String e() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC5069o abstractC5069o = G6.f35885o;
        int size = abstractC5069o.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = abstractC5069o.get(i10);
            i10++;
            String str = (String) obj;
            if (this.f35843a.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) this.f35843a.get(str));
            }
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D6) {
            return e().equalsIgnoreCase(((D6) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        return e();
    }
}
