package com.yandex.mobile.ads.impl;

import N7.B8;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class w22 {
    public static String a(String str) {
        return mh1.a(str);
    }

    public static String a(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e4);
                    StringBuilder sbK = B8.k("<", str2, " threw ");
                    sbK.append(e4.getClass().getName());
                    sbK.append(">");
                    string = sbK.toString();
                }
            }
            objArr[i10] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb.append((CharSequence) str, i11, iIndexOf);
            sb.append(objArr[i]);
            i11 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i11, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
