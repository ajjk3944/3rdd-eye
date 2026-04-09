package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class kh1 {
    public static <T> T[] a(Object[] objArr, int i, int i10, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i10, tArr.getClass());
    }
}
