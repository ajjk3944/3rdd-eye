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

/* loaded from: classes.dex */
public class g5 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b, reason: collision with root package name */
    private final String f6057b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f6058c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f6056a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set f6059d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f6060e = new Object();

    public g5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f6057b = str;
        this.f6058c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f6058c.get();
    }

    public String b() {
        return this.f6057b;
    }

    public boolean c() {
        return this.f6056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f6058c.get();
        g5 g5Var = (g5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) g5Var.f6058c.get();
        return b().equals(g5Var.b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f6057b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f6058c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f6060e) {
            try {
                if (this.f6059d.contains(communicatorMessageImpl.getUniqueId())) {
                    z10 = false;
                } else {
                    this.f6059d.add(communicatorMessageImpl.getUniqueId());
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f6056a = z10;
    }
}
