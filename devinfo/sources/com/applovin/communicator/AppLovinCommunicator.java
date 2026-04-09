package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f3540e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f3541f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private k f3542a;

    /* renamed from: b, reason: collision with root package name */
    private o f3543b;

    /* renamed from: c, reason: collision with root package name */
    private final f5 f3544c = new f5();

    /* renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f3545d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.f3542a = kVar;
        this.f3543b = kVar.O();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f3545d;
    }

    public boolean hasSubscriber(String str) {
        return this.f3544c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f3542a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f3542a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f3541f) {
            try {
                if (f3540e == null) {
                    f3540e = new AppLovinCommunicator();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3540e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f3544c.a(appLovinCommunicatorSubscriber, str)) {
                this.f3545d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f3544c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f3543b == null || !o.a()) {
            return;
        }
        this.f3543b.a("AppLovinCommunicator", str);
    }
}
