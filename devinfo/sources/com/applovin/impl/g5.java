package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g5 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b, reason: collision with root package name */
    private final String f4154b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f4155c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f4153a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set f4156d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f4157e = new Object();

    public g5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f4154b = str;
        this.f4155c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f4155c.get();
    }

    public String b() {
        return this.f4154b;
    }

    public boolean c() {
        return this.f4153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f4155c.get();
        g5 g5Var = (g5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) g5Var.f4155c.get();
        return b().equals(g5Var.b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f4154b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f4155c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z3;
        if (a() == null) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f4157e) {
            try {
                if (this.f4156d.contains(communicatorMessageImpl.getUniqueId())) {
                    z3 = false;
                } else {
                    this.f4156d.add(communicatorMessageImpl.getUniqueId());
                    z3 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z3) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z3) {
        this.f4153a = z3;
    }
}
