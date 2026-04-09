package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.sdk.component.utils.emc$emc, reason: collision with other inner class name */
    public static class C0121emc {
        static final Random emc = emc.xq();
    }

    public static JSONObject emc(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : emc(jSONObject.toString());
    }

    public static String xq(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strEmc = emc(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strEmc == null) ? str : com.bytedance.sdk.component.dg.emc.ypw(str.substring(49), strSubstring, strEmc);
    }

    public static String ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strEmc = emc();
        String strEmc2 = emc(strEmc, 32);
        String strYpw = ypw();
        return 3 + strEmc + strYpw + ((strEmc2 == null || strYpw == null) ? null : com.bytedance.sdk.component.dg.emc.emc(str, strYpw, strEmc2));
    }

    public static JSONObject emc(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strYpw = ypw(str);
                    if (!TextUtils.isEmpty(strYpw)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strYpw);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable unused) {
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return jSONObject;
    }

    public static Random xq() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String ypw() {
        String strEmc = emc(8);
        if (strEmc == null || strEmc.length() != 16) {
            return null;
        }
        return strEmc;
    }

    public static String emc() {
        String strEmc = emc(16);
        if (strEmc == null || strEmc.length() != 32) {
            return null;
        }
        return strEmc;
    }

    public static String emc(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String emc(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0121emc.emc.nextBytes(bArr);
            return bw.emc(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
