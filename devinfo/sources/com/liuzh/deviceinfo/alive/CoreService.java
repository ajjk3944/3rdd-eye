package com.liuzh.deviceinfo.alive;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import bg.a;
import bi.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class CoreService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21166a = 0;

    public static void a(Context context) {
        try {
            context.startService(new Intent(context, (Class<?>) CoreService.class));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        d.c(new a(0));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i10) {
        return 1;
    }
}
