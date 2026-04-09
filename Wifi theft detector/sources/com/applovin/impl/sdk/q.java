package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f8074a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f8075b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8075b) {
            try {
                if (b() <= 25) {
                    this.f8074a.offer(appLovinAdImpl);
                } else {
                    o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f8075b) {
            size = this.f8074a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f8075b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8075b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f8074a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8075b) {
            this.f8074a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f8075b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f8074a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
