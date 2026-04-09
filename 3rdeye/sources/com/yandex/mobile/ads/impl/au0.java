package com.yandex.mobile.ads.impl;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class au0 {
    public static String a() {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        String lowerCase = y9.n.X(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
