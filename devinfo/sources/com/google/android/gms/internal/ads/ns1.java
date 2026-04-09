package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ns1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ns1 f14404b = new ns1(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f14405a;

    public /* synthetic */ ns1(HashMap map) {
        this.f14405a = DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ns1) {
            return this.f14405a.equals(((ns1) obj).f14405a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14405a.hashCode();
    }
}
