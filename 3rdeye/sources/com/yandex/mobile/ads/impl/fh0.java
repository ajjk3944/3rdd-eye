package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fh0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f27327a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f27328b;

    public final synchronized Map<String, String> a() {
        try {
            if (this.f27328b == null) {
                this.f27328b = Collections.unmodifiableMap(new HashMap(this.f27327a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f27328b;
    }
}
