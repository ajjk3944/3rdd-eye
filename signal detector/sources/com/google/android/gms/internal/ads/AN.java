package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AN {

    /* renamed from: b, reason: collision with root package name */
    public static final AN f6982b = new AN(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f6983a;

    public /* synthetic */ AN(HashMap map) {
        this.f6983a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AN) {
            return this.f6983a.equals(((AN) obj).f6983a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6983a.hashCode();
    }
}
