package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12172a;

    public b(ArrayList arrayList) {
        this.f12172a = arrayList;
    }

    @Override // io.sentry.config.d
    public final Map c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f12172a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((d) it.next()).c());
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        Iterator it = this.f12172a.iterator();
        while (it.hasNext()) {
            String property = ((d) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
