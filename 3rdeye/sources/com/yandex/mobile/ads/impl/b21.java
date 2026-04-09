package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class b21 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f25067a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        return f25067a.matcher(htmlResponse).find();
    }
}
