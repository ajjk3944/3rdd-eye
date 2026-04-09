package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* renamed from: a, reason: collision with root package name */
    private List<Object> f14619a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<Integer, Object> f14620b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f14620b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f14620b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f14620b.clear();
    }
}
