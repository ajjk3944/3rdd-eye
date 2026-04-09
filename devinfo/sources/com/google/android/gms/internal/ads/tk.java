package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tk {

    /* renamed from: b, reason: collision with root package name */
    public static final tk f16834b = new tk(0);

    /* renamed from: c, reason: collision with root package name */
    public static final tk f16835c = new tk(1);

    /* renamed from: d, reason: collision with root package name */
    public static final tk f16836d = new tk(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16837a;

    public /* synthetic */ tk(int i4) {
        this.f16837a = i4;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i4 = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 != 0) {
            i4 = i10;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i4, length);
    }

    public final String a(String str, String str2) {
        switch (this.f16837a) {
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
                return r5.c.m(new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length()), strB, ",", strB2);
        }
    }
}
