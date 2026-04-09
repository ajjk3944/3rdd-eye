package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f5723a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f5724b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f5724b) {
            try {
                if (b() <= 25) {
                    this.f5723a.offer(appLovinAdImpl);
                } else {
                    o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f5724b) {
            size = this.f5723a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z3;
        synchronized (this.f5724b) {
            z3 = b() == 0;
        }
        return z3;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f5724b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f5723a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f5724b) {
            this.f5723a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f5724b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f5723a.poll() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinAdImpl;
    }
}
