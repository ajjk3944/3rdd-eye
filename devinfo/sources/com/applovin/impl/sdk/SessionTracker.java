package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final k f5378a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5379b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5380c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f5381d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f5382e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f5383f = new AtomicLong();
    private final AtomicLong g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicLong f5384h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    private Date f5385i;
    private Date j;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5389a;

        static {
            int[] iArr = new int[e.values().length];
            f5389a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5389a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5389a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");


        /* renamed from: a, reason: collision with root package name */
        private final String f5394a;

        e(String str) {
            this.f5394a = str;
        }

        public String b() {
            return this.f5394a;
        }
    }

    public SessionTracker(k kVar) {
        this.f5378a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f5378a.O();
        if (o.a()) {
            this.f5378a.O().a("SessionTracker", "Application Resumed");
        }
        this.g.set(System.currentTimeMillis());
        this.f5384h.addAndGet(this.g.get() - this.f5383f.get());
        boolean zBooleanValue = ((Boolean) this.f5378a.a(x4.f6150u3)).booleanValue();
        long jLongValue = ((Long) this.f5378a.a(x4.f6157v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f5380c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.j == null || System.currentTimeMillis() - this.j.getTime() >= millis) {
            this.f5378a.F().trackEvent("resumed");
            if (zBooleanValue) {
                this.j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f5383f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.g.get();
    }

    public e getCurrentApplicationState() {
        return this.f5381d.get() ? e.PAUSED : this.f5383f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i4 = d.f5389a[getCurrentApplicationState().ordinal()];
        if (i4 == 1) {
            jN = k.n();
        } else if (i4 == 2) {
            jN = this.f5383f.get();
        } else {
            if (i4 != 3) {
                return -1L;
            }
            jN = this.g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f5382e.get();
    }

    public String getSessionId() {
        return this.f5379b;
    }

    public long getTotalBackgroundDurationMillis() {
        if (getCurrentApplicationState() != e.PAUSED) {
            return this.f5384h.get();
        }
        return getCurrentApplicationStateDurationMillis() + this.f5384h.get();
    }

    public boolean isApplicationPaused() {
        return this.f5381d.get();
    }

    public void pauseForClick() {
        this.f5380c.set(true);
    }

    public void resumeForClick() {
        this.f5380c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f5381d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f5381d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f5378a.O();
        if (o.a()) {
            this.f5378a.O().a("SessionTracker", "Application Paused");
        }
        this.f5383f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f5380c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f5378a.a(x4.f6150u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f5378a.a(x4.f6165w3)).longValue());
        if (this.f5385i == null || System.currentTimeMillis() - this.f5385i.getTime() >= millis) {
            this.f5378a.F().trackEvent("paused");
            if (zBooleanValue) {
                this.f5385i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f5385i = new Date();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i4) {
            SessionTracker.this.f5382e.set(i4);
            if (i4 == 20) {
                SessionTracker.this.a();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }
}
