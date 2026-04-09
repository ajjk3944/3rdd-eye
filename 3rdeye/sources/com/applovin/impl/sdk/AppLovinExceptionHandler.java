package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f20985e = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f20986a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f20987b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f20988c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f20989d;

    private String a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f20985e;
    }

    public void addSdk(k kVar) {
        if (this.f20986a.contains(kVar)) {
            return;
        }
        this.f20986a.add(kVar);
    }

    public void enable() {
        if (this.f20987b.compareAndSet(false, true)) {
            this.f20989d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        if (this.f20988c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (k kVar : this.f20986a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) kVar.a(l4.f19916e6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th, num.intValue()));
            }
            kVar.E().d(y1.f21822u0, mapHashMap);
            kVar.G().trackEventSynchronously("paused");
            jLongValue = ((Long) kVar.a(l4.f19921f3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20989d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
