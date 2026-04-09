package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class wo extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f41996a;

    public wo() {
        super(false, "[WakelocksToggle]");
        this.f41996a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f41996a.put(obj, null);
        if (this.f41996a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f41996a.remove(obj);
        if (this.f41996a.isEmpty()) {
            updateState(false);
        }
    }
}
