package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f6778a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f6779b = new HashMap();

    public static a a(long j6) {
        a aVar;
        Map<Long, a> map = f6778a;
        synchronized (map) {
            try {
                aVar = map.get(Long.valueOf(j6));
                if (aVar == null) {
                    aVar = new a();
                    map.put(Long.valueOf(j6), aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f6779b) {
            try {
                aVar = this.f6779b.get(str);
                if (aVar == null) {
                    aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                    this.f6779b.put(str, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f6779b) {
            arrayList = new ArrayList(this.f6779b.values());
        }
        return arrayList;
    }
}
