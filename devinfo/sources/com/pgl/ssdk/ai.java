package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ai {
    public static String a(String str) throws ClassNotFoundException {
        String[] strArrB = b(str);
        ArrayList arrayList = new ArrayList();
        if (strArrB != null && strArrB.length > 0) {
            for (String str2 : strArrB) {
                try {
                    Class.forName(str2);
                    arrayList.add(str2);
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    public static String[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("//");
    }
}
