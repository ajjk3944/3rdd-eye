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

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final k f7633a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7634b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7635c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f7636d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f7637e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f7638f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f7639g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicLong f7640h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    private Date f7641i;

    /* renamed from: j, reason: collision with root package name */
    private Date f7642j;

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f7637e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

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

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7646a;

        static {
            int[] iArr = new int[e.values().length];
            f7646a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7646a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7646a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");


        /* renamed from: a, reason: collision with root package name */
        private final String f7651a;

        e(String str) {
            this.f7651a = str;
        }

        public String b() {
            return this.f7651a;
        }
    }

    public SessionTracker(k kVar) {
        this.f7633a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f7633a.O();
        if (o.a()) {
            this.f7633a.O().a("SessionTracker", "Application Resumed");
        }
        this.f7639g.set(System.currentTimeMillis());
        this.f7640h.addAndGet(this.f7639g.get() - this.f7638f.get());
        boolean zBooleanValue = ((Boolean) this.f7633a.a(x4.f8590u3)).booleanValue();
        long jLongValue = ((Long) this.f7633a.a(x4.f8598v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f7635c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f7642j == null || System.currentTimeMillis() - this.f7642j.getTime() >= millis) {
            this.f7633a.F().trackEvent("resumed");
            if (zBooleanValue) {
                this.f7642j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f7642j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f7638f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f7639g.get();
    }

    public e getCurrentApplicationState() {
        return this.f7636d.get() ? e.PAUSED : this.f7638f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f7646a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jN = k.n();
        } else if (i10 == 2) {
            jN = this.f7638f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jN = this.f7639g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f7637e.get();
    }

    public String getSessionId() {
        return this.f7634b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == e.PAUSED ? this.f7640h.get() + getCurrentApplicationStateDurationMillis() : this.f7640h.get();
    }

    public boolean isApplicationPaused() {
        return this.f7636d.get();
    }

    public void pauseForClick() {
        this.f7635c.set(true);
    }

    public void resumeForClick() {
        this.f7635c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f7636d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f7636d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f7633a.O();
        if (o.a()) {
            this.f7633a.O().a("SessionTracker", "Application Paused");
        }
        this.f7638f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f7635c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f7633a.a(x4.f8590u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f7633a.a(x4.f8606w3)).longValue());
        if (this.f7641i == null || System.currentTimeMillis() - this.f7641i.getTime() >= millis) {
            this.f7633a.F().trackEvent("paused");
            if (zBooleanValue) {
                this.f7641i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f7641i = new Date();
    }
}
