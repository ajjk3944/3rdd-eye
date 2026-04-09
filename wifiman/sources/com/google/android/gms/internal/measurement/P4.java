package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class P4 {

    /* renamed from: a, reason: collision with root package name */
    private Map f35093a = new HashMap();

    public final InterfaceC4449s a(String str) {
        if (!this.f35093a.containsKey(str)) {
            return InterfaceC4449s.f35450e0;
        }
        try {
            return (InterfaceC4449s) ((Callable) this.f35093a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f35093a.put(str, callable);
    }
}
