package androidx.work.impl.background.systemalarm;

import V1.e;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.A;
import androidx.work.m;
import b9.C1992A;
import c2.y;
import c2.z;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends A {

    /* renamed from: e, reason: collision with root package name */
    public static final String f16914e = m.g("SystemAlarmService");

    /* renamed from: c, reason: collision with root package name */
    public e f16915c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16916d;

    public final void a() {
        this.f16916d = true;
        m.e().a(f16914e, "All commands completed in dispatcher");
        String str = y.f18443a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (z.f18444a) {
            linkedHashMap.putAll(z.f18445b);
            C1992A c1992a = C1992A.f18074a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                m.e().h(y.f18443a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.A, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e eVar = new e(this);
        this.f16915c = eVar;
        if (eVar.f12904j != null) {
            m.e().c(e.f12896l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            eVar.f12904j = this;
        }
        this.f16916d = false;
    }

    @Override // androidx.lifecycle.A, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16916d = true;
        e eVar = this.f16915c;
        eVar.getClass();
        m.e().a(e.f12896l, "Destroying SystemAlarmDispatcher");
        eVar.f12900e.h(eVar);
        eVar.f12904j = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        if (this.f16916d) {
            m.e().f(f16914e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            e eVar = this.f16915c;
            eVar.getClass();
            m mVarE = m.e();
            String str = e.f12896l;
            mVarE.a(str, "Destroying SystemAlarmDispatcher");
            eVar.f12900e.h(eVar);
            eVar.f12904j = null;
            e eVar2 = new e(this);
            this.f16915c = eVar2;
            if (eVar2.f12904j != null) {
                m.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                eVar2.f12904j = this;
            }
            this.f16916d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f16915c.a(i10, intent);
        return 3;
    }
}
