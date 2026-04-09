package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f5497a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f5498b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f5499c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f5500d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f5501e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private long f5502f;
    private long g;

    /* renamed from: h, reason: collision with root package name */
    private long f5503h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f5498b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f5501e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f5502f) {
                h.this.f5500d.postDelayed(this, h.this.f5503h);
                return;
            }
            h.this.f5498b.set(b.INELIGIBLE);
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
            map.put("source", h.this.f5497a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f5497a.D().d(d2.F0, map);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f5498b.get() != b.MONITORING) {
                return;
            }
            h.this.f5501e.set(System.currentTimeMillis());
            h.this.f5499c.postDelayed(this, h.this.g);
        }
    }

    public h(k kVar) {
        this.f5497a = kVar;
        this.f5498b = new AtomicReference(!n7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f5499c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f5500d = new Handler(handlerThread.getLooper());
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
        AtomicReference atomicReference = this.f5498b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f5499c.removeCallbacksAndMessages(null);
        this.f5500d.removeCallbacksAndMessages(null);
    }

    private void c() {
        if (((Boolean) this.f5497a.a(x4.f6035f6)).booleanValue() && this.f5497a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f5498b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f5499c.post(new d());
        this.f5500d.postDelayed(new c(), this.f5503h / 2);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f5502f = ((Long) this.f5497a.a(x4.f6009c6)).longValue();
        this.g = ((Long) this.f5497a.a(x4.f6018d6)).longValue();
        this.f5503h = ((Long) this.f5497a.a(x4.f6026e6)).longValue();
        if (((Boolean) this.f5497a.a(x4.f6035f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f5498b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f5497a.a(x4.f6000b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
