package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class jq {
    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
