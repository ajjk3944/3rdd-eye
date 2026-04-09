package androidx.work.impl.background.systemalarm;

import V0.m;
import Y0.h;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0301x;
import f1.l;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0301x {

    /* renamed from: d, reason: collision with root package name */
    public static final String f5686d = m.h("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public h f5687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5688c;

    public final void a() {
        this.f5688c = true;
        m.f().a(f5686d, "All commands completed in dispatcher", new Throwable[0]);
        String str = l.f20058a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = l.f20059b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.f().i(l.f20058a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0301x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f5687b = hVar;
        if (hVar.f4252j != null) {
            m.f().e(h.f4243k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f4252j = this;
        }
        this.f5688c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0301x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5688c = true;
        this.f5687b.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i3) {
        super.onStartCommand(intent, i, i3);
        if (this.f5688c) {
            m.f().g(f5686d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5687b.e();
            h hVar = new h(this);
            this.f5687b = hVar;
            if (hVar.f4252j != null) {
                m.f().e(h.f4243k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f4252j = this;
            }
            this.f5688c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5687b.a(intent, i3);
        return 3;
    }
}
