package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* loaded from: classes3.dex */
public final /* synthetic */ class ev0 {
    public static byte[] a(hv0 hv0Var, String str, int i, String str2) {
        hv0Var.getClass();
        byte[] bArrDecode = Base64.decode(str, i);
        kotlin.jvm.internal.l.e(bArrDecode, str2);
        return bArrDecode;
    }
}
