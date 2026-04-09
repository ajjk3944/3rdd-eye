package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.uN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1961uN extends AbstractC1746qN {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17115b = 0;

    static {
        C1907tN.a(Collections.EMPTY_MAP);
    }

    public static C1723q0 a(int i) {
        return new C1723q0(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map c() {
        Map map = this.f16350a;
        LinkedHashMap linkedHashMapH = AbstractC0582Jp.H(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapH.put(entry.getKey(), ((InterfaceC2069wN) entry.getValue()).c());
        }
        return Collections.unmodifiableMap(linkedHashMapH);
    }
}
