package com.bytedance.adsdk.ugeno.ra;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.ra.ouw$ouw, reason: collision with other inner class name */
    public static class C0035ouw {

        /* renamed from: lh, reason: collision with root package name */
        public float[] f6949lh;
        public GradientDrawable.Orientation ouw;
        public int[] vt;
    }

    public static boolean lh(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static int ouw(String str) {
        return ouw(str, -16777216);
    }

    public static C0035ouw vt(String str) {
        int i4;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                i4 = 0;
            } else {
                i4 = 0;
                for (int i10 = 0; i10 < strSubstring.length(); i10++) {
                    if (strSubstring.charAt(i10) == '%') {
                        i4++;
                    }
                }
            }
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0035ouw c0035ouw = new C0035ouw();
            c0035ouw.ouw = yu(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[i4];
            float[] fArr = new float[i4];
            for (int i11 = 0; i11 < i4; i11++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i11] = ouw(strTrim.substring(0, iIndexOf3).trim(), -16777216);
                fArr[i11] = lh.ouw(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i12 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i12) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i12);
            }
            if (i4 < 2) {
                return null;
            }
            c0035ouw.vt = iArr;
            c0035ouw.f6949lh = fArr;
            return c0035ouw;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static GradientDrawable.Orientation yu(String str) {
        try {
            int i4 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i4 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i4 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i4 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i4 == 135 ? GradientDrawable.Orientation.TL_BR : i4 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int ouw(String str, int i4) throws NumberFormatException {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i10 = 1; i10 < charArray.length; i10++) {
                    sb2.append(charArray[i10]);
                    sb2.append(charArray[i10]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i4;
    }
}
