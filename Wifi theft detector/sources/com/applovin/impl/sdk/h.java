package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f7781a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f7782b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f7783c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f7784d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f7785e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private long f7786f;

    /* renamed from: g, reason: collision with root package name */
    private long f7787g;

    /* renamed from: h, reason: collision with root package name */
    private long f7788h;

    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f7782b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f7785e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f7786f) {
                h.this.f7784d.postDelayed(this, h.this.f7788h);
                return;
            }
            h.this.f7782b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f7781a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f7781a.D().d(com.applovin.impl.d2.F0, map);
        }
    }

    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f7782b.get() != b.MONITORING) {
                return;
            }
            h.this.f7785e.set(System.currentTimeMillis());
            h.this.f7783c.postDelayed(this, h.this.f7787g);
        }
    }

    public h(k kVar) {
        this.f7781a = kVar;
        this.f7782b = new AtomicReference(!n7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f7783c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f7784d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (androidx.lifecycle.k.a(this.f7782b, b.MONITORING, b.IDLE)) {
            this.f7783c.removeCallbacksAndMessages(null);
            this.f7784d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.f7781a.a(x4.f8466f6)).booleanValue() && this.f7781a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && androidx.lifecycle.k.a(this.f7782b, b.IDLE, b.MONITORING)) {
            this.f7783c.post(new d());
            this.f7784d.postDelayed(new c(), this.f7788h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f7786f = ((Long) this.f7781a.a(x4.f8439c6)).longValue();
        this.f7787g = ((Long) this.f7781a.a(x4.f8448d6)).longValue();
        this.f7788h = ((Long) this.f7781a.a(x4.f8457e6)).longValue();
        if (((Boolean) this.f7781a.a(x4.f8466f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f7782b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f7781a.a(x4.f8430b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
