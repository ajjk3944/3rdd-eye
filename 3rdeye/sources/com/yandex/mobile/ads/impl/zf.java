package com.yandex.mobile.ads.impl;

import android.media.AudioManager;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zf {
    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i, int i10) {
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static Object a(AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager;
        }
        throw new IllegalStateException();
    }
}
