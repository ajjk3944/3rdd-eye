package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import io.sentry.android.core.e0;
import r4.a;
import z7.b;
import zc.a3;
import zc.c1;
import zc.g2;
import zc.i1;
import zc.j0;
import zc.p3;
import zc.z1;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public b f5391a;

    @Override // zc.a3
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // zc.a3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f21225a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f21225a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    e0.p("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // zc.a3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final b d() {
        if (this.f5391a == null) {
            this.f5391a = new b(this);
        }
        return this.f5391a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        b bVarD = d();
        bVarD.getClass();
        if (intent == null) {
            e0.d("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new i1(p3.y((Service) bVarD.f26690a));
        }
        e0.p("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) d().f26690a).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) d().f26690a).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            e0.d("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        b bVarD = d();
        if (intent == null) {
            bVarD.getClass();
            e0.p("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) bVarD.f26690a;
        j0 j0Var = c1.m(service, null, null).f26889y;
        c1.g(j0Var);
        String action = intent.getAction();
        j0Var.K.d(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        g2 g2Var = new g2(bVarD, i11, j0Var, intent);
        p3 p3VarY = p3.y(service);
        p3VarY.J().B1(new z1(bVarD, p3VarY, g2Var));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            e0.d("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
