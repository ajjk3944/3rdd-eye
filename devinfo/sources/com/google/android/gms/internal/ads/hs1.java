package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hs1 extends ds1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11964b = 0;

    static {
        gs1.b(Collections.EMPTY_MAP);
    }

    public static kh0 b(int i4) {
        return new kh0(i4);
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map a() {
        Map map = this.f10546a;
        LinkedHashMap linkedHashMapG = mq0.G(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapG.put(entry.getKey(), ((js1) entry.getValue()).a());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapG);
    }
}
