package com.yandex.mobile.ads.impl;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class bh1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return com.google.gson.internal.c.g(Integer.valueOf(((ScanResult) t11).level), Integer.valueOf(((ScanResult) t10).level));
    }
}
