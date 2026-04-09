package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public abstract class ig<T, V> {
    public static ag a(String name, String type, Object value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(value, "value");
        return new ag(name, type, value, null, false, false);
    }

    public abstract ag a(Object obj, String str);
}
