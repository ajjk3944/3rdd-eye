package com.bytedance.adsdk.ugeno.uym;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.adsdk.ugeno.uym.emc$emc, reason: collision with other inner class name */
    public static class C0012emc {
        public GradientDrawable.Orientation emc;
        public float[] xq;
        public int[] ypw;
    }

    public static GradientDrawable.Orientation dg(String str) {
        try {
            int i = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i == 135 ? GradientDrawable.Orientation.TL_BR : i == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int emc(String str) {
        return emc(str, -16777216);
    }

    public static boolean xq(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static C0012emc ypw(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iEmc = emc(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0012emc c0012emc = new C0012emc();
            c0012emc.emc = dg(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iEmc];
            float[] fArr = new float[iEmc];
            for (int i = 0; i < iEmc; i++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i] = emc(strTrim.substring(0, iIndexOf3).trim());
                fArr[i] = xq.emc(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i3 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i3) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i3);
            }
            if (iEmc < 2) {
                return null;
            }
            c0012emc.ypw = iArr;
            c0012emc.xq = fArr;
            return c0012emc;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int emc(String str, int i) throws NumberFormatException {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i3 = 1; i3 < charArray.length; i3++) {
                    sb.append(charArray[i3]);
                    sb.append(charArray[i3]);
                }
                return Color.parseColor(sb.toString());
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
        return i;
    }

    public static int emc(String str, char c6) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c6) {
                i++;
            }
        }
        return i;
    }

    public static int emc(int i, int i3) {
        if (i3 < 0 || i3 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i3 = 255;
        }
        return (i & 16777215) | (i3 << 24);
    }
}
