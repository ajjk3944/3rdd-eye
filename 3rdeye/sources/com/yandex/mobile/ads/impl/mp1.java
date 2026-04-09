package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public interface mp1 {
    void a(ip1 ip1Var);

    void reportAnr(Map<Thread, StackTraceElement[]> map);

    void reportError(String str, Throwable th);

    void reportUnhandledException(Throwable th);
}
