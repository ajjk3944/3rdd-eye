package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.a7;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.y1;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f21137a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f21138b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f21139c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f21140d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f21141e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private long f21142f;

    /* renamed from: g, reason: collision with root package name */
    private long f21143g;

    /* renamed from: h, reason: collision with root package name */
    private long f21144h;

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
            if (h.this.f21138b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f21141e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f21142f) {
                h.this.f21140d.postDelayed(this, h.this.f21144h);
                return;
            }
            h.this.f21138b.set(b.INELIGIBLE);
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
            map.put(AdRevenueConstants.SOURCE_KEY, h.this.f21137a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f21137a.E().d(y1.f21806m0, map);
        }
    }

    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f21138b.get() != b.MONITORING) {
                return;
            }
            h.this.f21141e.set(System.currentTimeMillis());
            h.this.f21139c.postDelayed(this, h.this.f21143g);
        }
    }

    public h(k kVar) {
        this.f21137a = kVar;
        this.f21138b = new AtomicReference(!a7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f21139c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f21140d = new Handler(handlerThread.getLooper());
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
        AtomicReference atomicReference = this.f21138b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f21139c.removeCallbacksAndMessages(null);
        this.f21140d.removeCallbacksAndMessages(null);
    }

    private void c() {
        if (((Boolean) this.f21137a.a(l4.f19723D5)).booleanValue() && this.f21137a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f21138b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f21139c.post(new d());
        this.f21140d.postDelayed(new c(), this.f21144h / 2);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f21142f = ((Long) this.f21137a.a(l4.f19699A5)).longValue();
        this.f21143g = ((Long) this.f21137a.a(l4.f19707B5)).longValue();
        this.f21144h = ((Long) this.f21137a.a(l4.f19715C5)).longValue();
        if (((Boolean) this.f21137a.a(l4.f19723D5)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f21138b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f21137a.a(l4.f20080z5)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
