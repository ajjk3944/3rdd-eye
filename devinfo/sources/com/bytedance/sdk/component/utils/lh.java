package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static HashMap<String, ArrayList<String>> ouw = new HashMap<>();

    private static ArrayList<String> ouw(Context context, String str) {
        String packageName;
        if (context == null || (packageName = context.getPackageName()) == null) {
            return null;
        }
        if (ouw.get(str) != null) {
            return ouw.get(str);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Signature signature : vt(context, packageName)) {
                String strOuw = "error!";
                if ("MD5".equals(str)) {
                    strOuw = ouw(signature, "MD5");
                } else if ("SHA1".equals(str)) {
                    strOuw = ouw(signature, "SHA1");
                } else if ("SHA256".equals(str)) {
                    strOuw = ouw(signature, "SHA256");
                }
                arrayList.add(strOuw);
            }
        } catch (Exception e2) {
            ko.yu(e2.toString());
        }
        ouw.put(str, arrayList);
        return arrayList;
    }

    private static Signature[] vt(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e2) {
            ko.yu(e2.toString());
            return null;
        }
    }

    public static String ouw(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayListOuw = ouw(context, "SHA1");
        if (arrayListOuw != null && arrayListOuw.size() != 0) {
            for (int i4 = 0; i4 < arrayListOuw.size(); i4++) {
                sb2.append(arrayListOuw.get(i4));
                if (i4 < arrayListOuw.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String ouw(Signature signature, String str) throws NoSuchAlgorithmException {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1).toString();
        } catch (Exception e2) {
            ko.yu(e2.toString());
            return "error!";
        }
    }
}
