package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class I9 {

    /* renamed from: b, reason: collision with root package name */
    public static final I9 f9076b = new I9(0);

    /* renamed from: c, reason: collision with root package name */
    public static final I9 f9077c = new I9(1);

    /* renamed from: d, reason: collision with root package name */
    public static final I9 f9078d = new I9(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9079a;

    public /* synthetic */ I9(int i) {
        this.f9079a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i6 = length - 1;
            if (str.charAt(i6) != ',') {
                break;
            }
            length = i6;
        }
        if (length < i3) {
            return null;
        }
        if (i3 != 0) {
            i = i3;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f9079a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                if (TextUtils.isEmpty(strB)) {
                    return strB2;
                }
                if (TextUtils.isEmpty(strB2)) {
                    return strB;
                }
                return AbstractC1135f5.n(new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB, ",", strB2);
        }
    }
}
