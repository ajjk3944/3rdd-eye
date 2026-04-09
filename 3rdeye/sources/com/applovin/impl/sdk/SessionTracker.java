package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC2108b;
import com.applovin.impl.a7;
import com.applovin.impl.l4;
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
    final k f21014a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21015b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f21016c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f21017d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f21018e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f21019f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f21020g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    private Date f21021h;
    private Date i;

    public class a extends AbstractC2108b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (a7.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21025a;

        static {
            int[] iArr = new int[e.values().length];
            f21025a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21025a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21025a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");


        /* renamed from: a, reason: collision with root package name */
        private final String f21030a;

        e(String str) {
            this.f21030a = str;
        }

        public String b() {
            return this.f21030a;
        }
    }

    public SessionTracker(k kVar) {
        this.f21014a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f21014a.O();
        if (o.a()) {
            this.f21014a.O().a("SessionTracker", "Application Resumed");
        }
        this.f21020g.set(System.currentTimeMillis());
        boolean zBooleanValue = ((Boolean) this.f21014a.a(l4.f19959k3)).booleanValue();
        long jLongValue = ((Long) this.f21014a.a(l4.f19967l3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f21016c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.i == null || System.currentTimeMillis() - this.i.getTime() >= millis) {
            this.f21014a.G().trackEvent("resumed");
            if (zBooleanValue) {
                this.i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.i = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f21019f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f21020g.get();
    }

    public e getCurrentApplicationState() {
        return this.f21017d.get() ? e.PAUSED : this.f21019f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = d.f21025a[getCurrentApplicationState().ordinal()];
        if (i == 1) {
            jN = k.n();
        } else if (i == 2) {
            jN = this.f21019f.get();
        } else {
            if (i != 3) {
                return -1L;
            }
            jN = this.f21020g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f21018e.get();
    }

    public String getSessionId() {
        return this.f21015b;
    }

    public boolean isApplicationPaused() {
        return this.f21017d.get();
    }

    public void pauseForClick() {
        this.f21016c.set(true);
    }

    public void resumeForClick() {
        this.f21016c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f21017d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f21017d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f21014a.O();
        if (o.a()) {
            this.f21014a.O().a("SessionTracker", "Application Paused");
        }
        this.f21019f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f21016c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f21014a.a(l4.f19959k3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f21014a.a(l4.f19974m3)).longValue());
        if (this.f21021h == null || System.currentTimeMillis() - this.f21021h.getTime() >= millis) {
            this.f21014a.G().trackEvent("paused");
            if (zBooleanValue) {
                this.f21021h = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f21021h = new Date();
    }

    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            SessionTracker.this.f21018e.set(i);
            if (i == 20) {
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
