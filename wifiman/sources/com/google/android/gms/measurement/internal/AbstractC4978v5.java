package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4978v5 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        AbstractC7901p.l(strArr);
        AbstractC7901p.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
