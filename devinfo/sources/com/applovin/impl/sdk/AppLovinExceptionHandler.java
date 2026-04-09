package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f5351e = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f5352a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f5353b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5354c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f5355d;

    private String a(Throwable th2, int i4) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i4, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f5351e;
    }

    public void addSdk(k kVar) {
        if (this.f5352a.contains(kVar)) {
            return;
        }
        this.f5352a.add(kVar);
    }

    public void enable() {
        if (this.f5353b.compareAndSet(false, true)) {
            this.f5355d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) throws InterruptedException {
        if (this.f5354c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (k kVar : this.f5352a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th2.toString());
            Integer num = (Integer) kVar.a(x4.I6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th2, num.intValue()));
            }
            kVar.D().d(d2.P0, mapHashMap);
            kVar.F().trackEventSynchronously("paused");
            jLongValue = ((Long) kVar.a(x4.f6096n3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5355d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
