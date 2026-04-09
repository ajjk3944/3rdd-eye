package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.x4;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f7604e = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f7605a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7606b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7607c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7608d;

    private String a(Throwable th, int i10) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f7604e;
    }

    public void addSdk(k kVar) {
        if (this.f7605a.contains(kVar)) {
            return;
        }
        this.f7605a.add(kVar);
    }

    public void enable() {
        if (this.f7606b.compareAndSet(false, true)) {
            this.f7608d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        if (this.f7607c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (k kVar : this.f7605a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) kVar.a(x4.I6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th, num.intValue()));
            }
            kVar.D().d(com.applovin.impl.d2.P0, mapHashMap);
            kVar.F().trackEventSynchronously("paused");
            jLongValue = ((Long) kVar.a(x4.f8534n3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7608d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
