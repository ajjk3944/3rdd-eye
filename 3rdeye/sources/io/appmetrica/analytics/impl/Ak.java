package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Ak implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39116a;

    /* renamed from: b, reason: collision with root package name */
    public final C5131zk f39117b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39118c = new HashMap();

    public Ak(Context context, C5131zk c5131zk) {
        this.f39116a = context;
        this.f39117b = c5131zk;
    }

    public final String a(String str) {
        return androidx.work.s.d("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f39118c.get(str) == null) {
                HashMap map = this.f39118c;
                C5131zk c5131zk = this.f39117b;
                Context context = this.f39116a;
                String strA = a(str);
                c5131zk.f42200a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                ServiceConnectionC5106yk serviceConnectionC5106yk = new ServiceConnectionC5106yk();
                try {
                    context.bindService(intent, serviceConnectionC5106yk, 1);
                } catch (Throwable unused) {
                    serviceConnectionC5106yk = null;
                }
                map.put(str, serviceConnectionC5106yk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39118c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f39118c.get(str);
        if (serviceConnection != null) {
            C5131zk c5131zk = this.f39117b;
            a(str);
            Context context = this.f39116a;
            c5131zk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
