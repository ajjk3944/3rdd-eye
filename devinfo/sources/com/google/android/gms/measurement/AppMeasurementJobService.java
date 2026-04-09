package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import b4.o;
import b7.h;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.z0;
import ec.g4;
import ec.m3;
import ec.s0;
import j$.util.Objects;
import jf.c;
import pb.y;
import vd.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public c f20280a;

    @Override // ec.m3
    public final boolean a(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // ec.m3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final c d() {
        if (this.f20280a == null) {
            this.f20280a = new c(12, this);
        }
        return this.f20280a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        c cVarD = d();
        Service service = (Service) cVarD.f27642b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            y.h(string);
            g4 g4VarC = g4.C(service);
            s0 s0VarA = g4VarC.a();
            h hVar = g4VarC.f22740l.f22951c;
            s0VarA.f23060o.e(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            g4VarC.b().K(new a(cVarD, g4VarC, new o(cVarD, s0VarA, jobParameters2, false, 12)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        y.h(string);
        k1 k1VarE = k1.e(service, null);
        a aVar = new a(25, cVarD, jobParameters2);
        k1VarE.getClass();
        k1VarE.c(new z0(k1VarE, aVar, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // ec.m3
    public final void b(Intent intent) {
    }
}
