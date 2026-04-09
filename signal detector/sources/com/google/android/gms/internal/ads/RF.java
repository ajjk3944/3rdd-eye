package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class RF {

    /* renamed from: b, reason: collision with root package name */
    public static final RF f10876b = new RF(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f10877a;

    public /* synthetic */ RF(Map map) {
        this.f10877a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RF) {
            return this.f10877a.equals(((RF) obj).f10877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10877a.hashCode();
    }

    public final String toString() {
        return this.f10877a.toString();
    }
}
