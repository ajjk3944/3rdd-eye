package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.e60;
import defpackage.h80;
import defpackage.qz0;
import defpackage.y71;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SystemAlarmService extends e60 {
    public qz0 g;
    public boolean h;

    static {
        h80.f("SystemAlarmService");
    }

    public final void b() {
        this.h = true;
        h80.d().a(new Throwable[0]);
        WeakHashMap weakHashMap = y71.a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap2 = y71.a;
        synchronized (weakHashMap2) {
            map.putAll(weakHashMap2);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                String.format("WakeLock held for %s", map.get(wakeLock));
                h80 h80VarD = h80.d();
                WeakHashMap weakHashMap3 = y71.a;
                h80VarD.g(new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // defpackage.e60, android.app.Service
    public final void onCreate() {
        super.onCreate();
        qz0 qz0Var = new qz0(this);
        this.g = qz0Var;
        if (qz0Var.o != null) {
            h80.d().b(qz0.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            qz0Var.o = this;
        }
        this.h = false;
    }

    @Override // defpackage.e60, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.h = true;
        this.g.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.h) {
            h80.d().e(new Throwable[0]);
            this.g.d();
            qz0 qz0Var = new qz0(this);
            this.g = qz0Var;
            if (qz0Var.o != null) {
                h80.d().b(qz0.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                qz0Var.o = this;
            }
            this.h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.g.b(intent, i2);
        return 3;
    }
}
