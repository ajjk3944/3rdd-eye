package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f21413a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f21414b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f21414b) {
            try {
                if (b() <= 25) {
                    this.f21413a.offer(appLovinAdImpl);
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
        synchronized (this.f21414b) {
            size = this.f21413a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f21414b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f21414b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f21413a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f21414b) {
            this.f21413a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f21414b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f21413a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
