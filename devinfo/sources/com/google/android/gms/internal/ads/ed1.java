package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ed1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ed1 f10765b = new ed1(DesugarCollections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f10766a;

    public /* synthetic */ ed1(Map map) {
        this.f10766a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed1) {
            return this.f10766a.equals(((ed1) obj).f10766a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10766a.hashCode();
    }

    public final String toString() {
        return this.f10766a.toString();
    }
}
