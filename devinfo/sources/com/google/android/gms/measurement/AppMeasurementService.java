package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import e5.a;
import ec.g4;
import ec.m3;
import ec.o1;
import ec.s0;
import ec.u1;
import jf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public c f20282a;

    @Override // ec.m3
    public final boolean a(int i4) {
        return stopSelfResult(i4);
    }

    @Override // ec.m3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f22427a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f22427a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ec.m3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final c d() {
        if (this.f20282a == null) {
            this.f20282a = new c(12, this);
        }
        return this.f20282a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c cVarD = d();
        cVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new u1(g4.C((Service) cVarD.f27642b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f27642b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f27642b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i4, final int i10) {
        final c cVarD = d();
        if (intent == null) {
            cVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) cVarD.f27642b;
        final s0 s0Var = o1.s(service, null, null).f22954f;
        o1.m(s0Var);
        String action = intent.getAction();
        s0Var.f23060o.f(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: ec.n3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) cVarD.f27642b;
                m3 m3Var = (m3) service2;
                int i11 = i10;
                if (m3Var.a(i11)) {
                    s0Var.f23060o.e(Integer.valueOf(i11), "Local AppMeasurementService processed last upload request. StartId");
                    s0 s0Var2 = o1.s(service2, null, null).f22954f;
                    o1.m(s0Var2);
                    s0Var2.f23060o.d("Completed wakeful intent.");
                    m3Var.b(intent);
                }
            }
        };
        g4 g4VarC = g4.C(service);
        g4VarC.b().K(new vd.a(cVarD, g4VarC, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
