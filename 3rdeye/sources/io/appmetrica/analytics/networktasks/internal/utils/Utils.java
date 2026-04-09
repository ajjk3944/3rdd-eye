package io.appmetrica.analytics.networktasks.internal.utils;

/* loaded from: classes3.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final boolean isBadRequest(int i) {
        return i == 400;
    }
}
