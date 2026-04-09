package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f6768a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f6769b = new HashMap();

    public static a a(long j) {
        a aVar;
        Map<Long, a> map = f6768a;
        synchronized (map) {
            try {
                aVar = map.get(Long.valueOf(j));
                if (aVar == null) {
                    aVar = new a();
                    map.put(Long.valueOf(j), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f6769b) {
            try {
                aVar = this.f6769b.get(str);
                if (aVar == null) {
                    aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                    this.f6769b.put(str, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f6769b) {
            arrayList = new ArrayList(this.f6769b.values());
        }
        return arrayList;
    }
}
