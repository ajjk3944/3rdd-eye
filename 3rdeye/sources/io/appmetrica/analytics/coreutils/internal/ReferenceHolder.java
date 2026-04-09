package io.appmetrica.analytics.coreutils.internal;

import c9.C2097r;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ReferenceHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f38935a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return C2097r.L0(this.f38935a);
    }

    public final void removeReference(Object obj) {
        this.f38935a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f38935a.add(obj);
    }
}
