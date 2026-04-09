package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c50 implements va.a {

    /* renamed from: a, reason: collision with root package name */
    public final e50 f9979a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f9980b;

    public c50(e50 e50Var, hq0 hq0Var) {
        this.f9979a = e50Var;
        this.f9980b = hq0Var;
    }

    @Override // va.a
    public final void onAdClicked() {
        hq0 hq0Var = this.f9980b;
        e50 e50Var = this.f9979a;
        String str = hq0Var.g;
        synchronized (e50Var.f10705a) {
            try {
                ConcurrentHashMap concurrentHashMap = e50Var.f10706b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
