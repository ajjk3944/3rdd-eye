package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class AppLovinCommunicator {

    /* renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f18766e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f18767f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private k f18768a;

    /* renamed from: b, reason: collision with root package name */
    private o f18769b;

    /* renamed from: c, reason: collision with root package name */
    private final t4 f18770c = new t4();

    /* renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f18771d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(k.o());
    }

    public void a(k kVar) {
        this.f18768a = kVar;
        this.f18769b = kVar.O();
        a("Attached SDK instance: " + kVar + "...");
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f18771d;
    }

    public boolean hasSubscriber(String str) {
        return this.f18770c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f18768a.u().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f18768a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f18767f) {
            try {
                if (f18766e == null) {
                    f18766e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18766e;
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f18770c.a(appLovinCommunicatorSubscriber, str)) {
                this.f18771d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f18770c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f18769b == null || !o.a()) {
            return;
        }
        this.f18769b.a("AppLovinCommunicator", str);
    }
}
