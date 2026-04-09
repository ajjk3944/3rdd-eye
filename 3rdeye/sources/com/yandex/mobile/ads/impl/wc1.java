package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class wc1 {
    public static URL a(op1 request, g82 g82Var) throws IOException {
        kotlin.jvm.internal.l.f(request, "request");
        String strL = request.l();
        if (g82Var != null) {
            String strA = g82Var.a();
            if (strA == null) {
                throw new IOException(androidx.work.s.d("URL blocked by rewriter: ", strL));
            }
            strL = strA;
        }
        return new URL(strL);
    }
}
