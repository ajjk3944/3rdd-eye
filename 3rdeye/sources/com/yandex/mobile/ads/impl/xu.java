package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class xu {
    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.l.f(username, "username");
        kotlin.jvm.internal.l.f(password, "password");
        kotlin.jvm.internal.l.f(charset, "charset");
        StringBuilder sb = new StringBuilder();
        sb.append(username);
        String strC = B4.f.c(sb, StringUtils.PROCESS_POSTFIX_DELIMITER, password);
        ia.h hVar = ia.h.f38646e;
        kotlin.jvm.internal.l.f(strC, "<this>");
        byte[] bytes = strC.getBytes(charset);
        kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
        return androidx.work.s.d("Basic ", new ia.h(bytes).a());
    }
}
