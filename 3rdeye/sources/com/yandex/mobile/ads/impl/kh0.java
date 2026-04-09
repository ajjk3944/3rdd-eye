package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class kh0 {
    public static final boolean a(String method) {
        kotlin.jvm.internal.l.f(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final boolean b(String method) {
        kotlin.jvm.internal.l.f(method, "method");
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }
}
