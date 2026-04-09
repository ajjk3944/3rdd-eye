package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class xq {
    private static HashMap<String, ArrayList<String>> emc = new HashMap<>();

    public static ArrayList<String> emc(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (emc.get(str) != null) {
                return emc.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : ypw(context, packageName)) {
                    String strEmc = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strEmc = emc(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strEmc = emc(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strEmc = emc(signature, "SHA256");
                    }
                    arrayList.add(strEmc);
                }
            } catch (Exception unused) {
            }
            emc.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] ypw(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String emc(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListEmc = emc(context, "SHA1");
        if (arrayListEmc != null && arrayListEmc.size() != 0) {
            for (int i10 = 0; i10 < arrayListEmc.size(); i10++) {
                sb.append(arrayListEmc.get(i10));
                if (i10 < arrayListEmc.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String emc(Signature signature, String str) throws NoSuchAlgorithmException {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                return sb.substring(0, sb.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
